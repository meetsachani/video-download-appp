package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import o.InterfaceC5940dy1;
import o.InterfaceFutureC8411o11;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbkm implements zzbjw {
    public final Object a = new Object();
    public final Map b = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void a(Object obj, Map map) {
        String concat;
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            concat = "\n".concat(String.valueOf(str4));
        }
        synchronized (this.a) {
            try {
                zzbkl zzbklVar = (zzbkl) this.b.remove(str);
                if (zzbklVar == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Received result for unexpected method invocation: " + str);
                } else if (!TextUtils.isEmpty(str2)) {
                    zzbklVar.w(str3 + concat);
                } else if (str5 == null) {
                    zzbklVar.a(null);
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str5);
                        if (com.google.android.gms.ads.internal.util.zze.m()) {
                            com.google.android.gms.ads.internal.util.zze.k("Result GMSG: " + jSONObject.toString(2));
                        }
                        zzbklVar.a(jSONObject);
                    } catch (JSONException e) {
                        zzbklVar.w(e.getMessage());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceFutureC8411o11 b(zzbnd zzbndVar, String str, JSONObject jSONObject) {
        zzcaf zzcafVar = new zzcaf();
        com.google.android.gms.ads.internal.zzv.v();
        String uuid = UUID.randomUUID().toString();
        c(uuid, new zzbkk(this, zzcafVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbndVar.c1(str, jSONObject2);
            return zzcafVar;
        } catch (Exception e) {
            zzcafVar.d(e);
            return zzcafVar;
        }
    }

    public final void c(String str, zzbkl zzbklVar) {
        synchronized (this.a) {
            this.b.put(str, zzbklVar);
        }
    }
}
