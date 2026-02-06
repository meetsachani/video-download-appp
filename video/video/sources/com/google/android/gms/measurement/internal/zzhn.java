package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzhn implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ long Y0;
    public final /* synthetic */ String Z;
    public final /* synthetic */ zzhj Z0;

    public zzhn(zzhj zzhjVar, String str, String str2, String str3, long j) {
        this.Z0 = zzhjVar;
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.Y0 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        String str = this.X;
        if (str == null) {
            zzmpVar2 = this.Z0.Y;
            zzmpVar2.D(this.Y, null);
            return;
        }
        zzki zzkiVar = new zzki(this.Z, str, this.Y0);
        zzmpVar = this.Z0.Y;
        zzmpVar.D(this.Y, zzkiVar);
    }
}
