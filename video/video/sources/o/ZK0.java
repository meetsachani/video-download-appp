package o;

import java.io.IOException;
import java.util.Objects;

@FunctionalInterface
/* loaded from: classes4.dex */
public interface ZK0<T, U, V> {
    static <T, U, V> ZK0<T, U, V> a() {
        return HK.g;
    }

    static /* synthetic */ void b(ZK0 zk0, ZK0 zk02, Object obj, Object obj2, Object obj3) {
        zk0.c(zk02, obj, obj2, obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default void c(ZK0 zk0, Object obj, Object obj2, Object obj3) throws IOException {
        d(obj, obj2, obj3);
        zk0.d(obj, obj2, obj3);
    }

    void d(T t, U u, V v) throws IOException;

    default ZK0<T, U, V> e(final ZK0<? super T, ? super U, ? super V> zk0) {
        Objects.requireNonNull(zk0);
        return new ZK0() { // from class: o.YK0
            @Override // o.ZK0
            public final void d(Object obj, Object obj2, Object obj3) {
                ZK0.b(ZK0.this, zk0, obj, obj2, obj3);
            }
        };
    }
}
