package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import o.C6273fK2;
import o.C6528gK2;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzflm {
    public final zzflo a;
    public final WebView b;
    public zzfno c;
    public final HashMap d;
    public final zzfmb e;

    public zzflm(zzflo zzfloVar, WebView webView, boolean z) {
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        this.e = new zzfmb();
        zzfmx.a();
        this.a = zzfloVar;
        this.b = webView;
        if (a() != webView) {
            for (zzflb zzflbVar : hashMap.values()) {
                zzflbVar.d(webView);
            }
            this.c = new zzfno(webView);
        }
        if (C6528gK2.a("WEB_MESSAGE_LISTENER")) {
            h();
            C6273fK2.b(this.b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfll(this));
            return;
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    public static zzflm b(zzflo zzfloVar, WebView webView, boolean z) {
        return new zzflm(zzfloVar, webView, true);
    }

    public static /* bridge */ /* synthetic */ void c(zzflm zzflmVar, String str) {
        HashMap hashMap = zzflmVar.d;
        zzflb zzflbVar = (zzflb) hashMap.get(str);
        if (zzflbVar != null) {
            zzflbVar.c();
            hashMap.remove(str);
        }
    }

    public static /* bridge */ /* synthetic */ void e(zzflm zzflmVar, String str) {
        zzflg zzflgVar = zzflg.DEFINED_BY_JAVASCRIPT;
        zzflj zzfljVar = zzflj.DEFINED_BY_JAVASCRIPT;
        zzfln zzflnVar = zzfln.JAVASCRIPT;
        zzflf zzflfVar = new zzflf(zzflc.a(zzflgVar, zzfljVar, zzflnVar, zzflnVar, false), zzfld.b(zzflmVar.a, zzflmVar.b, null, null), str);
        zzflmVar.d.put(str, zzflfVar);
        zzflfVar.d(zzflmVar.a());
        for (zzfma zzfmaVar : zzflmVar.e.a()) {
            zzflfVar.b((View) zzfmaVar.b().get(), zzfmaVar.a(), zzfmaVar.c());
        }
        zzflfVar.e();
    }

    @InterfaceC11300zs1
    public final View a() {
        zzfno zzfnoVar = this.c;
        if (zzfnoVar == null) {
            return null;
        }
        return (View) zzfnoVar.get();
    }

    public final void f(View view, zzfli zzfliVar, @InterfaceC11300zs1 String str) {
        for (zzflb zzflbVar : this.d.values()) {
            zzflbVar.b(view, zzfliVar, "Ad overlay");
        }
        this.e.b(view, zzfliVar, "Ad overlay");
    }

    public final void g(zzcfs zzcfsVar) {
        for (zzflb zzflbVar : this.d.values()) {
            zzflbVar.c();
        }
        Timer timer = new Timer();
        timer.schedule(new zzflk(this, zzcfsVar, timer), 1000L);
    }

    public final void h() {
        C6273fK2.w(this.b, "omidJsSessionService");
    }
}
