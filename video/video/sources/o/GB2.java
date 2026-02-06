package o;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public final class GB2<K, V> extends AbstractC6943i3<K, V> implements QA2 {
    public GB2<V, K> Y;

    public GB2(W92<K, ? extends V> w92) {
        super(w92);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> W92<K, V> f(W92<K, ? extends V> w92) {
        if (w92 instanceof QA2) {
            return w92;
        }
        return new GB2(w92);
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        return C5509cB2.i(super.entrySet());
    }

    @Override // o.AbstractC6943i3, java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return IB2.d(d().headMap(k));
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<K> keySet() {
        return CB2.h(super.keySet());
    }

    @Override // o.X, o.InterfaceC4927Zm
    public K l0(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.I1, java.util.Map, o.OK1
    public V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6943i3, java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return IB2.d(d().subMap(k, k2));
    }

    @Override // o.AbstractC6943i3, java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return IB2.d(d().tailMap(k));
    }

    @Override // o.AbstractC9392s2, o.X, o.AbstractC5951e1, o.VT0
    public InterfaceC9855tw1<K, V> p() {
        return C11135zB2.b(d().p());
    }

    @Override // o.X, o.I1, java.util.Map, o.UC0
    public Set<V> values() {
        return CB2.h(super.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC6943i3, o.AbstractC9392s2, o.X, o.InterfaceC4927Zm
    public W92<V, K> h() {
        if (this.Y == null) {
            GB2<V, K> gb2 = new GB2<>(d().h());
            this.Y = gb2;
            gb2.Y = this;
        }
        return this.Y;
    }
}
