package o;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: o.cs1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5674cs1 implements Comparator, Serializable {
    private static final long serialVersionUID = -5820772575483504339L;
    public Comparator X;
    public boolean Y;

    public C5674cs1() {
        this(WG.a(), true);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            if (!this.Y) {
                return -1;
            }
            return 1;
        } else if (obj2 == null) {
            if (this.Y) {
                return -1;
            }
            return 1;
        } else {
            return this.X.compare(obj, obj2);
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
        C5674cs1 c5674cs1 = (C5674cs1) obj;
        if (this.Y != c5674cs1.Y || !this.X.equals(c5674cs1.X)) {
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

    public C5674cs1(Comparator comparator) {
        this(comparator, true);
    }

    public C5674cs1(boolean z) {
        this(WG.a(), z);
    }

    public C5674cs1(Comparator comparator, boolean z) {
        this.X = comparator;
        this.Y = z;
        if (comparator == null) {
            throw new NullPointerException("null nonNullComparator");
        }
    }
}
