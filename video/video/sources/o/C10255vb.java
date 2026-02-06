package o;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;

/* renamed from: o.vb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10255vb {
    @Deprecated
    public static int a(WebSettings webSettings) {
        return C9526sb.a(webSettings);
    }

    public static WebViewRenderProcess b(WebView webView) {
        return C8548ob.a(webView);
    }

    public static WebViewRenderProcessClient c(WebView webView) {
        return C8791pb.a(webView);
    }

    @Deprecated
    public static void d(WebSettings webSettings, int i) {
        C9769tb.a(webSettings, i);
    }

    public static void e(WebView webView, Executor executor, AbstractC8489oK2 abstractC8489oK2) {
        C8975qK2 c8975qK2;
        if (abstractC8489oK2 != null) {
            c8975qK2 = new C8975qK2(abstractC8489oK2);
        } else {
            c8975qK2 = null;
        }
        C10012ub.a(webView, executor, c8975qK2);
    }

    public static void f(WebView webView, AbstractC8489oK2 abstractC8489oK2) {
        C8975qK2 c8975qK2;
        if (abstractC8489oK2 != null) {
            c8975qK2 = new C8975qK2(abstractC8489oK2);
        } else {
            c8975qK2 = null;
        }
        C9034qb.a(webView, c8975qK2);
    }

    public static boolean g(WebViewRenderProcess webViewRenderProcess) {
        return C9283rb.a(webViewRenderProcess);
    }
}
