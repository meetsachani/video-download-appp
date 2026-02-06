package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.Xy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1205Xy {
    A08(0),
    A07(0),
    A06(1),
    A03(2),
    A04(3),
    A05(4);
    
    public static byte[] A01;
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C2638Cg0.p7, C2638Cg0.r7, -74, -67, C2638Cg0.o7, -71, -45, -90, -69, -47, -45, C2638Cg0.t7, C2638Cg0.y7, -48, C2638Cg0.v7, -29, -73, C2638Cg0.x7, -97, -95, -108, -101, -98, -105, -79, -122, -103, -74, -72, -85, -78, -75, -82, -56, -78, -73, -67, -82, -69, -73, -82, -67, Byte.MAX_VALUE, Byte.MIN_VALUE, Byte.MAX_VALUE, 118, -67, -74, -77, -74, -73, -65, -74};
    }

    static {
        A01();
    }

    EnumC1205Xy(int i) {
        this.A00 = i;
    }
}
