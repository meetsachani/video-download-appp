package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzle implements Runnable {
    public final /* synthetic */ zzbg X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ zzkp Y0;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcv Z;

    public zzle(zzkp zzkpVar, zzbg zzbgVar, String str, com.google.android.gms.internal.measurement.zzcv zzcvVar) {
        this.Y0 = zzkpVar;
        this.X = zzbgVar;
        this.Y = str;
        this.Z = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        try {
            zzfkVar = this.Y0.d;
            if (zzfkVar == null) {
                this.Y0.j().G().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            byte[] i6 = zzfkVar.i6(this.X, this.Y);
            this.Y0.h0();
            this.Y0.i().U(this.Z, i6);
        } catch (RemoteException e) {
            this.Y0.j().G().b("Failed to send event to the service to bundle", e);
        } finally {
            this.Y0.i().U(this.Z, null);
        }
    }
}
