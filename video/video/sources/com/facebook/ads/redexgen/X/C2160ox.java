package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C10323vs;
import o.C10980yZ;
import o.C10997yd1;
import o.C2638Cg0;
import o.C3307Iz;
import o.C6118ei0;
import o.C8077mf;
import o.C8463oE0;
import o.FF0;

/* renamed from: com.facebook.ads.redexgen.X.ox  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2160ox implements AnonymousClass74 {
    public static byte[] A0B;
    public static String[] A0C = {"WWBqbqM8cT7NtZ20aOE3uXs3Aw8DSv9K", "wsMqXc0RGaIy4bMjDS0CDKFK5K3H0E7a", "tXUn5oHGArEZhR5EfIYxUHEmkE2i7Wlz", "L3oqKt7yiugAXq9nLkVCiYddeszNHWIU", "GxMV2HKS42DeS6e3iSG9rTJ", "iBUmcZRwnnz5BMe8LKV", "MLtAALupoqSZMT31TgfSKHmksSEA2gyG", "KlBG0Bt2bdiLbLP3pzzetkFN2"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final C2052nC A08;
    public final boolean A09;
    public final boolean A0A;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 69);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0B = new byte[]{-127, -60, C2638Cg0.q7, C2638Cg0.A7, C2638Cg0.A7, -48, -43, -127, C2638Cg0.r7, C2638Cg0.t7, -127, C2638Cg0.y7, C2638Cg0.t7, -44, -44, -127, -43, C2638Cg0.v7, C2638Cg0.q7, C2638Cg0.A7, -127, 123, -91, C2638Cg0.t7, C2638Cg0.u7, C2638Cg0.q7, -42, C2638Cg0.y7, -43, -83, -48, C2638Cg0.q7, C2638Cg0.s7, -92, -48, C2638Cg0.A7, -43, -45, -48, C2638Cg0.y7, 3, C8077mf.r, C3307Iz.V, C8077mf.z, C8077mf.x, 35, C2638Cg0.A7, 17, 36, C8077mf.y, C8077mf.y, C8077mf.x, C3307Iz.V, C2638Cg0.A7, 34, C8077mf.B, C3307Iz.a0, C8077mf.x, C2638Cg0.A7, C3307Iz.V, C8077mf.x, C8077mf.r, C8077mf.u, C8077mf.A, C8077mf.x, 19, C2638Cg0.A7, C3307Iz.Y, C8077mf.B, 35, C8077mf.A, C2638Cg0.A7, C8077mf.E, C8077mf.x, 34, 34, C2638Cg0.A7, 35, C8077mf.A, C8077mf.r, C8077mf.G, C2638Cg0.A7, -28, -33, -33, 28, 34, C2638Cg0.A7, C8077mf.H, C8077mf.y, C2638Cg0.A7, 17, 36, C8077mf.y, C8077mf.y, C8077mf.x, C3307Iz.V, C8077mf.x, 19, C2638Cg0.A7, 28, C8077mf.x, 19, C8077mf.B, C8077mf.r, C2638Cg0.A7, 19, C8077mf.r, 35, C8077mf.r, -35, -36, -37, -35, -27, -68, -17, -32, -32, -33, -20, -66, -17, -20, -37, -18, -29, -23, -24, C2638Cg0.u7, -19, -77, C2638Cg0.t7, -73, -73, -74, C2638Cg0.r7, -105, C2638Cg0.o7, C2638Cg0.r7, -95, -67, -78, C2638Cg0.w7, -77, -78, -76, -68, -110, -73, C2638Cg0.s7, -74, C2638Cg0.r7, -93, -74, -77, C2638Cg0.t7, -73, -73, -74, C2638Cg0.r7, -98, -60, C8077mf.y, 40, C8077mf.C, C8077mf.C, C8077mf.B, C3307Iz.X, -7, 34, C3307Iz.X, 3, 31, C8077mf.x, C3307Iz.d0, C8077mf.y, C8077mf.x, C8077mf.z, C8077mf.H, 0, C3307Iz.Y, -12, -24, -1, C2638Cg0.v7, -4, -19, -19, -20, -7, -44, -6, C3307Iz.c0, C3307Iz.Z, C3307Iz.d0, 0, 51, 36, 36, 35, 48, C8077mf.m, 49};
    }

    static {
        A03();
    }

    public C2160ox() {
        this(new C2052nC(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public C2160ox(C2052nC c2052nC, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        int i7;
        String A02 = A02(C10997yd1.o1, 19, 110);
        String A022 = A02(21, 1, 6);
        A04(i3, 0, A02, A022);
        String A023 = A02(131, 32, 12);
        A04(i4, 0, A023, A022);
        String A024 = A02(C8463oE0.u, 11, 121);
        A04(i, i3, A024, A02);
        A04(i, i4, A024, A023);
        A04(i2, i, A02(FF0.q, 11, 66), A024);
        A04(i6, 0, A02(111, 20, 53), A022);
        this.A08 = c2052nC;
        this.A07 = C5C.A0O(i);
        this.A06 = C5C.A0O(i2);
        this.A05 = C5C.A0O(i3);
        this.A04 = C5C.A0O(i4);
        this.A02 = i5;
        if (this.A02 != -1) {
            i7 = this.A02;
        } else {
            i7 = 13107200;
        }
        this.A00 = i7;
        this.A09 = z;
        this.A03 = C5C.A0O(i6);
        this.A0A = z2;
    }

    public static int A00(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return C10980yZ.A;
            case 1:
                return 13107200;
            case 2:
                if (A0C[7].length() != 32) {
                    A0C[5] = "ABED08YC";
                    return C10980yZ.u;
                }
                throw new RuntimeException();
            case 3:
                return 131072;
            case 4:
                return 131072;
            case 5:
                return 131072;
            case 6:
                return 131072;
        }
    }

    private final int A01(InterfaceC2054nE[] interfaceC2054nEArr) {
        int i = 0;
        for (InterfaceC2054nE interfaceC2054nE : interfaceC2054nEArr) {
            if (interfaceC2054nE != null) {
                int targetBufferSize = interfaceC2054nE.A9L().A02;
                i += A00(targetBufferSize);
            }
        }
        int max = Math.max(13107200, i);
        if (A0C[0].charAt(6) != 'f') {
            A0C[0] = "RHrwW0B94f4UqoylhYQPwgHgnQSWW3zM";
            return max;
        }
        throw new RuntimeException();
    }

    public static void A04(int i, int i2, String str, String str2) {
        AbstractC04543y.A09(i >= i2, str + A02(0, 21, 28) + str2);
    }

    private void A05(boolean z) {
        int i;
        if (this.A02 == -1) {
            i = 13107200;
        } else {
            i = this.A02;
        }
        this.A00 = i;
        this.A01 = false;
        if (z) {
            this.A08.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final C2052nC A6v() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final long A70(C8O c8o) {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void AFR(C8O c8o) {
        A05(false);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void AFc(C8O c8o) {
        A05(true);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void AG6(C8O c8o) {
        A05(true);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void AGF(AnonymousClass73 anonymousClass73, C2072nW c2072nW, InterfaceC2054nE[] interfaceC2054nEArr) {
        int i;
        if (this.A02 == -1) {
            i = A01(interfaceC2054nEArr);
        } else {
            i = this.A02;
        }
        this.A00 = i;
        this.A08.A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final boolean AIn(C8O c8o) {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final boolean AJv(AnonymousClass73 anonymousClass73) {
        boolean z = true;
        boolean z2 = this.A08.A00() >= this.A00;
        long j = this.A07;
        if (anonymousClass73.A00 > 1.0f) {
            j = Math.min(C5C.A0Q(j, anonymousClass73.A00), this.A06);
        }
        if (anonymousClass73.A01 < Math.max(j, (long) C6118ei0.r2)) {
            boolean targetBufferSizeReached = this.A09;
            if (!targetBufferSizeReached && z2) {
                z = false;
            }
            this.A01 = z;
            boolean targetBufferSizeReached2 = this.A01;
            if (!targetBufferSizeReached2 && anonymousClass73.A01 < C6118ei0.r2) {
                AbstractC04624g.A07(A02(22, 18, 28), A02(40, 71, 106));
            }
        } else if (anonymousClass73.A01 >= this.A06 || z2) {
            this.A01 = false;
        }
        boolean targetBufferSizeReached3 = this.A01;
        return targetBufferSizeReached3;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final boolean AJy(long j, float f, boolean z, boolean z2, long minBufferDurationUs) {
        long A0R = C5C.A0R(j, f);
        long j2 = z ? this.A04 : this.A05;
        String[] strArr = A0C;
        if (strArr[3].charAt(20) != strArr[1].charAt(20)) {
            A0C[4] = "l7tzQS6toEbIIxnpfZA1NGx";
            if (minBufferDurationUs != C10323vs.b) {
                j2 = Math.min(minBufferDurationUs / 2, j2);
            }
            return j2 <= 0 || A0R >= j2 || (!this.A09 && this.A08.A00() >= this.A00);
        }
        throw new RuntimeException();
    }
}
