package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzdwx implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzdwx(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* synthetic */ Object b() {
        final CookieManager a = com.google.android.gms.ads.internal.zzv.w().a((Context) this.b.b());
        zzfgn zzfgnVar = zzfgn.WEBVIEW_COOKIE;
        zzfgj i = zzfgd.a(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = a;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c1));
            }
        }, zzfgnVar, (zzfgt) this.a.b()).i(1L, TimeUnit.SECONDS);
        final zzffx zzffxVar = new zzffx() { // from class: com.google.android.gms.internal.ads.zzdws
            @Override // com.google.android.gms.internal.ads.zzffx
            public final Object b(Object obj) {
                Exception exc = (Exception) obj;
                return "";
            }
        };
        return i.c(Exception.class, new zzgcf(zzffxVar) { // from class: com.google.android.gms.internal.ads.zzfge
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                Exception exc = (Exception) ((Throwable) obj);
                return zzgcy.h("");
            }
        }).a();
    }
}
