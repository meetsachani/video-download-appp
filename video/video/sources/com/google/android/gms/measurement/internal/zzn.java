package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzn implements Runnable {
    public final /* synthetic */ com.google.android.gms.internal.measurement.zzcv X;
    public final /* synthetic */ AppMeasurementDynamiteService Y;

    public zzn(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcv zzcvVar) {
        this.Y = appMeasurementDynamiteService;
        this.X = zzcvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y.Y.L().T(this.X, this.Y.Y.o());
    }
}
