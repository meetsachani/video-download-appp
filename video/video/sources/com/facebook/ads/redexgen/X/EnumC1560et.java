package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.et  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1560et {
    A03,
    A04,
    A02;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-75, C2638Cg0.v7, -56, C2638Cg0.r7, -45, C2638Cg0.u7, -56, -75, C2638Cg0.t7, -56, -71, -72, -27, -26, -21, -10, -22, -21, C2638Cg0.n7, -23, -21, -36, -37, C2638Cg0.r7, C2638Cg0.p7, -77, C2638Cg0.o7, C2638Cg0.y7, C2638Cg0.p7, C2638Cg0.q7, -81, C2638Cg0.o7, C2638Cg0.q7, -77, -78};
    }

    static {
        A01();
    }
}
