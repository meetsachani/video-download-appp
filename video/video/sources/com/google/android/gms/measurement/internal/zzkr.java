package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkr implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ boolean Y0;
    public final /* synthetic */ zzo Z;
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcv Z0;
    public final /* synthetic */ zzkp a1;

    public zzkr(zzkp zzkpVar, String str, String str2, zzo zzoVar, boolean z, com.google.android.gms.internal.measurement.zzcv zzcvVar) {
        this.a1 = zzkpVar;
        this.X = str;
        this.Y = str2;
        this.Z = zzoVar;
        this.Y0 = z;
        this.Z0 = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        Bundle bundle = new Bundle();
        try {
            zzfkVar = this.a1.d;
            if (zzfkVar == null) {
                this.a1.j().G().c("Failed to get user properties; not connected to service", this.X, this.Y);
                return;
            }
            Preconditions.r(this.Z);
            Bundle F = zznd.F(zzfkVar.e7(this.X, this.Y, this.Y0, this.Z));
            this.a1.h0();
            this.a1.i().Q(this.Z0, F);
        } catch (RemoteException e) {
            this.a1.j().G().c("Failed to get user properties; remote exception", this.X, e);
        } finally {
            this.a1.i().Q(this.Z0, bundle);
        }
    }
}
