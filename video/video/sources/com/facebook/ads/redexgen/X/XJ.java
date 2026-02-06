package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public enum XJ {
    A04,
    A03,
    A02;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{99, 100, 99, 126, 99, 107, 102, 99, 112, 111, 110, C8077mf.u, C8077mf.y, C8077mf.u, C8077mf.q, C8077mf.u, C8077mf.D, C8077mf.A, C8077mf.u, 1, C8077mf.u, C8077mf.y, 28, C8077mf.B, C8077mf.C, 2, 9, 31, C8077mf.B, 31, 2, 31, C8077mf.A, C8077mf.D, 31, C8077mf.n, 19, C8077mf.u};
    }

    static {
        A01();
    }
}
