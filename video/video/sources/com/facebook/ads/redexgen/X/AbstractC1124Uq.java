package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.Arrays;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.ED2;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.Uq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1124Uq {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{58, ED2.a, 53, C3307Iz.d0, 4, 58, 53, ED2.a, C3307Iz.a0, 52, 50, ED2.a, 4, 58, 55, 55, 52, C3307Iz.d0, 4, 50, 58, 57, 4, 56, 52, 53, 47, 62, 35, 47, 4, C3307Iz.d0, C3307Iz.a0, 58, C3307Iz.c0, C3307Iz.c0, 62, C3307Iz.a0, 4, 56, C3307Iz.a0, 62, 58, 47, 50, 52, 53, 32, C3307Iz.X, 47, 54, C8077mf.H, 32, 47, C3307Iz.X, 51, C3307Iz.f0, 40, C3307Iz.X, C8077mf.H, 36, 47, 32, 35, C3307Iz.e0, 36, C8077mf.H, 40, 47, C8077mf.H, 32, 49, 49, C8077mf.H, 35, 51, C3307Iz.f0, 54, 50, 36, 51, C8077mf.H, C3307Iz.Z, 40, C3307Iz.e0, 36, C8077mf.H, 34, C3307Iz.a0, C3307Iz.f0, C3307Iz.f0, 50, 36, 51, C8077mf.m, C8077mf.p, 4, C8077mf.G, 53, C8077mf.m, 4, C8077mf.p, C8077mf.B, 5, 3, C8077mf.p, 53, C8077mf.q, 4, C8077mf.m, 8, 6, C8077mf.q, 53, 3, 4, 53, C8077mf.m, C8077mf.D, C8077mf.D, 53, 8, C8077mf.B, 5, C8077mf.G, C8077mf.C, C8077mf.q, C8077mf.B, 53, 4, C8077mf.m, 28, 3, 13, C8077mf.m, C8077mf.H, 3, 5, 4, 106, 111, 101, 124, 84, 106, 101, 111, 121, 100, 98, 111, 84, 98, 106, 105, 84, 98, 102, 123, 121, 100, 125, 110, 84, 105, 121, 100, 124, QC1.w, 98, 101, 108, 84, 104, 106, 123, 106, 105, 98, 103, 98, Byte.MAX_VALUE, 98, 110, QC1.w, 93, 88, 82, 75, 99, 89, 82, 93, 94, 80, 89, 99, 85, 93, 94};
    }

    public static boolean A02(Context context) {
        return C1123Up.A0V(context).A38(A00(0, 47, 121), true);
    }

    public static boolean A03(Context context) {
        return C1123Up.A0V(context).A38(A00(47, 47, 99), false);
    }

    public static boolean A04(Context context) {
        return C1123Up.A0V(context).A38(A00(C3503Kz.c0, 46, 41), false);
    }

    public static boolean A05(Context context) {
        return C1123Up.A0V(context).A38(A00(185, 15, 30), false);
    }

    public static boolean A06(Context context) {
        return C1123Up.A0V(context).A38(A00(94, 45, 72), false);
    }
}
