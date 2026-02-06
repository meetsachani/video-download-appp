package o;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes4.dex */
public class AU1 implements Comparator, Serializable {
    private static final long serialVersionUID = 2858887242028539265L;
    public Comparator X;

    public AU1() {
        this(null);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.X.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        return this.X.equals(((AU1) obj).X);
    }

    public int hashCode() {
        return this.X.hashCode() ^ 175311160;
    }

    public AU1(Comparator comparator) {
        if (comparator != null) {
            this.X = comparator;
        } else {
            this.X = WG.a();
        }
    }
}
