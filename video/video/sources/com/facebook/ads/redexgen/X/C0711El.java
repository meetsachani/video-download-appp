package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.El  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0711El {
    public static byte[] A03;
    public final int A00;
    public final C2205pg A01;
    public final int[] A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 82);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, 4, 3, -12, C8077mf.y, C8077mf.z, C8077mf.C, C8077mf.H, C8077mf.C, 36, C8077mf.C, 31, C8077mf.H, 3, C3307Iz.c0, C3307Iz.f0, 50, 55, -34, 50, 48, 31, C3307Iz.V, C3307Iz.a0, 49, -34, 31, 48, 35, -34, C3307Iz.d0, C3307Iz.e0, 50, -34, 31, 42, 42, C3307Iz.e0, 53, 35, 34};
    }

    public C0711El(C2205pg c2205pg, int... iArr) {
        this(c2205pg, iArr, 0);
    }

    public C0711El(C2205pg c2205pg, int[] iArr, int i) {
        if (iArr.length == 0) {
            AbstractC04624g.A08(A00(0, 13, 94), A00(13, 28, 108), new IllegalArgumentException());
        }
        this.A01 = c2205pg;
        this.A02 = iArr;
        this.A00 = i;
    }
}
