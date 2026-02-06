package o;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import o.AbstractC10097uw0;

@InterfaceC5601ca0
@InterfaceC10420wF0
/* loaded from: classes3.dex */
public class Iu2<V> extends AbstractC10097uw0.a<V> implements RunnableFuture<V> {
    @MB
    public volatile TS0<?> d1;

    /* loaded from: classes3.dex */
    public final class a extends TS0<InterfaceFutureC8411o11<V>> {
        public final InterfaceC2535Bf<V> Y0;

        public a(InterfaceC2535Bf<V> interfaceC2535Bf) {
            this.Y0 = (InterfaceC2535Bf) C10664xF1.E(interfaceC2535Bf);
        }

        @Override // o.TS0
        public void a(Throwable th) {
            Iu2.this.C(th);
        }

        @Override // o.TS0
        public final boolean d() {
            return Iu2.this.isDone();
        }

        @Override // o.TS0
        public String f() {
            return this.Y0.toString();
        }

        @Override // o.TS0
        /* renamed from: h */
        public void b(InterfaceFutureC8411o11<V> interfaceFutureC8411o11) {
            Iu2.this.D(interfaceFutureC8411o11);
        }

        @Override // o.TS0
        /* renamed from: i */
        public InterfaceFutureC8411o11<V> e() throws Exception {
            return (InterfaceFutureC8411o11) C10664xF1.V(this.Y0.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.Y0);
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends TS0<V> {
        public final Callable<V> Y0;

        public b(Callable<V> callable) {
            this.Y0 = (Callable) C10664xF1.E(callable);
        }

        @Override // o.TS0
        public void a(Throwable th) {
            Iu2.this.C(th);
        }

        @Override // o.TS0
        public void b(@InterfaceC7165iy1 V v) {
            Iu2.this.B(v);
        }

        @Override // o.TS0
        public final boolean d() {
            return Iu2.this.isDone();
        }

        @Override // o.TS0
        @InterfaceC7165iy1
        public V e() throws Exception {
            return this.Y0.call();
        }

        @Override // o.TS0
        public String f() {
            return this.Y0.toString();
        }
    }

    public Iu2(Callable<V> callable) {
        this.d1 = new b(callable);
    }

    public static <V> Iu2<V> N(Runnable runnable, @InterfaceC7165iy1 V v) {
        return new Iu2<>(Executors.callable(runnable, v));
    }

    public static <V> Iu2<V> O(Callable<V> callable) {
        return new Iu2<>(callable);
    }

    public static <V> Iu2<V> P(InterfaceC2535Bf<V> interfaceC2535Bf) {
        return new Iu2<>(interfaceC2535Bf);
    }

    @Override // o.Q0
    public void m() {
        TS0<?> ts0;
        super.m();
        if (E() && (ts0 = this.d1) != null) {
            ts0.c();
        }
        this.d1 = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        TS0<?> ts0 = this.d1;
        if (ts0 != null) {
            ts0.run();
        }
        this.d1 = null;
    }

    @Override // o.Q0
    @MB
    public String y() {
        TS0<?> ts0 = this.d1;
        if (ts0 != null) {
            String valueOf = String.valueOf(ts0);
            StringBuilder sb = new StringBuilder(valueOf.length() + 7);
            sb.append("task=[");
            sb.append(valueOf);
            sb.append(C6566gU0.g);
            return sb.toString();
        }
        return super.y();
    }

    public Iu2(InterfaceC2535Bf<V> interfaceC2535Bf) {
        this.d1 = new a(interfaceC2535Bf);
    }
}
