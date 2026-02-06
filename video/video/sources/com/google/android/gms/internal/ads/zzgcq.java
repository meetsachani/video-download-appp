package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
final class zzgcq extends zzgcp {
    public final InterfaceFutureC8411o11 c1;

    public zzgcq(InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        interfaceFutureC8411o11.getClass();
        this.c1 = interfaceFutureC8411o11;
    }

    @Override // com.google.android.gms.internal.ads.zzgbm, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.c1.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzgbm, java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return this.c1.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgbm, o.InterfaceFutureC8411o11
    public final void h4(Runnable runnable, Executor executor) {
        this.c1.h4(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgbm, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.c1.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzgbm, java.util.concurrent.Future
    public final boolean isDone() {
        return this.c1.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final String toString() {
        return this.c1.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgbm, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.c1.get(j, timeUnit);
    }
}
