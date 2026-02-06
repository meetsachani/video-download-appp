package com.google.android.gms.internal.consent_sdk;

import android.webkit.WebView;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
public final class zzct {
    @InterfaceC8710pF0("WebViewUtil.class")
    public static Boolean a;

    private zzct() {
    }

    public static void a(WebView webView, String str) {
        boolean booleanValue;
        synchronized (zzct.class) {
            if (a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    a = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    a = Boolean.FALSE;
                }
            }
            booleanValue = a.booleanValue();
        }
        if (booleanValue) {
            webView.evaluateJavascript(str, null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
