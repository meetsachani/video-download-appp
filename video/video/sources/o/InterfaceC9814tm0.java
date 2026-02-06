package o;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.tm0 */
/* loaded from: classes4.dex */
public interface InterfaceC9814tm0<E extends Throwable> {
    public static final InterfaceC9814tm0 a = new InterfaceC9814tm0() { // from class: o.rm0
        @Override // o.InterfaceC9814tm0
        public final boolean test(long j) {
            return InterfaceC9814tm0.j(j);
        }
    };
    public static final InterfaceC9814tm0 b = new InterfaceC9814tm0() { // from class: o.sm0
        @Override // o.InterfaceC9814tm0
        public final boolean test(long j) {
            return InterfaceC9814tm0.l(j);
        }
    };

    static <E extends Throwable> InterfaceC9814tm0<E> a() {
        return b;
    }

    static <E extends Throwable> InterfaceC9814tm0<E> b() {
        return a;
    }

    static /* synthetic */ boolean d(InterfaceC9814tm0 interfaceC9814tm0, InterfaceC9814tm0 interfaceC9814tm02, long j) {
        return interfaceC9814tm0.f(interfaceC9814tm02, j);
    }

    static /* synthetic */ boolean e(InterfaceC9814tm0 interfaceC9814tm0, long j) {
        return interfaceC9814tm0.k(j);
    }

    static /* synthetic */ boolean h(InterfaceC9814tm0 interfaceC9814tm0, InterfaceC9814tm0 interfaceC9814tm02, long j) {
        return interfaceC9814tm0.i(interfaceC9814tm02, j);
    }

    static /* synthetic */ boolean j(long j) {
        return false;
    }

    static /* synthetic */ boolean l(long j) {
        return true;
    }

    default InterfaceC9814tm0<E> c(final InterfaceC9814tm0<E> interfaceC9814tm0) {
        Objects.requireNonNull(interfaceC9814tm0);
        return new InterfaceC9814tm0() { // from class: o.om0
            @Override // o.InterfaceC9814tm0
            public final boolean test(long j) {
                return InterfaceC9814tm0.h(InterfaceC9814tm0.this, interfaceC9814tm0, j);
            }
        };
    }

    /* synthetic */ default boolean f(InterfaceC9814tm0 interfaceC9814tm0, long j) throws Throwable {
        if (!test(j) && !interfaceC9814tm0.test(j)) {
            return false;
        }
        return true;
    }

    default InterfaceC9814tm0<E> g(final InterfaceC9814tm0<E> interfaceC9814tm0) {
        Objects.requireNonNull(interfaceC9814tm0);
        return new InterfaceC9814tm0() { // from class: o.qm0
            @Override // o.InterfaceC9814tm0
            public final boolean test(long j) {
                return InterfaceC9814tm0.d(InterfaceC9814tm0.this, interfaceC9814tm0, j);
            }
        };
    }

    /* synthetic */ default boolean i(InterfaceC9814tm0 interfaceC9814tm0, long j) throws Throwable {
        if (test(j) && interfaceC9814tm0.test(j)) {
            return true;
        }
        return false;
    }

    /* synthetic */ default boolean k(long j) throws Throwable {
        return !test(j);
    }

    default InterfaceC9814tm0<E> negate() {
        return new InterfaceC9814tm0() { // from class: o.pm0
            @Override // o.InterfaceC9814tm0
            public final boolean test(long j) {
                return InterfaceC9814tm0.e(InterfaceC9814tm0.this, j);
            }
        };
    }

    boolean test(long j) throws Throwable;
}
