package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzly;
import o.InterfaceC10389w71;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements zzly {
    public zzlu<AppMeasurementService> X;

    private final zzlu<AppMeasurementService> c() {
        if (this.X == null) {
            this.X = new zzlu<>(this);
        }
        return this.X;
    }

    @Override // com.google.android.gms.measurement.internal.zzly
    public final void a(@InterfaceC5670cr1 Intent intent) {
        WakefulBroadcastReceiver.b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzly
    public final void b(@InterfaceC5670cr1 JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    @InterfaceC11300zs1
    @InterfaceC10389w71
    public final IBinder onBind(@InterfaceC5670cr1 Intent intent) {
        return c().b(intent);
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

    @Override // android.app.Service
    @InterfaceC10389w71
    public final int onStartCommand(@InterfaceC5670cr1 Intent intent, int i, int i2) {
        return c().a(intent, i, i2);
    }

    @Override // android.app.Service
    @InterfaceC10389w71
    public final boolean onUnbind(@InterfaceC5670cr1 Intent intent) {
        return c().k(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzly
    public final boolean u(int i) {
        return stopSelfResult(i);
    }
}
