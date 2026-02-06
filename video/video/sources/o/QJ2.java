package o;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import o.C6273fK2;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* loaded from: classes.dex */
public class QJ2 implements WebMessageListenerBoundaryInterface {
    public C6273fK2.b X;

    public QJ2(C6273fK2.b bVar) {
        this.X = bVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        PJ2 c = NJ2.c((WebMessageBoundaryInterface) C7128ip.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (c != null) {
            this.X.a(webView, c, uri, z, DU0.c(invocationHandler2));
        }
    }
}
