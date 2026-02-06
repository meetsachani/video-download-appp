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
import o.C6347fe2;

/* renamed from: o.Tk0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4328Tk0 {
    public static <E extends Throwable> double A(final InterfaceC7841ll0<E> interfaceC7841ll0, final double d, final double d2) {
        return N(new InterfaceC10785xl0() { // from class: o.Jk0
            @Override // o.InterfaceC10785xl0
            public final double getAsDouble() {
                double applyAsDouble;
                applyAsDouble = InterfaceC7841ll0.this.applyAsDouble(d, d2);
                return applyAsDouble;
            }
        });
    }

    public static <T, U> BiConsumer<T, U> B(final InterfaceC4619Wk0<T, U, ?> interfaceC4619Wk0) {
        return new BiConsumer() { // from class: o.Mk0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C4328Tk0.t(InterfaceC4619Wk0.this, obj, obj2);
            }
        };
    }

    public static <T, U, R> BiFunction<T, U, R> C(final InterfaceC4920Zk0<T, U, R, ?> interfaceC4920Zk0) {
        return new BiFunction() { // from class: o.Fk0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object y;
                y = C4328Tk0.y(InterfaceC4920Zk0.this, obj, obj2);
                return y;
            }
        };
    }

    public static <T, U> BiPredicate<T, U> D(final InterfaceC6373fl0<T, U, ?> interfaceC6373fl0) {
        return new BiPredicate() { // from class: o.yk0
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                boolean V;
                V = C4328Tk0.V(InterfaceC6373fl0.this, obj, obj2);
                return V;
            }
        };
    }

    public static <V> Callable<V> E(final InterfaceC6871hl0<V, ?> interfaceC6871hl0) {
        return new Callable() { // from class: o.Hk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object K;
                K = C4328Tk0.K(InterfaceC6871hl0.this);
                return K;
            }
        };
    }

    public static <T> Consumer<T> F(final InterfaceC7598kl0<T, ?> interfaceC7598kl0) {
        return new Consumer() { // from class: o.Pk0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C4328Tk0.u(InterfaceC7598kl0.this, obj);
            }
        };
    }

    public static <T, R> Function<T, R> G(final InterfaceC3551Ll0<T, R, ?> interfaceC3551Ll0) {
        return new Function() { // from class: o.Lk0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object z;
                z = C4328Tk0.z(InterfaceC3551Ll0.this, obj);
                return z;
            }
        };
    }

    public static <T> Predicate<T> H(final InterfaceC3945Pm0<T, ?> interfaceC3945Pm0) {
        return new Predicate() { // from class: o.Ok0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean W;
                W = C4328Tk0.W(InterfaceC3945Pm0.this, obj);
                return W;
            }
        };
    }

    public static Runnable I(final InterfaceC4042Qm0<?> interfaceC4042Qm0) {
        return new Runnable() { // from class: o.Gk0
            @Override // java.lang.Runnable
            public final void run() {
                C4328Tk0.S(InterfaceC4042Qm0.this);
            }
        };
    }

    public static <T> Supplier<T> J(final InterfaceC4239Sm0<T, ?> interfaceC4239Sm0) {
        return new Supplier() { // from class: o.Dk0
            @Override // java.util.function.Supplier
            public final Object get() {
                Object L;
                L = C4328Tk0.L(InterfaceC4239Sm0.this);
                return L;
            }
        };
    }

    public static <V, E extends Throwable> V K(final InterfaceC6871hl0<V, E> interfaceC6871hl0) {
        interfaceC6871hl0.getClass();
        return (V) L(new InterfaceC4239Sm0() { // from class: o.Kk0
            @Override // o.InterfaceC4239Sm0
            public final Object get() {
                return InterfaceC6871hl0.this.call();
            }
        });
    }

    public static <T, E extends Throwable> T L(InterfaceC4239Sm0<T, E> interfaceC4239Sm0) {
        try {
            return interfaceC4239Sm0.get();
        } catch (Throwable th) {
            throw R(th);
        }
    }

    public static <E extends Throwable> boolean M(InterfaceC6628gl0<E> interfaceC6628gl0) {
        try {
            return interfaceC6628gl0.getAsBoolean();
        } catch (Throwable th) {
            throw R(th);
        }
    }

    public static <E extends Throwable> double N(InterfaceC10785xl0<E> interfaceC10785xl0) {
        try {
            return interfaceC10785xl0.getAsDouble();
        } catch (Throwable th) {
            throw R(th);
        }
    }

    public static <E extends Throwable> int O(InterfaceC4817Yl0<E> interfaceC4817Yl0) {
        try {
            return interfaceC4817Yl0.getAsInt();
        } catch (Throwable th) {
            throw R(th);
        }
    }

    public static <E extends Throwable> long P(InterfaceC10057um0<E> interfaceC10057um0) {
        try {
            return interfaceC10057um0.getAsLong();
        } catch (Throwable th) {
            throw R(th);
        }
    }

    public static <E extends Throwable> short Q(InterfaceC4139Rm0<E> interfaceC4139Rm0) {
        try {
            return interfaceC4139Rm0.a();
        } catch (Throwable th) {
            throw R(th);
        }
    }

    public static RuntimeException R(Throwable th) {
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

    public static <E extends Throwable> void S(InterfaceC4042Qm0<E> interfaceC4042Qm0) {
        try {
            interfaceC4042Qm0.run();
        } catch (Throwable th) {
            throw R(th);
        }
    }

    public static <E> C6347fe2.b<E> T(Collection<E> collection) {
        return new C6347fe2.b<>(collection.stream());
    }

    public static <T> C6347fe2.b<T> U(Stream<T> stream) {
        return new C6347fe2.b<>(stream);
    }

    public static <T, U, E extends Throwable> boolean V(final InterfaceC6373fl0<T, U, E> interfaceC6373fl0, final T t, final U u) {
        return M(new InterfaceC6628gl0() { // from class: o.Ek0
            @Override // o.InterfaceC6628gl0
            public final boolean getAsBoolean() {
                boolean test;
                test = InterfaceC6373fl0.this.test(t, u);
                return test;
            }
        });
    }

    public static <T, E extends Throwable> boolean W(final InterfaceC3945Pm0<T, E> interfaceC3945Pm0, final T t) {
        return M(new InterfaceC6628gl0() { // from class: o.Bk0
            @Override // o.InterfaceC6628gl0
            public final boolean getAsBoolean() {
                boolean test;
                test = InterfaceC3945Pm0.this.test(t);
                return test;
            }
        });
    }

    @SafeVarargs
    public static void X(InterfaceC4042Qm0<? extends Throwable> interfaceC4042Qm0, InterfaceC7598kl0<Throwable, ? extends Throwable> interfaceC7598kl0, InterfaceC4042Qm0<? extends Throwable>... interfaceC4042Qm0Arr) {
        if (interfaceC7598kl0 == null) {
            interfaceC7598kl0 = new InterfaceC7598kl0() { // from class: o.Ck0
                @Override // o.InterfaceC7598kl0
                public final void accept(Object obj) {
                    C4328Tk0.R((Throwable) obj);
                }
            };
        }
        if (interfaceC4042Qm0Arr != null) {
            for (InterfaceC4042Qm0<? extends Throwable> interfaceC4042Qm02 : interfaceC4042Qm0Arr) {
                Objects.requireNonNull(interfaceC4042Qm02, "runnable");
            }
        }
        try {
            interfaceC4042Qm0.run();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        if (interfaceC4042Qm0Arr != null) {
            for (InterfaceC4042Qm0<? extends Throwable> interfaceC4042Qm03 : interfaceC4042Qm0Arr) {
                try {
                    interfaceC4042Qm03.run();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
            }
        }
        if (th != null) {
            try {
                interfaceC7598kl0.accept(th);
            } catch (Throwable th3) {
                throw R(th3);
            }
        }
    }

    @SafeVarargs
    public static void Y(InterfaceC4042Qm0<? extends Throwable> interfaceC4042Qm0, InterfaceC4042Qm0<? extends Throwable>... interfaceC4042Qm0Arr) {
        X(interfaceC4042Qm0, null, interfaceC4042Qm0Arr);
    }

    public static <T, U, E extends Throwable> void t(final InterfaceC4619Wk0<T, U, E> interfaceC4619Wk0, final T t, final U u) {
        S(new InterfaceC4042Qm0() { // from class: o.Rk0
            @Override // o.InterfaceC4042Qm0
            public final void run() {
                InterfaceC4619Wk0.this.accept(t, u);
            }
        });
    }

    public static <T, E extends Throwable> void u(final InterfaceC7598kl0<T, E> interfaceC7598kl0, final T t) {
        S(new InterfaceC4042Qm0() { // from class: o.Ik0
            @Override // o.InterfaceC4042Qm0
            public final void run() {
                InterfaceC7598kl0.this.accept(t);
            }
        });
    }

    public static <E extends Throwable> void v(final InterfaceC8589ol0<E> interfaceC8589ol0, final double d) {
        S(new InterfaceC4042Qm0() { // from class: o.Ak0
            @Override // o.InterfaceC4042Qm0
            public final void run() {
                InterfaceC8589ol0.this.accept(d);
            }
        });
    }

    public static <E extends Throwable> void w(final InterfaceC3941Pl0<E> interfaceC3941Pl0, final int i) {
        S(new InterfaceC4042Qm0() { // from class: o.Nk0
            @Override // o.InterfaceC4042Qm0
            public final void run() {
                InterfaceC3941Pl0.this.accept(i);
            }
        });
    }

    public static <E extends Throwable> void x(final InterfaceC7845lm0<E> interfaceC7845lm0, final long j) {
        S(new InterfaceC4042Qm0() { // from class: o.zk0
            @Override // o.InterfaceC4042Qm0
            public final void run() {
                InterfaceC7845lm0.this.accept(j);
            }
        });
    }

    public static <T, U, R, E extends Throwable> R y(final InterfaceC4920Zk0<T, U, R, E> interfaceC4920Zk0, final T t, final U u) {
        return (R) L(new InterfaceC4239Sm0() { // from class: o.Sk0
            @Override // o.InterfaceC4239Sm0
            public final Object get() {
                Object apply;
                apply = InterfaceC4920Zk0.this.apply(t, u);
                return apply;
            }
        });
    }

    public static <T, R, E extends Throwable> R z(final InterfaceC3551Ll0<T, R, E> interfaceC3551Ll0, final T t) {
        return (R) L(new InterfaceC4239Sm0() { // from class: o.Qk0
            @Override // o.InterfaceC4239Sm0
            public final Object get() {
                Object apply;
                apply = InterfaceC3551Ll0.this.apply(t);
                return apply;
            }
        });
    }
}
