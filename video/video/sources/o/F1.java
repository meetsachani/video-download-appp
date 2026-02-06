package o;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import o.AbstractC6939i2;
import o.C10547wm1;
import o.C7935m81;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class F1<K, V> extends AbstractC6939i2<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map<K, Collection<V>> a1;
    public transient int b1;

    /* loaded from: classes3.dex */
    public class b extends F1<K, V>.d<Map.Entry<K, V>> {
        public b(F1 f1) {
            super();
        }

        @Override // o.F1.d
        /* renamed from: c */
        public Map.Entry<K, V> b(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
            return C7935m81.O(k, v);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends C7935m81.R<K, Collection<V>> {
        public final transient Map<K, Collection<V>> Y0;

        /* loaded from: classes3.dex */
        public class a extends C7935m81.s<K, Collection<V>> {
            public a() {
            }

            @Override // o.C7935m81.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@MB Object obj) {
                return C7232jF.j(c.this.Y0.entrySet(), obj);
            }

            @Override // o.C7935m81.s
            public Map<K, Collection<V>> i() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            @Override // o.C7935m81.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@MB Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                F1.this.A(entry.getKey());
                return true;
            }
        }

        /* loaded from: classes3.dex */
        public class b implements Iterator<Map.Entry<K, Collection<V>>> {
            public final Iterator<Map.Entry<K, Collection<V>>> X;
            @MB
            public Collection<V> Y;

            public b() {
                this.X = c.this.Y0.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.X.next();
                this.Y = next.getValue();
                return c.this.f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.X.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                if (this.Y != null) {
                    z = true;
                } else {
                    z = false;
                }
                C10664xF1.h0(z, "no calls to next() since the last call to remove()");
                this.X.remove();
                F1.p(F1.this, this.Y.size());
                this.Y.clear();
                this.Y = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            this.Y0 = map;
        }

        @Override // o.C7935m81.R
        public Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.Y0 == F1.this.a1) {
                F1.this.clear();
            } else {
                C7052iU0.h(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@MB Object obj) {
            return C7935m81.o0(this.Y0, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: d */
        public Collection<V> get(@MB Object obj) {
            Collection<V> collection = (Collection) C7935m81.p0(this.Y0, obj);
            if (collection == null) {
                return null;
            }
            return F1.this.D(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @MB
        /* renamed from: e */
        public Collection<V> remove(@MB Object obj) {
            Collection<V> remove = this.Y0.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> t = F1.this.t();
            t.addAll(remove);
            F1.p(F1.this, remove.size());
            remove.clear();
            return t;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@MB Object obj) {
            if (this != obj && !this.Y0.equals(obj)) {
                return false;
            }
            return true;
        }

        public Map.Entry<K, Collection<V>> f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C7935m81.O(key, F1.this.D(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.Y0.hashCode();
        }

        @Override // o.C7935m81.R, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return F1.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.Y0.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.Y0.toString();
        }
    }

    /* loaded from: classes3.dex */
    public abstract class d<T> implements Iterator<T> {
        public final Iterator<Map.Entry<K, Collection<V>>> X;
        @MB
        public K Y = null;
        @MB
        public Collection<V> Z = null;
        public Iterator<V> Y0 = C7052iU0.w();

        public d() {
            this.X = (Iterator<Map.Entry<K, V>>) F1.this.a1.entrySet().iterator();
        }

        public abstract T b(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.X.hasNext() && !this.Y0.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.Y0.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.X.next();
                this.Y = next.getKey();
                Collection<V> value = next.getValue();
                this.Z = value;
                this.Y0 = value.iterator();
            }
            return b(C2491As1.a(this.Y), this.Y0.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.Y0.remove();
            Collection<V> collection = this.Z;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.X.remove();
            }
            F1.n(F1.this);
        }
    }

    /* loaded from: classes3.dex */
    public class e extends C7935m81.B<K, Collection<V>> {

        /* loaded from: classes3.dex */
        public class a implements Iterator<K> {
            @MB
            public Map.Entry<K, Collection<V>> X;
            public final /* synthetic */ Iterator Y;

            public a(Iterator it) {
                this.Y = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.Y.hasNext();
            }

            @Override // java.util.Iterator
            @InterfaceC7894ly1
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.Y.next();
                this.X = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                if (this.X != null) {
                    z = true;
                } else {
                    z = false;
                }
                C10664xF1.h0(z, "no calls to next() since the last call to remove()");
                Collection<V> value = this.X.getValue();
                this.Y.remove();
                F1.p(F1.this, value.size());
                value.clear();
                this.X = null;
            }
        }

        public e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // o.C7935m81.B, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C7052iU0.h(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return i().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@MB Object obj) {
            if (this != obj && !i().keySet().equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return i().keySet().hashCode();
        }

        @Override // o.C7935m81.B, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(i().entrySet().iterator());
        }

        @Override // o.C7935m81.B, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@MB Object obj) {
            int i;
            Collection<V> remove = i().remove(obj);
            if (remove != null) {
                i = remove.size();
                remove.clear();
                F1.p(F1.this, i);
            } else {
                i = 0;
            }
            if (i <= 0) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class f extends F1<K, V>.i implements NavigableMap<K, Collection<V>> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, Collection<V>> ceilingEntry(@InterfaceC7894ly1 K k) {
            Map.Entry<K, Collection<V>> ceilingEntry = j().ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return f(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        @MB
        public K ceilingKey(@InterfaceC7894ly1 K k) {
            return j().ceilingKey(k);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(j().descendingMap());
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = j().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return f(firstEntry);
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, Collection<V>> floorEntry(@InterfaceC7894ly1 K k) {
            Map.Entry<K, Collection<V>> floorEntry = j().floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return f(floorEntry);
        }

        @Override // java.util.NavigableMap
        @MB
        public K floorKey(@InterfaceC7894ly1 K k) {
            return j().floorKey(k);
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, Collection<V>> higherEntry(@InterfaceC7894ly1 K k) {
            Map.Entry<K, Collection<V>> higherEntry = j().higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return f(higherEntry);
        }

        @Override // java.util.NavigableMap
        @MB
        public K higherKey(@InterfaceC7894ly1 K k) {
            return j().higherKey(k);
        }

        @Override // o.F1.i
        /* renamed from: k */
        public NavigableSet<K> g() {
            return new g(j());
        }

        @Override // o.F1.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: l */
        public NavigableMap<K, Collection<V>> headMap(@InterfaceC7894ly1 K k) {
            return headMap(k, false);
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = j().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return f(lastEntry);
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, Collection<V>> lowerEntry(@InterfaceC7894ly1 K k) {
            Map.Entry<K, Collection<V>> lowerEntry = j().lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return f(lowerEntry);
        }

        @Override // java.util.NavigableMap
        @MB
        public K lowerKey(@InterfaceC7894ly1 K k) {
            return j().lowerKey(k);
        }

        @MB
        public Map.Entry<K, Collection<V>> m(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> t = F1.this.t();
            t.addAll(next.getValue());
            it.remove();
            return C7935m81.O(next.getKey(), F1.this.C(t));
        }

        @Override // o.F1.i
        /* renamed from: n */
        public NavigableMap<K, Collection<V>> j() {
            return (NavigableMap) super.j();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // o.F1.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o */
        public NavigableMap<K, Collection<V>> subMap(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
            return subMap(k, true, k2, false);
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        @MB
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m(descendingMap().entrySet().iterator());
        }

        @Override // o.F1.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: r */
        public NavigableMap<K, Collection<V>> tailMap(@InterfaceC7894ly1 K k) {
            return tailMap(k, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(@InterfaceC7894ly1 K k, boolean z) {
            return new f(j().headMap(k, z));
        }

        @Override // o.F1.i, o.F1.c, o.C7935m81.R, java.util.AbstractMap, java.util.Map
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(@InterfaceC7894ly1 K k, boolean z, @InterfaceC7894ly1 K k2, boolean z2) {
            return new f(j().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(@InterfaceC7894ly1 K k, boolean z) {
            return new f(j().tailMap(k, z));
        }
    }

    /* loaded from: classes3.dex */
    public class g extends F1<K, V>.j implements NavigableSet<K> {
        public g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        @MB
        public K ceiling(@InterfaceC7894ly1 K k) {
            return j().ceilingKey(k);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(j().descendingMap());
        }

        @Override // java.util.NavigableSet
        @MB
        public K floor(@InterfaceC7894ly1 K k) {
            return j().floorKey(k);
        }

        @Override // java.util.NavigableSet
        @MB
        public K higher(@InterfaceC7894ly1 K k) {
            return j().higherKey(k);
        }

        @Override // o.F1.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: k */
        public NavigableSet<K> headSet(@InterfaceC7894ly1 K k) {
            return headSet(k, false);
        }

        @Override // o.F1.j
        /* renamed from: l */
        public NavigableMap<K, Collection<V>> j() {
            return (NavigableMap) super.j();
        }

        @Override // java.util.NavigableSet
        @MB
        public K lower(@InterfaceC7894ly1 K k) {
            return j().lowerKey(k);
        }

        @Override // o.F1.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: p */
        public NavigableSet<K> subSet(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
            return subSet(k, true, k2, false);
        }

        @Override // java.util.NavigableSet
        @MB
        public K pollFirst() {
            return (K) C7052iU0.U(iterator());
        }

        @Override // java.util.NavigableSet
        @MB
        public K pollLast() {
            return (K) C7052iU0.U(descendingIterator());
        }

        @Override // o.F1.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: r */
        public NavigableSet<K> tailSet(@InterfaceC7894ly1 K k) {
            return tailSet(k, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@InterfaceC7894ly1 K k, boolean z) {
            return new g(j().headMap(k, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@InterfaceC7894ly1 K k, boolean z, @InterfaceC7894ly1 K k2, boolean z2) {
            return new g(j().subMap(k, z, k2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@InterfaceC7894ly1 K k, boolean z) {
            return new g(j().tailMap(k, z));
        }
    }

    /* loaded from: classes3.dex */
    public class h extends F1<K, V>.l implements RandomAccess {
        public h(@InterfaceC7894ly1 F1 f1, K k, @MB List<V> list, F1<K, V>.k kVar) {
            super(k, list, kVar);
        }
    }

    /* loaded from: classes3.dex */
    public class i extends F1<K, V>.c implements SortedMap<K, Collection<V>> {
        @MB
        public SortedSet<K> a1;

        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        @MB
        public Comparator<? super K> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedMap
        @InterfaceC7894ly1
        public K firstKey() {
            return j().firstKey();
        }

        @Override // o.C7935m81.R
        /* renamed from: g */
        public SortedSet<K> b() {
            return new j(j());
        }

        public SortedMap<K, Collection<V>> headMap(@InterfaceC7894ly1 K k) {
            return new i(j().headMap(k));
        }

        @Override // o.F1.c, o.C7935m81.R, java.util.AbstractMap, java.util.Map
        /* renamed from: i */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.a1;
            if (sortedSet == null) {
                SortedSet<K> b = b();
                this.a1 = b;
                return b;
            }
            return sortedSet;
        }

        public SortedMap<K, Collection<V>> j() {
            return (SortedMap) this.Y0;
        }

        @Override // java.util.SortedMap
        @InterfaceC7894ly1
        public K lastKey() {
            return j().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
            return new i(j().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(@InterfaceC7894ly1 K k) {
            return new i(j().tailMap(k));
        }
    }

    /* loaded from: classes3.dex */
    public class j extends F1<K, V>.e implements SortedSet<K> {
        public j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        @MB
        public Comparator<? super K> comparator() {
            return j().comparator();
        }

        @Override // java.util.SortedSet
        @InterfaceC7894ly1
        public K first() {
            return j().firstKey();
        }

        public SortedSet<K> headSet(@InterfaceC7894ly1 K k) {
            return new j(j().headMap(k));
        }

        public SortedMap<K, Collection<V>> j() {
            return (SortedMap) super.i();
        }

        @Override // java.util.SortedSet
        @InterfaceC7894ly1
        public K last() {
            return j().lastKey();
        }

        public SortedSet<K> subSet(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 K k2) {
            return new j(j().subMap(k, k2));
        }

        public SortedSet<K> tailSet(@InterfaceC7894ly1 K k) {
            return new j(j().tailMap(k));
        }
    }

    /* loaded from: classes3.dex */
    public class m extends F1<K, V>.o implements NavigableSet<V> {
        public m(@InterfaceC7894ly1 K k, NavigableSet<V> navigableSet, @MB F1<K, V>.k kVar) {
            super(k, navigableSet, kVar);
        }

        @Override // java.util.NavigableSet
        @MB
        public V ceiling(@InterfaceC7894ly1 V v) {
            return k().ceiling(v);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new k.a(k().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return p(k().descendingSet());
        }

        @Override // java.util.NavigableSet
        @MB
        public V floor(@InterfaceC7894ly1 V v) {
            return k().floor(v);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(@InterfaceC7894ly1 V v, boolean z) {
            return p(k().headSet(v, z));
        }

        @Override // java.util.NavigableSet
        @MB
        public V higher(@InterfaceC7894ly1 V v) {
            return k().higher(v);
        }

        @Override // o.F1.o
        /* renamed from: l */
        public NavigableSet<V> k() {
            return (NavigableSet) super.k();
        }

        @Override // java.util.NavigableSet
        @MB
        public V lower(@InterfaceC7894ly1 V v) {
            return k().lower(v);
        }

        public final NavigableSet<V> p(NavigableSet<V> navigableSet) {
            F1<K, V>.k e;
            F1 f1 = F1.this;
            K k = this.X;
            if (e() == null) {
                e = this;
            } else {
                e = e();
            }
            return new m(k, navigableSet, e);
        }

        @Override // java.util.NavigableSet
        @MB
        public V pollFirst() {
            return (V) C7052iU0.U(iterator());
        }

        @Override // java.util.NavigableSet
        @MB
        public V pollLast() {
            return (V) C7052iU0.U(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(@InterfaceC7894ly1 V v, boolean z, @InterfaceC7894ly1 V v2, boolean z2) {
            return p(k().subSet(v, z, v2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(@InterfaceC7894ly1 V v, boolean z) {
            return p(k().tailSet(v, z));
        }
    }

    /* loaded from: classes3.dex */
    public class n extends F1<K, V>.k implements Set<V> {
        public n(@InterfaceC7894ly1 K k, Set<V> set) {
            super(k, set, null);
        }

        @Override // o.F1.k, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean I = C10856y22.I((Set) this.Y, collection);
            if (I) {
                F1.o(F1.this, this.Y.size() - size);
                j();
            }
            return I;
        }
    }

    /* loaded from: classes3.dex */
    public class o extends F1<K, V>.k implements SortedSet<V> {
        public o(@InterfaceC7894ly1 K k, SortedSet<V> sortedSet, @MB F1<K, V>.k kVar) {
            super(k, sortedSet, kVar);
        }

        @Override // java.util.SortedSet
        @MB
        public Comparator<? super V> comparator() {
            return k().comparator();
        }

        @Override // java.util.SortedSet
        @InterfaceC7894ly1
        public V first() {
            i();
            return k().first();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(@InterfaceC7894ly1 V v) {
            F1<K, V>.k e;
            i();
            F1 f1 = F1.this;
            Object h = h();
            SortedSet<V> headSet = k().headSet(v);
            if (e() == null) {
                e = this;
            } else {
                e = e();
            }
            return new o(h, headSet, e);
        }

        public SortedSet<V> k() {
            return (SortedSet) f();
        }

        @Override // java.util.SortedSet
        @InterfaceC7894ly1
        public V last() {
            i();
            return k().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(@InterfaceC7894ly1 V v, @InterfaceC7894ly1 V v2) {
            F1<K, V>.k e;
            i();
            F1 f1 = F1.this;
            Object h = h();
            SortedSet<V> subSet = k().subSet(v, v2);
            if (e() == null) {
                e = this;
            } else {
                e = e();
            }
            return new o(h, subSet, e);
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(@InterfaceC7894ly1 V v) {
            F1<K, V>.k e;
            i();
            F1 f1 = F1.this;
            Object h = h();
            SortedSet<V> tailSet = k().tailSet(v);
            if (e() == null) {
                e = this;
            } else {
                e = e();
            }
            return new o(h, tailSet, e);
        }
    }

    public F1(Map<K, Collection<V>> map) {
        C10664xF1.d(map.isEmpty());
        this.a1 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(@MB Object obj) {
        Collection collection = (Collection) C7935m81.q0(this.a1, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.b1 -= size;
        }
    }

    public static /* synthetic */ int m(F1 f1) {
        int i2 = f1.b1;
        f1.b1 = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int n(F1 f1) {
        int i2 = f1.b1;
        f1.b1 = i2 - 1;
        return i2;
    }

    public static /* synthetic */ int o(F1 f1, int i2) {
        int i3 = f1.b1 + i2;
        f1.b1 = i3;
        return i3;
    }

    public static /* synthetic */ int p(F1 f1, int i2) {
        int i3 = f1.b1 - i2;
        f1.b1 = i3;
        return i3;
    }

    public static <E> Iterator<E> z(Collection<E> collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    public final void B(Map<K, Collection<V>> map) {
        this.a1 = map;
        this.b1 = 0;
        for (Collection<V> collection : map.values()) {
            C10664xF1.d(!collection.isEmpty());
            this.b1 += collection.size();
        }
    }

    public <E> Collection<E> C(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public Collection<V> D(@InterfaceC7894ly1 K k2, Collection<V> collection) {
        return new k(k2, collection, null);
    }

    public final List<V> E(@InterfaceC7894ly1 K k2, List<V> list, @MB F1<K, V>.k kVar) {
        if (list instanceof RandomAccess) {
            return new h(this, k2, list, kVar);
        }
        return new l(k2, list, kVar);
    }

    @Override // o.AbstractC6939i2
    public Map<K, Collection<V>> a() {
        return new c(this.a1);
    }

    @Override // o.AbstractC6939i2
    public Collection<Map.Entry<K, V>> b() {
        if (this instanceof InterfaceC8660p22) {
            return new AbstractC6939i2.b(this);
        }
        return new AbstractC6939i2.a();
    }

    @Override // o.AbstractC6939i2
    public Set<K> c() {
        return new e(this.a1);
    }

    @Override // o.InterfaceC10058um1
    public void clear() {
        for (Collection<V> collection : this.a1.values()) {
            collection.clear();
        }
        this.a1.clear();
        this.b1 = 0;
    }

    @Override // o.InterfaceC10058um1
    public boolean containsKey(@MB Object obj) {
        return this.a1.containsKey(obj);
    }

    @Override // o.AbstractC6939i2
    public InterfaceC2467Am1<K> d() {
        return new C10547wm1.g(this);
    }

    @Override // o.AbstractC6939i2
    public Collection<V> e() {
        return new AbstractC6939i2.c();
    }

    @Override // o.AbstractC6939i2
    public Iterator<Map.Entry<K, V>> f() {
        return new b(this);
    }

    @Override // o.AbstractC6939i2
    public Iterator<V> g() {
        return new a(this);
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    public Collection<V> get(@InterfaceC7894ly1 K k2) {
        Collection<V> collection = this.a1.get(k2);
        if (collection == null) {
            collection = u(k2);
        }
        return D(k2, collection);
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    public Collection<V> i(@MB Object obj) {
        Collection<V> remove = this.a1.remove(obj);
        if (remove == null) {
            return x();
        }
        Collection t = t();
        t.addAll(remove);
        this.b1 -= remove.size();
        remove.clear();
        return (Collection<V>) C(t);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Collection<V> j(@InterfaceC7894ly1 K k2, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return i(k2);
        }
        Collection<V> y = y(k2);
        Collection t = t();
        t.addAll(y);
        this.b1 -= y.size();
        y.clear();
        while (it.hasNext()) {
            if (y.add(it.next())) {
                this.b1++;
            }
        }
        return (Collection<V>) C(t);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public boolean put(@InterfaceC7894ly1 K k2, @InterfaceC7894ly1 V v) {
        Collection<V> collection = this.a1.get(k2);
        if (collection == null) {
            Collection<V> u = u(k2);
            if (u.add(v)) {
                this.b1++;
                this.a1.put(k2, u);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v)) {
            this.b1++;
            return true;
        } else {
            return false;
        }
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public Collection<Map.Entry<K, V>> r() {
        return super.r();
    }

    public Map<K, Collection<V>> s() {
        return this.a1;
    }

    @Override // o.InterfaceC10058um1
    public int size() {
        return this.b1;
    }

    public abstract Collection<V> t();

    public Collection<V> u(@InterfaceC7894ly1 K k2) {
        return t();
    }

    public final Map<K, Collection<V>> v() {
        Map<K, Collection<V>> map = this.a1;
        if (map instanceof NavigableMap) {
            return new f((NavigableMap) this.a1);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.a1);
        }
        return new c(this.a1);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public Collection<V> values() {
        return super.values();
    }

    public final Set<K> w() {
        Map<K, Collection<V>> map = this.a1;
        if (map instanceof NavigableMap) {
            return new g((NavigableMap) this.a1);
        }
        if (map instanceof SortedMap) {
            return new j((SortedMap) this.a1);
        }
        return new e(this.a1);
    }

    public Collection<V> x() {
        return (Collection<V>) C(t());
    }

    public final Collection<V> y(@InterfaceC7894ly1 K k2) {
        Collection<V> collection = this.a1.get(k2);
        if (collection == null) {
            Collection<V> u = u(k2);
            this.a1.put(k2, u);
            return u;
        }
        return collection;
    }

    /* loaded from: classes3.dex */
    public class k extends AbstractCollection<V> {
        @InterfaceC7894ly1
        public final K X;
        public Collection<V> Y;
        @MB
        public final Collection<V> Y0;
        @MB
        public final F1<K, V>.k Z;

        public k(@InterfaceC7894ly1 K k, Collection<V> collection, @MB F1<K, V>.k kVar) {
            Collection<V> f;
            this.X = k;
            this.Y = collection;
            this.Z = kVar;
            if (kVar == null) {
                f = null;
            } else {
                f = kVar.f();
            }
            this.Y0 = f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@InterfaceC7894ly1 V v) {
            i();
            boolean isEmpty = this.Y.isEmpty();
            boolean add = this.Y.add(v);
            if (add) {
                F1.m(F1.this);
                if (isEmpty) {
                    d();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.Y.addAll(collection);
            if (addAll) {
                F1.o(F1.this, this.Y.size() - size);
                if (size == 0) {
                    d();
                }
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.Y.clear();
            F1.p(F1.this, size);
            j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@MB Object obj) {
            i();
            return this.Y.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            i();
            return this.Y.containsAll(collection);
        }

        public void d() {
            F1<K, V>.k kVar = this.Z;
            if (kVar != null) {
                kVar.d();
            } else {
                F1.this.a1.put(this.X, this.Y);
            }
        }

        @MB
        public F1<K, V>.k e() {
            return this.Z;
        }

        @Override // java.util.Collection
        public boolean equals(@MB Object obj) {
            if (obj == this) {
                return true;
            }
            i();
            return this.Y.equals(obj);
        }

        public Collection<V> f() {
            return this.Y;
        }

        @InterfaceC7894ly1
        public K h() {
            return this.X;
        }

        @Override // java.util.Collection
        public int hashCode() {
            i();
            return this.Y.hashCode();
        }

        public void i() {
            Collection<V> collection;
            F1<K, V>.k kVar = this.Z;
            if (kVar != null) {
                kVar.i();
                if (this.Z.f() != this.Y0) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.Y.isEmpty() && (collection = (Collection) F1.this.a1.get(this.X)) != null) {
                this.Y = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            i();
            return new a();
        }

        public void j() {
            F1<K, V>.k kVar = this.Z;
            if (kVar != null) {
                kVar.j();
            } else if (this.Y.isEmpty()) {
                F1.this.a1.remove(this.X);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@MB Object obj) {
            i();
            boolean remove = this.Y.remove(obj);
            if (remove) {
                F1.n(F1.this);
                j();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.Y.removeAll(collection);
            if (removeAll) {
                F1.o(F1.this, this.Y.size() - size);
                j();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            C10664xF1.E(collection);
            int size = size();
            boolean retainAll = this.Y.retainAll(collection);
            if (retainAll) {
                F1.o(F1.this, this.Y.size() - size);
                j();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            i();
            return this.Y.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            i();
            return this.Y.toString();
        }

        /* loaded from: classes3.dex */
        public class a implements Iterator<V> {
            public final Iterator<V> X;
            public final Collection<V> Y;

            public a() {
                Collection<V> collection = k.this.Y;
                this.Y = collection;
                this.X = F1.z(collection);
            }

            public Iterator<V> b() {
                c();
                return this.X;
            }

            public void c() {
                k.this.i();
                if (k.this.Y == this.Y) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                c();
                return this.X.hasNext();
            }

            @Override // java.util.Iterator
            @InterfaceC7894ly1
            public V next() {
                c();
                return this.X.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.X.remove();
                F1.n(F1.this);
                k.this.j();
            }

            public a(Iterator<V> it) {
                this.Y = k.this.Y;
                this.X = it;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class l extends F1<K, V>.k implements List<V> {

        /* loaded from: classes3.dex */
        public class a extends F1<K, V>.k.a implements ListIterator<V> {
            public a() {
                super();
            }

            @Override // java.util.ListIterator
            public void add(@InterfaceC7894ly1 V v) {
                boolean isEmpty = l.this.isEmpty();
                d().add(v);
                F1.m(F1.this);
                if (isEmpty) {
                    l.this.d();
                }
            }

            public final ListIterator<V> d() {
                return (ListIterator) b();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return d().nextIndex();
            }

            @Override // java.util.ListIterator
            @InterfaceC7894ly1
            public V previous() {
                return d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(@InterfaceC7894ly1 V v) {
                d().set(v);
            }

            public a(int i) {
                super(l.this.k().listIterator(i));
            }
        }

        public l(@InterfaceC7894ly1 K k, List<V> list, @MB F1<K, V>.k kVar) {
            super(k, list, kVar);
        }

        @Override // java.util.List
        public void add(int i, @InterfaceC7894ly1 V v) {
            i();
            boolean isEmpty = f().isEmpty();
            k().add(i, v);
            F1.m(F1.this);
            if (isEmpty) {
                d();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = k().addAll(i, collection);
            if (addAll) {
                F1.o(F1.this, f().size() - size);
                if (size == 0) {
                    d();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        @InterfaceC7894ly1
        public V get(int i) {
            i();
            return k().get(i);
        }

        @Override // java.util.List
        public int indexOf(@MB Object obj) {
            i();
            return k().indexOf(obj);
        }

        public List<V> k() {
            return (List) f();
        }

        @Override // java.util.List
        public int lastIndexOf(@MB Object obj) {
            i();
            return k().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            i();
            return new a();
        }

        @Override // java.util.List
        @InterfaceC7894ly1
        public V remove(int i) {
            i();
            V remove = k().remove(i);
            F1.n(F1.this);
            j();
            return remove;
        }

        @Override // java.util.List
        @InterfaceC7894ly1
        public V set(int i, @InterfaceC7894ly1 V v) {
            i();
            return k().set(i, v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            F1<K, V>.k e;
            i();
            F1 f1 = F1.this;
            Object h = h();
            List<V> subList = k().subList(i, i2);
            if (e() == null) {
                e = this;
            } else {
                e = e();
            }
            return f1.E(h, subList, e);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            i();
            return new a(i);
        }
    }

    /* loaded from: classes3.dex */
    public class a extends F1<K, V>.d<V> {
        public a(F1 f1) {
            super();
        }

        @Override // o.F1.d
        @InterfaceC7894ly1
        public V b(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
            return v;
        }
    }
}
