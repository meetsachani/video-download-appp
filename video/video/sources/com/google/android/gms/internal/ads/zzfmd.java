package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes2.dex */
final class zzfmd implements Runnable {
    public final /* synthetic */ WebView X;
    public final /* synthetic */ String Y;

    public zzfmd(zzfme zzfmeVar, WebView webView, String str) {
        this.X = webView;
        this.Y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfme.k(this.X, this.Y);
    }
}
