package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.eK  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1526eK {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 71);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-102, -110, -106, -107, -110, -108, -45, -30, -30, -47, -32, -45, -33, -41, -10, -9, 8, -5, -11, -9, -15, -1, 1, -10, -9, -2, C2638Cg0.E7, -36, -48, C2638Cg0.z7, C2638Cg0.E7, -46, -65, C2638Cg0.r7, C3307Iz.Y, 42, C8077mf.z, C3307Iz.e0, 28, C3307Iz.a0, -10, -25, -8, -6, -12, -21, -8, -27, -21, -12, -22, -10, -11, -17, -12, -6, C2638Cg0.C7, -35, -46, -22, -46, -45, -35, -42, -48, -33, -46, -34, -42, -56, -72, C2638Cg0.u7, -70, -70, C2638Cg0.r7, -76, -67, -70, -66, -68, -67, C2638Cg0.v7, C8077mf.z, 6, C8077mf.y, 8, 8, 17, 2, C8077mf.D, C8077mf.n, 7, C8077mf.A, C8077mf.m, -19, -34, -27, C2638Cg0.E7, -16, -33, -20, -19, -29, -23, -24, -1, -15, -1, -1, -11, -5, -6, -21, -11, -16};
    }

    public static Map<String, String> A01(T8 t8, String str, String str2) {
        HashMap hashMap = new HashMap();
        C1096To c1096To = new C1096To(t8);
        int i = t8.getResources().getDisplayMetrics().widthPixels;
        int i2 = t8.getResources().getDisplayMetrics().heightPixels;
        hashMap.put(A00(105, 10, 69), t8.A09().A02());
        hashMap.put(A00(56, 13, 42), str2);
        hashMap.put(A00(40, 16, 63), str);
        hashMap.put(A00(14, 12, 75), String.valueOf(c1096To.A09()));
        hashMap.put(A00(82, 12, 92), String.valueOf((int) (i / XX.A02)));
        hashMap.put(A00(69, 13, 14), String.valueOf((int) (i2 / XX.A02)));
        hashMap.put(A00(32, 2, 9), t8.A05().A9S());
        hashMap.put(A00(34, 6, 112), C1096To.A04);
        hashMap.put(A00(26, 6, 38), Locale.getDefault().toString());
        hashMap.put(A00(94, 11, 51), A00(0, 6, 29));
        hashMap.put(A00(6, 8, 43), c1096To.A05());
        return hashMap;
    }
}
