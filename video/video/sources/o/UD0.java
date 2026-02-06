package o;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class UD0 implements ExecutorService, AutoCloseable {
    public static final String Y = "source";
    public static final int Y0 = 1;
    public static final String Z = "disk-cache";
    public static final String Z0 = "GlideExecutor";
    public static final String a1 = "source-unlimited";
    public static final String b1 = "animation";
    public static final long c1 = TimeUnit.SECONDS.toMillis(10);
    public static final int d1 = 4;
    public static volatile int e1 = 0;
    public static final int f1 = 9;
    public final ExecutorService X;

    /* loaded from: classes.dex */
    public static final class b {
        public static final long h = 0;
        public final boolean a;
        public int b;
        public int c;
        public ThreadFactory d = new c();
        public e e = e.d;
        public String f;
        public long g;

        public b(boolean z) {
            this.a = z;
        }

        public UD0 a() {
            if (!TextUtils.isEmpty(this.f)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.b, this.c, this.g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.d, this.f, this.e, this.a));
                if (this.g != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new UD0(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f);
        }

        public b b(String str) {
            this.f = str;
            return this;
        }

        public b c(int i) {
            this.b = i;
            this.c = i;
            return this;
        }

        @Deprecated
        public b d(ThreadFactory threadFactory) {
            this.d = threadFactory;
            return this;
        }

        public b e(long j) {
            this.g = j;
            return this;
        }

        public b f(e eVar) {
            this.e = eVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements ThreadFactory {

        /* loaded from: classes.dex */
        public class a extends Thread {
            public a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements ThreadFactory {
        public final ThreadFactory a;
        public final String b;
        public final e c;
        public final boolean d;
        public final AtomicInteger e = new AtomicInteger();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ Runnable X;

            public a(Runnable runnable) {
                this.X = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.X.run();
                } catch (Throwable th) {
                    d.this.c.a(th);
                }
            }
        }

        public d(ThreadFactory threadFactory, String str, e eVar, boolean z) {
            this.a = threadFactory;
            this.b = str;
            this.c = eVar;
            this.d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.a.newThread(new a(runnable));
            newThread.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
            return newThread;
        }
    }

    public UD0(ExecutorService executorService) {
        this.X = executorService;
    }

    public static int d() {
        if (f() >= 4) {
            return 2;
        }
        return 1;
    }

    public static int f() {
        if (e1 == 0) {
            e1 = Math.min(4, C9512sW1.a());
        }
        return e1;
    }

    public static b h() {
        return new b(true).c(d()).b(b1);
    }

    public static UD0 i() {
        return h().a();
    }

    @Deprecated
    public static UD0 j(int i, e eVar) {
        return h().c(i).f(eVar).a();
    }

    public static b k() {
        return new b(true).c(1).b(Z);
    }

    public static UD0 l() {
        return k().a();
    }

    @Deprecated
    public static UD0 m(int i, String str, e eVar) {
        return k().c(i).b(str).f(eVar).a();
    }

    @Deprecated
    public static UD0 n(e eVar) {
        return k().f(eVar).a();
    }

    public static b o() {
        return new b(false).c(f()).b("source");
    }

    public static UD0 p() {
        return o().a();
    }

    @Deprecated
    public static UD0 q(int i, String str, e eVar) {
        return o().c(i).b(str).f(eVar).a();
    }

    @Deprecated
    public static UD0 r(e eVar) {
        return o().f(eVar).a();
    }

    public static UD0 s() {
        return new UD0(new ThreadPoolExecutor(0, Integer.MAX_VALUE, c1, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), a1, e.d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.X.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        C2695Cu1.a(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.X.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.X.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.X.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.X.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.X.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.X.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.X.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.X.submit(runnable);
    }

    public String toString() {
        return this.X.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.X.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.X.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.X.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.X.submit(callable);
    }

    /* loaded from: classes.dex */
    public interface e {
        public static final e a = new a();
        public static final e b;
        public static final e c;
        public static final e d;

        /* loaded from: classes.dex */
        public class b implements e {
            @Override // o.UD0.e
            public void a(Throwable th) {
                if (th != null && Log.isLoggable(UD0.Z0, 6)) {
                    Log.e(UD0.Z0, "Request threw uncaught throwable", th);
                }
            }
        }

        /* loaded from: classes.dex */
        public class c implements e {
            @Override // o.UD0.e
            public void a(Throwable th) {
                if (th == null) {
                    return;
                }
                throw new RuntimeException("Request threw uncaught throwable", th);
            }
        }

        static {
            b bVar = new b();
            b = bVar;
            c = new c();
            d = bVar;
        }

        void a(Throwable th);

        /* loaded from: classes.dex */
        public class a implements e {
            @Override // o.UD0.e
            public void a(Throwable th) {
            }
        }
    }
}
