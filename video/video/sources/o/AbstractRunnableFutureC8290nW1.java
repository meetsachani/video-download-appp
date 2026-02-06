package o;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
/* renamed from: o.nW1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableFutureC8290nW1<R, E extends Exception> implements RunnableFuture<R> {
    @InterfaceC11300zs1
    public Exception Y0;
    @InterfaceC11300zs1
    public R Z0;
    @InterfaceC11300zs1
    public Thread a1;
    public boolean b1;
    public final CJ X = new CJ();
    public final CJ Y = new CJ();
    public final Object Z = new Object();

    public final void a() {
        this.Y.c();
    }

    public final void b() {
        this.X.c();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.Z) {
            try {
                if (!this.b1 && !this.Y.e()) {
                    this.b1 = true;
                    c();
                    Thread thread = this.a1;
                    if (thread != null) {
                        if (z) {
                            thread.interrupt();
                        }
                    } else {
                        this.X.f();
                        this.Y.f();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @HA2
    public abstract R d() throws Exception;

    @HA2
    public final R e() throws ExecutionException {
        if (!this.b1) {
            if (this.Y0 == null) {
                return this.Z0;
            }
            throw new ExecutionException(this.Y0);
        }
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    @HA2
    public final R get() throws ExecutionException, InterruptedException {
        this.Y.a();
        return e();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.Y.e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.Z) {
            try {
                if (this.b1) {
                    return;
                }
                this.a1 = Thread.currentThread();
                this.X.f();
                try {
                    try {
                        this.Z0 = d();
                        synchronized (this.Z) {
                            this.Y.f();
                            this.a1 = null;
                            Thread.interrupted();
                        }
                    } catch (Exception e) {
                        this.Y0 = e;
                        synchronized (this.Z) {
                            this.Y.f();
                            this.a1 = null;
                            Thread.interrupted();
                        }
                    }
                } catch (Throwable th) {
                    synchronized (this.Z) {
                        this.Y.f();
                        this.a1 = null;
                        Thread.interrupted();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    @HA2
    public final R get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.Y.b(TimeUnit.MILLISECONDS.convert(j, timeUnit))) {
            return e();
        }
        throw new TimeoutException();
    }

    public void c() {
    }
}
