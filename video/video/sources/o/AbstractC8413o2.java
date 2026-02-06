package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import o.C7935m81;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* renamed from: o.o2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8413o2<K, V> extends C7935m81.A<K, V> implements NavigableMap<K, V> {

    /* renamed from: o.o2$b */
    /* loaded from: classes3.dex */
    public final class b extends C7935m81.AbstractC7952q<K, V> {
        public b() {
        }

        @Override // o.C7935m81.AbstractC7952q
        public Iterator<Map.Entry<K, V>> X5() {
            return AbstractC8413o2.this.b();
        }

        @Override // o.C7935m81.AbstractC7952q
        public NavigableMap<K, V> Y5() {
            return AbstractC8413o2.this;
        }
    }

    public abstract Iterator<Map.Entry<K, V>> b();

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> ceilingEntry(@InterfaceC7894ly1 K k) {
        return tailMap(k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @MB
    public K ceilingKey(@InterfaceC7894ly1 K k) {
        return (K) C7935m81.T(ceilingEntry(k));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    public NavigableMap<K, V> descendingMap() {
        return new b();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) C7052iU0.J(a(), null);
    }

    @Override // java.util.SortedMap
    @InterfaceC7894ly1
    public K firstKey() {
        Map.Entry<K, V> firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> floorEntry(@InterfaceC7894ly1 K k) {
        return headMap(k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @MB
    public K floorKey(@InterfaceC7894ly1 K k) {
        return (K) C7935m81.T(floorEntry(k));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @MB
    public abstract V get(@MB Object obj);

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(@InterfaceC7894ly1 K k) {
        return headMap(k, false);
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> higherEntry(@InterfaceC7894ly1 K k) {
        return tailMap(k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @MB
    public K higherKey(@InterfaceC7894ly1 K k) {
        return (K) C7935m81.T(higherEntry(k));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) C7052iU0.J(b(), null);
    }

    @Override // java.util.SortedMap
    @InterfaceC7894ly1
    public K lastKey() {
        Map.Entry<K, V> lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> lowerEntry(@InterfaceC7894ly1 K k) {
        return headMap(k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @MB
    public K lowerKey(@InterfaceC7894ly1 K k) {
        return (K) C7935m81.T(lowerEntry(k));
    }

    public NavigableSet<K> navigableKeySet() {
        return new C7935m81.E(this);
    }

    @MB
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) C7052iU0.U(a());
    }

    @MB
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) C7052iU0.U(b());
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> subMap(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
        return subMap(k, true, k2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> tailMap(@InterfaceC7894ly1 K k) {
        return tailMap(k, true);
    }
}
