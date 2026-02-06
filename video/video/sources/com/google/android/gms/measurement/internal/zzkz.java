package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkz implements Runnable {
    public final /* synthetic */ zzki X;
    public final /* synthetic */ zzkp Y;

    public zzkz(zzkp zzkpVar, zzki zzkiVar) {
        this.Y = zzkpVar;
        this.X = zzkiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        zzfkVar = this.Y.d;
        if (zzfkVar == null) {
            this.Y.j().G().a("Failed to send current screen to service");
            return;
        }
        try {
            zzki zzkiVar = this.X;
            if (zzkiVar == null) {
                zzfkVar.O2(0L, null, null, this.Y.a().getPackageName());
            } else {
                zzfkVar.O2(zzkiVar.c, zzkiVar.a, zzkiVar.b, this.Y.a().getPackageName());
            }
            this.Y.h0();
        } catch (RemoteException e) {
            this.Y.j().G().b("Failed to send current screen to the service", e);
        }
    }
}
