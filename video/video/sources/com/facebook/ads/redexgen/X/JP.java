package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C10901yE;
import o.C3307Iz;
import o.C8077mf;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class JP {
    public static byte[] A05;
    public static String[] A06 = {"8Hrr", C10901yE.i, "0Fdee0wg4hsenc5DHvlvwY", "0vqFlF7HyuYg3TUYlVTMC9xVo", "FyWFMrZuY5MlICM", "PN9pA9f0QUy", "hrYl81FOJTp7gpX67gLzFhurxBV", "ujvsBGrB8Jik"};
    public final int A00;
    public final C0778Hb A01;
    public final String A02;
    public final boolean A03;
    public final byte[] A04;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 64);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{40, C3307Iz.V, 47, 78, 124, 124, 122, 98, 102, 97, 104, 47, 78, 74, 92, 34, 76, 91, 93, 47, 108, 125, 118, Byte.MAX_VALUE, 123, 96, 47, 98, 96, 107, 106, C3307Iz.V, C3307Iz.Y, 0, 19, 17, C8077mf.C, 55, 28, 17, 0, C8077mf.m, 2, 6, C8077mf.E, C8077mf.G, 28, 48, C8077mf.G, 10, 95, 100, 121, Byte.MAX_VALUE, 122, 122, 101, QC1.w, 126, 111, 110, 42, 122, QC1.w, 101, 126, 111, 105, 126, 99, 101, 100, 42, 121, 105, 98, 111, 103, 111, 42, 126, 115, 122, 111, 42, C3307Iz.e0, 115, 114, 115, C3307Iz.V, C3307Iz.a0, 40, C3307Iz.a0, 57, 60, 58, 49, 60, QC1.w, 126, 117, 104};
    }

    static {
        A02();
    }

    public JP(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        AbstractC04543y.A07((bArr2 == null) ^ (i == 0));
        this.A03 = z;
        this.A02 = str;
        this.A00 = i;
        this.A04 = bArr2;
        this.A01 = new C0778Hb(A00(str), bArr, i2, i3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int A00(String str) {
        char c;
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(A01(86, 4, 80))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3046671:
                if (str.equals(A01(90, 4, 10))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3049879:
                if (str.equals(A01(94, 4, 31))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3049895:
                String[] strArr = A06;
                if (strArr[6].length() != strArr[1].length()) {
                    A06[5] = "5D1VNf4Gt9Q";
                    if (str.equals(A01(98, 4, 91))) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                } else {
                    throw new RuntimeException();
                }
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            default:
                AbstractC04624g.A07(A01(32, 18, 50), A01(50, 36, 74) + str + A01(0, 32, 79));
                return 1;
        }
    }
}
