package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbbt;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfj;
import com.google.android.gms.internal.ads.zzcgk;
import com.google.android.gms.internal.ads.zzece;
import java.io.InputStream;
import java.util.Map;
import o.InterfaceC11300zs1;

@TargetApi(21)
/* loaded from: classes2.dex */
public class zzt extends zzaa {
    public zzt() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    @InterfaceC11300zs1
    public final CookieManager a(Context context) {
        com.google.android.gms.ads.internal.zzv.v();
        if (zzs.g()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzv.t().w(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final WebResourceResponse b(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final zzcfj c(zzcfb zzcfbVar, zzbbt zzbbtVar, boolean z, @InterfaceC11300zs1 zzece zzeceVar) {
        return new zzcgk(zzcfbVar, zzbbtVar, z, zzeceVar);
    }
}
