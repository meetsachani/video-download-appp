package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdmo {
    public final zzfcp a;
    public final Executor b;
    public final zzdpd c;
    public final zzdny d;
    public final Context e;
    public final zzdsd f;
    public final zzfjr g;
    public final zzebt h;
    public final zzdrx i;

    public zzdmo(zzfcp zzfcpVar, Executor executor, zzdpd zzdpdVar, Context context, zzdsd zzdsdVar, zzfjr zzfjrVar, zzebt zzebtVar, zzdny zzdnyVar, zzdrx zzdrxVar) {
        this.a = zzfcpVar;
        this.b = executor;
        this.c = zzdpdVar;
        this.e = context;
        this.f = zzdsdVar;
        this.g = zzfjrVar;
        this.h = zzebtVar;
        this.d = zzdnyVar;
        this.i = zzdrxVar;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 a(zzdmo zzdmoVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxv zzbxvVar, Object obj) {
        zzcfb a = zzdmoVar.c.a(com.google.android.gms.ads.internal.client.zzr.E0(), null, null);
        final zzcae e = zzcae.e(a);
        zzdmoVar.h(a, zzbVar, zzbxvVar);
        a.M().v0(new zzcgs() { // from class: com.google.android.gms.internal.ads.zzdmg
            @Override // com.google.android.gms.internal.ads.zzcgs
            public final void a() {
                zzcae.this.f();
            }
        });
        a.loadUrl((String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.b4));
        return e;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 b(final zzdmo zzdmoVar, JSONObject jSONObject, final zzcfb zzcfbVar) {
        zzbmg zzbmgVar = zzdmoVar.a.b;
        final zzcae e = zzcae.e(zzcfbVar);
        if (zzbmgVar != null) {
            zzcfbVar.b1(zzcgv.d());
        } else {
            zzcfbVar.b1(zzcgv.e());
        }
        zzcfbVar.M().f1(new zzcgr() { // from class: com.google.android.gms.internal.ads.zzdmf
            @Override // com.google.android.gms.internal.ads.zzcgr
            public final void a(boolean z, int i, String str, String str2) {
                zzdmo.g(zzdmo.this, zzcfbVar, e, z, i, str, str2);
            }
        });
        zzcfbVar.c1("google.afma.nativeAds.renderVideo", jSONObject);
        return e;
    }

    public static /* synthetic */ InterfaceFutureC8411o11 c(final zzdmo zzdmoVar, com.google.android.gms.ads.internal.client.zzr zzrVar, zzfbu zzfbuVar, zzfbx zzfbxVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbxv zzbxvVar, String str, String str2, Object obj) {
        com.google.android.gms.ads.internal.zzb zzbVar2;
        zzbxv zzbxvVar2;
        final zzcfb a = zzdmoVar.c.a(zzrVar, zzfbuVar, zzfbxVar);
        final zzcae e = zzcae.e(a);
        if (zzdmoVar.a.b != null) {
            zzdmoVar.h(a, zzbVar, zzbxvVar);
            a.b1(zzcgv.d());
        } else {
            zzdnv b = zzdmoVar.d.b();
            zzcgt M = a.M();
            zzbcm zzbcmVar = zzbcv.Hd;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                zzbVar2 = new com.google.android.gms.ads.internal.zzb(zzdmoVar.e, null, null);
            } else {
                zzbVar2 = zzbVar;
            }
            if (true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                zzbxvVar2 = null;
            } else {
                zzbxvVar2 = zzbxvVar;
            }
            M.e1(b, b, b, b, b, false, null, zzbVar2, null, zzbxvVar2, zzdmoVar.h, zzdmoVar.g, zzdmoVar.f, null, b, null, null, null, null);
            j(a);
        }
        a.M().f1(new zzcgr() { // from class: com.google.android.gms.internal.ads.zzdmd
            @Override // com.google.android.gms.internal.ads.zzcgr
            public final void a(boolean z, int i, String str3, String str4) {
                zzdmo.f(zzdmo.this, a, e, z, i, str3, str4);
            }
        });
        a.h1(str, str2, null);
        return e;
    }

    public static /* synthetic */ void f(zzdmo zzdmoVar, zzcfb zzcfbVar, zzcae zzcaeVar, boolean z, int i, String str, String str2) {
        if (z) {
            com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzdmoVar.a.a;
            if (zzfwVar != null && zzcfbVar.r() != null) {
                zzcfbVar.r().a8(zzfwVar);
            }
            zzcaeVar.f();
            return;
        }
        zzcaeVar.d(new zzegy(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    public static /* synthetic */ void g(zzdmo zzdmoVar, zzcfb zzcfbVar, zzcae zzcaeVar, boolean z, int i, String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j4)).booleanValue()) {
            if (z) {
                zzdmoVar.i(zzcfbVar, zzcaeVar);
                return;
            }
            zzcaeVar.d(new zzegy(1, "Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
            return;
        }
        zzdmoVar.i(zzcfbVar, zzcaeVar);
    }

    public static final void j(zzcfb zzcfbVar) {
        zzcfbVar.r1("/videoClicked", zzbjv.h);
        zzcfbVar.M().H0(true);
        zzcfbVar.r1("/getNativeAdViewSignals", zzbjv.s);
        zzcfbVar.r1("/getNativeClickMeta", zzbjv.t);
    }

    public final InterfaceFutureC8411o11 d(final JSONObject jSONObject, @InterfaceC11300zs1 final com.google.android.gms.ads.internal.zzb zzbVar, @InterfaceC11300zs1 final zzbxv zzbxvVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x2)).booleanValue()) {
            this.i.a().putLong(zzdrl.NATIVE_ASSETS_LOADING_VIDEO_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        InterfaceFutureC8411o11 h = zzgcy.h(null);
        zzgcf zzgcfVar = new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdmi
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzdmo.a(zzdmo.this, zzbVar, zzbxvVar, obj);
            }
        };
        Executor executor = this.b;
        return zzgcy.n(zzgcy.n(h, zzgcfVar, executor), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdmh
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzdmo.b(zzdmo.this, jSONObject, (zzcfb) obj);
            }
        }, executor);
    }

    public final InterfaceFutureC8411o11 e(final String str, final String str2, final zzfbu zzfbuVar, final zzfbx zzfbxVar, final com.google.android.gms.ads.internal.client.zzr zzrVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzbxv zzbxvVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x2)).booleanValue()) {
            this.i.a().putLong(zzdrl.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.e(), com.google.android.gms.ads.internal.zzv.d().a());
        }
        return zzgcy.n(zzgcy.h(null), new zzgcf() { // from class: com.google.android.gms.internal.ads.zzdme
            @Override // com.google.android.gms.internal.ads.zzgcf
            public final InterfaceFutureC8411o11 b(Object obj) {
                return zzdmo.c(zzdmo.this, zzrVar, zzfbuVar, zzfbxVar, zzbVar, zzbxvVar, str, str2, obj);
            }
        }, this.b);
    }

    public final void h(zzcfb zzcfbVar, @InterfaceC11300zs1 com.google.android.gms.ads.internal.zzb zzbVar, @InterfaceC11300zs1 zzbxv zzbxvVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2;
        j(zzcfbVar);
        zzcfbVar.r1("/video", zzbjv.l);
        zzcfbVar.r1("/videoMeta", zzbjv.m);
        zzcfbVar.r1("/precache", new zzcdj());
        zzcfbVar.r1("/delayPageLoaded", zzbjv.p);
        zzcfbVar.r1("/instrument", zzbjv.n);
        zzcfbVar.r1("/log", zzbjv.g);
        zzcfbVar.r1("/click", new zzbiu(null, null));
        if (this.a.b != null) {
            zzcfbVar.M().U0(true);
            if (true != ((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Hd)).booleanValue()) {
                zzbVar2 = null;
            } else {
                zzbVar2 = zzbVar;
            }
            zzcfbVar.r1("/open", new zzbki(zzbVar2, null, null, null, null));
        } else {
            zzcfbVar.M().U0(false);
        }
        if (com.google.android.gms.ads.internal.zzv.s().p(zzcfbVar.getContext())) {
            Map hashMap = new HashMap();
            if (zzcfbVar.F() != null) {
                hashMap = zzcfbVar.F().w0;
            }
            zzcfbVar.r1("/logScionEvent", new zzbkc(zzcfbVar.getContext(), hashMap));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Hd)).booleanValue()) {
            zzcfbVar.M().O0(zzbVar);
            zzcfbVar.M().S0(zzbxvVar);
        }
    }

    public final void i(zzcfb zzcfbVar, zzcae zzcaeVar) {
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = this.a.a;
        if (zzfwVar != null && zzcfbVar.r() != null) {
            zzcfbVar.r().a8(zzfwVar);
        }
        zzcaeVar.f();
    }
}
