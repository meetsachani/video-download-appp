package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;

/* renamed from: com.facebook.ads.redexgen.X.0v  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0v extends C1B {
    public static byte[] A00;
    public static final CC A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{9, 34, C3307Iz.c0, 56, 7, C3307Iz.c0, 62, C3307Iz.a0, 34, 47, 56, 100, 36, C3307Iz.X, 36, 47, 98, 99};
    }

    static {
        A01();
        A01 = new C0v();
    }

    public C0v() {
        new C2S(A00(0, 18, 12)) { // from class: com.facebook.ads.redexgen.X.1B
            public final String A00;

            {
                this.A00 = (String) AbstractC1912ki.A04(description);
            }

            public final String toString() {
                return this.A00;
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final int A08(CharSequence sequence, int start) {
        int length = sequence.length();
        AbstractC1912ki.A01(start, length);
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.CC
    public final boolean A09(char c) {
        return false;
    }
}
