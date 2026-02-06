package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes4.dex */
public abstract class A0<K, V> implements InterfaceC4927Zm<K, V> {
    public transient Map<K, V> X;
    public transient Map<V, K> Y;
    public transient Set<K> Y0;
    public transient InterfaceC4927Zm<V, K> Z;
    public transient Set<V> Z0;
    public transient Set<Map.Entry<K, V>> a1;

    /* loaded from: classes4.dex */
    public static class a<K, V> implements U71<K, V>, MS1<K> {
        public final A0<K, V> X;
        public Iterator<Map.Entry<K, V>> Y;
        public Map.Entry<K, V> Z = null;
        public boolean Y0 = false;

        public a(A0<K, V> a0) {
            this.X = a0;
            this.Y = a0.X.entrySet().iterator();
        }

        @Override // o.U71
        public K getKey() {
            Map.Entry<K, V> entry = this.Z;
            if (entry != null) {
                return entry.getKey();
            }
            throw new IllegalStateException("Iterator getKey() can only be called after next() and before remove()");
        }

        @Override // o.U71
        public V getValue() {
            Map.Entry<K, V> entry = this.Z;
            if (entry != null) {
                return entry.getValue();
            }
            throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
        }

        @Override // o.U71, java.util.Iterator
        public boolean hasNext() {
            return this.Y.hasNext();
        }

        @Override // o.U71, java.util.Iterator
        public K next() {
            Map.Entry<K, V> next = this.Y.next();
            this.Z = next;
            this.Y0 = true;
            return next.getKey();
        }

        @Override // o.U71, java.util.Iterator
        public void remove() {
            if (this.Y0) {
                V value = this.Z.getValue();
                this.Y.remove();
                this.X.Y.remove(value);
                this.Z = null;
                this.Y0 = false;
                return;
            }
            throw new IllegalStateException("Iterator remove() can only be called once after next()");
        }

        @Override // o.MS1
        public void reset() {
            this.Y = this.X.X.entrySet().iterator();
            this.Z = null;
            this.Y0 = false;
        }

        @Override // o.U71
        public V setValue(V v) {
            if (this.Z != null) {
                if (this.X.Y.containsKey(v) && this.X.Y.get(v) != this.Z.getKey()) {
                    throw new IllegalArgumentException("Cannot use setValue() when the object being set is already in the map");
                }
                return this.X.put(this.Z.getKey(), v);
            }
            throw new IllegalStateException("Iterator setValue() can only be called after next() and before remove()");
        }

        public String toString() {
            if (this.Z != null) {
                return "MapIterator[" + getKey() + "=" + getValue() + C6566gU0.g;
            }
            return "MapIterator[]";
        }
    }

    /* loaded from: classes4.dex */
    public static class b<K, V> extends i<K, V, Map.Entry<K, V>> implements Set<Map.Entry<K, V>> {
        private static final long serialVersionUID = 4040410962603292348L;

        public b(A0<K, V> a0) {
            super(a0.X.entrySet(), a0);
        }

        @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return this.Y.b(super.iterator());
        }

        @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            if (this.Y.containsKey(key)) {
                V v = this.Y.X.get(key);
                Object value = entry.getValue();
                if (v != null ? v.equals(value) : value == null) {
                    this.Y.X.remove(key);
                    this.Y.Y.remove(v);
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static class c<K, V> extends AbstractC6935i1<Map.Entry<K, V>> {
        public final A0<K, V> Y;
        public boolean Y0;
        public Map.Entry<K, V> Z;

        public c(Iterator<Map.Entry<K, V>> it, A0<K, V> a0) {
            super(it);
            this.Z = null;
            this.Y0 = false;
            this.Y = a0;
        }

        @Override // o.AbstractC6935i1, java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            f fVar = new f((Map.Entry) super.next(), this.Y);
            this.Z = fVar;
            this.Y0 = true;
            return fVar;
        }

        @Override // o.C3, java.util.Iterator
        public void remove() {
            if (this.Y0) {
                V value = this.Z.getValue();
                super.remove();
                this.Y.Y.remove(value);
                this.Z = null;
                this.Y0 = false;
                return;
            }
            throw new IllegalStateException("Iterator remove() can only be called once after next()");
        }
    }

    /* loaded from: classes4.dex */
    public static class d<K> extends i<K, Object, K> implements Set<K> {
        private static final long serialVersionUID = -7107935777385040694L;

        public d(A0<K, ?> a0) {
            super(a0.X.keySet(), a0);
        }

        @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.Y.X.containsKey(obj);
        }

        @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return this.Y.c(super.iterator());
        }

