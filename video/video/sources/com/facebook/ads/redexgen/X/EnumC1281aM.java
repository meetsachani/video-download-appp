package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.aM  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1281aM {
    A03,
    A02,
    A07,
    A06,
    A04,
    A05;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{35, 40, 34, 57, C3307Iz.X, C3307Iz.Z, 52, 34, 2, 13, C8077mf.z, C8077mf.A, C8077mf.r, C8077mf.E, 7, 5, C8077mf.z, 0, C3307Iz.X, C3307Iz.e0, C3307Iz.d0, C3307Iz.V, C4715Xk.i, C3307Iz.X, 55, 58, C3307Iz.e0, C3307Iz.c0, 60, C3307Iz.a0, C3307Iz.Y, 47, 36, C3307Iz.e0, 78, 65, 84, 73, 86, 69, C3307Iz.V, 35, 52, C3307Iz.f0, 35, 52, C3307Iz.Y, 48, 35, 53, C3307Iz.f0, 34, 50, 35, 52, 52, ED2.a, 87, 64, 82, 68, 87, 65, 90, 86, 80, 70, 70, 64, 86, 86, 90, 86, 70, 87, 64, 64, 75};
    }

    static {
        A01();
    }
}
