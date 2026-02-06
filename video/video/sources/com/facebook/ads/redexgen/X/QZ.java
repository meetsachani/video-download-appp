package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public class QZ {
    public static byte[] A06;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public RK A04;
    public RK A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{118, 122, 60, 40, 53, 55, 2, 103, C8077mf.p, 2, 68, 80, 77, 79, 123, 31, 76, 64, C8077mf.p, 5, C8077mf.A, 40, C8077mf.q, C8077mf.n, 4, 5, C8077mf.u, 93, 86, 90, C8077mf.p, C8077mf.y, 34, 71, 71, 75, 31, 4, 50, 86, 109, 70, 79, 64, 73, 75, 103, 64, 72, 65, 85, 65, 66, 74, 102, 65, 66, 74, 75, 92, 19};
    }

    public QZ(RK rk, RK rk2) {
        this.A05 = rk;
        this.A04 = rk2;
    }

    public QZ(RK rk, RK rk2, int i, int i2, int i3, int i4) {
        this(rk, rk2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public final String toString() {
        return A00(40, 21, 109) + this.A05 + A00(16, 12, 35) + this.A04 + A00(0, 8, 25) + this.A00 + A00(8, 8, 97) + this.A01 + A00(28, 6, 57) + this.A02 + A00(34, 6, 40) + this.A03 + '}';
    }
}
