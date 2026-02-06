package o;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.wl0 */
/* loaded from: classes4.dex */
public interface InterfaceC10542wl0<E extends Throwable> {
    public static final InterfaceC10542wl0 a = new InterfaceC10542wl0() { // from class: o.ul0
        @Override // o.InterfaceC10542wl0
        public final boolean test(double d) {
            return InterfaceC10542wl0.g(d);
        }
    };
    public static final InterfaceC10542wl0 b = new InterfaceC10542wl0() { // from class: o.vl0
        @Override // o.InterfaceC10542wl0
        public final boolean test(double d) {
            return InterfaceC10542wl0.f(d);
        }
    };

    static <E extends Throwable> InterfaceC10542wl0<E> a() {
        return b;
    }

    static <E extends Throwable> InterfaceC10542wl0<E> b() {
        return a;
    }

    static /* synthetic */ boolean d(InterfaceC10542wl0 interfaceC10542wl0, double d) {
        return interfaceC10542wl0.j(d);
    }

    static /* synthetic */ boolean f(double d) {
        return true;
    }

    static /* synthetic */ boolean g(double d) {
        return false;
    }

    static /* synthetic */ boolean i(InterfaceC10542wl0 interfaceC10542wl0, InterfaceC10542wl0 interfaceC10542wl02, double d) {
        return interfaceC10542wl0.k(interfaceC10542wl02, d);
    }

    static /* synthetic */ boolean l(InterfaceC10542wl0 interfaceC10542wl0, InterfaceC10542wl0 interfaceC10542wl02, double d) {
        return interfaceC10542wl0.e(interfaceC10542wl02, d);
    }

    default InterfaceC10542wl0<E> c(final InterfaceC10542wl0<E> interfaceC10542wl0) {
        Objects.requireNonNull(interfaceC10542wl0);
        return new InterfaceC10542wl0() { // from class: o.rl0
            @Override // o.InterfaceC10542wl0
            public final boolean test(double d) {
                return InterfaceC10542wl0.i(InterfaceC10542wl0.this, interfaceC10542wl0, d);
            }
        };
    }

    /* synthetic */ default boolean e(InterfaceC10542wl0 interfaceC10542wl0, double d) throws Throwable {
        if (test(d) && interfaceC10542wl0.test(d)) {
            return true;
        }
        return false;
    }

    default InterfaceC10542wl0<E> h(final InterfaceC10542wl0<E> interfaceC10542wl0) {
        Objects.requireNonNull(interfaceC10542wl0);
        return new InterfaceC10542wl0() { // from class: o.sl0
            @Override // o.InterfaceC10542wl0
            public final boolean test(double d) {
                return InterfaceC10542wl0.l(InterfaceC10542wl0.this, interfaceC10542wl0, d);
            }
        };
    }

    /* synthetic */ default boolean j(double d) throws Throwable {
        return !test(d);
    }

    /* synthetic */ default boolean k(InterfaceC10542wl0 interfaceC10542wl0, double d) throws Throwable {
        if (!test(d) && !interfaceC10542wl0.test(d)) {
            return false;
        }
        return true;
    }

    default InterfaceC10542wl0<E> negate() {
        return new InterfaceC10542wl0() { // from class: o.tl0
            @Override // o.InterfaceC10542wl0
            public final boolean test(double d) {
                return InterfaceC10542wl0.d(InterfaceC10542wl0.this, d);
            }
        };
    }

    boolean test(double d) throws Throwable;
}
