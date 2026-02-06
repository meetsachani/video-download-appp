package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzhk implements Runnable {
    public final /* synthetic */ zzo X;
    public final /* synthetic */ zzhj Y;

    public zzhk(zzhj zzhjVar, zzo zzoVar) {
        this.Y = zzhjVar;
        this.X = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmpVar = this.Y.Y;
        zzmpVar.o0();
        zzmpVar2 = this.Y.Y;
        zzmpVar2.Z(this.X);
    }
}
