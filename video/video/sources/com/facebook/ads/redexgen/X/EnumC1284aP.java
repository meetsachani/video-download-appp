package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.aP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1284aP {
    A03,
    A02,
    A04;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{75, 78, 85, 73, 66, 69, 67, 73, 79, 49, 32, 55, 54, 59, C3307Iz.Y, C3307Iz.e0, 62, 59, 60, 55, C3307Iz.e0, 36, 67, 107, 122, 109, 108, 97, 124, 119, 100, 97, 102, 109, 119, 126, C8077mf.D, 119, 105, 102, 97, 101, 105, 124, 97, 103, 102};
    }

    static {
        A01();
    }
}
