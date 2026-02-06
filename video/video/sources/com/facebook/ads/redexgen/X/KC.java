package com.facebook.ads.redexgen.X;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Arrays;
import o.C3307Iz;
import o.C3503Kz;
import o.C4715Xk;
import o.C8077mf;
import o.C9276rZ;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class KC {
    public static byte[] A0A;
    public static String[] A0B = {"6HehIsk5UTdQ8YwGLZ8u", "HAdSfToap9UtbNGqUYR7rfHJagkNK6YB", "nRaQRY6nAt4CmU7uet6FlSe17FvhWZYJ", "8IXD4Lb5", "pveGGnyGJyzGs1AN", "NjeHfVTmziUN3gQJJf", "25ItPJi0PU1GUlSkVtogtpFEj7NyufcW", "xHU94vBDrMO8JpAh"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{47, 65, 118, 55, C8077mf.u, 53, C4715Xk.i, 56, 49, 48, 116, 32, 59, 116, 36, 53, C3307Iz.Y, C3307Iz.Z, 49, 116, 54, 59, 59, 56, 49, 53, 58, 116, 34, 53, 56, C3307Iz.V, 49, 110, 116, 115, C3307Iz.Y, 1, 9, C8077mf.n, 5, 4, 64, C8077mf.x, C8077mf.q, 64, C8077mf.r, 1, C8077mf.u, 19, 5, 64, 3, C8077mf.q, C8077mf.n, C8077mf.q, C8077mf.u, 64, 5, C8077mf.B, C8077mf.r, C8077mf.u, 5, 19, 19, 9, C8077mf.q, C8077mf.p, 90, 64, 71, 101, 66, 74, 79, 70, 71, 3, 87, 76, 3, 83, 66, 81, 80, 70, 3, 69, 76, 77, 87, 3, 80, 74, 89, 70, C8077mf.C, 3, 4, 77, 99, 106, 107, 118, 109, 106, 99, 36, 113, 106, 111, 106, 107, 115, 106, 36, 70, 107, 118, 96, 97, 118, 87, 112, 125, 104, 97, 62, 36, 100, 74, 67, 66, 95, 68, 67, 74, 13, 88, 67, 70, 67, 66, 90, 67, 13, 76, 65, 68, 74, 67, 64, 72, 67, 89, C8077mf.A, 13, QC1.w, 64, 66, 91, 91, 66, 69, 76, C8077mf.m, 70, 74, 71, 77, 68, 89, 70, 78, 79, C8077mf.m, C8077mf.n, QC1.w, 95, 82, 71, 78, 17, C8077mf.n, C8077mf.m, 71, 66, 69, 78, C8077mf.m, 3, 78, 83, 91, 78, 72, 95, 78, 79, C8077mf.m, C8077mf.p, 88, C8077mf.m, 93, 74, 71, 94, 78, 88, 7, C8077mf.m, 77, 68, 94, 69, 79, C8077mf.m, C8077mf.p, 88, 2, 17, C8077mf.m, C8077mf.n, C8077mf.p, 88, C8077mf.n, 90, 98, 96, 121, 121, 96, 103, 110, C3307Iz.a0, 100, 104, 101, 111, 102, 123, 100, 108, 109, C3307Iz.a0, C3307Iz.f0, 90, 125, 112, 101, 108, 51, C3307Iz.f0, C3307Iz.a0, 101, 96, 103, 108, 51, C3307Iz.a0, C3307Iz.f0, 90, 122, 104, 90, 125, 112, 101, 108, 56, 31, C8077mf.u, 7, C8077mf.p, 81};
    }

    static {
        A07();
    }

    public KC(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.A05 = str;
        this.A01 = i;
        this.A04 = num;
        this.A03 = num2;
        this.A00 = f;
        this.A06 = z;
        this.A07 = z2;
        this.A09 = z3;
        this.A08 = z4;
        this.A02 = i2;
    }

    public static float A00(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            AbstractC04624g.A0A(A06(261, 8, 80), A06(71, 28, 122) + str + A06(2, 1, 8), e);
            return -3.4028235E38f;
        }
    }

    public static int A01(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (A08(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC04624g.A07(A06(261, 8, 80), A06(129, 28, 116) + str);
        return -1;
    }

    public static int A02(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (A09(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC04624g.A07(A06(261, 8, 80), A06(99, 30, 93) + str);
        return -1;
    }

    public static KC A04(String str, K8 k8) {
        int i;
        Integer num;
        Integer num2;
        float f;
        String A06 = A06(269, 6, 50);
        AbstractC04543y.A07(str.startsWith(A06));
        String[] split = TextUtils.split(str.substring(A06.length()), A06(3, 1, 66));
        int length = split.length;
        int i2 = k8.A05;
        String A062 = A06(261, 8, 80);
        if (length != i2) {
            AbstractC04624g.A07(A062, C5C.A0n(A06(C3503Kz.q0, 69, 114), Integer.valueOf(k8.A05), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[k8.A06].trim();
            if (k8.A00 != -1) {
                i = A01(split[k8.A00].trim());
            } else {
                i = -1;
            }
            if (k8.A08 != -1) {
                num = A05(split[k8.A08].trim());
            } else {
                num = null;
            }
            if (k8.A07 != -1) {
                num2 = A05(split[k8.A07].trim());
            } else {
                num2 = null;
            }
            if (k8.A03 != -1) {
                f = A00(split[k8.A03].trim());
            } else {
                f = -3.4028235E38f;
            }
            return new KC(trim, i, num, num2, f, k8.A01 != -1 && A0A(split[k8.A01].trim()), k8.A04 != -1 && A0A(split[k8.A04].trim()), k8.A0A != -1 && A0A(split[k8.A0A].trim()), k8.A09 != -1 && A0A(split[k8.A09].trim()), k8.A02 != -1 ? A02(split[k8.A02].trim()) : -1);
        } catch (RuntimeException e) {
            AbstractC04624g.A0A(A062, A06(C9276rZ.p, 35, 80) + str + A06(2, 1, 8), e);
            return null;
        }
    }

    public static Integer A05(String str) {
        long parseLong;
        try {
            if (str.startsWith(A06(0, 2, 80))) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            AbstractC04543y.A07(parseLong <= 4294967295L);
            int A02 = AbstractC0616As.A02(((parseLong >> 24) & 255) ^ 255);
            int A022 = AbstractC0616As.A02((parseLong >> 16) & 255);
            int b = AbstractC0616As.A02((parseLong >> 8) & 255);
            int a = AbstractC0616As.A02(parseLong & 255);
            return Integer.valueOf(Color.argb(A02, a, b, A022));
        } catch (IllegalArgumentException e) {
            AbstractC04624g.A0A(A06(261, 8, 80), A06(36, 35, 57) + str + A06(2, 1, 8), e);
            return null;
        }
    }

    public static boolean A08(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean A09(int i) {
        switch (i) {
            case 1:
            case 3:
                return true;
            case 2:
            default:
                String[] strArr = A0B;
                if (strArr[7].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                A0B[6] = "OxYydzu443viAUiIiorbVSFSlAhvbuco";
                return false;
        }
    }

    public static boolean A0A(String str) {
        try {
            int value = Integer.parseInt(str);
            return value == 1 || value == -1;
        } catch (NumberFormatException e) {
            AbstractC04624g.A0A(A06(261, 8, 80), A06(4, 32, 13) + str + A06(2, 1, 8), e);
            return false;
        }
    }
}
