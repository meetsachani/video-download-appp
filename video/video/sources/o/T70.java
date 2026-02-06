package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class T70<K, V> extends A0<K, V> implements W92<K, V>, Serializable {
    private static final long serialVersionUID = 721969328361809L;
    public final Comparator<? super K> b1;
    public final Comparator<? super V> c1;

    /* loaded from: classes4.dex */
    public static class a<K, V> implements InterfaceC9855tw1<K, V>, MS1<K> {
        public final A0<K, V> X;
        public ListIterator<Map.Entry<K, V>> Y;
        public Map.Entry<K, V> Z = null;

        public a(A0<K, V> a0) {
            this.X = a0;
            this.Y = new ArrayList(a0.entrySet()).listIterator();
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

        @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
        public boolean hasPrevious() {
            return this.Y.hasPrevious();
        }

        @Override // o.U71, java.util.Iterator
        public K next() {
            Map.Entry<K, V> next = this.Y.next();
            this.Z = next;
            return next.getKey();
        }

        @Override // o.InterfaceC9855tw1, o.InterfaceC8877pw1
        public K previous() {
            Map.Entry<K, V> previous = this.Y.previous();
            this.Z = previous;
            return previous.getKey();
        }

        @Override // o.U71, java.util.Iterator
        public void remove() {
            this.Y.remove();
            this.X.remove(this.Z.getKey());
            this.Z = null;
        }

        @Override // o.MS1
        public void reset() {
            this.Y = new ArrayList(this.X.entrySet()).listIterator();
            this.Z = null;
        }

        @Override // o.U71
        public V setValue(V v) {
            if (this.Z != null) {
                if (this.X.Y.containsKey(v) && this.X.Y.get(v) != this.Z.getKey()) {
                    throw new IllegalArgumentException("Cannot use setValue() when the object being set is already in the map");
                }
                V put = this.X.put(this.Z.getKey(), v);
                this.Z.setValue(v);
                return put;
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
    public static class b<K, V> extends AbstractC7670l3<K, V> {
        public b(T70<K, V> t70, SortedMap<K, V> sortedMap) {
            super(new T70(sortedMap, t70.Y, t70.Z));
        }

        @Override // o.I1, java.util.Map, o.OK1
        public void clear() {
            Iterator<K> it = keySet().iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }

        @Override // o.I1, java.util.Map, o.UC0
        public boolean containsValue(Object obj) {
            return c().X.containsValue(obj);
        }

        @Override // o.AbstractC7670l3
        /* renamed from: d */
        public T70<K, V> c() {
            return (T70) super.b();
        }

        @Override // o.AbstractC7670l3, java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            return new b(c(), super.headMap(k));
        }

        @Override // o.AbstractC7670l3, o.InterfaceC9369rw1
        public K j0(K k) {
            return c().j0(k);
        }

        @Override // o.AbstractC7670l3, o.InterfaceC9369rw1
        public K n0(K k) {
            return c().n0(k);
        }

        @Override // o.AbstractC7670l3, java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            return new b(c(), super.subMap(k, k2));
        }

        @Override // o.AbstractC7670l3, java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            return new b(c(), super.tailMap(k));
        }
    }

    public T70() {
        super(new TreeMap(), new TreeMap());
        this.b1 = null;
        this.c1 = null;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = new TreeMap(this.b1);
        this.Y = new TreeMap(this.c1);
        putAll((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    @Override // o.W92
    public Comparator<? super V> U() {
        return ((SortedMap) this.Y).comparator();
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return ((SortedMap) this.X).comparator();
    }

    @Override // o.A0
    /* renamed from: e */
    public T70<V, K> a(Map<V, K> map, Map<K, V> map2, InterfaceC4927Zm<K, V> interfaceC4927Zm) {
        return new T70<>(map, map2, interfaceC4927Zm);
    }

    public InterfaceC8390nw1<V, K> f() {
        return h();
    }

    @Override // o.InterfaceC9369rw1
    public K firstKey() {
        return (K) ((SortedMap) this.X).firstKey();
    }

    public W92<V, K> g() {
        return h();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return new b(this, ((SortedMap) this.X).headMap(k));
    }

    @Override // o.InterfaceC9369rw1
    public K j0(K k) {
        if (isEmpty()) {
            return null;
        }
        Map<K, V> map = this.X;
        if (map instanceof InterfaceC9369rw1) {
            return (K) ((InterfaceC9369rw1) map).j0(k);
        }
        SortedMap<K, V> headMap = ((SortedMap) map).headMap(k);
        if (headMap.isEmpty()) {
            return null;
        }
        return headMap.lastKey();
    }

    @Override // o.InterfaceC9369rw1
    public K lastKey() {
        return (K) ((SortedMap) this.X).lastKey();
    }

    @Override // o.InterfaceC9369rw1
    public K n0(K k) {
        if (isEmpty()) {
            return null;
        }
        Map<K, V> map = this.X;
        if (map instanceof InterfaceC9369rw1) {
            return (K) ((InterfaceC9369rw1) map).n0(k);
        }
        Iterator<K> it = ((SortedMap) map).tailMap(k).keySet().iterator();
        it.next();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return new b(this, ((SortedMap) this.X).subMap(k, k2));
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return new b(this, ((SortedMap) this.X).tailMap(k));
    }

    @Override // o.A0, o.VT0
    public InterfaceC9855tw1<K, V> p() {
        return new a(this);
    }

    @Override // o.A0, o.InterfaceC4927Zm
    public W92<V, K> h() {
        return (W92) super.h();
    }

    public T70(Map<? extends K, ? extends V> map) {
        super(new TreeMap(), new TreeMap());
        putAll(map);
        this.b1 = null;
        this.c1 = null;
    }

    public T70(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        super(new TreeMap(comparator), new TreeMap(comparator2));
        this.b1 = comparator;
        this.c1 = comparator2;
    }

    public T70(Map<K, V> map, Map<V, K> map2, InterfaceC4927Zm<V, K> interfaceC4927Zm) {
        super(map, map2, interfaceC4927Zm);
        this.b1 = ((SortedMap) map).comparator();
        this.c1 = ((SortedMap) map2).comparator();
    }
}
