package o;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: o.Qr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC4064Qr2 implements Executor {
    public final Executor X;
    public final ArrayDeque<Runnable> Y = new ArrayDeque<>();
    public Runnable Z;

    /* renamed from: o.Qr2$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Runnable X;

        public a(Runnable runnable) {
            this.X = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.X.run();
            } finally {
                ExecutorC4064Qr2.this.b();
            }
        }
    }

    public ExecutorC4064Qr2(Executor executor) {
        this.X = executor;
    }

    public synchronized void b() {
        Runnable poll = this.Y.poll();
        this.Z = poll;
        if (poll != null) {
            this.X.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.Y.offer(new a(runnable));
        if (this.Z == null) {
            b();
        }
    }
}
