package o;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.fl0 */
/* loaded from: classes4.dex */
public interface InterfaceC6373fl0<T, U, E extends Throwable> {
    public static final InterfaceC6373fl0 a = new InterfaceC6373fl0() { // from class: o.dl0
        @Override // o.InterfaceC6373fl0
        public final boolean test(Object obj, Object obj2) {
            return InterfaceC6373fl0.c(obj, obj2);
        }
    };
    public static final InterfaceC6373fl0 b = new InterfaceC6373fl0() { // from class: o.el0
        @Override // o.InterfaceC6373fl0
        public final boolean test(Object obj, Object obj2) {
            return InterfaceC6373fl0.d(obj, obj2);
        }
    };

    static <T, U, E extends Throwable> InterfaceC6373fl0<T, U, E> a() {
        return b;
    }

    static <T, U, E extends Throwable> InterfaceC6373fl0<T, U, E> b() {
        return a;
    }

    static /* synthetic */ boolean c(Object obj, Object obj2) {
        return false;
    }

    static /* synthetic */ boolean d(Object obj, Object obj2) {
        return true;
    }

    static /* synthetic */ boolean e(InterfaceC6373fl0 interfaceC6373fl0, Object obj, Object obj2) {
        return interfaceC6373fl0.l(obj, obj2);
    }

    static /* synthetic */ boolean g(InterfaceC6373fl0 interfaceC6373fl0, InterfaceC6373fl0 interfaceC6373fl02, Object obj, Object obj2) {
        return interfaceC6373fl0.f(interfaceC6373fl02, obj, obj2);
    }

    static /* synthetic */ boolean h(InterfaceC6373fl0 interfaceC6373fl0, InterfaceC6373fl0 interfaceC6373fl02, Object obj, Object obj2) {
        return interfaceC6373fl0.i(interfaceC6373fl02, obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean f(InterfaceC6373fl0 interfaceC6373fl0, Object obj, Object obj2) throws Throwable {
        if (!test(obj, obj2) && !interfaceC6373fl0.test(obj, obj2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean i(InterfaceC6373fl0 interfaceC6373fl0, Object obj, Object obj2) throws Throwable {
        if (test(obj, obj2) && interfaceC6373fl0.test(obj, obj2)) {
            return true;
        }
        return false;
    }

    default InterfaceC6373fl0<T, U, E> j(final InterfaceC6373fl0<? super T, ? super U, E> interfaceC6373fl0) {
        Objects.requireNonNull(interfaceC6373fl0);
        return new InterfaceC6373fl0() { // from class: o.bl0
            @Override // o.InterfaceC6373fl0
            public final boolean test(Object obj, Object obj2) {
                return InterfaceC6373fl0.h(InterfaceC6373fl0.this, interfaceC6373fl0, obj, obj2);
            }
        };
    }

    default InterfaceC6373fl0<T, U, E> k(final InterfaceC6373fl0<? super T, ? super U, E> interfaceC6373fl0) {
        Objects.requireNonNull(interfaceC6373fl0);
        return new InterfaceC6373fl0() { // from class: o.cl0
            @Override // o.InterfaceC6373fl0
            public final boolean test(Object obj, Object obj2) {
                return InterfaceC6373fl0.g(InterfaceC6373fl0.this, interfaceC6373fl0, obj, obj2);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean l(Object obj, Object obj2) throws Throwable {
        return !test(obj, obj2);
    }

    default InterfaceC6373fl0<T, U, E> negate() {
        return new InterfaceC6373fl0() { // from class: o.al0
            @Override // o.InterfaceC6373fl0
            public final boolean test(Object obj, Object obj2) {
                return InterfaceC6373fl0.e(InterfaceC6373fl0.this, obj, obj2);
            }
        };
    }

    boolean test(T t, U u) throws Throwable;
}
