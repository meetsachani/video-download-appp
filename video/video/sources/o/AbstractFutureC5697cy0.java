package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@InterfaceC6181ey
@InterfaceC5601ca0
@InterfaceC10420wF0
/* renamed from: o.cy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractFutureC5697cy0<V> extends AbstractC2510Ay0 implements Future<V> {

    /* renamed from: o.cy0$a */
    /* loaded from: classes3.dex */
    public static abstract class a<V> extends AbstractFutureC5697cy0<V> {
        public final Future<V> X;

        public a(Future<V> future) {
            this.X = (Future) C10664xF1.E(future);
        }

        @Override // o.AbstractFutureC5697cy0, o.AbstractC2510Ay0
        /* renamed from: M5 */
        public final Future<V> L5() {
            return this.X;
        }
    }

    @Override // o.AbstractC2510Ay0
    /* renamed from: M5 */
    public abstract Future<? extends V> L5();

    public boolean cancel(boolean z) {
        return L5().cancel(z);
    }

    @Override // java.util.concurrent.Future
    @InterfaceC7165iy1
    public V get() throws InterruptedException, ExecutionException {
        return L5().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return L5().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return L5().isDone();
    }

    @Override // java.util.concurrent.Future
    @InterfaceC7165iy1
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return L5().get(j, timeUnit);
    }
}
