package com.google.android.gms.internal.ads;

import java.util.Queue;
import java.util.concurrent.Executor;
import o.C10323vs;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzabq {
    public final zzabl a;
    public long j;
    public final zzaaj k;
    public final zzabj b = new zzabj();
    public final zzeq c = new zzeq(10);
    public final zzeq d = new zzeq(10);
    public final zzdz e = new zzdz(16);
    public long f = C10323vs.b;
    public zzcd i = zzcd.d;
    public long g = C10323vs.b;
    public long h = C10323vs.b;

    public zzabq(zzaaj zzaajVar, zzabl zzablVar) {
        this.k = zzaajVar;
        this.a = zzablVar;
    }

    public static Object h(zzeq zzeqVar) {
        boolean z;
        if (zzeqVar.a() > 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        while (zzeqVar.a() > 1) {
            zzeqVar.b();
        }
        Object b = zzeqVar.b();
        b.getClass();
        return b;
    }

    public final void a() {
        this.e.d();
        this.f = C10323vs.b;
        this.g = C10323vs.b;
        this.h = C10323vs.b;
        zzeq zzeqVar = this.d;
        if (zzeqVar.a() > 0) {
            this.j = ((Long) h(zzeqVar)).longValue();
        }
        zzeq zzeqVar2 = this.c;
        if (zzeqVar2.a() > 0) {
            zzeqVar2.d(0L, (zzcd) h(zzeqVar2));
        }
    }

    public final void b(long j) {
        this.e.c(j);
        this.f = j;
        this.h = C10323vs.b;
    }

    public final void c(int i, long j) {
        long j2;
        if (this.e.e()) {
            this.a.f(i);
            this.j = j;
            return;
        }
        zzeq zzeqVar = this.d;
        long j3 = this.f;
        if (j3 == C10323vs.b) {
            j2 = 0;
        } else {
            j2 = j3 + 1;
        }
        zzeqVar.d(j2, Long.valueOf(j));
    }

    public final void d(int i, int i2) {
        long j;
        long j2 = this.f;
        if (j2 == C10323vs.b) {
            j = 0;
        } else {
            j = j2 + 1;
        }
        this.c.d(j, new zzcd(i, i2, 1.0f));
    }

    public final void e(long j, long j2) throws zzik {
        long d;
        Executor executor;
        Queue queue;
        while (true) {
            zzdz zzdzVar = this.e;
            if (!zzdzVar.e()) {
                zzeq zzeqVar = this.d;
                long a = zzdzVar.a();
                Long l = (Long) zzeqVar.c(a);
                if (l != null && l.longValue() != this.j) {
                    this.j = l.longValue();
                    this.a.f(2);
                }
                zzabl zzablVar = this.a;
                long j3 = this.j;
                zzabj zzabjVar = this.b;
                int a2 = zzablVar.a(a, j, j2, j3, false, false, zzabjVar);
                if (a2 != 0 && a2 != 1) {
                    if (a2 != 2 && a2 != 3) {
                        if (a2 == 4) {
                            this.g = a;
                        } else {
                            return;
                        }
                    } else {
                        this.g = a;
                        zzdzVar.b();
                        final zzaaj zzaajVar = this.k;
                        zzaal zzaalVar = zzaajVar.b;
                        executor = zzaalVar.i;
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaah
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzace zzaceVar;
                                zzaceVar = zzaaj.this.b.h;
                                zzaceVar.c();
                            }
                        });
                        queue = zzaalVar.c;
                        ((zzacf) queue.remove()).b();
                    }
                } else {
                    this.g = a;
                    long b = zzdzVar.b();
                    zzcd zzcdVar = (zzcd) this.c.c(b);
                    if (zzcdVar != null && !zzcdVar.equals(zzcd.d) && !zzcdVar.equals(this.i)) {
                        this.i = zzcdVar;
                        this.k.a(zzcdVar);
                    }
                    if (a2 == 0) {
                        d = System.nanoTime();
                    } else {
                        d = zzabjVar.d();
                    }
                    this.k.b(d, b, zzablVar.n());
                }
            } else {
                return;
            }
        }
    }

    public final void f() {
        long j = this.f;
        if (j == C10323vs.b) {
            j = Long.MIN_VALUE;
            this.f = Long.MIN_VALUE;
            this.g = Long.MIN_VALUE;
        }
        this.h = j;
    }

    public final boolean g() {
        long j = this.h;
        return j != C10323vs.b && this.g == j;
    }
}
