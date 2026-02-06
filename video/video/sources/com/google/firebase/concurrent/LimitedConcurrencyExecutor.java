package com.google.firebase.concurrent;

import com.google.firebase.components.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
public class LimitedConcurrencyExecutor implements Executor {
    public final Executor X;
    public final Semaphore Y;
    public final LinkedBlockingQueue<Runnable> Z = new LinkedBlockingQueue<>();

    public LimitedConcurrencyExecutor(Executor executor, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.a(z, "concurrency must be positive.");
        this.X = executor;
        this.Y = new Semaphore(i, true);
    }

    public static /* synthetic */ void d(LimitedConcurrencyExecutor limitedConcurrencyExecutor, Runnable runnable) {
        limitedConcurrencyExecutor.getClass();
        try {
            runnable.run();
        } finally {
            limitedConcurrencyExecutor.Y.release();
            limitedConcurrencyExecutor.h();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.Z.offer(runnable);
        h();
    }

    public final Runnable f(final Runnable runnable) {
        return new Runnable() { // from class: com.google.firebase.concurrent.n
            @Override // java.lang.Runnable
            public final void run() {
                LimitedConcurrencyExecutor.d(LimitedConcurrencyExecutor.this, runnable);
            }
        };
    }

    public final void h() {
        while (this.Y.tryAcquire()) {
            Runnable poll = this.Z.poll();
            if (poll != null) {
                this.X.execute(f(poll));
            } else {
                this.Y.release();
                return;
            }
        }
    }
}
