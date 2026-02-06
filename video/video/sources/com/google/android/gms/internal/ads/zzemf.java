package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzemf implements zzetv {
    public final InterfaceFutureC8411o11 a;
    public final Executor b;
    public final ScheduledExecutorService c;

    public zzemf(InterfaceFutureC8411o11 interfaceFutureC8411o11, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.a = interfaceFutureC8411o11;
        this.b = executor;
        this.c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzemd
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzgcy.h(new zzemg((String) obj));
            }
        };
        InterfaceFutureC8411o11 interfaceFutureC8411o11 = this.a;
        Executor executor = this.b;
        InterfaceFutureC8411o11 n = zzgcy.n(interfaceFutureC8411o11, zzgcfVar, executor);
        zzbcm zzbcmVar = zzbcv.Lc;
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).intValue() > 0) {
            n = zzgcy.o(n, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).intValue(), TimeUnit.MILLISECONDS, this.c);
        }
        return zzgcy.f(n, Throwable.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                if (((Throwable) obj) instanceof TimeoutException) {
                    return zzgcy.h(new zzemg(Integer.toString(17)));
                }
                return zzgcy.h(new zzemg(null));
            }
        }, executor);
    }
}
