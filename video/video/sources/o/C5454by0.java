package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@InterfaceC5601ca0
@InterfaceC10420wF0
/* renamed from: o.by0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5454by0<V> extends AbstractC10097uw0<V> {
    public final InterfaceFutureC8411o11<V> d1;

    public C5454by0(InterfaceFutureC8411o11<V> interfaceFutureC8411o11) {
        this.d1 = (InterfaceFutureC8411o11) C10664xF1.E(interfaceFutureC8411o11);
    }

    @Override // o.Q0, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.d1.cancel(z);
    }

    @Override // o.Q0, java.util.concurrent.Future
    @InterfaceC7165iy1
    public V get() throws InterruptedException, ExecutionException {
        return this.d1.get();
    }

    @Override // o.Q0, o.InterfaceFutureC8411o11
    public void h4(Runnable runnable, Executor executor) {
        this.d1.h4(runnable, executor);
    }

    @Override // o.Q0, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.d1.isCancelled();
    }

    @Override // o.Q0, java.util.concurrent.Future
    public boolean isDone() {
        return this.d1.isDone();
    }

    @Override // o.Q0
    public String toString() {
        return this.d1.toString();
    }

    @Override // o.Q0, java.util.concurrent.Future
    @InterfaceC7165iy1
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.d1.get(j, timeUnit);
    }
}
