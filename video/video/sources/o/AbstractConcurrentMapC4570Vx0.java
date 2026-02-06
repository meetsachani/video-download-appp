package o;

import java.util.concurrent.ConcurrentMap;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.Vx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractConcurrentMapC4570Vx0<K, V> extends AbstractC9862ty0<K, V> implements ConcurrentMap<K, V> {
    @Override // o.AbstractC9862ty0
    /* renamed from: W5 */
    public abstract ConcurrentMap<K, V> M5();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @InterfaceC6181ey
    @MB
    public V putIfAbsent(K k, V v) {
        return M5().putIfAbsent(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @InterfaceC6181ey
    public boolean remove(@MB Object obj, @MB Object obj2) {
        return M5().remove(obj, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @InterfaceC6181ey
    @MB
    public V replace(K k, V v) {
        return M5().replace(k, v);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @InterfaceC6181ey
    public boolean replace(K k, V v, V v2) {
        return M5().replace(k, v, v2);
    }
}
