package o;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: o.mK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8002mK2 implements InterfaceC7741lK2 {
    public final WebViewProviderFactoryBoundaryInterface a;

    public C8002mK2(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // o.InterfaceC7741lK2
    public String[] a() {
        return this.a.getSupportedFeatures();
    }

    @Override // o.InterfaceC7741lK2
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) C7128ip.a(WebViewProviderBoundaryInterface.class, this.a.createWebView(webView));
    }

    @Override // o.InterfaceC7741lK2
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) C7128ip.a(DropDataContentProviderBoundaryInterface.class, this.a.getDropDataProvider());
    }

    @Override // o.InterfaceC7741lK2
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) C7128ip.a(ProfileStoreBoundaryInterface.class, this.a.getProfileStore());
    }

    @Override // o.InterfaceC7741lK2
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) C7128ip.a(ProxyControllerBoundaryInterface.class, this.a.getProxyController());
    }

    @Override // o.InterfaceC7741lK2
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) C7128ip.a(ServiceWorkerControllerBoundaryInterface.class, this.a.getServiceWorkerController());
    }

    @Override // o.InterfaceC7741lK2
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C7128ip.a(StaticsBoundaryInterface.class, this.a.getStatics());
    }

    @Override // o.InterfaceC7741lK2
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) C7128ip.a(TracingControllerBoundaryInterface.class, this.a.getTracingController());
    }

    @Override // o.InterfaceC7741lK2
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C7128ip.a(WebkitToCompatConverterBoundaryInterface.class, this.a.getWebkitToCompatConverter());
    }
}
