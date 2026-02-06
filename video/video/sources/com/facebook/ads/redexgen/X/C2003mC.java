package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.mC  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2003mC implements InterfaceC0825Ix {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C04774v A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{65, 77, C8077mf.H, C8077mf.C, C8077mf.H, C8077mf.A, 77, C8077mf.H, C8077mf.n, 0, C8077mf.G, 1, 8, 77, C8077mf.H, 4, C8077mf.A, 8, 87, 77, 70, 115, 104, 106, 87, 102, 117, 116, 98, 117, 116, 9, C4715Xk.i, C3307Iz.d0, C3307Iz.V, C3307Iz.Z, 104, 59, C3307Iz.a0, C3307Iz.X, 56, 36, C3307Iz.e0, 104, 59, C3307Iz.V, 50, C3307Iz.e0, 104, C3307Iz.X, C3307Iz.V, 59, C3307Iz.X, C3307Iz.a0, 60, C3307Iz.c0, 32, 102, 104, 59, 60, 59, C3307Iz.d0, 104, 59, C3307Iz.a0, C3307Iz.X, 56, 36, C3307Iz.e0, 104, 59, C3307Iz.V, 50, C3307Iz.e0, 114, 104, C8077mf.C, 13, 28, 17, C8077mf.A, 87, 10, C8077mf.C, C8077mf.q};
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r0 != 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2003mC(C2004mD c2004mD, C2242qI c2242qI) {
        this.A02 = c2004mD.A00;
        this.A02.A0f(12);
        int A0L = this.A02.A0L();
        if (A00(77, 9, 20).equals(c2242qI.A0W)) {
            int i = c2242qI.A0C;
            int fixedSampleSize = c2242qI.A06;
            int A06 = C5C.A06(i, fixedSampleSize);
            if (A0L != 0) {
                int fixedSampleSize2 = A0L % A06;
            }
            AbstractC04624g.A07(A00(20, 11, 107), A00(31, 46, 36) + A06 + A00(0, 20, 1) + A0L);
            A0L = A06;
        }
        this.A00 = A0L == 0 ? -1 : A0L;
        int fixedSampleSize3 = this.A02.A0L();
        this.A01 = fixedSampleSize3;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Ix
    public final int A8A() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Ix
    public final int A8v() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0825Ix
    public final int AHS() {
        return this.A00 == -1 ? this.A02.A0L() : this.A00;
    }
}
