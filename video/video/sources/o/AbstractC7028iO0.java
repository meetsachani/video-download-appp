package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.C9634t12;
import o.InterfaceC2467Am1;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.iO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7028iO0<K, V> extends AbstractC7354jl<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient AbstractC6044eO0<K, ? extends TN0<V>> a1;
    public final transient int b1;

    /* renamed from: o.iO0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC6237fB2<Map.Entry<K, V>> {
        public final Iterator<? extends Map.Entry<K, ? extends TN0<V>>> X;
        @MB
        public K Y = null;
        public Iterator<V> Z = C7052iU0.u();

        public a() {
            this.X = AbstractC7028iO0.this.a1.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (!this.Z.hasNext()) {
                Map.Entry<K, ? extends TN0<V>> next = this.X.next();
                this.Y = next.getKey();
                this.Z = next.getValue().iterator();
            }
            K k = this.Y;
            Objects.requireNonNull(k);
            return C7935m81.O(k, this.Z.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.Z.hasNext() && !this.X.hasNext()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: o.iO0$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractC6237fB2<V> {
        public Iterator<? extends TN0<V>> X;
        public Iterator<V> Y = C7052iU0.u();

        public b() {
            this.X = AbstractC7028iO0.this.a1.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.Y.hasNext() && !this.X.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.Y.hasNext()) {
                this.Y = this.X.next().iterator();
            }
            return this.Y.next();
        }
    }

    @L40
    /* renamed from: o.iO0$c */
    /* loaded from: classes3.dex */
    public static class c<K, V> {
        public final Map<K, Collection<V>> a = C7469kD1.i();
        @MB
        public Comparator<? super K> b;
        @MB
        public Comparator<? super V> c;

        public AbstractC7028iO0<K, V> a() {
            Collection entrySet = this.a.entrySet();
            Comparator<? super K> comparator = this.b;
            if (comparator != null) {
                entrySet = AbstractC10587ww1.h(comparator).C().l(entrySet);
            }
            return C5559cO0.N(entrySet, this.c);
        }

        @InterfaceC6181ey
        public c<K, V> b(c<K, V> cVar) {
            for (Map.Entry<K, Collection<V>> entry : cVar.a.entrySet()) {
                i(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Collection<V> c() {
            return new ArrayList();
        }

        @InterfaceC6181ey
        public c<K, V> d(Comparator<? super K> comparator) {
            this.b = (Comparator) C10664xF1.E(comparator);
            return this;
        }

        @InterfaceC6181ey
        public c<K, V> e(Comparator<? super V> comparator) {
            this.c = (Comparator) C10664xF1.E(comparator);
            return this;
        }

        @InterfaceC6181ey
        public c<K, V> f(K k, V v) {
            C5037aF.a(k, v);
            Collection<V> collection = this.a.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.a;
                Collection<V> c = c();
                map.put(k, c);
                collection = c;
            }
            collection.add(v);
            return this;
        }

        @InterfaceC6181ey
        public c<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        @InterfaceC6181ey
        @InterfaceC4238Sm
        public c<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                g(entry);
            }
            return this;
        }

        @InterfaceC6181ey
        public c<K, V> i(K k, Iterable<? extends V> iterable) {
            String str;
            if (k == null) {
                String valueOf = String.valueOf(C5098aU0.T(iterable));
                if (valueOf.length() != 0) {
                    str = "null key in entry: null=".concat(valueOf);
                } else {
                    str = new String("null key in entry: null=");
                }
                throw new NullPointerException(str);
            }
            Collection<V> collection = this.a.get(k);
            if (collection != null) {
                for (V v : iterable) {
                    C5037aF.a(k, v);
                    collection.add(v);
                }
            } else {
                Iterator<? extends V> it = iterable.iterator();
                if (it.hasNext()) {
                    Collection<V> c = c();
                    while (it.hasNext()) {
                        V next = it.next();
                        C5037aF.a(k, next);
                        c.add(next);
                    }
                    this.a.put(k, c);
                    return this;
                }
            }
            return this;
        }

        @InterfaceC6181ey
        public c<K, V> j(K k, V... vArr) {
            return i(k, Arrays.asList(vArr));
        }

        @InterfaceC6181ey
        public c<K, V> k(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : interfaceC10058um1.l().entrySet()) {
                i(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    /* renamed from: o.iO0$d */
    /* loaded from: classes3.dex */
    public static class d<K, V> extends TN0<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        @GJ2
        public final AbstractC7028iO0<K, V> Y;

        public d(AbstractC7028iO0<K, V> abstractC7028iO0) {
            this.Y = abstractC7028iO0;
        }

        @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.Y.q5(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // o.TN0
        public boolean j() {
            return this.Y.w();
        }

        @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: k */
        public AbstractC6237fB2<Map.Entry<K, V>> iterator() {
            return this.Y.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.Y.size();
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.iO0$e */
    /* loaded from: classes3.dex */
    public static class e {
        public static final C9634t12.b<AbstractC7028iO0> a = C9634t12.a(AbstractC7028iO0.class, "map");
        public static final C9634t12.b<AbstractC7028iO0> b = C9634t12.a(AbstractC7028iO0.class, "size");
    }

    /* renamed from: o.iO0$f */
    /* loaded from: classes3.dex */
    public class f extends AbstractC7269jO0<K> {
        public f() {
        }

        @Override // o.AbstractC7269jO0, o.InterfaceC2467Am1
        /* renamed from: G */
        public AbstractC9481sO0<K> n() {
            return AbstractC7028iO0.this.keySet();
        }

        @Override // o.AbstractC7269jO0
        public InterfaceC2467Am1.a<K> J(int i) {
            Map.Entry<K, ? extends TN0<V>> entry = AbstractC7028iO0.this.a1.entrySet().d().get(i);
            return C2565Bm1.k(entry.getKey(), entry.getValue().size());
        }

        @Override // o.AbstractC7269jO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return AbstractC7028iO0.this.containsKey(obj);
        }

        @Override // o.TN0
        public boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, o.InterfaceC2467Am1
        public int size() {
            return AbstractC7028iO0.this.size();
        }

        @Override // o.InterfaceC2467Am1
        public int w4(@MB Object obj) {
            TN0<V> tn0 = AbstractC7028iO0.this.a1.get(obj);
            if (tn0 == null) {
                return 0;
            }
            return tn0.size();
        }

        @Override // o.AbstractC7269jO0, o.TN0
        @InterfaceC11149zF0
        public Object writeReplace() {
            return new g(AbstractC7028iO0.this);
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.iO0$g */
    /* loaded from: classes3.dex */
    public static final class g implements Serializable {
        public final AbstractC7028iO0<?, ?> X;

        public g(AbstractC7028iO0<?, ?> abstractC7028iO0) {
            this.X = abstractC7028iO0;
        }

        public Object readResolve() {
            return this.X.Q();
        }
    }

    /* renamed from: o.iO0$h */
    /* loaded from: classes3.dex */
    public static final class h<K, V> extends TN0<V> {
        private static final long serialVersionUID = 0;
        @GJ2
        public final transient AbstractC7028iO0<K, V> Y;

        public h(AbstractC7028iO0<K, V> abstractC7028iO0) {
            this.Y = abstractC7028iO0;
        }

        @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return this.Y.containsValue(obj);
        }

        @Override // o.TN0
        @InterfaceC11149zF0
        public int e(Object[] objArr, int i) {
            AbstractC6237fB2<? extends TN0<V>> it = this.Y.a1.values().iterator();
            while (it.hasNext()) {
                i = it.next().e(objArr, i);
            }
            return i;
        }

        @Override // o.TN0
        public boolean j() {
            return true;
        }

        @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: k */
        public AbstractC6237fB2<V> iterator() {
            return this.Y.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.Y.size();
        }
    }

    public AbstractC7028iO0(AbstractC6044eO0<K, ? extends TN0<V>> abstractC6044eO0, int i) {
        this.a1 = abstractC6044eO0;
        this.b1 = i;
    }

    public static <K, V> AbstractC7028iO0<K, V> A(K k, V v) {
        return C5559cO0.T(k, v);
    }

    public static <K, V> AbstractC7028iO0<K, V> B(K k, V v, K k2, V v2) {
        return C5559cO0.V(k, v, k2, v2);
    }

    public static <K, V> AbstractC7028iO0<K, V> C(K k, V v, K k2, V v2, K k3, V v3) {
        return C5559cO0.W(k, v, k2, v2, k3, v3);
    }

    public static <K, V> AbstractC7028iO0<K, V> D(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return C5559cO0.X(k, v, k2, v2, k3, v3, k4, v4);
    }

    public static <K, V> AbstractC7028iO0<K, V> E(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return C5559cO0.Y(k, v, k2, v2, k3, v3, k4, v4, k5, v5);
    }

    public static <K, V> c<K, V> k() {
        return new c<>();
    }

    @InterfaceC4238Sm
    public static <K, V> AbstractC7028iO0<K, V> m(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return C5559cO0.L(iterable);
    }

    public static <K, V> AbstractC7028iO0<K, V> n(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        if (interfaceC10058um1 instanceof AbstractC7028iO0) {
            AbstractC7028iO0<K, V> abstractC7028iO0 = (AbstractC7028iO0) interfaceC10058um1;
            if (!abstractC7028iO0.w()) {
                return abstractC7028iO0;
            }
        }
        return C5559cO0.M(interfaceC10058um1);
    }

    public static <K, V> AbstractC7028iO0<K, V> z() {
        return C5559cO0.S();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean B0(InterfaceC10058um1<? extends K, ? extends V> interfaceC10058um1) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    /* renamed from: F */
    public TN0<V> i(@MB Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    /* renamed from: H */
    public TN0<V> j(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6939i2
    /* renamed from: I */
    public AbstractC6237fB2<V> g() {
        return new b();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    /* renamed from: J */
    public TN0<V> values() {
        return (TN0) super.values();
    }

    @Override // o.AbstractC6939i2
    public Map<K, Collection<V>> a() {
        throw new AssertionError("should never be called");
    }

    @Override // o.AbstractC6939i2
    public Set<K> c() {
        throw new AssertionError("unreachable");
    }

    @Override // o.InterfaceC10058um1
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC10058um1
    public boolean containsKey(@MB Object obj) {
        return this.a1.containsKey(obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public boolean containsValue(@MB Object obj) {
        if (obj != null && super.containsValue(obj)) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean e0(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    public /* bridge */ /* synthetic */ boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    /* renamed from: h */
    public AbstractC6044eO0<K, Collection<V>> l() {
        return (AbstractC6044eO0<K, ? extends TN0<V>>) this.a1;
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // o.AbstractC6939i2
    /* renamed from: o */
    public TN0<Map.Entry<K, V>> b() {
        return new d(this);
    }

    @Override // o.AbstractC6939i2
    /* renamed from: p */
    public AbstractC7269jO0<K> d() {
        return new f();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6939i2
    /* renamed from: q */
    public TN0<V> e() {
        return new h(this);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    public /* bridge */ /* synthetic */ boolean q5(@MB Object obj, @MB Object obj2) {
        return super.q5(obj, obj2);
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(@MB Object obj, @MB Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1, o.InterfaceC8660p22
    /* renamed from: s */
    public TN0<Map.Entry<K, V>> r() {
        return (TN0) super.r();
    }

    @Override // o.InterfaceC10058um1
    public int size() {
        return this.b1;
    }

    @Override // o.AbstractC6939i2
    /* renamed from: t */
    public AbstractC6237fB2<Map.Entry<K, V>> f() {
        return new a();
    }

    @Override // o.AbstractC6939i2
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // o.InterfaceC10058um1, o.InterfaceC8660p22
    /* renamed from: u */
    public abstract TN0<V> get(K k);

    public abstract AbstractC7028iO0<V, K> v();

    public boolean w() {
        return this.a1.o();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    /* renamed from: x */
    public AbstractC9481sO0<K> keySet() {
        return this.a1.keySet();
    }

    @Override // o.AbstractC6939i2, o.InterfaceC10058um1
    /* renamed from: y */
    public AbstractC7269jO0<K> Q() {
        return (AbstractC7269jO0) super.Q();
    }
}
