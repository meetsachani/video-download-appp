package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public class GU extends AbstractRunnableC1160Wc {
    public static byte[] A01;
    public final /* synthetic */ C4V A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{102, 89, 84, 85, 95, C8077mf.r, 71, 81, 67, C8077mf.r, 94, 85, 70, 85, 66, C8077mf.r, 64, 66, 85, 64, 81, 66, 85, 84};
    }

    public GU(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        boolean z;
        z = this.A00.A0E;
        if (!z) {
            this.A00.A0Q(A00(0, 24, 46));
        }
    }
}
