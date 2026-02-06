package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Ux  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1131Ux {
    A02,
    A03;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 55);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-80, -77, -91, -88, -83, -78, -85, 4, -9, -13, -10, C8077mf.m};
    }

    static {
        A01();
    }
}
