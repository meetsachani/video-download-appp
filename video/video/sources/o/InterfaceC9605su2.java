package o;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
/* renamed from: o.su2 */
/* loaded from: classes4.dex */
public interface InterfaceC9605su2<T, U, V, R> {
    static /* synthetic */ Object a(InterfaceC9605su2 interfaceC9605su2, Function function, Object obj, Object obj2, Object obj3) {
        return interfaceC9605su2.c(function, obj, obj2, obj3);
    }

    default <W> InterfaceC9605su2<T, U, V, W> andThen(final Function<? super R, ? extends W> function) {
        Objects.requireNonNull(function);
        return new InterfaceC9605su2() { // from class: o.ru2
            @Override // o.InterfaceC9605su2
            public final Object b(Object obj, Object obj2, Object obj3) {
                return InterfaceC9605su2.a(InterfaceC9605su2.this, function, obj, obj2, obj3);
            }
        };
    }

    R b(T t, U u, V v);

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object c(Function function, Object obj, Object obj2, Object obj3) {
        return function.apply(b(obj, obj2, obj3));
    }
}
