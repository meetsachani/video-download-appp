package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C4715Xk;
import o.C4731Xo;
import o.C8077mf;
import o.C8463oE0;
import o.C9680tD0;
import o.Xu2;

/* renamed from: com.facebook.ads.redexgen.X.nS  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2068nS implements EP {
    public static byte[] A00;
    public static String[] A01 = {"RZM4uVKUom5lpktBJEyc25x7FZDN3vpb", "gyiT966obFesLv2pc6lrzZfv63yxEjKJ", "VIDunhCfmmrKAvVQDuOofVowNsnrOYKS", "mSpbf5NAYyyPHT1f9KFsrup9mcKoYOHE", "zbmZ0JzF4Zq1L7424UboTB7UCymQSbun", "dFdj", "MzILoqUyJ5XWrj98JXnqdIxQxE4zJ", "8Kz26tJHiwFUzLhIg6rooXB"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 94);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-34, 17, 17, 2, 10, 13, 17, 2, 1, -67, 17, C8077mf.n, -67, 0, C8077mf.q, 2, -2, 17, 2, -67, 1, 2, 0, C8077mf.n, 1, 2, C8077mf.q, -67, 3, C8077mf.n, C8077mf.q, -67, C8077mf.u, C8077mf.m, C8077mf.r, C8077mf.u, 13, 13, C8077mf.n, C8077mf.q, 17, 2, 1, -67, -22, -26, -22, -30, -67, 17, C8077mf.z, 13, 2, -41, -67, 19, 34, 34, C8077mf.H, C8077mf.E, C8077mf.y, 19, C3307Iz.Y, C8077mf.E, C3307Iz.V, 32, C2638Cg0.C7, C8077mf.y, C8077mf.A, 19, -33, -24, -30, -22, C8077mf.G, C3307Iz.d0, C3307Iz.d0, 40, C3307Iz.X, 31, C8077mf.G, 48, C3307Iz.X, C3307Iz.c0, 42, -21, 31, C3307Iz.V, C8077mf.G, -23, -13, -20, -12, -56, -41, -41, -45, -48, C2638Cg0.w7, -56, -37, -48, -42, -43, -106, C2638Cg0.x7, -35, C2638Cg0.v7, C2638Cg0.B7, -36, C2638Cg0.v7, C2638Cg0.B7, -3, C8077mf.n, C8077mf.n, 8, 5, -1, -3, C8077mf.r, 5, C8077mf.m, 10, C2638Cg0.x7, C8077mf.n, 3, C8077mf.q, 59, 74, 74, 70, 67, C4715Xk.i, 59, 78, 67, 73, 72, 9, 78, 78, 71, 70, 5, 82, 71, 70, -35, -20, -20, -24, -27, -33, -35, -16, -27, -21, -22, -85, -12, -87, -23, -20, -80, -87, -33, C2638Cg0.C7, -35, -87, -78, -84, -76, C8077mf.q, C8077mf.H, C8077mf.H, C8077mf.D, C8077mf.A, 17, C8077mf.q, 34, C8077mf.A, C8077mf.G, 28, -35, C3307Iz.Y, -37, C8077mf.E, C8077mf.H, -30, -37, 36, 34, 34, -32, -17, -17, -21, -24, -30, -32, -13, -24, -18, -19, -82, -9, -84, -16, -12, -24, -30, -22, -13, -24, -20, -28, -84, -13, -9, -78, -26, C2638Cg0.v7, C2638Cg0.n7, C2638Cg0.n7, -44, -47, C2638Cg0.x7, C2638Cg0.v7, -36, -47, -41, -42, -105, -32, -107, -37, -35, C2638Cg0.w7, C2638Cg0.B7, -47, C2638Cg0.n7, -16, C2638Cg0.C7, -12, -16, -85, -14, -16, -16, C4715Xk.i, C3307Iz.f0, 65, C4715Xk.i, -8, 65, -10, C3307Iz.f0, 65, 56, 57, 53, 42, 66, C3307Iz.f0, 59, -10, C3307Iz.d0, 62, C3307Iz.f0, 60, -45, -60, -41, -45, -114, -41, -116, -46, -46, C2638Cg0.o7};
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.X.EP
    public final InterfaceC1981lq A5K(C2242qI c2242qI) {
        char c;
        String str = c2242qI.A0W;
        if (str != null) {
            switch (str.hashCode()) {
                case 1201784583:
                    String mimeType = A00(C9680tD0.j, 21, 107);
                    if (str.equals(mimeType)) {
                        c = 0;
                        break;
                    }
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return new C9k();
            }
        }
        StringBuilder sb = new StringBuilder();
        String mimeType2 = A00(0, 55, 63);
        throw new IllegalArgumentException(sb.append(mimeType2).append(str).toString());
    }

    @Override // com.facebook.ads.redexgen.X.EP
    public final boolean AKN(C2242qI c2242qI) {
        String str = c2242qI.A0W;
        String mimeType = A00(C10997yd1.o2, 8, 30);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(C4731Xo.d1, 10, 1);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(127, 20, 124);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(Xu2.K, 21, 80);
                    if (!mimeType4.equals(str)) {
                        String[] strArr = A01;
                        String str2 = strArr[6];
                        String mimeType5 = strArr[7];
                        if (str2.length() != mimeType5.length()) {
                            A01[4] = "ilKJ2fcQQU31mDfBW0rq4wTAOnRwqntF";
                            String mimeType6 = A00(221, 20, 10);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(C8463oE0.u, 28, 33);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(55, 19, 84);
                                    boolean equals = mimeType8.equals(str);
                                    String mimeType9 = A01[5];
                                    if (mimeType9.length() == 4) {
                                        String[] strArr2 = A01;
                                        strArr2[3] = "zagSEBYMwAryKt6uIWB8fghbt3YyxLCs";
                                        strArr2[0] = "njnOkrTqvKyYsDLdiJrWbCfOV0ebYkea";
                                        if (!equals) {
                                            String mimeType10 = A00(147, 25, 30);
                                            if (!mimeType10.equals(str)) {
                                                String mimeType11 = A00(74, 19, 94);
                                                if (!mimeType11.equals(str)) {
                                                    String mimeType12 = A00(93, 19, 9);
                                                    if (!mimeType12.equals(str)) {
                                                        String mimeType13 = A00(112, 15, 62);
                                                        if (!mimeType13.equals(str)) {
                                                            String mimeType14 = A00(C9680tD0.j, 21, 107);
                                                            if (!mimeType14.equals(str)) {
                                                                return false;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                }
            }
        }
        return true;
    }
}
