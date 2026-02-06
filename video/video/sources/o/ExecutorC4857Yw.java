package o;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.Yw */
/* loaded from: classes.dex */
public class ExecutorC4857Yw implements Executor {
    public static final int Y0 = 1;
    public static final String Z = "CameraExecutor";
    public static final int Z0 = 1;
    public static final ThreadFactory a1 = new a();
    public final Object X = new Object();
    public ThreadPoolExecutor Y = c();

    /* renamed from: o.Yw$a */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public static final String b = "CameraX-core_camera_%d";
        public final AtomicInteger a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, b, Integer.valueOf(this.a.getAndIncrement())));
            return thread;
        }
    }

    public static /* synthetic */ void b(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C7433k41.c(Z, "A rejected execution occurred in CameraExecutor!");
    }

    public static ThreadPoolExecutor c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), a1);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: o.Xw
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                ExecutorC4857Yw.b(runnable, threadPoolExecutor2);
            }
        });
        return threadPoolExecutor;
    }

    public void d() {
        synchronized (this.X) {
            try {
                if (!this.Y.isShutdown()) {
                    this.Y.shutdown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(InterfaceC5207ax interfaceC5207ax) {
        ThreadPoolExecutor threadPoolExecutor;
        C10907yF1.l(interfaceC5207ax);
        synchronized (this.X) {
            try {
                if (this.Y.isShutdown()) {
                    this.Y = c();
                }
                threadPoolExecutor = this.Y;
            } catch (Throwable th) {
                throw th;
            }
        }
        int max = Math.max(1, interfaceC5207ax.c().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        C10907yF1.l(runnable);
        synchronized (this.X) {
            this.Y.execute(runnable);
        }
    }
}
