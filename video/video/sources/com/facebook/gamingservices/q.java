package com.facebook.gamingservices;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class q {
    public static final String a = "q";
    public static final String b = "context_token_id";
    public static final String c = "game_request_id";
    public static final String d = "payload";
    public static final String e = "al_applink_data";
    public static final String f = "extras";
    public static final String g = "tournament_id";
    public static Map<String, String> h;

    @InterfaceC11300zs1
    public static String a() {
        Map<String, String> map = h;
        if (map == null || !map.containsKey(c)) {
            return null;
        }
        return h.get(c);
    }

    @InterfaceC11300zs1
    public static String b() {
        Map<String, String> map = h;
        if (map == null || !map.containsKey("payload")) {
            return null;
        }
        return h.get("payload");
    }

    @InterfaceC11300zs1
    public static String c() {
        Map<String, String> map = h;
        if (map == null || !map.containsKey("tournament_id")) {
            return null;
        }
        return h.get("tournament_id");
    }

    public static void d(String payloadString) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(payloadString);
            hashMap.put(c, jSONObject.optString(c));
            hashMap.put("payload", jSONObject.optString("payload"));
            hashMap.put("tournament_id", jSONObject.optString("tournament_id"));
            h = hashMap;
        } catch (JSONException e2) {
            Log.e(a, e2.toString(), e2);
        }
    }

    public static void e(Intent intent) {
        Bundle extras;
        Bundle bundle;
        HashMap hashMap = new HashMap();
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("al_applink_data") && (bundle = extras.getBundle("al_applink_data").getBundle("extras")) != null) {
            String string = bundle.getString(c);
            String string2 = bundle.getString("payload");
            String string3 = bundle.getString("context_token_id");
            String string4 = bundle.getString("tournament_id");
            if (string3 != null) {
                C2352n.h(new C2352n(string3));
            }
            hashMap.put(c, string);
            hashMap.put("payload", string2);
            hashMap.put("tournament_id", string4);
            h = hashMap;
        }
    }
}
