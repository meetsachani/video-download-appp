package o;

@Deprecated
/* loaded from: classes2.dex */
public final class MZ1 {
    public static final MZ1 c = new MZ1(0, 0);
    public final long a;
    public final long b;

    public MZ1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MZ1.class == obj.getClass()) {
            MZ1 mz1 = (MZ1) obj;
            if (this.a == mz1.a && this.b == mz1.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public String toString() {
        return "[timeUs=" + this.a + ", position=" + this.b + C6566gU0.g;
    }
}
