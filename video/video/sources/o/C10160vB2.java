package o;

import java.util.Map;
import java.util.Set;

/* renamed from: o.vB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10160vB2<K, V> extends AbstractC9392s2<K, V> implements QA2 {
    public C10160vB2<V, K> Y;

    public C10160vB2(InterfaceC8390nw1<? extends K, ? extends V> interfaceC8390nw1) {
        super(interfaceC8390nw1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> InterfaceC8390nw1<K, V> f(InterfaceC8390nw1<? extends K, ? extends V> interfaceC8390nw1) {
        if (interfaceC8390nw1 instanceof QA2) {
            return interfaceC8390nw1;
        }
        return new C10160vB2(interfaceC8390nw1);
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InterfaceC8390nw1<V, K> e() {
        if (this.Y == null) {
            C10160vB2<V, K> c10160vB2 = new C10160vB2<>(c().h());
            this.Y = c10160vB2;
            c10160vB2.Y = this;
        }
        return this.Y;
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        return C5509cB2.i(super.entrySet());
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

    @Override // o.AbstractC9392s2, o.X, o.InterfaceC4927Zm
    public InterfaceC8390nw1<V, K> h() {
        return e();
    }

    @Override // o.AbstractC9392s2, o.X, o.AbstractC5951e1, o.VT0
    public InterfaceC9855tw1<K, V> p() {
        return C11135zB2.b(c().p());
    }

    @Override // o.X, o.I1, java.util.Map, o.UC0
    public Set<V> values() {
        return CB2.h(super.values());
    }
}
