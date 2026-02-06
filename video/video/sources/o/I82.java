package o;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes4.dex */
public class I82<K, V> implements InterfaceC9369rw1<K, V>, InterfaceC9582sp<K, V>, JX0<K, V>, Serializable, Cloneable {
    private static final long serialVersionUID = -8931271118676803261L;
    public final K X;
    public V Y;

    /* loaded from: classes4.dex */
    public static class a<K, V> implements InterfaceC9855tw1<K, V>, MS1<K> {
        public final I82<K, V> X;
        public boolean Y = true;
        public boolean Z = false;

        public a(I82<K, V> i82) {
            this.X = i82;
        }

        @Override // o.U71
        public K getKey() {
            if (this.Z) {
                return this.X.getKey();
            }
            throw new IllegalStateException("getKey() can only be called after next() and before remove()");
        }

        @Override // o.U71
        public V getValue() {
            if (this.Z) {
                return this.X.getValue();
            }
            throw new IllegalStateException("getValue() can only be called after next() and before remove()");
        }

        @Override // o.U71, java.util.Iterator
        public boolean hasNext() {
            return this.Y;
        }

        @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
        public boolean hasPrevious() {
            return !this.Y;
        }

        @Override // o.U71, java.util.Iterator
        public K next() {
            if (this.Y) {
                this.Y = false;
                this.Z = true;
                return this.X.getKey();
            }
            throw new NoSuchElementException("No next() entry in the iteration");
        }

        @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
        public K previous() {
            if (!this.Y) {
                this.Y = true;
                return this.X.getKey();
            }
            throw new NoSuchElementException("No previous() entry in the iteration");
        }

        @Override // o.U71, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // o.MS1
        public void reset() {
            this.Y = true;
        }

        @Override // o.U71
        public V setValue(V v) {
            if (this.Z) {
                return this.X.e(v);
            }
            throw new IllegalStateException("setValue() can only be called after next() and before remove()");
        }

        public String toString() {
            if (this.Y) {
                return "Iterator[]";
            }
            return "Iterator[" + getKey() + "=" + getValue() + C6566gU0.g;
        }
    }

    /* loaded from: classes4.dex */
    public static class b<V> extends AbstractSet<V> implements Serializable {
        private static final long serialVersionUID = -3689524741863047872L;
        public final I82<?, V> X;

        public b(I82<?, V> i82) {
            this.X = i82;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.X.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new D82(this.X.getValue(), false);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1;
        }
    }

    public I82() {
        this.X = null;
    }

    /* renamed from: b */
    public I82<K, V> clone() {
        try {
            return (I82) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public boolean c(Object obj) {
        if (obj == null) {
            if (getKey() == null) {
                return true;
            }
            return false;
        }
        return obj.equals(getKey());
    }

    @Override // java.util.Map, o.OK1
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, o.UC0
    public boolean containsKey(Object obj) {
        return c(obj);
    }

    @Override // java.util.Map, o.UC0
    public boolean containsValue(Object obj) {
        return d(obj);
    }

    public boolean d(Object obj) {
        if (obj == null) {
            if (getValue() == null) {
                return true;
            }
            return false;
        }
        return obj.equals(getValue());
    }

    public V e(V v) {
        V v2 = this.Y;
        this.Y = v;
        return v2;
    }

    @Override // java.util.Map, o.UC0
    public Set<Map.Entry<K, V>> entrySet() {
        return Collections.singleton(new C2476Ao2(this, getKey()));
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != 1) {
            return false;
        }
        Map.Entry<K, V> next = map.entrySet().iterator().next();
        if (c(next.getKey()) && d(next.getValue())) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC9369rw1
    public K firstKey() {
        return getKey();
    }

    @Override // java.util.Map, o.UC0
    public V get(Object obj) {
        if (c(obj)) {
            return this.Y;
        }
        return null;
    }

    @Override // o.JX0
    public K getKey() {
        return this.X;
    }

    @Override // o.JX0
    public V getValue() {
        return this.Y;
    }

    @Override // java.util.Map
    public int hashCode() {
        int hashCode;
        int i = 0;
        if (getKey() == null) {
            hashCode = 0;
        } else {
            hashCode = getKey().hashCode();
        }
        if (getValue() != null) {
            i = getValue().hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map, o.UC0
    public boolean isEmpty() {
        return false;
    }

    @Override // o.InterfaceC9369rw1
    public K j0(K k) {
        return null;
    }

    @Override // java.util.Map, o.UC0
    public Set<K> keySet() {
        return Collections.singleton(this.X);
    }

    @Override // o.InterfaceC9369rw1
    public K lastKey() {
        return getKey();
    }

    @Override // o.InterfaceC9369rw1
    public K n0(K k) {
        return null;
    }

    @Override // java.util.Map, o.OK1
    public V put(K k, V v) {
        if (c(k)) {
            return e(v);
        }
        throw new IllegalArgumentException("Cannot put new key/value pair - Map is fixed size singleton");
    }

    @Override // java.util.Map, o.OK1
    public void putAll(Map<? extends K, ? extends V> map) {
        int size = map.size();
        if (size != 0) {
            if (size == 1) {
                Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
                put(next.getKey(), next.getValue());
                return;
            }
            throw new IllegalArgumentException("The map size must be 0 or 1");
        }
    }

    @Override // o.InterfaceC9582sp
    public int q() {
        return 1;
    }

    @Override // java.util.Map, o.UC0
    public V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC9582sp
    public boolean s() {
        return true;
    }

    @Override // java.util.Map, o.UC0
    public int size() {
        return 1;
    }

    public String toString() {
        K key;
        StringBuilder sb = new StringBuilder(128);
        sb.append('{');
        Object obj = "(this Map)";
        if (getKey() == this) {
            key = "(this Map)";
        } else {
            key = getKey();
        }
        sb.append(key);
        sb.append('=');
        if (getValue() != this) {
            obj = getValue();
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map, o.UC0
    public Collection<V> values() {
        return new b(this);
    }

    @Override // o.InterfaceC9369rw1, o.VT0
    public InterfaceC9855tw1<K, V> p() {
        return new a(this);
    }

    public I82(K k, V v) {
        this.X = k;
        this.Y = v;
    }

    public I82(JX0<K, V> jx0) {
        this.X = jx0.getKey();
        this.Y = jx0.getValue();
    }

    public I82(Map.Entry<? extends K, ? extends V> entry) {
        this.X = entry.getKey();
        this.Y = entry.getValue();
    }

    public I82(Map<? extends K, ? extends V> map) {
        if (map.size() == 1) {
            Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
            this.X = next.getKey();
            this.Y = next.getValue();
            return;
        }
        throw new IllegalArgumentException("The map size must be 1");
    }
}
