package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdwn {
    public final zzgdj a;
    public final zzgdj b;
    public final zzdxx c;
    public final zzhfp d;

    public zzdwn(zzgdj zzgdjVar, zzgdj zzgdjVar2, zzdxx zzdxxVar, zzhfp zzhfpVar) {
        this.a = zzgdjVar;
        this.b = zzgdjVar2;
        this.c = zzdxxVar;
        this.d = zzhfpVar;
    }

    public static /* synthetic */ zzdyr a(zzdwn zzdwnVar, zzbvl zzbvlVar) {
        return (zzdyr) zzdwnVar.c.c(zzbvlVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P5)).intValue(), TimeUnit.SECONDS);
    }

    public static /* synthetic */ InterfaceFutureC8411o11 b(zzdwn zzdwnVar, final zzbvl zzbvlVar, int i, zzdyq zzdyqVar) {
        Bundle bundle;
        if (zzbvlVar != null && (bundle = zzbvlVar.h1) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgcy.n(((zzdzu) zzdwnVar.d.b()).X7(zzbvlVar, i), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdwj
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzgcy.h(new zzdyr((InputStream) obj, zzbvl.this));
            }
        }, zzdwnVar.b);
    }

    public final InterfaceFutureC8411o11 c(final zzbvl zzbvlVar) {
        InterfaceFutureC8411o11 f;
        String str = zzbvlVar.Y0;
        com.google.android.gms.ads.internal.zzv.v();
        if (com.google.android.gms.ads.internal.util.zzs.d(str)) {
            f = zzgcy.g(new zzdyq(1));
        } else {
            f = zzgcy.f(this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdwn.a(zzdwn.this, zzbvlVar);
                }
            }), ExecutionException.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdwl
                @Override // com.google.android.gms.internal.ads.zzgcf
                public final InterfaceFutureC8411o11 b(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    return zzgcy.g(th);
                }
            }, this.b);
        }
        final int callingUid = Binder.getCallingUid();
        return zzgcy.f(f, zzdyq.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdwm
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzdwn.b(zzdwn.this, zzbvlVar, callingUid, (zzdyq) obj);
            }
        }, this.b);
    }
}
