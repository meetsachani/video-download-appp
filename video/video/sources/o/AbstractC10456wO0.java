package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import o.AbstractC5317bO0;
import o.AbstractC7269jO0;
import o.InterfaceC2467Am1;

@InterfaceC11149zF0
@InterfaceC6329fa0
/* renamed from: o.wO0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10456wO0<E> extends AbstractC10699xO0<E> implements InterfaceC5603ca2<E> {
    @MB
    @SY0
    public transient AbstractC10456wO0<E> Y0;

    /* renamed from: o.wO0$a */
    /* loaded from: classes3.dex */
    public static class a<E> extends AbstractC7269jO0.b<E> {
        public final Comparator<? super E> e;
        @InterfaceC5299bJ2
        public E[] f;
        public int[] g;
        public int h;
        public boolean i;

        public a(Comparator<? super E> comparator) {
            super(true);
            this.e = (Comparator) C10664xF1.E(comparator);
            this.f = (E[]) new Object[4];
            this.g = new int[4];
        }

        @Override // o.AbstractC7269jO0.b
        @InterfaceC6181ey
        /* renamed from: o */
        public a<E> g(E e) {
            return k(e, 1);
        }

        @Override // o.AbstractC7269jO0.b
        @InterfaceC6181ey
        /* renamed from: p */
        public a<E> h(E... eArr) {
            for (E e : eArr) {
                g(e);
            }
            return this;
        }

        @Override // o.AbstractC7269jO0.b
        @InterfaceC6181ey
        /* renamed from: q */
        public a<E> i(Iterable<? extends E> iterable) {
            if (iterable instanceof InterfaceC2467Am1) {
                for (InterfaceC2467Am1.a<E> aVar : ((InterfaceC2467Am1) iterable).entrySet()) {
                    k(aVar.a(), aVar.getCount());
                }
            } else {
                for (E e : iterable) {
                    g(e);
                }
            }
            return this;
        }

        @Override // o.AbstractC7269jO0.b
        @InterfaceC6181ey
        /* renamed from: r */
        public a<E> j(Iterator<? extends E> it) {
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }

        @Override // o.AbstractC7269jO0.b
        @InterfaceC6181ey
        /* renamed from: s */
        public a<E> k(E e, int i) {
            C10664xF1.E(e);
            C5037aF.b(i, "occurrences");
            if (i == 0) {
                return this;
            }
            w();
            E[] eArr = this.f;
            int i2 = this.h;
            eArr[i2] = e;
            this.g[i2] = i;
            this.h = i2 + 1;
            return this;
        }

        @Override // o.AbstractC7269jO0.b
        /* renamed from: t */
        public AbstractC10456wO0<E> l() {
            v();
            int i = this.h;
            if (i == 0) {
                return AbstractC10456wO0.v0(this.e);
            }
            UQ1 uq1 = (UQ1) AbstractC10942yO0.p0(this.e, i, this.f);
            long[] jArr = new long[this.h + 1];
            int i2 = 0;
            while (i2 < this.h) {
                int i3 = i2 + 1;
                jArr[i3] = jArr[i2] + this.g[i2];
                i2 = i3;
            }
            this.i = true;
            return new TQ1(uq1, jArr, 0, this.h);
        }

        public final void u(boolean z) {
            int i = this.h;
            if (i == 0) {
                return;
            }
            E[] eArr = (E[]) Arrays.copyOf(this.f, i);
            Arrays.sort(eArr, this.e);
            int i2 = 1;
            for (int i3 = 1; i3 < eArr.length; i3++) {
                if (this.e.compare((Object) eArr[i2 - 1], (Object) eArr[i3]) < 0) {
                    eArr[i2] = eArr[i3];
                    i2++;
                }
            }
            Arrays.fill(eArr, i2, this.h, (Object) null);
            if (z) {
                int i4 = i2 * 4;
                int i5 = this.h;
                if (i4 > i5 * 3) {
                    eArr = (E[]) Arrays.copyOf(eArr, C9979uR0.t(i5, (i5 / 2) + 1));
                }
            }
            int[] iArr = new int[eArr.length];
            for (int i6 = 0; i6 < this.h; i6++) {
                int binarySearch = Arrays.binarySearch(eArr, 0, i2, this.f[i6], this.e);
                int i7 = this.g[i6];
                if (i7 >= 0) {
                    iArr[binarySearch] = iArr[binarySearch] + i7;
                } else {
                    iArr[binarySearch] = ~i7;
                }
            }
            this.f = eArr;
            this.g = iArr;
            this.h = i2;
        }

        public final void v() {
            u(false);
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.h;
                if (i < i3) {
                    int[] iArr = this.g;
                    int i4 = iArr[i];
                    if (i4 > 0) {
                        E[] eArr = this.f;
                        eArr[i2] = eArr[i];
                        iArr[i2] = i4;
                        i2++;
                    }
                    i++;
                } else {
                    Arrays.fill(this.f, i2, i3, (Object) null);
                    Arrays.fill(this.g, i2, this.h, 0);
                    this.h = i2;
                    return;
                }
            }
        }

        public final void w() {
            int i = this.h;
            E[] eArr = this.f;
            if (i == eArr.length) {
                u(true);
            } else if (this.i) {
                this.f = (E[]) Arrays.copyOf(eArr, eArr.length);
            }
            this.i = false;
        }

        @Override // o.AbstractC7269jO0.b
        @InterfaceC6181ey
        /* renamed from: x */
        public a<E> m(E e, int i) {
            C10664xF1.E(e);
            C5037aF.b(i, "count");
            w();
            E[] eArr = this.f;
            int i2 = this.h;
            eArr[i2] = e;
            this.g[i2] = ~i;
            this.h = i2 + 1;
            return this;
        }
    }

    /* renamed from: o.wO0$b */
    /* loaded from: classes3.dex */
    public static final class b<E> implements Serializable {
        public final Comparator<? super E> X;
        public final E[] Y;
        public final int[] Z;

        public b(InterfaceC5603ca2<E> interfaceC5603ca2) {
            this.X = interfaceC5603ca2.comparator();
            int size = interfaceC5603ca2.entrySet().size();
            this.Y = (E[]) new Object[size];
            this.Z = new int[size];
            int i = 0;
            for (InterfaceC2467Am1.a<E> aVar : interfaceC5603ca2.entrySet()) {
                this.Y[i] = aVar.a();
                this.Z[i] = aVar.getCount();
                i++;
            }
        }

        public Object readResolve() {
            int length = this.Y.length;
            a aVar = new a(this.X);
            for (int i = 0; i < length; i++) {
                aVar.k(this.Y[i], this.Z[i]);
            }
            return aVar.l();
        }
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lo/wO0<TE;>; */
    public static AbstractC10456wO0 B0(Comparable comparable, Comparable comparable2) {
        return l0(AbstractC10587ww1.z(), Arrays.asList(comparable, comparable2));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lo/wO0<TE;>; */
    public static AbstractC10456wO0 C0(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return l0(AbstractC10587ww1.z(), Arrays.asList(comparable, comparable2, comparable3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lo/wO0<TE;>; */
    public static AbstractC10456wO0 E0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return l0(AbstractC10587ww1.z(), Arrays.asList(comparable, comparable2, comparable3, comparable4));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lo/wO0<TE;>; */
    public static AbstractC10456wO0 F0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return l0(AbstractC10587ww1.z(), Arrays.asList(comparable, comparable2, comparable3, comparable4, comparable5));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lo/wO0<TE;>; */
    public static AbstractC10456wO0 G0(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        ArrayList u = C10608x11.u(comparableArr.length + 6);
        Collections.addAll(u, comparable, comparable2, comparable3, comparable4, comparable5, comparable6);
        Collections.addAll(u, comparableArr);
        return l0(AbstractC10587ww1.z(), u);
    }

    public static <E> a<E> H0(Comparator<E> comparator) {
        return new a<>(comparator);
    }

    public static <E extends Comparable<?>> a<E> I0() {
        return new a<>(AbstractC10587ww1.z().E());
    }

    public static <E> AbstractC10456wO0<E> k0(Iterable<? extends E> iterable) {
        return l0(AbstractC10587ww1.z(), iterable);
    }

    public static <E> AbstractC10456wO0<E> l0(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof AbstractC10456wO0) {
            AbstractC10456wO0<E> abstractC10456wO0 = (AbstractC10456wO0) iterable;
            if (comparator.equals(abstractC10456wO0.comparator())) {
                if (abstractC10456wO0.j()) {
                    return s0(comparator, abstractC10456wO0.entrySet().d());
                }
                return abstractC10456wO0;
            }
        }
        return new a(comparator).i(iterable).l();
    }

    public static <E> AbstractC10456wO0<E> m0(Comparator<? super E> comparator, Iterator<? extends E> it) {
        C10664xF1.E(comparator);
        return new a(comparator).j(it).l();
    }

    public static <E> AbstractC10456wO0<E> n0(Iterator<? extends E> it) {
        return m0(AbstractC10587ww1.z(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lo/wO0<TE;>; */
    public static AbstractC10456wO0 p0(Comparable[] comparableArr) {
        return l0(AbstractC10587ww1.z(), Arrays.asList(comparableArr));
    }

    public static <E> AbstractC10456wO0<E> r0(InterfaceC5603ca2<E> interfaceC5603ca2) {
        return s0(interfaceC5603ca2.comparator(), C10608x11.r(interfaceC5603ca2.entrySet()));
    }

    public static <E> AbstractC10456wO0<E> s0(Comparator<? super E> comparator, Collection<InterfaceC2467Am1.a<E>> collection) {
        if (collection.isEmpty()) {
            return v0(comparator);
        }
        AbstractC5317bO0.a aVar = new AbstractC5317bO0.a(collection.size());
        long[] jArr = new long[collection.size() + 1];
        int i = 0;
        for (InterfaceC2467Am1.a<E> aVar2 : collection) {
            aVar.g(aVar2.a());
            int i2 = i + 1;
            jArr[i2] = jArr[i] + aVar2.getCount();
            i = i2;
        }
        return new TQ1(new UQ1(aVar.e(), comparator), jArr, 0, collection.size());
    }

    public static <E> AbstractC10456wO0<E> v0(Comparator<? super E> comparator) {
        if (AbstractC10587ww1.z().equals(comparator)) {
            return (AbstractC10456wO0<E>) TQ1.e1;
        }
        return new TQ1(comparator);
    }

    public static <E extends Comparable<?>> a<E> x0() {
        return new a<>(AbstractC10587ww1.z());
    }

    public static <E> AbstractC10456wO0<E> y0() {
        return (AbstractC10456wO0<E>) TQ1.e1;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lo/wO0<TE;>; */
    public static AbstractC10456wO0 z0(Comparable comparable) {
        return new TQ1((UQ1) AbstractC10942yO0.K0(comparable), new long[]{0, 1}, 0, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC5603ca2
    /* renamed from: J0 */
    public AbstractC10456wO0<E> m3(E e, EnumC6886hp enumC6886hp, E e2, EnumC6886hp enumC6886hp2) {
        boolean z;
        if (comparator().compare(e, e2) <= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.y(z, "Expected lowerBound <= upperBound but %s > %s", e, e2);
        return t3(e, enumC6886hp).G2(e2, enumC6886hp2);
    }

    @Override // o.InterfaceC5603ca2
    /* renamed from: K0 */
    public abstract AbstractC10456wO0<E> t3(E e, EnumC6886hp enumC6886hp);

    @Override // o.InterfaceC5603ca2, o.Y92
    public final Comparator<? super E> comparator() {
        return n().comparator();
    }

    @Override // o.InterfaceC5603ca2
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public final InterfaceC2467Am1.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC5603ca2
    @InterfaceC6181ey
    @MB
    @Deprecated
    @J40("Always throws UnsupportedOperationException")
    public final InterfaceC2467Am1.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC5603ca2
    /* renamed from: t0 */
    public AbstractC10456wO0<E> C3() {
        AbstractC10456wO0<E> abstractC10456wO0 = this.Y0;
        if (abstractC10456wO0 == null) {
            if (isEmpty()) {
                abstractC10456wO0 = v0(AbstractC10587ww1.h(comparator()).E());
            } else {
                abstractC10456wO0 = new C10368w20<>(this);
            }
            this.Y0 = abstractC10456wO0;
        }
        return abstractC10456wO0;
    }

    @Override // o.AbstractC7269jO0, o.InterfaceC2467Am1
    /* renamed from: u0 */
    public abstract AbstractC10942yO0<E> n();

    @Override // o.InterfaceC5603ca2
    /* renamed from: w0 */
    public abstract AbstractC10456wO0<E> G2(E e, EnumC6886hp enumC6886hp);

    @Override // o.AbstractC7269jO0, o.TN0
    public Object writeReplace() {
        return new b(this);
    }
}
