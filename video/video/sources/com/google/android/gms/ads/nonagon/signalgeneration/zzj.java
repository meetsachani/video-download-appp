package com.google.android.gms.ads.nonagon.signalgeneration;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzgdj;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import o.C6273fK2;
import o.C6528gK2;
import o.ES1;
import o.InterfaceC11300zs1;
import o.InterfaceC6184ey2;

/* loaded from: classes2.dex */
public final class zzj extends zzbkr {
    public final WebView a;
    public final zzf b;
    public final Executor c;
    @InterfaceC11300zs1
    public WebViewClient d;

    public zzj(WebView webView, zzf zzfVar, @InterfaceC6184ey2 zzgdj zzgdjVar) {
        this.a = webView;
        this.b = zzfVar;
        this.c = zzgdjVar;
    }

    public static /* synthetic */ void b(zzj zzjVar) {
        WebViewClient p;
        try {
            com.google.android.gms.ads.internal.zzv.v();
            WebView webView = zzjVar.a;
            if (Build.VERSION.SDK_INT >= 26) {
                p = webView.getWebViewClient();
            } else {
                if (C6528gK2.a("GET_WEB_VIEW_CLIENT")) {
                    try {
                        p = C6273fK2.p(webView);
                    } catch (RuntimeException e) {
                        com.google.android.gms.ads.internal.zzv.t().x(e, "AdUtil.getWebViewClient");
                    }
                }
                throw new IllegalStateException("getWebViewClient not supported");
            }
            if (p != zzjVar) {
                if (p != null) {
                    zzjVar.d = p;
                }
                zzjVar.a.setWebViewClient(zzjVar);
                zzjVar.d();
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    @InterfaceC11300zs1
    public final WebViewClient a() {
        return this.d;
    }

    public final void c() {
        this.c.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzh
            @Override // java.lang.Runnable
            public final void run() {
                zzj.b(zzj.this);
            }
        });
    }

    public final void d() {
        this.a.evaluateJavascript(String.format(Locale.getDefault(), (String) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ca), this.b.a()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        if (e()) {
            return;
        }
        super.doUpdateVisitedHistory(webView, str, z);
    }

    public final boolean e() {
        if (!((Boolean) zzbfa.a.e()).booleanValue()) {
            return false;
        }
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (allStackTraces == null || !allStackTraces.containsKey(Thread.currentThread())) {
            return true;
        }
        boolean z = false;
        boolean z2 = false;
        for (StackTraceElement stackTraceElement : allStackTraces.get(Thread.currentThread())) {
            if (stackTraceElement.getClassName().contains(zzj.class.getName())) {
                if (z && z2) {
                    return true;
                }
                z = true;
            } else if (z) {
                z2 = true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        if (e()) {
            return;
        }
        super.onFormResubmission(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        if (e()) {
            return;
        }
        super.onLoadResource(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    @ES1(api = 23)
    public final void onPageCommitVisible(WebView webView, String str) {
        if (e()) {
            return;
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        if (e()) {
            return;
        }
        d();
        super.onPageFinished(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (e()) {
            return;
        }
        d();
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        if (e()) {
            return;
        }
        super.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (e()) {
            return;
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        if (e()) {
            return;
        }
        super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    @ES1(api = 23)
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (e()) {
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, @InterfaceC11300zs1 String str2, String str3) {
        if (e()) {
            return;
        }
        super.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (e()) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    @ES1(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (e()) {
            return false;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    @ES1(api = 27)
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        if (e()) {
            return;
        }
        super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onScaleChanged(WebView webView, float f, float f2) {
        if (e()) {
            return;
        }
        super.onScaleChanged(webView, f, f2);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        if (e()) {
            return;
        }
        super.onTooManyRedirects(webView, message, message2);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (e()) {
            return;
        }
        super.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    @InterfaceC11300zs1
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (e()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        if (e()) {
            return false;
        }
        return super.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    @ES1(api = 24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (e()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    @ES1(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (e()) {
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    @InterfaceC11300zs1
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (e()) {
            return null;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (e()) {
            return false;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
