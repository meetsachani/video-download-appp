package o;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: o.bs1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5432bs1<E> implements Comparator<E>, Serializable {
    private static final long serialVersionUID = -5820772575483504339L;
    public final Comparator<? super E> X;
    public final boolean Y;

    public C5432bs1() {
        this(C7726lH.a, true);
    }

    @Override // java.util.Comparator
    public int compare(E e, E e2) {
        if (e == e2) {
            return 0;
        }
        if (e == null) {
            if (!this.Y) {
                return -1;
            }
            return 1;
        } else if (e2 == null) {
            if (this.Y) {
                return -1;
            }
            return 1;
        } else {
            return this.X.compare(e, e2);
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        C5432bs1 c5432bs1 = (C5432bs1) obj;
        if (this.Y != c5432bs1.Y || !this.X.equals(c5432bs1.X)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        if (this.Y) {
            i = -1;
        } else {
            i = 1;
        }
        return i * this.X.hashCode();
    }

    public C5432bs1(Comparator<? super E> comparator) {
        this(comparator, true);
    }

    public C5432bs1(boolean z) {
        this(C7726lH.a, z);
    }

    public C5432bs1(Comparator<? super E> comparator, boolean z) {
        this.X = comparator;
        this.Y = z;
        if (comparator == null) {
            throw new NullPointerException("null nonNullComparator");
        }
    }
}
