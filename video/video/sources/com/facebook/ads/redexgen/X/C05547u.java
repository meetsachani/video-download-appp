package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.7u  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05547u {
    public final long A00;
    public final long A01;
    public static final C05547u A04 = new C05547u(0, 0);
    public static final C05547u A02 = new C05547u(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C05547u A06 = new C05547u(Long.MAX_VALUE, 0);
    public static final C05547u A05 = new C05547u(0, Long.MAX_VALUE);
    public static final C05547u A03 = A04;

    public C05547u(long j, long j2) {
        AbstractC04543y.A07(j >= 0);
        AbstractC04543y.A07(j2 >= 0);
        this.A01 = j;
        this.A00 = j2;
    }

    public final long A00(long minPositionUs, long j, long j2) {
        if (this.A01 == 0 && this.A00 == 0) {
            return minPositionUs;
        }
        long A0V = C5C.A0V(minPositionUs, this.A01, Long.MIN_VALUE);
        long A0S = C5C.A0S(minPositionUs, this.A00, Long.MAX_VALUE);
        boolean z = true;
        boolean z2 = A0V <= j && j <= A0S;
        z = (A0V > j2 || j2 > A0S) ? false : false;
        if (z2 && z) {
            long abs = Math.abs(j - minPositionUs);
            long maxPositionUs = Math.abs(j2 - minPositionUs);
            if (abs <= maxPositionUs) {
                return j;
            }
            return j2;
        } else if (z2) {
            return j;
        } else {
            if (z) {
                return j2;
            }
            return A0V;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C05547u c05547u = (C05547u) obj;
        return this.A01 == c05547u.A01 && this.A00 == c05547u.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
