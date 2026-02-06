package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzevr implements zzetv {
    public zzevr(zzbzb zzbzbVar, zzgdj zzgdjVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        final InterfaceFutureC8411o11 h = zzgcy.h(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.a6)).booleanValue()) {
            h = zzgcy.h(null);
        }
        final InterfaceFutureC8411o11 h2 = zzgcy.h(null);
        return zzgcy.c(h, h2).a(new Callable() { // from class: com.google.android.gms.internal.ads.zzevq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevs((String) InterfaceFutureC8411o11.this.get(), (String) h2.get());
            }
        }, zzcaa.a);
    }
}
