package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.http.SslError;
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
import o.ES1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public abstract class zzbkr extends WebViewClient {
    @InterfaceC11300zs1
    public abstract WebViewClient a();

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onFormResubmission(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    @ES1(api = 23)
    public void onPageCommitVisible(WebView webView, String str) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @Override // android.webkit.WebViewClient
    @ES1(api = 23)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, @InterfaceC11300zs1 String str2, String str3) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    @ES1(api = 26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean onRenderProcessGone;
        WebViewClient a = a();
        if (a != null) {
            onRenderProcessGone = a.onRenderProcessGone(webView, renderProcessGoneDetail);
            return onRenderProcessGone;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    @ES1(api = 27)
    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient a = a();
        if (a != null) {
            a.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onScaleChanged(webView, f, f2);
    }

    @Override // android.webkit.WebViewClient
    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onTooManyRedirects(webView, message, message2);
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onUnhandledKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC11300zs1
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient a = a();
        if (a == null) {
            return null;
        }
        return a.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient a = a();
        if (a == null) {
            return false;
        }
        return a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @Override // android.webkit.WebViewClient
    @ES1(api = 24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient a = a();
        if (a == null) {
            return false;
        }
        return a.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    @ES1(api = 23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient a = a();
        if (a == null) {
            return;
        }
        a.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    @InterfaceC11300zs1
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient a = a();
        if (a == null) {
            return null;
        }
        return a.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient a = a();
        if (a == null) {
            return false;
        }
        return a.shouldOverrideUrlLoading(webView, str);
    }
}
