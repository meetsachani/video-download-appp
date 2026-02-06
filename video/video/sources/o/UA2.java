package o;

import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class UA2<K, V> extends X<K, V> implements QA2 {
    public UA2<V, K> Y;

    public UA2(InterfaceC4927Zm<? extends K, ? extends V> interfaceC4927Zm) {
        super(interfaceC4927Zm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> InterfaceC4927Zm<K, V> d(InterfaceC4927Zm<? extends K, ? extends V> interfaceC4927Zm) {
        if (interfaceC4927Zm instanceof QA2) {
            return interfaceC4927Zm;
        }
        return new UA2(interfaceC4927Zm);
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        return C5509cB2.i(super.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.X, o.InterfaceC4927Zm
    public synchronized InterfaceC4927Zm<V, K> h() {
        try {
            if (this.Y == null) {
                UA2<V, K> ua2 = new UA2<>(b().h());
                this.Y = ua2;
                ua2.Y = this;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.Y;
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<K> keySet() {
        return CB2.h(super.keySet());
    }

    @Override // o.X, o.InterfaceC4927Zm
    public K l0(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.X, o.AbstractC5951e1, o.VT0
    public U71<K, V> p() {
        return C8939qB2.b(b().p());
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

    @Override // o.X, o.I1, java.util.Map, o.UC0
    public Set<V> values() {
        return CB2.h(super.values());
    }
}
