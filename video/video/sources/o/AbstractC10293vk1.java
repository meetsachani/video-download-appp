package o;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.vk1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10293vk1<Params, Progress, Result> {
    public static final String a1 = "AsyncTask";
    public static final int b1 = 5;
    public static final int c1 = 128;
    public static final int d1 = 1;
    public static final ThreadFactory e1;
    public static final BlockingQueue<Runnable> f1;
    public static final Executor g1;
    public static final int h1 = 1;
    public static final int i1 = 2;
    public static f j1;
    public static volatile Executor k1;
    public final h<Params, Result> X;
    public final FutureTask<Result> Y;
    public volatile g Z = g.PENDING;
    public final AtomicBoolean Y0 = new AtomicBoolean();
    public final AtomicBoolean Z0 = new AtomicBoolean();

    /* renamed from: o.vk1$a */
    /* loaded from: classes.dex */
    public static class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.a.getAndIncrement());
        }
    }

    /* renamed from: o.vk1$b */
    /* loaded from: classes.dex */
    public class b extends h<Params, Result> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            AbstractC10293vk1.this.Z0.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) AbstractC10293vk1.this.b(this.a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* renamed from: o.vk1$c */
    /* loaded from: classes.dex */
    public class c extends FutureTask<Result> {
        public c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                AbstractC10293vk1.this.r(get());
            } catch (InterruptedException e) {
                Log.w(AbstractC10293vk1.a1, e);
            } catch (CancellationException unused) {
                AbstractC10293vk1.this.r(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: o.vk1$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: o.vk1$e */
    /* loaded from: classes.dex */
    public static class e<Data> {
        public final AbstractC10293vk1 a;
        public final Data[] b;

        public e(AbstractC10293vk1 abstractC10293vk1, Data... dataArr) {
            this.a = abstractC10293vk1;
            this.b = dataArr;
        }
    }

    /* renamed from: o.vk1$f */
    /* loaded from: classes.dex */
    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                eVar.a.p(eVar.b);
                return;
            }
            eVar.a.f(eVar.b[0]);
        }
    }

    /* renamed from: o.vk1$g */
    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: o.vk1$h */
    /* loaded from: classes.dex */
    public static abstract class h<Params, Result> implements Callable<Result> {
        public Params[] a;
    }

    static {
        a aVar = new a();
        e1 = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f1 = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        g1 = threadPoolExecutor;
        k1 = threadPoolExecutor;
    }

    public AbstractC10293vk1() {
        b bVar = new b();
        this.X = bVar;
        this.Y = new c(bVar);
    }

    public static void d(Runnable runnable) {
        k1.execute(runnable);
    }

    public static Handler i() {
        f fVar;
        synchronized (AbstractC10293vk1.class) {
            try {
                if (j1 == null) {
                    j1 = new f();
                }
                fVar = j1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static void t(Executor executor) {
        k1 = executor;
    }

    public final boolean a(boolean z) {
        this.Y0.set(true);
        return this.Y.cancel(z);
    }

    public abstract Result b(Params... paramsArr);

    public final AbstractC10293vk1<Params, Progress, Result> c(Params... paramsArr) {
        return e(k1, paramsArr);
    }

    public final AbstractC10293vk1<Params, Progress, Result> e(Executor executor, Params... paramsArr) {
        if (this.Z != g.PENDING) {
            int i = d.a[this.Z.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("We should never reach this state");
                }
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        this.Z = g.RUNNING;
        o();
        this.X.a = paramsArr;
        executor.execute(this.Y);
        return this;
    }

    public void f(Result result) {
        if (k()) {
            m(result);
        } else {
            n(result);
        }
        this.Z = g.FINISHED;
    }

    public final Result g() throws InterruptedException, ExecutionException {
        return this.Y.get();
    }

    public final Result h(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.Y.get(j, timeUnit);
    }

    public final g j() {
        return this.Z;
    }

    public final boolean k() {
        return this.Y0.get();
    }

    public void m(Result result) {
        l();
    }

    public Result q(Result result) {
        i().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    public void r(Result result) {
        if (!this.Z0.get()) {
            q(result);
        }
    }

    public final void s(Progress... progressArr) {
        if (!k()) {
            i().obtainMessage(2, new e(this, progressArr)).sendToTarget();
        }
    }

    public void l() {
    }

    public void o() {
    }

    public void n(Result result) {
    }

    public void p(Progress... progressArr) {
    }
}
