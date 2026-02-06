package o;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: o.uN2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9965uN2 {
    public static final String f = AbstractC6949i41.f("WorkTimer");
    public final ThreadFactory a;
    public final ScheduledExecutorService b;
    public final Map<String, c> c;
    public final Map<String, b> d;
    public final Object e;

    /* renamed from: o.uN2$a */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        public int a = 0;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r) {
            Thread newThread = Executors.defaultThreadFactory().newThread(r);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.a);
            this.a = this.a + 1;
            return newThread;
        }
    }

    /* renamed from: o.uN2$b */
    /* loaded from: classes.dex */
    public interface b {
        void a(String workSpecId);
    }

    /* renamed from: o.uN2$c */
    /* loaded from: classes.dex */
    public static class c implements Runnable {
        public static final String Z = "WrkTimerRunnable";
        public final C9965uN2 X;
        public final String Y;

        public c(C9965uN2 workTimer, String workSpecId) {
            this.X = workTimer;
            this.Y = workSpecId;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.X.e) {
                try {
                    if (this.X.c.remove(this.Y) != null) {
                        b remove = this.X.d.remove(this.Y);
                        if (remove != null) {
                            remove.a(this.Y);
                        }
                    } else {
                        AbstractC6949i41.c().a(Z, String.format("Timer with %s is already marked as complete.", this.Y), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C9965uN2() {
        a aVar = new a();
        this.a = aVar;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new Object();
        this.b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public ScheduledExecutorService a() {
        return this.b;
    }

    public synchronized Map<String, b> b() {
        return this.d;
    }

    public synchronized Map<String, c> c() {
        return this.c;
    }

    public void d() {
        if (!this.b.isShutdown()) {
            this.b.shutdownNow();
        }
    }

    public void e(final String workSpecId, long processingTimeMillis, b listener) {
        synchronized (this.e) {
            AbstractC6949i41.c().a(f, String.format("Starting timer for %s", workSpecId), new Throwable[0]);
            f(workSpecId);
            c cVar = new c(this, workSpecId);
            this.c.put(workSpecId, cVar);
            this.d.put(workSpecId, listener);
            this.b.schedule(cVar, processingTimeMillis, TimeUnit.MILLISECONDS);
        }
    }

    public void f(final String workSpecId) {
        synchronized (this.e) {
            try {
                if (this.c.remove(workSpecId) != null) {
                    AbstractC6949i41.c().a(f, String.format("Stopping timer for %s", workSpecId), new Throwable[0]);
                    this.d.remove(workSpecId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
