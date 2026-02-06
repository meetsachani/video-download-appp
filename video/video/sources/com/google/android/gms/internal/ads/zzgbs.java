package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public abstract class zzgbs extends AbstractExecutorService implements AutoCloseable, zzgdj {
    @Override // com.google.android.gms.internal.ads.zzgdj
    public final InterfaceFutureC8411o11 I2(Callable callable) {
        return (InterfaceFutureC8411o11) super.submit(callable);
    }

    @Override // java.lang.AutoCloseable, com.google.android.gms.internal.ads.zzgdj
    public /* synthetic */ void close() {
        if (this != ForkJoinPool.commonPool() && !isTerminated()) {
            shutdown();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    z = awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z2) {
                        shutdownNow();
                    }
                    z2 = true;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final InterfaceFutureC8411o11 f0(Runnable runnable) {
        return (InterfaceFutureC8411o11) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzgdz.B(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (InterfaceFutureC8411o11) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzgdz(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (InterfaceFutureC8411o11) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (InterfaceFutureC8411o11) super.submit(callable);
    }
}
