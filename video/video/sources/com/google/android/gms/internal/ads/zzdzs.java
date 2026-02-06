package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzdzs implements zzbog {
    @Override // com.google.android.gms.internal.ads.zzbog
    public final /* bridge */ /* synthetic */ JSONObject c(Object obj) throws JSONException {
        zzdzt zzdztVar = (zzdzt) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C9)).booleanValue()) {
            zzbvn zzbvnVar = zzdztVar.c;
            jSONObject2.put("ad_request_url", zzbvnVar.g());
            jSONObject2.put("ad_request_post_body", zzbvnVar.f());
        }
        zzbvn zzbvnVar2 = zzdztVar.c;
        jSONObject2.put("base_url", zzbvnVar2.d());
        jSONObject2.put("signals", zzdztVar.b);
        zzdzx zzdzxVar = zzdztVar.a;
        jSONObject3.put("body", zzdzxVar.c);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzbb.b().p(zzdzxVar.b));
        jSONObject3.put("response_code", zzdzxVar.a);
        jSONObject3.put("latency", zzdzxVar.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzbvnVar2.i());
        return jSONObject;
    }
}
