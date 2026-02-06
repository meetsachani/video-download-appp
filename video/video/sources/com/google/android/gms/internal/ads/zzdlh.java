package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdlh {
    public final zzgdj a;
    public final zzdlw b;
    public final zzdmb c;
    public final zzdrx d;

    public zzdlh(zzgdj zzgdjVar, zzdlw zzdlwVar, zzdmb zzdmbVar, zzdrx zzdrxVar) {
        this.a = zzgdjVar;
        this.b = zzdlwVar;
        this.c = zzdmbVar;
        this.d = zzdrxVar;
    }

    public static /* synthetic */ zzdio a(zzdlh zzdlhVar, InterfaceFutureC8411o11 interfaceFutureC8411o11, InterfaceFutureC8411o11 interfaceFutureC8411o112, InterfaceFutureC8411o11 interfaceFutureC8411o113, InterfaceFutureC8411o11 interfaceFutureC8411o114, InterfaceFutureC8411o11 interfaceFutureC8411o115, JSONObject jSONObject, InterfaceFutureC8411o11 interfaceFutureC8411o116, InterfaceFutureC8411o11 interfaceFutureC8411o117, InterfaceFutureC8411o11 interfaceFutureC8411o118, InterfaceFutureC8411o11 interfaceFutureC8411o119, InterfaceFutureC8411o11 interfaceFutureC8411o1110) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s2)).booleanValue()) {
            zzdlhVar.d.a().putLong(zzdrl.RENDERING_NATIVE_ASSETS_LOADING_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzdio zzdioVar = (zzdio) interfaceFutureC8411o11.get();
        zzdioVar.p((List) interfaceFutureC8411o112.get());
        zzdioVar.m((zzbgg) interfaceFutureC8411o113.get());
        zzdioVar.q((zzbgg) interfaceFutureC8411o114.get());
        zzdioVar.j((zzbfz) interfaceFutureC8411o115.get());
        zzdioVar.s(zzdlw.l(jSONObject));
        zzdioVar.l(zzdlw.k(jSONObject));
        zzcfb zzcfbVar = (zzcfb) interfaceFutureC8411o116.get();
        if (zzcfbVar != null) {
            zzdioVar.E(zzcfbVar);
            zzdioVar.D(zzcfbVar.U());
            zzdioVar.C(zzcfbVar.r());
        }
        zzdioVar.Q().putAll((Bundle) interfaceFutureC8411o117.get());
        zzcfb zzcfbVar2 = (zzcfb) interfaceFutureC8411o118.get();
        if (zzcfbVar2 != null) {
            zzdioVar.o(zzcfbVar2);
            zzdioVar.F(zzcfbVar2.U());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D5)).booleanValue() && !f(jSONObject)) {
            zzdioVar.u(interfaceFutureC8411o119);
            zzdioVar.x(new zzcaf());
        } else {
            zzcfb zzcfbVar3 = (zzcfb) interfaceFutureC8411o119.get();
            if (zzcfbVar3 != null) {
                zzdioVar.t(zzcfbVar3);
            }
        }
        for (zzdma zzdmaVar : (List) interfaceFutureC8411o1110.get()) {
            if (zzdmaVar.a != 1) {
                zzdioVar.n(zzdmaVar.b, zzdmaVar.d);
            } else {
                zzdioVar.z(zzdmaVar.b, zzdmaVar.c);
            }
        }
        return zzdioVar;
    }

    public static /* synthetic */ zzdio b(zzdlh zzdlhVar, zzfcg zzfcgVar, zzfbu zzfbuVar, JSONObject jSONObject) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x2)).booleanValue()) {
            zzdlhVar.d.a().putLong(zzdrl.NATIVE_ASSETS_LOADING_BASIC_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzdio zzdioVar = new zzdio();
        zzdioVar.B(jSONObject.optInt("template_id", -1));
        zzdioVar.k(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if (optJSONObject != null) {
            str = optJSONObject.optString("omid_partner_name");
        } else {
            str = null;
        }
        zzdioVar.v(str);
        zzfcp zzfcpVar = zzfcgVar.a.a;
        if (zzfcpVar.g.contains(Integer.toString(zzdioVar.P()))) {
            if (zzdioVar.P() == 3) {
                if (zzdioVar.a() != null) {
                    if (!zzfcpVar.h.contains(zzdioVar.a())) {
                        throw new zzegy(1, "Unexpected custom template id in the response.");
                    }
                } else {
                    throw new zzegy(1, "No custom template id for custom template ad response.");
                }
            }
            zzdioVar.y(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", null);
            if (zzfbuVar.M) {
                com.google.android.gms.ads.internal.zzv.v();
                optString = com.google.android.gms.ads.internal.util.zzs.f0() + " : " + optString;
            }
            zzdioVar.z("headline", optString);
            zzdioVar.z("body", jSONObject.optString("body", null));
            zzdioVar.z("call_to_action", jSONObject.optString("call_to_action", null));
            zzdioVar.z("store", jSONObject.optString("store", null));
            zzdioVar.z(FirebaseAnalytics.Param.B, jSONObject.optString(FirebaseAnalytics.Param.B, null));
            zzdioVar.z("advertiser", jSONObject.optString("advertiser", null));
            return zzdioVar;
        }
        throw new zzegy(1, "Invalid template ID: " + zzdioVar.P());
    }

    public static final boolean f(JSONObject jSONObject) {
        if (jSONObject.optInt("template_id") == 3) {
            return true;
        }
        return false;
    }

    public final InterfaceFutureC8411o11 d(final zzfcg zzfcgVar, final zzfbu zzfbuVar, final JSONObject jSONObject, @InterfaceC11300zs1 com.google.android.gms.ads.internal.zzb zzbVar, @InterfaceC11300zs1 zzbxv zzbxvVar) {
        InterfaceFutureC8411o11 h;
        JSONArray optJSONArray;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s2)).booleanValue()) {
            this.d.a().putLong(zzdrl.RENDERING_NATIVE_ASSETS_LOADING_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        final InterfaceFutureC8411o11 I2 = this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzdle
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdlh.b(zzdlh.this, zzfcgVar, zzfbuVar, jSONObject);
            }
        });
        e(I2, zzdrl.NATIVE_ASSETS_LOADING_BASIC_END);
        zzdlw zzdlwVar = this.b;
        final InterfaceFutureC8411o11 f = zzdlwVar.f(jSONObject, "images", zzdrl.NATIVE_ASSETS_LOADING_IMAGE_START);
        e(f, zzdrl.NATIVE_ASSETS_LOADING_IMAGE_END);
        zzfbx zzfbxVar = zzfcgVar.b.b;
        final InterfaceFutureC8411o11 g = zzdlwVar.g(jSONObject, "images", zzfbuVar, zzfbxVar, zzbVar, zzbxvVar);
        e(g, zzdrl.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_END);
        final InterfaceFutureC8411o11 e = zzdlwVar.e(jSONObject, "secondary_image", zzdrl.NATIVE_ASSETS_LOADING_LOGO_START);
        e(e, zzdrl.NATIVE_ASSETS_LOADING_LOGO_END);
        final InterfaceFutureC8411o11 e2 = zzdlwVar.e(jSONObject, "app_icon", zzdrl.NATIVE_ASSETS_LOADING_ICON_START);
        e(e2, zzdrl.NATIVE_ASSETS_LOADING_ICON_END);
        final InterfaceFutureC8411o11 d = zzdlwVar.d(jSONObject, "attribution", zzdrl.NATIVE_ASSETS_LOADING_ATTRIBUTION_START);
        e(d, zzdrl.NATIVE_ASSETS_LOADING_ATTRIBUTION_END);
        final InterfaceFutureC8411o11 j = zzdlwVar.j(jSONObject, zzfbuVar, zzfbxVar, zzbVar, zzbxvVar);
        e(j, zzdrl.NATIVE_ASSETS_LOADING_VIDEO_END);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.jd)).booleanValue() && jSONObject.has("video")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject.has("flags") && (optJSONArray = optJSONObject.optJSONArray("flags")) != null) {
                int i = 0;
                while (true) {
                    if (i >= optJSONArray.length()) {
                        break;
                    }
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                    if (optJSONObject2 != null && optJSONObject2.optString("key").equals("afma_video_player_type")) {
                        try {
                            if (Integer.parseInt(optJSONObject2.optString("value")) == 3) {
                                h = this.b.h(j);
                                e(h, zzdrl.NATIVE_ASSETS_LOADING_MEDIA_END);
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
        h = zzgcy.h(new Bundle());
        final InterfaceFutureC8411o11 a = this.c.a(jSONObject, "custom_assets");
        e(a, zzdrl.NATIVE_ASSETS_LOADING_CUSTOM_END);
        final InterfaceFutureC8411o11 i2 = this.b.i(jSONObject, zzbVar, zzbxvVar);
        e(i2, zzdrl.NATIVE_ASSETS_LOADING_OMID_END);
        ArrayList arrayList = new ArrayList();
        arrayList.add(I2);
        arrayList.add(f);
        arrayList.add(g);
        arrayList.add(e);
        arrayList.add(e2);
        arrayList.add(d);
        arrayList.add(j);
        arrayList.add(h);
        arrayList.add(a);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.D5)).booleanValue() || f(jSONObject)) {
            arrayList.add(i2);
        }
        final InterfaceFutureC8411o11 interfaceFutureC8411o11 = h;
        return zzgcy.a(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.zzdlf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzdlh.a(zzdlh.this, I2, f, e2, e, d, jSONObject, j, interfaceFutureC8411o11, g, i2, a);
            }
        }, this.a);
    }

    public final InterfaceFutureC8411o11 e(InterfaceFutureC8411o11 interfaceFutureC8411o11, zzdrl zzdrlVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x2)).booleanValue()) {
            zzgcy.r(interfaceFutureC8411o11, new zzdlg(this, zzdrlVar), this.a);
        }
        return interfaceFutureC8411o11;
    }
}
