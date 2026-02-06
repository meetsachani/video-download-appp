package o;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: o.Ct  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2689Ct<T> extends AbstractC10780xk<T> {
    public final Callable<T> d;

    public C2689Ct(Callable<T> callable) {
        k(callable);
        this.d = callable;
    }

    @Override // o.AbstractC10780xk
    public T g() throws Exception {
        return this.d.call();
    }

    public final void k(Callable<T> callable) {
        C11147zE2.V(callable, "callable", new Object[0]);
    }

    public C2689Ct(Callable<T> callable, ExecutorService executorService) {
        super(executorService);
        k(callable);
        this.d = callable;
    }
}
