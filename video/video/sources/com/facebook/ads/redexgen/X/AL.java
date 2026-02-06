package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class AL extends C2168p5 {
    public static byte[] A01;
    public final String A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-11, C8077mf.D, 34, 13, C8077mf.B, C8077mf.y, C8077mf.r, -52, C8077mf.q, C8077mf.E, C8077mf.D, 32, 17, C8077mf.D, 32, -52, 32, C3307Iz.X, 28, 17, -26, -52};
    }

    public AL(String str, C04905i c04905i) {
        super(A01(0, 22, 85) + str, c04905i, 2003, 1);
        this.A00 = str;
    }
}
