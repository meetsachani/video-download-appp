package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8G */
/* loaded from: assets/audience_network/classes2.dex */
public class C8G extends AbstractC1903kY<M5> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public C8G(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1903kY
    /* renamed from: A05 */
    public final C0905Lz A04(M5 m5) {
        return new C0905Lz(this, m5 == null ? A00(0, 4, 114) : m5.A03());
    }
}
