package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzhx implements Runnable {
    public final /* synthetic */ zzbg X;
    public final /* synthetic */ zzo Y;
    public final /* synthetic */ zzhj Z;

    public zzhx(zzhj zzhjVar, zzbg zzbgVar, zzo zzoVar) {
        this.Z = zzhjVar;
        this.X = zzbgVar;
        this.Y = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z.s7(this.Z.h5(this.X, this.Y), this.Y);
    }
}
