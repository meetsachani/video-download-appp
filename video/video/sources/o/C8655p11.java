package o;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.p11  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8655p11<V> extends FutureTask<V> implements InterfaceFutureC8411o11<V> {
    public final C5383bg0 X;

    public C8655p11(Callable<V> callable) {
        super(callable);
        this.X = new C5383bg0();
    }

    public static <V> C8655p11<V> a(Runnable runnable, @InterfaceC7165iy1 V v) {
        return new C8655p11<>(runnable, v);
    }

    public static <V> C8655p11<V> b(Callable<V> callable) {
        return new C8655p11<>(callable);
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        this.X.b();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @InterfaceC6181ey
    @InterfaceC7165iy1
    public V get(long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (nanos <= C6920hx1.a) {
            return (V) super.get(j, timeUnit);
        }
        return (V) super.get(Math.min(nanos, (long) C6920hx1.a), TimeUnit.NANOSECONDS);
    }

    @Override // o.InterfaceFutureC8411o11
    public void h4(Runnable runnable, Executor executor) {
        this.X.a(runnable, executor);
    }

    public C8655p11(Runnable runnable, @InterfaceC7165iy1 V v) {
        super(runnable, v);
        this.X = new C5383bg0();
    }
}
