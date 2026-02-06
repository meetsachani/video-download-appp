package o;

import java.io.IOException;
import java.util.Objects;

@FunctionalInterface
/* renamed from: o.bL0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC5305bL0<T, U, V, R> {
    default <W> InterfaceC5305bL0<T, U, V, W> a(final RJ0<? super R, ? extends W> rj0) {
        Objects.requireNonNull(rj0);
        return new InterfaceC5305bL0() { // from class: o.aL0
            @Override // o.InterfaceC5305bL0
            public final Object b(Object obj, Object obj2, Object obj3) {
                Object d;
                d = InterfaceC5305bL0.this.d(rj0, obj, obj2, obj3);
                return d;
            }
        };
    }

    R b(T t, U u, V v) throws IOException;

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default Object d(RJ0 rj0, Object obj, Object obj2, Object obj3) throws IOException {
        return rj0.apply(b(obj, obj2, obj3));
    }
}
