package o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import o.TN0;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* renamed from: o.sO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9481sO0<E> extends TN0<E> implements Set<E> {
    public static final double Y0 = 0.7d;
    public static final int Z = 1073741824;
    public static final int Z0 = 751619276;
    @MB
    @SY0
    @InterfaceC7537kU1
    public transient AbstractC5317bO0<E> Y;

    /* renamed from: o.sO0$a */
    /* loaded from: classes3.dex */
    public static class a<E> extends TN0.a<E> {
        @MB
        @InterfaceC5299bJ2
        public Object[] e;
        public int f;

        public a() {
            super(4);
        }

        @Override // o.TN0.a
        @InterfaceC6181ey
        /* renamed from: j */
        public a<E> g(E e) {
            C10664xF1.E(e);
            if (this.e != null && AbstractC9481sO0.B(this.c) <= this.e.length) {
                n(e);
                return this;
            }
            this.e = null;
            super.a(e);
            return this;
        }

        @Override // o.TN0.a, o.TN0.b
        @InterfaceC6181ey
        /* renamed from: k */
        public a<E> b(E... eArr) {
            if (this.e != null) {
                for (E e : eArr) {
                    g(e);
                }
                return this;
            }
            super.b(eArr);
            return this;
        }

        @Override // o.TN0.a, o.TN0.b
        @InterfaceC6181ey
        /* renamed from: l */
        public a<E> c(Iterable<? extends E> iterable) {
            C10664xF1.E(iterable);
            if (this.e != null) {
                for (E e : iterable) {
                    g(e);
                }
                return this;
            }
            super.c(iterable);
            return this;
        }

        @Override // o.TN0.b
        @InterfaceC6181ey
        /* renamed from: m */
        public a<E> d(Iterator<? extends E> it) {
            C10664xF1.E(it);
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        public final void n(E e) {
            Objects.requireNonNull(this.e);
            int length = this.e.length - 1;
            int hashCode = e.hashCode();
            int c = EG0.c(hashCode);
            while (true) {
                int i = c & length;
                Object[] objArr = this.e;
                Object obj = objArr[i];
                if (obj == null) {
                    objArr[i] = e;
                    this.f += hashCode;
                    super.a(e);
                    return;
                } else if (obj.equals(e)) {
                    return;
                } else {
                    c = i + 1;
                }
            }
        }

        @Override // o.TN0.b
        /* renamed from: o */
        public AbstractC9481sO0<E> e() {
            AbstractC9481sO0<E> D;
            Object[] objArr;
            int i = this.c;
            if (i != 0) {
                if (i != 1) {
                    if (this.e == null || AbstractC9481sO0.B(i) != this.e.length) {
                        D = AbstractC9481sO0.D(this.c, this.b);
                        this.c = D.size();
                    } else {
                        if (AbstractC9481sO0.b0(this.c, this.b.length)) {
                            objArr = Arrays.copyOf(this.b, this.c);
                        } else {
                            objArr = this.b;
                        }
                        Object[] objArr2 = objArr;
                        int i2 = this.f;
                        Object[] objArr3 = this.e;
                        D = new SQ1<>(objArr2, i2, objArr3, objArr3.length - 1, this.c);
                    }
                    this.d = true;
                    this.e = null;
                    return D;
                }
                Object obj = this.b[0];
                Objects.requireNonNull(obj);
                return AbstractC9481sO0.Q(obj);
            }
            return AbstractC9481sO0.M();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC6181ey
        public a<E> p(a<E> aVar) {
            if (this.e != null) {
                for (int i = 0; i < aVar.c; i++) {
                    Object obj = aVar.b[i];
                    Objects.requireNonNull(obj);
                    g(obj);
                }
                return this;
            }
            h(aVar.b, aVar.c);
            return this;
        }

        public a(int i) {
            super(i);
            this.e = new Object[AbstractC9481sO0.B(i)];
        }
    }

    /* renamed from: o.sO0$b */
    /* loaded from: classes3.dex */
    public static class b implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] X;

        public b(Object[] objArr) {
            this.X = objArr;
        }

        public Object readResolve() {
            return AbstractC9481sO0.J(this.X);
        }
    }

    @InterfaceC5299bJ2
    public static int B(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        C10664xF1.e(z, "collection too large");
        return 1073741824;
    }

    public static <E> AbstractC9481sO0<E> D(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int B = B(i);
                Object[] objArr2 = new Object[B];
                int i2 = B - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object a2 = C5436bt1.a(objArr[i5], i5);
                    int hashCode = a2.hashCode();
                    int c = EG0.c(hashCode);
                    while (true) {
                        int i6 = c & i2;
                        Object obj = objArr2[i6];
                        if (obj == null) {
                            objArr[i4] = a2;
                            objArr2[i6] = a2;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (obj.equals(a2)) {
                            break;
                        } else {
                            c++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    return new B82(obj2);
                } else if (B(i4) < B / 2) {
                    return D(i4, objArr);
                } else {
                    if (b0(i4, objArr.length)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new SQ1(objArr, i3, objArr2, i2, i4);
                }
            }
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return Q(obj3);
        }
        return M();
    }

    public static <E> AbstractC9481sO0<E> F(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return G((Collection) iterable);
        }
        return H(iterable.iterator());
    }

    public static <E> AbstractC9481sO0<E> G(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC9481sO0) && !(collection instanceof SortedSet)) {
            AbstractC9481sO0<E> abstractC9481sO0 = (AbstractC9481sO0) collection;
            if (!abstractC9481sO0.j()) {
                return abstractC9481sO0;
            }
        }
        Object[] array = collection.toArray();
        return D(array.length, array);
    }

    public static <E> AbstractC9481sO0<E> H(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return M();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return Q(next);
        }
        return new a().g(next).d(it).e();
    }

    public static <E> AbstractC9481sO0<E> J(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length != 1) {
                return D(eArr.length, (Object[]) eArr.clone());
            }
            return Q(eArr[0]);
        }
        return M();
    }

    public static <E> AbstractC9481sO0<E> M() {
        return SQ1.g1;
    }

    public static <E> AbstractC9481sO0<E> Q(E e) {
        return new B82(e);
    }

    public static <E> AbstractC9481sO0<E> U(E e, E e2) {
        return D(2, e, e2);
    }

    public static <E> AbstractC9481sO0<E> V(E e, E e2, E e3) {
        return D(3, e, e2, e3);
    }

    public static <E> AbstractC9481sO0<E> X(E e, E e2, E e3, E e4) {
        return D(4, e, e2, e3, e4);
    }

    public static <E> AbstractC9481sO0<E> Y(E e, E e2, E e3, E e4, E e5) {
        return D(5, e, e2, e3, e4, e5);
    }

    @SafeVarargs
    public static <E> AbstractC9481sO0<E> a0(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        boolean z;
        if (eArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return D(length, objArr);
    }

    public static boolean b0(int i, int i2) {
        if (i < (i2 >> 1) + (i2 >> 2)) {
            return true;
        }
        return false;
    }

    public static <E> a<E> r() {
        return new a<>();
    }

    @InterfaceC4238Sm
    public static <E> a<E> w(int i) {
        C5037aF.b(i, "expectedSize");
        return new a<>(i);
    }

    public AbstractC5317bO0<E> K() {
        return AbstractC5317bO0.l(toArray());
    }

    public boolean L() {
        return false;
    }

    @Override // o.TN0
    public AbstractC5317bO0<E> d() {
        AbstractC5317bO0<E> abstractC5317bO0 = this.Y;
        if (abstractC5317bO0 == null) {
            AbstractC5317bO0<E> K = K();
            this.Y = K;
            return K;
        }
        return abstractC5317bO0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC9481sO0) && L() && ((AbstractC9481sO0) obj).L() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C10856y22.g(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C10856y22.k(this);
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public abstract AbstractC6237fB2<E> iterator();

    @Override // o.TN0
    public Object writeReplace() {
        return new b(toArray());
    }
}
