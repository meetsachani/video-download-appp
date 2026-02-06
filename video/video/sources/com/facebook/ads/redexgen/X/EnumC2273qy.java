package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.qy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC2273qy {
    A02,
    A05,
    A03,
    A04;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{C8077mf.p, 3, C8077mf.B, C8077mf.p, C8077mf.z, 28, 88, 84, 76, 87, 80, 59, 48, 35, 48, C3307Iz.Z, 109, 118, 115, 118, 119, 111, 118};
    }

    static {
        A01();
    }
}
