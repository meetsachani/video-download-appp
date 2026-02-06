package o;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.AbstractC5317bO0;
import o.C3939Pk2;
import o.InterfaceC3744Nk2;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class BO0<R, C, V> extends AbstractC10614x3<R, C, V> implements Serializable {

    @L40
    /* loaded from: classes3.dex */
    public static final class a<R, C, V> {
        public final List<InterfaceC3744Nk2.a<R, C, V>> a = C10608x11.q();
        @MB
        public Comparator<? super R> b;
        @MB
        public Comparator<? super C> c;

        public BO0<R, C, V> a() {
            return b();
        }

        public BO0<R, C, V> b() {
            int size = this.a.size();
            if (size != 0) {
                if (size != 1) {
                    return WQ1.z(this.a, this.b, this.c);
                }
                return new C82((InterfaceC3744Nk2.a) C5098aU0.z(this.a));
            }
            return BO0.q();
        }

        @InterfaceC6181ey
        public a<R, C, V> c(a<R, C, V> aVar) {
            this.a.addAll(aVar.a);
            return this;
        }

        @InterfaceC6181ey
        public a<R, C, V> d(Comparator<? super C> comparator) {
            this.c = (Comparator) C10664xF1.F(comparator, "columnComparator");
            return this;
        }

        @InterfaceC6181ey
        public a<R, C, V> e(Comparator<? super R> comparator) {
            this.b = (Comparator) C10664xF1.F(comparator, "rowComparator");
            return this;
        }

        @InterfaceC6181ey
        public a<R, C, V> f(R r, C c, V v) {
            this.a.add(BO0.g(r, c, v));
            return this;
        }

        @InterfaceC6181ey
        public a<R, C, V> g(InterfaceC3744Nk2.a<? extends R, ? extends C, ? extends V> aVar) {
            if (aVar instanceof C3939Pk2.c) {
                C10664xF1.F(aVar.a(), "row");
                C10664xF1.F(aVar.b(), "column");
                C10664xF1.F(aVar.getValue(), "value");
                this.a.add(aVar);
                return this;
            }
            f(aVar.a(), aVar.b(), aVar.getValue());
            return this;
        }

        @InterfaceC6181ey
        public a<R, C, V> h(InterfaceC3744Nk2<? extends R, ? extends C, ? extends V> interfaceC3744Nk2) {
            for (InterfaceC3744Nk2.a<? extends R, ? extends C, ? extends V> aVar : interfaceC3744Nk2.o3()) {
                g(aVar);
            }
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] X;
        public final Object[] Y;
        public final int[] Y0;
        public final Object[] Z;
        public final int[] Z0;

        public b(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.X = objArr;
            this.Y = objArr2;
            this.Z = objArr3;
            this.Y0 = iArr;
            this.Z0 = iArr2;
        }

        public static b a(BO0<?, ?, ?> bo0, int[] iArr, int[] iArr2) {
            return new b(bo0.F().toArray(), bo0.L4().toArray(), bo0.values().toArray(), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.Z;
            if (objArr.length == 0) {
                return BO0.q();
            }
            int i = 0;
            if (objArr.length == 1) {
                return BO0.r(this.X[0], this.Y[0], objArr[0]);
            }
            AbstractC5317bO0.a aVar = new AbstractC5317bO0.a(objArr.length);
            while (true) {
                Object[] objArr2 = this.Z;
                if (i < objArr2.length) {
                    aVar.g(BO0.g(this.X[this.Y0[i]], this.Y[this.Z0[i]], objArr2[i]));
                    i++;
                } else {
                    return WQ1.B(aVar.e(), AbstractC9481sO0.J(this.X), AbstractC9481sO0.J(this.Y));
                }
            }
        }
    }

    public static <R, C, V> a<R, C, V> e() {
        return new a<>();
    }

    public static <R, C, V> InterfaceC3744Nk2.a<R, C, V> g(R r, C c, V v) {
        return C3939Pk2.c(C10664xF1.F(r, "rowKey"), C10664xF1.F(c, "columnKey"), C10664xF1.F(v, "value"));
    }

    public static <R, C, V> BO0<R, C, V> l(Iterable<? extends InterfaceC3744Nk2.a<? extends R, ? extends C, ? extends V>> iterable) {
        a e = e();
        for (InterfaceC3744Nk2.a<? extends R, ? extends C, ? extends V> aVar : iterable) {
            e.g(aVar);
        }
        return e.a();
    }

    public static <R, C, V> BO0<R, C, V> m(InterfaceC3744Nk2<? extends R, ? extends C, ? extends V> interfaceC3744Nk2) {
        if (interfaceC3744Nk2 instanceof BO0) {
            return (BO0) interfaceC3744Nk2;
        }
        return l(interfaceC3744Nk2.o3());
    }

    public static <R, C, V> BO0<R, C, V> q() {
        return (BO0<R, C, V>) C2714Da2.b1;
    }

    public static <R, C, V> BO0<R, C, V> r(R r, C c, V v) {
        return new C82(r, c, v);
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void D3(InterfaceC3744Nk2<? extends R, ? extends C, ? extends V> interfaceC3744Nk2) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean M4(@MB Object obj) {
        return super.M4(obj);
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public boolean containsValue(@MB Object obj) {
        return values().contains(obj);
    }

    @Override // o.AbstractC10614x3
    public final Iterator<V> d() {
        throw new AssertionError("should never be called");
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean equals(@MB Object obj) {
        return super.equals(obj);
    }

    @Override // o.AbstractC10614x3
    /* renamed from: f */
    public final AbstractC6237fB2<InterfaceC3744Nk2.a<R, C, V>> a() {
        throw new AssertionError("should never be called");
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    /* renamed from: h */
    public AbstractC9481sO0<InterfaceC3744Nk2.a<R, C, V>> o3() {
        return (AbstractC9481sO0) super.o3();
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.InterfaceC3744Nk2
    /* renamed from: i */
    public AbstractC6044eO0<R, V> d3(C c) {
        C10664xF1.F(c, "columnKey");
        return (AbstractC6044eO0) C3743Nk1.a((AbstractC6044eO0) i2().get(c), AbstractC6044eO0.u());
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public boolean i5(@MB Object obj, @MB Object obj2) {
        if (r0(obj, obj2) != null) {
            return true;
        }
        return false;
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    /* renamed from: j */
    public AbstractC9481sO0<C> L4() {
        return i2().keySet();
    }

    @Override // o.InterfaceC3744Nk2
    /* renamed from: k */
    public abstract AbstractC6044eO0<C, Map<R, V>> i2();

    @Override // o.AbstractC10614x3
    /* renamed from: n */
    public abstract AbstractC9481sO0<InterfaceC3744Nk2.a<R, C, V>> b();

    public abstract b o();

    @Override // o.AbstractC10614x3
    /* renamed from: p */
    public abstract TN0<V> c();

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public final V q3(R r, C c, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    @MB
    public /* bridge */ /* synthetic */ Object r0(@MB Object obj, @MB Object obj2) {
        return super.r0(obj, obj2);
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public final V remove(@MB Object obj, @MB Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC3744Nk2
    /* renamed from: s */
    public AbstractC6044eO0<C, V> x5(R r) {
        C10664xF1.F(r, "rowKey");
        return (AbstractC6044eO0) C3743Nk1.a((AbstractC6044eO0) H().get(r), AbstractC6044eO0.u());
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    /* renamed from: t */
    public AbstractC9481sO0<R> F() {
        return H().keySet();
    }

    @Override // o.AbstractC10614x3
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // o.InterfaceC3744Nk2
    /* renamed from: u */
    public abstract AbstractC6044eO0<R, Map<C, V>> H();

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    /* renamed from: v */
    public TN0<V> values() {
        return (TN0) super.values();
    }

    public final Object writeReplace() {
        return o();
    }

    @Override // o.AbstractC10614x3, o.InterfaceC3744Nk2
    public /* bridge */ /* synthetic */ boolean y0(@MB Object obj) {
        return super.y0(obj);
    }
}
