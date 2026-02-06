package o;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class LH0 implements Executor {
    public static volatile Executor Y;
    public final ExecutorService X = Executors.newSingleThreadExecutor(new a());

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public static final String b = "CameraX-camerax_high_priority";

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName(b);
            return thread;
        }
    }

    public static Executor b() {
        if (Y != null) {
            return Y;
        }
        synchronized (LH0.class) {
            try {
                if (Y == null) {
                    Y = new LH0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Y;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.X.execute(runnable);
    }
}
