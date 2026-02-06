package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.8I */
/* loaded from: assets/audience_network/classes2.dex */
public class C8I extends AbstractC1903kY<EnumC0897Lr> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, C2638Cg0.A7, C2638Cg0.t7, C2638Cg0.t7};
    }

    public C8I(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1903kY
    /* renamed from: A05 */
    public final C0905Lz A04(EnumC0897Lr enumC0897Lr) {
        return new C0905Lz(this, enumC0897Lr == null ? A00(0, 4, 46) : A00(0, 0, 18) + enumC0897Lr.A03());
    }
}
