package o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.C10547wm1;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.i2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6939i2<K, V> implements InterfaceC10058um1<K, V> {
    @MB
    @SY0
    public transient Collection<Map.Entry<K, V>> X;
    @MB
    @SY0
    public transient Set<K> Y;
    @MB
    @SY0
    public transient Collection<V> Y0;
    @MB
    @SY0
    public transient InterfaceC2467Am1<K> Z;
    @MB
    @SY0
    public transient Map<K, Collection<V>> Z0;

    /* renamed from: o.i2$a */
    /* loaded from: classes3.dex */
    public class a extends C10547wm1.f<K, V> {
        public a() {
        }

        @Override // o.C10547wm1.f
        public InterfaceC10058um1<K, V> d() {
            return AbstractC6939i2.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC6939i2.this.f();
        }
    }

    /* renamed from: o.i2$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC6939i2<K, V>.a implements Set<Map.Entry<K, V>> {
        public b(AbstractC6939i2 abstractC6939i2) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@MB Object obj) {
            return C10856y22.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return C10856y22.k(this);
        }
    }

    /* renamed from: o.i2$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC6939i2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@MB Object obj) {
            return AbstractC6939i2.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC6939i2.this.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC6939i2.this.size();
        }
    }

    @Override // o.InterfaceC10058um1
    @InterfaceC6181ey
    public boolean B0(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        boolean z = false;
        for (Map.Entry<? extends K, ? extends V> entry : interfaceC10058um1.r()) {
            z |= put(entry.getKey(), entry.getValue());
        }
        return z;
    }

    @Override // o.InterfaceC10058um1
    public InterfaceC2467Am1<K> Q() {
        InterfaceC2467Am1<K> interfaceC2467Am1 = this.Z;
        if (interfaceC2467Am1 == null) {
            InterfaceC2467Am1<K> d = d();
            this.Z = d;
            return d;
        }
        return interfaceC2467Am1;
    }

    public abstract Map<K, Collection<V>> a();

    public abstract Collection<Map.Entry<K, V>> b();

    public abstract Set<K> c();

    @Override // o.InterfaceC10058um1
    public boolean containsValue(@MB Object obj) {
        for (Collection<V> collection : l().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract InterfaceC2467Am1<K> d();

    public abstract Collection<V> e();

    @Override // o.InterfaceC10058um1
    @InterfaceC6181ey
    public boolean e0(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        C10664xF1.E(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            if (collection.isEmpty() || !get(k).addAll(collection)) {
                return false;
            }
            return true;
        }
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext() || !C7052iU0.a(get(k), it)) {
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    public boolean equals(@MB Object obj) {
        return C10547wm1.g(this, obj);
    }

    public abstract Iterator<Map.Entry<K, V>> f();

    public Iterator<V> g() {
        return C7935m81.O0(r().iterator());
    }

    @Override // o.InterfaceC10058um1
    public int hashCode() {
        return l().hashCode();
    }

    @Override // o.InterfaceC10058um1
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    public Collection<V> j(@InterfaceC7894ly1 K k, Iterable<? extends V> iterable) {
        C10664xF1.E(iterable);
        Collection<V> i = i(k);
        e0(k, iterable);
        return i;
    }

    @Override // o.InterfaceC10058um1
    public Set<K> keySet() {
        Set<K> set = this.Y;
        if (set == null) {
            Set<K> c2 = c();
            this.Y = c2;
            return c2;
        }
        return set;
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    public Map<K, Collection<V>> l() {
        Map<K, Collection<V>> map = this.Z0;
        if (map == null) {
            Map<K, Collection<V>> a2 = a();
            this.Z0 = a2;
            return a2;
        }
        return map;
    }

    @Override // o.InterfaceC10058um1
    @InterfaceC6181ey
    public boolean put(@InterfaceC7894ly1 K k, @InterfaceC7894ly1 V v) {
        return get(k).add(v);
    }

    @Override // o.InterfaceC10058um1
    public boolean q5(@MB Object obj, @MB Object obj2) {
        Collection<V> collection = l().get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    public Collection<Map.Entry<K, V>> r() {
        Collection<Map.Entry<K, V>> collection = this.X;
        if (collection == null) {
            Collection<Map.Entry<K, V>> b2 = b();
            this.X = b2;
            return b2;
        }
        return collection;
    }

    @Override // o.InterfaceC10058um1
    @InterfaceC6181ey
    public boolean remove(@MB Object obj, @MB Object obj2) {
        Collection<V> collection = l().get(obj);
        if (collection != null && collection.remove(obj2)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return l().toString();
    }

    @Override // o.InterfaceC10058um1
    public Collection<V> values() {
        Collection<V> collection = this.Y0;
        if (collection == null) {
            Collection<V> e = e();
            this.Y0 = e;
            return e;
        }
        return collection;
    }
}
