package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzhy implements Runnable {
    public final /* synthetic */ zznc X;
    public final /* synthetic */ zzo Y;
    public final /* synthetic */ zzhj Z;

    public zzhy(zzhj zzhjVar, zznc zzncVar, zzo zzoVar) {
        this.Z = zzhjVar;
        this.X = zzncVar;
        this.Y = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmp zzmpVar3;
        zzmpVar = this.Z.Y;
        zzmpVar.o0();
        if (this.X.m0() == null) {
            zzmpVar3 = this.Z.Y;
            zzmpVar3.E(this.X.Y, this.Y);
            return;
        }
        zzmpVar2 = this.Z.Y;
        zzmpVar2.x(this.X, this.Y);
    }
}
