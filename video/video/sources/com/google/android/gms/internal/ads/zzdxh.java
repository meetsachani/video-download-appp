package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdxh {
    public final ScheduledExecutorService a;
    public final zzgdj b;
    public final zzgdj c;
    public final zzdyd d;
    public final zzhfp e;

    public zzdxh(ScheduledExecutorService scheduledExecutorService, zzgdj zzgdjVar, zzgdj zzgdjVar2, zzdyd zzdydVar, zzhfp zzhfpVar) {
        this.a = scheduledExecutorService;
        this.b = zzgdjVar;
        this.c = zzgdjVar2;
        this.d = zzdydVar;
        this.e = zzhfpVar;
    }

    public static /* synthetic */ zzdyr a(zzdxh zzdxhVar, zzbvl zzbvlVar) {
        return (zzdyr) zzdxhVar.d.c(zzbvlVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P5)).intValue(), TimeUnit.SECONDS);
    }

    public static /* synthetic */ InterfaceFutureC8411o11 b(zzdxh zzdxhVar, final zzbvl zzbvlVar, int i, Throwable th) {
        Bundle bundle;
        if (zzbvlVar != null && (bundle = zzbvlVar.h1) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgcy.n(((zzdzu) zzdxhVar.e.b()).Y7(zzbvlVar, i), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdxe
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzgcy.h(new zzdyr((InputStream) obj, zzbvl.this));
            }
        }, zzdxhVar.b);
    }

    public final InterfaceFutureC8411o11 c(final zzbvl zzbvlVar) {
        InterfaceFutureC8411o11 c;
        String str = zzbvlVar.Y0;
        com.google.android.gms.ads.internal.zzv.v();
        if (com.google.android.gms.ads.internal.util.zzs.d(str)) {
            c = zzgcy.g(new zzdyq(1));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.G7)).booleanValue()) {
                c = this.c.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzdxh.a(zzdxh.this, zzbvlVar);
                    }
                });
            } else {
                c = this.d.c(zzbvlVar);
            }
        }
        final int callingUid = Binder.getCallingUid();
        zzgcp A = zzgcp.A(c);
        zzbcm zzbcmVar = zzbcv.P5;
        return (zzgcp) zzgcy.f((zzgcp) zzgcy.o(A, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).intValue(), TimeUnit.SECONDS, this.a), Throwable.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdxg
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzdxh.b(zzdxh.this, zzbvlVar, callingUid, (Throwable) obj);
            }
        }, this.b);
    }
}
