package o;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class GT0 implements Executor {
    public static volatile Executor Y;
    public final ExecutorService X = Executors.newFixedThreadPool(2, new a());

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public static final String c = "CameraX-camerax_io_%d";
        public final AtomicInteger a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, c, Integer.valueOf(this.a.getAndIncrement())));
            return thread;
        }
    }

    public static Executor b() {
        if (Y != null) {
            return Y;
        }
        synchronized (GT0.class) {
            try {
                if (Y == null) {
                    Y = new GT0();
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
