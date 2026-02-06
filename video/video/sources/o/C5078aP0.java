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

/* renamed from: o.aP0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5078aP0 implements InterfaceC7741lK2 {
    public static final String[] a = new String[0];
    public static final String b = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily";

    @Override // o.InterfaceC7741lK2
    public String[] a() {
        return a;
    }

    @Override // o.InterfaceC7741lK2
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC7741lK2
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC7741lK2
    public ProfileStoreBoundaryInterface getProfileStore() {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC7741lK2
    public ProxyControllerBoundaryInterface getProxyController() {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC7741lK2
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC7741lK2
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC7741lK2
    public TracingControllerBoundaryInterface getTracingController() {
        throw new UnsupportedOperationException(b);
    }

    @Override // o.InterfaceC7741lK2
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException(b);
    }
}
