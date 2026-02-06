package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import o.InterfaceC11300zs1;

@TargetApi(21)
/* loaded from: classes2.dex */
public final class zzcgk extends zzcgj {
    public zzcgk(zzcfb zzcfbVar, zzbbt zzbbtVar, boolean z, @InterfaceC11300zs1 zzece zzeceVar) {
        super(zzcfbVar, zzbbtVar, z, zzeceVar);
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC11300zs1
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            return d1(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        return null;
    }
}
