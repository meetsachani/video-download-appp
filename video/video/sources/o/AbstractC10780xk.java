package o;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: o.xk  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC10780xk<T> implements InterfaceC9217rJ<T> {
    public ExecutorService a;
    public ExecutorService b;
    public Future<T> c;

    /* renamed from: o.xk$a */
    /* loaded from: classes4.dex */
    public class a implements Callable<T> {
        public final ExecutorService a;

        public a(ExecutorService executorService) {
            this.a = executorService;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            try {
                return (T) AbstractC10780xk.this.g();
            } finally {
                ExecutorService executorService = this.a;
                if (executorService != null) {
                    executorService.shutdown();
                }
            }
        }
    }

    public AbstractC10780xk() {
        this(null);
    }

    public final ExecutorService a() {
        return Executors.newFixedThreadPool(f());
    }

    public final Callable<T> b(ExecutorService executorService) {
        return new a(executorService);
    }

    public final synchronized ExecutorService c() {
        return this.b;
    }

    public final synchronized ExecutorService d() {
        return this.a;
    }

    public synchronized Future<T> e() {
        Future<T> future;
        future = this.c;
        if (future == null) {
            throw new IllegalStateException("start() must be called first!");
        }
        return future;
    }

    public int f() {
        return 1;
    }

    public abstract T g() throws Exception;

    @Override // o.InterfaceC9217rJ
    public T get() throws C8725pJ {
        try {
            return e().get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new C8725pJ(e);
        } catch (ExecutionException e2) {
            C10435wJ.g(e2);
            return null;
        }
    }

    public synchronized boolean h() {
        boolean z;
        if (this.c != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void i(ExecutorService executorService) {
        if (!h()) {
            this.a = executorService;
        } else {
            throw new IllegalStateException("Cannot set ExecutorService after start()!");
        }
    }

    public synchronized boolean j() {
        ExecutorService executorService;
        try {
            if (!h()) {
                ExecutorService d = d();
                this.b = d;
                if (d == null) {
                    executorService = a();
                    this.b = executorService;
                } else {
                    executorService = null;
                }
                this.c = this.b.submit(b(executorService));
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public AbstractC10780xk(ExecutorService executorService) {
        i(executorService);
    }
}
