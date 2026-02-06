package o;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes4.dex */
public class WG implements Comparator, Serializable {
    public static final WG X = new WG();
    private static final long serialVersionUID = -291439688585137865L;

    public static WG a() {
        return X;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
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
