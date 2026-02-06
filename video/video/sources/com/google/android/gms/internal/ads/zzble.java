package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.h5.H5AdsRequestHandler;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import o.ES1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzble extends zzbkr {
    public static final /* synthetic */ int d = 0;
    @InterfaceC11300zs1
    public WebViewClient a;
    public final H5AdsRequestHandler b;
    public final WebView c;

    public zzble(Context context, final WebView webView) {
        context.getClass();
        webView.getClass();
        zzfvc.f(webView.getSettings().getJavaScriptEnabled(), "JavaScript must be enabled on the WebView.");
        this.c = webView;
        this.b = new H5AdsRequestHandler(context, new OnH5AdsEventListener() { // from class: com.google.android.gms.internal.ads.zzbld
            @Override // com.google.android.gms.ads.h5.OnH5AdsEventListener
            public final void a(String str) {
                int i = zzble.d;
                webView.evaluateJavascript(str, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    @InterfaceC11300zs1
    public final WebViewClient a() {
        return this.a;
    }

    public final void b() {
        this.b.a();
    }

    public final void c(@InterfaceC11300zs1 WebViewClient webViewClient) {
        boolean z;
        if (webViewClient != this) {
            z = true;
        } else {
            z = false;
        }
        zzfvc.f(z, "Delegate cannot be itself.");
        this.a = webViewClient;
    }

    public final boolean d(WebView webView) {
        if (this.c.equals(webView)) {
            return true;
        }
        com.google.android.gms.ads.internal.util.client.zzo.d("H5AdsWebViewClient must be attached to the same WebVew which was passed in the constructor.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (d(webView) && !this.b.b(str)) {
            super.onLoadResource(webView, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    @ES1(api = 24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (d(this.c)) {
            if (this.b.b(webResourceRequest.getUrl().toString())) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (d(webView)) {
            if (this.b.b(str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return false;
    }
}
