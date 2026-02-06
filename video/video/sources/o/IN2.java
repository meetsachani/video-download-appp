package o;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.AbstractC5317bO0;

@InterfaceC6181ey
@InterfaceC5601ca0
@InterfaceC11149zF0
/* loaded from: classes3.dex */
public abstract class IN2 implements ExecutorService, AutoCloseable {
    public final ExecutorService X;

    public IN2(ExecutorService executorService) {
        this.X = (ExecutorService) C10664xF1.E(executorService);
    }

    public static /* synthetic */ void d(Callable callable) {
        try {
            callable.call();
        } catch (Exception e) {
            C7855lo2.w(e);
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.X.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        C2695Cu1.a(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.X.execute(f(runnable));
    }

    public Runnable f(Runnable runnable) {
        final Callable h = h(Executors.callable(runnable, null));
        return new Runnable() { // from class: o.HN2
            @Override // java.lang.Runnable
            public final void run() {
                IN2.d(h);
            }
        };
    }

    public abstract <T> Callable<T> h(Callable<T> callable);

    public final <T> AbstractC5317bO0<Callable<T>> i(Collection<? extends Callable<T>> collection) {
        AbstractC5317bO0.a r = AbstractC5317bO0.r();
        for (Callable<T> callable : collection) {
            r.g(h(callable));
        }
        return r.e();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.X.invokeAll(i(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.X.invokeAny(i(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.X.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.X.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.X.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.X.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.X.submit(h((Callable) C10664xF1.E(callable)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.X.invokeAll(i(collection), j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.X.invokeAny(i(collection), j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.X.submit(f(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, @InterfaceC7165iy1 T t) {
        return this.X.submit(f(runnable), t);
    }
}
