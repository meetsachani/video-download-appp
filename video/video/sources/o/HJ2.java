package o;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class HJ2<K, V> extends HashMap<K, V> {
    public Map<K, V> X;
    public boolean Y = false;

    /* loaded from: classes4.dex */
    public class d extends HJ2<K, V>.b<K> implements Set<K> {
        public d() {
            super();
        }

        @Override // o.HJ2.b
        public Collection<K> d(Map<K, V> map) {
            return map.keySet();
        }

        @Override // o.HJ2.b
        public K e(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* loaded from: classes4.dex */
    public class e extends HJ2<K, V>.b<V> {
        public e() {
            super();
        }

        @Override // o.HJ2.b
        public Collection<V> d(Map<K, V> map) {
            return map.values();
        }

        @Override // o.HJ2.b
        public V e(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    public HJ2() {
        this.X = null;
        this.X = f();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (this.Y) {
            synchronized (this) {
                this.X = f();
            }
            return;
        }
        synchronized (this.X) {
            this.X.clear();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public Object clone() {
        HJ2 hj2;
        HJ2 hj22;
        if (this.Y) {
            hj22 = new HJ2(this.X);
        } else {
            synchronized (this.X) {
                hj2 = new HJ2(this.X);
            }
            hj22 = hj2;
        }
        hj22.l(k());
        return hj22;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        boolean containsKey;
        if (this.Y) {
            return this.X.containsKey(obj);
        }
        synchronized (this.X) {
            containsKey = this.X.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean containsValue;
        if (this.Y) {
            return this.X.containsValue(obj);
        }
        synchronized (this.X) {
            containsValue = this.X.containsValue(obj);
        }
        return containsValue;
    }

    public Map<K, V> e(Map<? extends K, ? extends V> map) {
        return j(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.Y) {
            if (map.size() != this.X.size()) {
                return false;
            }
            for (Map.Entry<K, V> entry : this.X.entrySet()) {
                K key = entry.getKey();
                V value = entry.getValue();
                if (value == null) {
                    if (map.get(key) != null || !map.containsKey(key)) {
                        return false;
                    }
                } else if (!value.equals(map.get(key))) {
                    return false;
                }
            }
            return true;
        }
        synchronized (this.X) {
            try {
                if (map.size() != this.X.size()) {
                    return false;
                }
                for (Map.Entry<K, V> entry2 : this.X.entrySet()) {
                    K key2 = entry2.getKey();
                    V value2 = entry2.getValue();
                    if (value2 == null) {
                        if (map.get(key2) != null || !map.containsKey(key2)) {
                            return false;
                        }
                    } else if (!value2.equals(map.get(key2))) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Map<K, V> f() {
        return new WeakHashMap();
    }

    public Map<K, V> g(int i) {
        return new WeakHashMap(i);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        V v;
        if (this.Y) {
            return this.X.get(obj);
        }
        synchronized (this.X) {
            v = this.X.get(obj);
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i = 0;
        if (this.Y) {
            for (Map.Entry<K, V> entry : this.X.entrySet()) {
                i += entry.hashCode();
            }
            return i;
        }
        synchronized (this.X) {
            try {
                for (Map.Entry<K, V> entry2 : this.X.entrySet()) {
                    i += entry2.hashCode();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public Map<K, V> i(int i, float f) {
        return new WeakHashMap(i, f);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        boolean isEmpty;
        if (this.Y) {
            return this.X.isEmpty();
        }
        synchronized (this.X) {
            isEmpty = this.X.isEmpty();
        }
        return isEmpty;
    }

    public Map<K, V> j(Map<? extends K, ? extends V> map) {
        return new WeakHashMap(map);
    }

    public boolean k() {
        return this.Y;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        return new d();
    }

    public void l(boolean z) {
        this.Y = z;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        V put;
        V put2;
        if (this.Y) {
            synchronized (this) {
                Map<K, V> e2 = e(this.X);
                put2 = e2.put(k, v);
                this.X = e2;
            }
            return put2;
        }
        synchronized (this.X) {
            put = this.X.put(k, v);
        }
        return put;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        if (this.Y) {
            synchronized (this) {
                Map<K, V> e2 = e(this.X);
                e2.putAll(map);
                this.X = e2;
            }
            return;
        }
        synchronized (this.X) {
            this.X.putAll(map);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        V remove;
        V remove2;
        if (this.Y) {
            synchronized (this) {
                Map<K, V> e2 = e(this.X);
                remove2 = e2.remove(obj);
                this.X = e2;
            }
            return remove2;
        }
        synchronized (this.X) {
            remove = this.X.remove(obj);
        }
        return remove;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public int size() {
        int size;
        if (this.Y) {
            return this.X.size();
        }
        synchronized (this.X) {
            size = this.X.size();
        }
        return size;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        return new e();
    }

    /* loaded from: classes4.dex */
    public abstract class b<E> implements Collection<E> {

        /* loaded from: classes4.dex */
        public class a implements Iterator<E> {
            public Map<K, V> X;
            public Map.Entry<K, V> Y = null;
            public final Iterator<Map.Entry<K, V>> Z;

            public a() {
                Map<K, V> map = HJ2.this.X;
                this.X = map;
                this.Z = map.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.X == HJ2.this.X) {
                    return this.Z.hasNext();
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.X == HJ2.this.X) {
                    Map.Entry<K, V> next = this.Z.next();
                    this.Y = next;
                    return (E) b.this.e(next);
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public void remove() {
                if (this.Y != null) {
                    if (HJ2.this.Y) {
                        synchronized (HJ2.this) {
                            try {
                                if (this.X == HJ2.this.X) {
                                    HJ2.this.remove(this.Y.getKey());
                                    this.Y = null;
                                    this.X = HJ2.this.X;
                                } else {
                                    throw new ConcurrentModificationException();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return;
                    }
                    this.Z.remove();
                    this.Y = null;
                    return;
                }
                throw new IllegalStateException();
            }
        }

        public b() {
        }

        @Override // java.util.Collection
        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            if (!HJ2.this.Y) {
                synchronized (HJ2.this.X) {
                    d(HJ2.this.X).clear();
                }
                return;
            }
            synchronized (HJ2.this) {
                HJ2 hj2 = HJ2.this;
                hj2.X = hj2.f();
            }
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            boolean contains;
            if (!HJ2.this.Y) {
                synchronized (HJ2.this.X) {
                    contains = d(HJ2.this.X).contains(obj);
                }
                return contains;
            }
            return d(HJ2.this.X).contains(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            boolean containsAll;
            if (!HJ2.this.Y) {
                synchronized (HJ2.this.X) {
                    containsAll = d(HJ2.this.X).containsAll(collection);
                }
                return containsAll;
            }
            return d(HJ2.this.X).containsAll(collection);
        }

        public abstract Collection<E> d(Map<K, V> map);

        public abstract E e(Map.Entry<K, V> entry);

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            if (!HJ2.this.Y) {
                synchronized (HJ2.this.X) {
                    equals = d(HJ2.this.X).equals(obj);
                }
                return equals;
            }
            return d(HJ2.this.X).equals(obj);
        }

        @Override // java.util.Collection
        public int hashCode() {
            int hashCode;
            if (!HJ2.this.Y) {
                synchronized (HJ2.this.X) {
                    hashCode = d(HJ2.this.X).hashCode();
                }
                return hashCode;
            }
            return d(HJ2.this.X).hashCode();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean isEmpty;
            if (!HJ2.this.Y) {
                synchronized (HJ2.this.X) {
                    isEmpty = d(HJ2.this.X).isEmpty();
                }
                return isEmpty;
            }
            return d(HJ2.this.X).isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return new a();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            boolean remove;
            boolean remove2;
            if (!HJ2.this.Y) {
                synchronized (HJ2.this.X) {
                    remove = d(HJ2.this.X).remove(obj);
                }
                return remove;
            }
            synchronized (HJ2.this) {
                HJ2 hj2 = HJ2.this;
                Map<K, V> e = hj2.e(hj2.X);
                remove2 = d(e).remove(obj);
                HJ2.this.X = e;
            }
            return remove2;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            boolean removeAll;
            boolean removeAll2;
            if (!HJ2.this.Y) {
                synchronized (HJ2.this.X) {
                    removeAll = d(HJ2.this.X).removeAll(collection);
                }
                return removeAll;
            }
            synchronized (HJ2.this) {
                HJ2 hj2 = HJ2.this;
                Map<K, V> e = hj2.e(hj2.X);
                removeAll2 = d(e).removeAll(collection);
                HJ2.this.X = e;
            }
            return removeAll2;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            boolean retainAll;
            boolean retainAll2;
            if (!HJ2.this.Y) {
                synchronized (HJ2.this.X) {
                    retainAll = d(HJ2.this.X).retainAll(collection);
                }
                return retainAll;
            }
            synchronized (HJ2.this) {
                HJ2 hj2 = HJ2.this;
                Map<K, V> e = hj2.e(hj2.X);
                retainAll2 = d(e).retainAll(collection);
                HJ2.this.X = e;
            }
            return retainAll2;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            if (!HJ2.this.Y) {
                synchronized (HJ2.this.X) {
                    size = d(HJ2.this.X).size();
                }
                return size;
            }
            return d(HJ2.this.X).size();
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            if (HJ2.this.Y) {
                return (T[]) d(HJ2.this.X).toArray(tArr);
            }
            synchronized (HJ2.this.X) {
                tArr2 = (T[]) d(HJ2.this.X).toArray(tArr);
            }
            return tArr2;
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            Object[] array;
            if (HJ2.this.Y) {
                return d(HJ2.this.X).toArray();
            }
            synchronized (HJ2.this.X) {
                array = d(HJ2.this.X).toArray();
            }
            return array;
        }
    }

    public HJ2(int i) {
        this.X = null;
        this.X = g(i);
    }

    public HJ2(int i, float f) {
        this.X = null;
        this.X = i(i, f);
    }

    public HJ2(Map<? extends K, ? extends V> map) {
        this.X = null;
        this.X = j(map);
    }

    /* loaded from: classes4.dex */
    public class c extends HJ2<K, V>.b<Map.Entry<K, V>> implements Set<Map.Entry<K, V>> {
        public c() {
            super();
        }

        @Override // o.HJ2.b
        public Collection<Map.Entry<K, V>> d(Map<K, V> map) {
            return map.entrySet();
        }

        @Override // o.HJ2.b
        /* renamed from: f */
        public Map.Entry<K, V> e(Map.Entry<K, V> entry) {
            return entry;
        }
    }
}
