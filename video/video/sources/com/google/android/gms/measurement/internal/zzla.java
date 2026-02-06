package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzla implements Runnable {
    public final /* synthetic */ zzo X;
    public final /* synthetic */ zzkp Y;

    public zzla(zzkp zzkpVar, zzo zzoVar) {
        this.Y = zzkpVar;
        this.X = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        zzfkVar = this.Y.d;
        if (zzfkVar == null) {
            this.Y.j().G().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.r(this.X);
            zzfkVar.l6(this.X);
            this.Y.q().J();
            this.Y.K(zzfkVar, null, this.X);
            this.Y.h0();
        } catch (RemoteException e) {
            this.Y.j().G().b("Failed to send app launch to the service", e);
        }
    }
}
