package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes2.dex */
final class zzfmq implements Runnable {
    public final WebView X;
    public final /* synthetic */ zzfmr Y;

    public zzfmq(zzfmr zzfmrVar) {
        WebView webView;
        this.Y = zzfmrVar;
        webView = zzfmrVar.e;
        this.X = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.X.destroy();
    }
}
