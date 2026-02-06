package o;

import java.io.IOException;
import java.util.Objects;
import java.util.function.Predicate;

@FunctionalInterface
/* renamed from: o.lK0 */
/* loaded from: classes4.dex */
public interface InterfaceC7739lK0<T> {
    static /* synthetic */ boolean a(InterfaceC7739lK0 interfaceC7739lK0, Object obj) {
        return interfaceC7739lK0.c(obj);
    }

    static /* synthetic */ boolean b(InterfaceC7739lK0 interfaceC7739lK0, InterfaceC7739lK0 interfaceC7739lK02, Object obj) {
        return interfaceC7739lK0.e(interfaceC7739lK02, obj);
    }

    static /* synthetic */ boolean d(InterfaceC7739lK0 interfaceC7739lK0, Object obj) {
        return interfaceC7739lK0.n(obj);
    }

    static <T> InterfaceC7739lK0<T> f() {
        return (InterfaceC7739lK0<T>) HK.f;
    }

    static /* synthetic */ boolean i(InterfaceC7739lK0 interfaceC7739lK0, InterfaceC7739lK0 interfaceC7739lK02, Object obj) {
        return interfaceC7739lK0.g(interfaceC7739lK02, obj);
    }

    static <T> InterfaceC7739lK0<T> isEqual(final Object obj) {
        if (obj == null) {
            return new InterfaceC7739lK0() { // from class: o.gK0
                @Override // o.InterfaceC7739lK0
                public final boolean test(Object obj2) {
                    return Objects.isNull(obj2);
                }
            };
        }
        return new InterfaceC7739lK0() { // from class: o.hK0
            @Override // o.InterfaceC7739lK0
            public final boolean test(Object obj2) {
                return InterfaceC7739lK0.m(obj, obj2);
            }
        };
    }

    static <T> InterfaceC7739lK0<T> l() {
        return (InterfaceC7739lK0<T>) HK.e;
    }

    static /* synthetic */ boolean m(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean c(Object obj) throws IOException {
        return !test(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean e(InterfaceC7739lK0 interfaceC7739lK0, Object obj) throws IOException {
        if (!test(obj) && !interfaceC7739lK0.test(obj)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean g(InterfaceC7739lK0 interfaceC7739lK0, Object obj) throws IOException {
        if (test(obj) && interfaceC7739lK0.test(obj)) {
            return true;
        }
        return false;
    }

    default InterfaceC7739lK0<T> h(final InterfaceC7739lK0<? super T> interfaceC7739lK0) {
        Objects.requireNonNull(interfaceC7739lK0);
        return new InterfaceC7739lK0() { // from class: o.jK0
            @Override // o.InterfaceC7739lK0
            public final boolean test(Object obj) {
                return InterfaceC7739lK0.i(InterfaceC7739lK0.this, interfaceC7739lK0, obj);
            }
        };
    }

    default Predicate<T> j() {
        return new Predicate() { // from class: o.kK0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return InterfaceC7739lK0.d(InterfaceC7739lK0.this, obj);
            }
        };
    }

    default InterfaceC7739lK0<T> k(final InterfaceC7739lK0<? super T> interfaceC7739lK0) {
        Objects.requireNonNull(interfaceC7739lK0);
        return new InterfaceC7739lK0() { // from class: o.iK0
            @Override // o.InterfaceC7739lK0
            public final boolean test(Object obj) {
                return InterfaceC7739lK0.b(InterfaceC7739lK0.this, interfaceC7739lK0, obj);
            }
        };
    }

    /* synthetic */ default boolean n(Object obj) {
        return C8643oy2.s(this, obj);
    }

    default InterfaceC7739lK0<T> negate() {
        return new InterfaceC7739lK0() { // from class: o.fK0
            @Override // o.InterfaceC7739lK0
            public final boolean test(Object obj) {
                return InterfaceC7739lK0.a(InterfaceC7739lK0.this, obj);
            }
        };
    }

    boolean test(T t) throws IOException;
}
