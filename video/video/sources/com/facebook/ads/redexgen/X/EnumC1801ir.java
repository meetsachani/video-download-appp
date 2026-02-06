package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.ir  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1801ir {
    A09(A00(173, 7, 111)),
    A07(A00(C3503Kz.i0, 11, 71)),
    A0A(A00(180, 16, 94)),
    A06(A00(129, 16, 114)),
    A08(A00(C3503Kz.p0, 17, 64)),
    A05(A00(120, 9, 118)),
    A04(A00(98, 22, 15));
    
    public static byte[] A01;
    public static String[] A02 = {"3irfHjb1xBggEOYppIC20CVGO", "PvTwVw4l1egAAUgNiEJHpQxcY", "Z83jj4f2UJi7iIzCa97fW954cYyfIvRS", "Pn3ECjM654pG8xNfJs7iPR6nvOfTtg4S", "rnvCizUmlaJkbQ0LWt7EGYvIVwvlRHSU", "Y4v1TwA3VTqRjFpvhM1P5mrv4yN1Kb1i", "iJ3TP1yTdydKb8xTTpNjz5p9ilImmlzt", "3Fyn3bOdC3lEL0zKVakbNgp9AIkAOPYu"};
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            String[] strArr = A02;
            if (strArr[4].charAt(18) != strArr[3].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "9Fh1XlTwmrAkPSBsBt7sR6HEZ4z1EPMB";
            strArr2[3] = "w0XpqxyBnVeSACOsJ07N96wKg89kpHEO";
            copyOfRange[i4] = (byte) (i5 ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{71, 80, 67, 67, 64, 87, 90, 71, 64, 73, 74, 82, 90, 81, 77, 87, 64, 86, 77, 74, 73, 65, C8077mf.C, C8077mf.r, 13, 28, C8077mf.D, 0, C8077mf.D, 17, C8077mf.E, C3307Iz.V, 32, 48, 32, 58, 59, ED2.a, 58, 59, 48, C3307Iz.e0, 58, C3307Iz.a0, C3307Iz.a0, 42, C4715Xk.i, 103, 124, 101, 101, 118, 111, 102, 123, 100, 104, 125, 79, 73, 78, 90, 93, 95, 89, 67, 82, 83, 72, 67, 78, 89, 93, 88, 69, 2, C8077mf.C, 28, C8077mf.C, C8077mf.B, 0, C8077mf.C, Byte.MAX_VALUE, 105, 97, 124, 97, 102, 111, 119, 110, 103, 122, 119, 99, 109, 113, 123, 86, 65, 82, 82, 81, 70, 107, 86, 81, 88, 91, 67, 107, 64, 92, 70, 81, 71, 92, 91, 88, 80, C3307Iz.c0, 34, ED2.a, C3307Iz.f0, 40, C8077mf.u, 40, 35, C3307Iz.a0, C3307Iz.Z, C3307Iz.Y, C8077mf.z, C3307Iz.Y, 60, C4715Xk.i, 57, 60, C4715Xk.i, C8077mf.z, C3307Iz.c0, 60, 47, 47, C3307Iz.d0, 59, C8077mf.u, 9, C8077mf.r, C8077mf.r, 35, C8077mf.D, 19, C8077mf.p, 17, C8077mf.G, 8, 8, C8077mf.p, 9, C8077mf.G, C8077mf.D, C8077mf.B, C8077mf.H, 36, C8077mf.y, C8077mf.x, C8077mf.q, 36, 9, C8077mf.H, C8077mf.D, 31, 2, C3307Iz.V, 58, ED2.a, 58, 59, 35, 58, C8077mf.u, 4, C8077mf.n, 17, C8077mf.n, C8077mf.m, 2, 58, 3, 10, C8077mf.A, 58, C8077mf.p, 0, 28, C8077mf.z};
    }

    static {
        A01();
    }

    EnumC1801ir(String str) {
        this.A00 = str;
    }
}
