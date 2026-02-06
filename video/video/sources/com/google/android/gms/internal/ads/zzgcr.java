package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public abstract class zzgcr extends zzfxt implements Future {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return g().cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public /* bridge */ /* synthetic */ Object e() {
        throw null;
    }

    public abstract Future g();

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return g().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return g().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return g().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return g().get(j, timeUnit);
    }
}
