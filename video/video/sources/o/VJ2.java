package o;

import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import o.AbstractC3408Ka;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* loaded from: classes.dex */
public class VJ2 extends UJ2 {
    public WebResourceError a;
    public WebResourceErrorBoundaryInterface b;

    public VJ2(InvocationHandler invocationHandler) {
        this.b = (WebResourceErrorBoundaryInterface) C7128ip.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    @Override // o.UJ2
    public CharSequence a() {
        AbstractC3408Ka.b bVar = C6771hK2.v;
        if (bVar.c()) {
            return C3603Ma.e(d());
        }
        if (bVar.d()) {
            return c().getDescription();
        }
        throw C6771hK2.a();
    }

    @Override // o.UJ2
    public int b() {
        AbstractC3408Ka.b bVar = C6771hK2.w;
        if (bVar.c()) {
            return C3603Ma.f(d());
        }
        if (bVar.d()) {
            return c().getErrorCode();
        }
        throw C6771hK2.a();
    }

    public final WebResourceErrorBoundaryInterface c() {
        if (this.b == null) {
            this.b = (WebResourceErrorBoundaryInterface) C7128ip.a(WebResourceErrorBoundaryInterface.class, C7014iK2.c().j(this.a));
        }
        return this.b;
    }

    public final WebResourceError d() {
        if (this.a == null) {
            this.a = C7014iK2.c().i(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    public VJ2(WebResourceError webResourceError) {
        this.a = webResourceError;
    }
}
