package o;

import android.webkit.TracingController;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import o.AbstractC3408Ka;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

/* renamed from: o.nr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8371nr2 extends AbstractC8128mr2 {
    public TracingController a;
    public TracingControllerBoundaryInterface b;

    public C8371nr2() {
        AbstractC3408Ka.g gVar = C6771hK2.L;
        if (gVar.c()) {
            this.a = C8304nb.a();
            this.b = null;
        } else if (gVar.d()) {
            this.a = null;
            this.b = C7014iK2.d().getTracingController();
        } else {
            throw C6771hK2.a();
        }
    }

    @Override // o.AbstractC8128mr2
    public boolean b() {
        AbstractC3408Ka.g gVar = C6771hK2.L;
        if (gVar.c()) {
            return C8304nb.d(f());
        }
        if (gVar.d()) {
            return e().isTracing();
        }
        throw C6771hK2.a();
    }

    @Override // o.AbstractC8128mr2
    public void c(C7867lr2 c7867lr2) {
        if (c7867lr2 != null) {
            AbstractC3408Ka.g gVar = C6771hK2.L;
            if (gVar.c()) {
                C8304nb.f(f(), c7867lr2);
                return;
            } else if (gVar.d()) {
                e().start(c7867lr2.b(), c7867lr2.a(), c7867lr2.c());
                return;
            } else {
                throw C6771hK2.a();
            }
        }
        throw new IllegalArgumentException("Tracing config must be non null");
    }

    @Override // o.AbstractC8128mr2
    public boolean d(OutputStream outputStream, Executor executor) {
        AbstractC3408Ka.g gVar = C6771hK2.L;
        if (gVar.c()) {
            return C8304nb.g(f(), outputStream, executor);
        }
        if (gVar.d()) {
            return e().stop(outputStream, executor);
        }
        throw C6771hK2.a();
    }

    public final TracingControllerBoundaryInterface e() {
        if (this.b == null) {
            this.b = C7014iK2.d().getTracingController();
        }
        return this.b;
    }

    public final TracingController f() {
        if (this.a == null) {
            this.a = C8304nb.a();
        }
        return this.a;
    }
}
