package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzhp implements Runnable {
    public final /* synthetic */ zzad X;
    public final /* synthetic */ zzhj Y;

    public zzhp(zzhj zzhjVar, zzad zzadVar) {
        this.Y = zzhjVar;
        this.X = zzadVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmp zzmpVar3;
        zzmpVar = this.Y.Y;
        zzmpVar.o0();
        if (this.X.Z.m0() == null) {
            zzmpVar3 = this.Y.Y;
            zzmpVar3.r(this.X);
            return;
        }
        zzmpVar2 = this.Y.Y;
        zzmpVar2.S(this.X);
    }
}
