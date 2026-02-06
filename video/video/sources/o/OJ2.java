package o;

import java.lang.reflect.InvocationHandler;
import o.SJ2;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

/* loaded from: classes.dex */
public class OJ2 implements WebMessageCallbackBoundaryInterface {
    public final SJ2.a X;

    public OJ2(SJ2.a aVar) {
        this.X = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        PJ2 c = NJ2.c((WebMessageBoundaryInterface) C7128ip.a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (c != null) {
            this.X.a(new TJ2(invocationHandler), c);
        }
    }
}