        @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (this.Y.X.containsKey(obj)) {
                this.Y.Y.remove(this.Y.X.remove(obj));
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static class e<K> extends AbstractC6935i1<K> {
        public final A0<K, ?> Y;
        public boolean Y0;
        public K Z;

        public e(Iterator<K> it, A0<K, ?> a0) {
            super(it);
            this.Z = null;
            this.Y0 = false;
            this.Y = a0;
        }

        @Override // o.AbstractC6935i1, java.util.Iterator
        public K next() {
            K k = (K) super.next();
            this.Z = k;
            this.Y0 = true;
            return k;
        }

        @Override // o.C3, java.util.Iterator
        public void remove() {
            if (this.Y0) {
                Object obj = this.Y.X.get(this.Z);
                super.remove();
                this.Y.Y.remove(obj);
                this.Z = null;
                this.Y0 = false;
                return;
            }
            throw new IllegalStateException("Iterator remove() can only be called once after next()");
        }
    }

    /* loaded from: classes4.dex */
    public static class f<K, V> extends N1<K, V> {
        public final A0<K, V> Y;

        public f(Map.Entry<K, V> entry, A0<K, V> a0) {
            super(entry);
            this.Y = a0;
        }

        @Override // o.N1, java.util.Map.Entry
        public V setValue(V v) {
            K key = getKey();
            if (this.Y.Y.containsKey(v) && this.Y.Y.get(v) != key) {
                throw new IllegalArgumentException("Cannot use setValue() when the object being set is already in the map");
            }
            this.Y.put(key, v);
            return (V) super.setValue(v);
        }
    }

    /* loaded from: classes4.dex */
    public static class g<V> extends i<Object, V, V> implements Set<V> {
        private static final long serialVersionUID = 4023777119829639864L;

        public g(A0<?, V> a0) {
            super(a0.X.values(), a0);
        }

        @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.Y.Y.containsKey(obj);
        }

        @Override // o.AbstractC8162n0, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return this.Y.d(super.iterator());
        }

        @Override // o.AbstractC8162n0, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (this.Y.Y.containsKey(obj)) {
                this.Y.X.remove(this.Y.Y.remove(obj));
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes4.dex */
    public static class h<V> extends AbstractC6935i1<V> {
        public final A0<Object, V> Y;
        public boolean Y0;
        public V Z;

        public h(Iterator<V> it, A0<?, V> a0) {
            super(it);
            this.Z = null;
            this.Y0 = false;
            this.Y = a0;
        }

        @Override // o.AbstractC6935i1, java.util.Iterator
        public V next() {
            V v = (V) super.next();
            this.Z = v;
            this.Y0 = true;
            return v;
        }

