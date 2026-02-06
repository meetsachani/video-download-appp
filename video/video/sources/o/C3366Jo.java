package o;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: o.Jo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3366Jo implements Comparator<Boolean>, Serializable {
    public static final C3366Jo Y = new C3366Jo(true);
    public static final C3366Jo Z = new C3366Jo(false);
    private static final long serialVersionUID = 1830042991606340609L;
    public boolean X;

    public C3366Jo() {
        this(false);
    }

    public static C3366Jo a(boolean z) {
        if (z) {
            return Y;
        }
        return Z;
    }

    public static C3366Jo c() {
        return Z;
    }

    public static C3366Jo d() {
        return Y;
    }

    @Override // java.util.Comparator
    /* renamed from: b */
    public int compare(Boolean bool, Boolean bool2) {
        boolean booleanValue = bool.booleanValue();
        if (bool2.booleanValue() ^ booleanValue) {
            if (booleanValue ^ this.X) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    public boolean e() {
        return this.X;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C3366Jo) || this.X != ((C3366Jo) obj).X) {
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

    public C3366Jo(boolean z) {
        this.X = z;
    }
}
