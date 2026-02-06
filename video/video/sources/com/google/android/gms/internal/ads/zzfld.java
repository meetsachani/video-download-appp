package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfld {
    public final zzflo a;
    public final WebView b;
    public final List c = new ArrayList();
    public final Map d = new HashMap();
    @InterfaceC11300zs1
    public final String e;
    @InterfaceC11300zs1
    public final String f;
    public final zzfle g;

    public zzfld(zzflo zzfloVar, WebView webView, String str, List list, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, zzfle zzfleVar) {
        this.a = zzfloVar;
        this.b = webView;
        this.g = zzfleVar;
        this.f = str2;
        this.e = str3;
    }

    public static zzfld b(zzflo zzfloVar, WebView webView, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        if (str2 != null) {
            zzfmx.d(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfld(zzfloVar, webView, null, null, str, str2, zzfle.HTML);
    }

    public static zzfld c(zzflo zzfloVar, WebView webView, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2) {
        zzfmx.d("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzfld(zzfloVar, webView, null, null, str, "", zzfle.JAVASCRIPT);
    }

    public final WebView a() {
        return this.b;
    }

    public final zzfle d() {
        return this.g;
    }

    public final zzflo e() {
        return this.a;
    }

    @InterfaceC11300zs1
    public final String f() {
        return this.f;
    }

    @InterfaceC11300zs1
    public final String g() {
        return this.e;
    }

    public final List h() {
        return Collections.unmodifiableList(this.c);
    }

    public final Map i() {
        return Collections.unmodifiableMap(this.d);
    }
}
