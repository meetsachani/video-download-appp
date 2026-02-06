package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o.AbstractC10097uw0;

@InterfaceC5601ca0
@InterfaceC10420wF0
/* loaded from: classes3.dex */
public abstract class A3<I, O, F, T> extends AbstractC10097uw0.a<O> implements Runnable {
    @MB
    public InterfaceFutureC8411o11<? extends I> d1;
    @MB
    public F e1;

    /* loaded from: classes3.dex */
    public static final class a<I, O> extends A3<I, O, InterfaceC2731Df<? super I, ? extends O>, InterfaceFutureC8411o11<? extends O>> {
        public a(InterfaceFutureC8411o11<? extends I> interfaceFutureC8411o11, InterfaceC2731Df<? super I, ? extends O> interfaceC2731Df) {
            super(interfaceFutureC8411o11, interfaceC2731Df);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.A3
        /* renamed from: R */
        public InterfaceFutureC8411o11<? extends O> P(InterfaceC2731Df<? super I, ? extends O> interfaceC2731Df, @InterfaceC7165iy1 I i) throws Exception {
            InterfaceFutureC8411o11<? extends O> apply = interfaceC2731Df.apply(i);
            C10664xF1.V(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC2731Df);
            return apply;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.A3
        /* renamed from: S */
        public void Q(InterfaceFutureC8411o11<? extends O> interfaceFutureC8411o11) {
            D(interfaceFutureC8411o11);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b<I, O> extends A3<I, O, YA0<? super I, ? extends O>, O> {
        public b(InterfaceFutureC8411o11<? extends I> interfaceFutureC8411o11, YA0<? super I, ? extends O> ya0) {
            super(interfaceFutureC8411o11, ya0);
        }

        @Override // o.A3
        public void Q(@InterfaceC7165iy1 O o2) {
            B(o2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.A3
        @InterfaceC7165iy1
        /* renamed from: R */
        public O P(YA0<? super I, ? extends O> ya0, @InterfaceC7165iy1 I i) {
            return ya0.apply(i);
        }
    }

    public A3(InterfaceFutureC8411o11<? extends I> interfaceFutureC8411o11, F f) {
        this.d1 = (InterfaceFutureC8411o11) C10664xF1.E(interfaceFutureC8411o11);
        this.e1 = (F) C10664xF1.E(f);
    }

    public static <I, O> InterfaceFutureC8411o11<O> N(InterfaceFutureC8411o11<I> interfaceFutureC8411o11, InterfaceC2731Df<? super I, ? extends O> interfaceC2731Df, Executor executor) {
        C10664xF1.E(executor);
        a aVar = new a(interfaceFutureC8411o11, interfaceC2731Df);
        interfaceFutureC8411o11.h4(aVar, C3645Mk1.p(executor, aVar));
        return aVar;
    }

    public static <I, O> InterfaceFutureC8411o11<O> O(InterfaceFutureC8411o11<I> interfaceFutureC8411o11, YA0<? super I, ? extends O> ya0, Executor executor) {
        C10664xF1.E(ya0);
        b bVar = new b(interfaceFutureC8411o11, ya0);
        interfaceFutureC8411o11.h4(bVar, C3645Mk1.p(executor, bVar));
        return bVar;
    }

    @InterfaceC6919hx0
    @InterfaceC7165iy1
    public abstract T P(F f, @InterfaceC7165iy1 I i) throws Exception;

    @InterfaceC6919hx0
    public abstract void Q(@InterfaceC7165iy1 T t);

    @Override // o.Q0
    public final void m() {
        x(this.d1);
        this.d1 = null;
        this.e1 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceFutureC8411o11<? extends I> interfaceFutureC8411o11 = this.d1;
        F f = this.e1;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (interfaceFutureC8411o11 == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (f != null) {
            z2 = false;
        }
        if (z3 | z2) {
            return;
        }
        this.d1 = null;
        if (interfaceFutureC8411o11.isCancelled()) {
            D(interfaceFutureC8411o11);
            return;
        }
        try {
            try {
                Object P = P(f, C6980iC0.h(interfaceFutureC8411o11));
                this.e1 = null;
                Q(P);
            } catch (Throwable th) {
                try {
                    C(th);
                } finally {
                    this.e1 = null;
                }
            }
        } catch (Error e) {
            C(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            C(e2);
        } catch (ExecutionException e3) {
            C(e3.getCause());
        }
    }

    @Override // o.Q0
    @MB
    public String y() {
        String str;
        InterfaceFutureC8411o11<? extends I> interfaceFutureC8411o11 = this.d1;
        F f = this.e1;
        String y = super.y();
        if (interfaceFutureC8411o11 != null) {
            String valueOf = String.valueOf(interfaceFutureC8411o11);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (f != null) {
            String valueOf2 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + valueOf2.length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append(C6566gU0.g);
            return sb2.toString();
        } else if (y != null) {
            String valueOf3 = String.valueOf(str);
            if (y.length() != 0) {
                return valueOf3.concat(y);
            }
            return new String(valueOf3);
        } else {
            return null;
        }
    }
}
