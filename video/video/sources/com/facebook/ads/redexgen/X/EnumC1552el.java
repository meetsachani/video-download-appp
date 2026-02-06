package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.el  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1552el {
    A06(101),
    A09(102),
    A0A(103),
    A07(104),
    A08(105),
    A05(106),
    A04(107),
    A03(108);
    
    public static byte[] A01;
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-67, -52, C2638Cg0.s7, C2638Cg0.n7, C2638Cg0.p7, -46, -69, C2638Cg0.x7, C2638Cg0.q7, -67, C2638Cg0.n7, -56, C2638Cg0.u7, C2638Cg0.n7, -67, -66, -52, C2638Cg0.y7, C2638Cg0.x7, -56, -46, -20, -5, -12, 7, -16, 1, -22, -6, -15, -20, 7, -5, -13, -15, -8, -66, C2638Cg0.y7, -60, -60, C2638Cg0.x7, -69, C2638Cg0.w7, -67, -67, C2638Cg0.t7, -41, C2638Cg0.z7, C2638Cg0.p7, -68, -67, C2638Cg0.u7, -41, C2638Cg0.z7, C2638Cg0.p7, -67, C2638Cg0.A7, -41, C2638Cg0.u7, C2638Cg0.t7, -41, -68, -67, C2638Cg0.x7, -52, C2638Cg0.w7, C2638Cg0.u7, -47, 2, 7, 13, -2, C8077mf.m, C8077mf.n, 13, 2, 13, 2, -6, 5, C8077mf.B, C8077mf.q, 2, -3, -2, 8, C8077mf.B, C8077mf.q, 2, -2, C8077mf.r, C8077mf.B, -3, -2, C8077mf.n, 13, C8077mf.m, 8, C8077mf.u, C8077mf.r, 7, C8077mf.C, C3307Iz.V, C8077mf.B, C8077mf.m, 6, 7, 17, C3307Iz.V, C8077mf.m, C8077mf.r, C8077mf.z, 7, C8077mf.x, C8077mf.y, C8077mf.z, C8077mf.m, C8077mf.z, C8077mf.m, 3, C8077mf.p, C3307Iz.V, C8077mf.r, 9, C8077mf.z, C3307Iz.V, 4, C8077mf.A, C8077mf.z, C8077mf.z, 17, C8077mf.r, 7, -2, C8077mf.r, C8077mf.B, C8077mf.q, 2, -3, -2, 8, C8077mf.B, 2, 7, 13, -2, C8077mf.m, C8077mf.n, 13, 2, 13, 2, -6, 5, C8077mf.B, 13, 8, 8, 5, -5, -6, C8077mf.m, C8077mf.B, -4, 5, 8, C8077mf.n, -2, C8077mf.B, -4, 5, 2, -4, 4, -2, -3, -35, -48, -30, -52, -35, C2638Cg0.A7, -48, C2638Cg0.A7, -22, C2638Cg0.C7, -44, C2638Cg0.A7, -48, C2638Cg0.B7, -22, -33, C2638Cg0.B7, C2638Cg0.B7, -41, C2638Cg0.y7, -52, -35, -22, C2638Cg0.z7, -41, C2638Cg0.B7, -34, -48, -22, C2638Cg0.z7, -41, -44, C2638Cg0.z7, -42, -48, C2638Cg0.A7, C2638Cg0.E7, -47, C2638Cg0.A7, -42, -27, -42, -46, -37, C2638Cg0.y7, C2638Cg0.A7, -44};
    }

    static {
        A01();
    }

    EnumC1552el(int i) {
        this.A00 = i;
    }

    public final int A03() {
        return this.A00;
    }
}
