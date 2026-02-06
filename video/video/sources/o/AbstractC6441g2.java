package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.AbstractC5955e2;
import o.InterfaceC6135em1;

/* renamed from: o.g2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6441g2<K, V> implements InterfaceC7846lm1<K, V> {
    public transient Collection<V> X;
    public transient AbstractC6441g2<K, V>.c Y;
    public transient AbstractC6441g2<K, V>.b Y0;
    public transient InterfaceC6135em1<K> Z;
    public transient Map<K, Collection<V>> Z0;

    /* renamed from: o.g2$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractMap<K, Collection<V>> {
        public final transient Map<K, Collection<V>> X;

        /* renamed from: o.g2$b$a */
        /* loaded from: classes4.dex */
        public class a extends AbstractSet<Map.Entry<K, Collection<V>>> {
            public a() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                b.this.clear();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return b.this.X.entrySet().contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                b bVar = b.this;
                return new C0276b(bVar.X.entrySet().iterator());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                AbstractC6441g2.this.remove(((Map.Entry) obj).getKey());
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return b.this.size();
            }
        }

        /* renamed from: o.g2$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0276b extends AbstractC6935i1<Map.Entry<K, Collection<V>>> {
            public C0276b(Iterator<Map.Entry<K, Collection<V>>> it) {
                super(it);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.AbstractC6935i1, java.util.Iterator
            /* renamed from: c */
            public Map.Entry<K, Collection<V>> next() {
                Object key = ((Map.Entry) super.next()).getKey();
                return new C8452oB2(key, AbstractC6441g2.this.g(key));
            }
        }

        public b(Map<K, Collection<V>> map) {
            this.X = map;
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: a */
        public Collection<V> get(Object obj) {
            if (this.X.get(obj) == null) {
                return null;
            }
            return AbstractC6441g2.this.g(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: b */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.X.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> b = AbstractC6441g2.this.b();
            b.addAll(remove);
            remove.clear();
            return b;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            AbstractC6441g2.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.X.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            if (this != obj && !this.X.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.X.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractC6441g2.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.X.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.X.toString();
        }
    }

    /* renamed from: o.g2$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractCollection<Map.Entry<K, V>> {

        /* renamed from: o.g2$c$a */
        /* loaded from: classes4.dex */
        public class a extends UY0<Map.Entry<K, V>> {
            public final Collection<K> Z0;
            public final Iterator<K> a1;

            /* renamed from: o.g2$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public class C0277a implements InterfaceC3287Is2<V, Map.Entry<K, V>> {
                public final /* synthetic */ Object X;

                public C0277a(Object obj) {
                    this.X = obj;
                }

                @Override // o.InterfaceC3287Is2
                /* renamed from: b */
                public Map.Entry<K, V> a(V v) {
                    return new e(this.X, v);
                }
            }

            public a() {
                ArrayList arrayList = new ArrayList(AbstractC6441g2.this.e().keySet());
                this.Z0 = arrayList;
                this.a1 = arrayList.iterator();
            }

            @Override // o.UY0
            public Iterator<? extends Map.Entry<K, V>> b(int i) {
                if (!this.a1.hasNext()) {
                    return null;
                }
                K next = this.a1.next();
                return new C4552Vr2(new h(next), new C0277a(next));
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC6441g2.this.size();
        }
    }

    /* renamed from: o.g2$d */
    /* loaded from: classes4.dex */
    public class d extends AbstractC5955e2<K> {

        /* renamed from: o.g2$d$a */
        /* loaded from: classes4.dex */
        public final class a implements InterfaceC3287Is2<Map.Entry<K, Collection<V>>, InterfaceC6135em1.a<K>> {

            /* renamed from: o.g2$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public class C0278a extends AbstractC5955e2.b<K> {
                public final /* synthetic */ Map.Entry a;

                public C0278a(Map.Entry entry) {
                    this.a = entry;
                }

                @Override // o.InterfaceC6135em1.a
                public K a() {
                    return (K) this.a.getKey();
                }

                @Override // o.InterfaceC6135em1.a
                public int getCount() {
                    return ((Collection) this.a.getValue()).size();
                }
            }

            public a() {
            }

            @Override // o.InterfaceC3287Is2
            /* renamed from: b */
            public InterfaceC6135em1.a<K> a(Map.Entry<K, Collection<V>> entry) {
                return new C0278a(entry);
            }
        }

        public d() {
        }

        @Override // o.AbstractC5955e2, o.InterfaceC6135em1
        public int I(Object obj) {
            Collection<V> collection = AbstractC6441g2.this.e().get(obj);
            if (collection != null) {
                return collection.size();
            }
            return 0;
        }

        @Override // o.AbstractC5955e2, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC6441g2.this.e().containsKey(obj);
        }

        @Override // o.AbstractC5955e2
        public Iterator<InterfaceC6135em1.a<K>> e() {
            return C6566gU0.k0(AbstractC6441g2.this.Z0.entrySet().iterator(), new a());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return AbstractC6441g2.this.e().isEmpty();
        }

        @Override // o.AbstractC5955e2
        public int k() {
            return AbstractC6441g2.this.e().size();
        }

        @Override // o.AbstractC5955e2, java.util.AbstractCollection, java.util.Collection, o.InterfaceC6135em1
        public int size() {
            return AbstractC6441g2.this.size();
        }
    }

    /* renamed from: o.g2$e */
    /* loaded from: classes4.dex */
    public class e extends L1<K, V> {
        public e(K k, V v) {
            super(k, v);
        }

        @Override // o.L1, o.AbstractC7419k1, java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.g2$f */
    /* loaded from: classes4.dex */
    public class f implements U71<K, V> {
        public final Iterator<Map.Entry<K, V>> X;
        public Map.Entry<K, V> Y = null;

        public f() {
            this.X = AbstractC6441g2.this.r().iterator();
        }

        @Override // o.U71
        public K getKey() {
            Map.Entry<K, V> entry = this.Y;
            if (entry != null) {
                return entry.getKey();
            }
            throw new IllegalStateException();
        }

        @Override // o.U71
        public V getValue() {
            Map.Entry<K, V> entry = this.Y;
            if (entry != null) {
                return entry.getValue();
            }
            throw new IllegalStateException();
        }

        @Override // o.U71, java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // o.U71, java.util.Iterator
        public K next() {
            Map.Entry<K, V> next = this.X.next();
            this.Y = next;
            return next.getKey();
        }

        @Override // o.U71, java.util.Iterator
        public void remove() {
            this.X.remove();
        }

        @Override // o.U71
        public V setValue(V v) {
            Map.Entry<K, V> entry = this.Y;
            if (entry != null) {
                return entry.setValue(v);
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.g2$g */
    /* loaded from: classes4.dex */
    public class g extends AbstractCollection<V> {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC6441g2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            C5341bU0 c5341bU0 = new C5341bU0();
            for (K k : AbstractC6441g2.this.keySet()) {
                c5341bU0.b(new h(k));
            }
            return c5341bU0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC6441g2.this.size();
        }
    }

    /* renamed from: o.g2$h */
    /* loaded from: classes4.dex */
    public class h implements Iterator<V> {
        public final Object X;
        public final Collection<V> Y;
        public final Iterator<V> Z;

        public h(Object obj) {
            this.X = obj;
            Collection<V> collection = AbstractC6441g2.this.e().get(obj);
            this.Y = collection;
            this.Z = collection.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.Z.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.Z.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.Z.remove();
            if (this.Y.isEmpty()) {
                AbstractC6441g2.this.remove(this.X);
            }
        }
    }

    public AbstractC6441g2() {
    }

    @Override // o.InterfaceC7846lm1
    public InterfaceC6135em1<K> Q() {
        if (this.Z == null) {
            this.Z = C9431sB2.h(new d());
        }
        return this.Z;
    }

    public abstract Collection<V> b();

    /* JADX WARN: Multi-variable type inference failed */
    public void c(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int readInt = objectInputStream.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            Collection collection = get(objectInputStream.readObject());
            int readInt2 = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt2; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    @Override // o.InterfaceC7846lm1
    public void clear() {
        e().clear();
    }

    @Override // o.InterfaceC7846lm1
    public boolean containsKey(Object obj) {
        return e().containsKey(obj);
    }

    @Override // o.InterfaceC7846lm1
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public void d(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.Z0.size());
        for (Map.Entry<K, Collection<V>> entry : this.Z0.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            for (V v : entry.getValue()) {
                objectOutputStream.writeObject(v);
            }
        }
    }

    public Map<K, ? extends Collection<V>> e() {
        return this.Z0;
    }

    @Override // o.InterfaceC7846lm1
    public boolean e0(K k, Iterable<? extends V> iterable) {
        if (iterable != null) {
            if (iterable instanceof Collection) {
                Collection<? extends V> collection = (Collection) iterable;
                if (collection.isEmpty() || !get(k).addAll(collection)) {
                    return false;
                }
                return true;
            }
            Iterator<? extends V> it = iterable.iterator();
            if (!it.hasNext() || !C6748hF.c(get(k), it)) {
                return false;
            }
            return true;
        }
        throw new NullPointerException("Values must not be null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC7846lm1) {
            return l().equals(((InterfaceC7846lm1) obj).l());
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(Map<K, ? extends Collection<V>> map) {
        this.Z0 = map;
    }

    @Override // o.InterfaceC7846lm1
    public boolean f0(InterfaceC7846lm1<? extends K, ? extends V> interfaceC7846lm1) {
        if (interfaceC7846lm1 != null) {
            boolean z = false;
            for (Map.Entry<? extends K, ? extends V> entry : interfaceC7846lm1.r()) {
                z |= put(entry.getKey(), entry.getValue());
            }
            return z;
        }
        throw new NullPointerException("Map must not be null.");
    }

    public Collection<V> g(K k) {
        return new i(k);
    }

    @Override // o.InterfaceC7846lm1
    public boolean g0(Object obj, Object obj2) {
        Collection<V> collection = e().get(obj);
        if (collection != null && collection.contains(obj2)) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC7846lm1, o.InterfaceC10613x22
    public Collection<V> get(K k) {
        return g(k);
    }

    public int hashCode() {
        return e().hashCode();
    }

    @Override // o.InterfaceC7846lm1
    public boolean isEmpty() {
        return e().isEmpty();
    }

    @Override // o.InterfaceC7846lm1
    public Set<K> keySet() {
        return e().keySet();
    }

    @Override // o.InterfaceC7846lm1
    public Map<K, Collection<V>> l() {
        AbstractC6441g2<K, V>.b bVar = this.Y0;
        if (bVar != null) {
            return bVar;
        }
        AbstractC6441g2<K, V>.b bVar2 = new b(this.Z0);
        this.Y0 = bVar2;
        return bVar2;
    }

    @Override // o.InterfaceC7846lm1
    public U71<K, V> p() {
        if (size() == 0) {
            return C5605cb0.b();
        }
        return new f();
    }

    @Override // o.InterfaceC7846lm1
    public boolean p0(Object obj, Object obj2) {
        Collection<V> collection = e().get(obj);
        if (collection == null) {
            return false;
        }
        boolean remove = collection.remove(obj2);
        if (collection.isEmpty()) {
            e().remove(obj);
        }
        return remove;
    }

    @Override // o.InterfaceC7846lm1
    public boolean put(K k, V v) {
        Collection<V> collection = e().get(k);
        if (collection == null) {
            Collection<V> b2 = b();
            if (b2.add(v)) {
                this.Z0.put(k, b2);
                return true;
            }
            return false;
        }
        return collection.add(v);
    }

    @Override // o.InterfaceC7846lm1
    public boolean putAll(Map<? extends K, ? extends V> map) {
        if (map != null) {
            boolean z = false;
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                z |= put(entry.getKey(), entry.getValue());
            }
            return z;
        }
        throw new NullPointerException("Map must not be null.");
    }

    @Override // o.InterfaceC7846lm1
    public Collection<Map.Entry<K, V>> r() {
        AbstractC6441g2<K, V>.c cVar = this.Y;
        if (cVar != null) {
            return cVar;
        }
        AbstractC6441g2<K, V>.c cVar2 = new c();
        this.Y = cVar2;
        return cVar2;
    }

    @Override // o.InterfaceC7846lm1, o.InterfaceC10613x22
    public Collection<V> remove(Object obj) {
        return C6748hF.v(e().remove(obj));
    }

    @Override // o.InterfaceC7846lm1
    public int size() {
        int i2 = 0;
        for (Collection<V> collection : e().values()) {
            i2 += collection.size();
        }
        return i2;
    }

    public String toString() {
        return e().toString();
    }

    @Override // o.InterfaceC7846lm1
    public Collection<V> values() {
        Collection<V> collection = this.X;
        if (collection != null) {
            return collection;
        }
        g gVar = new g();
        this.X = gVar;
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC6441g2(Map<K, ? extends Collection<V>> map) {
        if (map != 0) {
            this.Z0 = map;
            return;
        }
        throw new NullPointerException("Map must not be null.");
    }

    /* renamed from: o.g2$i */
    /* loaded from: classes4.dex */
    public class i implements Collection<V> {
        public final K X;

        public i(K k) {
            this.X = k;
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            Collection<V> d = d();
            if (d == null) {
                d = AbstractC6441g2.this.b();
                AbstractC6441g2.this.Z0.put(this.X, d);
            }
            return d.add(v);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            Collection<V> d = d();
            if (d == null) {
                d = AbstractC6441g2.this.b();
                AbstractC6441g2.this.Z0.put(this.X, d);
            }
            return d.addAll(collection);
        }

        @Override // java.util.Collection
        public void clear() {
            Collection<V> d = d();
            if (d != null) {
                d.clear();
                AbstractC6441g2.this.remove(this.X);
            }
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            Collection<V> d = d();
            if (d != null && d.contains(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Collection<V> d = d();
            if (d != null && d.containsAll(collection)) {
                return true;
            }
            return false;
        }

        public Collection<V> d() {
            return AbstractC6441g2.this.e().get(this.X);
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            Collection<V> d = d();
            if (d != null && !d.isEmpty()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            if (d() == null) {
                return C6566gU0.a;
            }
            return new h(this.X);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            Collection<V> d = d();
            if (d == null) {
                return false;
            }
            boolean remove = d.remove(obj);
            if (d.isEmpty()) {
                AbstractC6441g2.this.remove(this.X);
            }
            return remove;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Collection<V> d = d();
            if (d == null) {
                return false;
            }
            boolean removeAll = d.removeAll(collection);
            if (d.isEmpty()) {
                AbstractC6441g2.this.remove(this.X);
            }
            return removeAll;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Collection<V> d = d();
            if (d == null) {
                return false;
            }
            boolean retainAll = d.retainAll(collection);
            if (d.isEmpty()) {
                AbstractC6441g2.this.remove(this.X);
            }
            return retainAll;
        }

        @Override // java.util.Collection
        public int size() {
            Collection<V> d = d();
            if (d == null) {
                return 0;
            }
            return d.size();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            Collection<V> d = d();
            if (d == null) {
                return C6748hF.a.toArray();
            }
            return d.toArray();
        }

        public String toString() {
            Collection<V> d = d();
            if (d == null) {
                return C6748hF.a.toString();
            }
            return d.toString();
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            Collection<V> d = d();
            if (d == null) {
                return (T[]) C6748hF.a.toArray(tArr);
            }
            return (T[]) d.toArray(tArr);
        }
    }
}
