package o;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class KN0<V> implements InterfaceFutureC8411o11<V> {
    public static final String X = "ImmediateFuture";

    /* loaded from: classes.dex */
    public static class a<V> extends KN0<V> {
        public final Throwable Y;

        public a(Throwable th) {
            this.Y = th;
        }

        @Override // o.KN0, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.Y);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.Y + "]]";
        }
    }

    /* loaded from: classes.dex */
    public static final class b<V> extends a<V> implements ScheduledFuture<V> {
        public b(Throwable th) {
            super(th);
        }

        @Override // java.lang.Comparable
        /* renamed from: g */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* loaded from: classes.dex */
    public static final class c<V> extends KN0<V> {
        public static final KN0<Object> Z = new c(null);
        public final V Y;

        public c(V v) {
            this.Y = v;
        }

        @Override // o.KN0, java.util.concurrent.Future
        public V get() {
            return this.Y;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.Y + "]]";
        }
    }

    public static <V> InterfaceFutureC8411o11<V> e() {
        return c.Z;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws ExecutionException;

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        C10907yF1.l(timeUnit);
        return get();
    }

    @Override // o.InterfaceFutureC8411o11
    public void h4(Runnable runnable, Executor executor) {
        C10907yF1.l(runnable);
        C10907yF1.l(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            C7433k41.d(X, "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
