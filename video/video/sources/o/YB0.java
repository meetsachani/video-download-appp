package o;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.C3679Mt;

/* loaded from: classes.dex */
public class YB0<V> implements InterfaceFutureC8411o11<V> {
    public final InterfaceFutureC8411o11<V> X;
    public C3679Mt.a<V> Y;

    /* loaded from: classes.dex */
    public class a implements C3679Mt.c<V> {
        public a() {
        }

        @Override // o.C3679Mt.c
        public Object a(C3679Mt.a<V> aVar) {
            boolean z;
            if (YB0.this.Y == null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "The result can only set once!");
            YB0.this.Y = aVar;
            return "FutureChain[" + YB0.this + C6566gU0.g;
        }
    }

    public YB0(InterfaceFutureC8411o11<V> interfaceFutureC8411o11) {
        this.X = (InterfaceFutureC8411o11) C10907yF1.l(interfaceFutureC8411o11);
    }

    public static <V> YB0<V> b(InterfaceFutureC8411o11<V> interfaceFutureC8411o11) {
        if (interfaceFutureC8411o11 instanceof YB0) {
            return (YB0) interfaceFutureC8411o11;
        }
        return new YB0<>(interfaceFutureC8411o11);
    }

    public final void a(XB0<? super V> xb0, Executor executor) {
        C7221jC0.b(this, xb0, executor);
    }

    public boolean c(V v) {
        C3679Mt.a<V> aVar = this.Y;
        if (aVar != null) {
            return aVar.c(v);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.X.cancel(z);
    }

    public boolean d(Throwable th) {
        C3679Mt.a<V> aVar = this.Y;
        if (aVar != null) {
            return aVar.f(th);
        }
        return false;
    }

    public final <T> YB0<T> e(InterfaceC6490gB0<? super V, T> interfaceC6490gB0, Executor executor) {
        return (YB0) C7221jC0.n(this, interfaceC6490gB0, executor);
    }

    public final <T> YB0<T> f(InterfaceC2829Ef<? super V, T> interfaceC2829Ef, Executor executor) {
        return (YB0) C7221jC0.o(this, interfaceC2829Ef, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return this.X.get();
    }

    @Override // o.InterfaceFutureC8411o11
    public void h4(Runnable runnable, Executor executor) {
        this.X.h4(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.X.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.X.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.X.get(j, timeUnit);
    }

    public YB0() {
        this.X = C3679Mt.a(new a());
    }
}
