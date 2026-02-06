package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzevs implements zzetu {
    public final String a;
    public final String b;

    public zzevs(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            JSONObject g = com.google.android.gms.ads.internal.util.zzbs.g((JSONObject) obj, "pii");
            g.put("doritos", this.a);
            g.put("doritos_v2", this.b);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.k("Failed putting doritos string.");
        }
    }
}
