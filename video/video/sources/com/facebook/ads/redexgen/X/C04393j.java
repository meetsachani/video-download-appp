package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;

/* renamed from: com.facebook.ads.redexgen.X.3j  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04393j extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 53);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 104, 110, 103, 104, 98, 106, 99, 98, C3307Iz.Y, 96, 105, 116, 107, 103, 114, 60, C3307Iz.Y};
    }

    public C04393j(C04383i c04383i) {
        super(A00(0, 18, 51) + c04383i);
    }
}