        @Override // o.C3, java.util.Iterator
        public void remove() {
            if (this.Y0) {
                super.remove();
                this.Y.Y.remove(this.Z);
                this.Z = null;
                this.Y0 = false;
                return;
            }
            throw new IllegalStateException("Iterator remove() can only be called once after next()");
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class i<K, V, E> extends AbstractC8162n0<E> {
        private static final long serialVersionUID = 4621510560119690639L;
        public final A0<K, V> Y;

        public i(Collection<E> collection, A0<K, V> a0) {
            super(collection);
            this.Y = a0;
        }

        @Override // o.AbstractC8162n0, java.util.Collection
        public void clear() {
            this.Y.clear();
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj != this && !d().equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Collection
        public int hashCode() {
            return d().hashCode();
        }

        @Override // o.AbstractC8162n0, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            boolean z = false;
            if (!this.Y.isEmpty() && !collection.isEmpty()) {
                Iterator<?> it = collection.iterator();
                while (it.hasNext()) {
                    z |= remove(it.next());
                }
            }
            return z;
        }

        @Override // o.AbstractC8162n0, java.util.Collection
        public boolean removeIf(Predicate<? super E> predicate) {
            boolean z = false;
            if (!this.Y.isEmpty() && predicate != null) {
                Iterator<E> it = iterator();
                while (it.hasNext()) {
                    if (predicate.test(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
            }
            return z;
        }

        @Override // o.AbstractC8162n0, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            boolean z = false;
            if (this.Y.isEmpty()) {
                return false;
            }
            if (collection.isEmpty()) {
                this.Y.clear();
                return true;
            }
            Iterator<E> it = iterator();
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
    }

    public A0() {
        this.Z = null;
        this.Y0 = null;
        this.Z0 = null;
        this.a1 = null;
    }

    public abstract InterfaceC4927Zm<V, K> a(Map<V, K> map, Map<K, V> map2, InterfaceC4927Zm<K, V> interfaceC4927Zm);

    public Iterator<Map.Entry<K, V>> b(Iterator<Map.Entry<K, V>> it) {
        return new c(it, this);
    }

    @Override // o.InterfaceC4927Zm
    public K b0(Object obj) {
        return this.Y.get(obj);
    }

    public Iterator<K> c(Iterator<K> it) {
        return new e(it, this);
    }

    @Override // java.util.Map, o.OK1
    public void clear() {
        this.X.clear();
        this.Y.clear();
    }

    @Override // java.util.Map, o.UC0
    public boolean containsKey(Object obj) {
        return this.X.containsKey(obj);
    }

    @Override // java.util.Map, o.UC0
    public boolean containsValue(Object obj) {
        return this.Y.containsKey(obj);
    }

    public Iterator<V> d(Iterator<V> it) {
        return new h(it, this);
    }

    @Override // java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.a1 == null) {
            this.a1 = new b(this);
        }
        return this.a1;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.X.equals(obj);
    }

    @Override // java.util.Map, o.UC0
    public V get(Object obj) {
        return this.X.get(obj);
    }

    @Override // o.InterfaceC4927Zm
    public InterfaceC4927Zm<V, K> h() {
        if (this.Z == null) {
            this.Z = a(this.Y, this.X, this);
        }
        return this.Z;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.util.Map, o.UC0
    public boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.Map, o.UC0
    public Set<K> keySet() {
        if (this.Y0 == null) {
            this.Y0 = new d(this);
        }
        return this.Y0;
    }

    @Override // o.InterfaceC4927Zm
    public K l0(Object obj) {
        if (this.Y.containsKey(obj)) {
            K remove = this.Y.remove(obj);
            this.X.remove(remove);
            return remove;
        }
        return null;
    }

    @Override // o.VT0
    public U71<K, V> p() {
        return new a(this);
    }

    @Override // o.InterfaceC4927Zm, java.util.Map, o.OK1
    public V put(K k, V v) {
        if (this.X.containsKey(k)) {
            this.Y.remove(this.X.get(k));
        }
        if (this.Y.containsKey(v)) {
            this.X.remove(this.Y.get(v));
        }
        V put = this.X.put(k, v);
        this.Y.put(v, k);
        return put;
    }

    @Override // java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, o.UC0
    public V remove(Object obj) {
        if (this.X.containsKey(obj)) {
            V remove = this.X.remove(obj);
            this.Y.remove(remove);
            return remove;
        }
        return null;
    }

    @Override // java.util.Map, o.UC0
    public int size() {
        return this.X.size();
    }

    public String toString() {
        return this.X.toString();
    }

    @Override // o.InterfaceC4927Zm, java.util.Map, o.UC0
    public Set<V> values() {
        if (this.Z0 == null) {
            this.Z0 = new g(this);
        }
        return this.Z0;
    }

    public A0(Map<K, V> map, Map<V, K> map2) {
        this.Z = null;
        this.Y0 = null;
        this.Z0 = null;
        this.a1 = null;
        this.X = map;
        this.Y = map2;
    }

    public A0(Map<K, V> map, Map<V, K> map2, InterfaceC4927Zm<V, K> interfaceC4927Zm) {
        this.Y0 = null;
        this.Z0 = null;
        this.a1 = null;
        this.X = map;
        this.Y = map2;
        this.Z = interfaceC4927Zm;
    }
}
