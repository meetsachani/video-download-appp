package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.vy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10351vy0<K, V> extends AbstractC2510Ay0 implements InterfaceC10058um1<K, V> {
    @Override // o.InterfaceC10058um1
    @InterfaceC6181ey
    public boolean B0(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        return L5().B0(interfaceC10058um1);
    }

    @Override // o.AbstractC2510Ay0
    /* renamed from: M5 */
    public abstract InterfaceC10058um1<K, V> L5();

    @Override // o.InterfaceC10058um1
    public InterfaceC2467Am1<K> Q() {
        return L5().Q();
    }

    @Override // o.InterfaceC10058um1
    public void clear() {
        L5().clear();
    }

    @Override // o.InterfaceC10058um1
    public boolean containsKey(@MB Object obj) {
        return L5().containsKey(obj);
    }

    @Override // o.InterfaceC10058um1
    public boolean containsValue(@MB Object obj) {
        return L5().containsValue(obj);
    }

    @Override // o.InterfaceC10058um1
    @InterfaceC6181ey
    public boolean e0(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        return L5().e0(k, iterable);
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    public boolean equals(@MB Object obj) {
        if (obj != this && !L5().equals(obj)) {
            return false;
        }
        return true;
    }

    public Collection<V> get(@InterfaceC7894ly1 K k) {
        return L5().get(k);
    }

    @Override // o.InterfaceC10058um1
    public int hashCode() {
        return L5().hashCode();
    }

    @InterfaceC6181ey
    public Collection<V> i(@MB Object obj) {
        return L5().i(obj);
    }

    @Override // o.InterfaceC10058um1
    public boolean isEmpty() {
        return L5().isEmpty();
    }

    @InterfaceC6181ey
    public Collection<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        return L5().j(k, iterable);
    }

    @Override // o.InterfaceC10058um1
    public Set<K> keySet() {
        return L5().keySet();
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    public Map<K, Collection<V>> l() {
        return L5().l();
    }

    @Override // o.InterfaceC10058um1
    @InterfaceC6181ey
    public boolean put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
        return L5().put(k, v);
    }

    @Override // o.InterfaceC10058um1
    public boolean q5(@MB Object obj, @MB Object obj2) {
        return L5().q5(obj, obj2);
    }

    public Collection<Map.Entry<K, V>> r() {
        return L5().r();
    }

    @Override // o.InterfaceC10058um1
    @InterfaceC6181ey
    public boolean remove(@MB Object obj, @MB Object obj2) {
        return L5().remove(obj, obj2);
    }

    @Override // o.InterfaceC10058um1
    public int size() {
        return L5().size();
    }

    @Override // o.InterfaceC10058um1
    public Collection<V> values() {
        return L5().values();
    }
}
