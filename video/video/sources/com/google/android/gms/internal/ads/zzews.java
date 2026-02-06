package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzews implements zzetu {
    public final Map a;

    public zzews(Map map) {
        this.a = map;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", com.google.android.gms.ads.internal.client.zzbb.b().p(this.a));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.k("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
