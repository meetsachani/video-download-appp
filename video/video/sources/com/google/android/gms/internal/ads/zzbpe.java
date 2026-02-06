package com.google.android.gms.internal.ads;

import com.facebook.internal.c0;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C5459bz1;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbpe {
    public final List a;
    public final String b;
    @InterfaceC11300zs1
    public final String c;

    public zzbpe(JSONObject jSONObject) throws JSONException {
        String str;
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        com.google.android.gms.ads.internal.zzv.l();
        zzbpg.a(jSONObject, "clickurl");
        com.google.android.gms.ads.internal.zzv.l();
        zzbpg.a(jSONObject, "imp_urls");
        com.google.android.gms.ads.internal.zzv.l();
        zzbpg.a(jSONObject, "downloaded_imp_urls");
        com.google.android.gms.ads.internal.zzv.l();
        zzbpg.a(jSONObject, "fill_urls");
        com.google.android.gms.ads.internal.zzv.l();
        zzbpg.a(jSONObject, "video_start_urls");
        com.google.android.gms.ads.internal.zzv.l();
        zzbpg.a(jSONObject, "video_complete_urls");
        com.google.android.gms.ads.internal.zzv.l();
        zzbpg.a(jSONObject, "video_reward_urls");
        jSONObject.optString(FirebaseAnalytics.Param.F);
        jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            com.google.android.gms.ads.internal.zzv.l();
            zzbpg.a(optJSONObject, "manual_impression_urls");
        }
        if (optJSONObject != null) {
            optJSONObject.toString();
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        if (optJSONObject2 != null) {
            str = optJSONObject2.toString();
        } else {
            str = null;
        }
        this.b = str;
        if (optJSONObject2 != null) {
            optJSONObject2.optString(C5459bz1.j);
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            optJSONObject3.toString();
        }
        com.google.android.gms.ads.internal.zzv.l();
        zzbpg.a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            optJSONObject4.toString();
        }
        this.c = jSONObject.optString(c0.x, null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
