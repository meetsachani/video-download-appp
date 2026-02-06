package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;
import o.InterfaceC11300zs1;
import o.UE;

/* loaded from: classes2.dex */
public final class zzecu implements zzecv {
    public static /* synthetic */ zzeda l(String str, String str2, String str3, zzecw zzecwVar, String str4, WebView webView, String str5, String str6, zzecx zzecxVar) {
        zzflo a = zzflo.a("Google", str2);
        zzfln p = p("javascript");
        zzflg n = n(zzecwVar.toString());
        zzfln zzflnVar = zzfln.NONE;
        if (p == zzflnVar) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (n == null) {
            String valueOf = String.valueOf(zzecwVar);
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Omid html session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        } else {
            zzfln p2 = p(str4);
            if (n == zzflg.VIDEO && p2 == zzflnVar) {
                String valueOf2 = String.valueOf(str4);
                int i3 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Omid html session error; Video events owner unknown for video creative: ".concat(valueOf2));
                return null;
            }
            zzfld b = zzfld.b(a, webView, str5, "");
            return new zzeda(zzflb.a(zzflc.a(n, o(zzecxVar.toString()), p, p2, true), b), b);
        }
    }

    public static /* synthetic */ zzeda m(String str, String str2, String str3, String str4, zzecw zzecwVar, WebView webView, String str5, String str6, zzecx zzecxVar) {
        zzflo a = zzflo.a(str, str2);
        zzfln p = p("javascript");
        zzfln p2 = p(str4);
        zzflg n = n(zzecwVar.toString());
        zzfln zzflnVar = zzfln.NONE;
        if (p == zzflnVar) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (n == null) {
            String valueOf = String.valueOf(zzecwVar);
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Omid js session error; Unable to parse creative type: ".concat(valueOf));
            return null;
        } else if (n == zzflg.VIDEO && p2 == zzflnVar) {
            String valueOf2 = String.valueOf(str4);
            int i3 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Omid js session error; Video events owner unknown for video creative: ".concat(valueOf2));
            return null;
        } else {
            zzfld c = zzfld.c(a, webView, str5, "");
            return new zzeda(zzflb.a(zzflc.a(n, o(zzecxVar.toString()), p, p2, true), c), c);
        }
    }

