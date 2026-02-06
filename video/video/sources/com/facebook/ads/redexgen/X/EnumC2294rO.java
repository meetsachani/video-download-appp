package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.rO  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC2294rO {
    A02,
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
        A00 = new byte[]{79, 68, 87, 68, 83, 94, 83, 68, 70, 72, 82, 85, 68, 83, 68, 69, 115, 100, 102, 104, 114, 117, 100, 115, 100, 101, C8077mf.p, C8077mf.y, 9, C8077mf.H, 28, C8077mf.u, 8, C8077mf.q, C8077mf.H, 9, C8077mf.H, 31};
    }

    static {
        A01();
    }
}
