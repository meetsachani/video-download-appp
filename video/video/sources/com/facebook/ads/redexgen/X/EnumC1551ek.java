package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.ek  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1551ek {
    A06(0),
    A08(1),
    A09(2),
    A03(3),
    A05(4),
    A07(5),
    A04(6),
    A0A(7),
    A0B(10);
    
    public static byte[] A01;
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C2638Cg0.n7, -35, C2638Cg0.z7, -48, C2638Cg0.n7, -41, -56, -90, -105, -85, -87, -101, -67, -71, -82, C2638Cg0.t7, -24, -37, -23, -21, -29, -37, -36, -44, -46, C2638Cg0.E7, C2638Cg0.C7, -42, C2638Cg0.B7, -46, -24, C2638Cg0.C7, -32, -24, -25, C2638Cg0.n7, -5, -18, -22, -4, -26, -25, -15, -22, 4, -18, -14, -11, -9, -22, -8, -8, -18, -12, -13};
    }

    static {
        A01();
    }

    EnumC1551ek(int i) {
        this.A00 = i;
    }
}
