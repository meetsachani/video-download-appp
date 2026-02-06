package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C7834lj1;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public enum M5 {
    A0D(A00(191, 5, 106)),
    A0B(A00(178, 5, 95)),
    A04(A00(109, 8, 91)),
    A0C(A00(C10997yd1.n2, 8, 25)),
    A08(A00(150, 10, 89)),
    A0A(A00(C7834lj1.G, 9, 102)),
    A09(A00(160, 9, 13)),
    A05(A00(117, 7, 40)),
    A06(A00(124, 13, 36)),
    A07(A00(C3503Kz.a0, 13, 39)),
    A0E(A00(196, 22, 1));
    
    public static byte[] A01;
    public static String[] A02 = {"oCsQT6uSz7ndvPMuhNCnHwcy1cykmRIP", "dxQgW1fHfG7Li9QwjA", "TlDnXloLJlBDv", "qrnaS13DqrzNxoM4SqOtGSj6SkXXKDQP", "QLSlnpUZPESqj81ZgNRIADff9IPI", "BL2v8T5j9auQgeZuOiJA3Si6ird26Og", "iKYEyte3TNWgl6dOfYC56N4OH", "66RXzOK8gCySKfU5jrDKZ2dh9bBiLsuP"};
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 93);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C2638Cg0.v7, C2638Cg0.u7, C2638Cg0.n7, -43, -37, C2638Cg0.E7, C2638Cg0.x7, -46, -42, -37, -44, -36, C2638Cg0.C7, C2638Cg0.n7, -41, C8077mf.D, 31, C8077mf.B, 32, C3307Iz.X, 28, C8077mf.E, 54, 32, 36, C8077mf.B, C8077mf.H, 28, C2638Cg0.v7, C2638Cg0.z7, C2638Cg0.u7, C2638Cg0.A7, -44, C2638Cg0.x7, C2638Cg0.w7, -27, -36, C2638Cg0.A7, C2638Cg0.w7, C2638Cg0.x7, -43, C8077mf.C, 40, C3307Iz.V, 52, C8077mf.G, C3307Iz.f0, C8077mf.A, C3307Iz.Z, C8077mf.H, C8077mf.C, -8, 7, 0, 19, -3, 1, -11, -5, -7, 32, 47, 40, 59, 50, C3307Iz.X, 32, C3307Iz.V, C3307Iz.c0, C8077mf.B, 28, C8077mf.r, C8077mf.z, C8077mf.x, C2638Cg0.A7, C2638Cg0.x7, C2638Cg0.o7, C2638Cg0.n7, C2638Cg0.o7, C2638Cg0.p7, C2638Cg0.x7, -60, -65, -78, -83, -82, -72, 32, 19, C8077mf.p, C8077mf.q, C8077mf.C, C3307Iz.a0, C8077mf.z, C8077mf.q, C8077mf.m, C8077mf.p, 19, C8077mf.B, 17, C3307Iz.a0, C8077mf.D, C8077mf.z, C8077mf.m, 35, C8077mf.m, C8077mf.n, C8077mf.z, C8077mf.q, C8077mf.E, C8077mf.C, 42, C3307Iz.Z, C3307Iz.e0, C3307Iz.c0, C8077mf.G, 36, -24, -19, -26, -18, -13, -22, -23, -28, -23, -30, -22, -17, -26, -27, -32, -22, -18, -30, -24, -26, -25, -20, -27, -19, -14, -23, -24, -29, -6, -19, -24, -23, -13, C8077mf.D, C3307Iz.a0, 34, C8077mf.y, C8077mf.H, 47, C8077mf.B, 40, 31, C8077mf.D, C2638Cg0.z7, -35, -42, C2638Cg0.v7, -45, -41, C2638Cg0.x7, -47, C2638Cg0.A7, C3307Iz.Z, 54, 47, 34, 57, C3307Iz.d0, C3307Iz.Z, 40, 50, C3307Iz.X, C3307Iz.a0, C8077mf.G, 35, C3307Iz.V, -26, -30, -41, -17, -41, C2638Cg0.n7, -30, -37, C4715Xk.i, 48, C3307Iz.c0, C3307Iz.d0, 54, -44, C2638Cg0.u7, C2638Cg0.q7, C2638Cg0.r7, C2638Cg0.y7, -67, C2638Cg0.w7, C2638Cg0.r7, -65, C2638Cg0.q7, C2638Cg0.u7, -52, C2638Cg0.s7, -67, C2638Cg0.z7, C2638Cg0.w7, -65, -41, -65, C2638Cg0.o7, C2638Cg0.w7, C2638Cg0.r7};
    }

    static {
        A01();
    }

    M5(String str) {
        this.A00 = str;
    }

    public final String A03() {
        return this.A00;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static M5[] valuesCustom() {
        Object clone = values().clone();
        String[] strArr = A02;
        if (strArr[7].charAt(31) != strArr[3].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "ymHT22Zq8hAPwyebTDebaq4ICrnV1cmD";
        strArr2[2] = "0dMwzo5EpOMJA";
        return (M5[]) clone;
    }
}
