package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C8077mf;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.fJ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1586fJ {
    A03,
    A02,
    A05,
    A04;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{28, 19, C8077mf.x, C8077mf.r, 28, 9, C8077mf.B, C8077mf.C, 107, 100, 99, 103, 107, 126, 99, 100, 109, 107, 124, 111, 124, 107, 106, 124, 102, QC1.w, 119, 112, 116, QC1.w, 109, 124, 125, 91, 76, 95, 76, 91, 90, 76, 86, 72, 71, 64, 68, 72, 93, 64, 71, 78};
    }

    static {
        A01();
    }
}
