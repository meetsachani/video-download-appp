package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbpf {
    public final List a;

    public zzbpf(JSONObject jSONObject) throws JSONException {
        if (com.google.android.gms.ads.internal.util.client.zzo.j(2)) {
            com.google.android.gms.ads.internal.util.zze.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                zzbpe zzbpeVar = new zzbpe(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(zzbpeVar.c);
                arrayList.add(zzbpeVar);
                if (i < 0) {
                    Iterator it = zzbpeVar.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject(RemoteConfigComponent.f388o);
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.zzv.l();
            zzbpg.a(optJSONObject, "click_urls");
            com.google.android.gms.ads.internal.zzv.l();
            zzbpg.a(optJSONObject, "imp_urls");
            com.google.android.gms.ads.internal.zzv.l();
            zzbpg.a(optJSONObject, "downloaded_imp_urls");
            com.google.android.gms.ads.internal.zzv.l();
            zzbpg.a(optJSONObject, "nofill_urls");
            com.google.android.gms.ads.internal.zzv.l();
            zzbpg.a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            zzbwj.m0(optJSONObject.optJSONArray("rewards"));
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
