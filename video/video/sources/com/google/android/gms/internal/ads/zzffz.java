package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.InterfaceC5056aJ2;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzffz implements InterfaceFutureC8411o11 {
    public final Object X;
    public final String Y;
    public final InterfaceFutureC8411o11 Z;

    @InterfaceC5056aJ2(otherwise = 3)
    public zzffz(Object obj, String str, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        this.X = obj;
        this.Y = str;
        this.Z = interfaceFutureC8411o11;
    }

    public final Object a() {
        return this.X;
    }

    public final String b() {
        return this.Y;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.Z.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return this.Z.get();
    }

    @Override // o.InterfaceFutureC8411o11
    public final void h4(Runnable runnable, Executor executor) {
        this.Z.h4(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.Z.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.Z.isDone();
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return this.Y + "@" + identityHashCode;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.Z.get(j, timeUnit);
    }
}
