package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import o.C9755tW1;
import o.C9998uW1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbvn {
    public final List a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;
    public final JSONObject h;
    public final String i;
    public final long j;
    public final long k;

    public zzbvn(JSONObject jSONObject) {
        List asList;
        this.f = jSONObject.optString("url");
        this.b = jSONObject.optString("base_uri");
        this.c = jSONObject.optString("post_parameters");
        this.d = m(jSONObject.optString("drt_include"));
        this.e = m(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString(C9755tW1.f875o);
        jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        if (optString == null) {
            asList = null;
        } else {
            asList = Arrays.asList(optString.split(","));
        }
        this.a = asList;
        this.g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.h = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.i = jSONObject.optString("pool_key");
        this.j = l(jSONObject.optString("start_time")).longValue();
        this.k = l(jSONObject.optString(C9998uW1.t0)).longValue();
    }

    public static Long l(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean m(String str) {
        if (str == null) {
            return false;
        }
        if (!str.equals("1") && !str.equals("true")) {
            return false;
        }
        return true;
    }

    public final int a() {
        return this.g;
    }

    public final long b() {
        return this.k;
    }

    public final long c() {
        return this.j;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.i;
    }

    public final String f() {
        return this.c;
    }

    public final String g() {
        return this.f;
    }

    public final List h() {
        return this.a;
    }

    public final JSONObject i() {
        return this.h;
    }

    public final boolean j() {
        return this.e;
    }

    public final boolean k() {
        return this.d;
    }
}
