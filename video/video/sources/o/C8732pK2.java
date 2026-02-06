package o;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* renamed from: o.pK2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8732pK2 implements WebViewRendererClientBoundaryInterface {
    public static final String[] Z = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};
    public final Executor X;
    public final AbstractC8489oK2 Y;

    /* renamed from: o.pK2$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ AbstractC8489oK2 X;
        public final /* synthetic */ WebView Y;
        public final /* synthetic */ AbstractC8245nK2 Z;

        public a(AbstractC8489oK2 abstractC8489oK2, WebView webView, AbstractC8245nK2 abstractC8245nK2) {
            this.X = abstractC8489oK2;
            this.Y = webView;
            this.Z = abstractC8245nK2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.b(this.Y, this.Z);
        }
    }

    /* renamed from: o.pK2$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ AbstractC8489oK2 X;
        public final /* synthetic */ WebView Y;
        public final /* synthetic */ AbstractC8245nK2 Z;

        public b(AbstractC8489oK2 abstractC8489oK2, WebView webView, AbstractC8245nK2 abstractC8245nK2) {
            this.X = abstractC8489oK2;
            this.Y = webView;
            this.Z = abstractC8245nK2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.a(this.Y, this.Z);
        }
    }

    public C8732pK2(Executor executor, AbstractC8489oK2 abstractC8489oK2) {
        this.X = executor;
        this.Y = abstractC8489oK2;
    }

    public AbstractC8489oK2 a() {
        return this.Y;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return Z;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        C9467sK2 c = C9467sK2.c(invocationHandler);
        AbstractC8489oK2 abstractC8489oK2 = this.Y;
        Executor executor = this.X;
        if (executor == null) {
            abstractC8489oK2.a(webView, c);
        } else {
            executor.execute(new b(abstractC8489oK2, webView, c));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        C9467sK2 c = C9467sK2.c(invocationHandler);
        AbstractC8489oK2 abstractC8489oK2 = this.Y;
        Executor executor = this.X;
        if (executor == null) {
            abstractC8489oK2.b(webView, c);
        } else {
            executor.execute(new a(abstractC8489oK2, webView, c));
        }
    }
}
