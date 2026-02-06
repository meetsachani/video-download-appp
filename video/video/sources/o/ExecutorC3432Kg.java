package o;

import android.os.Process;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import o.ExecutorC3432Kg;

/* renamed from: o.Kg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ExecutorC3432Kg implements Executor {
    public static volatile Executor Y;
    public final ExecutorService X = Executors.newFixedThreadPool(2, new a());

    /* renamed from: o.Kg$a */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public static final String c = "CameraX-camerax_audio_%d";
        public final AtomicInteger a = new AtomicInteger(0);

        public a() {
        }

        public static /* synthetic */ void a(Runnable runnable) {
            Process.setThreadPriority(-16);
            runnable.run();
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            Thread thread = new Thread(new Runnable() { // from class: o.Jg
                @Override // java.lang.Runnable
                public final void run() {
                    ExecutorC3432Kg.a.a(runnable);
                }
            });
            thread.setName(String.format(Locale.US, c, Integer.valueOf(this.a.getAndIncrement())));
            return thread;
        }
    }

    public static Executor b() {
        if (Y != null) {
            return Y;
        }
        synchronized (ExecutorC3432Kg.class) {
            try {
                if (Y == null) {
                    Y = new ExecutorC3432Kg();
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
