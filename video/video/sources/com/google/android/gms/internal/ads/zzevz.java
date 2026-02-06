package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzevz implements zzetu {
    public final Bundle a;

    public zzevz(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.a;
        if (bundle != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbs.g(com.google.android.gms.ads.internal.util.zzbs.g(jSONObject, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.zzbb.b().o(bundle));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.k("Failed putting parental controls bundle.");
            }
        }
    }
}
