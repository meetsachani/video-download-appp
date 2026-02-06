package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcgm {
    public static final Pattern a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    public static final Pattern b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    @InterfaceC11300zs1
    public static String a(zzfbu zzfbuVar) {
        zzecw zzecwVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z5)).booleanValue() && zzfbuVar.T) {
            zzfcs zzfcsVar = zzfbuVar.V;
            if (zzfcsVar.b() && zzfbuVar.b != 4) {
                if (zzfcsVar.c() == 1) {
                    zzecwVar = zzecw.VIDEO;
                } else {
                    zzecwVar = zzecw.HTML_DISPLAY;
                }
                String str = zzfbuVar.l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", zzecwVar.toString());
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.h("Unable to build OMID ENV JSON", e);
                }
            }
        }
        return null;
    }

    public static String b(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(end));
        } else {
            if (!b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
