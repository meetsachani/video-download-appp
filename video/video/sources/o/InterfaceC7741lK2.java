package o;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: o.lK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7741lK2 {
    String[] a();

    WebViewProviderBoundaryInterface createWebView(WebView webView);

    DropDataContentProviderBoundaryInterface getDropDataProvider();

    ProfileStoreBoundaryInterface getProfileStore();

    ProxyControllerBoundaryInterface getProxyController();

    ServiceWorkerControllerBoundaryInterface getServiceWorkerController();

    StaticsBoundaryInterface getStatics();

    TracingControllerBoundaryInterface getTracingController();

    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
}
