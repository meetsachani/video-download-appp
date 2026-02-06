package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdis extends zzdit {
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    @InterfaceC11300zs1
    public final JSONObject h;

    public zzdis(zzfbu zzfbuVar, JSONObject jSONObject) {
        super(zzfbuVar);
        this.b = com.google.android.gms.ads.internal.util.zzbs.h(jSONObject, "tracking_urls_and_actions", "active_view");
        this.c = com.google.android.gms.ads.internal.util.zzbs.l(false, jSONObject, "allow_pub_owned_ad_view");
        this.d = com.google.android.gms.ads.internal.util.zzbs.l(false, jSONObject, "attribution", "allow_pub_rendering");
        this.e = com.google.android.gms.ads.internal.util.zzbs.l(false, jSONObject, "enable_omid");
        this.g = com.google.android.gms.ads.internal.util.zzbs.b("", jSONObject, "watermark_overlay_png_base64");
        this.f = jSONObject.optJSONObject("overlay") != null;
        this.h = jSONObject.optJSONObject("omid_settings");
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final zzfcs a() {
        JSONObject jSONObject = this.h;
        if (jSONObject != null) {
            return new zzfcs(jSONObject);
        }
        return this.a.V;
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final String b() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    @InterfaceC11300zs1
    public final JSONObject c() {
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.a.z);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final boolean d() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final boolean e() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final boolean f() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzdit
    public final boolean g() {
        return this.f;
    }
}
