package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.gh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1672gh {
    A03(A01(35, 4, 16)),
    A04(A01(39, 4, 41));
    
    public static byte[] A01;
    public String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{125, 110, 119, 119, 99, 68, 92, 75, 70, 67, 78, 10, 89, 79, 88, 92, 79, 88, 10, 88, 79, 89, 90, 69, 68, 89, 79, C8077mf.r, 10, C8077mf.q, 89, 40, C3307Iz.Y, C3307Iz.Y, 51, 110, 125, 100, 100, 90, 84, 84, 65};
    }

    static {
        A02();
    }

    EnumC1672gh(String str) {
        this.A00 = str;
    }

    public static EnumC1672gh A00(String str) {
        EnumC1672gh[] values;
        for (EnumC1672gh enumC1672gh : values()) {
            if (enumC1672gh.A00.equals(str)) {
                return enumC1672gh;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 50), str));
    }
}
