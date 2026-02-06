package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;

/* renamed from: com.facebook.ads.redexgen.X.qW  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2254qW {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 86);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{49, 53, C3307Iz.f0, 54, 51, 52, 116, 48, C3307Iz.d0, 55, 116, 60, 47, 52, 57, C3307Iz.f0, 51, 53, 52, C3307Iz.a0, 116};
    }

    public final String A02(AY ay) {
        String obj = ay.getClass().getGenericInterfaces()[0].toString();
        String A002 = A00(0, 21, 12);
        return obj.startsWith(A002) ? obj.substring(A002.length()) : obj;
    }

    public final String A03(AbstractC03961o abstractC03961o) {
        return A02(abstractC03961o);
    }
}
