package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import o.TN0;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* renamed from: o.bO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5317bO0<E> extends TN0<E> implements List<E>, RandomAccess {
    public static final AbstractC7705lB2<Object> Y = new b(PQ1.Z0, 0);

    /* renamed from: o.bO0$a */
    /* loaded from: classes3.dex */
    public static final class a<E> extends TN0.a<E> {
        public a() {
            this(4);
        }

        @Override // o.TN0.a
        @InterfaceC6181ey
        /* renamed from: j */
        public a<E> g(E e) {
            super.a(e);
            return this;
        }

        @Override // o.TN0.a, o.TN0.b
        @InterfaceC6181ey
        /* renamed from: k */
        public a<E> b(E... eArr) {
            super.b(eArr);
            return this;
        }

        @Override // o.TN0.a, o.TN0.b
        @InterfaceC6181ey
        /* renamed from: l */
        public a<E> c(Iterable<? extends E> iterable) {
            super.c(iterable);
            return this;
        }

        @Override // o.TN0.b
        @InterfaceC6181ey
        /* renamed from: m */
        public a<E> d(Iterator<? extends E> it) {
            super.d(it);
            return this;
        }

        @Override // o.TN0.b
        /* renamed from: n */
        public AbstractC5317bO0<E> e() {
            this.d = true;
            return AbstractC5317bO0.p(this.b, this.c);
        }

        @InterfaceC6181ey
        public a<E> o(a<E> aVar) {
            h(aVar.b, aVar.c);
            return this;
        }

        public a(int i) {
            super(i);
        }
    }

    /* renamed from: o.bO0$b */
    /* loaded from: classes3.dex */
    public static class b<E> extends Y0<E> {
        public final AbstractC5317bO0<E> Z;

        public b(AbstractC5317bO0<E> abstractC5317bO0, int i) {
            super(abstractC5317bO0.size(), i);
            this.Z = abstractC5317bO0;
        }

        @Override // o.Y0
        public E b(int i) {
            return this.Z.get(i);
        }
    }

    /* renamed from: o.bO0$c */
    /* loaded from: classes3.dex */
    public static class c<E> extends AbstractC5317bO0<E> {
        public final transient AbstractC5317bO0<E> Z;

        public c(AbstractC5317bO0<E> abstractC5317bO0) {
            this.Z = abstractC5317bO0;
        }

        @Override // o.AbstractC5317bO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@MB Object obj) {
            return this.Z.contains(obj);
        }

        @Override // java.util.List
        public E get(int i) {
            C10664xF1.C(i, size());
            return this.Z.get(p0(i));
        }

        @Override // o.AbstractC5317bO0, java.util.List
        public int indexOf(@MB Object obj) {
            int lastIndexOf = this.Z.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return p0(lastIndexOf);
            }
            return -1;
        }

        @Override // o.AbstractC5317bO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // o.TN0
        public boolean j() {
            return this.Z.j();
        }

        @Override // o.AbstractC5317bO0
        public AbstractC5317bO0<E> j0() {
            return this.Z;
        }

        @Override // o.AbstractC5317bO0, java.util.List
        public int lastIndexOf(@MB Object obj) {
            int indexOf = this.Z.indexOf(obj);
            if (indexOf >= 0) {
                return p0(indexOf);
            }
            return -1;
        }

        @Override // o.AbstractC5317bO0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // o.AbstractC5317bO0, java.util.List
        /* renamed from: m0 */
        public AbstractC5317bO0<E> subList(int i, int i2) {
            C10664xF1.f0(i, i2, size());
            return this.Z.subList(r0(i2), r0(i)).j0();
        }

        public final int p0(int i) {
            return (size() - 1) - i;
        }

        public final int r0(int i) {
            return size() - i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Z.size();
        }

        @Override // o.AbstractC5317bO0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    /* renamed from: o.bO0$d */
    /* loaded from: classes3.dex */
    public static class d implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] X;

        public d(Object[] objArr) {
            this.X = objArr;
        }

        public Object readResolve() {
            return AbstractC5317bO0.H(this.X);
        }
    }

    /* renamed from: o.bO0$e */
    /* loaded from: classes3.dex */
    public class e extends AbstractC5317bO0<E> {
        public final transient int Y0;
        public final transient int Z;

        public e(int i, int i2) {
            this.Z = i;
            this.Y0 = i2;
        }

        @Override // o.TN0
        @MB
        public Object[] f() {
            return AbstractC5317bO0.this.f();
        }

        @Override // java.util.List
        public E get(int i) {
            C10664xF1.C(i, this.Y0);
            return AbstractC5317bO0.this.get(i + this.Z);
        }

        @Override // o.TN0
        public int h() {
            return AbstractC5317bO0.this.i() + this.Z + this.Y0;
        }

        @Override // o.TN0
        public int i() {
            return AbstractC5317bO0.this.i() + this.Z;
        }

        @Override // o.AbstractC5317bO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // o.TN0
        public boolean j() {
            return true;
        }

        @Override // o.AbstractC5317bO0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // o.AbstractC5317bO0, java.util.List
        /* renamed from: m0 */
        public AbstractC5317bO0<E> subList(int i, int i2) {
            C10664xF1.f0(i, i2, this.Y0);
            AbstractC5317bO0 abstractC5317bO0 = AbstractC5317bO0.this;
            int i3 = this.Z;
            return abstractC5317bO0.subList(i + i3, i2 + i3);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.Y0;
        }

        @Override // o.AbstractC5317bO0, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }
    }

    public static <E> AbstractC5317bO0<E> B(Object... objArr) {
        return l(C5436bt1.b(objArr));
    }

    public static <E> AbstractC5317bO0<E> D(Iterable<? extends E> iterable) {
        C10664xF1.E(iterable);
        if (iterable instanceof Collection) {
            return F((Collection) iterable);
        }
        return G(iterable.iterator());
    }

    public static <E> AbstractC5317bO0<E> F(Collection<? extends E> collection) {
        if (collection instanceof TN0) {
            AbstractC5317bO0<E> d2 = ((TN0) collection).d();
            if (d2.j()) {
                return l(d2.toArray());
            }
            return d2;
        }
        return B(collection.toArray());
    }

    public static <E> AbstractC5317bO0<E> G(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return L();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return M(next);
        }
        return new a().g(next).d(it).e();
    }

    public static <E> AbstractC5317bO0<E> H(E[] eArr) {
        if (eArr.length == 0) {
            return L();
        }
        return B((Object[]) eArr.clone());
    }

    public static <E> AbstractC5317bO0<E> L() {
        return (AbstractC5317bO0<E>) PQ1.Z0;
    }

    public static <E> AbstractC5317bO0<E> M(E e2) {
        return B(e2);
    }

    public static <E> AbstractC5317bO0<E> Q(E e2, E e3) {
        return B(e2, e3);
    }

    public static <E> AbstractC5317bO0<E> U(E e2, E e3, E e4) {
        return B(e2, e3, e4);
    }

    public static <E> AbstractC5317bO0<E> V(E e2, E e3, E e4, E e5) {
        return B(e2, e3, e4, e5);
    }

    public static <E> AbstractC5317bO0<E> X(E e2, E e3, E e4, E e5, E e6) {
        return B(e2, e3, e4, e5, e6);
    }

    public static <E> AbstractC5317bO0<E> Y(E e2, E e3, E e4, E e5, E e6, E e7) {
        return B(e2, e3, e4, e5, e6, e7);
    }

    public static <E> AbstractC5317bO0<E> a0(E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return B(e2, e3, e4, e5, e6, e7, e8);
    }

    public static <E> AbstractC5317bO0<E> b0(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return B(e2, e3, e4, e5, e6, e7, e8, e9);
    }

    public static <E> AbstractC5317bO0<E> d0(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return B(e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    public static <E> AbstractC5317bO0<E> e0(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return B(e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    public static <E> AbstractC5317bO0<E> f0(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12) {
        return B(e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12);
    }

    @SafeVarargs
    public static <E> AbstractC5317bO0<E> h0(E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E e13, E... eArr) {
        boolean z;
        if (eArr.length <= 2147483635) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.e(z, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e5;
        objArr[4] = e6;
        objArr[5] = e7;
        objArr[6] = e8;
        objArr[7] = e9;
        objArr[8] = e10;
        objArr[9] = e11;
        objArr[10] = e12;
        objArr[11] = e13;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return B(objArr);
    }

    public static <E extends Comparable<? super E>> AbstractC5317bO0<E> k0(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) C5098aU0.R(iterable, new Comparable[0]);
        C5436bt1.b(comparableArr);
        Arrays.sort(comparableArr);
        return l(comparableArr);
    }

    public static <E> AbstractC5317bO0<E> l(Object[] objArr) {
        return p(objArr, objArr.length);
    }

    public static <E> AbstractC5317bO0<E> l0(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C10664xF1.E(comparator);
        Object[] P = C5098aU0.P(iterable);
        C5436bt1.b(P);
        Arrays.sort(P, comparator);
        return l(P);
    }

    public static <E> AbstractC5317bO0<E> p(Object[] objArr, int i) {
        if (i == 0) {
            return L();
        }
        return new PQ1(objArr, i);
    }

    public static <E> a<E> r() {
        return new a<>();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @InterfaceC4238Sm
    public static <E> a<E> w(int i) {
        C5037aF.b(i, "expectedSize");
        return new a<>(i);
    }

    @Override // java.util.List
    /* renamed from: J */
    public AbstractC7705lB2<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: K */
    public AbstractC7705lB2<E> listIterator(int i) {
        C10664xF1.d0(i, size());
        if (isEmpty()) {
            return (AbstractC7705lB2<E>) Y;
        }
        return new b(this, i);
    }

    @Override // java.util.List
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // o.TN0
    public int e(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@MB Object obj) {
        return C10608x11.j(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(@MB Object obj) {
        if (obj == null) {
            return -1;
        }
        return C10608x11.l(this, obj);
    }

    public AbstractC5317bO0<E> j0() {
        if (size() <= 1) {
            return this;
        }
        return new c(this);
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public AbstractC6237fB2<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(@MB Object obj) {
        if (obj == null) {
            return -1;
        }
        return C10608x11.n(this, obj);
    }

    @Override // java.util.List
    /* renamed from: m0 */
    public AbstractC5317bO0<E> subList(int i, int i2) {
        C10664xF1.f0(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return L();
        }
        return n0(i, i2);
    }

    public AbstractC5317bO0<E> n0(int i, int i2) {
        return new e(i, i2 - i);
    }

    @Override // java.util.List
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @InterfaceC6181ey
    @J40("Always throws UnsupportedOperationException")
    @Deprecated
    public final E set(int i, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // o.TN0
    public Object writeReplace() {
        return new d(toArray());
    }

    @Override // o.TN0
    @Deprecated
    @VP0(replacement = "this")
    public final AbstractC5317bO0<E> d() {
        return this;
    }
}
