package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;

/* loaded from: assets/audience_network/classes2.dex */
public class J5 extends AbstractRunnableC1160Wc {
    public static byte[] A02;
    public final /* synthetic */ C1449d4 A00;
    public final /* synthetic */ C4A A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-103, -52, -67, -67, -68, C2638Cg0.v7, C2638Cg0.o7, C2638Cg0.s7, -66, 119, C2638Cg0.o7, C2638Cg0.s7, -69, -68, -67, C2638Cg0.o7, C2638Cg0.s7, C2638Cg0.o7, C2638Cg0.x7, -68, C2638Cg0.r7, -48};
    }

    public J5(C1449d4 c1449d4, C4A c4a) {
        this.A00 = c1449d4;
        this.A01 = c4a;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        C0710Ek c0710Ek;
        C0710Ek c0710Ek2;
        c0710Ek = this.A00.A0D;
        if (c0710Ek.getState() != EnumC1615fm.A02) {
            return;
        }
        c0710Ek2 = this.A00.A0D;
        if (c0710Ek2.getCurrentPositionInMillis() != A00()) {
            return;
        }
        this.A00.A0I(A00(0, 22, 47));
    }
}
