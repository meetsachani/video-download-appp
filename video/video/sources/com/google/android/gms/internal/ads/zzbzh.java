package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.S;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbzh {
    public String d;
    public String e;
    public long f;
    public JSONObject g;
    public boolean h;
    public boolean j;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final Map c = new HashMap();
    public final List i = new ArrayList();

    public zzbzh(String str, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.d = "";
        this.h = false;
        this.j = false;
        this.e = str;
        this.f = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.g = new JSONObject(str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Vb)).booleanValue() && j()) {
                    return;
                }
                if (this.g.optInt("status", -1) != 1) {
                    this.h = false;
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("App settings could not be fetched successfully.");
                    return;
                }
                this.h = true;
                this.d = this.g.optString("app_id");
                JSONArray optJSONArray2 = this.g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i2);
                        String optString = jSONObject.optString(S.A);
                        String optString2 = jSONObject.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                            if ("interstitial".equalsIgnoreCase(optString)) {
                                this.b.add(optString2);
                            } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                                this.c.put(optString2, new zzbpf(optJSONObject3));
                            }
                        }
                    }
                }
                JSONArray optJSONArray3 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray3 != null) {
                    for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                        this.a.add(optJSONArray3.optString(i3));
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Z6)).booleanValue() && (optJSONObject2 = this.g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                    for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                        this.i.add(optJSONArray.get(i4).toString());
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.v6)).booleanValue() && (optJSONObject = this.g.optJSONObject("common_settings")) != null) {
                    this.j = optJSONObject.optBoolean("is_prefetching_enabled", false);
                }
            } catch (JSONException e) {
                int i5 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.h("Exception occurred while processing app setting json", e);
                com.google.android.gms.ads.internal.zzv.t().x(e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    public final long a() {
        return this.f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final List d() {
        return this.i;
    }

    public final Map e() {
        return this.c;
    }

    public final JSONObject f() {
        return this.g;
    }

    public final void g(long j) {
        this.f = j;
    }

    public final boolean h() {
        return this.j;
    }

    public final boolean i() {
        return this.h;
    }

    public final boolean j() {
        if (!TextUtils.isEmpty(this.e) && this.g != null) {
            zzbcm zzbcmVar = zzbcv.Yb;
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).longValue();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Xb)).booleanValue() && !TextUtils.isEmpty(this.e)) {
                longValue = this.g.optLong("cache_ttl_sec", ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).longValue());
            }
            long a = com.google.android.gms.ads.internal.zzv.d().a();
            if (longValue >= 0) {
                long j = this.f;
                if (j > a || TimeUnit.MILLISECONDS.toSeconds(a - j) > longValue) {
                    this.a.clear();
                    this.b.clear();
                    this.c.clear();
                    this.d = "";
                    this.e = "";
                    this.g = null;
                    this.h = false;
                    this.i.clear();
                    this.j = false;
                    return true;
                }
            }
        }
        return false;
    }
}
