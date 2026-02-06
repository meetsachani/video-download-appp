package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import o.AbstractC9481sO0;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* renamed from: o.yO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10942yO0<E> extends AbstractC11185zO0<E> implements NavigableSet<E>, Y92<E> {
    public final transient Comparator<? super E> a1;
    @MB
    @SY0
    @InterfaceC11149zF0
    public transient AbstractC10942yO0<E> b1;

    /* renamed from: o.yO0$a */
    /* loaded from: classes3.dex */
    public static final class a<E> extends AbstractC9481sO0.a<E> {
        public final Comparator<? super E> g;

        public a(Comparator<? super E> comparator) {
            this.g = (Comparator) C10664xF1.E(comparator);
        }

        @Override // o.AbstractC9481sO0.a
        @InterfaceC6181ey
        /* renamed from: q */
        public a<E> j(E e) {
            super.g(e);
            return this;
        }

        @Override // o.AbstractC9481sO0.a
        @InterfaceC6181ey
        /* renamed from: r */
        public a<E> k(E... eArr) {
            super.b(eArr);
            return this;
        }

        @Override // o.AbstractC9481sO0.a
        @InterfaceC6181ey
        /* renamed from: s */
        public a<E> l(Iterable<? extends E> iterable) {
            super.c(iterable);
            return this;
        }

        @Override // o.AbstractC9481sO0.a
        @InterfaceC6181ey
        /* renamed from: t */
        public a<E> m(Iterator<? extends E> it) {
            super.d(it);
            return this;
        }

        @Override // o.AbstractC9481sO0.a
        /* renamed from: u */
        public AbstractC10942yO0<E> o() {
            AbstractC10942yO0<E> p0 = AbstractC10942yO0.p0(this.g, this.c, this.b);
            this.c = p0.size();
            this.d = true;
            return p0;
        }

        @Override // o.AbstractC9481sO0.a
        @InterfaceC6181ey
        /* renamed from: v */
        public a<E> p(AbstractC9481sO0.a<E> aVar) {
            super.p(aVar);
            return this;
        }
    }

    /* renamed from: o.yO0$b */
    /* loaded from: classes3.dex */
    public static class b<E> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Comparator<? super E> X;
        public final Object[] Y;

        public b(Comparator<? super E> comparator, Object[] objArr) {
            this.X = comparator;
            this.Y = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            return new a(this.X).k(this.Y).o();
        }
    }

    public AbstractC10942yO0(Comparator<? super E> comparator) {
        this.a1 = comparator;
    }

    public static <E> UQ1<E> E0(Comparator<? super E> comparator) {
        if (AbstractC10587ww1.z().equals(comparator)) {
            return (UQ1<E>) UQ1.d1;
        }
        return new UQ1<>(AbstractC5317bO0.L(), comparator);
    }

    public static <E extends Comparable<?>> a<E> I0() {
        return new a<>(AbstractC10587ww1.z());
    }

    public static <E> AbstractC10942yO0<E> J0() {
        return UQ1.d1;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lo/yO0<TE;>; */
    public static AbstractC10942yO0 K0(Comparable comparable) {
        return new UQ1(AbstractC5317bO0.M(comparable), AbstractC10587ww1.z());
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lo/yO0<TE;>; */
    public static AbstractC10942yO0 L0(Comparable comparable, Comparable comparable2) {
        return p0(AbstractC10587ww1.z(), 2, comparable, comparable2);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lo/yO0<TE;>; */
    public static AbstractC10942yO0 N0(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return p0(AbstractC10587ww1.z(), 3, comparable, comparable2, comparable3);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lo/yO0<TE;>; */
    public static AbstractC10942yO0 O0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return p0(AbstractC10587ww1.z(), 4, comparable, comparable2, comparable3, comparable4);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lo/yO0<TE;>; */
    public static AbstractC10942yO0 P0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return p0(AbstractC10587ww1.z(), 5, comparable, comparable2, comparable3, comparable4, comparable5);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lo/yO0<TE;>; */
    public static AbstractC10942yO0 Q0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        int length = comparableArr.length + 6;
        Comparable[] comparableArr2 = new Comparable[length];
        comparableArr2[0] = comparable;
        comparableArr2[1] = comparable2;
        comparableArr2[2] = comparable3;
        comparableArr2[3] = comparable4;
        comparableArr2[4] = comparable5;
        comparableArr2[5] = comparable6;
        System.arraycopy(comparableArr, 0, comparableArr2, 6, comparableArr.length);
        return p0(AbstractC10587ww1.z(), length, comparableArr2);
    }

    public static <E> a<E> R0(Comparator<E> comparator) {
        return new a<>(comparator);
    }

    public static <E extends Comparable<?>> a<E> T0() {
        return new a<>(Collections.reverseOrder());
    }

    public static int d1(Comparator<?> comparator, Object obj, @MB Object obj2) {
        return comparator.compare(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> AbstractC10942yO0<E> p0(Comparator<? super E> comparator, int i, E... eArr) {
        if (i == 0) {
            return E0(comparator);
        }
        C5436bt1.c(eArr, i);
        Arrays.sort(eArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = (Object) eArr[i3];
            if (comparator.compare(obj, (Object) eArr[i2 - 1]) != 0) {
                eArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, (Object) null);
        if (i2 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i2);
        }
        return new UQ1(AbstractC5317bO0.p(eArr, i2), comparator);
    }

    public static <E> AbstractC10942yO0<E> r0(Iterable<? extends E> iterable) {
        return t0(AbstractC10587ww1.z(), iterable);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> AbstractC10942yO0<E> s0(Collection<? extends E> collection) {
        return u0(AbstractC10587ww1.z(), collection);
    }

    public static <E> AbstractC10942yO0<E> t0(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C10664xF1.E(comparator);
        if (Z92.b(comparator, iterable) && (iterable instanceof AbstractC10942yO0)) {
            AbstractC10942yO0<E> abstractC10942yO0 = (AbstractC10942yO0) iterable;
            if (!abstractC10942yO0.j()) {
                return abstractC10942yO0;
            }
        }
        Object[] P = C5098aU0.P(iterable);
        return p0(comparator, P.length, P);
    }

    public static <E> AbstractC10942yO0<E> u0(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return t0(comparator, collection);
    }

    public static <E> AbstractC10942yO0<E> v0(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new a(comparator).m(it).o();
    }

    public static <E> AbstractC10942yO0<E> w0(Iterator<? extends E> it) {
        return v0(AbstractC10587ww1.z(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lo/yO0<TE;>; */
    public static AbstractC10942yO0 x0(Comparable[] comparableArr) {
        return p0(AbstractC10587ww1.z(), comparableArr.length, (Comparable[]) comparableArr.clone());
    }

    public static <E> AbstractC10942yO0<E> y0(SortedSet<E> sortedSet) {
        Comparator a2 = Z92.a(sortedSet);
        AbstractC5317bO0 F = AbstractC5317bO0.F(sortedSet);
        if (F.isEmpty()) {
            return E0(a2);
        }
        return new UQ1(F, a2);
    }

    @Override // java.util.NavigableSet
    @InterfaceC11149zF0
    /* renamed from: B0 */
    public abstract AbstractC6237fB2<E> descendingIterator();

    @Override // java.util.NavigableSet
    @InterfaceC11149zF0
    /* renamed from: C0 */
    public AbstractC10942yO0<E> descendingSet() {
        AbstractC10942yO0<E> abstractC10942yO0 = this.b1;
        if (abstractC10942yO0 == null) {
            AbstractC10942yO0<E> z0 = z0();
            this.b1 = z0;
            z0.b1 = this;
            return z0;
        }
        return abstractC10942yO0;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: F0 */
    public AbstractC10942yO0<E> headSet(E e) {
        return headSet(e, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: G0 */
    public AbstractC10942yO0<E> headSet(E e, boolean z) {
        return H0(C10664xF1.E(e), z);
    }

    public abstract AbstractC10942yO0<E> H0(E e, boolean z);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: U0 */
    public AbstractC10942yO0<E> subSet(E e, E e2) {
        return subSet(e, true, e2, false);
    }

    @Override // java.util.NavigableSet
    @InterfaceC11149zF0
    /* renamed from: X0 */
    public AbstractC10942yO0<E> subSet(E e, boolean z, E e2, boolean z2) {
        boolean z3;
        C10664xF1.E(e);
        C10664xF1.E(e2);
        if (this.a1.compare(e, e2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C10664xF1.d(z3);
        return Y0(e, z, e2, z2);
    }

    public abstract AbstractC10942yO0<E> Y0(E e, boolean z, E e2, boolean z2);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: Z0 */
    public AbstractC10942yO0<E> tailSet(E e) {
        return tailSet(e, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: a1 */
    public AbstractC10942yO0<E> tailSet(E e, boolean z) {
        return b1(C10664xF1.E(e), z);
    }

    public abstract AbstractC10942yO0<E> b1(E e, boolean z);

    public int c1(Object obj, @MB Object obj2) {
        return d1(this.a1, obj, obj2);
    }

    @MB
    public E ceiling(E e) {
        return (E) C5098aU0.v(tailSet(e, true), null);
    }

    @Override // java.util.SortedSet, o.Y92
    public Comparator<? super E> comparator() {
        return this.a1;
    }

    public E first() {
        return iterator().next();
    }

    @MB
    public E floor(E e) {
        return (E) C7052iU0.J(headSet(e, true).descendingIterator(), null);
    }

    @MB
    @InterfaceC11149zF0
    public E higher(E e) {
        return (E) C5098aU0.v(tailSet(e, false), null);
    }

    public abstract int indexOf(@MB Object obj);

    @Override // o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public abstract AbstractC6237fB2<E> iterator();

    public E last() {
        return descendingIterator().next();
    }

    @MB
    @InterfaceC11149zF0
    public E lower(E e) {
        return (E) C7052iU0.J(headSet(e, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @InterfaceC6181ey
    @MB
    @InterfaceC11149zF0
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @InterfaceC6181ey
    @MB
    @InterfaceC11149zF0
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC9481sO0, o.TN0
    public Object writeReplace() {
        return new b(this.a1, toArray());
    }

    @InterfaceC11149zF0
    public abstract AbstractC10942yO0<E> z0();
}
