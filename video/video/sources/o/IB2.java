package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public final class IB2<K, V> extends AbstractC7670l3<K, V> implements QA2, Serializable {
    private static final long serialVersionUID = 5805344239827376360L;

    public IB2(SortedMap<K, ? extends V> sortedMap) {
        super(sortedMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> SortedMap<K, V> d(SortedMap<K, ? extends V> sortedMap) {
        if (sortedMap instanceof QA2) {
            return sortedMap;
        }
        return new IB2(sortedMap);
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
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC7670l3, java.util.SortedMap
    public Comparator<? super K> comparator() {
        return b().comparator();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        return C5509cB2.i(super.entrySet());
    }

    @Override // o.AbstractC7670l3, java.util.SortedMap, o.InterfaceC9369rw1
    public K firstKey() {
        return b().firstKey();
    }

    @Override // o.AbstractC7670l3, java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return new IB2(b().headMap(k));
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<K> keySet() {
        return CB2.h(super.keySet());
    }

    @Override // o.AbstractC7670l3, java.util.SortedMap, o.InterfaceC9369rw1
    public K lastKey() {
        return b().lastKey();
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

    @Override // o.AbstractC7670l3, java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return new IB2(b().subMap(k, k2));
    }

    @Override // o.AbstractC7670l3, java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return new IB2(b().tailMap(k));
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Collection<V> values() {
        return ZA2.f(super.values());
    }
}
