package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.S;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbkj implements zzbjw {
    public final zzdvz a;

    public zzbkj(zzdvz zzdvzVar) {
        this.a = zzdvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.H9)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                String str4 = (String) map.get(S.A);
                if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                    this.a.b8(str2, str4, str3);
                } else if (str.equals("show")) {
                    this.a.c8(str2, str3);
                }
            }
        }
    }
}
