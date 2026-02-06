package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;
import o.C4715Xk;

/* loaded from: assets/audience_network/classes2.dex */
public enum NE {
    A03(A00(13, 3, 104)),
    A05(A00(22, 4, 126)),
    A04(A00(16, 6, 26));
    
    public static byte[] A01;
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-52, -41, -41, -56, -68, C2638Cg0.v7, -48, -68, C2638Cg0.u7, C4715Xk.i, 62, C4715Xk.i, 52, 58, 69, 69, -8, -20, -7, 0, -20, -9, 93, 94, 93, 84};
    }

    static {
        A01();
    }

    NE(String str) {
        this.A00 = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
