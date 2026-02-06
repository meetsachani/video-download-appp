package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C10928yK2;
import o.C9811tl1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzclz implements zzcld {
    @InterfaceC11300zs1
    public final CookieManager a;

    public zzclz(Context context) {
        this.a = com.google.android.gms.ads.internal.zzv.w().a(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcld
    public final void a(Map map) {
        CookieManager cookieManager = this.a;
        if (cookieManager != null) {
            if (((String) map.get("clear")) != null) {
                String str = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c1);
                String cookie = cookieManager.getCookie(str);
                if (cookie != null) {
                    List f = zzfvr.b(zzfun.c(C10928yK2.l)).f(cookie);
                    for (int i = 0; i < f.size(); i++) {
                        Iterator it = zzfvr.b(zzfun.c('=')).d((String) f.get(i)).iterator();
                        it.getClass();
                        if (it.hasNext()) {
                            cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.O0))));
                        } else {
                            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0" + C9811tl1.d);
                        }
                    }
                    return;
                }
                return;
            }
            String str2 = (String) map.get("cookie");
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.c1), str2);
        }
    }
}
