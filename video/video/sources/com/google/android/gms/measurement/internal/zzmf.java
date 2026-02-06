package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzps;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmf {
    public final /* synthetic */ zzlx a;

    public zzmf(zzlx zzlxVar) {
        this.a = zzlxVar;
    }

    @InterfaceC10697xN2
    public final void a() {
        this.a.n();
        if (this.a.h().y(this.a.b().a())) {
            this.a.h().l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.j().K().a("Detected application was in foreground");
                c(this.a.b().a(), false);
            }
        }
    }

    @InterfaceC10697xN2
    public final void b(long j, boolean z) {
        this.a.n();
        this.a.G();
        if (this.a.h().y(j)) {
            this.a.h().l.a(true);
            if (zzps.a() && this.a.d().s(zzbi.x0)) {
                this.a.p().I();
            }
        }
        this.a.h().p.b(j);
        if (this.a.h().l.b()) {
            c(j, z);
        }
    }

    @InterfaceC5056aJ2
    @InterfaceC10697xN2
    public final void c(long j, boolean z) {
        this.a.n();
        if (this.a.a.p()) {
            this.a.h().p.b(j);
            this.a.j().K().b("Session started, time", Long.valueOf(this.a.b().b()));
            long j2 = j / 1000;
            this.a.r().b0("auto", "_sid", Long.valueOf(j2), j);
            this.a.h().q.b(j2);
            this.a.h().l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j2);
            if (this.a.d().s(zzbi.m0) && z) {
                bundle.putLong("_aib", 1L);
            }
            this.a.r().V("auto", "_s", j, bundle);
            if (zznv.a() && this.a.d().s(zzbi.p0)) {
                String a = this.a.h().v.a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.a.r().V("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
