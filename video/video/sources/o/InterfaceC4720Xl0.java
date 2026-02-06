package o;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.Xl0 */
/* loaded from: classes4.dex */
public interface InterfaceC4720Xl0<E extends Throwable> {
    public static final InterfaceC4720Xl0 a = new InterfaceC4720Xl0() { // from class: o.Tl0
        @Override // o.InterfaceC4720Xl0
        public final boolean test(int i) {
            return InterfaceC4720Xl0.l(i);
        }
    };
    public static final InterfaceC4720Xl0 b = new InterfaceC4720Xl0() { // from class: o.Ul0
        @Override // o.InterfaceC4720Xl0
        public final boolean test(int i) {
            return InterfaceC4720Xl0.g(i);
        }
    };

    static <E extends Throwable> InterfaceC4720Xl0<E> a() {
        return b;
    }

    static <E extends Throwable> InterfaceC4720Xl0<E> b() {
        return a;
    }

    static /* synthetic */ boolean c(InterfaceC4720Xl0 interfaceC4720Xl0, InterfaceC4720Xl0 interfaceC4720Xl02, int i) {
        return interfaceC4720Xl0.h(interfaceC4720Xl02, i);
    }

    static /* synthetic */ boolean d(InterfaceC4720Xl0 interfaceC4720Xl0, int i) {
        return interfaceC4720Xl0.k(i);
    }

    static /* synthetic */ boolean f(InterfaceC4720Xl0 interfaceC4720Xl0, InterfaceC4720Xl0 interfaceC4720Xl02, int i) {
        return interfaceC4720Xl0.e(interfaceC4720Xl02, i);
    }

    static /* synthetic */ boolean g(int i) {
        return true;
    }

    static /* synthetic */ boolean l(int i) {
        return false;
    }

    /* synthetic */ default boolean e(InterfaceC4720Xl0 interfaceC4720Xl0, int i) throws Throwable {
        if (test(i) && interfaceC4720Xl0.test(i)) {
            return true;
        }
        return false;
    }

    /* synthetic */ default boolean h(InterfaceC4720Xl0 interfaceC4720Xl0, int i) throws Throwable {
        if (!test(i) && !interfaceC4720Xl0.test(i)) {
            return false;
        }
        return true;
    }

    default InterfaceC4720Xl0<E> i(final InterfaceC4720Xl0<E> interfaceC4720Xl0) {
        Objects.requireNonNull(interfaceC4720Xl0);
        return new InterfaceC4720Xl0() { // from class: o.Vl0
            @Override // o.InterfaceC4720Xl0
            public final boolean test(int i) {
                return InterfaceC4720Xl0.c(InterfaceC4720Xl0.this, interfaceC4720Xl0, i);
            }
        };
    }

    default InterfaceC4720Xl0<E> j(final InterfaceC4720Xl0<E> interfaceC4720Xl0) {
        Objects.requireNonNull(interfaceC4720Xl0);
        return new InterfaceC4720Xl0() { // from class: o.Sl0
            @Override // o.InterfaceC4720Xl0
            public final boolean test(int i) {
                return InterfaceC4720Xl0.f(InterfaceC4720Xl0.this, interfaceC4720Xl0, i);
            }
        };
    }

    /* synthetic */ default boolean k(int i) throws Throwable {
        return !test(i);
    }

    default InterfaceC4720Xl0<E> negate() {
        return new InterfaceC4720Xl0() { // from class: o.Wl0
            @Override // o.InterfaceC4720Xl0
            public final boolean test(int i) {
                return InterfaceC4720Xl0.d(InterfaceC4720Xl0.this, i);
            }
        };
    }

    boolean test(int i) throws Throwable;
}
