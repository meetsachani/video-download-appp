package o;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: o.o12  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC8412o12 implements Executor {
    public final Executor Y;
    public volatile Runnable Y0;
    public final ArrayDeque<a> X = new ArrayDeque<>();
    public final Object Z = new Object();

    /* renamed from: o.o12$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public final ExecutorC8412o12 X;
        public final Runnable Y;

        public a(ExecutorC8412o12 serialExecutor, Runnable runnable) {
            this.X = serialExecutor;
            this.Y = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.Y.run();
            } finally {
                this.X.d();
            }
        }
    }

    public ExecutorC8412o12(Executor executor) {
        this.Y = executor;
    }

    public Executor b() {
        return this.Y;
    }

    public boolean c() {
        boolean z;
        synchronized (this.Z) {
            z = !this.X.isEmpty();
        }
        return z;
    }

    public void d() {
        synchronized (this.Z) {
            try {
                a poll = this.X.poll();
                this.Y0 = poll;
                if (poll != null) {
                    this.Y.execute(this.Y0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        synchronized (this.Z) {
            try {
                this.X.add(new a(this, command));
                if (this.Y0 == null) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
