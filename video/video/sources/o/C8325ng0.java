package o;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: o.ng0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8325ng0 {
    public static final Executor a = new a();
    public static final Executor b = new b();
    public static final Executor c = new c();

    /* renamed from: o.ng0$a */
    /* loaded from: classes.dex */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            SD2.z(runnable);
        }
    }

    /* renamed from: o.ng0$b */
    /* loaded from: classes.dex */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            SD2.y(runnable);
        }
    }

    /* renamed from: o.ng0$c */
    /* loaded from: classes.dex */
    public class c implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return c;
    }

    public static Executor b() {
        return a;
    }

    public static Executor c() {
        return b;
    }

    public static void d(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!executorService.awaitTermination(5L, timeUnit)) {
                executorService.shutdownNow();
                if (!executorService.awaitTermination(5L, timeUnit)) {
                    throw new RuntimeException("Failed to shutdown");
                }
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }
}
