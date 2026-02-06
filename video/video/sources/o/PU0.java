package o;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import o.PU0;

@InterfaceC5601ca0
@InterfaceC11149zF0
@InterfaceC4238Sm
/* loaded from: classes3.dex */
public final class PU0 {

    /* loaded from: classes3.dex */
    public static class a<V> extends AbstractFutureC5697cy0<V> implements InterfaceFutureC8411o11<V> {
        public static final ThreadFactory Z0;
        public static final Executor a1;
        public final Executor X;
        public final C5383bg0 Y;
        public final Future<V> Y0;
        public final AtomicBoolean Z;

        static {
            ThreadFactory b = new C11038yn2().e(true).f("ListenableFutureAdapter-thread-%d").b();
            Z0 = b;
            a1 = Executors.newCachedThreadPool(b);
        }

        public a(Future<V> future) {
            this(future, a1);
        }

        public static /* synthetic */ void N5(a aVar) {
            aVar.getClass();
            try {
                C5748dA2.f(aVar.Y0);
            } catch (Throwable unused) {
            }
            aVar.Y.b();
        }

        @Override // o.AbstractFutureC5697cy0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public Future<V> L5() {
            return this.Y0;
        }

        @Override // o.InterfaceFutureC8411o11
        public void h4(Runnable runnable, Executor executor) {
            this.Y.a(runnable, executor);
            if (this.Z.compareAndSet(false, true)) {
                if (this.Y0.isDone()) {
                    this.Y.b();
                } else {
                    this.X.execute(new Runnable() { // from class: o.OU0
                        {
                            PU0.a.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            PU0.a.N5(PU0.a.this);
                        }
                    });
                }
            }
        }

        public a(Future<V> future, Executor executor) {
            this.Y = new C5383bg0();
            this.Z = new AtomicBoolean(false);
            this.Y0 = (Future) C10664xF1.E(future);
            this.X = (Executor) C10664xF1.E(executor);
        }
    }

    public static <V> InterfaceFutureC8411o11<V> a(Future<V> future) {
        if (future instanceof InterfaceFutureC8411o11) {
            return (InterfaceFutureC8411o11) future;
        }
        return new a(future);
    }

    public static <V> InterfaceFutureC8411o11<V> b(Future<V> future, Executor executor) {
        C10664xF1.E(executor);
        if (future instanceof InterfaceFutureC8411o11) {
            return (InterfaceFutureC8411o11) future;
        }
        return new a(future, executor);
    }
}
