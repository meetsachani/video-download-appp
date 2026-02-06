package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0798Hv extends AbstractRunnableC1160Wc {
    public static byte[] A01;
    public final /* synthetic */ C5F A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{118, 73, 68, 69, 79, 0, 87, 65, 83, 0, 78, 69, 86, 69, 82, 0, 80, 82, 69, 80, 65, 82, 69, 68};
    }

    public C0798Hv(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        boolean z;
        InterfaceC1493dm interfaceC1493dm;
        z = this.A00.A0T;
        if (!z) {
            interfaceC1493dm = this.A00.A0Z;
            interfaceC1493dm.AGQ(A00(0, 24, 86));
        }
    }
}
