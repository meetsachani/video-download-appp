package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public class X01<K, V> extends I1<K, V> implements InterfaceC9369rw1<K, V>, Serializable {
    private static final long serialVersionUID = 2728177751851003750L;
    public final List<K> Y;

    /* loaded from: classes4.dex */
    public static class a<K> extends AbstractSet<K> {
        public final X01<K, Object> X;

        /* renamed from: o.X01$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0244a extends C3<Map.Entry<K, Object>, K> {
            public C0244a(Iterator it) {
                super(it);
            }

            @Override // java.util.Iterator
            public K next() {
                return b().next().getKey();
            }
        }

        public a(X01<K, ?> x01) {
            this.X = x01;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.X.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C0244a(this.X.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.size();
        }
    }

    /* loaded from: classes4.dex */
    public static class b<V> extends AbstractList<V> {
        public final X01<Object, V> X;

        /* loaded from: classes4.dex */
        public class a extends C3<Map.Entry<Object, V>, V> {
            public a(Iterator it) {
                super(it);
            }

            @Override // java.util.Iterator
            public V next() {
                return b().next().getValue();
            }
        }

        public b(X01<?, V> x01) {
            this.X = x01;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.X.containsValue(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public V get(int i) {
            return this.X.f(i);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<V> iterator() {
            return new a(this.X.entrySet().iterator());
        }

        @Override // java.util.AbstractList, java.util.List
        public V remove(int i) {
            return this.X.m(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public V set(int i, V v) {
            return this.X.n(i, v);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.X.size();
        }
    }

    /* loaded from: classes4.dex */
    public static class c<K, V> extends AbstractSet<Map.Entry<K, V>> {
        public final X01<K, V> X;
        public final List<K> Y;
        public Set<Map.Entry<K, V>> Z;

        public c(X01<K, V> x01, List<K> list) {
            this.X = x01;
            this.Y = list;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return d().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return d().containsAll(collection);
        }

        public final Set<Map.Entry<K, V>> d() {
            if (this.Z == null) {
                this.Z = this.X.b().entrySet();
            }
            return this.Z;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return d().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return d().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.X.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(this.X, this.Y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry) || !d().contains(obj)) {
                return false;
            }
            this.X.remove(((Map.Entry) obj).getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.X.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return d().toString();
        }
    }

    /* loaded from: classes4.dex */
    public static class d<K, V> extends C3<K, Map.Entry<K, V>> {
        public final X01<K, V> Y;
        public K Z;

        public d(X01<K, V> x01, List<K> list) {
            super(list.iterator());
            this.Z = null;
            this.Y = x01;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            K next = b().next();
            this.Z = next;
            return new e(this.Y, next);
        }

        @Override // o.C3, java.util.Iterator
        public void remove() {
            super.remove();
            this.Y.b().remove(this.Z);
        }
    }

    /* loaded from: classes4.dex */
    public static class e<K, V> extends L1<K, V> {
        public final X01<K, V> Z;

        public e(X01<K, V> x01, K k) {
            super(k, null);
            this.Z = x01;
        }

        @Override // o.AbstractC7419k1, o.JX0
        public V getValue() {
            return this.Z.get(getKey());
        }

        @Override // o.L1, o.AbstractC7419k1, java.util.Map.Entry
        public V setValue(V v) {
            return this.Z.b().put(getKey(), v);
        }
    }

    /* loaded from: classes4.dex */
    public static class f<K, V> implements InterfaceC9855tw1<K, V>, MS1<K> {
        public final X01<K, V> X;
        public ListIterator<K> Y;
        public K Z = null;
        public boolean Y0 = false;

        public f(X01<K, V> x01) {
            this.X = x01;
            this.Y = x01.Y.listIterator();
        }

        @Override // o.U71
        public K getKey() {
            if (this.Y0) {
                return this.Z;
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // o.U71
        public V getValue() {
            if (this.Y0) {
                return this.X.get(this.Z);
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // o.U71, java.util.Iterator
        public boolean hasNext() {
            return this.Y.hasNext();
        }

        @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
        public boolean hasPrevious() {
            return this.Y.hasPrevious();
        }

        @Override // o.U71, java.util.Iterator
        public K next() {
            K next = this.Y.next();
            this.Z = next;
            this.Y0 = true;
            return next;
        }

        @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
        public K previous() {
            K previous = this.Y.previous();
            this.Z = previous;
            this.Y0 = true;
            return previous;
        }

        @Override // o.U71, java.util.Iterator
        public void remove() {
            if (this.Y0) {
                this.Y.remove();
                this.X.X.remove(this.Z);
                this.Y0 = false;
                return;
            }
            throw new IllegalStateException("remove() can only be called once after next()");
        }

        @Override // o.MS1
        public void reset() {
            this.Y = this.X.Y.listIterator();
            this.Z = null;
            this.Y0 = false;
        }

        @Override // o.U71
        public V setValue(V v) {
            if (this.Y0) {
                return this.X.X.put(this.Z, v);
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }

        public String toString() {
            if (this.Y0) {
                return "Iterator[" + getKey() + "=" + getValue() + C6566gU0.g;
            }
            return "Iterator[]";
        }
    }

    public X01() {
        this(new HashMap());
    }

    public static <K, V> X01<K, V> j(Map<K, V> map) {
        return new X01<>(map);
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
        b().clear();
        this.Y.clear();
    }

    public List<K> d() {
        return i();
    }

    public K e(int i) {
        return this.Y.get(i);
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        return new c(this, this.Y);
    }

    public V f(int i) {
        return get(this.Y.get(i));
    }

    @Override // o.InterfaceC9369rw1
    public K firstKey() {
        if (size() != 0) {
            return this.Y.get(0);
        }
        throw new NoSuchElementException("Map is empty");
    }

    public int g(Object obj) {
        return this.Y.indexOf(obj);
    }

    public List<K> i() {
        return C6735hB2.h(this.Y);
    }

    @Override // o.InterfaceC9369rw1
    public K j0(Object obj) {
        int indexOf = this.Y.indexOf(obj);
        if (indexOf > 0) {
            return this.Y.get(indexOf - 1);
        }
        return null;
    }

    public V k(int i, K k, V v) {
        if (i >= 0 && i <= this.Y.size()) {
            Map<K, V> b2 = b();
            if (b2.containsKey(k)) {
                V remove = b2.remove(k);
                int indexOf = this.Y.indexOf(k);
                this.Y.remove(indexOf);
                if (indexOf < i) {
                    i--;
                }
                this.Y.add(i, k);
                b2.put(k, v);
                return remove;
            }
            this.Y.add(i, k);
            b2.put(k, v);
            return null;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.Y.size());
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<K> keySet() {
        return new a(this);
    }

    public void l(int i, Map<? extends K, ? extends V> map) {
        if (i >= 0 && i <= this.Y.size()) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                boolean containsKey = containsKey(entry.getKey());
                k(i, entry.getKey(), entry.getValue());
                if (containsKey) {
                    i = g(entry.getKey());
                }
                i++;
            }
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.Y.size());
    }

    @Override // o.InterfaceC9369rw1
    public K lastKey() {
        if (size() != 0) {
            return this.Y.get(size() - 1);
        }
        throw new NoSuchElementException("Map is empty");
    }

    public V m(int i) {
        return remove(e(i));
    }

    public V n(int i, V v) {
        return put(this.Y.get(i), v);
    }

    @Override // o.InterfaceC9369rw1
    public K n0(Object obj) {
        int indexOf = this.Y.indexOf(obj);
        if (indexOf >= 0 && indexOf < size() - 1) {
            return this.Y.get(indexOf + 1);
        }
        return null;
    }

    public List<V> o() {
        return new b(this);
    }

    @Override // o.I1, java.util.Map, o.OK1
    public V put(K k, V v) {
        if (b().containsKey(k)) {
            return b().put(k, v);
        }
        V put = b().put(k, v);
        this.Y.add(k);
        return put;
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // o.I1, java.util.Map, o.UC0
    public V remove(Object obj) {
        if (b().containsKey(obj)) {
            V remove = b().remove(obj);
            this.Y.remove(obj);
            return remove;
        }
        return null;
    }

    @Override // o.I1
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            if (z) {
                z = false;
            } else {
                sb.append(C6566gU0.h);
            }
            if (key == this) {
                key = "(this Map)";
            }
            sb.append(key);
            sb.append('=');
            if (value == this) {
                value = "(this Map)";
            }
            sb.append(value);
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Collection<V> values() {
        return new b(this);
    }

    public X01(Map<K, V> map) {
        super(map);
        ArrayList arrayList = new ArrayList();
        this.Y = arrayList;
        arrayList.addAll(b().keySet());
    }

    @Override // o.AbstractC5951e1, o.VT0
    public InterfaceC9855tw1<K, V> p() {
        return new f(this);
    }
}
