package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.Xw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1203Xw {
    A02,
    A03;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-79, -78, -77, -82, C2638Cg0.q7, -71, C2638Cg0.p7, -22, -7, -16, -16, 3, -9, -25, -10, -23, -23, -14};
    }

    static {
        A01();
    }
}
