package o;

import java.io.IOException;
import java.util.Objects;
import java.util.function.BiFunction;

@FunctionalInterface
/* renamed from: o.oJ0 */
/* loaded from: classes4.dex */
public interface InterfaceC8483oJ0<T, U, R> {
    static /* synthetic */ Object f(InterfaceC8483oJ0 interfaceC8483oJ0, Object obj, Object obj2) {
        return interfaceC8483oJ0.c(obj, obj2);
    }

    default <V> InterfaceC8483oJ0<T, U, V> a(final RJ0<? super R, ? extends V> rj0) {
        Objects.requireNonNull(rj0);
        return new InterfaceC8483oJ0() { // from class: o.mJ0
            @Override // o.InterfaceC8483oJ0
            public final Object apply(Object obj, Object obj2) {
                Object j;
                j = InterfaceC8483oJ0.this.j(rj0, obj, obj2);
                return j;
            }
        };
    }

    R apply(T t, U u) throws IOException;

    /* synthetic */ default Object c(Object obj, Object obj2) {
        return C8643oy2.e(this, obj, obj2);
    }

    default BiFunction<T, U, R> i() {
        return new BiFunction() { // from class: o.nJ0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return InterfaceC8483oJ0.f(InterfaceC8483oJ0.this, obj, obj2);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object j(RJ0 rj0, Object obj, Object obj2) throws IOException {
        return rj0.apply(apply(obj, obj2));
    }
}
