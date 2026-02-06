package o;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import o.C6104ee2;
import o.NB0;

@Deprecated
/* loaded from: classes4.dex */
public class NB0 {

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes4.dex */
    public interface a<O1, O2, T extends Throwable> {
        void accept(O1 o1, O2 o2) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes4.dex */
    public interface b<O1, O2, R, T extends Throwable> {
        R apply(O1 o1, O2 o2) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes4.dex */
    public interface c<O1, O2, T extends Throwable> {
        boolean test(O1 o1, O2 o2) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes4.dex */
    public interface d<R, T extends Throwable> {
        R call() throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes4.dex */
    public interface e<O, T extends Throwable> {
        void accept(O o2) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes4.dex */
    public interface f<I, R, T extends Throwable> {
        R apply(I i) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes4.dex */
    public interface g<I, T extends Throwable> {
        boolean test(I i) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes4.dex */
    public interface h<T extends Throwable> {
        void run() throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    /* loaded from: classes4.dex */
    public interface i<R, T extends Throwable> {
        R get() throws Throwable;
    }

    public static Runnable A(final h<?> hVar) {
        return new Runnable() { // from class: o.HB0
            @Override // java.lang.Runnable
            public final void run() {
                NB0.l(NB0.h.this);
            }
        };
    }

    public static <O> Supplier<O> B(final i<O, ?> iVar) {
        return new Supplier() { // from class: o.FB0
            @Override // java.util.function.Supplier
            public final Object get() {
                return NB0.a(NB0.i.this);
            }
        };
    }

    public static <O, T extends Throwable> O C(final d<O, T> dVar) {
        dVar.getClass();
        return (O) D(new i() { // from class: o.yB0
            @Override // o.NB0.i
            public final Object get() {
                return NB0.d.this.call();
            }
        });
    }

    public static <O, T extends Throwable> O D(i<O, T> iVar) {
        try {
            return iVar.get();
        } catch (Throwable th) {
            throw F(th);
        }
    }

    public static <T extends Throwable> boolean E(InterfaceC6628gl0<T> interfaceC6628gl0) {
        try {
            return interfaceC6628gl0.getAsBoolean();
        } catch (Throwable th) {
            throw F(th);
        }
    }

    public static RuntimeException F(Throwable th) {
        Objects.requireNonNull(th, "throwable");
        if (!(th instanceof RuntimeException)) {
            if (!(th instanceof Error)) {
                if (th instanceof IOException) {
                    throw new UncheckedIOException((IOException) th);
                }
                throw new UndeclaredThrowableException(th);
            }
            throw ((Error) th);
        }
        throw ((RuntimeException) th);
    }

    public static <T extends Throwable> void G(h<T> hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            throw F(th);
        }
    }

    public static <O> C6104ee2.b<O> H(Collection<O> collection) {
        return new C6104ee2.b<>(collection.stream());
    }

    public static <O> C6104ee2.b<O> I(Stream<O> stream) {
        return new C6104ee2.b<>(stream);
    }

    public static <O1, O2, T extends Throwable> boolean J(final c<O1, O2, T> cVar, final O1 o1, final O2 o2) {
        return E(new InterfaceC6628gl0() { // from class: o.uB0
            @Override // o.InterfaceC6628gl0
            public final boolean getAsBoolean() {
                return NB0.d(NB0.c.this, o1, o2);
            }
        });
    }

    public static <O, T extends Throwable> boolean K(final g<O, T> gVar, final O o2) {
        return E(new InterfaceC6628gl0() { // from class: o.wB0
            @Override // o.InterfaceC6628gl0
            public final boolean getAsBoolean() {
                return NB0.k(NB0.g.this, o2);
            }
        });
    }

