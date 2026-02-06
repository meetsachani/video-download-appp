package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Si  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1064Si {
    public static InterfaceC1065Sj A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 18);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-91, -88, -79, -90, -85, -80, -92, -75, -82};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C1064Si.class) {
            if (A00 == null) {
                return;
            }
            C1086Te c1086Te = new C1086Te(A00.AIb());
            c1086Te.A05(1);
            C1669ge A002 = T7.A00();
            if (A002 != null) {
                A002.A08().ABC(A00(0, 9, 49), 3401, c1086Te);
            }
            A00.reset();
        }
    }

    public static void A03(long j) {
        if (j > 0) {
            A00 = new C1682gr();
            new C1066Sk(j);
        }
    }
}
