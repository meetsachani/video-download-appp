package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;

/* renamed from: com.facebook.ads.redexgen.X.lk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1975lk {
    A05,
    A04,
    A02,
    A03;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{48, 59, 58, 49, C3307Iz.a0, C3307Iz.f0, C3307Iz.Y, 35, 42, C3307Iz.c0, 55, 54, C3307Iz.e0, C3307Iz.Y, C3307Iz.c0, 60, 56, C4715Xk.i, 32, 101, 114, 118, 115, 110};
    }

    static {
        A01();
    }
}
