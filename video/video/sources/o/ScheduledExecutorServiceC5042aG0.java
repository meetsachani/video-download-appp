package o;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import o.C3679Mt;

/* renamed from: o.aG0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ScheduledExecutorServiceC5042aG0 extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {
    public static ThreadLocal<ScheduledExecutorService> Y = new a();
    public final Handler X;

    /* renamed from: o.aG0$a */
    /* loaded from: classes.dex */
    public class a extends ThreadLocal<ScheduledExecutorService> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return C5211ay.f();
            }
            if (Looper.myLooper() != null) {
                return new ScheduledExecutorServiceC5042aG0(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* renamed from: o.aG0$b */
    /* loaded from: classes.dex */
    public class b implements Callable<Void> {
        public final /* synthetic */ Runnable a;

        public b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            this.a.run();
            return null;
        }
    }

    /* renamed from: o.aG0$c */
    /* loaded from: classes.dex */
    public static class c<V> implements RunnableScheduledFuture<V> {
        public final AtomicReference<C3679Mt.a<V>> X = new AtomicReference<>(null);
        public final long Y;
        public final InterfaceFutureC8411o11<V> Y0;
        public final Callable<V> Z;

        /* renamed from: o.aG0$c$a */
        /* loaded from: classes.dex */
        public class a implements C3679Mt.c<V> {
            public final /* synthetic */ Handler a;
            public final /* synthetic */ Callable b;

            /* renamed from: o.aG0$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0258a implements Runnable {
                public RunnableC0258a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.X.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.a.removeCallbacks(c.this);
                    }
                }
            }

            public a(Handler handler, Callable callable) {
                this.a = handler;
                this.b = callable;
            }

            @Override // o.C3679Mt.c
            public Object a(C3679Mt.a<V> aVar) throws RejectedExecutionException {
                aVar.a(new RunnableC0258a(), C5211ay.b());
                c.this.X.set(aVar);
                return "HandlerScheduledFuture-" + this.b.toString();
            }
        }

        public c(Handler handler, long j, Callable<V> callable) {
            this.Y = j;
            this.Z = callable;
            this.Y0 = C3679Mt.a(new a(handler, callable));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.Y0.cancel(z);
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public V get() throws ExecutionException, InterruptedException {
            return this.Y0.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.Y - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.Y0.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.Y0.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            C3679Mt.a<V> andSet = this.X.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.c(this.Z.call());
                } catch (Exception e) {
                    andSet.f(e);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.Y0.get(j, timeUnit);
        }
    }

    public ScheduledExecutorServiceC5042aG0(Handler handler) {
        this.X = handler;
    }

    public static ScheduledExecutorService f() {
        ScheduledExecutorService scheduledExecutorService = Y.get();
        if (scheduledExecutorService == null) {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                ScheduledExecutorServiceC5042aG0 scheduledExecutorServiceC5042aG0 = new ScheduledExecutorServiceC5042aG0(new Handler(myLooper));
                Y.set(scheduledExecutorServiceC5042aG0);
                return scheduledExecutorServiceC5042aG0;
            }
            throw new IllegalStateException("Current thread has no looper!");
        }
        return scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5042aG0.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        C2695Cu1.a(this);
    }

    public final RejectedExecutionException d() {
        return new RejectedExecutionException(this.X + " is shutting down");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (this.X.post(runnable)) {
            return;
        }
        throw d();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new b(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5042aG0.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5042aG0.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5042aG0.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC5042aG0.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        c cVar = new c(this.X, uptimeMillis, callable);
        return this.X.postAtTime(cVar, uptimeMillis) ? cVar : C7221jC0.g(d());
    }
}
