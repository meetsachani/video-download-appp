package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.3i  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04383i {
    public static byte[] A04;
    public static final C04383i A05;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 99);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-23, -35, 32, C3307Iz.X, C8077mf.H, C3307Iz.c0, C3307Iz.c0, 34, C3307Iz.a0, 0, C3307Iz.d0, 50, C3307Iz.c0, 49, -6, C8077mf.p, 2, 71, 80, 69, 81, 70, 75, 80, 73, 31, -33, 19, 2, 7, 13, -28, 13, C8077mf.r, C8077mf.m, -1, C8077mf.u, -7, 17, -1, C8077mf.m, C8077mf.p, 10, 3, -16, -1, C8077mf.u, 3, -37};
    }

    static {
        A01();
        A05 = new C04383i(-1, -1, -1);
    }

    public C04383i(int i, int i2, int i3) {
        int i4;
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        if (C5C.A15(i3)) {
            i4 = C5C.A06(i3, i2);
        } else {
            i4 = -1;
        }
        this.A00 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C04383i) {
            C04383i c04383i = (C04383i) obj;
            return this.A03 == c04383i.A03 && this.A01 == c04383i.A01 && this.A02 == c04383i.A02;
        }
        return false;
    }

    public final int hashCode() {
        return CB.A00(Integer.valueOf(this.A03), Integer.valueOf(this.A01), Integer.valueOf(this.A02));
    }

    public final String toString() {
        return A00(26, 23, 59) + this.A03 + A00(0, 15, 90) + this.A01 + A00(15, 11, 127) + this.A02 + ']';
    }
}
