package o;

import android.os.SystemClock;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.DT1;

/* renamed from: o.iS1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class FutureC7045iS1<T> implements Future<T>, DT1.b<T>, DT1.a {
    public AbstractC5091aS1<?> X;
    public boolean Y = false;
    public C6524gJ2 Y0;
    public T Z;

    public static <E> FutureC7045iS1<E> e() {
        return new FutureC7045iS1<>();
    }

    @Override // o.DT1.a
    public synchronized void a(C6524gJ2 c6524gJ2) {
        this.Y0 = c6524gJ2;
        notifyAll();
    }

    @Override // o.DT1.b
    public synchronized void b(T t) {
        this.Y = true;
        this.Z = t;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z) {
        if (this.X == null) {
            return false;
        }
        if (isDone()) {
            return false;
        }
        this.X.h();
        return true;
    }

    public final synchronized T d(Long l) throws InterruptedException, ExecutionException, TimeoutException {
        if (this.Y0 == null) {
            if (this.Y) {
                return this.Z;
            }
            if (l == null) {
                while (!isDone()) {
                    wait(0L);
                }
            } else if (l.longValue() > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long longValue = l.longValue() + uptimeMillis;
                while (!isDone() && uptimeMillis < longValue) {
                    wait(longValue - uptimeMillis);
                    uptimeMillis = SystemClock.uptimeMillis();
                }
            }
            if (this.Y0 == null) {
                if (this.Y) {
                    return this.Z;
                }
                throw new TimeoutException();
            }
            throw new ExecutionException(this.Y0);
        }
        throw new ExecutionException(this.Y0);
    }

    public void f(AbstractC5091aS1<?> abstractC5091aS1) {
        this.X = abstractC5091aS1;
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        try {
            return d(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        AbstractC5091aS1<?> abstractC5091aS1 = this.X;
        if (abstractC5091aS1 == null) {
            return false;
        }
        return abstractC5091aS1.K();
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.Y && this.Y0 == null) {
            if (!isCancelled()) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return d(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }
}
