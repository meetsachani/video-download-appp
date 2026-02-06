package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: o.Du0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2792Du0<K, V> extends AbstractC7670l3<K, V> implements InterfaceC9582sp<K, V>, Serializable {
    private static final long serialVersionUID = 3126019624511683653L;

    public C2792Du0(SortedMap<K, V> sortedMap) {
        super(sortedMap);
    }

    public static <K, V> C2792Du0<K, V> d(SortedMap<K, V> sortedMap) {
        return new C2792Du0<>(sortedMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void clear() {
        throw new UnsupportedOperationException("Map is fixed size");
    }

    public SortedMap<K, V> e() {
        return (SortedMap) this.X;
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        return CB2.h(this.X.entrySet());
    }

    @Override // o.AbstractC7670l3, java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return new C2792Du0(e().headMap(k));
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<K> keySet() {
        return CB2.h(this.X.keySet());
    }

    @Override // o.I1, java.util.Map, o.OK1
    public V put(K k, V v) {
        if (this.X.containsKey(k)) {
            return this.X.put(k, v);
        }
        throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size");
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        if (!C6748hF.R(map.keySet(), keySet())) {
            this.X.putAll(map);
            return;
        }
        throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size");
    }

    @Override // o.InterfaceC9582sp
    public int q() {
        return size();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Map is fixed size");
    }

    @Override // o.InterfaceC9582sp
    public boolean s() {
        return true;
    }

    @Override // o.AbstractC7670l3, java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return new C2792Du0(e().subMap(k, k2));
    }

    @Override // o.AbstractC7670l3, java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return new C2792Du0(e().tailMap(k));
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Collection<V> values() {
        return ZA2.f(this.X.values());
    }
}
