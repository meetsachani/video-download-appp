package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import o.InterfaceC11300zs1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdqa {
    public static String a(@InterfaceC11300zs1 JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (b(optJSONArray2, str) && !b(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static boolean b(@InterfaceC11300zs1 JSONArray jSONArray, String str) {
        Pattern compile;
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                try {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.kb)).booleanValue()) {
                        compile = Pattern.compile(optString, 2);
                    } else {
                        compile = Pattern.compile(optString);
                    }
                } catch (PatternSyntaxException e) {
                    com.google.android.gms.ads.internal.zzv.t().x(e, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
                if (compile.matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }
}
