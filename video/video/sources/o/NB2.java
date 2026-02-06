package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public class NB2<K, V> implements InterfaceC10091uu2<K, V>, Serializable, QA2 {
    private static final long serialVersionUID = -7156426030315945159L;
    public final InterfaceC10091uu2<K, V> X;

    /* JADX WARN: Multi-variable type inference failed */
    public NB2(InterfaceC10091uu2<K, ? extends V> interfaceC10091uu2) {
        if (interfaceC10091uu2 != 0) {
            this.X = interfaceC10091uu2;
            return;
        }
        throw new NullPointerException("Trie must not be null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> InterfaceC10091uu2<K, V> a(InterfaceC10091uu2<K, ? extends V> interfaceC10091uu2) {
        if (interfaceC10091uu2 instanceof QA2) {
            return interfaceC10091uu2;
        }
        return new NB2(interfaceC10091uu2);
    }

    @Override // o.InterfaceC10091uu2
    public SortedMap<K, V> O0(K k) {
        return Collections.unmodifiableSortedMap(this.X.O0(k));
    }

    @Override // java.util.Map, o.OK1
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return this.X.comparator();
    }

    @Override // java.util.Map, o.UC0
    public boolean containsKey(Object obj) {
        return this.X.containsKey(obj);
    }

    @Override // java.util.Map, o.UC0
    public boolean containsValue(Object obj) {
        return this.X.containsValue(obj);
    }

    @Override // java.util.SortedMap, java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        return Collections.unmodifiableSet(this.X.entrySet());
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.X.equals(obj);
    }

    @Override // java.util.SortedMap, o.InterfaceC9369rw1
    public K firstKey() {
        return this.X.firstKey();
    }

    @Override // java.util.Map, o.UC0
    public V get(Object obj) {
        return this.X.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return Collections.unmodifiableSortedMap(this.X.headMap(k));
    }

    @Override // java.util.Map, o.UC0
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // o.InterfaceC9369rw1
    public K j0(K k) {
        return this.X.j0(k);
    }

    @Override // java.util.SortedMap, java.util.Map, o.UC0
    public Set<K> keySet() {
        return Collections.unmodifiableSet(this.X.keySet());
    }

    @Override // java.util.SortedMap, o.InterfaceC9369rw1
    public K lastKey() {
        return this.X.lastKey();
    }

    @Override // o.InterfaceC9369rw1
    public K n0(K k) {
        return this.X.n0(k);
    }

    @Override // java.util.Map, o.OK1
    public V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, o.UC0
    public V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, o.UC0
    public int size() {
        return this.X.size();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return Collections.unmodifiableSortedMap(this.X.subMap(k, k2));
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return Collections.unmodifiableSortedMap(this.X.tailMap(k));
    }

    public String toString() {
        return this.X.toString();
    }

    @Override // java.util.SortedMap, java.util.Map, o.UC0
    public Collection<V> values() {
        return Collections.unmodifiableCollection(this.X.values());
    }

    @Override // o.InterfaceC9369rw1, o.VT0
    public InterfaceC9855tw1<K, V> p() {
        return C11135zB2.b(this.X.p());
    }
}
