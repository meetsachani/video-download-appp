package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.Pb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0984Pb implements InterfaceC1315au {
    public static byte[] A01;
    public final /* synthetic */ PZ A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -19, -33, -20, C2638Cg0.E7, -36, -17, -32, -32, -33, -20, -33, -34, C2638Cg0.E7, -35, -26, -29, -35, -27, C2638Cg0.E7, -29, -37, -36, C2638Cg0.E7, -33, -14, -18, -33, -20, -24, -37, -26, C2638Cg0.E7, -24, -37, -16, -29, C2638Cg0.C7, -37, -18, -29, -23, -24};
    }

    public C0984Pb(PZ pz) {
        this.A00 = pz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1315au
    public final void ADO() {
        this.A00.A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1315au
    public final void AF0() {
        this.A00.A0I(A00(0, 43, 56));
    }
}
