package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public class BX extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, 19, C8077mf.E, C8077mf.H, C8077mf.A, C8077mf.z, 82, 6, C8077mf.G, 82, 3, 7, C8077mf.A, 0, C8077mf.m, 82, 7, 28, C8077mf.z, C8077mf.A, 0, C8077mf.H, C8077mf.m, C8077mf.E, 28, C8077mf.y, 82, 31, C8077mf.A, C8077mf.z, C8077mf.E, 19, 82, 17, C8077mf.G, C8077mf.z, C8077mf.A, 17, 1};
    }

    public BX(Throwable th) {
        super(A00(0, 39, 35), th);
    }
}
