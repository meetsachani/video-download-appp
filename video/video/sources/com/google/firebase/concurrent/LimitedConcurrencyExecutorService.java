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
import o.C2695Cu1;

/* loaded from: classes3.dex */
final class LimitedConcurrencyExecutorService extends LimitedConcurrencyExecutor implements ExecutorService, AutoCloseable {
    public final ExecutorService Y0;

    public LimitedConcurrencyExecutorService(ExecutorService executorService, int i) {
        super(executorService, i);
        this.Y0 = executorService;
    }

    /*  JADX ERROR: NullPointerException in pass: MarkMethodsForInline
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.isRegister()" because "arg" is null
        	at jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(RegisterArg.java:173)
        	at jadx.core.dex.instructions.args.InsnArg.isSameVar(InsnArg.java:269)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:118)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static /* synthetic */ java.lang.Object i(java.lang.Runnable r0, java.lang.Object r1) {
        /*
            r0.run()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.LimitedConcurrencyExecutorService.i(java.lang.Runnable, java.lang.Object):java.lang.Object");
    }

    public static /* synthetic */ Object j(Runnable runnable) {
        runnable.run();
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.Y0.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        C2695Cu1.a(this);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.Y0.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.Y0.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.Y0.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.Y0.isTerminated();
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
        return this.Y0.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.Y0.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(final Runnable runnable, final T t) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LimitedConcurrencyExecutorService.i(runnable, t);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(final Runnable runnable) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LimitedConcurrencyExecutorService.j(runnable);
            }
        });
    }
}
