package o;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* renamed from: o.jF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7232jF {

    /* renamed from: o.jF$a */
    /* loaded from: classes3.dex */
    public static class a<E> extends AbstractCollection<E> {
        public final Collection<E> X;
        public final IF1<? super E> Y;

        public a(Collection<E> collection, IF1<? super E> if1) {
            this.X = collection;
            this.Y = if1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@InterfaceC7894ly1 E e) {
            C10664xF1.d(this.Y.apply(e));
            return this.X.add(e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            for (E e : collection) {
                C10664xF1.d(this.Y.apply(e));
            }
            return this.X.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C5098aU0.J(this.X, this.Y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@MB Object obj) {
            if (C7232jF.j(this.X, obj)) {
                return this.Y.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C7232jF.b(this, collection);
        }

        public a<E> d(IF1<? super E> if1) {
            return new a<>(this.X, C7985mG1.e(this.Y, if1));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !C5098aU0.c(this.X, this.Y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return C7052iU0.y(this.X.iterator(), this.Y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@MB Object obj) {
            if (contains(obj) && this.X.remove(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.X.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.Y.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.X.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.Y.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i = 0;
            for (E e : this.X) {
                if (this.Y.apply(e)) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return C10608x11.s(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C10608x11.s(iterator()).toArray(tArr);
        }
    }

    /* renamed from: o.jF$b */
    /* loaded from: classes3.dex */
    public static final class b<E> extends AbstractCollection<List<E>> {
        public final AbstractC5317bO0<E> X;
        public final Comparator<? super E> Y;
        public final int Z;

        public b(Iterable<E> iterable, Comparator<? super E> comparator) {
            AbstractC5317bO0<E> l0 = AbstractC5317bO0.l0(comparator, iterable);
            this.X = l0;
            this.Y = comparator;
            this.Z = d(l0, comparator);
        }

        public static <E> int d(List<E> list, Comparator<? super E> comparator) {
            int i = 1;
            int i2 = 1;
            int i3 = 1;
            while (i < list.size()) {
                if (comparator.compare(list.get(i - 1), list.get(i)) < 0) {
                    i2 = C9979uR0.u(i2, C9979uR0.a(i, i3));
                    if (i2 == Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    i3 = 0;
                }
                i++;
                i3++;
            }
            return C9979uR0.u(i2, C9979uR0.a(i, i3));
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@MB Object obj) {
            if (obj instanceof List) {
                return C7232jF.e(this.X, (List) obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new c(this.X, this.Y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.Z;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 30);
            sb.append("orderedPermutationCollection(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.jF$c */
    /* loaded from: classes3.dex */
    public static final class c<E> extends AbstractC6437g1<List<E>> {
        public final Comparator<? super E> Y0;
        @MB
        public List<E> Z;

        public c(List<E> list, Comparator<? super E> comparator) {
            this.Z = C10608x11.r(list);
            this.Y0 = comparator;
        }

        public void e() {
            int g = g();
            if (g == -1) {
                this.Z = null;
                return;
            }
            Objects.requireNonNull(this.Z);
            Collections.swap(this.Z, g, h(g));
            Collections.reverse(this.Z.subList(g + 1, this.Z.size()));
        }

        @Override // o.AbstractC6437g1
        @MB
        /* renamed from: f */
        public List<E> b() {
            List<E> list = this.Z;
            if (list == null) {
                return c();
            }
            AbstractC5317bO0 F = AbstractC5317bO0.F(list);
            e();
            return F;
        }

        public int g() {
            Objects.requireNonNull(this.Z);
            for (int size = this.Z.size() - 2; size >= 0; size--) {
                if (this.Y0.compare((E) this.Z.get(size), (E) this.Z.get(size + 1)) < 0) {
                    return size;
                }
            }
            return -1;
        }

        public int h(int i) {
            Objects.requireNonNull(this.Z);
            E e = this.Z.get(i);
            for (int size = this.Z.size() - 1; size > i; size--) {
                if (this.Y0.compare(e, (E) this.Z.get(size)) < 0) {
                    return size;
                }
            }
            throw new AssertionError("this statement should be unreachable");
        }
    }

    /* renamed from: o.jF$d */
    /* loaded from: classes3.dex */
    public static final class d<E> extends AbstractCollection<List<E>> {
        public final AbstractC5317bO0<E> X;

        public d(AbstractC5317bO0<E> abstractC5317bO0) {
            this.X = abstractC5317bO0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@MB Object obj) {
            if (obj instanceof List) {
                return C7232jF.e(this.X, (List) obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new e(this.X);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C9979uR0.h(this.X.size());
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            String valueOf = String.valueOf(this.X);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14);
            sb.append("permutations(");
            sb.append(valueOf);
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.jF$e */
    /* loaded from: classes3.dex */
    public static class e<E> extends AbstractC6437g1<List<E>> {
        public final int[] Y0;
        public final List<E> Z;
        public final int[] Z0;
        public int a1;

        public e(List<E> list) {
            this.Z = new ArrayList(list);
            int size = list.size();
            int[] iArr = new int[size];
            this.Y0 = iArr;
            int[] iArr2 = new int[size];
            this.Z0 = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 1);
            this.a1 = Integer.MAX_VALUE;
        }

        public void e() {
            int size = this.Z.size() - 1;
            this.a1 = size;
            if (size != -1) {
                int i = 0;
                while (true) {
                    int[] iArr = this.Y0;
                    int i2 = this.a1;
                    int i3 = iArr[i2];
                    int i4 = this.Z0[i2] + i3;
                    if (i4 < 0) {
                        g();
                    } else if (i4 == i2 + 1) {
                        if (i2 == 0) {
                            return;
                        }
                        i++;
                        g();
                    } else {
                        Collections.swap(this.Z, (i2 - i3) + i, (i2 - i4) + i);
                        this.Y0[this.a1] = i4;
                        return;
                    }
                }
            }
        }

        @Override // o.AbstractC6437g1
        @MB
        /* renamed from: f */
        public List<E> b() {
            if (this.a1 <= 0) {
                return c();
            }
            AbstractC5317bO0 F = AbstractC5317bO0.F(this.Z);
            e();
            return F;
        }

        public void g() {
            int[] iArr = this.Z0;
            int i = this.a1;
            iArr[i] = -iArr[i];
            this.a1 = i - 1;
        }
    }

    /* renamed from: o.jF$f */
    /* loaded from: classes3.dex */
    public static class f<F, T> extends AbstractCollection<T> {
        public final Collection<F> X;
        public final YA0<? super F, ? extends T> Y;

        public f(Collection<F> collection, YA0<? super F, ? extends T> ya0) {
            this.X = (Collection) C10664xF1.E(collection);
            this.Y = (YA0) C10664xF1.E(ya0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.X.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.X.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return C7052iU0.c0(this.X.iterator(), this.Y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.X.size();
        }
    }

    public static boolean b(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <E> C5920dt1<E> c(Collection<E> collection) {
        C5920dt1<E> c5920dt1 = new C5920dt1<>();
        for (E e2 : collection) {
            c5920dt1.v(e2, c5920dt1.g(e2) + 1);
        }
        return c5920dt1;
    }

    public static <E> Collection<E> d(Collection<E> collection, IF1<? super E> if1) {
        if (collection instanceof a) {
            return ((a) collection).d(if1);
        }
        return new a((Collection) C10664xF1.E(collection), (IF1) C10664xF1.E(if1));
    }

    public static boolean e(List<?> list, List<?> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        C5920dt1 c2 = c(list);
        C5920dt1 c3 = c(list2);
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (c2.l(i) != c3.g(c2.j(i))) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder f(int i) {
        C5037aF.b(i, "size");
        return new StringBuilder((int) Math.min(i * 8, 1073741824L));
    }

    @InterfaceC4238Sm
    public static <E extends Comparable<? super E>> Collection<List<E>> g(Iterable<E> iterable) {
        return h(iterable, AbstractC10587ww1.z());
    }

    @InterfaceC4238Sm
    public static <E> Collection<List<E>> h(Iterable<E> iterable, Comparator<? super E> comparator) {
        return new b(iterable, comparator);
    }

    @InterfaceC4238Sm
    public static <E> Collection<List<E>> i(Collection<E> collection) {
        return new d(AbstractC5317bO0.F(collection));
    }

    public static boolean j(Collection<?> collection, @MB Object obj) {
        C10664xF1.E(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean k(Collection<?> collection, @MB Object obj) {
        C10664xF1.E(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static String l(Collection<?> collection) {
        StringBuilder f2 = f(collection.size());
        f2.append('[');
        boolean z = true;
        for (Object obj : collection) {
            if (!z) {
                f2.append(C6566gU0.h);
            }
            if (obj == collection) {
                f2.append("(this Collection)");
            } else {
                f2.append(obj);
            }
            z = false;
        }
        f2.append(']');
        return f2.toString();
    }

    public static <F, T> Collection<T> m(Collection<F> collection, YA0<? super F, T> ya0) {
        return new f(collection, ya0);
    }
}
