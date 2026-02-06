package o;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@InterfaceC5601ca0
@InterfaceC11149zF0
@L40("Use TestingExecutors.sameThreadScheduledExecutor, or wrap a real Executor from java.util.concurrent.Executors with MoreExecutors.listeningDecorator")
/* renamed from: o.v11  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceExecutorServiceC10119v11 extends ExecutorService, AutoCloseable {
    @Override // java.lang.AutoCloseable
    /* synthetic */ default void close() {
        C2695Cu1.a(this);
    }

    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException;

    @Override // java.util.concurrent.ExecutorService
    InterfaceFutureC8411o11<?> submit(Runnable runnable);

    @Override // java.util.concurrent.ExecutorService
    <T> InterfaceFutureC8411o11<T> submit(Runnable runnable, @InterfaceC7165iy1 T t);

    @Override // java.util.concurrent.ExecutorService
    <T> InterfaceFutureC8411o11<T> submit(Callable<T> callable);

    @Override // java.util.concurrent.ExecutorService
    /* bridge */ /* synthetic */ default Future submit(Runnable runnable, @InterfaceC7165iy1 Object obj) {
        return submit(runnable, (Runnable) obj);
    }
}
