package o;

import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o.AbstractC10097uw0;

@InterfaceC5601ca0
@InterfaceC10420wF0
/* renamed from: o.h0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC6688h0<V, X extends Throwable, F, T> extends AbstractC10097uw0.a<V> implements Runnable {
    @MB
    public InterfaceFutureC8411o11<? extends V> d1;
    @MB
    public Class<X> e1;
    @MB
    public F f1;

    /* renamed from: o.h0$a */
    /* loaded from: classes3.dex */
    public static final class a<V, X extends Throwable> extends AbstractRunnableC6688h0<V, X, InterfaceC2731Df<? super X, ? extends V>, InterfaceFutureC8411o11<? extends V>> {
        public a(InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11, Class<X> cls, InterfaceC2731Df<? super X, ? extends V> interfaceC2731Df) {
            super(interfaceFutureC8411o11, cls, interfaceC2731Df);
        }

        @Override // o.AbstractRunnableC6688h0
        /* renamed from: R */
        public InterfaceFutureC8411o11<? extends V> P(InterfaceC2731Df<? super X, ? extends V> interfaceC2731Df, X x) throws Exception {
            InterfaceFutureC8411o11<? extends V> apply = interfaceC2731Df.apply(x);
            C10664xF1.V(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC2731Df);
            return apply;
        }

        @Override // o.AbstractRunnableC6688h0
        /* renamed from: S */
        public void Q(InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11) {
            D(interfaceFutureC8411o11);
        }
    }

    /* renamed from: o.h0$b */
    /* loaded from: classes3.dex */
    public static final class b<V, X extends Throwable> extends AbstractRunnableC6688h0<V, X, YA0<? super X, ? extends V>, V> {
        public b(InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11, Class<X> cls, YA0<? super X, ? extends V> ya0) {
            super(interfaceFutureC8411o11, cls, ya0);
        }

        @Override // o.AbstractRunnableC6688h0
        public void Q(@InterfaceC7165iy1 V v) {
            B(v);
        }

        @Override // o.AbstractRunnableC6688h0
        @InterfaceC7165iy1
        /* renamed from: R */
        public V P(YA0<? super X, ? extends V> ya0, X x) throws Exception {
            return ya0.apply(x);
        }
    }

    public AbstractRunnableC6688h0(InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11, Class<X> cls, F f) {
        this.d1 = (InterfaceFutureC8411o11) C10664xF1.E(interfaceFutureC8411o11);
        this.e1 = (Class) C10664xF1.E(cls);
        this.f1 = (F) C10664xF1.E(f);
    }

    public static <X extends Throwable, V> InterfaceFutureC8411o11<V> N(InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11, Class<X> cls, InterfaceC2731Df<? super X, ? extends V> interfaceC2731Df, Executor executor) {
        a aVar = new a(interfaceFutureC8411o11, cls, interfaceC2731Df);
        interfaceFutureC8411o11.h4(aVar, C3645Mk1.p(executor, aVar));
        return aVar;
    }

    public static <V, X extends Throwable> InterfaceFutureC8411o11<V> O(InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11, Class<X> cls, YA0<? super X, ? extends V> ya0, Executor executor) {
        b bVar = new b(interfaceFutureC8411o11, cls, ya0);
        interfaceFutureC8411o11.h4(bVar, C3645Mk1.p(executor, bVar));
        return bVar;
    }

    @InterfaceC6919hx0
    @InterfaceC7165iy1
    public abstract T P(F f, X x) throws Exception;

    @InterfaceC6919hx0
    public abstract void Q(@InterfaceC7165iy1 T t);

    @Override // o.Q0
    public final void m() {
        x(this.d1);
        this.d1 = null;
        this.e1 = null;
        this.f1 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Class<X extends java.lang.Throwable>, F] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        Object obj;
        InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11 = this.d1;
        Class<X> cls = this.e1;
        F f = this.f1;
        boolean z3 = false;
        if (interfaceFutureC8411o11 == null) {
            z = true;
        } else {
            z = false;
        }
        if (cls == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z | z2;
        if (f == null) {
            z3 = true;
        }
        if (!(z3 | z4) && !isCancelled()) {
            ?? r3 = (Class<X>) false;
            this.d1 = null;
            try {
                if (interfaceFutureC8411o11 instanceof AS0) {
                    th = BS0.a((AS0) interfaceFutureC8411o11);
                } else {
                    th = null;
                }
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    String valueOf = String.valueOf(interfaceFutureC8411o11.getClass());
                    String valueOf2 = String.valueOf(e.getClass());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 35 + valueOf2.length());
                    sb.append("Future type ");
                    sb.append(valueOf);
                    sb.append(" threw ");
                    sb.append(valueOf2);
                    sb.append(" without a cause");
                    cause = new NullPointerException(sb.toString());
                }
                th = cause;
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                obj = C6980iC0.h(interfaceFutureC8411o11);
                if (th != null) {
                    B(C2589Bs1.a(obj));
                    return;
                } else if (!C8216nD1.a(th, cls)) {
                    D(interfaceFutureC8411o11);
                    return;
                } else {
                    try {
                        Object P = P(f, th);
                        this.e1 = null;
                        this.f1 = null;
                        Q(P);
                        return;
                    } catch (Throwable th2) {
                        try {
                            C(th2);
                            return;
                        } finally {
                            this.e1 = null;
                            this.f1 = null;
                        }
                    }
                }
            }
            obj = null;
            if (th != null) {
            }
        }
    }

    @Override // o.Q0
    @MB
    public String y() {
        String str;
        InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11 = this.d1;
        Class<X> cls = this.e1;
        F f = this.f1;
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
        if (cls != null && f != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + valueOf2.length() + valueOf3.length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(valueOf2);
            sb2.append("], fallback=[");
            sb2.append(valueOf3);
            sb2.append(C6566gU0.g);
            return sb2.toString();
        } else if (y != null) {
            String valueOf4 = String.valueOf(str);
            if (y.length() != 0) {
                return valueOf4.concat(y);
            }
            return new String(valueOf4);
        } else {
            return null;
        }
    }
}
