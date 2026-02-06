package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;
import o.Xu2;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class T0 {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-47, -17, -15, -10, -13, -82, -14, -9, 1, -7, -82, -12, -17, -9, -6, 3, 0, -13, -68, -72, -42, C2638Cg0.n7, -35, C2638Cg0.B7, -107, C2638Cg0.E7, -34, -24, -32, -107, -24, -22, C2638Cg0.n7, C2638Cg0.n7, C2638Cg0.B7, -24, -24, -93, -7, C8077mf.A, C8077mf.C, C8077mf.H, C8077mf.E, -42, C8077mf.D, C3307Iz.X, C3307Iz.e0, 36, 34, C3307Iz.X, C8077mf.A, C8077mf.D, -42, 28, C8077mf.A, 31, 34, C3307Iz.c0, 40, C8077mf.E, -28, -80, C2638Cg0.z7, -48, -43, -46, -115, -43, -42, C2638Cg0.C7, -101, C2638Cg0.p7, -33, C2638Cg0.C7, -26, -29, -98, -21, -25, -15, -15, -84, 19, C8077mf.z, 17, C8077mf.y, 36, C8077mf.A, 19, C3307Iz.Y, C8077mf.E, 40, C8077mf.A, 17, C3307Iz.X, C8077mf.E, C3307Iz.d0, C8077mf.A, 17, C8077mf.x, C3307Iz.c0, C3307Iz.Y, C8077mf.A, C3307Iz.X, -33, -30, -35, C2638Cg0.C7, -16, -29, -33, -14, -25, -12, -29, -35, -14, -9, -18, -29, C8077mf.G, 32, C8077mf.E, 34, C3307Iz.c0, C3307Iz.f0, C3307Iz.a0, C8077mf.G, 48, C8077mf.E, 48, 53, C3307Iz.d0, C3307Iz.V, -10, -7, -12, 7, -6, 6, 10, -6, 8, 9, -12, -2, -7, 67, 86, 86, 71, 79, 82, 86, C8077mf.H, 28, C8077mf.H, 35, 32, ED2.a, C4715Xk.i, ED2.a, 68, 65, 59, ED2.a, 75, 74, 80, 65, 84, 80, -35, C2638Cg0.n7, -32, -29, -20, -23, -36, -42, -23, -36, C2638Cg0.n7, -22, -26, -27, C8077mf.A, C8077mf.E, C8077mf.q, C8077mf.y, 19, 28, 31, 17, C8077mf.x, C8077mf.q, 36, C8077mf.C, C8077mf.G, C8077mf.y, 70, 67, C4715Xk.i};
    }

    static {
        A01();
        A09 = T0.class.getSimpleName();
        A05 = AbstractC1085Td.A0o;
        A06 = AbstractC1085Td.A0s;
        A02 = AbstractC1085Td.A0l;
        A01 = AbstractC1085Td.A0k;
        A03 = AbstractC1085Td.A0m;
        A00 = AbstractC1085Td.A0i;
        A04 = AbstractC1085Td.A0n;
        A07 = AbstractC1085Td.A0t;
    }

    public static void A02(T8 t8, C1072Sq c1072Sq, int i, String str, long j) {
        if (!A06(t8)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c1072Sq.A01);
            jSONObject.put(A00(134, 13, 46), c1072Sq.A02);
            if (j > 0) {
                jSONObject.put(A00(191, 9, 73), Y1.A07(System.currentTimeMillis() - j));
            }
            C1086Te c1086Te = new C1086Te(str);
            c1086Te.A07(jSONObject);
            c1086Te.A05(1);
            t8.A08().ABD(A00(C3503Kz.n0, 5, 84), i, c1086Te);
        } catch (Throwable deLogException) {
            t8.A08().A4I(deLogException);
        }
    }

    public static void A03(T8 t8, C1077Sv c1077Sv, String str, int i, String str2, Long l, Long l2) {
        if (A06(t8)) {
            A05(t8, c1077Sv.A06, c1077Sv.A07, c1077Sv.A08, A00(C10997yd1.Q1, 5, 71), str, i, str2, l, l2, null);
        }
    }

    public static void A04(T8 t8, C1081Sz c1081Sz, boolean z) {
        if (!A06(t8)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), c1081Sz.A01);
            jSONObject.put(A00(134, 13, 46), c1081Sz.A03);
            jSONObject.put(A00(104, 16, 23), c1081Sz.A02);
            jSONObject.put(A00(159, 13, 117), c1081Sz.A00);
            if (C1123Up.A2T(t8)) {
                jSONObject.put(A00(200, 3, 106), c1081Sz.A04);
            }
            String A002 = z ? A00(61, 10, 6) : A00(71, 11, 23);
            int i = z ? A05 : A06;
            C1086Te c1086Te = new C1086Te(A002);
            c1086Te.A07(jSONObject);
            c1086Te.A05(1);
            t8.A08().ABD(A00(C3503Kz.n0, 5, 84), i, c1086Te);
        } catch (Throwable th) {
            t8.A08().A4I(th);
        }
    }

    public static void A05(T8 t8, String str, String str2, String str3, String str4, String str5, int i, String str6, Long l, Long l2, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 85), str);
            jSONObject.put(A00(134, 13, 46), str2);
            jSONObject.put(A00(104, 16, 23), str4);
            if (str6 != null) {
                jSONObject.put(A00(Xu2.K, 14, 16), str6);
            }
            if (l != null) {
                jSONObject.put(A00(82, 22, 75), String.valueOf(l));
            }
            if (l2 != null) {
                jSONObject.put(A00(191, 9, 73), String.valueOf(l2));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, 123), String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, 117), str5);
            if (C1123Up.A2T(t8)) {
                jSONObject.put(A00(200, 3, 106), str3);
            }
            String A002 = A00(19, 19, 14);
            if (i == A03) {
                A002 = A00(38, 23, 79);
            } else if (i == A01) {
                A002 = A00(0, 19, 39);
            }
            C1086Te c1086Te = new C1086Te(A002);
            c1086Te.A07(jSONObject);
            c1086Te.A05(1);
            t8.A08().ABD(A00(C3503Kz.n0, 5, 84), i, c1086Te);
        } catch (Throwable th) {
            t8.A08().A4I(th);
        }
    }

    public static boolean A06(T8 t8) {
        int A062;
        if (t8.A05().AAO()) {
            A062 = 1;
        } else {
            A062 = AbstractC1125Ur.A06(t8);
        }
        if (A062 == 0) {
            return false;
        }
        return A062 <= 0 || t8.A09().A00() <= 1.0d / ((double) A062);
    }
}
