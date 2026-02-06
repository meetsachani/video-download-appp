package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzege {
    public final Executor a;
    public final ScheduledExecutorService b;
    public final zzcra c;
    public final zzegu d;
    public final zzfjn e;
    public final zzgds f = zzgds.A();
    public final AtomicBoolean g = new AtomicBoolean();
    public zzegf h;
    public zzfcg i;

    public zzege(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcra zzcraVar, zzegu zzeguVar, zzfjn zzfjnVar) {
        this.a = executor;
        this.b = scheduledExecutorService;
        this.c = zzcraVar;
        this.d = zzeguVar;
        this.e = zzfjnVar;
    }

    public final synchronized InterfaceFutureC8411o11 b(zzfcg zzfcgVar) {
        try {
            if (!this.g.getAndSet(true)) {
                List list = zzfcgVar.b.a;
                if (list.isEmpty()) {
                    this.f.m(new zzegy(3, zzehb.d(zzfcgVar)));
                } else {
                    this.i = zzfcgVar;
                    zzegu zzeguVar = this.d;
                    this.h = new zzegf(zzfcgVar, zzeguVar, this.f);
                    zzeguVar.k(list);
                    zzfbu a = this.h.a();
                    while (a != null) {
                        e(a);
                        a = this.h.a();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f;
    }

    public final synchronized InterfaceFutureC8411o11 d(zzfbu zzfbuVar) {
        for (String str : zzfbuVar.a) {
            zzedf g = this.c.g(zzfbuVar.b, str);
            if (g != null && g.a(this.i, zzfbuVar)) {
                InterfaceFutureC8411o11 b = g.b(this.i, zzfbuVar);
                int i = zzfbuVar.R;
                return zzgcy.o(b, i, TimeUnit.MILLISECONDS, this.b);
            }
        }
        return zzgcy.g(new zzdwf(3));
    }

    public final void e(@InterfaceC11300zs1 zzfbu zzfbuVar) {
        InterfaceFutureC8411o11 d = d(zzfbuVar);
        this.d.f(this.i, zzfbuVar, d, this.e);
        zzgcy.r(d, new zzegd(this, zzfbuVar), this.a);
    }
}
