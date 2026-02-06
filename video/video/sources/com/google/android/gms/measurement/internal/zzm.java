package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes3.dex */
final class zzm implements Runnable {
    public final /* synthetic */ AppMeasurementDynamiteService.zza X;
    public final /* synthetic */ AppMeasurementDynamiteService Y;

    public zzm(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.zza zzaVar) {
        this.Y = appMeasurementDynamiteService;
        this.X = zzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Y.Y.H().N(this.X);
    }
}
