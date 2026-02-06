package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes2.dex */
final class zzfmp extends WebViewClient {
    public final /* synthetic */ zzfmr a;

    public zzfmp(zzfmr zzfmrVar) {
        this.a = zzfmrVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String obj = renderProcessGoneDetail.toString();
        String valueOf = String.valueOf(webView);
        Log.w("NativeBridge", "WebView renderer gone: " + obj + "for WebView: " + valueOf);
        zzfmr zzfmrVar = this.a;
        if (zzfmrVar.a() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfmrVar.n(null);
        }
        webView.destroy();
        return true;
    }
}
