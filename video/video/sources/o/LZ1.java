package o;

@Deprecated
/* loaded from: classes2.dex */
public final class LZ1 {
    public static final LZ1 c;
    public static final LZ1 d;
    public static final LZ1 e;
    public static final LZ1 f;
    public static final LZ1 g;
    public final long a;
    public final long b;

    static {
        LZ1 lz1 = new LZ1(0L, 0L);
        c = lz1;
        d = new LZ1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new LZ1(Long.MAX_VALUE, 0L);
        f = new LZ1(0L, Long.MAX_VALUE);
        g = lz1;
    }

    public LZ1(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.a(z);
        C9542sf.a(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long a(long j, long j2, long j3) {
        boolean z;
        long j4 = this.a;
        if (j4 == 0 && this.b == 0) {
            return j;
        }
        long N1 = TD2.N1(j, j4, Long.MIN_VALUE);
        long f2 = TD2.f(j, this.b, Long.MAX_VALUE);
        boolean z2 = false;
        if (N1 <= j2 && j2 <= f2) {
            z = true;
        } else {
            z = false;
        }
        if (N1 <= j3 && j3 <= f2) {
            z2 = true;
        }
        if (z && z2) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
        } else {
            if (!z) {
                if (z2) {
                    return j3;
                }
                return N1;
            }
            return j2;
        }
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LZ1.class == obj.getClass()) {
            LZ1 lz1 = (LZ1) obj;
            if (this.a == lz1.a && this.b == lz1.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
