package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkw implements Runnable {
    public final /* synthetic */ zzo X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ zzkp Y0;
    public final /* synthetic */ zznc Z;

    public zzkw(zzkp zzkpVar, zzo zzoVar, boolean z, zznc zzncVar) {
        this.Y0 = zzkpVar;
        this.X = zzoVar;
        this.Y = z;
        this.Z = zzncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar;
        zznc zzncVar;
        zzfkVar = this.Y0.d;
        if (zzfkVar == null) {
            this.Y0.j().G().a("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.r(this.X);
        zzkp zzkpVar = this.Y0;
        if (this.Y) {
            zzncVar = null;
        } else {
            zzncVar = this.Z;
        }
        zzkpVar.K(zzfkVar, zzncVar, this.X);
        this.Y0.h0();
    }
}
