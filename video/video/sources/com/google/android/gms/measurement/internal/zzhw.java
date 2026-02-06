package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzhw implements Runnable {
    public final /* synthetic */ zzbg X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ zzhj Z;

    public zzhw(zzhj zzhjVar, zzbg zzbgVar, String str) {
        this.Z = zzhjVar;
        this.X = zzbgVar;
        this.Y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmpVar = this.Z.Y;
        zzmpVar.o0();
        zzmpVar2 = this.Z.Y;
        zzmpVar2.u(this.X, this.Y);
    }
}
