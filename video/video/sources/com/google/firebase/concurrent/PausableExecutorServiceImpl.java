package com.google.firebase.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class PausableExecutorServiceImpl implements PausableExecutorService {
    public final ExecutorService X;
    public final PausableExecutor Y;

    public PausableExecutorServiceImpl(boolean z, ExecutorService executorService) {
        this.X = executorService;
        this.Y = new PausableExecutorImpl(z, executorService);
    }

    public static /* synthetic */ Object d(Runnable runnable) {
        runnable.run();
        return null;
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException
        */
    public static /* synthetic */ java.lang.Object f(java.lang.Runnable r0, java.lang.Object r1) {
        /*
            r0.run()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.PausableExecutorServiceImpl.f(java.lang.Runnable, java.lang.Object):java.lang.Object");
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void F3() {
        this.Y.F3();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean T1() {
        return this.Y.T1();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.X.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.Y.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.X.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.X.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.X.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.X.isTerminated();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.Y.pause();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        execute(futureTask);
        return futureTask;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.X.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.X.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(final Runnable runnable, final T t) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PausableExecutorServiceImpl.f(runnable, t);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(final Runnable runnable) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PausableExecutorServiceImpl.d(runnable);
            }
        });
    }
}
