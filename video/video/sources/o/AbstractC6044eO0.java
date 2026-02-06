package o;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import o.TN0;

@L40("Use ImmutableMap.of or another implementation")
@InterfaceC6329fa0
@InterfaceC10420wF0(emulated = true, serializable = true)
/* renamed from: o.eO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6044eO0<K, V> implements Map<K, V>, Serializable {
    public static final Map.Entry<?, ?>[] Z0 = new Map.Entry[0];
    @MB
    @SY0
    @InterfaceC7537kU1
    public transient AbstractC9481sO0<Map.Entry<K, V>> X;
    @MB
    @SY0
    @InterfaceC7537kU1
    public transient AbstractC9481sO0<K> Y;
    @MB
    @SY0
    public transient C9724tO0<K, V> Y0;
    @MB
    @SY0
    @InterfaceC7537kU1
    public transient TN0<V> Z;

    /* renamed from: o.eO0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC6237fB2<K> {
        public final /* synthetic */ AbstractC6237fB2 X;

        public a(AbstractC6044eO0 abstractC6044eO0, AbstractC6237fB2 abstractC6237fB2) {
            this.X = abstractC6237fB2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.X.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.X.next()).getKey();
        }
    }

    @L40
    /* renamed from: o.eO0$b */
    /* loaded from: classes3.dex */
    public static class b<K, V> {
        @MB
        public Comparator<? super V> a;
        public Object[] b;
        public int c;
        public boolean d;
        public a e;

        /* renamed from: o.eO0$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            public final Object a;
            public final Object b;
            public final Object c;

            public a(Object obj, Object obj2, Object obj3) {
                this.a = obj;
                this.b = obj2;
                this.c = obj3;
            }

            public IllegalArgumentException a() {
                String valueOf = String.valueOf(this.a);
                String valueOf2 = String.valueOf(this.b);
                String valueOf3 = String.valueOf(this.a);
                String valueOf4 = String.valueOf(this.c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public b() {
            this(4);
        }

        private void f(int i) {
            int i2 = i * 2;
            Object[] objArr = this.b;
            if (i2 > objArr.length) {
                this.b = Arrays.copyOf(objArr, TN0.b.f(objArr.length, i2));
                this.d = false;
            }
        }

        public static <V> void m(Object[] objArr, int i, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, AbstractC10587ww1.h(comparator).D(C7935m81.N0()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        public AbstractC6044eO0<K, V> a() {
            return d();
        }

        public final AbstractC6044eO0<K, V> b(boolean z) {
            Object[] objArr;
            a aVar;
            a aVar2;
            if (z && (aVar2 = this.e) != null) {
                throw aVar2.a();
            }
            int i = this.c;
            if (this.a == null) {
                objArr = this.b;
            } else {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, i * 2);
                }
                objArr = this.b;
                if (!z) {
                    objArr = g(objArr, this.c);
                    if (objArr.length < this.b.length) {
                        i = objArr.length >>> 1;
                    }
                }
                m(objArr, i, this.a);
            }
            this.d = true;
            QQ1 I = QQ1.I(i, objArr, this);
            if (z && (aVar = this.e) != null) {
                throw aVar.a();
            }
            return I;
        }

        public AbstractC6044eO0<K, V> c() {
            return b(false);
        }

        public AbstractC6044eO0<K, V> d() {
            return b(true);
        }

        @InterfaceC6181ey
        public b<K, V> e(b<K, V> bVar) {
            C10664xF1.E(bVar);
            f(this.c + bVar.c);
            System.arraycopy(bVar.b, 0, this.b, this.c * 2, bVar.c * 2);
            this.c += bVar.c;
            return this;
        }

        public final Object[] g(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 += 2;
                    i3 += 2;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        @InterfaceC6181ey
        @InterfaceC4238Sm
        public b<K, V> h(Comparator<? super V> comparator) {
            boolean z;
            if (this.a == null) {
                z = true;
            } else {
                z = false;
            }
            C10664xF1.h0(z, "valueComparator was already set");
            this.a = (Comparator) C10664xF1.F(comparator, "valueComparator");
            return this;
        }

        @InterfaceC6181ey
        public b<K, V> i(K k, V v) {
            f(this.c + 1);
            C5037aF.a(k, v);
            Object[] objArr = this.b;
            int i = this.c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.c = i + 1;
            return this;
        }

        @InterfaceC6181ey
        public b<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            return i(entry.getKey(), entry.getValue());
        }

        @InterfaceC6181ey
        @InterfaceC4238Sm
        public b<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                f(this.c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                j(entry);
            }
            return this;
        }

        @InterfaceC6181ey
        public b<K, V> l(Map<? extends K, ? extends V> map) {
            return k(map.entrySet());
        }

        public b(int i) {
            this.b = new Object[i * 2];
            this.c = 0;
            this.d = false;
        }
    }

    /* renamed from: o.eO0$c */
    /* loaded from: classes3.dex */
    public static abstract class c<K, V> extends AbstractC6044eO0<K, V> {

        /* renamed from: o.eO0$c$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6287fO0<K, V> {
            public a() {
            }

            @Override // o.AbstractC6287fO0
            public AbstractC6044eO0<K, V> d0() {
                return c.this;
            }

            @Override // o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* renamed from: k */
            public AbstractC6237fB2<Map.Entry<K, V>> iterator() {
                return c.this.H();
            }
        }

        public abstract AbstractC6237fB2<Map.Entry<K, V>> H();

        @Override // o.AbstractC6044eO0, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // o.AbstractC6044eO0
        public AbstractC9481sO0<Map.Entry<K, V>> i() {
            return new a();
        }

        @Override // o.AbstractC6044eO0
        public AbstractC9481sO0<K> j() {
            return new C6542gO0(this);
        }

        @Override // o.AbstractC6044eO0
        public TN0<V> k() {
            return new C6785hO0(this);
        }

        @Override // o.AbstractC6044eO0, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // o.AbstractC6044eO0, java.util.Map, o.InterfaceC4626Wm
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* renamed from: o.eO0$d */
    /* loaded from: classes3.dex */
    public final class d extends c<K, AbstractC9481sO0<V>> {

        /* renamed from: o.eO0$d$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC6237fB2<Map.Entry<K, AbstractC9481sO0<V>>> {
            public final /* synthetic */ Iterator X;

            /* renamed from: o.eO0$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0272a extends M1<K, AbstractC9481sO0<V>> {
                public final /* synthetic */ Map.Entry X;

                public C0272a(a aVar, Map.Entry entry) {
                    this.X = entry;
                }

                @Override // o.M1, java.util.Map.Entry
                /* renamed from: a */
                public AbstractC9481sO0<V> getValue() {
                    return AbstractC9481sO0.Q(this.X.getValue());
                }

                @Override // o.M1, java.util.Map.Entry
                public K getKey() {
                    return (K) this.X.getKey();
                }
            }

            public a(d dVar, Iterator it) {
                this.X = it;
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, AbstractC9481sO0<V>> next() {
                return new C0272a(this, (Map.Entry) this.X.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.X.hasNext();
            }
        }

        public d() {
        }

        @Override // o.AbstractC6044eO0.c
        public AbstractC6237fB2<Map.Entry<K, AbstractC9481sO0<V>>> H() {
            return new a(this, AbstractC6044eO0.this.entrySet().iterator());
        }

        @Override // o.AbstractC6044eO0, java.util.Map
        @MB
        /* renamed from: I */
        public AbstractC9481sO0<V> get(@MB Object obj) {
            Object obj2 = AbstractC6044eO0.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return AbstractC9481sO0.Q(obj2);
        }

        @Override // o.AbstractC6044eO0, java.util.Map
        public boolean containsKey(@MB Object obj) {
            return AbstractC6044eO0.this.containsKey(obj);
        }

        @Override // o.AbstractC6044eO0, java.util.Map
        public int hashCode() {
            return AbstractC6044eO0.this.hashCode();
        }

        @Override // o.AbstractC6044eO0.c, o.AbstractC6044eO0
        public AbstractC9481sO0<K> j() {
            return AbstractC6044eO0.this.keySet();
        }

        @Override // o.AbstractC6044eO0
        public boolean n() {
            return AbstractC6044eO0.this.n();
        }

        @Override // o.AbstractC6044eO0
        public boolean o() {
            return AbstractC6044eO0.this.o();
        }

        @Override // java.util.Map
        public int size() {
            return AbstractC6044eO0.this.size();
        }

        public /* synthetic */ d(AbstractC6044eO0 abstractC6044eO0, a aVar) {
            this();
        }
    }

    /* renamed from: o.eO0$e */
    /* loaded from: classes3.dex */
    public static class e<K, V> implements Serializable {
        public static final boolean Z = true;
        private static final long serialVersionUID = 0;
        public final Object X;
        public final Object Y;

        public e(AbstractC6044eO0<K, V> abstractC6044eO0) {
            Object[] objArr = new Object[abstractC6044eO0.size()];
            Object[] objArr2 = new Object[abstractC6044eO0.size()];
            AbstractC6237fB2<Map.Entry<K, V>> it = abstractC6044eO0.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.X = objArr;
            this.Y = objArr2;
        }

        public final Object a() {
            Object[] objArr = (Object[]) this.X;
            Object[] objArr2 = (Object[]) this.Y;
            b<K, V> b = b(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                b.i((K) objArr[i], (V) objArr2[i]);
            }
            return b.d();
        }

        public b<K, V> b(int i) {
            return new b<>(i);
        }

        public final Object readResolve() {
            Object obj = this.X;
            if (!(obj instanceof AbstractC9481sO0)) {
                return a();
            }
            AbstractC9481sO0 abstractC9481sO0 = (AbstractC9481sO0) obj;
            b<K, V> b = b(abstractC9481sO0.size());
            AbstractC6237fB2 it = abstractC9481sO0.iterator();
            AbstractC6237fB2 it2 = ((TN0) this.Y).iterator();
            while (it.hasNext()) {
                b.i((K) it.next(), (V) it2.next());
            }
            return b.d();
        }
    }

    public static <K, V> AbstractC6044eO0<K, V> A(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        C5037aF.a(k4, v4);
        C5037aF.a(k5, v5);
        C5037aF.a(k6, v6);
        return QQ1.H(6, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6});
    }

    public static <K, V> AbstractC6044eO0<K, V> B(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        C5037aF.a(k4, v4);
        C5037aF.a(k5, v5);
        C5037aF.a(k6, v6);
        C5037aF.a(k7, v7);
        return QQ1.H(7, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7});
    }

    public static <K, V> AbstractC6044eO0<K, V> C(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        C5037aF.a(k4, v4);
        C5037aF.a(k5, v5);
        C5037aF.a(k6, v6);
        C5037aF.a(k7, v7);
        C5037aF.a(k8, v8);
        return QQ1.H(8, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8});
    }

    public static <K, V> AbstractC6044eO0<K, V> D(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        C5037aF.a(k4, v4);
        C5037aF.a(k5, v5);
        C5037aF.a(k6, v6);
        C5037aF.a(k7, v7);
        C5037aF.a(k8, v8);
        C5037aF.a(k9, v9);
        return QQ1.H(9, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9});
    }

    public static <K, V> AbstractC6044eO0<K, V> E(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        C5037aF.a(k4, v4);
        C5037aF.a(k5, v5);
        C5037aF.a(k6, v6);
        C5037aF.a(k7, v7);
        C5037aF.a(k8, v8);
        C5037aF.a(k9, v9);
        C5037aF.a(k10, v10);
        return QQ1.H(10, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10});
    }

    @SafeVarargs
    public static <K, V> AbstractC6044eO0<K, V> F(Map.Entry<? extends K, ? extends V>... entryArr) {
        return f(Arrays.asList(entryArr));
    }

    public static <K, V> b<K, V> b() {
        return new b<>();
    }

    @InterfaceC4238Sm
    public static <K, V> b<K, V> c(int i) {
        C5037aF.b(i, "expectedSize");
        return new b<>(i);
    }

    public static void d(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        throw e(str, obj, obj2);
    }

    public static IllegalArgumentException e(String str, Object obj, Object obj2) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + valueOf.length() + valueOf2.length());
        sb.append("Multiple entries with same ");
        sb.append(str);
        sb.append(": ");
        sb.append(valueOf);
        sb.append(" and ");
        sb.append(valueOf2);
        return new IllegalArgumentException(sb.toString());
    }

    @InterfaceC4238Sm
    public static <K, V> AbstractC6044eO0<K, V> f(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        b bVar = new b(i);
        bVar.k(iterable);
        return bVar.a();
    }

    public static <K, V> AbstractC6044eO0<K, V> g(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC6044eO0) && !(map instanceof SortedMap)) {
            AbstractC6044eO0<K, V> abstractC6044eO0 = (AbstractC6044eO0) map;
            if (!abstractC6044eO0.o()) {
                return abstractC6044eO0;
            }
        }
        return f(map.entrySet());
    }

    public static <K, V> Map.Entry<K, V> l(K k, V v) {
        C5037aF.a(k, v);
        return new AbstractMap.SimpleImmutableEntry(k, v);
    }

    public static <K, V> AbstractC6044eO0<K, V> u() {
        return (AbstractC6044eO0<K, V>) QQ1.i1;
    }

    public static <K, V> AbstractC6044eO0<K, V> v(K k, V v) {
        C5037aF.a(k, v);
        return QQ1.H(1, new Object[]{k, v});
    }

    public static <K, V> AbstractC6044eO0<K, V> w(K k, V v, K k2, V v2) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        return QQ1.H(2, new Object[]{k, v, k2, v2});
    }

    public static <K, V> AbstractC6044eO0<K, V> x(K k, V v, K k2, V v2, K k3, V v3) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        return QQ1.H(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    public static <K, V> AbstractC6044eO0<K, V> y(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        C5037aF.a(k4, v4);
        return QQ1.H(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    public static <K, V> AbstractC6044eO0<K, V> z(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        C5037aF.a(k4, v4);
        C5037aF.a(k5, v5);
        return QQ1.H(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    @Override // java.util.Map, o.InterfaceC4626Wm
    /* renamed from: G */
    public TN0<V> values() {
        TN0<V> tn0 = this.Z;
        if (tn0 == null) {
            TN0<V> k = k();
            this.Z = k;
            return k;
        }
        return tn0;
    }

    public C9724tO0<K, V> a() {
        if (isEmpty()) {
            return C9724tO0.W();
        }
        C9724tO0<K, V> c9724tO0 = this.Y0;
        if (c9724tO0 == null) {
            C9724tO0<K, V> c9724tO02 = new C9724tO0<>(new d(this, null), size(), null);
            this.Y0 = c9724tO02;
            return c9724tO02;
        }
        return c9724tO0;
    }

    @Override // java.util.Map
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@MB Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(@MB Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(@MB Object obj) {
        return C7935m81.w(this, obj);
    }

    @Override // java.util.Map
    @MB
    public abstract V get(@MB Object obj);

    @Override // java.util.Map
    @MB
    public final V getOrDefault(@MB Object obj, @MB V v) {
        V v2 = get(obj);
        if (v2 != null) {
            return v2;
        }
        return v;
    }

    @Override // java.util.Map
    public int hashCode() {
        return C10856y22.k(entrySet());
    }

    public abstract AbstractC9481sO0<Map.Entry<K, V>> i();

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public abstract AbstractC9481sO0<K> j();

    public abstract TN0<V> k();

    @Override // java.util.Map
    /* renamed from: m */
    public AbstractC9481sO0<Map.Entry<K, V>> entrySet() {
        AbstractC9481sO0<Map.Entry<K, V>> abstractC9481sO0 = this.X;
        if (abstractC9481sO0 == null) {
            AbstractC9481sO0<Map.Entry<K, V>> i = i();
            this.X = i;
            return i;
        }
        return abstractC9481sO0;
    }

    public boolean n() {
        return false;
    }

    public abstract boolean o();

    @Override // java.util.Map
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    public AbstractC6237fB2<K> r() {
        return new a(this, entrySet().iterator());
    }

    @Override // java.util.Map
    @InterfaceC6181ey
    @MB
    @Deprecated
    public final V remove(@MB Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* renamed from: t */
    public AbstractC9481sO0<K> keySet() {
        AbstractC9481sO0<K> abstractC9481sO0 = this.Y;
        if (abstractC9481sO0 == null) {
            AbstractC9481sO0<K> j = j();
            this.Y = j;
            return j;
        }
        return abstractC9481sO0;
    }

    public String toString() {
        return C7935m81.w0(this);
    }

    public Object writeReplace() {
        return new e(this);
    }
}
