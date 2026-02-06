package o;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.Supplier;

/* renamed from: o.oy2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8643oy2 {
    public static <T, U> void a(InterfaceC7735lJ0<T, U> interfaceC7735lJ0, T t, U u) {
        try {
            interfaceC7735lJ0.accept(t, u);
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static <T> void b(EJ0<T> ej0, T t) {
        try {
            ej0.accept(t);
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static void c(XJ0 xj0, int i) {
        try {
            xj0.accept(i);
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static <T, U, V> void d(ZK0<T, U, V> zk0, T t, U u, V v) {
        try {
            zk0.d(t, u, v);
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static <T, U, R> R e(InterfaceC8483oJ0<T, U, R> interfaceC8483oJ0, T t, U u) {
        try {
            return interfaceC8483oJ0.apply(t, u);
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static <T, R> R f(RJ0<T, R> rj0, T t) {
        try {
            return rj0.apply(t);
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static <T, U, V, W, R> R g(InterfaceC8243nK0<T, U, V, W, R> interfaceC8243nK0, T t, U u, V v, W w) {
        try {
            return interfaceC8243nK0.c(t, u, v, w);
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static <T, U, V, R> R h(InterfaceC5305bL0<T, U, V, R> interfaceC5305bL0, T t, U u, V v) {
        try {
            return interfaceC5305bL0.b(t, u, v);
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static <T> int i(InterfaceC11165zJ0<T> interfaceC11165zJ0, T t, T t2) {
        try {
            return interfaceC11165zJ0.compare(t, t2);
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static <T> T j(XK0<T> xk0) {
        try {
            return xk0.get();
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static <T> T k(XK0<T> xk0, Supplier<String> supplier) {
        try {
            return xk0.get();
        } catch (IOException e) {
            throw u(e, supplier);
        }
    }

    public static boolean l(InterfaceC9947uJ0 interfaceC9947uJ0) {
        try {
            return interfaceC9947uJ0.getAsBoolean();
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static int m(ZJ0 zj0) {
        try {
            return zj0.getAsInt();
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static int n(ZJ0 zj0, Supplier<String> supplier) {
        try {
            return zj0.getAsInt();
        } catch (IOException e) {
            throw u(e, supplier);
        }
    }

    public static long o(InterfaceC6028eK0 interfaceC6028eK0) {
        try {
            return interfaceC6028eK0.getAsLong();
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static long p(InterfaceC6028eK0 interfaceC6028eK0, Supplier<String> supplier) {
        try {
            return interfaceC6028eK0.getAsLong();
        } catch (IOException e) {
            throw u(e, supplier);
        }
    }

    public static void q(InterfaceC8973qK0 interfaceC8973qK0) {
        try {
            interfaceC8973qK0.run();
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static void r(InterfaceC8973qK0 interfaceC8973qK0, Supplier<String> supplier) {
        try {
            interfaceC8973qK0.run();
        } catch (IOException e) {
            throw u(e, supplier);
        }
    }

    public static <T> boolean s(InterfaceC7739lK0<T> interfaceC7739lK0, T t) {
        try {
            return interfaceC7739lK0.test(t);
        } catch (IOException e) {
            throw t(e);
        }
    }

    public static UncheckedIOException t(IOException iOException) {
        return new UncheckedIOException(iOException);
    }

    public static UncheckedIOException u(IOException iOException, Supplier<String> supplier) {
        return new UncheckedIOException(supplier.get(), iOException);
    }
}
