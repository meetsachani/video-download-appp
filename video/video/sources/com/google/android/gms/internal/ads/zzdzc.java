package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdzc {
    public final zzgdj a;
    public final zzdyh b;
    public final zzhfp c;

    public zzdzc(zzgdj zzgdjVar, zzdyh zzdyhVar, zzhfp zzhfpVar) {
        this.a = zzgdjVar;
        this.b = zzdyhVar;
        this.c = zzhfpVar;
    }

    public final InterfaceFutureC8411o11 e(final zzbvl zzbvlVar) {
        zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdyv
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                String str = new String(zzgas.b((InputStream) obj), StandardCharsets.UTF_8);
                zzbvl zzbvlVar2 = zzbvl.this;
                zzbvlVar2.e1 = str;
                return zzgcy.h(zzbvlVar2);
            }
        };
        final zzdyh zzdyhVar = this.b;
        Objects.requireNonNull(zzdyhVar);
        return g(zzbvlVar, new zzdzb() { // from class: com.google.android.gms.internal.ads.zzdyw
            @Override // com.google.android.gms.internal.ads.zzdzb
            public final InterfaceFutureC8411o11 a(zzbvl zzbvlVar2) {
                return zzdyh.this.c(zzbvlVar2);
            }
        }, new zzdzb() { // from class: com.google.android.gms.internal.ads.zzdyx
            @Override // com.google.android.gms.internal.ads.zzdzb
            public final InterfaceFutureC8411o11 a(zzbvl zzbvlVar2) {
                InterfaceFutureC8411o11 W7;
                W7 = ((zzdzu) zzdzc.this.c.b()).W7(zzbvlVar2, Binder.getCallingUid());
                return W7;
            }
        }, zzgcfVar);
    }

    public final InterfaceFutureC8411o11 f(zzbvl zzbvlVar) {
        return g(zzbvlVar, new zzdzb() { // from class: com.google.android.gms.internal.ads.zzdyt
            @Override // com.google.android.gms.internal.ads.zzdzb
            public final InterfaceFutureC8411o11 a(zzbvl zzbvlVar2) {
                InterfaceFutureC8411o11 d;
                d = zzdzc.this.b.d(zzbvlVar2.c1);
                return d;
            }
        }, new zzdzb() { // from class: com.google.android.gms.internal.ads.zzdyu
            @Override // com.google.android.gms.internal.ads.zzdzb
            public final InterfaceFutureC8411o11 a(zzbvl zzbvlVar2) {
                InterfaceFutureC8411o11 Z7;
                Z7 = ((zzdzu) zzdzc.this.c.b()).Z7(zzbvlVar2.c1);
                return Z7;
            }
        }, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdys
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                InputStream inputStream = (InputStream) obj;
                return zzgcy.h(null);
            }
        });
    }

    public final InterfaceFutureC8411o11 g(final zzbvl zzbvlVar, zzdzb zzdzbVar, final zzdzb zzdzbVar2, final zzgcf zzgcfVar) {
        InterfaceFutureC8411o11 f;
        String str = zzbvlVar.Y0;
        com.google.android.gms.ads.internal.zzv.v();
        if (com.google.android.gms.ads.internal.util.zzs.d(str)) {
            f = zzgcy.g(new zzdyq(1));
        } else {
            f = zzgcy.f(zzdzbVar.a(zzbvlVar), ExecutionException.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdza
                @Override // com.google.android.gms.internal.ads.zzgcf
                public final InterfaceFutureC8411o11 b(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    return zzgcy.g(th);
                }
            }, this.a);
        }
        zzgcp A = zzgcp.A(f);
        zzgcf zzgcfVar2 = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdyy
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzgcy.h(((zzdyr) obj).b());
            }
        };
        zzgdj zzgdjVar = this.a;
        return (zzgcp) zzgcy.f((zzgcp) zzgcy.n((zzgcp) zzgcy.n(A, zzgcfVar2, zzgdjVar), zzgcfVar, zzgdjVar), zzdyq.class, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdyz
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                InterfaceFutureC8411o11 n;
                zzdzc zzdzcVar = zzdzc.this;
                zzdyq zzdyqVar = (zzdyq) obj;
                n = zzgcy.n(zzdzbVar2.a(zzbvlVar), zzgcfVar, zzdzcVar.a);
                return n;
            }
        }, zzgdjVar);
    }
}
