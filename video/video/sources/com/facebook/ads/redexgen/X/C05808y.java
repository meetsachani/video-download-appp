package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.8y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05808y extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C2242qI A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-26, C8077mf.D, 9, C8077mf.p, C8077mf.x, -7, C8077mf.A, 6, 8, C8077mf.r, C2638Cg0.s7, 28, C8077mf.A, C8077mf.p, C8077mf.C, 10, C2638Cg0.s7, C8077mf.m, 6, C8077mf.p, 17, 10, 9, -33, C2638Cg0.s7};
    }

    public C05808y(int i, C2242qI c2242qI, boolean z) {
        super(A00(0, 25, 91) + i);
        this.A02 = z;
        this.A00 = i;
        this.A01 = c2242qI;
    }
}
