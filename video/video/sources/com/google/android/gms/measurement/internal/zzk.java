package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzk implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcv X;
    public final /* synthetic */ zzbg Y;
    public final /* synthetic */ AppMeasurementDynamiteService Y0;
    public final /* synthetic */ String Z;

    public zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcv zzcvVar, zzbg zzbgVar, String str) {
        this.Y0 = appMeasurementDynamiteService;
        this.X = zzcvVar;
        this.Y = zzbgVar;
        this.Z = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y0.Y.J().E(this.X, this.Y, this.Z);
    }
}
