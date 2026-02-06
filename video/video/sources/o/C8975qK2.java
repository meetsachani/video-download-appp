package o;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* renamed from: o.qK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8975qK2 extends WebViewRenderProcessClient {
    public AbstractC8489oK2 a;

    public C8975qK2(AbstractC8489oK2 abstractC8489oK2) {
        this.a = abstractC8489oK2;
    }

    public AbstractC8489oK2 a() {
        return this.a;
    }

    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.a.a(webView, C9467sK2.b(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.a.b(webView, C9467sK2.b(webViewRenderProcess));
    }
}
