package o;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import o.AbstractC5737d8;

@InterfaceC5601ca0
@InterfaceC10420wF0
/* loaded from: classes3.dex */
public final class FG<V> extends AbstractC5737d8<Object, V> {
    @MB
    public FG<V>.c<?> l1;

    /* loaded from: classes3.dex */
    public final class a extends FG<V>.c<InterfaceFutureC8411o11<V>> {
        public final InterfaceC2535Bf<V> a1;

        public a(InterfaceC2535Bf<V> interfaceC2535Bf, Executor executor) {
            super(executor);
            this.a1 = (InterfaceC2535Bf) C10664xF1.E(interfaceC2535Bf);
        }

        @Override // o.TS0
        public String f() {
            return this.a1.toString();
        }

        @Override // o.TS0
        /* renamed from: j */
        public InterfaceFutureC8411o11<V> e() throws Exception {
            return (InterfaceFutureC8411o11) C10664xF1.V(this.a1.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.a1);
        }

        @Override // o.FG.c
        /* renamed from: k */
        public void i(InterfaceFutureC8411o11<V> interfaceFutureC8411o11) {
            FG.this.D(interfaceFutureC8411o11);
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends FG<V>.c<V> {
        public final Callable<V> a1;

        public b(Callable<V> callable, Executor executor) {
            super(executor);
            this.a1 = (Callable) C10664xF1.E(callable);
        }

        @Override // o.TS0
        @InterfaceC7165iy1
        public V e() throws Exception {
            return this.a1.call();
        }

        @Override // o.TS0
        public String f() {
            return this.a1.toString();
        }

        @Override // o.FG.c
        public void i(@InterfaceC7165iy1 V v) {
            FG.this.B(v);
        }
    }

    /* loaded from: classes3.dex */
    public abstract class c<T> extends TS0<T> {
        public final Executor Y0;

        public c(Executor executor) {
            this.Y0 = (Executor) C10664xF1.E(executor);
        }

        @Override // o.TS0
        public final void a(Throwable th) {
            FG.this.l1 = null;
            if (th instanceof ExecutionException) {
                FG.this.C(((ExecutionException) th).getCause());
            } else if (th instanceof CancellationException) {
                FG.this.cancel(false);
            } else {
                FG.this.C(th);
            }
        }

        @Override // o.TS0
        public final void b(@InterfaceC7165iy1 T t) {
            FG.this.l1 = null;
            i(t);
        }

        @Override // o.TS0
        public final boolean d() {
            return FG.this.isDone();
        }

        public final void h() {
            try {
                this.Y0.execute(this);
            } catch (RejectedExecutionException e) {
                FG.this.C(e);
            }
        }

        public abstract void i(@InterfaceC7165iy1 T t);
    }

    public FG(TN0<? extends InterfaceFutureC8411o11<?>> tn0, boolean z, Executor executor, InterfaceC2535Bf<V> interfaceC2535Bf) {
        super(tn0, z, false);
        this.l1 = new a(interfaceC2535Bf, executor);
        U();
    }

    @Override // o.AbstractC5737d8
    public void S() {
        FG<V>.c<?> cVar = this.l1;
        if (cVar != null) {
            cVar.h();
        }
    }

    @Override // o.AbstractC5737d8
    public void X(AbstractC5737d8.a aVar) {
        super.X(aVar);
        if (aVar == AbstractC5737d8.a.OUTPUT_FUTURE_DONE) {
            this.l1 = null;
        }
    }

    @Override // o.Q0
    public void w() {
        FG<V>.c<?> cVar = this.l1;
        if (cVar != null) {
            cVar.c();
        }
    }

    public FG(TN0<? extends InterfaceFutureC8411o11<?>> tn0, boolean z, Executor executor, Callable<V> callable) {
        super(tn0, z, false);
        this.l1 = new b(callable, executor);
        U();
    }

    @Override // o.AbstractC5737d8
    public void P(int i, @MB Object obj) {
    }
}
