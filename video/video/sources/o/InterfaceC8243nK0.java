package o;

import java.io.IOException;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.nK0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC8243nK0<T, U, V, W, R> {
    default <X> InterfaceC8243nK0<T, U, V, W, X> a(final RJ0<? super R, ? extends X> rj0) {
        Objects.requireNonNull(rj0);
        return new InterfaceC8243nK0() { // from class: o.mK0
            @Override // o.InterfaceC8243nK0
            public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
                Object d;
                d = InterfaceC8243nK0.this.d(rj0, obj, obj2, obj3, obj4);
                return d;
            }
        };
    }

    R c(T t, U u, V v, W w) throws IOException;

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object d(RJ0 rj0, Object obj, Object obj2, Object obj3, Object obj4) throws IOException {
        return rj0.apply(c(obj, obj2, obj3, obj4));
    }
}
