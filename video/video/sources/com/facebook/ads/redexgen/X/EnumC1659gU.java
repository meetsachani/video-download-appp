package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import o.C3307Iz;

/* renamed from: com.facebook.ads.redexgen.X.gU  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1659gU {
    A03(A01(37, 3, 126)),
    A04(A01(40, 7, 55));
    
    public static byte[] A01;
    public String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 117);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{48, 50, 58, 108, 75, 83, 68, 73, 76, 65, 5, 86, 64, 87, 83, 64, 87, 5, 87, 64, 86, 85, 74, 75, 86, 64, 31, 5, 0, 86, 51, 40, C3307Iz.e0, 40, C3307Iz.a0, 49, 40, 106, 104, 96, 55, C3307Iz.d0, C3307Iz.a0, C3307Iz.d0, C3307Iz.e0, 53, C3307Iz.d0};
    }

    static {
        A02();
    }

    EnumC1659gU(String str) {
        this.A00 = str;
    }

    public static EnumC1659gU A00(String str) {
        EnumC1659gU[] values;
        for (EnumC1659gU enumC1659gU : values()) {
            if (enumC1659gU.A00.equals(str)) {
                return enumC1659gU;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(3, 27, 80), str));
    }
}
