package o;

import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes.dex */
public class DU0 extends CU0 {
    public JsReplyProxyBoundaryInterface a;

    /* loaded from: classes.dex */
    public class a implements Callable<Object> {
        public final /* synthetic */ JsReplyProxyBoundaryInterface a;

        public a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.a = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new DU0(this.a);
        }
    }

    public DU0(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.a = jsReplyProxyBoundaryInterface;
    }

    public static DU0 c(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) C7128ip.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (DU0) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }

    @Override // o.CU0
    public void a(String str) {
        if (C6771hK2.U.d()) {
            this.a.postMessage(str);
            return;
        }
        throw C6771hK2.a();
    }

    @Override // o.CU0
    public void b(byte[] bArr) {
        Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (C6771hK2.C.d()) {
            this.a.postMessageWithPayload(C7128ip.d(new RJ2(bArr)));
            return;
        }
        throw C6771hK2.a();
    }
}
