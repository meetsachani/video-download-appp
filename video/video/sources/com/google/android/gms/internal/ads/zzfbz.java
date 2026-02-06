package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfbz {
    @InterfaceC11300zs1
    public final String a;
    @InterfaceC11300zs1
    public final String b;
    public final JSONObject c;
    public final JSONObject d;

    public zzfbz(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject i = com.google.android.gms.ads.internal.util.zzbs.i(jsonReader);
        this.d = i;
        this.a = i.optString("ad_html", null);
        this.b = i.optString("ad_base_url", null);
        this.c = i.optJSONObject("ad_json");
    }
}
