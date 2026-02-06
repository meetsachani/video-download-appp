package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzewo implements zzetu {
    public final String a;

    public zzewo(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            String str = this.a;
            if (!TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.zzbs.g(jSONObject, "pii").put("adsid", str);
            }
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Failed putting trustless token.", e);
        }
    }
}
