package o;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC5317bO0;
import o.AbstractC5522cF;
import o.C4477Uy1;
import o.LN0;
import o.Q0;

@InterfaceC5601ca0
@InterfaceC10420wF0(emulated = true)
/* renamed from: o.iC0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6980iC0 extends AbstractC10906yF0 {

    /* renamed from: o.iC0$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ Future X;

        public a(Future future) {
            this.X = future;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.cancel(false);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [O] */
    /* renamed from: o.iC0$b */
    /* loaded from: classes3.dex */
    public class b<O> implements Future<O> {
        public final /* synthetic */ Future X;
        public final /* synthetic */ YA0 Y;

        public b(Future future, YA0 ya0) {
            this.X = future;
            this.Y = ya0;
        }

        public final O a(I i) throws ExecutionException {
            try {
                return (O) this.Y.apply(i);
            } catch (Throwable th) {
                throw new ExecutionException(th);
            }
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.X.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public O get() throws InterruptedException, ExecutionException {
            return a(this.X.get());
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
        public O get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return a(this.X.get(j, timeUnit));
        }
    }

    /* renamed from: o.iC0$c */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public final /* synthetic */ g X;
        public final /* synthetic */ AbstractC5317bO0 Y;
        public final /* synthetic */ int Z;

        public c(g gVar, AbstractC5317bO0 abstractC5317bO0, int i) {
            this.X = gVar;
            this.Y = abstractC5317bO0;
            this.Z = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.f(this.Y, this.Z);
        }
    }

    @InterfaceC6181ey
    @InterfaceC4238Sm
    @InterfaceC10420wF0
    /* renamed from: o.iC0$d */
    /* loaded from: classes3.dex */
    public static final class d<V> {
        public final boolean a;
        public final AbstractC5317bO0<InterfaceFutureC8411o11<? extends V>> b;

        /* renamed from: o.iC0$d$a */
        /* loaded from: classes3.dex */
        public class a implements Callable<Void> {
            public final /* synthetic */ Runnable a;

            public a(d dVar, Runnable runnable) {
                this.a = runnable;
            }

            @Override // java.util.concurrent.Callable
            @MB
            /* renamed from: a */
            public Void call() throws Exception {
                this.a.run();
                return null;
            }
        }

        public /* synthetic */ d(boolean z, AbstractC5317bO0 abstractC5317bO0, a aVar) {
            this(z, abstractC5317bO0);
        }

        @InterfaceC6181ey
        public <C> InterfaceFutureC8411o11<C> a(Callable<C> callable, Executor executor) {
            return new FG(this.b, this.a, executor, callable);
        }

        public <C> InterfaceFutureC8411o11<C> b(InterfaceC2535Bf<C> interfaceC2535Bf, Executor executor) {
            return new FG(this.b, this.a, executor, interfaceC2535Bf);
        }

        public InterfaceFutureC8411o11<?> c(Runnable runnable, Executor executor) {
            return a(new a(this, runnable), executor);
        }

        public d(boolean z, AbstractC5317bO0<InterfaceFutureC8411o11<? extends V>> abstractC5317bO0) {
            this.a = z;
            this.b = abstractC5317bO0;
        }
    }

    /* renamed from: o.iC0$e */
    /* loaded from: classes3.dex */
    public static final class e<V> implements Runnable {
        public final Future<V> X;
        public final WB0<? super V> Y;

        public e(Future<V> future, WB0<? super V> wb0) {
            this.X = future;
            this.Y = wb0;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable a;
            Future<V> future = this.X;
            if ((future instanceof AS0) && (a = BS0.a((AS0) future)) != null) {
                this.Y.b(a);
                return;
            }
            try {
                this.Y.a(C6980iC0.h(this.X));
            } catch (Error e) {
                e = e;
                this.Y.b(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.Y.b(e);
            } catch (ExecutionException e3) {
                this.Y.b(e3.getCause());
            }
        }

        public String toString() {
            return C3743Nk1.c(this).s(this.Y).toString();
        }
    }

    /* renamed from: o.iC0$f */
    /* loaded from: classes3.dex */
    public static final class f<T> extends Q0<T> {
        @MB
        public g<T> d1;

        public /* synthetic */ f(g gVar, a aVar) {
            this(gVar);
        }

        @Override // o.Q0, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            g<T> gVar = this.d1;
            if (super.cancel(z)) {
                Objects.requireNonNull(gVar);
                gVar.g(z);
                return true;
            }
            return false;
        }

        @Override // o.Q0
        public void m() {
            this.d1 = null;
        }

        @Override // o.Q0
        @MB
        public String y() {
            g<T> gVar = this.d1;
            if (gVar != null) {
                int length = gVar.d.length;
                int i = gVar.c.get();
                StringBuilder sb = new StringBuilder(49);
                sb.append("inputCount=[");
                sb.append(length);
                sb.append("], remaining=[");
                sb.append(i);
                sb.append(C6566gU0.g);
                return sb.toString();
            }
            return null;
        }

        public f(g<T> gVar) {
            this.d1 = gVar;
        }
    }

    /* renamed from: o.iC0$g */
    /* loaded from: classes3.dex */
    public static final class g<T> {
        public boolean a;
        public boolean b;
        public final AtomicInteger c;
        public final InterfaceFutureC8411o11<? extends T>[] d;
        public volatile int e;

        public /* synthetic */ g(InterfaceFutureC8411o11[] interfaceFutureC8411o11Arr, a aVar) {
            this(interfaceFutureC8411o11Arr);
        }

        public final void e() {
            InterfaceFutureC8411o11<? extends T>[] interfaceFutureC8411o11Arr;
            if (this.c.decrementAndGet() == 0 && this.a) {
                for (InterfaceFutureC8411o11<? extends T> interfaceFutureC8411o11 : this.d) {
                    if (interfaceFutureC8411o11 != null) {
                        interfaceFutureC8411o11.cancel(this.b);
                    }
                }
            }
        }

        public final void f(AbstractC5317bO0<Q0<T>> abstractC5317bO0, int i) {
            InterfaceFutureC8411o11<? extends T> interfaceFutureC8411o11 = this.d[i];
            Objects.requireNonNull(interfaceFutureC8411o11);
            InterfaceFutureC8411o11<? extends T> interfaceFutureC8411o112 = interfaceFutureC8411o11;
            this.d[i] = null;
            for (int i2 = this.e; i2 < abstractC5317bO0.size(); i2++) {
                if (abstractC5317bO0.get(i2).D(interfaceFutureC8411o112)) {
                    e();
                    this.e = i2 + 1;
                    return;
                }
            }
            this.e = abstractC5317bO0.size();
        }

        public final void g(boolean z) {
            this.a = true;
            if (!z) {
                this.b = false;
            }
            e();
        }

        public g(InterfaceFutureC8411o11<? extends T>[] interfaceFutureC8411o11Arr) {
            this.a = false;
            this.b = true;
            this.e = 0;
            this.d = interfaceFutureC8411o11Arr;
            this.c = new AtomicInteger(interfaceFutureC8411o11Arr.length);
        }
    }

    /* renamed from: o.iC0$h */
    /* loaded from: classes3.dex */
    public static final class h<V> extends Q0.j<V> implements Runnable {
        @MB
        public InterfaceFutureC8411o11<V> d1;

        public h(InterfaceFutureC8411o11<V> interfaceFutureC8411o11) {
            this.d1 = interfaceFutureC8411o11;
        }

        @Override // o.Q0
        public void m() {
            this.d1 = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceFutureC8411o11<V> interfaceFutureC8411o11 = this.d1;
            if (interfaceFutureC8411o11 != null) {
                D(interfaceFutureC8411o11);
            }
        }

        @Override // o.Q0
        @MB
        public String y() {
            InterfaceFutureC8411o11<V> interfaceFutureC8411o11 = this.d1;
            if (interfaceFutureC8411o11 != null) {
                String valueOf = String.valueOf(interfaceFutureC8411o11);
                StringBuilder sb = new StringBuilder(valueOf.length() + 11);
                sb.append("delegate=[");
                sb.append(valueOf);
                sb.append(C6566gU0.g);
                return sb.toString();
            }
            return null;
        }
    }

    @SafeVarargs
    @InterfaceC4238Sm
    public static <V> d<V> A(InterfaceFutureC8411o11<? extends V>... interfaceFutureC8411o11Arr) {
        return new d<>(false, AbstractC5317bO0.H(interfaceFutureC8411o11Arr), null);
    }

    @InterfaceC4238Sm
    public static <V> d<V> B(Iterable<? extends InterfaceFutureC8411o11<? extends V>> iterable) {
        return new d<>(true, AbstractC5317bO0.D(iterable), null);
    }

    @SafeVarargs
    @InterfaceC4238Sm
    public static <V> d<V> C(InterfaceFutureC8411o11<? extends V>... interfaceFutureC8411o11Arr) {
        return new d<>(true, AbstractC5317bO0.H(interfaceFutureC8411o11Arr), null);
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static <V> InterfaceFutureC8411o11<V> D(InterfaceFutureC8411o11<V> interfaceFutureC8411o11, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (interfaceFutureC8411o11.isDone()) {
            return interfaceFutureC8411o11;
        }
        return C9093qp2.Q(interfaceFutureC8411o11, j, timeUnit, scheduledExecutorService);
    }

    public static void E(Throwable th) {
        if (th instanceof Error) {
            throw new C5140ag0((Error) th);
        }
        throw new Gy2(th);
    }

    public static <V> void a(InterfaceFutureC8411o11<V> interfaceFutureC8411o11, WB0<? super V> wb0, Executor executor) {
        C10664xF1.E(wb0);
        interfaceFutureC8411o11.h4(new e(interfaceFutureC8411o11, wb0), executor);
    }

    @InterfaceC4238Sm
    public static <V> InterfaceFutureC8411o11<List<V>> b(Iterable<? extends InterfaceFutureC8411o11<? extends V>> iterable) {
        return new AbstractC5522cF.a(AbstractC5317bO0.D(iterable), true);
    }

    @SafeVarargs
    @InterfaceC4238Sm
    public static <V> InterfaceFutureC8411o11<List<V>> c(InterfaceFutureC8411o11<? extends V>... interfaceFutureC8411o11Arr) {
        return new AbstractC5522cF.a(AbstractC5317bO0.H(interfaceFutureC8411o11Arr), true);
    }

    @C4477Uy1.a("AVAILABLE but requires exceptionType to be Throwable.class")
    @InterfaceC4238Sm
    public static <V, X extends Throwable> InterfaceFutureC8411o11<V> d(InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11, Class<X> cls, YA0<? super X, ? extends V> ya0, Executor executor) {
        return AbstractRunnableC6688h0.O(interfaceFutureC8411o11, cls, ya0, executor);
    }

    @C4477Uy1.a("AVAILABLE but requires exceptionType to be Throwable.class")
    @InterfaceC4238Sm
    public static <V, X extends Throwable> InterfaceFutureC8411o11<V> e(InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11, Class<X> cls, InterfaceC2731Df<? super X, ? extends V> interfaceC2731Df, Executor executor) {
        return AbstractRunnableC6688h0.N(interfaceFutureC8411o11, cls, interfaceC2731Df, executor);
    }

    @InterfaceC6181ey
    @InterfaceC11149zF0
    @InterfaceC7165iy1
    @InterfaceC4238Sm
    public static <V, X extends Exception> V f(Future<V> future, Class<X> cls) throws Exception {
        return (V) C7464kC0.c(future, cls);
    }

    @InterfaceC6181ey
    @InterfaceC11149zF0
    @InterfaceC7165iy1
    @InterfaceC4238Sm
    public static <V, X extends Exception> V g(Future<V> future, Class<X> cls, long j, TimeUnit timeUnit) throws Exception {
        return (V) C7464kC0.d(future, cls, j, timeUnit);
    }

    @InterfaceC6181ey
    @InterfaceC7165iy1
    public static <V> V h(Future<V> future) throws ExecutionException {
        C10664xF1.x0(future.isDone(), "Future was expected to be done: %s", future);
        return (V) C5748dA2.f(future);
    }

    @InterfaceC6181ey
    @InterfaceC7165iy1
    public static <V> V i(Future<V> future) {
        C10664xF1.E(future);
        try {
            return (V) C5748dA2.f(future);
        } catch (ExecutionException e2) {
            E(e2.getCause());
            throw new AssertionError();
        }
    }

    public static <T> InterfaceFutureC8411o11<? extends T>[] j(Iterable<? extends InterfaceFutureC8411o11<? extends T>> iterable) {
        Collection D;
        if (iterable instanceof Collection) {
            D = (Collection) iterable;
        } else {
            D = AbstractC5317bO0.D(iterable);
        }
        return (InterfaceFutureC8411o11[]) D.toArray(new InterfaceFutureC8411o11[0]);
    }

    public static <V> InterfaceFutureC8411o11<V> k() {
        LN0.a<Object> aVar = LN0.a.d1;
        if (aVar != null) {
            return aVar;
        }
        return new LN0.a();
    }

    public static <V> InterfaceFutureC8411o11<V> l(Throwable th) {
        C10664xF1.E(th);
        return new LN0.b(th);
    }

    public static <V> InterfaceFutureC8411o11<V> m(@InterfaceC7165iy1 V v) {
        if (v == null) {
            return (InterfaceFutureC8411o11<V>) LN0.Y;
        }
        return new LN0(v);
    }

    public static InterfaceFutureC8411o11<Void> n() {
        return LN0.Y;
    }

    public static <T> AbstractC5317bO0<InterfaceFutureC8411o11<T>> o(Iterable<? extends InterfaceFutureC8411o11<? extends T>> iterable) {
        InterfaceFutureC8411o11[] j = j(iterable);
        g gVar = new g(j, null);
        AbstractC5317bO0.a w = AbstractC5317bO0.w(j.length);
        for (int i = 0; i < j.length; i++) {
            w.g(new f(gVar, null));
        }
        AbstractC5317bO0<InterfaceFutureC8411o11<T>> e2 = w.e();
        for (int i2 = 0; i2 < j.length; i2++) {
            j[i2].h4(new c(gVar, e2, i2), C3645Mk1.c());
        }
        return e2;
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static <I, O> Future<O> p(Future<I> future, YA0<? super I, ? extends O> ya0) {
        C10664xF1.E(future);
        C10664xF1.E(ya0);
        return new b(future, ya0);
    }

    public static <V> InterfaceFutureC8411o11<V> q(InterfaceFutureC8411o11<V> interfaceFutureC8411o11) {
        if (interfaceFutureC8411o11.isDone()) {
            return interfaceFutureC8411o11;
        }
        h hVar = new h(interfaceFutureC8411o11);
        interfaceFutureC8411o11.h4(hVar, C3645Mk1.c());
        return hVar;
    }

    @InterfaceC11149zF0
    public static <O> InterfaceFutureC8411o11<O> r(InterfaceC2535Bf<O> interfaceC2535Bf, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        Iu2 P = Iu2.P(interfaceC2535Bf);
        P.h4(new a(scheduledExecutorService.schedule(P, j, timeUnit)), C3645Mk1.c());
        return P;
    }

    public static InterfaceFutureC8411o11<Void> s(Runnable runnable, Executor executor) {
        Iu2 N = Iu2.N(runnable, null);
        executor.execute(N);
        return N;
    }

    public static <O> InterfaceFutureC8411o11<O> t(Callable<O> callable, Executor executor) {
        Iu2 O = Iu2.O(callable);
        executor.execute(O);
        return O;
    }

    public static <O> InterfaceFutureC8411o11<O> u(InterfaceC2535Bf<O> interfaceC2535Bf, Executor executor) {
        Iu2 P = Iu2.P(interfaceC2535Bf);
        executor.execute(P);
        return P;
    }

    @InterfaceC4238Sm
    public static <V> InterfaceFutureC8411o11<List<V>> v(Iterable<? extends InterfaceFutureC8411o11<? extends V>> iterable) {
        return new AbstractC5522cF.a(AbstractC5317bO0.D(iterable), false);
    }

    @SafeVarargs
    @InterfaceC4238Sm
    public static <V> InterfaceFutureC8411o11<List<V>> w(InterfaceFutureC8411o11<? extends V>... interfaceFutureC8411o11Arr) {
        return new AbstractC5522cF.a(AbstractC5317bO0.H(interfaceFutureC8411o11Arr), false);
    }

    @InterfaceC4238Sm
    public static <I, O> InterfaceFutureC8411o11<O> x(InterfaceFutureC8411o11<I> interfaceFutureC8411o11, YA0<? super I, ? extends O> ya0, Executor executor) {
        return A3.O(interfaceFutureC8411o11, ya0, executor);
    }

    @InterfaceC4238Sm
    public static <I, O> InterfaceFutureC8411o11<O> y(InterfaceFutureC8411o11<I> interfaceFutureC8411o11, InterfaceC2731Df<? super I, ? extends O> interfaceC2731Df, Executor executor) {
        return A3.N(interfaceFutureC8411o11, interfaceC2731Df, executor);
    }

    @InterfaceC4238Sm
    public static <V> d<V> z(Iterable<? extends InterfaceFutureC8411o11<? extends V>> iterable) {
        return new d<>(false, AbstractC5317bO0.D(iterable), null);
    }
}
