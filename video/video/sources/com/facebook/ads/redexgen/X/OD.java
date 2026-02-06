package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public enum OD {
    A02,
    A06,
    A05,
    A07,
    A08,
    A03,
    A04;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{5, C8077mf.x, 3, 7, C8077mf.u, 3, 2, C8077mf.B, C8077mf.C, C8077mf.q, 8, C8077mf.p, 19, 5, C8077mf.C, C8077mf.B, 10, C8077mf.G, C8077mf.G, 0, C8077mf.G, 101, 102, 104, 109, 108, 109, 53, 54, 56, C4715Xk.i, 48, 55, 62, C3307Iz.f0, 53, 50, 42, 52, 51, 58, 28, 7, 0, C8077mf.B, 1};
    }

    static {
        A01();
    }
}
