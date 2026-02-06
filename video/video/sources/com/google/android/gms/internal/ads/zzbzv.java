package com.google.android.gms.internal.ads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zzbzv extends ScheduledThreadPoolExecutor implements AutoCloseable {
    public zzbzv(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }

    @Override // java.lang.AutoCloseable
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
}
