package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzfji {
    public final com.google.android.gms.ads.internal.util.client.zzx a;
    public final com.google.android.gms.ads.internal.util.client.zzu b;
    public final zzgdk c;
    @InterfaceC11300zs1
    public final zzfjj d;

    public zzfji(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzgdk zzgdkVar, @InterfaceC11300zs1 zzfjj zzfjjVar) {
        this.a = zzxVar;
        this.b = zzuVar;
        this.c = zzgdkVar;
        this.d = zzfjjVar;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(zzfji zzfjiVar, int i, long j, String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return zzgcy.h(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = zzfjiVar.a;
        long b = zzxVar.b();
        if (i != 1) {
            b = (long) (zzxVar.a() * j);
        }
        return zzfjiVar.e(str, b, i + 1);
    }

    public final InterfaceFutureC8411o11 d(String str) {
        try {
            return e(str, 0L, 1);
        } catch (NullPointerException | RejectedExecutionException unused) {
            return zzgcy.h(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
        }
    }

    public final InterfaceFutureC8411o11 e(final String str, final long j, final int i) {
        final String str2;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.a;
        if (i > zzxVar.c()) {
            zzfjj zzfjjVar = this.d;
            if (zzfjjVar != null && zzxVar.d()) {
                zzfjjVar.a(str, "", 2);
                return zzgcy.h(com.google.android.gms.ads.internal.util.client.zzt.BUFFERED);
            }
            return zzgcy.h(com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.R8)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i));
            str2 = String.valueOf(clearQuery.build()) + "&" + encodedQuery;
        } else {
            str2 = str;
        }
        zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzfjh
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzfji.c(zzfji.this, i, j, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        if (j == 0) {
            zzgdk zzgdkVar = this.c;
            return zzgcy.n(zzgdkVar.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    com.google.android.gms.ads.internal.util.client.zzt w;
                    w = zzfji.this.b.w(str2);
                    return w;
                }
            }), zzgcfVar, zzgdkVar);
        }
        zzgdk zzgdkVar2 = this.c;
        return zzgcy.n(zzgdkVar2.s2(new Callable() { // from class: com.google.android.gms.internal.ads.zzfjf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.google.android.gms.ads.internal.util.client.zzt w;
                w = zzfji.this.b.w(str2);
                return w;
            }
        }, j, TimeUnit.MILLISECONDS), zzgcfVar, zzgdkVar2);
    }
}
