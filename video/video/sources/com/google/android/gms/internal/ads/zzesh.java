package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzesh implements zzetv {
    public final zzetv a;
    public final long b;
    public final ScheduledExecutorService c;

    public zzesh(zzetv zzetvVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.a = zzetvVar;
        this.b = j;
        this.c = scheduledExecutorService;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(zzesh zzeshVar, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z2)).booleanValue()) {
            zzetv zzetvVar = zzeshVar.a;
            zzbzn t = com.google.android.gms.ads.internal.zzv.t();
            int a = zzetvVar.a();
            t.x(th, "OptionalSignalTimeout:" + a);
        }
        return zzgcy.h(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return this.a.a();
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        InterfaceFutureC8411o11 b = this.a.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A2)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.b;
        if (j > 0) {
            b = zzgcy.o(b, j, timeUnit, this.c);
        }
        return zzgcy.f(b, Throwable.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzesg
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzesh.c(zzesh.this, (Throwable) obj);
            }
        }, zzcaa.g);
    }
}
