package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzevk implements zzetu {
    public final JSONObject a;

    public zzevk(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.a);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.k("Unable to get cache_state");
        }
    }
}
