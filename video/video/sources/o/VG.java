package o;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;

/* loaded from: classes4.dex */
public class VG<E extends Comparable<? super E>> implements Comparator<E>, Serializable {
    public static final VG X = new VG();
    private static final long serialVersionUID = -291439688585137865L;

    public static <E extends Comparable<? super E>> VG<E> a() {
        return X;
    }

    @Override // java.util.Comparator
    /* renamed from: b */
    public int compare(E e, E e2) {
        return e.compareTo(e2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !obj.getClass().equals(getClass())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int hashCode() {
        return 1769708912;
    }
}
