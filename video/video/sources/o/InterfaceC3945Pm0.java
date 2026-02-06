package o;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.Pm0 */
/* loaded from: classes4.dex */
public interface InterfaceC3945Pm0<T, E extends Throwable> {
    public static final InterfaceC3945Pm0 a = new InterfaceC3945Pm0() { // from class: o.Mm0
        @Override // o.InterfaceC3945Pm0
        public final boolean test(Object obj) {
            return InterfaceC3945Pm0.k(obj);
        }
    };
    public static final InterfaceC3945Pm0 b = new InterfaceC3945Pm0() { // from class: o.Nm0
        @Override // o.InterfaceC3945Pm0
        public final boolean test(Object obj) {
            return InterfaceC3945Pm0.g(obj);
        }
    };

    static <T, E extends Throwable> InterfaceC3945Pm0<T, E> a() {
        return b;
    }

    static <T, E extends Throwable> InterfaceC3945Pm0<T, E> b() {
        return a;
    }

    static /* synthetic */ boolean e(InterfaceC3945Pm0 interfaceC3945Pm0, InterfaceC3945Pm0 interfaceC3945Pm02, Object obj) {
        return interfaceC3945Pm0.h(interfaceC3945Pm02, obj);
    }

    static /* synthetic */ boolean g(Object obj) {
        return true;
    }

    static /* synthetic */ boolean i(InterfaceC3945Pm0 interfaceC3945Pm0, InterfaceC3945Pm0 interfaceC3945Pm02, Object obj) {
        return interfaceC3945Pm0.d(interfaceC3945Pm02, obj);
    }

    static /* synthetic */ boolean k(Object obj) {
        return false;
    }

    static /* synthetic */ boolean l(InterfaceC3945Pm0 interfaceC3945Pm0, Object obj) {
        return interfaceC3945Pm0.c(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean c(Object obj) throws Throwable {
        return !test(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean d(InterfaceC3945Pm0 interfaceC3945Pm0, Object obj) throws Throwable {
        if (test(obj) && interfaceC3945Pm0.test(obj)) {
            return true;
        }
        return false;
    }

    default InterfaceC3945Pm0<T, E> f(final InterfaceC3945Pm0<? super T, E> interfaceC3945Pm0) {
        Objects.requireNonNull(interfaceC3945Pm0);
        return new InterfaceC3945Pm0() { // from class: o.Km0
            @Override // o.InterfaceC3945Pm0
            public final boolean test(Object obj) {
                return InterfaceC3945Pm0.e(InterfaceC3945Pm0.this, interfaceC3945Pm0, obj);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean h(InterfaceC3945Pm0 interfaceC3945Pm0, Object obj) throws Throwable {
        if (!test(obj) && !interfaceC3945Pm0.test(obj)) {
            return false;
        }
        return true;
    }

    default InterfaceC3945Pm0<T, E> j(final InterfaceC3945Pm0<? super T, E> interfaceC3945Pm0) {
        Objects.requireNonNull(interfaceC3945Pm0);
        return new InterfaceC3945Pm0() { // from class: o.Lm0
            @Override // o.InterfaceC3945Pm0
            public final boolean test(Object obj) {
                return InterfaceC3945Pm0.i(InterfaceC3945Pm0.this, interfaceC3945Pm0, obj);
            }
        };
    }

    default InterfaceC3945Pm0<T, E> negate() {
        return new InterfaceC3945Pm0() { // from class: o.Om0
            @Override // o.InterfaceC3945Pm0
            public final boolean test(Object obj) {
                return InterfaceC3945Pm0.l(InterfaceC3945Pm0.this, obj);
            }
        };
    }

    boolean test(T t) throws Throwable;
}
