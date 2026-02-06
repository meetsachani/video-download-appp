package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzazr implements Runnable {
    public final ValueCallback X;
    public final /* synthetic */ zzazj Y;
    public final /* synthetic */ boolean Y0;
    public final /* synthetic */ WebView Z;
    public final /* synthetic */ zzazt Z0;

    public zzazr(zzazt zzaztVar, final zzazj zzazjVar, final WebView webView, final boolean z) {
        this.Y = zzazjVar;
        this.Z = webView;
        this.Y0 = z;
        this.Z0 = zzaztVar;
        this.X = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzazq
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzazr.this.Z0.c(zzazjVar, webView, (String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.Z;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.X);
            } catch (Throwable unused) {
                this.X.onReceiveValue("");
            }
        }
    }
}
