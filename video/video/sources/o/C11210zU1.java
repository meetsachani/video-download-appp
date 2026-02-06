package o;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: o.zU1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C11210zU1<E> implements Comparator<E>, Serializable {
    private static final long serialVersionUID = 2858887242028539265L;
    public final Comparator<? super E> X;

    public C11210zU1() {
        this(null);
    }

    @Override // java.util.Comparator
    public int compare(E e, E e2) {
        return this.X.compare(e2, e);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        return this.X.equals(((C11210zU1) obj).X);
    }

    public int hashCode() {
        return this.X.hashCode() ^ 175311160;
    }

    public C11210zU1(Comparator<? super E> comparator) {
        this.X = comparator == null ? C7726lH.a : comparator;
    }
}
