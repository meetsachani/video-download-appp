package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzgdq {
    public static zzgdj a(ExecutorService executorService) {
        if (executorService instanceof zzgdj) {
            return (zzgdj) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new zzgdp((ScheduledExecutorService) executorService);
        }
        return new zzgdm(executorService);
    }

    public static zzgdk b(ScheduledExecutorService scheduledExecutorService) {
        return new zzgdp(scheduledExecutorService);
    }

    public static Executor c() {
        return zzgcm.INSTANCE;
    }

    public static Executor d(final Executor executor, final zzgbm zzgbmVar) {
        executor.getClass();
        if (executor == zzgcm.INSTANCE) {
            return executor;
        }
        return new Executor() { // from class: com.google.android.gms.internal.ads.zzgdl
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                zzgdq.e(executor, zzgbmVar, runnable);
            }
        };
    }

    public static /* synthetic */ void e(Executor executor, zzgbm zzgbmVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            zzgbmVar.m(e);
        }
    }
}
