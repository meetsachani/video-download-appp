package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zao implements zam {
    public /* synthetic */ zao(zan zanVar) {
    }

    @Override // com.google.android.gms.internal.base.zam
    public final ExecutorService a(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.base.zam
    public final ExecutorService b(int i, int i2) {
        return a(4, Executors.defaultThreadFactory(), 2);
    }

    @Override // com.google.android.gms.internal.base.zam
    public final ExecutorService c(ThreadFactory threadFactory, int i) {
        return a(1, threadFactory, 1);
    }

    private zao() {
    }
}
