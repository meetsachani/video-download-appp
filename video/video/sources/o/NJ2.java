package o;

import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes.dex */
public class NJ2 implements WebMessageBoundaryInterface {
    public static final String[] Y = {"WEB_MESSAGE_ARRAY_BUFFER"};
    public PJ2 X;

    public NJ2(PJ2 pj2) {
        this.X = pj2;
    }

    public static boolean a(int i) {
        if (i == 0 || (i == 1 && C6771hK2.C.d())) {
            return true;
        }
        return false;
    }

    public static SJ2[] b(InvocationHandler[] invocationHandlerArr) {
        SJ2[] sj2Arr = new SJ2[invocationHandlerArr.length];
        for (int i = 0; i < invocationHandlerArr.length; i++) {
            sj2Arr[i] = new TJ2(invocationHandlerArr[i]);
        }
        return sj2Arr;
    }

    public static PJ2 c(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        SJ2[] b = b(webMessageBoundaryInterface.getPorts());
        if (C6771hK2.C.d()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) C7128ip.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type != 0) {
                if (type != 1) {
                    return null;
                }
                return new PJ2(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), b);
            }
            return new PJ2(webMessagePayloadBoundaryInterface.getAsString(), b);
        }
        return new PJ2(webMessageBoundaryInterface.getData(), b);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Deprecated
    public String getData() {
        return this.X.c();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler getMessagePayload() {
        RJ2 rj2;
        int e = this.X.e();
        if (e != 0) {
            if (e == 1) {
                byte[] b = this.X.b();
                Objects.requireNonNull(b);
                rj2 = new RJ2(b);
            } else {
                throw new IllegalStateException("Unknown web message payload type: " + this.X.e());
            }
        } else {
            rj2 = new RJ2(this.X.c());
        }
        return C7128ip.d(rj2);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler[] getPorts() {
        SJ2[] d = this.X.d();
        if (d == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[d.length];
        for (int i = 0; i < d.length; i++) {
            invocationHandlerArr[i] = d[i].c();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return Y;
    }
}
