package com.google.android.gms.ads;

import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AdError {
    @InterfaceC5670cr1
    public static final String e = "undefined";
    public final int a;
    @InterfaceC5670cr1
    public final String b;
    @InterfaceC5670cr1
    public final String c;
    @InterfaceC11300zs1
    public final AdError d;

    public AdError(int i, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC11300zs1 AdError adError) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = adError;
    }

    @InterfaceC11300zs1
    public AdError a() {
        return this.d;
    }

    public int b() {
        return this.a;
    }

    @InterfaceC5670cr1
    public String c() {
        return this.c;
    }

    @InterfaceC5670cr1
    public String d() {
        return this.b;
    }

    @InterfaceC5670cr1
    public final com.google.android.gms.ads.internal.client.zze e() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        AdError adError = this.d;
        if (adError == null) {
            zzeVar = null;
        } else {
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.a, adError.b, adError.c, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.a, this.b, this.c, zzeVar, null);
    }

    @InterfaceC5670cr1
    public JSONObject f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.a);
        jSONObject.put("Message", this.b);
        jSONObject.put("Domain", this.c);
        AdError adError = this.d;
        if (adError == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", adError.f());
        return jSONObject;
    }

    @InterfaceC5670cr1
    public String toString() {
        try {
            return f().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public AdError(int i, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        this(i, str, str2, null);
    }
}
