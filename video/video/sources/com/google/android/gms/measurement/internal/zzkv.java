package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkv implements Runnable {
    public final /* synthetic */ zzo X;
    public final /* synthetic */ zzkp Y;

    public zzkv(zzkp zzkpVar, zzo zzoVar) {
        this.Y = zzkpVar;
        this.X = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        zzfkVar = this.Y.d;
        if (zzfkVar == null) {
            this.Y.j().G().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.r(this.X);
            zzfkVar.F4(this.X);
        } catch (RemoteException e) {
            this.Y.j().G().b("Failed to reset data on the service: remote exception", e);
        }
        this.Y.h0();
    }
}
