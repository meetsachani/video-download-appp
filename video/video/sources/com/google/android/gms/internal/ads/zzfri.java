package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zzfri implements zzfrh {
    private zzfri() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    public final ExecutorService a(ThreadFactory threadFactory, int i) {
        return b(1, threadFactory, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    public final ExecutorService b(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.zzfrh
    public final ExecutorService u(int i) {
        return b(1, Executors.defaultThreadFactory(), 2);
    }

    public /* synthetic */ zzfri(zzfrj zzfrjVar) {
    }
}
