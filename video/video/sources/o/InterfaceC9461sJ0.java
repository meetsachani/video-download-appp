package o;

import java.util.Objects;
import java.util.function.BinaryOperator;

@FunctionalInterface
/* renamed from: o.sJ0 */
/* loaded from: classes4.dex */
public interface InterfaceC9461sJ0<T> extends InterfaceC8483oJ0<T, T, T> {
    static <T> InterfaceC9461sJ0<T> b(final InterfaceC11165zJ0<? super T> interfaceC11165zJ0) {
        Objects.requireNonNull(interfaceC11165zJ0);
        return new InterfaceC9461sJ0() { // from class: o.rJ0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return InterfaceC9461sJ0.g(InterfaceC11165zJ0.this, obj, obj2);
            }
        };
    }

    static /* synthetic */ Object d(InterfaceC11165zJ0 interfaceC11165zJ0, Object obj, Object obj2) {
        if (interfaceC11165zJ0.compare(obj, obj2) >= 0) {
            return obj;
        }
        return obj2;
    }

    static /* synthetic */ Object g(InterfaceC11165zJ0 interfaceC11165zJ0, Object obj, Object obj2) {
        if (interfaceC11165zJ0.compare(obj, obj2) <= 0) {
            return obj;
        }
        return obj2;
    }

    static /* synthetic */ Object h(InterfaceC9461sJ0 interfaceC9461sJ0, Object obj, Object obj2) {
        return interfaceC9461sJ0.e(obj, obj2);
    }

    static <T> InterfaceC9461sJ0<T> l(final InterfaceC11165zJ0<? super T> interfaceC11165zJ0) {
        Objects.requireNonNull(interfaceC11165zJ0);
        return new InterfaceC9461sJ0() { // from class: o.qJ0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                return InterfaceC9461sJ0.d(InterfaceC11165zJ0.this, obj, obj2);
            }
        };
    }

    /* synthetic */ default Object e(Object obj, Object obj2) {
        return C8643oy2.e(this, obj, obj2);
    }

    default BinaryOperator<T> m() {
        return new BinaryOperator() { // from class: o.pJ0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return InterfaceC9461sJ0.h(InterfaceC9461sJ0.this, obj, obj2);
            }
        };
    }
}
