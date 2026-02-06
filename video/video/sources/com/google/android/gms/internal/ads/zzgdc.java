package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
final class zzgdc implements InterfaceFutureC8411o11 {
    public static final InterfaceFutureC8411o11 Y = new zzgdc(null);
    public static final zzgdh Z = new zzgdh(zzgdc.class);
    public final Object X;

    public zzgdc(Object obj) {
        this.X = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.X;
    }

    @Override // o.InterfaceFutureC8411o11
    public final void h4(Runnable runnable, Executor executor) {
        zzfvc.c(runnable, "Runnable was null.");
        zzfvc.c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger a = Z.a();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            a.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        Object obj = this.X;
        String obj2 = super.toString();
        String valueOf = String.valueOf(obj);
        return obj2 + "[status=SUCCESS, result=[" + valueOf + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.X;
    }
}
