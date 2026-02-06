package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public interface zzecv {
    @InterfaceC11300zs1
    String a(Context context);

    @InterfaceC11300zs1
    zzeda b(String str, WebView webView, String str2, String str3, @InterfaceC11300zs1 String str4, String str5, zzecx zzecxVar, zzecw zzecwVar, @InterfaceC11300zs1 String str6);

    void c(zzflb zzflbVar);

    @InterfaceC11300zs1
    zzeda d(String str, WebView webView, String str2, String str3, @InterfaceC11300zs1 String str4, zzecx zzecxVar, zzecw zzecwVar, @InterfaceC11300zs1 String str5);

    void e(zzflb zzflbVar, View view);

    boolean f(Context context);

    void g(zzflm zzflmVar, zzcfs zzcfsVar);

    void h(zzflb zzflbVar);

    void i(zzflb zzflbVar, View view);

    void j(zzflm zzflmVar, View view);

    @InterfaceC11300zs1
    zzflm k(VersionInfoParcel versionInfoParcel, WebView webView, boolean z);
}
