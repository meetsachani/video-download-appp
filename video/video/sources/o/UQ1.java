package o;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class UQ1<E> extends AbstractC10942yO0<E> {
    public static final UQ1<Comparable> d1 = new UQ1<>(AbstractC5317bO0.L(), AbstractC10587ww1.z());
    @InterfaceC5299bJ2
    public final transient AbstractC5317bO0<E> c1;

    public UQ1(AbstractC5317bO0<E> abstractC5317bO0, Comparator<? super E> comparator) {
        super(comparator);
        this.c1 = abstractC5317bO0;
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @InterfaceC11149zF0
    /* renamed from: B0 */
    public AbstractC6237fB2<E> descendingIterator() {
        return this.c1.j0().iterator();
    }

    @Override // o.AbstractC10942yO0
    public AbstractC10942yO0<E> H0(E e, boolean z) {
        return e1(0, f1(e, z));
    }

    @Override // o.AbstractC10942yO0
    public AbstractC10942yO0<E> Y0(E e, boolean z, E e2, boolean z2) {
        return b1(e, z).H0(e2, z2);
    }

    @Override // o.AbstractC10942yO0
    public AbstractC10942yO0<E> b1(E e, boolean z) {
        return e1(g1(e, z), size());
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @MB
    public E ceiling(E e) {
        int g1 = g1(e, true);
        if (g1 == size()) {
            return null;
        }
        return this.c1.get(g1);
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        if (obj != null) {
            try {
                if (i1(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof InterfaceC2467Am1) {
            collection = ((InterfaceC2467Am1) collection).n();
        }
        if (Z92.b(comparator(), collection) && collection.size() > 1) {
            AbstractC6237fB2<E> it = iterator();
            Iterator<?> it2 = collection.iterator();
            if (!it.hasNext()) {
                return false;
            }
            Object next = it2.next();
            E next2 = it.next();
            while (true) {
                try {
                    int c1 = c1(next2, next);
                    if (c1 < 0) {
                        if (!it.hasNext()) {
                            return false;
                        }
                        next2 = it.next();
                    } else if (c1 == 0) {
                        if (!it2.hasNext()) {
                            return true;
                        }
                        next = it2.next();
                    } else if (c1 > 0) {
                        break;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        } else {
            return super.containsAll(collection);
        }
        return false;
    }

    @Override // o.AbstractC9481sO0, o.TN0
    public AbstractC5317bO0<E> d() {
        return this.c1;
    }

    @Override // o.TN0
    public int e(Object[] objArr, int i) {
        return this.c1.e(objArr, i);
    }

    public UQ1<E> e1(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new UQ1<>(this.c1.subList(i, i2), this.a1);
        }
        return AbstractC10942yO0.E0(this.a1);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[Catch: ClassCastException | NoSuchElementException -> 0x0046, TryCatch #0 {ClassCastException | NoSuchElementException -> 0x0046, blocks: (B:17:0x002a, B:18:0x002e, B:20:0x0034, B:22:0x003e), top: B:29:0x002a }] */
    @Override // o.AbstractC9481sO0, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (Z92.b(this.a1, set)) {
            Iterator<E> it = set.iterator();
            try {
                AbstractC6237fB2<E> it2 = iterator();
                while (it2.hasNext()) {
                    E next = it2.next();
                    E next2 = it.next();
                    if (next2 == null || c1(next, next2) != 0) {
                        return false;
                    }
                    while (it2.hasNext()) {
                    }
                }
                return true;
            } catch (ClassCastException | NoSuchElementException unused) {
                return false;
            }
        }
        return containsAll(set);
    }

    @Override // o.TN0
    @MB
    public Object[] f() {
        return this.c1.f();
    }

    public int f1(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.c1, C10664xF1.E(e), comparator());
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    @Override // o.AbstractC10942yO0, java.util.SortedSet
    public E first() {
        if (!isEmpty()) {
            return this.c1.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @MB
    public E floor(E e) {
        int f1 = f1(e, true) - 1;
        if (f1 == -1) {
            return null;
        }
        return this.c1.get(f1);
    }

    public int g1(E e, boolean z) {
        int binarySearch = Collections.binarySearch(this.c1, C10664xF1.E(e), comparator());
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }

    @Override // o.TN0
    public int h() {
        return this.c1.h();
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @MB
    public E higher(E e) {
        int g1 = g1(e, false);
        if (g1 == size()) {
            return null;
        }
        return this.c1.get(g1);
    }

    @Override // o.TN0
    public int i() {
        return this.c1.i();
    }

    public final int i1(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.c1, obj, j1());
    }

    @Override // o.AbstractC10942yO0
    public int indexOf(@MB Object obj) {
        int binarySearch;
        if (obj == null) {
            return -1;
        }
        try {
            binarySearch = Collections.binarySearch(this.c1, obj, j1());
        } catch (ClassCastException unused) {
        }
        if (binarySearch < 0) {
            return -1;
        }
        return binarySearch;
    }

    @Override // o.TN0
    public boolean j() {
        return this.c1.j();
    }

    public Comparator<Object> j1() {
        return this.a1;
    }

    @Override // o.AbstractC10942yO0, o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public AbstractC6237fB2<E> iterator() {
        return this.c1.iterator();
    }

    @Override // o.AbstractC10942yO0, java.util.SortedSet
    public E last() {
        if (!isEmpty()) {
            return this.c1.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // o.AbstractC10942yO0, java.util.NavigableSet
    @MB
    public E lower(E e) {
        int f1 = f1(e, false) - 1;
        if (f1 == -1) {
            return null;
        }
        return this.c1.get(f1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.c1.size();
    }

    @Override // o.AbstractC10942yO0
    public AbstractC10942yO0<E> z0() {
        Comparator reverseOrder = Collections.reverseOrder(this.a1);
        if (isEmpty()) {
            return AbstractC10942yO0.E0(reverseOrder);
        }
        return new UQ1(this.c1.j0(), reverseOrder);
    }
}
