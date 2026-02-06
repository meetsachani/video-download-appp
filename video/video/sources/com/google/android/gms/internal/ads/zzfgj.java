package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzfgj {
    public final Object a;
    @InterfaceC11300zs1
    public final String b;
    public final InterfaceFutureC8411o11 c;
    public final List d;
    public final InterfaceFutureC8411o11 e;
    public final /* synthetic */ zzfgl f;

    public zzfgj(zzfgl zzfglVar, Object obj, String str, InterfaceFutureC8411o11 interfaceFutureC8411o11, List list, InterfaceFutureC8411o11 interfaceFutureC8411o112) {
        this.f = zzfglVar;
        this.a = obj;
        this.b = str;
        this.c = interfaceFutureC8411o11;
        this.d = list;
        this.e = interfaceFutureC8411o112;
    }

    public final zzffz a() {
        zzfgm zzfgmVar;
        Object obj = this.a;
        String str = this.b;
        if (str == null) {
            str = this.f.f(obj);
        }
        final zzffz zzffzVar = new zzffz(obj, str, this.e);
        zzfgmVar = this.f.c;
        zzfgmVar.C(zzffzVar);
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.c;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgh
            @Override // java.lang.Runnable
            public final void run() {
                zzfgm zzfgmVar2;
                zzfgmVar2 = zzfgj.this.f.c;
                zzfgmVar2.x(zzffzVar);
            }
        };
        zzgdj zzgdjVar = zzcaa.g;
        interfaceFutureC8411o11.h4(runnable, zzgdjVar);
        zzgcy.r(zzffzVar, new zzfgi(this, zzffzVar), zzgdjVar);
        return zzffzVar;
    }

    public final zzfgj b(Object obj) {
        return this.f.b(obj, a());
    }

    public final zzfgj c(Class cls, zzgcf zzgcfVar) {
        zzgdj zzgdjVar;
        zzfgl zzfglVar = this.f;
        zzgdjVar = zzfglVar.a;
        return new zzfgj(zzfglVar, this.a, this.b, this.c, this.d, zzgcy.f(this.e, cls, zzgcfVar, zzgdjVar));
    }

    public final zzfgj d(final InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        return g(new zzgcf() { // from class: com.google.android.gms.internal.ads.zzfgg
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return InterfaceFutureC8411o11.this;
            }
        }, zzcaa.g);
    }

    public final zzfgj e(final zzffx zzffxVar) {
        return f(new zzgcf() { // from class: com.google.android.gms.internal.ads.zzfgf
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzgcy.h(zzffx.this.b(obj));
            }
        });
    }

    public final zzfgj f(zzgcf zzgcfVar) {
        zzgdj zzgdjVar;
        zzgdjVar = this.f.a;
        return g(zzgcfVar, zzgdjVar);
    }

    public final zzfgj g(zzgcf zzgcfVar, Executor executor) {
        return new zzfgj(this.f, this.a, this.b, this.c, this.d, zzgcy.n(this.e, zzgcfVar, executor));
    }

    public final zzfgj h(String str) {
        return new zzfgj(this.f, this.a, str, this.c, this.d, this.e);
    }

    public final zzfgj i(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        zzfgl zzfglVar = this.f;
        scheduledExecutorService = zzfglVar.b;
        return new zzfgj(zzfglVar, this.a, this.b, this.c, this.d, zzgcy.o(this.e, j, timeUnit, scheduledExecutorService));
    }
}
