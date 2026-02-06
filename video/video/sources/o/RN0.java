package o;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import o.AbstractC6044eO0;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class RN0<K, V> extends AbstractC6044eO0<K, V> implements InterfaceC4626Wm<K, V> {

    /* loaded from: classes3.dex */
    public static final class a<K, V> extends AbstractC6044eO0.b<K, V> {
        public a() {
        }

        @Override // o.AbstractC6044eO0.b
        /* renamed from: n */
        public RN0<K, V> a() {
            return d();
        }

        @Override // o.AbstractC6044eO0.b
        @J40
        @Deprecated
        /* renamed from: o */
        public RN0<K, V> c() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // o.AbstractC6044eO0.b
        /* renamed from: p */
        public RN0<K, V> d() {
            int i = this.c;
            if (i == 0) {
                return RN0.O();
            }
            if (this.a != null) {
                if (this.d) {
                    this.b = Arrays.copyOf(this.b, i * 2);
                }
                AbstractC6044eO0.b.m(this.b, this.c, this.a);
            }
            this.d = true;
            return new OQ1(this.b, this.c);
        }

        @Override // o.AbstractC6044eO0.b
        @InterfaceC6181ey
        /* renamed from: q */
        public a<K, V> e(AbstractC6044eO0.b<K, V> bVar) {
            super.e(bVar);
            return this;
        }

        @Override // o.AbstractC6044eO0.b
        @InterfaceC6181ey
        @InterfaceC4238Sm
        /* renamed from: r */
        public a<K, V> h(Comparator<? super V> comparator) {
            super.h(comparator);
            return this;
        }

        @Override // o.AbstractC6044eO0.b
        @InterfaceC6181ey
        /* renamed from: s */
        public a<K, V> i(K k, V v) {
            super.i(k, v);
            return this;
        }

        @Override // o.AbstractC6044eO0.b
        @InterfaceC6181ey
        /* renamed from: t */
        public a<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            super.j(entry);
            return this;
        }

        @Override // o.AbstractC6044eO0.b
        @InterfaceC6181ey
        @InterfaceC4238Sm
        /* renamed from: u */
        public a<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.k(iterable);
            return this;
        }

        @Override // o.AbstractC6044eO0.b
        @InterfaceC6181ey
        /* renamed from: v */
        public a<K, V> l(Map<? extends K, ? extends V> map) {
            super.l(map);
            return this;
        }

        public a(int i) {
            super(i);
        }
    }

    /* loaded from: classes3.dex */
    public static class b<K, V> extends AbstractC6044eO0.e<K, V> {
        private static final long serialVersionUID = 0;

        public b(RN0<K, V> rn0) {
            super(rn0);
        }

        @Override // o.AbstractC6044eO0.e
        /* renamed from: c */
        public a<K, V> b(int i) {
            return new a<>(i);
        }
    }

    public static <K, V> a<K, V> H() {
        return new a<>();
    }

    @InterfaceC4238Sm
    public static <K, V> a<K, V> I(int i) {
        C5037aF.b(i, "expectedSize");
        return new a<>(i);
    }

    @InterfaceC4238Sm
    public static <K, V> RN0<K, V> J(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        return new a(i).k(iterable).a();
    }

    public static <K, V> RN0<K, V> K(Map<? extends K, ? extends V> map) {
        if (map instanceof RN0) {
            RN0<K, V> rn0 = (RN0) map;
            if (!rn0.o()) {
                return rn0;
            }
        }
        return J(map.entrySet());
    }

    public static <K, V> RN0<K, V> O() {
        return OQ1.f1;
    }

    public static <K, V> RN0<K, V> P(K k, V v) {
        C5037aF.a(k, v);
        return new OQ1(new Object[]{k, v}, 1);
    }

    public static <K, V> RN0<K, V> Q(K k, V v, K k2, V v2) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        return new OQ1(new Object[]{k, v, k2, v2}, 2);
    }

    public static <K, V> RN0<K, V> R(K k, V v, K k2, V v2, K k3, V v3) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        return new OQ1(new Object[]{k, v, k2, v2, k3, v3}, 3);
    }

    public static <K, V> RN0<K, V> S(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        C5037aF.a(k4, v4);
        return new OQ1(new Object[]{k, v, k2, v2, k3, v3, k4, v4}, 4);
    }

    public static <K, V> RN0<K, V> T(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        C5037aF.a(k4, v4);
        C5037aF.a(k5, v5);
        return new OQ1(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5}, 5);
    }

    public static <K, V> RN0<K, V> W(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        C5037aF.a(k4, v4);
        C5037aF.a(k5, v5);
        C5037aF.a(k6, v6);
        return new OQ1(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6}, 6);
    }

    public static <K, V> RN0<K, V> X(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        C5037aF.a(k4, v4);
        C5037aF.a(k5, v5);
        C5037aF.a(k6, v6);
        C5037aF.a(k7, v7);
        return new OQ1(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7}, 7);
    }

    public static <K, V> RN0<K, V> Y(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        C5037aF.a(k4, v4);
        C5037aF.a(k5, v5);
        C5037aF.a(k6, v6);
        C5037aF.a(k7, v7);
        C5037aF.a(k8, v8);
        return new OQ1(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8}, 8);
    }

    public static <K, V> RN0<K, V> Z(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9) {
        C5037aF.a(k, v);
        C5037aF.a(k2, v2);
        C5037aF.a(k3, v3);
        C5037aF.a(k4, v4);
        C5037aF.a(k5, v5);
        C5037aF.a(k6, v6);
        C5037aF.a(k7, v7);
        C5037aF.a(k8, v8);
        C5037aF.a(k9, v9);
        return new OQ1(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9}, 9);
    }

    public static <K, V> RN0<K, V> a0(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k8, V v8, K k9, V v9, K k10, V v10) {
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
        return new OQ1(new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5, k6, v6, k7, v7, k8, v8, k9, v9, k10, v10}, 10);
    }

    @SafeVarargs
    public static <K, V> RN0<K, V> c0(Map.Entry<? extends K, ? extends V>... entryArr) {
        return J(Arrays.asList(entryArr));
    }

    @Override // o.InterfaceC4626Wm
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public final V J3(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC6044eO0
    /* renamed from: L */
    public final AbstractC9481sO0<V> k() {
        throw new AssertionError("should never be called");
    }

    @Override // o.InterfaceC4626Wm
    /* renamed from: N */
    public abstract RN0<V, K> m5();

    @Override // o.AbstractC6044eO0, java.util.Map, o.InterfaceC4626Wm
    /* renamed from: d0 */
    public AbstractC9481sO0<V> values() {
        return m5().keySet();
    }

    @Override // o.AbstractC6044eO0
    public Object writeReplace() {
        return new b(this);
    }
}
