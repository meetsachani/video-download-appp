package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.0E  reason: invalid class name */
/* loaded from: assets/audience_network/classes.dex */
public enum C0E {
    A07,
    A0A,
    A0F,
    A04,
    A0E,
    A0D,
    A0G,
    A03,
    A0B,
    A05,
    A08,
    A0H,
    A06,
    A09,
    A0C,
    A02;
    
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{116, 121, 121, 35, 47, C3307Iz.f0, 51, 52, 50, 53, 35, 52, 47, 50, ED2.a, 50, C3307Iz.X, 51, 53, C3307Iz.d0, 52, 117, 104, 115, 117, 96, 100, 121, Byte.MAX_VALUE, 126, 111, 96, 113, 98, 113, 125, 117, 100, 117, 98, 123, 102, 110, 114, 119, 125, 119, 106, 97, 114, 113, 105, 123, 108, 97, 124, 113, 107, 112, 122, 122, 103, 111, 115, 118, 124, 118, 107, 96, 106, 111, 111, 122, 109, 96, 125, 112, 106, 113, 123, 4, C8077mf.m, 7, C8077mf.p, 6, 5, 1, 28, 0, 5, C8077mf.q, 5, C8077mf.B, 19, 0, 3, C8077mf.E, 9, C8077mf.H, 19, C8077mf.p, 3, C8077mf.C, 2, 8, C8077mf.E, 31, 2, C8077mf.H, C8077mf.E, 17, C8077mf.E, 6, 13, 7, 2, 2, C8077mf.A, 0, 13, C8077mf.r, C8077mf.G, 7, 28, C8077mf.z, 85, 86, 90, 88, 85, 70, 79, 88, 75, 80, 88, 91, 85, 92, 51, 48, 40, 58, C3307Iz.e0, 32, C4715Xk.i, 48, 42, 49, 59, C8077mf.m, C8077mf.r, C8077mf.n, 1, C8077mf.z, 19, 13, C8077mf.A, 1, 90, 75, 88, 75, 71, 79, 94, 79, 88, 4, 19, C8077mf.y, 19, 31, 0, 19, 4, 49, C3307Iz.Y, 48, C3307Iz.d0, 54, 49, 32, C3307Iz.Y, 60, 53, 34, 49, 42, 34, C3307Iz.V, 47, C3307Iz.Y, C8077mf.H, 9, C8077mf.B, C8077mf.C, C8077mf.H, 2, 54, 51, 51, C3307Iz.Y, 49, 60, C3307Iz.V, C3307Iz.d0, 54, C3307Iz.e0, C3307Iz.Z};
    }
}
