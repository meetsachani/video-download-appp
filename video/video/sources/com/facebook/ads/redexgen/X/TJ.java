package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.AD1;
import o.C2638Cg0;
import o.CK1;

/* loaded from: assets/audience_network/classes2.dex */
public enum TJ {
    A08(9000, A00(0, 30, 12)),
    A06(3001, A00(160, 29, 104)),
    A05(AD1.m1, A00(125, 35, 75)),
    A07(AD1.n1, A00(CK1.w, 33, 88)),
    A04(AD1.o1, A00(90, 35, 54));
    
    public static byte[] A02;
    public final int A00;
    public final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{92, -119, 59, -112, -119, -122, -119, -118, -110, -119, 59, Byte.MIN_VALUE, -115, -115, -118, -115, 59, -125, 124, -114, 59, -118, 126, 126, -112, -115, -115, Byte.MIN_VALUE, Byte.MAX_VALUE, 73, -66, -69, C2638Cg0.z7, -69, -68, -69, C2638Cg0.y7, -65, C2638Cg0.E7, -66, -65, C2638Cg0.t7, -65, C2638Cg0.z7, -65, -105, -108, -89, -108, -107, -108, -90, -104, -78, -100, -95, -90, -104, -91, -89, 126, 123, -114, 123, 124, 123, -115, Byte.MAX_VALUE, -103, -115, Byte.MAX_VALUE, -122, Byte.MAX_VALUE, 125, -114, 101, 98, 117, 98, 99, 98, 116, 102, Byte.MIN_VALUE, 118, 113, 101, 98, 117, 102, -117, -90, -82, -79, -86, -87, 101, -71, -76, 101, -87, -86, -79, -86, -71, -86, 101, -73, -76, -68, 101, -85, -73, -76, -78, 101, -87, -90, -71, -90, -89, -90, -72, -86, 115, -96, -69, C2638Cg0.r7, C2638Cg0.t7, -65, -66, 122, C2638Cg0.z7, C2638Cg0.v7, 122, C2638Cg0.r7, -56, C2638Cg0.y7, -65, -52, C2638Cg0.z7, 122, -52, C2638Cg0.v7, -47, 122, C2638Cg0.r7, -56, C2638Cg0.z7, C2638Cg0.v7, 122, -66, -69, C2638Cg0.z7, -69, -68, -69, C2638Cg0.y7, -65, -120, -67, C2638Cg0.n7, -32, -29, -36, -37, -105, -21, -26, -105, -23, -36, C2638Cg0.n7, -37, -105, -35, -23, -26, -28, -105, -37, C2638Cg0.n7, -21, C2638Cg0.n7, C2638Cg0.E7, C2638Cg0.n7, -22, -36, -91, -83, -56, -48, -45, -52, C2638Cg0.x7, -121, -37, -42, -121, -36, -41, C2638Cg0.x7, -56, -37, -52, -121, C2638Cg0.E7, -42, -34, -121, -48, -43, -121, C2638Cg0.x7, -56, -37, -56, C2638Cg0.v7, -56, C2638Cg0.B7, -52, -107, 107, 100, 97, 100, 101, 109, 100};
    }

    static {
        A01();
    }

    TJ(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final int A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }
}
