package com.google.firebase.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import o.InterfaceC5056aJ2;

/* loaded from: classes3.dex */
final class PausableExecutorImpl implements PausableExecutor {
    public volatile boolean X;
    public final Executor Y;
    @InterfaceC5056aJ2
    public final LinkedBlockingQueue<Runnable> Z = new LinkedBlockingQueue<>();

    public PausableExecutorImpl(boolean z, Executor executor) {
        this.X = z;
        this.Y = executor;
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void F3() {
        this.X = false;
        b();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean T1() {
        return this.X;
    }

    public final void b() {
        if (!this.X) {
            Runnable poll = this.Z.poll();
            while (poll != null) {
                this.Y.execute(poll);
                if (!this.X) {
                    poll = this.Z.poll();
                } else {
                    poll = null;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.Z.offer(runnable);
        b();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.X = true;
    }
}
