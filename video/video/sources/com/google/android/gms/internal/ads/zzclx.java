package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzclx implements zzcle {
    public final zzbya a;

    public zzclx(zzbya zzbyaVar) {
        this.a = zzbyaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.zzbya] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.zzcle
    public final void a(JSONObject jSONObject) {
        ?? r4;
        long optLong = jSONObject.optLong("timestamp");
        if (jSONObject.optBoolean("npa_reset")) {
            r4 = -1;
        } else {
            r4 = jSONObject.optBoolean("npa");
        }
        this.a.b(r4, optLong);
    }
}
