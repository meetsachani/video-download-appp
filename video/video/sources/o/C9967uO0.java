package o;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;
import o.AbstractC6044eO0;
import o.TN0;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* renamed from: o.uO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9967uO0<K, V> extends AbstractC10210vO0<K, V> implements NavigableMap<K, V> {
    public static final Comparator<Comparable> d1 = AbstractC10587ww1.z();
    public static final C9967uO0<Comparable, Object> e1 = new C9967uO0<>(AbstractC10942yO0.E0(AbstractC10587ww1.z()), AbstractC5317bO0.L());
    private static final long serialVersionUID = 0;
    public final transient UQ1<K> a1;
    public final transient AbstractC5317bO0<V> b1;
    @MB
    public transient C9967uO0<K, V> c1;

    /* renamed from: o.uO0$a */
    /* loaded from: classes3.dex */
    public class a implements Comparator<Map.Entry<K, V>> {
        public final /* synthetic */ Comparator X;

        public a(Comparator comparator) {
            this.X = comparator;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(@MB Map.Entry<K, V> entry, @MB Map.Entry<K, V> entry2) {
            Objects.requireNonNull(entry);
            Objects.requireNonNull(entry2);
            return this.X.compare(entry.getKey(), entry2.getKey());
        }
    }

    /* renamed from: o.uO0$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC6287fO0<K, V> {

        /* renamed from: o.uO0$b$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC5317bO0<Map.Entry<K, V>> {
            public a() {
            }

            @Override // o.TN0
            public boolean j() {
                return true;
            }

            @Override // java.util.List
            /* renamed from: p0 */
            public Map.Entry<K, V> get(int i) {
                return new AbstractMap.SimpleImmutableEntry(C9967uO0.this.a1.d().get(i), C9967uO0.this.b1.get(i));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return C9967uO0.this.size();
            }
        }

        public b() {
        }

        @Override // o.AbstractC9481sO0
        public AbstractC5317bO0<Map.Entry<K, V>> K() {
            return new a();
        }

        @Override // o.AbstractC6287fO0
        public AbstractC6044eO0<K, V> d0() {
            return C9967uO0.this;
        }

        @Override // o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: k */
        public AbstractC6237fB2<Map.Entry<K, V>> iterator() {
            return d().iterator();
        }
    }

    /* renamed from: o.uO0$c */
    /* loaded from: classes3.dex */
    public static class c<K, V> extends AbstractC6044eO0.b<K, V> {
        public transient Object[] f;
        public transient Object[] g;
        public final Comparator<? super K> h;

        public c(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        public final void f(int i) {
            Object[] objArr = this.f;
            if (i > objArr.length) {
                int f = TN0.b.f(objArr.length, i);
                this.f = Arrays.copyOf(this.f, f);
                this.g = Arrays.copyOf(this.g, f);
            }
        }

        @Override // o.AbstractC6044eO0.b
        /* renamed from: n */
        public C9967uO0<K, V> a() {
            return d();
        }

        @Override // o.AbstractC6044eO0.b
        @J40
        @Deprecated
        /* renamed from: o */
        public final C9967uO0<K, V> c() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }

        @Override // o.AbstractC6044eO0.b
        /* renamed from: p */
        public C9967uO0<K, V> d() {
            int i = this.c;
            if (i != 0) {
                if (i != 1) {
                    Object[] copyOf = Arrays.copyOf(this.f, i);
                    Arrays.sort(copyOf, this.h);
                    Object[] objArr = new Object[this.c];
                    for (int i2 = 0; i2 < this.c; i2++) {
                        if (i2 > 0) {
                            int i3 = i2 - 1;
                            if (this.h.compare(copyOf[i3], copyOf[i2]) == 0) {
                                String valueOf = String.valueOf(copyOf[i3]);
                                String valueOf2 = String.valueOf(copyOf[i2]);
                                StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
                                sb.append("keys required to be distinct but compared as equal: ");
                                sb.append(valueOf);
                                sb.append(" and ");
                                sb.append(valueOf2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                        Object obj = this.f[i2];
                        Objects.requireNonNull(obj);
                        int binarySearch = Arrays.binarySearch(copyOf, obj, this.h);
                        Object obj2 = this.g[i2];
                        Objects.requireNonNull(obj2);
                        objArr[binarySearch] = obj2;
                    }
                    return new C9967uO0<>(new UQ1(AbstractC5317bO0.l(copyOf), this.h), AbstractC5317bO0.l(objArr));
                }
                Comparator<? super K> comparator = this.h;
                Object obj3 = this.f[0];
                Objects.requireNonNull(obj3);
                Object obj4 = this.g[0];
                Objects.requireNonNull(obj4);
                return C9967uO0.J0(comparator, obj3, obj4);
            }
            return C9967uO0.m0(this.h);
        }

        @InterfaceC6181ey
        public c<K, V> q(c<K, V> cVar) {
            f(this.c + cVar.c);
            System.arraycopy(cVar.f, 0, this.f, this.c, cVar.c);
            System.arraycopy(cVar.g, 0, this.g, this.c, cVar.c);
            this.c += cVar.c;
            return this;
        }

        @Override // o.AbstractC6044eO0.b
        @InterfaceC6181ey
        @Deprecated
        @J40("Always throws UnsupportedOperationException")
        @InterfaceC4238Sm
        /* renamed from: r */
        public final c<K, V> h(Comparator<? super V> comparator) {
            throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        @Override // o.AbstractC6044eO0.b
        @InterfaceC6181ey
        /* renamed from: s */
        public c<K, V> i(K k, V v) {
            f(this.c + 1);
            C5037aF.a(k, v);
            Object[] objArr = this.f;
            int i = this.c;
            objArr[i] = k;
            this.g[i] = v;
            this.c = i + 1;
            return this;
        }

        @Override // o.AbstractC6044eO0.b
        @InterfaceC6181ey
        /* renamed from: t */
        public c<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            super.j(entry);
            return this;
        }

        @Override // o.AbstractC6044eO0.b
        @InterfaceC6181ey
        @InterfaceC4238Sm
        /* renamed from: u */
        public c<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.k(iterable);
            return this;
        }

        @Override // o.AbstractC6044eO0.b
        @InterfaceC6181ey
        /* renamed from: v */
        public c<K, V> l(Map<? extends K, ? extends V> map) {
            super.l(map);
            return this;
        }

        public c(Comparator<? super K> comparator, int i) {
            this.h = (Comparator) C10664xF1.E(comparator);
            this.f = new Object[i];
            this.g = new Object[i];
        }
    }

    /* renamed from: o.uO0$d */
    /* loaded from: classes3.dex */
    public static class d<K, V> extends AbstractC6044eO0.e<K, V> {
        private static final long serialVersionUID = 0;
        public final Comparator<? super K> Y0;

        public d(C9967uO0<K, V> c9967uO0) {
            super(c9967uO0);
            this.Y0 = c9967uO0.comparator();
        }

        @Override // o.AbstractC6044eO0.e
        /* renamed from: c */
        public c<K, V> b(int i) {
            return new c<>(this.Y0);
        }
    }

    public C9967uO0(UQ1<K> uq1, AbstractC5317bO0<V> abstractC5317bO0) {
        this(uq1, abstractC5317bO0, null);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lo/uO0<TK;TV;>; */
    public static C9967uO0 A0(Comparable comparable, Object obj, Comparable comparable2, Object obj2) {
        return r0(AbstractC6044eO0.l(comparable, obj), AbstractC6044eO0.l(comparable2, obj2));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lo/uO0<TK;TV;>; */
    public static C9967uO0 B0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3) {
        return r0(AbstractC6044eO0.l(comparable, obj), AbstractC6044eO0.l(comparable2, obj2), AbstractC6044eO0.l(comparable3, obj3));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lo/uO0<TK;TV;>; */
    public static C9967uO0 C0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4) {
        return r0(AbstractC6044eO0.l(comparable, obj), AbstractC6044eO0.l(comparable2, obj2), AbstractC6044eO0.l(comparable3, obj3), AbstractC6044eO0.l(comparable4, obj4));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lo/uO0<TK;TV;>; */
    public static C9967uO0 D0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5) {
        return r0(AbstractC6044eO0.l(comparable, obj), AbstractC6044eO0.l(comparable2, obj2), AbstractC6044eO0.l(comparable3, obj3), AbstractC6044eO0.l(comparable4, obj4), AbstractC6044eO0.l(comparable5, obj5));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lo/uO0<TK;TV;>; */
    public static C9967uO0 E0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6) {
        return r0(AbstractC6044eO0.l(comparable, obj), AbstractC6044eO0.l(comparable2, obj2), AbstractC6044eO0.l(comparable3, obj3), AbstractC6044eO0.l(comparable4, obj4), AbstractC6044eO0.l(comparable5, obj5), AbstractC6044eO0.l(comparable6, obj6));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lo/uO0<TK;TV;>; */
    public static C9967uO0 F0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7) {
        return r0(AbstractC6044eO0.l(comparable, obj), AbstractC6044eO0.l(comparable2, obj2), AbstractC6044eO0.l(comparable3, obj3), AbstractC6044eO0.l(comparable4, obj4), AbstractC6044eO0.l(comparable5, obj5), AbstractC6044eO0.l(comparable6, obj6), AbstractC6044eO0.l(comparable7, obj7));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lo/uO0<TK;TV;>; */
    public static C9967uO0 G0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8) {
        return r0(AbstractC6044eO0.l(comparable, obj), AbstractC6044eO0.l(comparable2, obj2), AbstractC6044eO0.l(comparable3, obj3), AbstractC6044eO0.l(comparable4, obj4), AbstractC6044eO0.l(comparable5, obj5), AbstractC6044eO0.l(comparable6, obj6), AbstractC6044eO0.l(comparable7, obj7), AbstractC6044eO0.l(comparable8, obj8));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lo/uO0<TK;TV;>; */
    public static C9967uO0 H0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9) {
        return r0(AbstractC6044eO0.l(comparable, obj), AbstractC6044eO0.l(comparable2, obj2), AbstractC6044eO0.l(comparable3, obj3), AbstractC6044eO0.l(comparable4, obj4), AbstractC6044eO0.l(comparable5, obj5), AbstractC6044eO0.l(comparable6, obj6), AbstractC6044eO0.l(comparable7, obj7), AbstractC6044eO0.l(comparable8, obj8), AbstractC6044eO0.l(comparable9, obj9));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lo/uO0<TK;TV;>; */
    public static C9967uO0 I0(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9, Comparable comparable10, Object obj10) {
        return r0(AbstractC6044eO0.l(comparable, obj), AbstractC6044eO0.l(comparable2, obj2), AbstractC6044eO0.l(comparable3, obj3), AbstractC6044eO0.l(comparable4, obj4), AbstractC6044eO0.l(comparable5, obj5), AbstractC6044eO0.l(comparable6, obj6), AbstractC6044eO0.l(comparable7, obj7), AbstractC6044eO0.l(comparable8, obj8), AbstractC6044eO0.l(comparable9, obj9), AbstractC6044eO0.l(comparable10, obj10));
    }

    public static <K, V> C9967uO0<K, V> J0(Comparator<? super K> comparator, K k, V v) {
        return new C9967uO0<>(new UQ1(AbstractC5317bO0.M(k), (Comparator) C10664xF1.E(comparator)), AbstractC5317bO0.M(v));
    }

    public static <K, V> c<K, V> K0(Comparator<K> comparator) {
        return new c<>(comparator);
    }

    public static <K extends Comparable<?>, V> c<K, V> L0() {
        return new c<>(AbstractC10587ww1.z().E());
    }

    @InterfaceC4238Sm
    public static <K, V> C9967uO0<K, V> a0(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return c0(iterable, (AbstractC10587ww1) d1);
    }

    @InterfaceC4238Sm
    public static <K, V> C9967uO0<K, V> c0(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        return o0((Comparator) C10664xF1.E(comparator), false, iterable);
    }

    public static <K, V> C9967uO0<K, V> d0(Map<? extends K, ? extends V> map) {
        return f0(map, (AbstractC10587ww1) d1);
    }

    public static <K, V> C9967uO0<K, V> e0(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return f0(map, (Comparator) C10664xF1.E(comparator));
    }

    public static <K, V> C9967uO0<K, V> f0(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean z = false;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 == null) {
                if (comparator == d1) {
                    z = true;
                }
            } else {
                z = comparator.equals(comparator2);
            }
        }
        if (z && (map instanceof C9967uO0)) {
            C9967uO0<K, V> c9967uO0 = (C9967uO0) map;
            if (!c9967uO0.o()) {
                return c9967uO0;
            }
        }
        return o0(comparator, z, map.entrySet());
    }

    public static <K, V> C9967uO0<K, V> g0(SortedMap<K, ? extends V> sortedMap) {
        Comparator<? super K> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = d1;
        }
        if (sortedMap instanceof C9967uO0) {
            C9967uO0<K, V> c9967uO0 = (C9967uO0) sortedMap;
            if (!c9967uO0.o()) {
                return c9967uO0;
            }
        }
        return o0(comparator, true, sortedMap.entrySet());
    }

    public static <K, V> C9967uO0<K, V> m0(Comparator<? super K> comparator) {
        if (AbstractC10587ww1.z().equals(comparator)) {
            return y0();
        }
        return new C9967uO0<>(AbstractC10942yO0.E0(comparator), AbstractC5317bO0.L());
    }

    public static <K, V> C9967uO0<K, V> o0(Comparator<? super K> comparator, boolean z, Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) C5098aU0.R(iterable, AbstractC6044eO0.Z0);
        return q0(comparator, z, entryArr, entryArr.length);
    }

    public static <K, V> C9967uO0<K, V> q0(Comparator<? super K> comparator, boolean z, Map.Entry<K, V>[] entryArr, int i) {
        boolean z2;
        if (i != 0) {
            if (i != 1) {
                Object[] objArr = new Object[i];
                Object[] objArr2 = new Object[i];
                if (z) {
                    for (int i2 = 0; i2 < i; i2++) {
                        Map.Entry<K, V> entry = entryArr[i2];
                        Objects.requireNonNull(entry);
                        Map.Entry<K, V> entry2 = entry;
                        K key = entry2.getKey();
                        V value = entry2.getValue();
                        C5037aF.a(key, value);
                        objArr[i2] = key;
                        objArr2[i2] = value;
                    }
                } else {
                    Arrays.sort(entryArr, 0, i, new a(comparator));
                    Map.Entry<K, V> entry3 = entryArr[0];
                    Objects.requireNonNull(entry3);
                    Map.Entry<K, V> entry4 = entry3;
                    Object key2 = entry4.getKey();
                    objArr[0] = key2;
                    V value2 = entry4.getValue();
                    objArr2[0] = value2;
                    C5037aF.a(objArr[0], value2);
                    int i3 = 1;
                    while (i3 < i) {
                        Map.Entry<K, V> entry5 = entryArr[i3 - 1];
                        Objects.requireNonNull(entry5);
                        Map.Entry<K, V> entry6 = entry5;
                        Map.Entry<K, V> entry7 = entryArr[i3];
                        Objects.requireNonNull(entry7);
                        Map.Entry<K, V> entry8 = entry7;
                        Object key3 = entry8.getKey();
                        V value3 = entry8.getValue();
                        C5037aF.a(key3, value3);
                        objArr[i3] = key3;
                        objArr2[i3] = value3;
                        if (comparator.compare(key2, key3) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        AbstractC6044eO0.d(z2, "key", entry6, entry8);
                        i3++;
                        key2 = key3;
                    }
                }
                return new C9967uO0<>(new UQ1(AbstractC5317bO0.l(objArr), comparator), AbstractC5317bO0.l(objArr2));
            }
            Map.Entry<K, V> entry9 = entryArr[0];
            Objects.requireNonNull(entry9);
            Map.Entry<K, V> entry10 = entry9;
            return J0(comparator, entry10.getKey(), entry10.getValue());
        }
        return m0(comparator);
    }

    public static <K extends Comparable<? super K>, V> C9967uO0<K, V> r0(Map.Entry<K, V>... entryArr) {
        return q0(AbstractC10587ww1.z(), false, entryArr, entryArr.length);
    }

    public static <K extends Comparable<?>, V> c<K, V> w0() {
        return new c<>(AbstractC10587ww1.z());
    }

    public static <K, V> C9967uO0<K, V> y0() {
        return (C9967uO0<K, V>) e1;
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lo/uO0<TK;TV;>; */
    public static C9967uO0 z0(Comparable comparable, Object obj) {
        return J0(AbstractC10587ww1.z(), comparable, obj);
    }

    @Override // o.AbstractC6044eO0, java.util.Map, o.InterfaceC4626Wm
    /* renamed from: G */
    public TN0<V> values() {
        return this.b1;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: M0 */
    public C9967uO0<K, V> subMap(K k, K k2) {
        return subMap(k, true, k2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    /* renamed from: N0 */
    public C9967uO0<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        boolean z3;
        C10664xF1.E(k);
        C10664xF1.E(k2);
        if (comparator().compare(k, k2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C10664xF1.y(z3, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap(k2, z2).tailMap(k, z);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: P0 */
    public C9967uO0<K, V> tailMap(K k) {
        return tailMap(k, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    /* renamed from: Q0 */
    public C9967uO0<K, V> tailMap(K k, boolean z) {
        return s0(this.a1.g1(C10664xF1.E(k), z), size());
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @MB
    public K ceilingKey(K k) {
        return (K) C7935m81.T(ceilingEntry(k));
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return t().comparator();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().d().get(0);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return t().first();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @MB
    public K floorKey(K k) {
        return (K) C7935m81.T(floorEntry(k));
    }

    @Override // o.AbstractC6044eO0, java.util.Map
    @MB
    public V get(@MB Object obj) {
        int indexOf = this.a1.indexOf(obj);
        if (indexOf == -1) {
            return null;
        }
        return this.b1.get(indexOf);
    }

    @Override // java.util.NavigableMap
    /* renamed from: h0 */
    public AbstractC10942yO0<K> descendingKeySet() {
        return this.a1.descendingSet();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @MB
    public K higherKey(K k) {
        return (K) C7935m81.T(higherEntry(k));
    }

    @Override // o.AbstractC6044eO0
    public AbstractC9481sO0<Map.Entry<K, V>> i() {
        if (isEmpty()) {
            return AbstractC9481sO0.M();
        }
        return new b();
    }

    @Override // java.util.NavigableMap
    /* renamed from: i0 */
    public C9967uO0<K, V> descendingMap() {
        C9967uO0<K, V> c9967uO0 = this.c1;
        if (c9967uO0 == null) {
            if (isEmpty()) {
                return m0(AbstractC10587ww1.h(comparator()).E());
            }
            return new C9967uO0<>((UQ1) this.a1.descendingSet(), this.b1.j0(), this);
        }
        return c9967uO0;
    }

    @Override // o.AbstractC6044eO0
    public AbstractC9481sO0<K> j() {
        throw new AssertionError("should never be called");
    }

    @Override // o.AbstractC6044eO0
    public TN0<V> k() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().d().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return t().last();
    }

    @Override // java.util.NavigableMap
    @MB
    public Map.Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @MB
    public K lowerKey(K k) {
        return (K) C7935m81.T(lowerEntry(k));
    }

    @Override // o.AbstractC6044eO0, java.util.Map
    /* renamed from: m */
    public AbstractC9481sO0<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // o.AbstractC6044eO0
    public boolean o() {
        if (!this.a1.j() && !this.b1.j()) {
            return false;
        }
        return true;
    }

    @Override // java.util.NavigableMap
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public final C9967uO0<K, V> s0(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i == i2) {
            return m0(comparator());
        }
        return new C9967uO0<>(this.a1.e1(i, i2), this.b1.subList(i, i2));
    }

    @Override // java.util.Map
    public int size() {
        return this.b1.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: t0 */
    public C9967uO0<K, V> headMap(K k) {
        return headMap(k, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    /* renamed from: u0 */
    public C9967uO0<K, V> headMap(K k, boolean z) {
        return s0(0, this.a1.f1(C10664xF1.E(k), z));
    }

    @Override // o.AbstractC6044eO0
    /* renamed from: v0 */
    public AbstractC10942yO0<K> t() {
        return this.a1;
    }

    @Override // o.AbstractC6044eO0
    public Object writeReplace() {
        return new d(this);
    }

    @Override // java.util.NavigableMap
    /* renamed from: x0 */
    public AbstractC10942yO0<K> navigableKeySet() {
        return this.a1;
    }

    public C9967uO0(UQ1<K> uq1, AbstractC5317bO0<V> abstractC5317bO0, @MB C9967uO0<K, V> c9967uO0) {
        this.a1 = uq1;
        this.b1 = abstractC5317bO0;
        this.c1 = c9967uO0;
    }
}
