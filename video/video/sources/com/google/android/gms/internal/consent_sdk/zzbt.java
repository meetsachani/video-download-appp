package com.google.android.gms.internal.consent_sdk;

import android.annotation.TargetApi;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes3.dex */
final class zzbt extends WebViewClient {
    public final /* synthetic */ zzbv a;

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        zzcb zzcbVar;
        zzbv zzbvVar = this.a;
        if (zzbv.f(zzbvVar, str)) {
            zzcbVar = zzbvVar.Z0;
            zzcbVar.e(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        boolean z;
        zzbv zzbvVar = this.a;
        z = zzbvVar.a1;
        if (!z) {
            Log.d("UserMessagingPlatform", "Wall html loaded.");
            zzbvVar.a1 = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        zzcb zzcbVar;
        zzcbVar = this.a.Z0;
        zzcbVar.f(i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        zzcb zzcbVar;
        String uri = webResourceRequest.getUrl().toString();
        zzbv zzbvVar = this.a;
        if (zzbv.f(zzbvVar, uri)) {
            zzcbVar = zzbvVar.Z0;
            zzcbVar.e(uri);
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zzcb zzcbVar;
        zzbv zzbvVar = this.a;
        if (zzbv.f(zzbvVar, str)) {
            zzcbVar = zzbvVar.Z0;
            zzcbVar.e(str);
            return true;
        }
        return false;
    }
}