    @InterfaceC11300zs1
    public static zzflg n(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -382745961) {
            if (hashCode != 112202875) {
                if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("video")) {
                    c = 2;
                }
                c = 65535;
            }
        } else {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                return zzflg.VIDEO;
            }
            return zzflg.NATIVE_DISPLAY;
        }
        return zzflg.HTML_DISPLAY;
    }

    public static zzflj o(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != -1104128070) {
            if (hashCode != 1318088141) {
                if (hashCode == 1988248512 && str.equals("onePixel")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals("definedByJavascript")) {
                    c = 1;
                }
                c = 65535;
            }
        } else {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return zzflj.UNSPECIFIED;
                }
                return zzflj.ONE_PIXEL;
            }
            return zzflj.DEFINED_BY_JAVASCRIPT;
        }
        return zzflj.BEGIN_TO_RENDER;
    }

    public static zzfln p(@InterfaceC11300zs1 String str) {
        if ("native".equals(str)) {
            return zzfln.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfln.JAVASCRIPT;
        }
        return zzfln.NONE;
    }

    @InterfaceC11300zs1
    public static final Object q(zzect zzectVar) {
        try {
            return zzectVar.a();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzv.t().w(e, "omid exception");
            return null;
        }
    }

    public static final void r(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzv.t().w(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    @InterfaceC11300zs1
    public final String a(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w5)).booleanValue()) {
            return null;
        }
        return (String) q(new zzect() { // from class: com.google.android.gms.internal.ads.zzecp
            @Override // com.google.android.gms.internal.ads.zzect
            public final Object a() {
                return "a.1.5.2-google_20241009";
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    @InterfaceC11300zs1
    public final zzeda b(final String str, final WebView webView, String str2, String str3, @InterfaceC11300zs1 final String str4, final String str5, final zzecx zzecxVar, final zzecw zzecwVar, @InterfaceC11300zs1 final String str6) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w5)).booleanValue() && zzfkz.b()) {
            return (zzeda) q(new zzect(str5, str, "javascript", str4, zzecwVar, webView, str6, "", zzecxVar) { // from class: com.google.android.gms.internal.ads.zzecm
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String d;
                public final /* synthetic */ zzecw e;
                public final /* synthetic */ WebView f;
                public final /* synthetic */ String g;
                public final /* synthetic */ zzecx i;
                public final /* synthetic */ String c = "javascript";
                public final /* synthetic */ String h = "";

                {
                    this.d = str4;
                    this.e = zzecwVar;
                    this.f = webView;
                    this.g = str6;
                    this.i = zzecxVar;
                }

                @Override // com.google.android.gms.internal.ads.zzect
                public final Object a() {
                    return zzecu.m(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final void c(final zzflb zzflbVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w5)).booleanValue() && zzfkz.b()) {
            Objects.requireNonNull(zzflbVar);
            r(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecl
                @Override // java.lang.Runnable
                public final void run() {
                    zzflb.this.e();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    @InterfaceC11300zs1
    public final zzeda d(final String str, final WebView webView, String str2, String str3, @InterfaceC11300zs1 final String str4, final zzecx zzecxVar, final zzecw zzecwVar, @InterfaceC11300zs1 final String str5) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w5)).booleanValue() && zzfkz.b()) {
            return (zzeda) q(new zzect("Google", str, "javascript", zzecwVar, str4, webView, str5, "", zzecxVar) { // from class: com.google.android.gms.internal.ads.zzecj
                public final /* synthetic */ String b;
                public final /* synthetic */ zzecw d;
                public final /* synthetic */ String e;
                public final /* synthetic */ WebView f;
                public final /* synthetic */ String g;
                public final /* synthetic */ zzecx i;
                public final /* synthetic */ String a = "Google";
                public final /* synthetic */ String c = "javascript";
                public final /* synthetic */ String h = "";

                {
                    this.b = str;
                    this.d = zzecwVar;
                    this.e = str4;
                    this.f = webView;
                    this.g = str5;
                    this.i = zzecxVar;
                }

                @Override // com.google.android.gms.internal.ads.zzect
                public final Object a() {
                    return zzecu.l(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final void e(final zzflb zzflbVar, final View view) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeci
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w5)).booleanValue() && zzfkz.b()) {
                    zzflb.this.b(view, zzfli.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final boolean f(final Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w5)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Omid flag is disabled");
            return false;
        }
        Boolean bool = (Boolean) q(new zzect() { // from class: com.google.android.gms.internal.ads.zzecn
            @Override // com.google.android.gms.internal.ads.zzect
            public final Object a() {
                if (zzfkz.b()) {
                    return Boolean.TRUE;
                }
                zzfkz.a(context);
                return Boolean.valueOf(zzfkz.b());
            }
        });
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final void g(final zzflm zzflmVar, final zzcfs zzcfsVar) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecq
            @Override // java.lang.Runnable
            public final void run() {
                zzflm.this.g(zzcfsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final void h(final zzflb zzflbVar) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecs
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w5)).booleanValue() && zzfkz.b()) {
                    zzflb.this.c();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final void i(final zzflb zzflbVar, final View view) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeck
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.w5)).booleanValue() && zzfkz.b()) {
                    zzflb.this.d(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final void j(final zzflm zzflmVar, final View view) {
        r(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeco
            @Override // java.lang.Runnable
            public final void run() {
                zzflm.this.f(view, zzfli.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    @InterfaceC11300zs1
    public final zzflm k(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z) {
        return (zzflm) q(new zzect(webView, true) { // from class: com.google.android.gms.internal.ads.zzecr
            public final /* synthetic */ WebView b;

            @Override // com.google.android.gms.internal.ads.zzect
            public final Object a() {
                VersionInfoParcel versionInfoParcel2 = VersionInfoParcel.this;
                int i = versionInfoParcel2.Y;
                int i2 = versionInfoParcel2.Z;
                return zzflm.b(zzflo.a("Google", i + UE.h + i2), this.b, true);
            }
        });
    }
}
