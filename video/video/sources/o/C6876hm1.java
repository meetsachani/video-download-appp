package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Deprecated
/* renamed from: o.hm1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6876hm1<K, V> extends I1<K, Object> implements InterfaceC4818Yl1<K, V>, Serializable {
    private static final long serialVersionUID = -2214159910087182007L;
    public final InterfaceC5641ck0<? extends Collection<V>> Y;
    public transient Collection<V> Z;

    /* renamed from: o.hm1$a */
    /* loaded from: classes4.dex */
    public class a extends UY0<Map.Entry<K, V>> {
        public final /* synthetic */ Iterator Z0;

        /* renamed from: o.hm1$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0287a implements InterfaceC3287Is2<V, Map.Entry<K, V>> {
            public final /* synthetic */ Object X;

            /* renamed from: o.hm1$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public class C0288a implements Map.Entry<K, V> {
                public final /* synthetic */ Object X;

                public C0288a(Object obj) {
                    this.X = obj;
                }

                @Override // java.util.Map.Entry
                public K getKey() {
                    return (K) C0287a.this.X;
                }

                @Override // java.util.Map.Entry
                public V getValue() {
                    return (V) this.X;
                }

                @Override // java.util.Map.Entry
                public V setValue(V v) {
                    throw new UnsupportedOperationException();
                }
            }

            public C0287a(Object obj) {
                this.X = obj;
            }

            @Override // o.InterfaceC3287Is2
            /* renamed from: b */
            public Map.Entry<K, V> a(V v) {
                return new C0288a(v);
            }
        }

        public a(Iterator it) {
            this.Z0 = it;
        }

        @Override // o.UY0
        public Iterator<? extends Map.Entry<K, V>> b(int i) {
            if (!this.Z0.hasNext()) {
                return null;
            }
            Object next = this.Z0.next();
            return new C4552Vr2(new d(next), new C0287a(next));
        }
    }

    /* renamed from: o.hm1$b */
    /* loaded from: classes4.dex */
    public static class b<T extends Collection<?>> implements InterfaceC5641ck0<T>, Serializable {
        private static final long serialVersionUID = 2986114157496788874L;
        public final Class<T> X;

        public b(Class<T> cls) {
            this.X = cls;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            Class<T> cls = this.X;
            if (cls != null && !Collection.class.isAssignableFrom(cls)) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // o.InterfaceC5641ck0
        /* renamed from: b */
        public T a() {
            try {
                return this.X.getDeclaredConstructor(null).newInstance(null);
            } catch (Exception e) {
                throw new OB0("Cannot instantiate class: " + this.X, e);
            }
        }
    }

    /* renamed from: o.hm1$c */
    /* loaded from: classes4.dex */
    public class c extends AbstractCollection<V> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C6876hm1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            C5341bU0 c5341bU0 = new C5341bU0();
            for (K k : C6876hm1.this.keySet()) {
                c5341bU0.b(new d(k));
            }
            return c5341bU0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C6876hm1.this.n();
        }

        public /* synthetic */ c(C6876hm1 c6876hm1, a aVar) {
            this();
        }
    }

    /* renamed from: o.hm1$d */
    /* loaded from: classes4.dex */
    public class d implements Iterator<V> {
        public final Object X;
        public final Collection<V> Y;
        public final Iterator<V> Z;

        public d(Object obj) {
            this.X = obj;
            Collection<V> e = C6876hm1.this.e(obj);
            this.Y = e;
            this.Z = e.iterator();
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
                C6876hm1.this.remove(this.X);
            }
        }
    }

    public C6876hm1() {
        this(new HashMap(), new b(ArrayList.class));
    }

    public static <K, V> C6876hm1<K, V> i(Map<K, ? super Collection<V>> map) {
        return j(map, ArrayList.class);
    }

    public static <K, V, C extends Collection<V>> C6876hm1<K, V> j(Map<K, ? super C> map, Class<C> cls) {
        return new C6876hm1<>(map, new b(cls));
    }

    public static <K, V, C extends Collection<V>> C6876hm1<K, V> k(Map<K, ? super C> map, InterfaceC5641ck0<C> interfaceC5641ck0) {
        return new C6876hm1<>(map, interfaceC5641ck0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = (Map) objectInputStream.readObject();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.X);
    }

    public boolean c(Object obj, Object obj2) {
        Collection<V> e = e(obj);
        if (e == null) {
            return false;
        }
        return e.contains(obj2);
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void clear() {
        b().clear();
    }

    @Override // o.I1, java.util.Map, o.UC0
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> entrySet = b().entrySet();
        if (entrySet != null) {
            for (Map.Entry<K, V> entry : entrySet) {
                if (((Collection) entry.getValue()).contains(obj)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public Collection<V> d(int i) {
        return this.Y.a();
    }

    public Collection<V> e(Object obj) {
        return (Collection) b().get(obj);
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Set<Map.Entry<K, Object>> entrySet() {
        return super.entrySet();
    }

    public Iterator<Map.Entry<K, V>> f() {
        return new a(new ArrayList(keySet()).iterator());
    }

    public Iterator<V> g(Object obj) {
        if (!containsKey(obj)) {
            return C4579Wa0.b();
        }
        return new d(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean l(K k, Collection<V> collection) {
        if (collection == 0 || collection.size() == 0) {
            return false;
        }
        Collection<V> e = e(k);
        if (e == null) {
            Collection<V> d2 = d(collection.size());
            d2.addAll(collection);
            if (d2.size() <= 0) {
                return false;
            }
            b().put(k, d2);
            return true;
        }
        return e.addAll(collection);
    }

    public int m(Object obj) {
        Collection<V> e = e(obj);
        if (e == null) {
            return 0;
        }
        return e.size();
    }

    public int n() {
        int i = 0;
        for (V v : b().values()) {
            i += C6748hF.g0(v);
        }
        return i;
    }

    @Override // o.InterfaceC4818Yl1
    public boolean p0(Object obj, Object obj2) {
        Collection<V> e = e(obj);
        if (e == null || !e.remove(obj2)) {
            return false;
        }
        if (e.isEmpty()) {
            remove(obj);
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.I1, java.util.Map, o.OK1
    public Object put(K k, Object obj) {
        boolean add;
        Collection<V> e = e(k);
        if (e == null) {
            add = true;
            Collection<V> d2 = d(1);
            d2.add(obj);
            if (d2.size() > 0) {
                b().put(k, d2);
            } else {
                add = false;
            }
        } else {
            add = e.add(obj);
        }
        if (add) {
            return obj;
        }
        return null;
    }

    @Override // o.I1, java.util.Map, o.OK1
    public void putAll(Map<? extends K, ?> map) {
        if (map instanceof InterfaceC4818Yl1) {
            for (Map.Entry<K, Object> entry : ((InterfaceC4818Yl1) map).entrySet()) {
                l(entry.getKey(), (Collection) entry.getValue());
            }
            return;
        }
        for (Map.Entry<? extends K, ?> entry2 : map.entrySet()) {
            put(entry2.getKey(), entry2.getValue());
        }
    }

    @Override // o.I1, java.util.Map, o.UC0
    public Collection<Object> values() {
        Collection<V> collection = this.Z;
        if (collection != null) {
            return collection;
        }
        c cVar = new c(this, null);
        this.Z = cVar;
        return cVar;
    }

    public <C extends Collection<V>> C6876hm1(Map<K, ? super C> map, InterfaceC5641ck0<C> interfaceC5641ck0) {
        super(map);
        if (interfaceC5641ck0 != null) {
            this.Y = interfaceC5641ck0;
            return;
        }
        throw new IllegalArgumentException("The factory must not be null");
    }
}
