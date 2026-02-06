package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.S;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import o.InterfaceFutureC8411o11;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzefu implements zzefo {
    public final zzdgw a;
    public final zzgdj b;
    public final zzdlh c;
    public final zzfdo d;
    public final zzdny e;
    public final zzdrx f;
    public final VersionInfoParcel g;
    public final Context h;
    public final zzbxr i;

    public zzefu(zzdgw zzdgwVar, zzgdj zzgdjVar, zzdlh zzdlhVar, zzfdo zzfdoVar, zzdny zzdnyVar, zzdrx zzdrxVar, VersionInfoParcel versionInfoParcel, Context context, zzbxr zzbxrVar) {
        this.g = versionInfoParcel;
        this.h = context;
        this.i = zzbxrVar;
        this.a = zzdgwVar;
        this.b = zzgdjVar;
        this.c = zzdlhVar;
        this.d = zzfdoVar;
        this.e = zzdnyVar;
        this.f = zzdrxVar;
    }

    public static /* synthetic */ zzdij c(zzefu zzefuVar, InterfaceFutureC8411o11 interfaceFutureC8411o11, InterfaceFutureC8411o11 interfaceFutureC8411o112, zzfcg zzfcgVar, zzfbu zzfbuVar, JSONObject jSONObject, com.google.android.gms.ads.internal.zzb zzbVar, zzbxv zzbxvVar) {
        zzdio zzdioVar = (zzdio) interfaceFutureC8411o11.get();
        zzdns zzdnsVar = (zzdns) interfaceFutureC8411o112.get();
        zzbcm zzbcmVar = zzbcv.t2;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzefuVar.f.a().putLong(zzdrl.RENDERING_WEBVIEW_CREATION_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzdip c = zzefuVar.a.c(new zzcrn(zzfcgVar, zzfbuVar, null), new zzdja(zzdioVar), new zzdhk(jSONObject, zzdnsVar, zzbVar, zzbxvVar));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            long a = com.google.android.gms.ads.internal.zzv.d().a();
            zzdrx zzdrxVar = zzefuVar.f;
            zzdrxVar.a().putLong(zzdrl.RENDERING_AD_COMPONENT_CREATION_END.e(), a);
            zzdrxVar.a().putLong(zzdrl.RENDERING_CONFIGURE_WEBVIEW_START.e(), a);
        }
        c.j().b();
        c.k().a(zzdnsVar);
        c.i().c(zzdioVar.f0());
        c.l().a(zzefuVar.e, zzdioVar.d0());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzefuVar.f.a().putLong(zzdrl.RENDERING_CONFIGURE_WEBVIEW_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        return c.h();
    }

    public static /* synthetic */ InterfaceFutureC8411o11 d(zzefu zzefuVar, zzfcg zzfcgVar, zzfbu zzfbuVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgcy.g(new zzdwf(3));
        }
        int i = zzfcgVar.a.a.k;
        if (i > 1) {
            int length = jSONArray.length();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.u2)).booleanValue()) {
                zzefuVar.f.d("nsl", String.valueOf(length));
            }
            zzefuVar.d.c(Math.min(length, i));
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 < length) {
                    arrayList.add(zzefuVar.g(zzfcgVar, zzfbuVar, jSONArray.getJSONObject(i2)));
                } else {
                    arrayList.add(zzgcy.g(new zzdwf(3)));
                }
            }
            return zzgcy.h(arrayList);
        }
        return zzgcy.m(zzefuVar.g(zzfcgVar, zzfbuVar, jSONArray.getJSONObject(0)), new zzfur() { // from class: com.google.android.gms.internal.ads.zzeft
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                return Collections.singletonList(zzgcy.h((zzdij) obj));
            }
        }, zzefuVar.b);
    }

    public static /* synthetic */ InterfaceFutureC8411o11 e(final zzefu zzefuVar, zzfbu zzfbuVar, final zzdns zzdnsVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s2)).booleanValue()) {
            zzefuVar.f.a().putLong(zzdrl.RENDERING_NATIVE_ADS_PREPROCESS_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.W8)).booleanValue() && PlatformVersion.q()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfbuVar.s.c);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgcy.n(zzdnsVar.g("google.afma.nativeAds.preProcessJson", jSONObject2), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzefq
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzefu.f(zzefu.this, zzdnsVar, (JSONObject) obj);
            }
        }, zzefuVar.b);
    }

    public static /* synthetic */ InterfaceFutureC8411o11 f(zzefu zzefuVar, zzdns zzdnsVar, JSONObject jSONObject) {
        zzefuVar.d.b(zzgcy.h(zzdnsVar));
        if (jSONObject.optBoolean("success")) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s2)).booleanValue()) {
                zzefuVar.f.a().putLong(zzdrl.RENDERING_NATIVE_ADS_PREPROCESS_END.e(), com.google.android.gms.ads.internal.zzv.d().a());
            }
            return zzgcy.h(jSONObject.getJSONObject(S.B).getJSONArray("ads"));
        }
        throw new zzboc("process json failed");
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final boolean a(zzfcg zzfcgVar, zzfbu zzfbuVar) {
        zzfbz zzfbzVar = zzfbuVar.s;
        if (zzfbzVar != null && zzfbzVar.c != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzedf
    public final InterfaceFutureC8411o11 b(final zzfcg zzfcgVar, final zzfbu zzfbuVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s2)).booleanValue()) {
            this.f.a().putLong(zzdrl.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        InterfaceFutureC8411o11 a = this.d.a();
        zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzefr
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzefu.e(zzefu.this, zzfbuVar, (zzdns) obj);
            }
        };
        zzgdj zzgdjVar = this.b;
        return zzgcy.n(zzgcy.n(a, zzgcfVar, zzgdjVar), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzefs
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzefu.d(zzefu.this, zzfcgVar, zzfbuVar, (JSONArray) obj);
            }
        }, zzgdjVar);
    }

    public final InterfaceFutureC8411o11 g(final zzfcg zzfcgVar, final zzfbu zzfbuVar, final JSONObject jSONObject) {
        com.google.android.gms.ads.internal.zzb zzbVar;
        zzbxv zzbxvVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.t2)).booleanValue()) {
            this.f.a().putLong(zzdrl.RENDERING_WEBVIEW_CREATION_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        final InterfaceFutureC8411o11 a = this.d.a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Hd)).booleanValue()) {
            Context context = this.h;
            zzbxv a2 = zzcvo.a(context, this.g, zzfbuVar, this.i);
            zzbVar = new com.google.android.gms.ads.internal.zzb(context, a2, null);
            zzbxvVar = a2;
        } else {
            zzbVar = new com.google.android.gms.ads.internal.zzb(this.h, null, null);
            zzbxvVar = null;
        }
        final com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar;
        final zzbxv zzbxvVar2 = zzbxvVar;
        final InterfaceFutureC8411o11 d = this.c.d(zzfcgVar, zzfbuVar, jSONObject, zzbVar2, zzbxvVar2);
        return zzgcy.c(a, d).a(new Callable() { // from class: com.google.android.gms.internal.ads.zzefp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzefu.c(zzefu.this, d, a, zzfcgVar, zzfbuVar, jSONObject, zzbVar2, zzbxvVar2);
            }
        }, this.b);
    }
}
