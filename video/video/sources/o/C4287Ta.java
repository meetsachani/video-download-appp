package o;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: o.Ta  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4287Ta {
    public static PackageInfo a() {
        PackageInfo currentWebViewPackage;
        currentWebViewPackage = WebView.getCurrentWebViewPackage();
        return currentWebViewPackage;
    }

    public static boolean b(WebSettings webSettings) {
        boolean safeBrowsingEnabled;
        safeBrowsingEnabled = webSettings.getSafeBrowsingEnabled();
        return safeBrowsingEnabled;
    }

    public static WebChromeClient c(WebView webView) {
        WebChromeClient webChromeClient;
        webChromeClient = webView.getWebChromeClient();
        return webChromeClient;
    }

    public static WebViewClient d(WebView webView) {
        WebViewClient webViewClient;
        webViewClient = webView.getWebViewClient();
        return webViewClient;
    }

    public static void e(WebSettings webSettings, boolean z) {
        webSettings.setSafeBrowsingEnabled(z);
    }
}
