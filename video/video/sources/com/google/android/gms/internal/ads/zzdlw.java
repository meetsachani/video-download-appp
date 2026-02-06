package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;
import o.S92;
import o.SQ0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdlw {
    public final Context a;
    public final zzdlc b;
    public final zzavl c;
    public final VersionInfoParcel d;
    public final com.google.android.gms.ads.internal.zza e;
    public final zzbbt f;
    public final Executor g;
    public final zzbfv h;
    public final zzdmo i;
    public final zzdpd j;
    public final ScheduledExecutorService k;
    public final zzdny l;
    public final zzdsd m;
    public final zzfjr n;

    /* renamed from: o  reason: collision with root package name */
    public final zzebt f267o;
    public final zzece p;
    public final zzfct q;
    public final zzdrx r;

    public zzdlw(Context context, zzdlc zzdlcVar, zzavl zzavlVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbbt zzbbtVar, Executor executor, zzfcp zzfcpVar, zzdmo zzdmoVar, zzdpd zzdpdVar, ScheduledExecutorService scheduledExecutorService, zzdsd zzdsdVar, zzfjr zzfjrVar, zzebt zzebtVar, zzdny zzdnyVar, zzece zzeceVar, zzfct zzfctVar, zzdrx zzdrxVar) {
        this.a = context;
        this.b = zzdlcVar;
        this.c = zzavlVar;
        this.d = versionInfoParcel;
        this.e = zzaVar;
        this.f = zzbbtVar;
        this.g = executor;
        this.h = zzfcpVar.i;
        this.i = zzdmoVar;
        this.j = zzdpdVar;
        this.k = scheduledExecutorService;
        this.m = zzdsdVar;
        this.n = zzfjrVar;
        this.f267o = zzebtVar;
        this.l = zzdnyVar;
        this.p = zzeceVar;
        this.q = zzfctVar;
        this.r = zzdrxVar;
    }

    public static /* synthetic */ zzbfq a(zzdlw zzdlwVar, JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer s = s(jSONObject, "bg_color");
        Integer s2 = s(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", S92.y);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzbfq(optString, list, s, s2, num, optInt3 + optInt2, zzdlwVar.h.Z0, optBoolean);
    }

    public static /* synthetic */ InterfaceFutureC8411o11 b(zzdlw zzdlwVar, String str, zzbxv zzbxvVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) {
        com.google.android.gms.ads.internal.zzv.b();
        Context context = zzdlwVar.a;
        zzece zzeceVar = zzdlwVar.p;
        zzcfb a = zzcfo.a(context, zzcgv.a(), "native-omid", false, false, zzdlwVar.c, null, zzdlwVar.d, null, null, zzdlwVar.e, zzdlwVar.f, null, null, zzeceVar, zzdlwVar.q, zzdlwVar.m);
        final zzcae e = zzcae.e(a);
        a.M().f1(new zzcgr() { // from class: com.google.android.gms.internal.ads.zzdln
            @Override // com.google.android.gms.internal.ads.zzcgr
            public final void a(boolean z, int i, String str2, String str3) {
                zzcae.this.f();
            }
        });
        a.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Hd)).booleanValue()) {
            if (zzbxvVar != null) {
                a.M().S0(zzbxvVar);
            }
            a.M().O0(zzbVar);
        }
        return e;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(zzdlw zzdlwVar, com.google.android.gms.ads.internal.client.zzr zzrVar, zzfbu zzfbuVar, zzfbx zzfbxVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxv zzbxvVar, String str, String str2, Object obj) {
        com.google.android.gms.ads.internal.zzb zzbVar2;
        zzbxv zzbxvVar2;
        zzcfb a = zzdlwVar.j.a(zzrVar, zzfbuVar, zzfbxVar);
        final zzcae e = zzcae.e(a);
        zzdnv b = zzdlwVar.l.b();
        zzcgt M = a.M();
        zzbcm zzbcmVar = zzbcv.Hd;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzbVar2 = new com.google.android.gms.ads.internal.zzb(zzdlwVar.a, null, null);
        } else {
            zzbVar2 = zzbVar;
        }
        if (true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
            zzbxvVar2 = null;
        } else {
            zzbxvVar2 = zzbxvVar;
        }
        M.e1(b, b, b, b, b, false, null, zzbVar2, null, zzbxvVar2, zzdlwVar.f267o, zzdlwVar.n, zzdlwVar.m, null, b, null, null, null, null);
        a.r1("/getNativeAdViewSignals", zzbjv.s);
        a.r1("/getNativeClickMeta", zzbjv.t);
        a.M().I0(true);
        a.M().f1(new zzcgr() { // from class: com.google.android.gms.internal.ads.zzdls
            @Override // com.google.android.gms.internal.ads.zzcgr
            public final void a(boolean z, int i, String str3, String str4) {
                zzcae zzcaeVar = zzcae.this;
                if (z) {
                    zzcaeVar.f();
                    return;
                }
                zzcaeVar.d(new zzegy(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        a.h1(str, str2, null);
        return e;
    }

    @InterfaceC11300zs1
    public static final com.google.android.gms.ads.internal.client.zzev k(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("default_reason")) != null) {
            return t(optJSONObject);
        }
        return null;
    }

    public static final List l(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfyc.F();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                com.google.android.gms.ads.internal.client.zzev t = t(optJSONArray.optJSONObject(i));
                if (t != null) {
                    arrayList.add(t);
                }
            }
            return zzfyc.B(arrayList);
        }
        return zzfyc.F();
    }

    public static InterfaceFutureC8411o11 n(InterfaceFutureC8411o11 interfaceFutureC8411o11, Object obj) {
        return zzgcy.f(interfaceFutureC8411o11, Exception.class, new zzgcf(null) { // from class: com.google.android.gms.internal.ads.zzdlo
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj2) {
                com.google.android.gms.ads.internal.util.zze.l("Error during loading assets.", (Exception) obj2);
                return zzgcy.h(null);
            }
        }, zzcaa.g);
    }

    public static InterfaceFutureC8411o11 o(boolean z, final InterfaceFutureC8411o11 interfaceFutureC8411o11, Object obj) {
        if (z) {
            return zzgcy.n(interfaceFutureC8411o11, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdlq
                @Override // com.google.android.gms.internal.ads.zzgcf
                public final InterfaceFutureC8411o11 b(Object obj2) {
                    if (obj2 != null) {
                        return InterfaceFutureC8411o11.this;
                    }
                    return zzgcy.g(new zzegy(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcaa.g);
        }
        return n(interfaceFutureC8411o11, null);
    }

    @InterfaceC11300zs1
    public static Integer s(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    @InterfaceC11300zs1
    public static final com.google.android.gms.ads.internal.client.zzev t(@InterfaceC11300zs1 JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString(SQ0.n);
            String optString2 = jSONObject.optString("ping_url");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                return new com.google.android.gms.ads.internal.client.zzev(optString, optString2);
            }
            return null;
        }
        return null;
    }

    public final InterfaceFutureC8411o11 d(JSONObject jSONObject, String str, zzdrl zzdrlVar) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgcy.h(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return o(optJSONObject.optBoolean("require"), zzgcy.m(q(optJSONArray, false, true, zzdrlVar), new zzfur() { // from class: com.google.android.gms.internal.ads.zzdlr
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                return zzdlw.a(zzdlw.this, optJSONObject, (List) obj);
            }
        }, this.g), null);
    }

    public final InterfaceFutureC8411o11 e(JSONObject jSONObject, String str, @InterfaceC11300zs1 zzdrl zzdrlVar) {
        return p(jSONObject.optJSONObject(str), this.h.Y, zzdrlVar);
    }

    public final InterfaceFutureC8411o11 f(JSONObject jSONObject, String str, zzdrl zzdrlVar) {
        zzbfv zzbfvVar = this.h;
        return q(jSONObject.optJSONArray("images"), zzbfvVar.Y, zzbfvVar.Y0, zzdrlVar);
    }

    public final InterfaceFutureC8411o11 g(JSONObject jSONObject, String str, final zzfbu zzfbuVar, final zzfbx zzfbxVar, @InterfaceC11300zs1 final com.google.android.gms.ads.internal.zzb zzbVar, @InterfaceC11300zs1 final zzbxv zzbxvVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.pa)).booleanValue()) {
            return zzgcy.h(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject == null) {
                return zzgcy.h(null);
            }
            final String optString = optJSONObject.optString("base_url");
            final String optString2 = optJSONObject.optString("html");
            final com.google.android.gms.ads.internal.client.zzr m = m(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
            if (!TextUtils.isEmpty(optString2)) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x2)).booleanValue()) {
                    this.r.a().putLong(zzdrl.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
                }
                final InterfaceFutureC8411o11 n = zzgcy.n(zzgcy.h(null), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdlt
                    @Override // com.google.android.gms.internal.ads.zzgcf
                    public final InterfaceFutureC8411o11 b(Object obj) {
                        return zzdlw.c(zzdlw.this, m, zzfbuVar, zzfbxVar, zzbVar, zzbxvVar, optString, optString2, obj);
                    }
                }, zzcaa.f);
                return zzgcy.n(n, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdlk
                    @Override // com.google.android.gms.internal.ads.zzgcf
                    public final InterfaceFutureC8411o11 b(Object obj) {
                        if (((zzcfb) obj) != null) {
                            return InterfaceFutureC8411o11.this;
                        }
                        throw new zzegy(1, "Retrieve Web View from image ad response failed.");
                    }
                }, zzcaa.g);
            }
            return zzgcy.h(null);
        }
        return zzgcy.h(null);
    }

    public final InterfaceFutureC8411o11 h(InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x2)).booleanValue()) {
            this.r.a().putLong(zzdrl.NATIVE_ASSETS_LOADING_MEDIA_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        zzcaf zzcafVar = new zzcaf();
        zzgcy.r(interfaceFutureC8411o11, new zzdlv(this, zzcafVar), zzcaa.f);
        return zzcafVar;
    }

    public final InterfaceFutureC8411o11 i(JSONObject jSONObject, @InterfaceC11300zs1 final com.google.android.gms.ads.internal.zzb zzbVar, @InterfaceC11300zs1 final zzbxv zzbxvVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzgcy.h(null);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if (optJSONObject == null) {
            return zzgcy.h(null);
        }
        final String optString = optJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(optString)) {
            return zzgcy.h(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x2)).booleanValue()) {
            this.r.a().putLong(zzdrl.NATIVE_ASSETS_LOADING_OMID_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        return zzgcy.n(zzgcy.h(null), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdll
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzdlw.b(zzdlw.this, optString, zzbxvVar, zzbVar, obj);
            }
        }, zzcaa.f);
    }

    public final InterfaceFutureC8411o11 j(JSONObject jSONObject, zzfbu zzfbuVar, zzfbx zzfbxVar, @InterfaceC11300zs1 com.google.android.gms.ads.internal.zzb zzbVar, @InterfaceC11300zs1 zzbxv zzbxvVar) {
        InterfaceFutureC8411o11 d;
        zzdlw zzdlwVar;
        JSONObject h = com.google.android.gms.ads.internal.util.zzbs.h(jSONObject, "html_containers", "instream");
        if (h == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzgcy.h(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.oa)).booleanValue() && optJSONObject.has("html")) {
                z = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z) {
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Required field 'vast_xml' or 'html' is missing");
                    return zzgcy.h(null);
                }
            } else if (!z) {
                d = this.i.d(optJSONObject, zzbVar, zzbxvVar);
                zzdlwVar = this;
                zzbcm zzbcmVar = zzbcv.c4;
                return n(zzgcy.o(d, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).intValue(), TimeUnit.SECONDS, zzdlwVar.k), null);
            }
            zzdlwVar = this;
            d = zzdlwVar.r(optJSONObject, zzfbuVar, zzfbxVar, zzbVar, zzbxvVar);
            zzbcm zzbcmVar2 = zzbcv.c4;
            return n(zzgcy.o(d, ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar2)).intValue(), TimeUnit.SECONDS, zzdlwVar.k), null);
        }
        return r(h, zzfbuVar, zzfbxVar, zzbVar, zzbxvVar);
    }

    public final com.google.android.gms.ads.internal.client.zzr m(int i, int i2) {
        if (i == 0) {
            if (i2 != 0) {
                i = 0;
            } else {
                return com.google.android.gms.ads.internal.client.zzr.E0();
            }
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.a, new AdSize(i, i2));
    }

    public final InterfaceFutureC8411o11 p(@InterfaceC11300zs1 JSONObject jSONObject, boolean z, @InterfaceC11300zs1 zzdrl zzdrlVar) {
        if (jSONObject == null) {
            return zzgcy.h(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzgcy.h(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x2)).booleanValue() && zzdrlVar != null) {
            this.r.a().putLong(zzdrlVar.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzgcy.h(new zzbft(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return o(jSONObject.optBoolean("require"), zzgcy.m(this.b.b(optString, optDouble, optBoolean), new zzfur() { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // com.google.android.gms.internal.ads.zzfur
            public final Object apply(Object obj) {
                return new zzbft(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(optString), optDouble, optInt, optInt2);
            }
        }, this.g), null);
    }

    public final InterfaceFutureC8411o11 q(@InterfaceC11300zs1 JSONArray jSONArray, boolean z, boolean z2, zzdrl zzdrlVar) {
        int i;
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            if (z2) {
                i = jSONArray.length();
            } else {
                i = 1;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x2)).booleanValue()) {
                this.r.a().putLong(zzdrlVar.e(), com.google.android.gms.ads.internal.zzv.d().a());
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(p(jSONArray.optJSONObject(i2), z, null));
            }
            return zzgcy.m(zzgcy.d(arrayList), new zzfur() { // from class: com.google.android.gms.internal.ads.zzdlj
                @Override // com.google.android.gms.internal.ads.zzfur
                public final Object apply(Object obj) {
                    ArrayList arrayList2 = new ArrayList();
                    for (zzbft zzbftVar : (List) obj) {
                        if (zzbftVar != null) {
                            arrayList2.add(zzbftVar);
                        }
                    }
                    return arrayList2;
                }
            }, this.g);
        }
        return zzgcy.h(Collections.EMPTY_LIST);
    }

    public final InterfaceFutureC8411o11 r(JSONObject jSONObject, zzfbu zzfbuVar, zzfbx zzfbxVar, @InterfaceC11300zs1 com.google.android.gms.ads.internal.zzb zzbVar, @InterfaceC11300zs1 zzbxv zzbxvVar) {
        final InterfaceFutureC8411o11 e = this.i.e(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfbuVar, zzfbxVar, m(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzbxvVar);
        return zzgcy.n(e, new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdlp
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                zzcfb zzcfbVar = (zzcfb) obj;
                if (zzcfbVar != null && zzcfbVar.r() != null) {
                    return InterfaceFutureC8411o11.this;
                }
                throw new zzegy(1, "Retrieve video view in html5 ad response failed.");
            }
        }, zzcaa.g);
    }
}
