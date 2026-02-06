package com.facebook.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class U<T> {
    @Nullable
    public T a;
    @Nullable
    public CountDownLatch b;

    public U(T t) {
        this.a = t;
    }

    public static final Void b(U u, Callable callable) {
        C6562gT0.p(u, "this$0");
        C6562gT0.p(callable, "$callable");
        try {
            u.a = (T) callable.call();
        } finally {
            CountDownLatch countDownLatch = u.b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    @Nullable
    public final T c() {
        d();
        return this.a;
    }

    public final void d() {
        CountDownLatch countDownLatch = this.b;
        if (countDownLatch == null) {
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
    }

    public U(@NotNull final Callable<T> callable) {
        C6562gT0.p(callable, "callable");
        this.b = new CountDownLatch(1);
        com.facebook.M m = com.facebook.M.a;
        com.facebook.M.y().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.T
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void b;
                b = U.b(U.this, callable);
                return b;
            }
        }));
    }
}
