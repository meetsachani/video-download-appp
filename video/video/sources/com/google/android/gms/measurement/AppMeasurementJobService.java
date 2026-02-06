package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzly;
import o.InterfaceC10389w71;
import o.InterfaceC5670cr1;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements zzly {
    public zzlu<AppMeasurementJobService> X;

    @Override // com.google.android.gms.measurement.internal.zzly
    public final void a(@InterfaceC5670cr1 Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.zzly
    @TargetApi(24)
    public final void b(@InterfaceC5670cr1 JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final zzlu<AppMeasurementJobService> c() {
        if (this.X == null) {
            this.X = new zzlu<>(this);
        }
        return this.X;
    }

    @Override // android.app.Service
    @InterfaceC10389w71
    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    @Override // android.app.Service
    @InterfaceC10389w71
    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    @InterfaceC10389w71
    public final void onRebind(@InterfaceC5670cr1 Intent intent) {
        c().i(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(@InterfaceC5670cr1 JobParameters jobParameters) {
        return c().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(@InterfaceC5670cr1 JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    @InterfaceC10389w71
    public final boolean onUnbind(@InterfaceC5670cr1 Intent intent) {
        return c().k(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzly
    public final boolean u(int i) {
        throw new UnsupportedOperationException();
    }
}
