package androidx.webkit;

import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import o.AbstractC7546kX1;
import o.C3506La;
import o.C6528gK2;
import o.C6771hK2;
import o.C7789lX1;
import o.UJ2;
import o.VJ2;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

/* loaded from: classes.dex */
public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    public static final String[] X = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public void a(WebView webView, WebResourceRequest webResourceRequest, UJ2 uj2) {
        if (C6528gK2.a("WEB_RESOURCE_ERROR_GET_CODE") && C6528gK2.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && C3506La.b(webResourceRequest)) {
            onReceivedError(webView, uj2.b(), uj2.a().toString(), C3506La.a(webResourceRequest).toString());
        }
    }

    public void b(WebView webView, WebResourceRequest webResourceRequest, int i, AbstractC7546kX1 abstractC7546kX1) {
        if (C6528gK2.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            abstractC7546kX1.c(true);
            return;
        }
        throw C6771hK2.a();
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return X;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        a(webView, webResourceRequest, new VJ2(invocationHandler));
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler) {
        b(webView, webResourceRequest, i, new C7789lX1(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, C3506La.a(webResourceRequest).toString());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        a(webView, webResourceRequest, new VJ2(webResourceError));
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        b(webView, webResourceRequest, i, new C7789lX1(safeBrowsingResponse));
    }
}
