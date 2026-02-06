package o;

@Deprecated
/* loaded from: classes2.dex */
public final class L82 {
    public static final L82 c = new L82(-1, -1);
    public static final L82 d = new L82(0, 0);
    public final int a;
    public final int b;

    public L82(int i, int i2) {
        boolean z;
        if ((i != -1 && i < 0) || (i2 != -1 && i2 < 0)) {
            z = false;
        } else {
            z = true;
        }
        C9542sf.a(z);
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof L82) {
            L82 l82 = (L82) obj;
            if (this.a == l82.a && this.b == l82.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.b;
        int i2 = this.a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.a + "x" + this.b;
    }
}
