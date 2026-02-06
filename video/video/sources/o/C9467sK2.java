package o;

import android.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import o.AbstractC3408Ka;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* renamed from: o.sK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9467sK2 extends AbstractC8245nK2 {
    public static final WeakHashMap<WebViewRenderProcess, C9467sK2> c = new WeakHashMap<>();
    public WebViewRendererBoundaryInterface a;
    public WeakReference<WebViewRenderProcess> b;

    /* renamed from: o.sK2$a */
    /* loaded from: classes.dex */
    public class a implements Callable<Object> {
        public final /* synthetic */ WebViewRendererBoundaryInterface a;

        public a(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.a = webViewRendererBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new C9467sK2(this.a);
        }
    }

    public C9467sK2(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.a = webViewRendererBoundaryInterface;
    }

    public static C9467sK2 b(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<WebViewRenderProcess, C9467sK2> weakHashMap = c;
        C9467sK2 c9467sK2 = weakHashMap.get(webViewRenderProcess);
        if (c9467sK2 != null) {
            return c9467sK2;
        }
        C9467sK2 c9467sK22 = new C9467sK2(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, c9467sK22);
        return c9467sK22;
    }

    public static C9467sK2 c(InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) C7128ip.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (C9467sK2) webViewRendererBoundaryInterface.getOrCreatePeer(new a(webViewRendererBoundaryInterface));
    }

    @Override // o.AbstractC8245nK2
    public boolean a() {
        AbstractC3408Ka.h hVar = C6771hK2.K;
        if (hVar.c()) {
            WebViewRenderProcess a2 = C9224rK2.a(this.b.get());
            if (a2 != null && C10255vb.g(a2)) {
                return true;
            }
            return false;
        } else if (hVar.d()) {
            return this.a.terminate();
        } else {
            throw C6771hK2.a();
        }
    }

    public C9467sK2(WebViewRenderProcess webViewRenderProcess) {
        this.b = new WeakReference<>(webViewRenderProcess);
    }
}
