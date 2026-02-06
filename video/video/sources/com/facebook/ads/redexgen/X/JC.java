package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;

/* loaded from: assets/audience_network/classes2.dex */
public class JC extends AbstractRunnableC1160Wc {
    public static byte[] A01;
    public final /* synthetic */ C1449d4 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-87, -68, -73, -72, C2638Cg0.q7, 115, C2638Cg0.p7, -72, C2638Cg0.v7, -72, C2638Cg0.s7, 115, C2638Cg0.t7, C2638Cg0.u7, -76, C2638Cg0.s7, C2638Cg0.u7, -72, -73, 115, C2638Cg0.r7, -65, -76, -52, -68, C2638Cg0.p7, -70};
    }

    public JC(C1449d4 c1449d4) {
        this.A00 = c1449d4;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        boolean z;
        z = this.A00.A04;
        if (z) {
            return;
        }
        this.A00.A0I(A00(0, 27, 64));
    }
}
