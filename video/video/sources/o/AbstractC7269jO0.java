package o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import o.InterfaceC2467Am1;
import o.TN0;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* renamed from: o.jO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7269jO0<E> extends AbstractC7512kO0<E> implements InterfaceC2467Am1<E> {
    @MB
    @SY0
    public transient AbstractC5317bO0<E> Y;
    @MB
    @SY0
    public transient AbstractC9481sO0<InterfaceC2467Am1.a<E>> Z;

    /* renamed from: o.jO0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC6237fB2<E> {
        public int X;
        @MB
        public E Y;
        public final /* synthetic */ Iterator Z;

        public a(AbstractC7269jO0 abstractC7269jO0, Iterator it) {
            this.Z = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.X <= 0 && !this.Z.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public E next() {
            if (this.X <= 0) {
                InterfaceC2467Am1.a aVar = (InterfaceC2467Am1.a) this.Z.next();
                this.Y = (E) aVar.a();
                this.X = aVar.getCount();
            }
            this.X--;
            E e = this.Y;
            Objects.requireNonNull(e);
            return e;
        }
    }

    /* renamed from: o.jO0$b */
    /* loaded from: classes3.dex */
    public static class b<E> extends TN0.b<E> {
        @MB
        public C5920dt1<E> b;
        public boolean c;
        public boolean d;

        public b() {
            this(4);
        }

        @MB
        public static <T> C5920dt1<T> n(Iterable<T> iterable) {
            if (iterable instanceof RQ1) {
                return (C5920dt1<E>) ((RQ1) iterable).Y0;
            }
            if (iterable instanceof G1) {
                return (C5920dt1<E>) ((G1) iterable).Z;
            }
            return null;
        }

        @Override // o.TN0.b
        @InterfaceC6181ey
        /* renamed from: g */
        public b<E> a(E e) {
            return k(e, 1);
        }

        @Override // o.TN0.b
        @InterfaceC6181ey
        /* renamed from: h */
        public b<E> b(E... eArr) {
            super.b(eArr);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.TN0.b
        @InterfaceC6181ey
        /* renamed from: i */
        public b<E> c(Iterable<? extends E> iterable) {
            Objects.requireNonNull(this.b);
            if (iterable instanceof InterfaceC2467Am1) {
                InterfaceC2467Am1 d = C2565Bm1.d(iterable);
                C5920dt1 n = n(d);
                if (n != null) {
                    C5920dt1<E> c5920dt1 = this.b;
                    c5920dt1.e(Math.max(c5920dt1.D(), n.D()));
                    for (int f = n.f(); f >= 0; f = n.t(f)) {
                        k(n.j(f), n.l(f));
                    }
                } else {
                    Set<InterfaceC2467Am1.a<E>> entrySet = d.entrySet();
                    C5920dt1<E> c5920dt12 = this.b;
                    c5920dt12.e(Math.max(c5920dt12.D(), entrySet.size()));
                    for (InterfaceC2467Am1.a<E> aVar : d.entrySet()) {
                        k(aVar.a(), aVar.getCount());
                    }
                }
                return this;
            }
            super.c(iterable);
            return this;
        }

        @Override // o.TN0.b
        @InterfaceC6181ey
        /* renamed from: j */
        public b<E> d(Iterator<? extends E> it) {
            super.d(it);
            return this;
        }

        @InterfaceC6181ey
        public b<E> k(E e, int i) {
            Objects.requireNonNull(this.b);
            if (i == 0) {
                return this;
            }
            if (this.c) {
                this.b = new C5920dt1<>((C5920dt1<? extends E>) this.b);
                this.d = false;
            }
            this.c = false;
            C10664xF1.E(e);
            C5920dt1<E> c5920dt1 = this.b;
            c5920dt1.v(e, i + c5920dt1.g(e));
            return this;
        }

        @Override // o.TN0.b
        /* renamed from: l */
        public AbstractC7269jO0<E> e() {
            Objects.requireNonNull(this.b);
            if (this.b.D() == 0) {
                return AbstractC7269jO0.K();
            }
            if (this.d) {
                this.b = new C5920dt1<>((C5920dt1<? extends E>) this.b);
                this.d = false;
            }
            this.c = true;
            return new RQ1(this.b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6181ey
        public b<E> m(E e, int i) {
            Objects.requireNonNull(this.b);
            if (i == 0 && !this.d) {
                this.b = new C6163et1(this.b);
                this.d = true;
            } else if (this.c) {
                this.b = new C5920dt1<>((C5920dt1<? extends E>) this.b);
                this.d = false;
            }
            this.c = false;
            C10664xF1.E(e);
            if (i == 0) {
                this.b.w(e);
                return this;
            }
            this.b.v(C10664xF1.E(e), i);
            return this;
        }

        public b(int i) {
            this.c = false;
            this.d = false;
            this.b = C5920dt1.d(i);
        }

        public b(boolean z) {
            this.c = false;
            this.d = false;
            this.b = null;
        }
    }

    /* renamed from: o.jO0$c */
    /* loaded from: classes3.dex */
    public final class c extends AbstractC9242rP0<InterfaceC2467Am1.a<E>> {
        private static final long serialVersionUID = 0;

        public c() {
        }

        @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            if (obj instanceof InterfaceC2467Am1.a) {
                InterfaceC2467Am1.a aVar = (InterfaceC2467Am1.a) obj;
                if (aVar.getCount() > 0 && AbstractC7269jO0.this.w4(aVar.a()) == aVar.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // o.AbstractC9242rP0
        /* renamed from: d0 */
        public InterfaceC2467Am1.a<E> get(int i) {
            return AbstractC7269jO0.this.J(i);
        }

        @Override // o.AbstractC9481sO0, java.util.Collection, java.util.Set
        public int hashCode() {
            return AbstractC7269jO0.this.hashCode();
        }

        @Override // o.TN0
        public boolean j() {
            return AbstractC7269jO0.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC7269jO0.this.n().size();
        }

        @Override // o.AbstractC9481sO0, o.TN0
        @InterfaceC11149zF0
        public Object writeReplace() {
            return new d(AbstractC7269jO0.this);
        }

        public /* synthetic */ c(AbstractC7269jO0 abstractC7269jO0, a aVar) {
            this();
        }
    }

    @InterfaceC11149zF0
    /* renamed from: o.jO0$d */
    /* loaded from: classes3.dex */
    public static class d<E> implements Serializable {
        public final AbstractC7269jO0<E> X;

        public d(AbstractC7269jO0<E> abstractC7269jO0) {
            this.X = abstractC7269jO0;
        }

        public Object readResolve() {
            return this.X.entrySet();
        }
    }

    public static <E> AbstractC7269jO0<E> B(Iterator<? extends E> it) {
        return new b().d(it).e();
    }

    public static <E> AbstractC7269jO0<E> D(E[] eArr) {
        return p(eArr);
    }

    private AbstractC9481sO0<InterfaceC2467Am1.a<E>> F() {
        if (isEmpty()) {
            return AbstractC9481sO0.M();
        }
        return new c(this, null);
    }

    public static <E> AbstractC7269jO0<E> K() {
        return RQ1.b1;
    }

    public static <E> AbstractC7269jO0<E> L(E e) {
        return p(e);
    }

    public static <E> AbstractC7269jO0<E> M(E e, E e2) {
        return p(e, e2);
    }

    public static <E> AbstractC7269jO0<E> Q(E e, E e2, E e3) {
        return p(e, e2, e3);
    }

    public static <E> AbstractC7269jO0<E> U(E e, E e2, E e3, E e4) {
        return p(e, e2, e3, e4);
    }

    public static <E> AbstractC7269jO0<E> V(E e, E e2, E e3, E e4, E e5) {
        return p(e, e2, e3, e4, e5);
    }

    public static <E> AbstractC7269jO0<E> X(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        return new b().a(e).a(e2).a(e3).a(e4).a(e5).a(e6).b(eArr).e();
    }

    public static <E> b<E> l() {
        return new b<>();
    }

    public static <E> AbstractC7269jO0<E> p(E... eArr) {
        return new b().b(eArr).e();
    }

    public static <E> AbstractC7269jO0<E> r(Collection<? extends InterfaceC2467Am1.a<? extends E>> collection) {
        b bVar = new b(collection.size());
        for (InterfaceC2467Am1.a<? extends E> aVar : collection) {
            bVar.k(aVar.a(), aVar.getCount());
        }
        return bVar.e();
    }

    public static <E> AbstractC7269jO0<E> w(Iterable<? extends E> iterable) {
        if (iterable instanceof AbstractC7269jO0) {
            AbstractC7269jO0<E> abstractC7269jO0 = (AbstractC7269jO0) iterable;
            if (!abstractC7269jO0.j()) {
                return abstractC7269jO0;
            }
        }
        b bVar = new b(C2565Bm1.l(iterable));
        bVar.c(iterable);
        return bVar.e();
    }

    @Override // o.InterfaceC2467Am1
    /* renamed from: G */
    public abstract AbstractC9481sO0<E> n();

    @Override // o.InterfaceC2467Am1
    /* renamed from: H */
    public AbstractC9481sO0<InterfaceC2467Am1.a<E>> entrySet() {
        AbstractC9481sO0<InterfaceC2467Am1.a<E>> abstractC9481sO0 = this.Z;
        if (abstractC9481sO0 == null) {
            AbstractC9481sO0<InterfaceC2467Am1.a<E>> F = F();
            this.Z = F;
            return F;
        }
        return abstractC9481sO0;
    }

    public abstract InterfaceC2467Am1.a<E> J(int i);

    @Override // o.InterfaceC2467Am1
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final int R(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC2467Am1
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean Y3(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        if (w4(obj) > 0) {
            return true;
        }
        return false;
    }

    @Override // o.TN0
    public AbstractC5317bO0<E> d() {
        AbstractC5317bO0<E> abstractC5317bO0 = this.Y;
        if (abstractC5317bO0 == null) {
            AbstractC5317bO0<E> d2 = super.d();
            this.Y = d2;
            return d2;
        }
        return abstractC5317bO0;
    }

    @Override // o.TN0
    @InterfaceC11149zF0
    public int e(Object[] objArr, int i) {
        AbstractC6237fB2<InterfaceC2467Am1.a<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC2467Am1.a<E> next = it.next();
            Arrays.fill(objArr, i, next.getCount() + i, next.a());
            i += next.getCount();
        }
        return i;
    }

    @Override // java.util.Collection, o.InterfaceC2467Am1
    public boolean equals(@MB Object obj) {
        return C2565Bm1.i(this, obj);
    }

    @Override // java.util.Collection, o.InterfaceC2467Am1
    public int hashCode() {
        return C10856y22.k(entrySet());
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public AbstractC6237fB2<E> iterator() {
        return new a(this, entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, o.InterfaceC2467Am1
    public String toString() {
        return entrySet().toString();
    }

    @Override // o.InterfaceC2467Am1
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final int v(@MB Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o.TN0
    @InterfaceC11149zF0
    public abstract Object writeReplace();

    @Override // o.InterfaceC2467Am1
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final int x(E e, int i) {
        throw new UnsupportedOperationException();
    }
}
