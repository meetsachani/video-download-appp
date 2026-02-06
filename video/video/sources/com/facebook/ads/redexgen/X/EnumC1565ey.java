package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.ey  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1565ey {
    A04(A00(147, 33, 22)),
    A05(A00(180, 36, 110)),
    A06(A00(216, 29, 107)),
    A03(A00(78, 32, 92)),
    A07(A00(110, 37, 90));
    
    public static byte[] A01;
    public String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C8077mf.x, 7, C8077mf.D, C8077mf.q, 28, C8077mf.m, C3307Iz.X, 7, 10, C3307Iz.X, 9, C8077mf.u, C8077mf.q, 9, 17, C2638Cg0.p7, -76, C2638Cg0.u7, -68, C2638Cg0.v7, -72, -46, -74, C2638Cg0.q7, C2638Cg0.o7, C2638Cg0.r7, -65, -72, C2638Cg0.u7, -72, -35, -48, -29, C2638Cg0.n7, -27, -44, -18, -44, -35, -45, -18, -48, -46, -29, C2638Cg0.n7, -27, C2638Cg0.n7, -29, -24, -35, -48, -29, C2638Cg0.n7, -27, -44, -18, -44, C2638Cg0.C7, C2638Cg0.C7, -34, C2638Cg0.C7, C2638Cg0.E7, -52, -33, -44, C2638Cg0.C7, -48, -22, -44, C2638Cg0.n7, -37, -35, -48, -34, -34, -44, C2638Cg0.B7, C2638Cg0.E7, C3307Iz.a0, 53, 51, -12, C3307Iz.d0, C3307Iz.Z, C3307Iz.a0, C3307Iz.c0, 40, 53, 53, 49, -12, C3307Iz.Z, 42, 57, -12, 52, C3307Iz.Z, 58, 47, 60, C3307Iz.c0, -12, C3307Iz.Z, 42, C3307Iz.X, C3307Iz.a0, 50, 47, C3307Iz.a0, 49, C3307Iz.Z, 51, 49, -14, 42, C3307Iz.X, C3307Iz.Z, C3307Iz.a0, C3307Iz.Y, 51, 51, 47, -14, C3307Iz.X, 40, 55, -14, 50, C3307Iz.X, 56, C3307Iz.e0, 58, C3307Iz.a0, -14, C3307Iz.X, 40, 35, C3307Iz.e0, 49, 52, 54, C3307Iz.a0, 55, 55, C3307Iz.e0, 51, 50, -29, -17, -19, -82, -26, C2638Cg0.C7, -29, -27, -30, -17, -17, -21, -82, C2638Cg0.C7, -28, -13, -82, -18, C2638Cg0.C7, -12, -23, -10, -27, -82, -29, -17, -19, -16, -20, -27, -12, -27, -28, 59, 71, 69, 6, 62, 57, 59, C4715Xk.i, 58, 71, 71, 67, 6, 57, 60, 75, 6, 70, 57, 76, 65, 78, C4715Xk.i, 6, C4715Xk.i, 70, 60, 55, 57, 59, 76, 65, 78, 65, 76, 81, 56, 68, 66, 3, 59, 54, 56, 58, 55, 68, 68, 64, 3, 54, 57, 72, 3, 67, 54, 73, 62, 75, 58, 3, 58, 71, 71, 68, 71};
    }

    static {
        A01();
    }

    EnumC1565ey(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }
}
