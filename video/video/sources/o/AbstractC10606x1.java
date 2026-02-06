package o;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

@InterfaceC6181ey
@InterfaceC11149zF0
@InterfaceC5601ca0
@InterfaceC4238Sm
/* renamed from: o.x1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10606x1 extends AbstractExecutorService implements InterfaceExecutorServiceC10119v11, AutoCloseable {
    @Override // o.InterfaceExecutorServiceC10119v11, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        C2695Cu1.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, @InterfaceC7165iy1 T t) {
        return Iu2.N(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return Iu2.O(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, o.InterfaceExecutorServiceC10119v11
    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, @InterfaceC7165iy1 Object obj) {
        return submit(runnable, (Runnable) obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, o.InterfaceExecutorServiceC10119v11
    public InterfaceFutureC8411o11<?> submit(Runnable runnable) {
        return (InterfaceFutureC8411o11) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, o.InterfaceExecutorServiceC10119v11
    public <T> InterfaceFutureC8411o11<T> submit(Runnable runnable, @InterfaceC7165iy1 T t) {
        return (InterfaceFutureC8411o11) super.submit(runnable, (Runnable) t);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, o.InterfaceExecutorServiceC10119v11
    public <T> InterfaceFutureC8411o11<T> submit(Callable<T> callable) {
        return (InterfaceFutureC8411o11) super.submit((Callable) callable);
    }
}
