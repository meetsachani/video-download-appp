package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzewn implements zzetv {
    public final zzbzn a;
    public final boolean b;
    public final boolean c;
    public final ScheduledExecutorService d;
    public final zzgdj e;
    public final int f;
    public final int g;

    public zzewn(zzbzn zzbznVar, boolean z, boolean z2, zzbzc zzbzcVar, zzgdj zzgdjVar, String str, ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.a = zzbznVar;
        this.b = z;
        this.c = z2;
        this.e = zzgdjVar;
        this.d = scheduledExecutorService;
        this.f = i;
        this.g = i2;
    }

    public static /* synthetic */ zzewo c(zzewn zzewnVar, Exception exc) {
        zzewnVar.a.x(exc, "TrustlessTokenSignal");
        return new zzewo(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        boolean z;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.h7)).booleanValue() && this.c) {
            return zzgcy.h(new zzewo(null));
        }
        if (this.g != 2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j7)).booleanValue()) {
                z = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.k7)).split(",")).contains(String.valueOf(this.f));
            } else {
                z = this.b;
            }
            if (!z) {
                return zzgcy.h(new zzewo(null));
            }
            InterfaceFutureC8411o11 h = zzgcy.h(null);
            zzfur zzfurVar = new zzfur() { // from class: com.google.android.gms.internal.ads.zzewl
                @Override // com.google.android.gms.internal.ads.zzfur
                public final Object apply(Object obj) {
                    return new zzewo((String) obj);
                }
            };
            zzgdj zzgdjVar = this.e;
            return zzgcy.e(zzgcy.o(zzgcy.m(h, zzfurVar, zzgdjVar), ((Long) zzbfj.b.e()).longValue(), TimeUnit.MILLISECONDS, this.d), Exception.class, new zzfur() { // from class: com.google.android.gms.internal.ads.zzewm
                @Override // com.google.android.gms.internal.ads.zzfur
                public final Object apply(Object obj) {
                    return zzewn.c(zzewn.this, (Exception) obj);
                }
            }, zzgdjVar);
        }
        return zzgcy.h(new zzewo(null));
    }
}
