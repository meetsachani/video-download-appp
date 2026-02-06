package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.fm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1615fm {
    A04,
    A08,
    A07,
    A0A,
    A05,
    A02,
    A06,
    A03,
    A09;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-11, 8, -7, -7, -8, 5, -4, 1, -6, -27, -14, -14, -17, -14, -8, -13, -5, -12, -21, -36, -16, -18, -32, -33, C8077mf.n, 8, -3, C8077mf.y, -2, -3, -1, 7, C8077mf.E, -1, C8077mf.m, 9, C8077mf.n, 8, 1, C8077mf.r, 1, 0, -23, -21, -34, -23, C2638Cg0.B7, -21, -34, -35, 47, 49, 36, 47, 32, 49, 40, C3307Iz.e0, C3307Iz.Y, 19, C8077mf.m, 9, C8077mf.r, C8077mf.r, 5, 4, -14, -13, -32, -15, -13, -28, -29};
    }

    static {
        A01();
    }
}
