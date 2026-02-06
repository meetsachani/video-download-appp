package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.Hm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0789Hm extends AbstractRunnableC1160Wc {
    public static byte[] A02;
    public final /* synthetic */ AnonymousClass55 A00;
    public final /* synthetic */ C4A A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{C8077mf.y, 72, 57, 57, 56, 69, 60, 65, 58, -13, 60, 65, 55, 56, 57, 60, 65, 60, 71, 56, ED2.a, 76};
    }

    public C0789Hm(AnonymousClass55 anonymousClass55, C4A c4a) {
        this.A00 = anonymousClass55;
        this.A01 = c4a;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        C0710Ek c0710Ek;
        C0710Ek c0710Ek2;
        c0710Ek = this.A00.A0b;
        if (c0710Ek.getState() == EnumC1615fm.A02) {
            c0710Ek2 = this.A00.A0b;
            if (c0710Ek2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0s(A00(0, 22, 104));
            }
        }
    }
}
