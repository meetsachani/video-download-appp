package o;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;

/* loaded from: classes.dex */
public class M12 implements ServiceWorkerClientBoundaryInterface {
    public final N12 X;

    public M12(N12 n12) {
        this.X = n12;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    @Override // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.X.a(webResourceRequest);
    }
}
