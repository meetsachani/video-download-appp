package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgdp extends zzgdm implements AutoCloseable, zzgdk {
    public final ScheduledExecutorService Y;

    public zzgdp(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.Y = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgbs, java.lang.AutoCloseable, com.google.android.gms.internal.ads.zzgdj
    public final /* synthetic */ void close() {
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

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: s2 */
    public final zzgdi schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzgdz zzgdzVar = new zzgdz(callable);
        return new zzgdn(zzgdzVar, this.Y.schedule(zzgdzVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.Y;
        zzgdz B = zzgdz.B(runnable, null);
        return new zzgdn(B, scheduledExecutorService.schedule(B, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzgdo zzgdoVar = new zzgdo(runnable);
        return new zzgdn(zzgdoVar, this.Y.scheduleAtFixedRate(zzgdoVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzgdo zzgdoVar = new zzgdo(runnable);
        return new zzgdn(zzgdoVar, this.Y.scheduleWithFixedDelay(zzgdoVar, j, j2, timeUnit));
    }
}
