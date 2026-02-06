package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C2695Cu1;

/* loaded from: classes3.dex */
public class DelegatingScheduledExecutorService implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService X;
    public final ScheduledExecutorService Y;

    public DelegatingScheduledExecutorService(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.X = executorService;
        this.Y = scheduledExecutorService;
    }

    public static /* synthetic */ ScheduledFuture d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, final Callable callable, long j, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.Y.schedule(new Callable() { // from class: com.google.firebase.concurrent.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DelegatingScheduledExecutorService.l(DelegatingScheduledExecutorService.this, callable, completer);
            }
        }, j, timeUnit);
    }

    public static /* synthetic */ ScheduledFuture f(DelegatingScheduledExecutorService delegatingScheduledExecutorService, final Runnable runnable, long j, long j2, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.Y.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.d
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.p(DelegatingScheduledExecutorService.this, runnable, completer);
            }
        }, j, j2, timeUnit);
    }

    public static /* synthetic */ ScheduledFuture h(DelegatingScheduledExecutorService delegatingScheduledExecutorService, final Runnable runnable, long j, long j2, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.Y.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.k(DelegatingScheduledExecutorService.this, runnable, completer);
            }
        }, j, j2, timeUnit);
    }

    public static /* synthetic */ void i(Callable callable, DelegatingScheduledFuture.Completer completer) {
        try {
            completer.set(callable.call());
        } catch (Exception e) {
            completer.a(e);
        }
    }

    public static /* synthetic */ void j(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.a(e);
            throw e;
        }
    }

    public static /* synthetic */ void k(DelegatingScheduledExecutorService delegatingScheduledExecutorService, final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        delegatingScheduledExecutorService.X.execute(new Runnable() { // from class: com.google.firebase.concurrent.m
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.j(runnable, completer);
            }
        });
    }

    public static /* synthetic */ Future l(DelegatingScheduledExecutorService delegatingScheduledExecutorService, final Callable callable, final DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.X.submit(new Runnable() { // from class: com.google.firebase.concurrent.k
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.i(callable, completer);
            }
        });
    }

    public static /* synthetic */ void m(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e) {
            completer.a(e);
        }
    }

    public static /* synthetic */ void n(DelegatingScheduledExecutorService delegatingScheduledExecutorService, final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        delegatingScheduledExecutorService.X.execute(new Runnable() { // from class: com.google.firebase.concurrent.h
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.o(runnable, completer);
            }
        });
    }

    public static /* synthetic */ void o(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
            completer.set(null);
        } catch (Exception e) {
            completer.a(e);
        }
    }

    public static /* synthetic */ void p(DelegatingScheduledExecutorService delegatingScheduledExecutorService, final Runnable runnable, final DelegatingScheduledFuture.Completer completer) {
        delegatingScheduledExecutorService.X.execute(new Runnable() { // from class: com.google.firebase.concurrent.c
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.m(runnable, completer);
            }
        });
    }

    public static /* synthetic */ ScheduledFuture q(DelegatingScheduledExecutorService delegatingScheduledExecutorService, final Runnable runnable, long j, TimeUnit timeUnit, final DelegatingScheduledFuture.Completer completer) {
        return delegatingScheduledExecutorService.Y.schedule(new Runnable() { // from class: com.google.firebase.concurrent.f
            @Override // java.lang.Runnable
            public final void run() {
                DelegatingScheduledExecutorService.n(DelegatingScheduledExecutorService.this, runnable, completer);
            }
        }, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.X.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        C2695Cu1.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.X.execute(runnable);
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

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.b
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture a(DelegatingScheduledFuture.Completer completer) {
                return DelegatingScheduledExecutorService.q(DelegatingScheduledExecutorService.this, runnable, j, timeUnit, completer);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture a(DelegatingScheduledFuture.Completer completer) {
                return DelegatingScheduledExecutorService.h(DelegatingScheduledExecutorService.this, runnable, j, j2, timeUnit, completer);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.i
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture a(DelegatingScheduledFuture.Completer completer) {
                return DelegatingScheduledExecutorService.f(DelegatingScheduledExecutorService.this, runnable, j, j2, timeUnit, completer);
            }
        });
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
        return this.X.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.X.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.X.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.j
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture a(DelegatingScheduledFuture.Completer completer) {
                return DelegatingScheduledExecutorService.d(DelegatingScheduledExecutorService.this, callable, j, timeUnit, completer);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.X.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.X.submit(runnable);
    }
}
