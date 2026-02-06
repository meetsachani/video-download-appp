package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzhm implements Runnable {
    public final /* synthetic */ zzad X;
    public final /* synthetic */ zzo Y;
    public final /* synthetic */ zzhj Z;

    public zzhm(zzhj zzhjVar, zzad zzadVar, zzo zzoVar) {
        this.Z = zzhjVar;
        this.X = zzadVar;
        this.Y = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmp zzmpVar3;
        zzmpVar = this.Z.Y;
        zzmpVar.o0();
        if (this.X.Z.m0() == null) {
            zzmpVar3 = this.Z.Y;
            zzmpVar3.s(this.X, this.Y);
            return;
        }
        zzmpVar2 = this.Z.Y;
        zzmpVar2.T(this.X, this.Y);
    }
}
