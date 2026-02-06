package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.List;

/* renamed from: o.hH  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6756hH<E> implements Comparator<E>, Serializable {
    private static final long serialVersionUID = -721644942746081630L;
    public final List<Comparator<E>> X;
    public BitSet Y;
    public boolean Z;

    public C6756hH() {
        this(new ArrayList(), new BitSet());
    }

    public void a(Comparator<E> comparator) {
        b(comparator, false);
    }

    public void b(Comparator<E> comparator, boolean z) {
        d();
        this.X.add(comparator);
        if (z) {
            this.Y.set(this.X.size() - 1);
        }
    }

    public final void c() {
        if (this.X.size() != 0) {
            return;
        }
        throw new UnsupportedOperationException("ComparatorChains must contain at least one Comparator");
    }

    @Override // java.util.Comparator
    public int compare(E e, E e2) throws UnsupportedOperationException {
        if (!this.Z) {
            c();
            this.Z = true;
        }
        int i = 0;
        for (Comparator<E> comparator : this.X) {
            int compare = comparator.compare(e, e2);
            if (compare != 0) {
                if (this.Y.get(i)) {
                    if (compare <= 0) {
                        return 1;
                    }
                    return -1;
                }
                return compare;
            }
            i++;
        }
        return 0;
    }

    public final void d() {
        if (!this.Z) {
            return;
        }
        throw new UnsupportedOperationException("Comparator ordering cannot be changed after the first comparison is performed");
    }

    public boolean e() {
        return this.Z;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass().equals(getClass())) {
            C6756hH c6756hH = (C6756hH) obj;
            BitSet bitSet = this.Y;
            if (bitSet != null ? bitSet.equals(c6756hH.Y) : c6756hH.Y == null) {
                List<Comparator<E>> list = this.X;
                List<Comparator<E>> list2 = c6756hH.X;
                if (list != null ? list.equals(list2) : list2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(int i, Comparator<E> comparator) throws IndexOutOfBoundsException {
        g(i, comparator, false);
    }

    public void g(int i, Comparator<E> comparator, boolean z) {
        d();
        this.X.set(i, comparator);
        if (z) {
            this.Y.set(i);
        } else {
            this.Y.clear(i);
        }
    }

    public void h(int i) {
        d();
        this.Y.clear(i);
    }

    public int hashCode() {
        int i;
        List<Comparator<E>> list = this.X;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        BitSet bitSet = this.Y;
        if (bitSet != null) {
            return i ^ bitSet.hashCode();
        }
        return i;
    }

    public void i(int i) {
        d();
        this.Y.set(i);
    }

    public int j() {
        return this.X.size();
    }

    public C6756hH(Comparator<E> comparator) {
        this((Comparator) comparator, false);
    }

    public C6756hH(Comparator<E> comparator, boolean z) {
        this.Y = null;
        this.Z = false;
        ArrayList arrayList = new ArrayList(1);
        this.X = arrayList;
        arrayList.add(comparator);
        BitSet bitSet = new BitSet(1);
        this.Y = bitSet;
        if (z) {
            bitSet.set(0);
        }
    }

    public C6756hH(List<Comparator<E>> list) {
        this(list, new BitSet(list.size()));
    }

    public C6756hH(List<Comparator<E>> list, BitSet bitSet) {
        this.Z = false;
        this.X = list;
        this.Y = bitSet;
    }
}
