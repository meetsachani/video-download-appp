package o;

import java.util.concurrent.Executor;

/* renamed from: o.yX1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ExecutorC10976yX1 implements Executor {
    public final Executor X;

    /* renamed from: o.yX1$a */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {
        public final Runnable X;

        public a(Runnable runnable) {
            this.X = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.X.run();
            } catch (Exception e) {
                C7676l41.f("Executor", "Background execution failure.", e);
            }
        }
    }

    public ExecutorC10976yX1(Executor executor) {
        this.X = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.X.execute(new a(runnable));
    }
}
