package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Wo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1171Wo {
    A05(0),
    A0D(1),
    A08(2),
    A0B(3),
    A09(4),
    A0C(5),
    A04(6),
    A0A(7),
    A06(8),
    A07(9);
    
    public static byte[] A01;
    public static String[] A02 = {"qsBFV4QzyJZ", "Un3rqFVsxSBnmkCaaN3XKlbCw4AYbFqb", "uS", "DU", "tTGntKCVfgII9xqsGpGrv4L0WmyWUOUj", "KWr2MioisOT1RP6pbxaLpNmtsO5qpX4q", "QPqS7MAagvQqYe50TQs3IlpOEHW3O171", "i9UHFEeYKrwiWF3GKw7x6guqyhTqAOKO"};
    public int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[4].charAt(8) == 'p') {
                throw new RuntimeException();
            }
            A02[4] = "bTRLSoLZMuaOSwXtpMMGEunxdgwN2gpY";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            int i5 = (copyOfRange[i4] - i3) - 94;
            String[] strArr = A02;
            if (strArr[2].length() != strArr[0].length()) {
                String[] strArr2 = A02;
                strArr2[6] = "ZL8DSguYajuR1eoXw1hG2lJW2j5bJdo3";
                strArr2[1] = "JhAlZD5OxJYpmdx1a1lzSlrIDQC8pEtq";
                copyOfRange[i4] = (byte) i5;
                i4++;
            } else {
                copyOfRange[i4] = (byte) i5;
                i4++;
            }
        }
    }

    public static void A01() {
        A01 = new byte[]{-46, C2638Cg0.B7, -35, C2638Cg0.C7, -26, -20, C2638Cg0.z7, -48, C2638Cg0.C7, -42, -29, -42, C2638Cg0.C7, -42, -46, -32, -20, -33, -46, -45, C2638Cg0.E7, -46, -48, C2638Cg0.C7, -42, -36, -37, -36, C2638Cg0.B7, -29, C2638Cg0.B7, -25, -34, C2638Cg0.n7, -12, C2638Cg0.B7, -25, -25, -28, -25, 6, -5, C8077mf.q, 8, -3, 2, -1, C8077mf.n, C8077mf.C, 0, 9, C8077mf.q, 8, -2, C8077mf.C, -5, 10, 3, -20, -21, 2, -9, C8077mf.m, 4, -7, -2, -5, 8, C8077mf.y, -4, 5, C8077mf.m, 4, -6, C8077mf.y, 8, -5, -4, 2, -5, -7, 10, -1, 5, 4, -2, -1, C8077mf.q, -15, -13, 4, -7, 6, -7, 4, 9, C8077mf.q, 3, -11, 2, 6, -7, -13, -11, -6, -5, C8077mf.m, -8, -19, 1, -6, -17, -12, -15, -2, C8077mf.m, -14, -5, 1, -6, -16, C8077mf.m, -19, -4, -11, -34, -35, C2638Cg0.r7, -60, -44, C2638Cg0.p7, -74, C2638Cg0.w7, C2638Cg0.r7, -72, -67, -70, C2638Cg0.u7, -44, -69, -60, C2638Cg0.w7, C2638Cg0.r7, -71, -44, C2638Cg0.u7, -70, -69, C2638Cg0.p7, -70, -72, C2638Cg0.v7, -66, -60, C2638Cg0.r7, -1, 0, C8077mf.r, 3, 6, -1, -1, -6, -1, -8, C8077mf.r, 5, -14, 4, -4, 4, C2638Cg0.z7, -43, -52, -52, -33, C2638Cg0.p7, C2638Cg0.r7, -44, C2638Cg0.v7, -42, C2638Cg0.v7, -44, C2638Cg0.v7, C2638Cg0.s7, -45, -33, -46, C2638Cg0.s7, C2638Cg0.t7, -52, C2638Cg0.s7, C2638Cg0.r7, -44, C2638Cg0.v7, C2638Cg0.A7, C2638Cg0.z7, C8077mf.r, C8077mf.A, C8077mf.p, C8077mf.p, C3307Iz.V, 5, 17, C8077mf.r, C8077mf.z, 7, C8077mf.D, C8077mf.z};
    }

    static {
        A01();
    }

    EnumC1171Wo(int i) {
        this.A00 = i;
    }
}
