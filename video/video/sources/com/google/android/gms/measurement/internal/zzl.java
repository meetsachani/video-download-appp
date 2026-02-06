package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzl implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcv X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ AppMeasurementDynamiteService Y0;
    public final /* synthetic */ String Z;

    public zzl(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcv zzcvVar, String str, String str2) {
        this.Y0 = appMeasurementDynamiteService;
        this.X = zzcvVar;
        this.Y = str;
        this.Z = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y0.Y.J().F(this.X, this.Y, this.Z);
    }
}
