package o;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.Be  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2531Be<K, V> extends C9654t62<K, V> implements Map<K, V> {
    public C2531Be<K, V>.a Y0;
    public C2531Be<K, V>.c Z0;
    public C2531Be<K, V>.e a1;

    /* renamed from: o.Be$a */
    /* loaded from: classes.dex */
    public final class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2531Be.this.size();
        }
    }

    /* renamed from: o.Be$b */
    /* loaded from: classes.dex */
    public final class b extends AbstractC7516kP0<K> {
        public b() {
            super(C2531Be.this.size());
        }

        @Override // o.AbstractC7516kP0
        public K b(int i) {
            return C2531Be.this.g(i);
        }

        @Override // o.AbstractC7516kP0
        public void c(int i) {
            C2531Be.this.j(i);
        }
    }

    /* renamed from: o.Be$d */
    /* loaded from: classes.dex */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        public int X;
        public int Y = -1;
        public boolean Z;

        public d() {
            this.X = C2531Be.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.Y++;
                this.Z = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.Z) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!BL.c(entry.getKey(), C2531Be.this.g(this.Y)) || !BL.c(entry.getValue(), C2531Be.this.l(this.Y))) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.Z) {
                return C2531Be.this.g(this.Y);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.Z) {
                return C2531Be.this.l(this.Y);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.Y < this.X) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            if (this.Z) {
                K g = C2531Be.this.g(this.Y);
                V l = C2531Be.this.l(this.Y);
                int i = 0;
                if (g == null) {
                    hashCode = 0;
                } else {
                    hashCode = g.hashCode();
                }
                if (l != null) {
                    i = l.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.Z) {
                C2531Be.this.j(this.Y);
                this.Y--;
                this.X--;
                this.Z = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.Z) {
                return C2531Be.this.k(this.Y, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: o.Be$f */
    /* loaded from: classes.dex */
    public final class f extends AbstractC7516kP0<V> {
        public f() {
            super(C2531Be.this.size());
        }

        @Override // o.AbstractC7516kP0
        public V b(int i) {
            return C2531Be.this.l(i);
        }

        @Override // o.AbstractC7516kP0
        public void c(int i) {
            C2531Be.this.j(i);
        }
    }

    public C2531Be() {
    }

    public static <T> boolean n(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C9654t62, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C9654t62, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C2531Be<K, V>.a aVar = this.Y0;
        if (aVar == null) {
            C2531Be<K, V>.a aVar2 = new a();
            this.Y0 = aVar2;
            return aVar2;
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C9654t62, java.util.Map
    public V get(Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        C2531Be<K, V>.c cVar = this.Z0;
        if (cVar == null) {
            C2531Be<K, V>.c cVar2 = new c();
            this.Z0 = cVar2;
            return cVar2;
        }
        return cVar;
    }

    public boolean m(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean o(Collection<?> collection) {
        int size = size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        if (size != size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(size() + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean r(Collection<?> collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(g(size2))) {
                j(size2);
            }
        }
        if (size != size()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C9654t62, java.util.Map
    public V remove(Object obj) {
        return (V) super.remove(obj);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        C2531Be<K, V>.e eVar = this.a1;
        if (eVar == null) {
            C2531Be<K, V>.e eVar2 = new e();
            this.a1 = eVar2;
            return eVar2;
        }
        return eVar;
    }

    public C2531Be(int i) {
        super(i);
    }

    /* renamed from: o.Be$c */
    /* loaded from: classes.dex */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C2531Be.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C2531Be.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C2531Be.this.m(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C2531Be.n(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int i = 0;
            for (int size = C2531Be.this.size() - 1; size >= 0; size--) {
                K g = C2531Be.this.g(size);
                if (g == null) {
                    hashCode = 0;
                } else {
                    hashCode = g.hashCode();
                }
                i += hashCode;
            }
            return i;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C2531Be.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e = C2531Be.this.e(obj);
            if (e >= 0) {
                C2531Be.this.j(e);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return C2531Be.this.o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return C2531Be.this.r(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C2531Be.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C2531Be.this.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = C2531Be.this.g(i);
            }
            return objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = C2531Be.this.g(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    /* renamed from: o.Be$e */
    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C2531Be.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            if (C2531Be.this.a(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C2531Be.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int a = C2531Be.this.a(obj);
            if (a >= 0) {
                C2531Be.this.j(a);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int size = C2531Be.this.size();
            int i = 0;
            boolean z = false;
            while (i < size) {
                if (collection.contains(C2531Be.this.l(i))) {
                    C2531Be.this.j(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int size = C2531Be.this.size();
            int i = 0;
            boolean z = false;
            while (i < size) {
                if (!collection.contains(C2531Be.this.l(i))) {
                    C2531Be.this.j(i);
                    i--;
                    size--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return C2531Be.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C2531Be.this.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = C2531Be.this.l(i);
            }
            return objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i = 0; i < size; i++) {
                tArr[i] = C2531Be.this.l(i);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public C2531Be(C9654t62 c9654t62) {
        super(c9654t62);
    }
}
