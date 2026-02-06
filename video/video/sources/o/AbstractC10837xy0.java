package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import o.C7935m81;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* renamed from: o.xy0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10837xy0<K, V> extends AbstractC3109Gy0<K, V> implements NavigableMap<K, V> {

    @InterfaceC4238Sm
    /* renamed from: o.xy0$a */
    /* loaded from: classes3.dex */
    public class a extends C7935m81.AbstractC7952q<K, V> {

        /* renamed from: o.xy0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0356a implements Iterator<Map.Entry<K, V>> {
            @MB
            public Map.Entry<K, V> X = null;
            @MB
            public Map.Entry<K, V> Y;

            public C0356a() {
                this.Y = a.this.Y5().lastEntry();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                Map.Entry<K, V> entry = this.Y;
                if (entry != null) {
                    this.X = entry;
                    this.Y = a.this.Y5().lowerEntry(this.Y.getKey());
                    return entry;
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.Y != null) {
                    return true;
                }
                return false;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.X != null) {
                    a.this.Y5().remove(this.X.getKey());
                    this.X = null;
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
        }

        public a() {
        }

        @Override // o.C7935m81.AbstractC7952q
        public Iterator<Map.Entry<K, V>> X5() {
            return new C0356a();
        }

        @Override // o.C7935m81.AbstractC7952q
        public NavigableMap<K, V> Y5() {
            return AbstractC10837xy0.this;
        }
    }

    @InterfaceC4238Sm
    /* renamed from: o.xy0$b */
    /* loaded from: classes3.dex */
    public class b extends C7935m81.E<K, V> {
        public b(AbstractC10837xy0 abstractC10837xy0) {
            super(abstractC10837xy0);
        }
    }

    @Override // o.AbstractC3109Gy0
    public SortedMap<K, V> X5(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
        return subMap(k, true, k2, false);
    }

    @Override // o.AbstractC3109Gy0
    /* renamed from: Z5 */
    public abstract NavigableMap<K, V> W5();

    @MB
    public Map.Entry<K, V> a6(@InterfaceC7894ly1 K k) {
        return tailMap(k, true).firstEntry();
    }

    @MB
    public K b6(@InterfaceC7894ly1 K k) {
        return (K) C7935m81.T(ceilingEntry(k));
    }

    @InterfaceC4238Sm
    public NavigableSet<K> c6() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> ceilingEntry(@InterfaceC7894ly1 K k) {
        return W5().ceilingEntry(k);
    }

    @Override // java.util.NavigableMap
    @MB
    public K ceilingKey(@InterfaceC7894ly1 K k) {
        return W5().ceilingKey(k);
    }

    @MB
    public Map.Entry<K, V> d6() {
        return (Map.Entry) C5098aU0.v(entrySet(), null);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return W5().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return W5().descendingMap();
    }

    public K e6() {
        Map.Entry<K, V> firstEntry = firstEntry();
        if (firstEntry != null) {
            return firstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @MB
    public Map.Entry<K, V> f6(@InterfaceC7894ly1 K k) {
        return headMap(k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> firstEntry() {
        return W5().firstEntry();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> floorEntry(@InterfaceC7894ly1 K k) {
        return W5().floorEntry(k);
    }

    @Override // java.util.NavigableMap
    @MB
    public K floorKey(@InterfaceC7894ly1 K k) {
        return W5().floorKey(k);
    }

    @MB
    public K g6(@InterfaceC7894ly1 K k) {
        return (K) C7935m81.T(floorEntry(k));
    }

    public SortedMap<K, V> h6(@InterfaceC7894ly1 K k) {
        return headMap(k, false);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(@InterfaceC7894ly1 K k, boolean z) {
        return W5().headMap(k, z);
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> higherEntry(@InterfaceC7894ly1 K k) {
        return W5().higherEntry(k);
    }

    @Override // java.util.NavigableMap
    @MB
    public K higherKey(@InterfaceC7894ly1 K k) {
        return W5().higherKey(k);
    }

    @MB
    public Map.Entry<K, V> i6(@InterfaceC7894ly1 K k) {
        return tailMap(k, false).firstEntry();
    }

    @MB
    public K j6(@InterfaceC7894ly1 K k) {
        return (K) C7935m81.T(higherEntry(k));
    }

    @MB
    public Map.Entry<K, V> k6() {
        return (Map.Entry) C5098aU0.v(descendingMap().entrySet(), null);
    }

    public K l6() {
        Map.Entry<K, V> lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> lastEntry() {
        return W5().lastEntry();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> lowerEntry(@InterfaceC7894ly1 K k) {
        return W5().lowerEntry(k);
    }

    @Override // java.util.NavigableMap
    @MB
    public K lowerKey(@InterfaceC7894ly1 K k) {
        return W5().lowerKey(k);
    }

    @MB
    public Map.Entry<K, V> m6(@InterfaceC7894ly1 K k) {
        return headMap(k, false).lastEntry();
    }

    @MB
    public K n6(@InterfaceC7894ly1 K k) {
        return (K) C7935m81.T(lowerEntry(k));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return W5().navigableKeySet();
    }

    @MB
    public Map.Entry<K, V> o6() {
        return (Map.Entry) C7052iU0.U(entrySet().iterator());
    }

    @MB
    public Map.Entry<K, V> p6() {
        return (Map.Entry) C7052iU0.U(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> pollFirstEntry() {
        return W5().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> pollLastEntry() {
        return W5().pollLastEntry();
    }

    public SortedMap<K, V> q6(@InterfaceC7894ly1 K k) {
        return tailMap(k, true);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(@InterfaceC7894ly1 K k, boolean z, @InterfaceC7894ly1 K k2, boolean z2) {
        return W5().subMap(k, z, k2, z2);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(@InterfaceC7894ly1 K k, boolean z) {
        return W5().tailMap(k, z);
    }
}
