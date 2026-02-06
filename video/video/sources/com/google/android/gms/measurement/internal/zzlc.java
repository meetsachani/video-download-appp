package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlc implements Runnable {
    public final /* synthetic */ zzo X;
    public final /* synthetic */ Bundle Y;
    public final /* synthetic */ zzkp Z;

    public zzlc(zzkp zzkpVar, zzo zzoVar, Bundle bundle) {
        this.Z = zzkpVar;
        this.X = zzoVar;
        this.Y = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        zzfkVar = this.Z.d;
        if (zzfkVar == null) {
            this.Z.j().G().a("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.r(this.X);
            zzfkVar.n5(this.Y, this.X);
        } catch (RemoteException e) {
            this.Z.j().G().b("Failed to send default event parameters to service", e);
        }
    }
}
