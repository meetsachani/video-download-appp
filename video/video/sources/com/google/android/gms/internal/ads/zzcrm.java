package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzcrm {
    public final Executor a;
    public final ScheduledExecutorService b;
    public final InterfaceFutureC8411o11 c;
    public volatile boolean d = true;

    public zzcrm(Executor executor, ScheduledExecutorService scheduledExecutorService, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        this.a = executor;
        this.b = scheduledExecutorService;
        this.c = interfaceFutureC8411o11;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 a(zzcrm zzcrmVar, zzgcu zzgcuVar, InterfaceFutureC8411o11 interfaceFutureC8411o11, zzcqx zzcqxVar) {
        if (zzcqxVar != null) {
            zzgcuVar.c(zzcqxVar);
        }
        return zzgcy.o(interfaceFutureC8411o11, ((Long) zzbfi.a.e()).longValue(), TimeUnit.MILLISECONDS, zzcrmVar.b);
    }

    public static /* bridge */ /* synthetic */ void c(final zzcrm zzcrmVar, List list, final zzgcu zzgcuVar) {
        if (list != null && !list.isEmpty()) {
            InterfaceFutureC8411o11 h = zzgcy.h(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final InterfaceFutureC8411o11 interfaceFutureC8411o11 = (InterfaceFutureC8411o11) it.next();
                zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzcri
                    @Override // com.google.android.gms.internal.ads.zzgcf
                    public final InterfaceFutureC8411o11 b(Object obj) {
                        zzgcu.this.a((Throwable) obj);
                        return zzgcy.h(null);
                    }
                };
                Executor executor = zzcrmVar.a;
                h = zzgcy.n(zzgcy.f(h, Throwable.class, zzgcfVar, executor), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzcrj
                    @Override // com.google.android.gms.internal.ads.zzgcf
                    public final InterfaceFutureC8411o11 b(Object obj) {
                        return zzcrm.a(zzcrm.this, zzgcuVar, interfaceFutureC8411o11, (zzcqx) obj);
                    }
                }, executor);
            }
            zzgcy.r(h, new zzcrl(zzcrmVar, zzgcuVar), zzcrmVar.a);
            return;
        }
        zzcrmVar.a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrh
            @Override // java.lang.Runnable
            public final void run() {
                zzgcu.this.a(new zzdwf(3));
            }
        });
    }

    public final void e(zzgcu zzgcuVar) {
        zzgcy.r(this.c, new zzcrk(this, zzgcuVar), this.a);
    }

    public final boolean f() {
        return this.d;
    }
}
