package o;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import o.C11040yo0;

/* renamed from: o.u92  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9909u92<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public final int X;
    public List<C9909u92<K, V>.e> Y;
    public boolean Y0;
    public Map<K, V> Z;
    public volatile C9909u92<K, V>.g Z0;
    public Map<K, V> a1;
    public volatile C9909u92<K, V>.c b1;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* renamed from: o.u92$a */
    /* loaded from: classes.dex */
    public static class a<FieldDescriptorType> extends C9909u92<FieldDescriptorType, Object> {
        public a(int i) {
            super(i, null);
        }

        @Override // o.C9909u92, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((C11040yo0.c) obj, obj2);
        }

        @Override // o.C9909u92
        public void u() {
            if (!t()) {
                for (int i = 0; i < l(); i++) {
                    Map.Entry<FieldDescriptorType, Object> k = k(i);
                    if (((C11040yo0.c) k.getKey()).g3()) {
                        k.setValue(Collections.unmodifiableList((List) k.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((C11040yo0.c) entry.getKey()).g3()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.u();
        }
    }

    /* renamed from: o.u92$c */
    /* loaded from: classes.dex */
    public class c extends C9909u92<K, V>.g {
        public c() {
            super(C9909u92.this, null);
        }

        @Override // o.C9909u92.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(C9909u92.this, null);
        }

        public /* synthetic */ c(C9909u92 c9909u92, a aVar) {
            this();
        }
    }

    /* renamed from: o.u92$d */
    /* loaded from: classes.dex */
    public static class d {
        public static final Iterator<Object> a = new a();
        public static final Iterable<Object> b = new b();

        /* renamed from: o.u92$d$a */
        /* loaded from: classes.dex */
        public static class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: o.u92$d$b */
        /* loaded from: classes.dex */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.a;
            }
        }

        public static <T> Iterable<T> b() {
            return (Iterable<T>) b;
        }
    }

    /* renamed from: o.u92$e */
    /* loaded from: classes.dex */
    public class e implements Map.Entry<K, V>, Comparable<C9909u92<K, V>.e> {
        public final K X;
        public V Y;

        public e(C9909u92 c9909u92, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(C9909u92<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (g(this.X, entry.getKey()) && g(this.Y, entry.getValue())) {
                return true;
            }
            return false;
        }

        public final boolean g(Object obj, Object obj2) {
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
                return false;
            }
            return obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.Y;
        }

        @Override // java.util.Map.Entry
        /* renamed from: h */
        public K getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k = this.X;
            int i = 0;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            V v = this.Y;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            C9909u92.this.g();
            V v2 = this.Y;
            this.Y = v;
            return v2;
        }

        public String toString() {
            return this.X + "=" + this.Y;
        }

        public e(K k, V v) {
            this.X = k;
            this.Y = v;
        }
    }

    /* renamed from: o.u92$g */
    /* loaded from: classes.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C9909u92.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C9909u92.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                if (obj2 == null || !obj2.equals(value)) {
                    return false;
                }
                return true;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: d */
        public boolean add(Map.Entry<K, V> entry) {
            if (!contains(entry)) {
                C9909u92.this.put(entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(C9909u92.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                C9909u92.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C9909u92.this.size();
        }

        public /* synthetic */ g(C9909u92 c9909u92, a aVar) {
            this();
        }
    }

    public /* synthetic */ C9909u92(int i, a aVar) {
        this(i);
    }

    public static <FieldDescriptorType extends C11040yo0.c<FieldDescriptorType>> C9909u92<FieldDescriptorType, Object> v(int i) {
        return new a(i);
    }

    public static <K extends Comparable<K>, V> C9909u92<K, V> w(int i) {
        return new C9909u92<>(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.Y.isEmpty()) {
            this.Y.clear();
        }
        if (!this.Z.isEmpty()) {
            this.Z.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (f(comparable) < 0 && !this.Z.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.Z0 == null) {
            this.Z0 = new g(this, null);
        }
        return this.Z0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9909u92)) {
            return super.equals(obj);
        }
        C9909u92 c9909u92 = (C9909u92) obj;
        int size = size();
        if (size != c9909u92.size()) {
            return false;
        }
        int l = l();
        if (l != c9909u92.l()) {
            return entrySet().equals(c9909u92.entrySet());
        }
        for (int i = 0; i < l; i++) {
            if (!k(i).equals(c9909u92.k(i))) {
                return false;
            }
        }
        if (l == size) {
            return true;
        }
        return this.Z.equals(c9909u92.Z);
    }

    public final int f(K k) {
        int i;
        int size = this.Y.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = k.compareTo(this.Y.get(i2).getKey());
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            } else if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = k.compareTo(this.Y.get(i4).getKey());
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 > 0) {
                i3 = i4 + 1;
            } else {
                return i4;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void g() {
        if (!this.Y0) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f2 = f(comparable);
        if (f2 >= 0) {
            return this.Y.get(f2).getValue();
        }
        return this.Z.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int l = l();
        int i = 0;
        for (int i2 = 0; i2 < l; i2++) {
            i += this.Y.get(i2).hashCode();
        }
        if (m() > 0) {
            return i + this.Z.hashCode();
        }
        return i;
    }

    public Set<Map.Entry<K, V>> i() {
        if (this.b1 == null) {
            this.b1 = new c(this, null);
        }
        return this.b1;
    }

    public final void j() {
        g();
        if (this.Y.isEmpty() && !(this.Y instanceof ArrayList)) {
            this.Y = new ArrayList(this.X);
        }
    }

    public Map.Entry<K, V> k(int i) {
        return this.Y.get(i);
    }

    public int l() {
        return this.Y.size();
    }

    public int m() {
        return this.Z.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        if (this.Z.isEmpty()) {
            return d.b();
        }
        return this.Z.entrySet();
    }

    public Iterable<Map.Entry<K, V>> o() {
        if (this.a1.isEmpty()) {
            return d.b();
        }
        return this.a1.entrySet();
    }

    public final SortedMap<K, V> r() {
        g();
        if (this.Z.isEmpty() && !(this.Z instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.Z = treeMap;
            this.a1 = treeMap.descendingMap();
        }
        return (SortedMap) this.Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f2 = f(comparable);
        if (f2 >= 0) {
            return (V) y(f2);
        }
        if (this.Z.isEmpty()) {
            return null;
        }
        return this.Z.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.Y.size() + this.Z.size();
    }

    public boolean t() {
        return this.Y0;
    }

    public void u() {
        Map<K, V> unmodifiableMap;
        Map<K, V> unmodifiableMap2;
        if (!this.Y0) {
            if (this.Z.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.Z);
            }
            this.Z = unmodifiableMap;
            if (this.a1.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.a1);
            }
            this.a1 = unmodifiableMap2;
            this.Y0 = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: x */
    public V put(K k, V v) {
        g();
        int f2 = f(k);
        if (f2 >= 0) {
            return this.Y.get(f2).setValue(v);
        }
        j();
        int i = -(f2 + 1);
        if (i >= this.X) {
            return r().put(k, v);
        }
        int size = this.Y.size();
        int i2 = this.X;
        if (size == i2) {
            C9909u92<K, V>.e remove = this.Y.remove(i2 - 1);
            r().put((K) remove.getKey(), remove.getValue());
        }
        this.Y.add(i, new e(k, v));
        return null;
    }

    public final V y(int i) {
        g();
        V value = this.Y.remove(i).getValue();
        if (!this.Z.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = r().entrySet().iterator();
            this.Y.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: o.u92$b */
    /* loaded from: classes.dex */
    public class b implements Iterator<Map.Entry<K, V>> {
        public int X;
        public Iterator<Map.Entry<K, V>> Y;

        public b() {
            this.X = C9909u92.this.Y.size();
        }

        public final Iterator<Map.Entry<K, V>> b() {
            if (this.Y == null) {
                this.Y = C9909u92.this.a1.entrySet().iterator();
            }
            return this.Y;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            if (!b().hasNext()) {
                List list = C9909u92.this.Y;
                int i = this.X - 1;
                this.X = i;
                return (Map.Entry) list.get(i);
            }
            return b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.X;
            if ((i > 0 && i <= C9909u92.this.Y.size()) || b().hasNext()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(C9909u92 c9909u92, a aVar) {
            this();
        }
    }

    /* renamed from: o.u92$f */
    /* loaded from: classes.dex */
    public class f implements Iterator<Map.Entry<K, V>> {
        public int X;
        public boolean Y;
        public Iterator<Map.Entry<K, V>> Z;

        public f() {
            this.X = -1;
        }

        public final Iterator<Map.Entry<K, V>> b() {
            if (this.Z == null) {
                this.Z = C9909u92.this.Z.entrySet().iterator();
            }
            return this.Z;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.Y = true;
            int i = this.X + 1;
            this.X = i;
            if (i < C9909u92.this.Y.size()) {
                return (Map.Entry) C9909u92.this.Y.get(this.X);
            }
            return b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X + 1 < C9909u92.this.Y.size() || (!C9909u92.this.Z.isEmpty() && b().hasNext())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.Y) {
                this.Y = false;
                C9909u92.this.g();
                if (this.X < C9909u92.this.Y.size()) {
                    C9909u92 c9909u92 = C9909u92.this;
                    int i = this.X;
                    this.X = i - 1;
                    c9909u92.y(i);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        public /* synthetic */ f(C9909u92 c9909u92, a aVar) {
            this();
        }
    }

    public C9909u92(int i) {
        this.X = i;
        this.Y = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.Z = map;
        this.a1 = map;
    }
}
