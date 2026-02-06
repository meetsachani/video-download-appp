package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzly;
import o.InterfaceC10389w71;

/* loaded from: classes3.dex */
public final class zzlu<T extends Context & zzly> {
    public final T a;

    public zzlu(T t) {
        Preconditions.r(t);
        this.a = t;
    }

    @InterfaceC10389w71
    public final int a(final Intent intent, int i, final int i2) {
        final zzfr j = zzhf.c(this.a, null, null).j();
        if (intent == null) {
            j.L().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        j.K().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlw
                @Override // java.lang.Runnable
                public final void run() {
                    zzlu.this.d(i2, j, intent);
                }
            });
        }
        return 2;
    }

    @InterfaceC10389w71
    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().G().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzhj(zzmp.k(this.a));
        }
        j().L().b("onBind received unknown action", action);
        return null;
    }

    @InterfaceC10389w71
    public final void c() {
        zzhf.c(this.a, null, null).j().K().a("Local AppMeasurementService is starting up");
    }

    public final /* synthetic */ void d(int i, zzfr zzfrVar, Intent intent) {
        if (this.a.u(i)) {
            zzfrVar.K().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            j().K().a("Completed wakeful intent.");
            this.a.a(intent);
        }
    }

    public final /* synthetic */ void e(zzfr zzfrVar, JobParameters jobParameters) {
        zzfrVar.K().a("AppMeasurementJobService processed last upload request.");
        this.a.b(jobParameters, false);
    }

    public final void f(Runnable runnable) {
        zzmp k = zzmp.k(this.a);
        k.l().D(new zzlv(this, k, runnable));
    }

    @InterfaceC10389w71
    @TargetApi(24)
    public final boolean g(final JobParameters jobParameters) {
        final zzfr j = zzhf.c(this.a, null, null).j();
        String string = jobParameters.getExtras().getString("action");
        j.K().b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            f(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzlt
                @Override // java.lang.Runnable
                public final void run() {
                    zzlu.this.e(j, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    @InterfaceC10389w71
    public final void h() {
        zzhf.c(this.a, null, null).j().K().a("Local AppMeasurementService is shutting down");
    }

    @InterfaceC10389w71
    public final void i(Intent intent) {
        if (intent == null) {
            j().G().a("onRebind called with null intent");
            return;
        }
        j().K().b("onRebind called. action", intent.getAction());
    }

    public final zzfr j() {
        return zzhf.c(this.a, null, null).j();
    }

    @InterfaceC10389w71
    public final boolean k(Intent intent) {
        if (intent == null) {
            j().G().a("onUnbind called with null intent");
            return true;
        }
        j().K().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
