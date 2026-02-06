package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;
import o.C3062Gl1;

/* renamed from: com.facebook.ads.redexgen.X.8V  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8V implements InterfaceC2006mF {
    public static byte[] A04;
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C8V A00(long j, long j2, HN hn, C04774v c04774v) {
        int A0I;
        long j3 = j2;
        c04774v.A0g(10);
        int A0C = c04774v.A0C();
        if (A0C <= 0) {
            return null;
        }
        int i = hn.A03;
        long A0U = C5C.A0U(A0C, (i >= 32000 ? 1152 : C3062Gl1.m) * 1000000, i);
        int A0M = c04774v.A0M();
        int A0M2 = c04774v.A0M();
        int A0M3 = c04774v.A0M();
        c04774v.A0g(2);
        long j4 = j3 + hn.A02;
        long[] jArr = new long[A0M];
        long[] jArr2 = new long[A0M];
        for (int i2 = 0; i2 < A0M; i2++) {
            jArr[i2] = (i2 * A0U) / A0M;
            jArr2[i2] = Math.max(j3, j4);
            switch (A0M3) {
                case 1:
                    A0I = c04774v.A0I();
                    break;
                case 2:
                    A0I = c04774v.A0M();
                    break;
                case 3:
                    A0I = c04774v.A0K();
                    break;
                case 4:
                    A0I = c04774v.A0L();
                    break;
                default:
                    return null;
            }
            j3 += A0I * A0M2;
        }
        if (j != -1 && j != j3) {
            AbstractC04624g.A07(A01(27, 10, 89), A01(2, 25, 50) + j + A01(0, 2, 80) + j3);
        }
        return new C8V(jArr, jArr2, A0U, j3);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-89, -101, -77, -97, -81, -90, 125, C2638Cg0.p7, -66, -47, -66, 125, -48, C2638Cg0.t7, -41, C2638Cg0.q7, 125, C2638Cg0.w7, C2638Cg0.t7, -48, C2638Cg0.w7, -66, -47, C2638Cg0.o7, C2638Cg0.s7, -105, 125, C2638Cg0.B7, -26, -10, -19, -41, -23, -23, -17, -23, -10};
    }

    public C8V(long[] jArr, long[] jArr2, long j, long j2) {
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2006mF
    public final long A7j() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final long A7t() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final HX A91(long j) {
        int A0L = C5C.A0L(this.A03, j, true, true);
        HZ hz = new HZ(this.A03[A0L], this.A02[A0L]);
        int tableIndex = (hz.A01 > j ? 1 : (hz.A01 == j ? 0 : -1));
        if (tableIndex < 0) {
            int tableIndex2 = this.A03.length;
            if (A0L != tableIndex2 - 1) {
                int tableIndex3 = A0L + 1;
                long j2 = this.A03[tableIndex3];
                int tableIndex4 = A0L + 1;
                HZ nextSeekPoint = new HZ(j2, this.A02[tableIndex4]);
                return new HX(hz, nextSeekPoint);
            }
        }
        return new HX(hz);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC2006mF
    public final long A9H(long j) {
        return this.A03[C5C.A0L(this.A02, j, true, true)];
    }

    @Override // com.facebook.ads.redexgen.X.HY
    public final boolean AAj() {
        return true;
    }
}
