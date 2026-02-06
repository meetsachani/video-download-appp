package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.InterfaceC11300zs1;
import o.InterfaceC5940dy1;
import o.InterfaceFutureC8411o11;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public class zzcaf implements InterfaceFutureC8411o11 {
    public final zzgds X = zzgds.A();

    public static final boolean a(boolean z) {
        if (!z) {
            com.google.android.gms.ads.internal.zzv.t().w(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    public final boolean c(@InterfaceC11300zs1 Object obj) {
        boolean l = this.X.l(obj);
        a(l);
        return l;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.X.cancel(z);
    }

    public final boolean d(Throwable th) {
        boolean m = this.X.m(th);
        a(m);
        return m;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.X.get();
    }

    @Override // o.InterfaceFutureC8411o11
    public final void h4(Runnable runnable, Executor executor) {
        this.X.h4(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.X.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.X.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.X.get(j, timeUnit);
    }
}
