package o;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: o.uK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9953uK2 {
    public final WebkitToCompatConverterBoundaryInterface a;

    public C9953uK2(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.a = webkitToCompatConverterBoundaryInterface;
    }

    public GP a(CookieManager cookieManager) {
        return new GP((WebViewCookieManagerBoundaryInterface) C7128ip.a(WebViewCookieManagerBoundaryInterface.class, this.a.convertCookieManager(cookieManager)));
    }

    public SafeBrowsingResponse b(InvocationHandler invocationHandler) {
        return C9710tK2.a(this.a.convertSafeBrowsingResponse(invocationHandler));
    }

    public InvocationHandler c(SafeBrowsingResponse safeBrowsingResponse) {
        return this.a.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    public ServiceWorkerWebSettings d(InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.a.convertServiceWorkerSettings(invocationHandler);
    }

    public InvocationHandler e(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.a.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    public YJ2 f(WebSettings webSettings) {
        return new YJ2((WebSettingsBoundaryInterface) C7128ip.a(WebSettingsBoundaryInterface.class, this.a.convertSettings(webSettings)));
    }

    public WebMessagePort g(InvocationHandler invocationHandler) {
        return (WebMessagePort) this.a.convertWebMessagePort(invocationHandler);
    }

    public InvocationHandler h(WebMessagePort webMessagePort) {
        return this.a.convertWebMessagePort(webMessagePort);
    }

    public WebResourceError i(InvocationHandler invocationHandler) {
        return (WebResourceError) this.a.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler j(WebResourceError webResourceError) {
        return this.a.convertWebResourceError(webResourceError);
    }

    public WJ2 k(WebResourceRequest webResourceRequest) {
        return new WJ2((WebResourceRequestBoundaryInterface) C7128ip.a(WebResourceRequestBoundaryInterface.class, this.a.convertWebResourceRequest(webResourceRequest)));
    }
}
