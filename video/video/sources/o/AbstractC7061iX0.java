package o;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: o.iX0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7061iX0<K> implements Comparator<K>, Serializable {
    public static final int X = -1;
    public static final int Y = -2;
    public static final int Z = -3;
    private static final long serialVersionUID = -20497563720380683L;

    public static boolean d(int i) {
        if (i == -2) {
            return true;
        }
        return false;
    }

    public static boolean e(int i) {
        if (i == -1) {
            return true;
        }
        return false;
    }

    public static boolean f(int i) {
        if (i == -3) {
            return true;
        }
        return false;
    }

    public static boolean h(int i) {
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public abstract int a(K k, int i, int i2, K k2, int i3, int i4);

    public abstract int b();

    public abstract boolean c(K k, int i, int i2);

    @Override // java.util.Comparator
    public int compare(K k, K k2) {
        if (k == null) {
            if (k2 == null) {
                return 0;
            }
            return -1;
        } else if (k2 == null) {
            return 1;
        } else {
            return ((Comparable) k).compareTo(k2);
        }
    }

    public abstract boolean g(K k, int i, int i2, K k2);

    public abstract int i(K k);
}
