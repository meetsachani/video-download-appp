package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.common.util.Clock;
import o.C3771Nr1;
import o.JK1;

/* loaded from: classes3.dex */
public final class zzmj extends zzmo {
    public final AlarmManager d;
    public zzaw e;
    public Integer f;

    public zzmj(zzmp zzmpVar) {
        super(zzmpVar);
        this.d = (AlarmManager) a().getSystemService(C3771Nr1.K0);
    }

    @TargetApi(24)
    private final void D() {
        JobScheduler jobScheduler = (JobScheduler) a().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(A());
        }
    }

    public final int A() {
        if (this.f == null) {
            String packageName = a().getPackageName();
            this.f = Integer.valueOf(("measurement" + packageName).hashCode());
        }
        return this.f.intValue();
    }

    public final PendingIntent B() {
        Context a = a();
        return com.google.android.gms.internal.measurement.zzcc.a(a, 0, new Intent().setClassName(a, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.zzcc.b);
    }

    public final zzaw C() {
        if (this.e == null) {
            this.e = new zzmm(this, this.b.i0());
        }
        return this.e;
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzaf d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzba e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzae f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzfq g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzgd h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zznd i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzfr j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzgy l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzmz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzt p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzao q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzgp r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzls s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzmn t() {
        return super.t();
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final boolean x() {
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        D();
        return false;
    }

    public final void y(long j) {
        u();
        Context a = a();
        if (!zznd.c0(a)) {
            j().F().a("Receiver not registered/enabled");
        }
        if (!zznd.d0(a, false)) {
            j().F().a("Service not registered/enabled");
        }
        z();
        j().K().b("Scheduling upload, millis", Long.valueOf(j));
        b().b();
        if (j < Math.max(0L, zzbi.z.a(null).longValue()) && !C().e()) {
            C().b(j);
        }
        Context a2 = a();
        ComponentName componentName = new ComponentName(a2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int A = A();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.zzce.c(a2, new JobInfo.Builder(A, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void z() {
        u();
        j().K().a("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        C().a();
        D();
    }
}
