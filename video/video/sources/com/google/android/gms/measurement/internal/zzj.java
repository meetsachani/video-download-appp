package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzj implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcv X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ boolean Y0;
    public final /* synthetic */ String Z;
    public final /* synthetic */ AppMeasurementDynamiteService Z0;

    public zzj(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcv zzcvVar, String str, String str2, boolean z) {
        this.Z0 = appMeasurementDynamiteService;
        this.X = zzcvVar;
        this.Y = str;
        this.Z = str2;
        this.Y0 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z0.Y.J().G(this.X, this.Y, this.Z, this.Y0);
    }
}
