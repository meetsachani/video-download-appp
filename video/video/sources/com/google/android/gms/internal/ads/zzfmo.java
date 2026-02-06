package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class zzfmo extends zzfmn {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfmo(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        n(webView);
    }
}
