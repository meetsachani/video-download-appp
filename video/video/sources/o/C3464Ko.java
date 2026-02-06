package o;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: o.Ko  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3464Ko implements Comparator, Serializable {
    public static final C3464Ko Y = new C3464Ko(true);
    public static final C3464Ko Z = new C3464Ko(false);
    private static final long serialVersionUID = 1830042991606340609L;
    public boolean X;

    public C3464Ko() {
        this(false);
    }

    public static C3464Ko b(boolean z) {
        if (z) {
            return Y;
        }
        return Z;
    }

    public static C3464Ko c() {
        return Z;
    }

    public static C3464Ko d() {
        return Y;
    }

    public int a(Boolean bool, Boolean bool2) {
        boolean booleanValue = bool.booleanValue();
        if (bool2.booleanValue() ^ booleanValue) {
            if (booleanValue ^ this.X) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return a((Boolean) obj, (Boolean) obj2);
    }

    public boolean e() {
        return this.X;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C3464Ko) || this.X != ((C3464Ko) obj).X) {
                return false;
            }
            return true;
        }
        return true;
    }

    public int hashCode() {
        if (this.X) {
            return -478003966;
        }
        return 478003966;
    }

    public C3464Ko(boolean z) {
        this.X = z;
    }
}
