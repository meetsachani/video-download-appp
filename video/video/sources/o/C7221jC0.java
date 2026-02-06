package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import o.C3679Mt;
import o.KN0;

/* renamed from: o.jC0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7221jC0 {
    public static final InterfaceC6490gB0<?, ?> a = new b();

    /* JADX INFO: Add missing generic type declarations: [I, O] */
    /* renamed from: o.jC0$a */
    /* loaded from: classes.dex */
    public class a<I, O> implements InterfaceC2829Ef<I, O> {
        public final /* synthetic */ InterfaceC6490gB0 a;

        public a(InterfaceC6490gB0 interfaceC6490gB0) {
            this.a = interfaceC6490gB0;
        }

        @Override // o.InterfaceC2829Ef
        public InterfaceFutureC8411o11<O> apply(I i) {
            return C7221jC0.h(this.a.apply(i));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: o.jC0$c */
    /* loaded from: classes.dex */
    public class c<I> implements XB0<I> {
        public final /* synthetic */ C3679Mt.a a;
        public final /* synthetic */ InterfaceC6490gB0 b;

        public c(C3679Mt.a aVar, InterfaceC6490gB0 interfaceC6490gB0) {
            this.a = aVar;
            this.b = interfaceC6490gB0;
        }

        @Override // o.XB0
        public void a(I i) {
            try {
                this.a.c(this.b.apply(i));
            } catch (Throwable th) {
                this.a.f(th);
            }
        }

        @Override // o.XB0
        public void b(Throwable th) {
            this.a.f(th);
        }
    }

    /* renamed from: o.jC0$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public final /* synthetic */ InterfaceFutureC8411o11 X;

        public d(InterfaceFutureC8411o11 interfaceFutureC8411o11) {
            this.X = interfaceFutureC8411o11;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.cancel(true);
        }
    }

    /* renamed from: o.jC0$e */
    /* loaded from: classes.dex */
    public static final class e<V> implements Runnable {
        public final Future<V> X;
        public final XB0<? super V> Y;

        public e(Future<V> future, XB0<? super V> xb0) {
            this.X = future;
            this.Y = xb0;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.Y.a(C7221jC0.d(this.X));
            } catch (Error e) {
                e = e;
                this.Y.b(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.Y.b(e);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause == null) {
                    this.Y.b(e3);
                } else {
                    this.Y.b(cause);
                }
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.Y;
        }
    }

    public static /* synthetic */ Object a(InterfaceFutureC8411o11 interfaceFutureC8411o11, C3679Mt.a aVar) {
        l(false, interfaceFutureC8411o11, a, aVar, C5211ay.b());
        return "nonCancellationPropagating[" + interfaceFutureC8411o11 + C6566gU0.g;
    }

    public static <V> void b(InterfaceFutureC8411o11<V> interfaceFutureC8411o11, XB0<? super V> xb0, Executor executor) {
        C10907yF1.l(xb0);
        interfaceFutureC8411o11.h4(new e(interfaceFutureC8411o11, xb0), executor);
    }

    public static <V> InterfaceFutureC8411o11<List<V>> c(Collection<? extends InterfaceFutureC8411o11<? extends V>> collection) {
        return new S01(new ArrayList(collection), true, C5211ay.b());
    }

    public static <V> V d(Future<V> future) throws ExecutionException {
        boolean isDone = future.isDone();
        C10907yF1.o(isDone, "Future was expected to be done, " + future);
        return (V) e(future);
    }

    public static <V> V e(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public static <V> InterfaceFutureC8411o11<V> f(Throwable th) {
        return new KN0.a(th);
    }

    public static <V> ScheduledFuture<V> g(Throwable th) {
        return new KN0.b(th);
    }

    public static <V> InterfaceFutureC8411o11<V> h(V v) {
        if (v == null) {
            return KN0.e();
        }
        return new KN0.c(v);
    }

    public static <V> InterfaceFutureC8411o11<V> i(final InterfaceFutureC8411o11<V> interfaceFutureC8411o11) {
        C10907yF1.l(interfaceFutureC8411o11);
        if (interfaceFutureC8411o11.isDone()) {
            return interfaceFutureC8411o11;
        }
        return C3679Mt.a(new C3679Mt.c() { // from class: o.hC0
            @Override // o.C3679Mt.c
            public final Object a(C3679Mt.a aVar) {
                return C7221jC0.a(InterfaceFutureC8411o11.this, aVar);
            }
        });
    }

    public static <V> void j(InterfaceFutureC8411o11<V> interfaceFutureC8411o11, C3679Mt.a<V> aVar) {
        k(interfaceFutureC8411o11, a, aVar, C5211ay.b());
    }

    public static <I, O> void k(InterfaceFutureC8411o11<I> interfaceFutureC8411o11, InterfaceC6490gB0<? super I, ? extends O> interfaceC6490gB0, C3679Mt.a<O> aVar, Executor executor) {
        l(true, interfaceFutureC8411o11, interfaceC6490gB0, aVar, executor);
    }

    public static <I, O> void l(boolean z, InterfaceFutureC8411o11<I> interfaceFutureC8411o11, InterfaceC6490gB0<? super I, ? extends O> interfaceC6490gB0, C3679Mt.a<O> aVar, Executor executor) {
        C10907yF1.l(interfaceFutureC8411o11);
        C10907yF1.l(interfaceC6490gB0);
        C10907yF1.l(aVar);
        C10907yF1.l(executor);
        b(interfaceFutureC8411o11, new c(aVar, interfaceC6490gB0), executor);
        if (z) {
            aVar.a(new d(interfaceFutureC8411o11), C5211ay.b());
        }
    }

    public static <V> InterfaceFutureC8411o11<List<V>> m(Collection<? extends InterfaceFutureC8411o11<? extends V>> collection) {
        return new S01(new ArrayList(collection), false, C5211ay.b());
    }

    public static <I, O> InterfaceFutureC8411o11<O> n(InterfaceFutureC8411o11<I> interfaceFutureC8411o11, InterfaceC6490gB0<? super I, ? extends O> interfaceC6490gB0, Executor executor) {
        C10907yF1.l(interfaceC6490gB0);
        return o(interfaceFutureC8411o11, new a(interfaceC6490gB0), executor);
    }

    public static <I, O> InterfaceFutureC8411o11<O> o(InterfaceFutureC8411o11<I> interfaceFutureC8411o11, InterfaceC2829Ef<? super I, ? extends O> interfaceC2829Ef, Executor executor) {
        RunnableC5260bA runnableC5260bA = new RunnableC5260bA(interfaceC2829Ef, interfaceFutureC8411o11);
        interfaceFutureC8411o11.h4(runnableC5260bA, executor);
        return runnableC5260bA;
    }

    /* renamed from: o.jC0$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC6490gB0<Object, Object> {
        @Override // o.InterfaceC6490gB0
        public Object apply(Object obj) {
            return obj;
        }
    }
}
