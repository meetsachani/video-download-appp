package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.bD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1334bD {
    A05(0),
    A04(1),
    A03(2);
    
    public static byte[] A01;
    public int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{78, 67, 76, 70, 81, 65, 67, 82, 71, 56, C3307Iz.Z, 58, 60, 58, C3307Iz.a0, C3307Iz.V, 60, C8077mf.z, 13, C8077mf.r, 19, 6, 0, 10, 5, 10, 6, 7};
    }

    static {
        A02();
    }

    EnumC1334bD(int i) {
        this.A00 = i;
    }

    public static EnumC1334bD A00(int i) {
        EnumC1334bD[] values;
        for (EnumC1334bD enumC1334bD : values()) {
            if (enumC1334bD.A00 == i) {
                return enumC1334bD;
            }
        }
        return A04;
    }

    public final int A04() {
        return this.A00;
    }
}