    @SafeVarargs
    public static void L(h<? extends Throwable> hVar, e<Throwable, ? extends Throwable> eVar, h<? extends Throwable>... hVarArr) {
        if (eVar == null) {
            eVar = new e() { // from class: o.IB0
                @Override // o.NB0.e
                public final void accept(Object obj) {
                    NB0.F((Throwable) obj);
                }
            };
        }
        if (hVarArr != null) {
            for (h<? extends Throwable> hVar2 : hVarArr) {
                Objects.requireNonNull(hVar2, "runnable");
            }
        }
        try {
            hVar.run();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        if (hVarArr != null) {
            for (h<? extends Throwable> hVar3 : hVarArr) {
                try {
                    hVar3.run();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
            }
        }
        if (th != null) {
            try {
                eVar.accept(th);
            } catch (Throwable th3) {
                throw F(th3);
            }
        }
    }

    @SafeVarargs
    public static void M(h<? extends Throwable> hVar, h<? extends Throwable>... hVarArr) {
        L(hVar, null, hVarArr);
    }

    public static /* synthetic */ Object a(i iVar) {
        return D(iVar);
    }

    public static /* synthetic */ boolean b(g gVar, Object obj) {
        return K(gVar, obj);
    }

    public static /* synthetic */ Object c(f fVar, Object obj) {
        return fVar.apply(obj);
    }

    public static /* synthetic */ boolean d(c cVar, Object obj, Object obj2) {
        return cVar.test(obj, obj2);
    }

    public static /* synthetic */ Object e(b bVar, Object obj, Object obj2) {
        return r(bVar, obj, obj2);
    }

    public static /* synthetic */ void f(a aVar, Object obj, Object obj2) {
        aVar.accept(obj, obj2);
    }

    public static /* synthetic */ void g(e eVar, Object obj) {
        eVar.accept(obj);
    }

    public static /* synthetic */ boolean h(c cVar, Object obj, Object obj2) {
        return J(cVar, obj, obj2);
    }

    public static /* synthetic */ void i(e eVar, Object obj) {
        q(eVar, obj);
    }

    public static /* synthetic */ void j(a aVar, Object obj, Object obj2) {
        p(aVar, obj, obj2);
    }

    public static /* synthetic */ boolean k(g gVar, Object obj) {
        return gVar.test(obj);
    }

    public static /* synthetic */ void l(h hVar) {
        G(hVar);
    }

    public static /* synthetic */ Object m(f fVar, Object obj) {
        return s(fVar, obj);
    }

    public static /* synthetic */ Object n(d dVar) {
        return C(dVar);
    }

    public static /* synthetic */ Object o(b bVar, Object obj, Object obj2) {
        return bVar.apply(obj, obj2);
    }

    public static <O1, O2, T extends Throwable> void p(final a<O1, O2, T> aVar, final O1 o1, final O2 o2) {
        G(new h() { // from class: o.JB0
            @Override // o.NB0.h
            public final void run() {
                NB0.f(NB0.a.this, o1, o2);
            }
        });
    }

    public static <O, T extends Throwable> void q(final e<O, T> eVar, final O o2) {
        G(new h() { // from class: o.GB0
            @Override // o.NB0.h
            public final void run() {
                NB0.g(NB0.e.this, o2);
            }
        });
    }

    public static <O1, O2, O, T extends Throwable> O r(final b<O1, O2, O, T> bVar, final O1 o1, final O2 o2) {
        return (O) D(new i() { // from class: o.KB0
            @Override // o.NB0.i
            public final Object get() {
                return NB0.o(NB0.b.this, o1, o2);
            }
        });
    }

    public static <I, O, T extends Throwable> O s(final f<I, O, T> fVar, final I i2) {
        return (O) D(new i() { // from class: o.BB0
            @Override // o.NB0.i
            public final Object get() {
                return NB0.c(NB0.f.this, i2);
            }
        });
    }

    public static <O1, O2> BiConsumer<O1, O2> t(final a<O1, O2, ?> aVar) {
        return new BiConsumer() { // from class: o.xB0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                NB0.j(NB0.a.this, obj, obj2);
            }
        };
    }

    public static <O1, O2, O> BiFunction<O1, O2, O> u(final b<O1, O2, O, ?> bVar) {
        return new BiFunction() { // from class: o.DB0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return NB0.e(NB0.b.this, obj, obj2);
            }
        };
    }

    public static <O1, O2> BiPredicate<O1, O2> v(final c<O1, O2, ?> cVar) {
        return new BiPredicate() { // from class: o.tB0
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return NB0.h(NB0.c.this, obj, obj2);
            }
        };
    }

    public static <O> Callable<O> w(final d<O, ?> dVar) {
        return new Callable() { // from class: o.zB0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return NB0.n(NB0.d.this);
            }
        };
    }

    public static <I> Consumer<I> x(final e<I, ?> eVar) {
        return new Consumer() { // from class: o.vB0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                NB0.i(NB0.e.this, obj);
            }
        };
    }

    public static <I, O> Function<I, O> y(final f<I, O, ?> fVar) {
        return new Function() { // from class: o.LB0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return NB0.m(NB0.f.this, obj);
            }
        };
    }

    public static <I> Predicate<I> z(final g<I, ?> gVar) {
        return new Predicate() { // from class: o.sB0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return NB0.b(NB0.g.this, obj);
            }
        };
    }
}
