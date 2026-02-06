package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import o.C6566gU0;

/* loaded from: classes2.dex */
class zzgdm extends zzgbs {
    public final ExecutorService X;

    public zzgdm(ExecutorService executorService) {
        executorService.getClass();
        this.X = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.X.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.X.execute(runnable);
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
    public final List shutdownNow() {
        return this.X.shutdownNow();
    }

    public final String toString() {
        ExecutorService executorService = this.X;
        String obj = super.toString();
        String valueOf = String.valueOf(executorService);
        return obj + C6566gU0.f + valueOf + C6566gU0.g;
    }
}
