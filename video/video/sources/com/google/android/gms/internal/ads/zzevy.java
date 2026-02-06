package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzevy implements zzetv {
    public final ScheduledExecutorService a;

    public zzevy(zzbtp zzbtpVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.a = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return zzgcy.m(zzgcy.o(zzgcy.h(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.u4)).longValue(), TimeUnit.MILLISECONDS, this.a), new zzfur() { // from class: com.google.android.gms.internal.ads.zzevx
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                return new zzevz((Bundle) obj);
            }
        }, zzcaa.a);
    }
}
