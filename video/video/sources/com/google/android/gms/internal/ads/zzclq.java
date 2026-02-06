package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzclq implements zzcld {
    @Override // com.google.android.gms.internal.ads.zzcld
    public final void a(Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ja)).booleanValue() && !map.isEmpty()) {
            String str = (String) map.get("is_topics_ad_personalization_allowed");
            if (!TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.zzv.t().j().e0(Boolean.parseBoolean(str));
            }
        }
    }
}
