package com.google.android.gms.internal.ads;

import java.util.Map;
import o.C9811tl1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzbms {
    public static void a(zzbmt zzbmtVar, String str, Map map) {
        try {
            zzbmtVar.a(str, com.google.android.gms.ads.internal.client.zzbb.b().p(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Could not convert parameters to JSON.");
        }
    }

    public static void b(zzbmt zzbmtVar, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.b("Dispatching AFMA event: ".concat(sb2));
        zzbmtVar.w(sb.toString());
    }

    public static void c(zzbmt zzbmtVar, String str, String str2) {
        zzbmtVar.w(str + C9811tl1.c + str2 + ");");
    }

    public static void d(zzbmt zzbmtVar, String str, JSONObject jSONObject) {
        zzbmtVar.u(str, jSONObject.toString());
    }
}
