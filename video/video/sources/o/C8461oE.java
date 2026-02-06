package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C6980iC0;

@InterfaceC5601ca0
@L40("Use ClosingFuture.from(Futures.immediate*Future)")
/* renamed from: o.oE  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8461oE<V> {
    public static final Logger d = Logger.getLogger(C8461oE.class.getName());
    public final AtomicReference<y> a;
    public final o b;
    public final AbstractC10097uw0<V> c;

    /* renamed from: o.oE$A */
    /* loaded from: classes3.dex */
    public interface A<V> {
        void a(z<V> zVar);
    }

    /* renamed from: o.oE$a  reason: case insensitive filesystem */
    /* loaded from: classes3.dex */
    public class RunnableC8462a implements Runnable {
        public final /* synthetic */ A X;

        public RunnableC8462a(A a) {
            this.X = a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8461oE.x(this.X, C8461oE.this);
        }
    }

    /* renamed from: o.oE$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public final /* synthetic */ Closeable X;

        public b(Closeable closeable) {
            this.X = closeable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.X.close();
            } catch (IOException | RuntimeException e) {
                C8461oE.d.log(Level.WARNING, "thrown by close()", e);
            }
        }
    }

    /* renamed from: o.oE$c */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[y.values().length];
            a = iArr;
            try {
                iArr[y.SUBSUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[y.WILL_CREATE_VALUE_AND_CLOSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[y.WILL_CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[y.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[y.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[y.OPEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: o.oE$e */
    /* loaded from: classes3.dex */
    public class e implements Callable<V> {
        public final /* synthetic */ p a;

        public e(p pVar) {
            this.a = pVar;
        }

        @Override // java.util.concurrent.Callable
        @InterfaceC7165iy1
        public V call() throws Exception {
            return (V) this.a.a(C8461oE.this.b.X);
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* renamed from: o.oE$f */
    /* loaded from: classes3.dex */
    public class f implements InterfaceC2535Bf<V> {
        public final /* synthetic */ m a;

        public f(m mVar) {
            this.a = mVar;
        }

        @Override // o.InterfaceC2535Bf
        public InterfaceFutureC8411o11<V> call() throws Exception {
            o oVar = new o(null);
            try {
                C8461oE<V> a = this.a.a(oVar.X);
                a.i(C8461oE.this.b);
                return a.c;
            } finally {
                C8461oE.this.b.f(oVar, C3645Mk1.c());
            }
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* renamed from: o.oE$g */
    /* loaded from: classes3.dex */
    public class g<U> implements InterfaceC2731Df<V, U> {
        public final /* synthetic */ q a;

        public g(q qVar) {
            this.a = qVar;
        }

        @Override // o.InterfaceC2731Df
        public InterfaceFutureC8411o11<U> apply(V v) throws Exception {
            return C8461oE.this.b.j(this.a, v);
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* renamed from: o.oE$h */
    /* loaded from: classes3.dex */
    public class h<U> implements InterfaceC2731Df<V, U> {
        public final /* synthetic */ n a;

        public h(n nVar) {
            this.a = nVar;
        }

        @Override // o.InterfaceC2731Df
        public InterfaceFutureC8411o11<U> apply(V v) throws Exception {
            return C8461oE.this.b.i(this.a, v);
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* renamed from: o.oE$i */
    /* loaded from: classes3.dex */
    public class i<U> implements n<V, U> {
        public final /* synthetic */ InterfaceC2731Df a;

        public i(InterfaceC2731Df interfaceC2731Df) {
            this.a = interfaceC2731Df;
        }

        @Override // o.C8461oE.n
        public C8461oE<U> a(w wVar, V v) throws Exception {
            return C8461oE.w(this.a.apply(v));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    /* renamed from: o.oE$j */
    /* loaded from: classes3.dex */
    public class j<W, X> implements InterfaceC2731Df<X, W> {
        public final /* synthetic */ q a;

        public j(q qVar) {
            this.a = qVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lo/o11<TW;>; */
        @Override // o.InterfaceC2731Df
        /* renamed from: a */
        public InterfaceFutureC8411o11 apply(Throwable th) throws Exception {
            return C8461oE.this.b.j(this.a, th);
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [W, X] */
    /* renamed from: o.oE$k */
    /* loaded from: classes3.dex */
    public class k<W, X> implements InterfaceC2731Df<X, W> {
        public final /* synthetic */ n a;

        public k(n nVar) {
            this.a = nVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TX;)Lo/o11<TW;>; */
        @Override // o.InterfaceC2731Df
        /* renamed from: a */
        public InterfaceFutureC8411o11 apply(Throwable th) throws Exception {
            return C8461oE.this.b.i(this.a, th);
        }

        public String toString() {
            return this.a.toString();
        }
    }

    /* renamed from: o.oE$l */
    /* loaded from: classes3.dex */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8461oE c8461oE = C8461oE.this;
            y yVar = y.WILL_CLOSE;
            y yVar2 = y.CLOSING;
            c8461oE.o(yVar, yVar2);
            C8461oE.this.p();
            C8461oE.this.o(yVar2, y.CLOSED);
        }
    }

    /* renamed from: o.oE$m */
    /* loaded from: classes3.dex */
    public interface m<V> {
        C8461oE<V> a(w wVar) throws Exception;
    }

    /* renamed from: o.oE$n */
    /* loaded from: classes3.dex */
    public interface n<T, U> {
        C8461oE<U> a(w wVar, @InterfaceC7165iy1 T t) throws Exception;
    }

    /* renamed from: o.oE$p */
    /* loaded from: classes3.dex */
    public interface p<V> {
        @InterfaceC7165iy1
        V a(w wVar) throws Exception;
    }

    /* renamed from: o.oE$q */
    /* loaded from: classes3.dex */
    public interface q<T, U> {
        @InterfaceC7165iy1
        U a(w wVar, @InterfaceC7165iy1 T t) throws Exception;
    }

    @L40("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    /* renamed from: o.oE$r */
    /* loaded from: classes3.dex */
    public static class r {
        public static final YA0<C8461oE<?>, AbstractC10097uw0<?>> d = new c();
        public final o a;
        public final boolean b;
        public final AbstractC5317bO0<C8461oE<?>> c;

        /* renamed from: o.oE$r$a */
        /* loaded from: classes3.dex */
        public class a implements Callable<V> {
            public final /* synthetic */ e a;

            public a(e eVar) {
                this.a = eVar;
            }

            @Override // java.util.concurrent.Callable
            @InterfaceC7165iy1
            public V call() throws Exception {
                return (V) new x(r.this.c, null).c(this.a, r.this.a);
            }

            public String toString() {
                return this.a.toString();
            }
        }

        /* renamed from: o.oE$r$b */
        /* loaded from: classes3.dex */
        public class b implements InterfaceC2535Bf<V> {
            public final /* synthetic */ d a;

            public b(d dVar) {
                this.a = dVar;
            }

            @Override // o.InterfaceC2535Bf
            public InterfaceFutureC8411o11<V> call() throws Exception {
                return new x(r.this.c, null).d(this.a, r.this.a);
            }

            public String toString() {
                return this.a.toString();
            }
        }

        /* renamed from: o.oE$r$c */
        /* loaded from: classes3.dex */
        public class c implements YA0<C8461oE<?>, AbstractC10097uw0<?>> {
            @Override // o.YA0
            /* renamed from: a */
            public AbstractC10097uw0<?> apply(C8461oE<?> c8461oE) {
                return c8461oE.c;
            }
        }

        /* renamed from: o.oE$r$d */
        /* loaded from: classes3.dex */
        public interface d<V> {
            C8461oE<V> a(w wVar, x xVar) throws Exception;
        }

        /* renamed from: o.oE$r$e */
        /* loaded from: classes3.dex */
        public interface e<V> {
            @InterfaceC7165iy1
            V a(w wVar, x xVar) throws Exception;
        }

        public /* synthetic */ r(boolean z, Iterable iterable, d dVar) {
            this(z, iterable);
        }

        public <V> C8461oE<V> b(e<V> eVar, Executor executor) {
            C8461oE<V> c8461oE = new C8461oE<>(d().a(new a(eVar), executor), (d) null);
            c8461oE.b.f(this.a, C3645Mk1.c());
            return c8461oE;
        }

        public <V> C8461oE<V> c(d<V> dVar, Executor executor) {
            C8461oE<V> c8461oE = new C8461oE<>(d().b(new b(dVar), executor), (d) null);
            c8461oE.b.f(this.a, C3645Mk1.c());
            return c8461oE;
        }

        public final C6980iC0.d<Object> d() {
            if (this.b) {
                return C6980iC0.B(e());
            }
            return C6980iC0.z(e());
        }

        public final AbstractC5317bO0<AbstractC10097uw0<?>> e() {
            return AbstractC10343vw0.J(this.c).m0(d).e0();
        }

        public r(boolean z, Iterable<? extends C8461oE<?>> iterable) {
            this.a = new o(null);
            this.b = z;
            this.c = AbstractC5317bO0.D(iterable);
            for (C8461oE<?> c8461oE : iterable) {
                c8461oE.i(this.a);
            }
        }
    }

    /* renamed from: o.oE$s */
    /* loaded from: classes3.dex */
    public static final class s<V1, V2> extends r {
        public final C8461oE<V1> e;
        public final C8461oE<V2> f;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: o.oE$s$a */
        /* loaded from: classes3.dex */
        public class a<U> implements r.e<U> {
            public final /* synthetic */ d a;

            public a(d dVar) {
                this.a = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.C8461oE.r.e
            @InterfaceC7165iy1
            public U a(w wVar, x xVar) throws Exception {
                return (U) this.a.a(wVar, xVar.e(s.this.e), xVar.e(s.this.f));
            }

            public String toString() {
                return this.a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: o.oE$s$b */
        /* loaded from: classes3.dex */
        public class b<U> implements r.d<U> {
            public final /* synthetic */ c a;

            public b(c cVar) {
                this.a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.C8461oE.r.d
            public C8461oE<U> a(w wVar, x xVar) throws Exception {
                return this.a.a(wVar, xVar.e(s.this.e), xVar.e(s.this.f));
            }

            public String toString() {
                return this.a.toString();
            }
        }

        /* renamed from: o.oE$s$c */
        /* loaded from: classes3.dex */
        public interface c<V1, V2, U> {
            C8461oE<U> a(w wVar, @InterfaceC7165iy1 V1 v1, @InterfaceC7165iy1 V2 v2) throws Exception;
        }

        /* renamed from: o.oE$s$d */
        /* loaded from: classes3.dex */
        public interface d<V1, V2, U> {
            @InterfaceC7165iy1
            U a(w wVar, @InterfaceC7165iy1 V1 v1, @InterfaceC7165iy1 V2 v2) throws Exception;
        }

        public /* synthetic */ s(C8461oE c8461oE, C8461oE c8461oE2, d dVar) {
            this(c8461oE, c8461oE2);
        }

        public <U> C8461oE<U> h(d<V1, V2, U> dVar, Executor executor) {
            return (C8461oE<V>) b(new a(dVar), executor);
        }

        public <U> C8461oE<U> i(c<V1, V2, U> cVar, Executor executor) {
            return (C8461oE<V>) c(new b(cVar), executor);
        }

        public s(C8461oE<V1> c8461oE, C8461oE<V2> c8461oE2) {
            super(true, AbstractC5317bO0.Q(c8461oE, c8461oE2), null);
            this.e = c8461oE;
            this.f = c8461oE2;
        }
    }

    /* renamed from: o.oE$t */
    /* loaded from: classes3.dex */
    public static final class t<V1, V2, V3> extends r {
        public final C8461oE<V1> e;
        public final C8461oE<V2> f;
        public final C8461oE<V3> g;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: o.oE$t$a */
        /* loaded from: classes3.dex */
        public class a<U> implements r.e<U> {
            public final /* synthetic */ d a;

            public a(d dVar) {
                this.a = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.C8461oE.r.e
            @InterfaceC7165iy1
            public U a(w wVar, x xVar) throws Exception {
                return (U) this.a.a(wVar, xVar.e(t.this.e), xVar.e(t.this.f), xVar.e(t.this.g));
            }

            public String toString() {
                return this.a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: o.oE$t$b */
        /* loaded from: classes3.dex */
        public class b<U> implements r.d<U> {
            public final /* synthetic */ c a;

            public b(c cVar) {
                this.a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.C8461oE.r.d
            public C8461oE<U> a(w wVar, x xVar) throws Exception {
                return this.a.a(wVar, xVar.e(t.this.e), xVar.e(t.this.f), xVar.e(t.this.g));
            }

            public String toString() {
                return this.a.toString();
            }
        }

        /* renamed from: o.oE$t$c */
        /* loaded from: classes3.dex */
        public interface c<V1, V2, V3, U> {
            C8461oE<U> a(w wVar, @InterfaceC7165iy1 V1 v1, @InterfaceC7165iy1 V2 v2, @InterfaceC7165iy1 V3 v3) throws Exception;
        }

        /* renamed from: o.oE$t$d */
        /* loaded from: classes3.dex */
        public interface d<V1, V2, V3, U> {
            @InterfaceC7165iy1
            U a(w wVar, @InterfaceC7165iy1 V1 v1, @InterfaceC7165iy1 V2 v2, @InterfaceC7165iy1 V3 v3) throws Exception;
        }

        public /* synthetic */ t(C8461oE c8461oE, C8461oE c8461oE2, C8461oE c8461oE3, d dVar) {
            this(c8461oE, c8461oE2, c8461oE3);
        }

        public <U> C8461oE<U> i(d<V1, V2, V3, U> dVar, Executor executor) {
            return (C8461oE<V>) b(new a(dVar), executor);
        }

        public <U> C8461oE<U> j(c<V1, V2, V3, U> cVar, Executor executor) {
            return (C8461oE<V>) c(new b(cVar), executor);
        }

        public t(C8461oE<V1> c8461oE, C8461oE<V2> c8461oE2, C8461oE<V3> c8461oE3) {
            super(true, AbstractC5317bO0.U(c8461oE, c8461oE2, c8461oE3), null);
            this.e = c8461oE;
            this.f = c8461oE2;
            this.g = c8461oE3;
        }
    }

    /* renamed from: o.oE$u */
    /* loaded from: classes3.dex */
    public static final class u<V1, V2, V3, V4> extends r {
        public final C8461oE<V1> e;
        public final C8461oE<V2> f;
        public final C8461oE<V3> g;
        public final C8461oE<V4> h;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: o.oE$u$a */
        /* loaded from: classes3.dex */
        public class a<U> implements r.e<U> {
            public final /* synthetic */ d a;

            public a(d dVar) {
                this.a = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.C8461oE.r.e
            @InterfaceC7165iy1
            public U a(w wVar, x xVar) throws Exception {
                return (U) this.a.a(wVar, xVar.e(u.this.e), xVar.e(u.this.f), xVar.e(u.this.g), xVar.e(u.this.h));
            }

            public String toString() {
                return this.a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: o.oE$u$b */
        /* loaded from: classes3.dex */
        public class b<U> implements r.d<U> {
            public final /* synthetic */ c a;

            public b(c cVar) {
                this.a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.C8461oE.r.d
            public C8461oE<U> a(w wVar, x xVar) throws Exception {
                return this.a.a(wVar, xVar.e(u.this.e), xVar.e(u.this.f), xVar.e(u.this.g), xVar.e(u.this.h));
            }

            public String toString() {
                return this.a.toString();
            }
        }

        /* renamed from: o.oE$u$c */
        /* loaded from: classes3.dex */
        public interface c<V1, V2, V3, V4, U> {
            C8461oE<U> a(w wVar, @InterfaceC7165iy1 V1 v1, @InterfaceC7165iy1 V2 v2, @InterfaceC7165iy1 V3 v3, @InterfaceC7165iy1 V4 v4) throws Exception;
        }

        /* renamed from: o.oE$u$d */
        /* loaded from: classes3.dex */
        public interface d<V1, V2, V3, V4, U> {
            @InterfaceC7165iy1
            U a(w wVar, @InterfaceC7165iy1 V1 v1, @InterfaceC7165iy1 V2 v2, @InterfaceC7165iy1 V3 v3, @InterfaceC7165iy1 V4 v4) throws Exception;
        }

        public /* synthetic */ u(C8461oE c8461oE, C8461oE c8461oE2, C8461oE c8461oE3, C8461oE c8461oE4, d dVar) {
            this(c8461oE, c8461oE2, c8461oE3, c8461oE4);
        }

        public <U> C8461oE<U> j(d<V1, V2, V3, V4, U> dVar, Executor executor) {
            return (C8461oE<V>) b(new a(dVar), executor);
        }

        public <U> C8461oE<U> k(c<V1, V2, V3, V4, U> cVar, Executor executor) {
            return (C8461oE<V>) c(new b(cVar), executor);
        }

        public u(C8461oE<V1> c8461oE, C8461oE<V2> c8461oE2, C8461oE<V3> c8461oE3, C8461oE<V4> c8461oE4) {
            super(true, AbstractC5317bO0.V(c8461oE, c8461oE2, c8461oE3, c8461oE4), null);
            this.e = c8461oE;
            this.f = c8461oE2;
            this.g = c8461oE3;
            this.h = c8461oE4;
        }
    }

    /* renamed from: o.oE$v */
    /* loaded from: classes3.dex */
    public static final class v<V1, V2, V3, V4, V5> extends r {
        public final C8461oE<V1> e;
        public final C8461oE<V2> f;
        public final C8461oE<V3> g;
        public final C8461oE<V4> h;
        public final C8461oE<V5> i;

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: o.oE$v$a */
        /* loaded from: classes3.dex */
        public class a<U> implements r.e<U> {
            public final /* synthetic */ d a;

            public a(d dVar) {
                this.a = dVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.C8461oE.r.e
            @InterfaceC7165iy1
            public U a(w wVar, x xVar) throws Exception {
                return (U) this.a.a(wVar, xVar.e(v.this.e), xVar.e(v.this.f), xVar.e(v.this.g), xVar.e(v.this.h), xVar.e(v.this.i));
            }

            public String toString() {
                return this.a.toString();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [U] */
        /* renamed from: o.oE$v$b */
        /* loaded from: classes3.dex */
        public class b<U> implements r.d<U> {
            public final /* synthetic */ c a;

            public b(c cVar) {
                this.a = cVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.C8461oE.r.d
            public C8461oE<U> a(w wVar, x xVar) throws Exception {
                return this.a.a(wVar, xVar.e(v.this.e), xVar.e(v.this.f), xVar.e(v.this.g), xVar.e(v.this.h), xVar.e(v.this.i));
            }

            public String toString() {
                return this.a.toString();
            }
        }

        /* renamed from: o.oE$v$c */
        /* loaded from: classes3.dex */
        public interface c<V1, V2, V3, V4, V5, U> {
            C8461oE<U> a(w wVar, @InterfaceC7165iy1 V1 v1, @InterfaceC7165iy1 V2 v2, @InterfaceC7165iy1 V3 v3, @InterfaceC7165iy1 V4 v4, @InterfaceC7165iy1 V5 v5) throws Exception;
        }

        /* renamed from: o.oE$v$d */
        /* loaded from: classes3.dex */
        public interface d<V1, V2, V3, V4, V5, U> {
            @InterfaceC7165iy1
            U a(w wVar, @InterfaceC7165iy1 V1 v1, @InterfaceC7165iy1 V2 v2, @InterfaceC7165iy1 V3 v3, @InterfaceC7165iy1 V4 v4, @InterfaceC7165iy1 V5 v5) throws Exception;
        }

        public /* synthetic */ v(C8461oE c8461oE, C8461oE c8461oE2, C8461oE c8461oE3, C8461oE c8461oE4, C8461oE c8461oE5, d dVar) {
            this(c8461oE, c8461oE2, c8461oE3, c8461oE4, c8461oE5);
        }

        public <U> C8461oE<U> k(d<V1, V2, V3, V4, V5, U> dVar, Executor executor) {
            return (C8461oE<V>) b(new a(dVar), executor);
        }

        public <U> C8461oE<U> l(c<V1, V2, V3, V4, V5, U> cVar, Executor executor) {
            return (C8461oE<V>) c(new b(cVar), executor);
        }

        public v(C8461oE<V1> c8461oE, C8461oE<V2> c8461oE2, C8461oE<V3> c8461oE3, C8461oE<V4> c8461oE4, C8461oE<V5> c8461oE5) {
            super(true, AbstractC5317bO0.X(c8461oE, c8461oE2, c8461oE3, c8461oE4, c8461oE5), null);
            this.e = c8461oE;
            this.f = c8461oE2;
            this.g = c8461oE3;
            this.h = c8461oE4;
            this.i = c8461oE5;
        }
    }

    /* renamed from: o.oE$w */
    /* loaded from: classes3.dex */
    public static final class w {
        @InterfaceC7537kU1
        public final o a;

        public w(o oVar) {
            this.a = oVar;
        }

        @InterfaceC6181ey
        @InterfaceC7165iy1
        public <C extends Closeable> C a(@InterfaceC7165iy1 C c, Executor executor) {
            C10664xF1.E(executor);
            if (c != null) {
                this.a.f(c, executor);
            }
            return c;
        }
    }

    /* renamed from: o.oE$x */
    /* loaded from: classes3.dex */
    public static final class x {
        public final AbstractC5317bO0<C8461oE<?>> a;
        public volatile boolean b;

        public /* synthetic */ x(AbstractC5317bO0 abstractC5317bO0, d dVar) {
            this(abstractC5317bO0);
        }

        @InterfaceC7165iy1
        public final <V> V c(r.e<V> eVar, o oVar) throws Exception {
            this.b = true;
            o oVar2 = new o(null);
            try {
                return eVar.a(oVar2.X, this);
            } finally {
                oVar.f(oVar2, C3645Mk1.c());
                this.b = false;
            }
        }

        public final <V> AbstractC10097uw0<V> d(r.d<V> dVar, o oVar) throws Exception {
            this.b = true;
            o oVar2 = new o(null);
            try {
                C8461oE<V> a = dVar.a(oVar2.X, this);
                a.i(oVar);
                return a.c;
            } finally {
                oVar.f(oVar2, C3645Mk1.c());
                this.b = false;
            }
        }

        @InterfaceC7165iy1
        public final <D> D e(C8461oE<D> c8461oE) throws ExecutionException {
            C10664xF1.g0(this.b);
            C10664xF1.d(this.a.contains(c8461oE));
            return (D) C6980iC0.h(c8461oE.c);
        }

        public x(AbstractC5317bO0<C8461oE<?>> abstractC5317bO0) {
            this.a = (AbstractC5317bO0) C10664xF1.E(abstractC5317bO0);
        }
    }

    /* renamed from: o.oE$y */
    /* loaded from: classes3.dex */
    public enum y {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    /* renamed from: o.oE$z */
    /* loaded from: classes3.dex */
    public static final class z<V> {
        public final C8461oE<? extends V> a;

        public z(C8461oE<? extends V> c8461oE) {
            this.a = (C8461oE) C10664xF1.E(c8461oE);
        }

        public void a() {
            this.a.p();
        }

        @InterfaceC7165iy1
        public V b() throws ExecutionException {
            return (V) C6980iC0.h(this.a.c);
        }
    }

    public /* synthetic */ C8461oE(InterfaceFutureC8411o11 interfaceFutureC8411o11, d dVar) {
        this(interfaceFutureC8411o11);
    }

    public static <V> C8461oE<V> A(m<V> mVar, Executor executor) {
        return new C8461oE<>(mVar, executor);
    }

    public static r D(Iterable<? extends C8461oE<?>> iterable) {
        return new r(false, iterable, null);
    }

    public static r E(C8461oE<?> c8461oE, C8461oE<?>... c8461oEArr) {
        return D(C10608x11.c(c8461oE, c8461oEArr));
    }

    public static <V1, V2> s<V1, V2> F(C8461oE<V1> c8461oE, C8461oE<V2> c8461oE2) {
        return new s<>(c8461oE, c8461oE2, null);
    }

    public static <V1, V2, V3> t<V1, V2, V3> G(C8461oE<V1> c8461oE, C8461oE<V2> c8461oE2, C8461oE<V3> c8461oE3) {
        return new t<>(c8461oE, c8461oE2, c8461oE3, null);
    }

    public static <V1, V2, V3, V4> u<V1, V2, V3, V4> H(C8461oE<V1> c8461oE, C8461oE<V2> c8461oE2, C8461oE<V3> c8461oE3, C8461oE<V4> c8461oE4) {
        return new u<>(c8461oE, c8461oE2, c8461oE3, c8461oE4, null);
    }

    public static <V1, V2, V3, V4, V5> v<V1, V2, V3, V4, V5> I(C8461oE<V1> c8461oE, C8461oE<V2> c8461oE2, C8461oE<V3> c8461oE3, C8461oE<V4> c8461oE4, C8461oE<V5> c8461oE5) {
        return new v<>(c8461oE, c8461oE2, c8461oE3, c8461oE4, c8461oE5, null);
    }

    public static r J(Iterable<? extends C8461oE<?>> iterable) {
        return new r(true, iterable, null);
    }

    public static r K(C8461oE<?> c8461oE, C8461oE<?> c8461oE2, C8461oE<?> c8461oE3, C8461oE<?> c8461oE4, C8461oE<?> c8461oE5, C8461oE<?> c8461oE6, C8461oE<?>... c8461oEArr) {
        return J(AbstractC10343vw0.a0(c8461oE, c8461oE2, c8461oE3, c8461oE4, c8461oE5, c8461oE6).h(c8461oEArr));
    }

    public static <V, U> n<V, U> M(InterfaceC2731Df<V, U> interfaceC2731Df) {
        C10664xF1.E(interfaceC2731Df);
        return new i(interfaceC2731Df);
    }

    public static void q(@MB Closeable closeable, Executor executor) {
        if (closeable == null) {
            return;
        }
        try {
            executor.execute(new b(closeable));
        } catch (RejectedExecutionException e2) {
            Logger logger = d;
            Level level = Level.WARNING;
            if (logger.isLoggable(level)) {
                logger.log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e2);
            }
            q(closeable, C3645Mk1.c());
        }
    }

    @Deprecated
    public static <C extends Closeable> C8461oE<C> t(InterfaceFutureC8411o11<C> interfaceFutureC8411o11, Executor executor) {
        C10664xF1.E(executor);
        C8461oE<C> c8461oE = new C8461oE<>(C6980iC0.q(interfaceFutureC8411o11));
        C6980iC0.a(interfaceFutureC8411o11, new d(executor), C3645Mk1.c());
        return c8461oE;
    }

    public static <V> C8461oE<V> w(InterfaceFutureC8411o11<V> interfaceFutureC8411o11) {
        return new C8461oE<>(interfaceFutureC8411o11);
    }

    public static <C, V extends C> void x(A<C> a, C8461oE<V> c8461oE) {
        a.a(new z<>(c8461oE));
    }

    public static <V> C8461oE<V> z(p<V> pVar, Executor executor) {
        return new C8461oE<>(pVar, executor);
    }

    public <U> C8461oE<U> B(q<? super V, U> qVar, Executor executor) {
        C10664xF1.E(qVar);
        return s(this.c.L(new g(qVar), executor));
    }

    public <U> C8461oE<U> C(n<? super V, U> nVar, Executor executor) {
        C10664xF1.E(nVar);
        return s(this.c.L(new h(nVar), executor));
    }

    @InterfaceC5299bJ2
    public CountDownLatch L() {
        return this.b.k();
    }

    public void finalize() {
        if (this.a.get().equals(y.OPEN)) {
            d.log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            u();
        }
    }

    public final void i(o oVar) {
        o(y.OPEN, y.SUBSUMED);
        oVar.f(this.b, C3645Mk1.c());
    }

    @InterfaceC6181ey
    public boolean j(boolean z2) {
        d.log(Level.FINER, "cancelling {0}", this);
        boolean cancel = this.c.cancel(z2);
        if (cancel) {
            p();
        }
        return cancel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> C8461oE<V> k(Class<X> cls, q<? super X, ? extends V> qVar, Executor executor) {
        return n(cls, qVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <X extends Throwable> C8461oE<V> l(Class<X> cls, n<? super X, ? extends V> nVar, Executor executor) {
        return m(cls, nVar, executor);
    }

    public final <X extends Throwable, W extends V> C8461oE<V> m(Class<X> cls, n<? super X, W> nVar, Executor executor) {
        C10664xF1.E(nVar);
        return (C8461oE<V>) s((AbstractC10097uw0<V>) this.c.H(cls, new k(nVar), executor));
    }

    public final <X extends Throwable, W extends V> C8461oE<V> n(Class<X> cls, q<? super X, W> qVar, Executor executor) {
        C10664xF1.E(qVar);
        return (C8461oE<V>) s((AbstractC10097uw0<V>) this.c.H(cls, new j(qVar), executor));
    }

    public final void o(y yVar, y yVar2) {
        C10664xF1.B0(r(yVar, yVar2), "Expected state to be %s, but it was %s", yVar, yVar2);
    }

    public final void p() {
        d.log(Level.FINER, "closing {0}", this);
        this.b.close();
    }

    public final boolean r(y yVar, y yVar2) {
        return C6515gH1.a(this.a, yVar, yVar2);
    }

    public final <U> C8461oE<U> s(AbstractC10097uw0<U> abstractC10097uw0) {
        C8461oE<U> c8461oE = new C8461oE<>(abstractC10097uw0);
        i(c8461oE.b);
        return c8461oE;
    }

    public String toString() {
        return C3743Nk1.c(this).f("state", this.a.get()).s(this.c).toString();
    }

    public AbstractC10097uw0<V> u() {
        if (r(y.OPEN, y.WILL_CLOSE)) {
            d.log(Level.FINER, "will close {0}", this);
            this.c.h4(new l(), C3645Mk1.c());
        } else {
            switch (c.a[this.a.get().ordinal()]) {
                case 1:
                    throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
                case 2:
                    throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
                case 3:
                case 4:
                case 5:
                    throw new IllegalStateException("Cannot call finishToFuture() twice");
                case 6:
                    throw new AssertionError();
            }
        }
        return this.c;
    }

    public void v(A<? super V> a, Executor executor) {
        C10664xF1.E(a);
        if (!r(y.OPEN, y.WILL_CREATE_VALUE_AND_CLOSER)) {
            int i2 = c.a[this.a.get().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 4 && i2 != 5) {
                        throw new AssertionError(this.a);
                    }
                    throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
                }
                throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
            }
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
        }
        this.c.h4(new RunnableC8462a(a), executor);
    }

    public InterfaceFutureC8411o11<?> y() {
        return C6980iC0.q(this.c.K(MB0.b(null), C3645Mk1.c()));
    }

    /* renamed from: o.oE$o */
    /* loaded from: classes3.dex */
    public static final class o extends IdentityHashMap<Closeable, Executor> implements Closeable {
        public final w X;
        public volatile boolean Y;
        @MB
        public volatile CountDownLatch Z;

        public o() {
            this.X = new w(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.Y) {
                synchronized (this) {
                    try {
                        if (this.Y) {
                            return;
                        }
                        this.Y = true;
                        for (Map.Entry<Closeable, Executor> entry : entrySet()) {
                            C8461oE.q(entry.getKey(), entry.getValue());
                        }
                        clear();
                        if (this.Z != null) {
                            this.Z.countDown();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public void f(@MB Closeable closeable, Executor executor) {
            C10664xF1.E(executor);
            if (closeable == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.Y) {
                        C8461oE.q(closeable, executor);
                    } else {
                        put(closeable, executor);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public <V, U> AbstractC10097uw0<U> i(n<V, U> nVar, @InterfaceC7165iy1 V v) throws Exception {
            o oVar = new o();
            try {
                C8461oE<U> a = nVar.a(oVar.X, v);
                a.i(oVar);
                return a.c;
            } finally {
                f(oVar, C3645Mk1.c());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <V, U> InterfaceFutureC8411o11<U> j(q<? super V, U> qVar, @InterfaceC7165iy1 V v) throws Exception {
            o oVar = new o();
            try {
                return C6980iC0.m(qVar.a(oVar.X, v));
            } finally {
                f(oVar, C3645Mk1.c());
            }
        }

        public CountDownLatch k() {
            boolean z = false;
            if (this.Y) {
                return new CountDownLatch(0);
            }
            synchronized (this) {
                try {
                    if (this.Y) {
                        return new CountDownLatch(0);
                    }
                    if (this.Z == null) {
                        z = true;
                    }
                    C10664xF1.g0(z);
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    this.Z = countDownLatch;
                    return countDownLatch;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ o(d dVar) {
            this();
        }
    }

    public C8461oE(InterfaceFutureC8411o11<V> interfaceFutureC8411o11) {
        this.a = new AtomicReference<>(y.OPEN);
        this.b = new o(null);
        this.c = AbstractC10097uw0.J(interfaceFutureC8411o11);
    }

    public C8461oE(p<V> pVar, Executor executor) {
        this.a = new AtomicReference<>(y.OPEN);
        this.b = new o(null);
        C10664xF1.E(pVar);
        Iu2 O = Iu2.O(new e(pVar));
        executor.execute(O);
        this.c = O;
    }

    public C8461oE(m<V> mVar, Executor executor) {
        this.a = new AtomicReference<>(y.OPEN);
        this.b = new o(null);
        C10664xF1.E(mVar);
        Iu2 P = Iu2.P(new f(mVar));
        executor.execute(P);
        this.c = P;
    }

    /* renamed from: o.oE$d */
    /* loaded from: classes3.dex */
    public class d implements WB0<Closeable> {
        public final /* synthetic */ Executor b;

        public d(Executor executor) {
            this.b = executor;
        }

        @Override // o.WB0
        /* renamed from: c */
        public void a(@MB Closeable closeable) {
            C8461oE.this.b.X.a(closeable, this.b);
        }

        @Override // o.WB0
        public void b(Throwable th) {
        }
    }
}
