package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzv;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AdapterResponseInfo {
    public final zzv a;
    @InterfaceC11300zs1
    public final AdError b;

    public AdapterResponseInfo(zzv zzvVar) {
        this.a = zzvVar;
        com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.Z;
        this.b = zzeVar == null ? null : zzeVar.m0();
    }

    @InterfaceC11300zs1
    public static AdapterResponseInfo i(@InterfaceC11300zs1 zzv zzvVar) {
        if (zzvVar != null) {
            return new AdapterResponseInfo(zzvVar);
        }
        return null;
    }

    @InterfaceC11300zs1
    public AdError a() {
        return this.b;
    }

    @InterfaceC5670cr1
    public String b() {
        return this.a.a1;
    }

    @InterfaceC5670cr1
    public String c() {
        return this.a.c1;
    }

    @InterfaceC5670cr1
    public String d() {
        return this.a.b1;
    }

    @InterfaceC5670cr1
    public String e() {
        return this.a.Z0;
    }

    @InterfaceC5670cr1
    public String f() {
        return this.a.X;
    }

    @InterfaceC5670cr1
    public Bundle g() {
        return this.a.Y0;
    }

    public long h() {
        return this.a.Y;
    }

    @InterfaceC5670cr1
    public final JSONObject j() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        zzv zzvVar = this.a;
        jSONObject.put("Adapter", zzvVar.X);
        jSONObject.put("Latency", zzvVar.Y);
        String e = e();
        if (e == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", e);
        }
        String b = b();
        if (b == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", b);
        }
        String d = d();
        if (d == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", d);
        }
        String c = c();
        if (c == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", c);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = zzvVar.Y0;
        for (String str : bundle.keySet()) {
            jSONObject2.put(str, bundle.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.b;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", adError.f());
        return jSONObject;
    }

    @InterfaceC5670cr1
    public String toString() {
        try {
            return j().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
