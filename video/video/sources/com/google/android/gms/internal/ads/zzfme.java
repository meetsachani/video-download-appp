package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import o.C9811tl1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfme {
    public static final zzfme a = new zzfme();

    private zzfme() {
    }

    public static final zzfme a() {
        return a;
    }

    public static final boolean k(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                try {
                    webView.evaluateJavascript(str, null);
                    return true;
                } catch (IllegalStateException unused) {
                    webView.loadUrl("javascript: " + str);
                    return true;
                }
            } catch (Exception e) {
                e.getMessage();
                zzfky.a.getClass();
            }
        }
        return false;
    }

    @InterfaceC5056aJ2
    public final void b(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append(C9811tl1.c);
            for (Object obj : objArr) {
                if (obj == null) {
                    sb.append("null");
                } else if (obj instanceof String) {
                    String obj2 = obj.toString();
                    if (obj2.startsWith("{")) {
                        sb.append(obj2);
                    } else {
                        sb.append('\"');
                        sb.append(obj2);
                        sb.append('\"');
                    }
                } else {
                    sb.append(obj);
                }
                sb.append(",");
            }
            sb.setLength(sb.length() - 1);
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            if (Looper.myLooper() == handler.getLooper()) {
                k(webView, sb2);
                return;
            } else {
                handler.post(new zzfmd(this, webView, sb2));
                return;
            }
        }
        zzfky.a.getClass();
    }

    public final void c(WebView webView, String str) {
        b(webView, "finishSession", str);
    }

    public final void d(WebView webView, String str, JSONObject jSONObject) {
        b(webView, "init", jSONObject, str);
    }

    public final void e(WebView webView, String str, float f) {
        b(webView, "setDeviceVolume", Float.valueOf(f), str);
    }

    public final void f(WebView webView, @InterfaceC5670cr1 JSONObject jSONObject) {
        b(webView, "setLastActivity", jSONObject);
    }

    public final void g(WebView webView, String str, String str2) {
        b(webView, "setDeviceLockState", str2);
    }

    public final void h(WebView webView, String str, String str2) {
        b(webView, "setNativeViewHierarchy", str2, str);
    }

    public final void i(WebView webView, String str, String str2) {
        b(webView, "setState", str2, str);
    }

    public final void j(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
