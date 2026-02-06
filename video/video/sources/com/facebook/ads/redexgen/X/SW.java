package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public enum SW {
    A08,
    A04,
    A02,
    A06,
    A07,
    A05,
    A03,
    A09;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, C8077mf.q, C8077mf.B, C8077mf.m, 9, C8077mf.D, -32, C2638Cg0.y7, -32, -6, -17, -32, -18, -17, 57, 53, C3307Iz.Z, 52, C2638Cg0.w7, C2638Cg0.x7, -37, C2638Cg0.r7, C2638Cg0.v7, C2638Cg0.A7, C3307Iz.a0, 28, C8077mf.G, 35, 28, C8077mf.D, C3307Iz.c0, 32, C3307Iz.Y, C3307Iz.X, C3307Iz.Z, C8077mf.C, C3307Iz.Y, 42, C8077mf.G, C8077mf.A, C8077mf.C, 28, 17, 10, C8077mf.E, C8077mf.p, 13, 40, C8077mf.C, C8077mf.E, C8077mf.p, C8077mf.q, 28, 31, C8077mf.r, C8077mf.H, 31};
    }

    static {
        A01();
    }
}
