package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class zzdth {
    @InterfaceC11300zs1
    public Long a;
    public final String b;
    @InterfaceC11300zs1
    public String c;
    @InterfaceC11300zs1
    public Integer d;
    @InterfaceC11300zs1
    public String e;
    @InterfaceC11300zs1
    public Integer f;

    public /* synthetic */ zzdth(String str, zzdti zzdtiVar) {
        this.b = str;
    }

    public static /* bridge */ /* synthetic */ String a(zzdth zzdthVar) {
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.na);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", zzdthVar.a);
            jSONObject.put("eventCategory", zzdthVar.b);
            jSONObject.putOpt("event", zzdthVar.c);
            jSONObject.putOpt("errorCode", zzdthVar.d);
            jSONObject.putOpt("rewardType", zzdthVar.e);
            jSONObject.putOpt("rewardAmount", zzdthVar.f);
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Could not convert parameters to JSON.");
        }
        String jSONObject2 = jSONObject.toString();
        return str + "(\"h5adsEvent\"," + jSONObject2 + ");";
    }
}
