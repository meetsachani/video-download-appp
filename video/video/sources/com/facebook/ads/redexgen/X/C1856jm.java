package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.jm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1856jm extends AbstractRunnableC1160Wc {
    public static byte[] A01;
    public final /* synthetic */ C1855jl A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-107, -116, -95, -116, -98, -114, -99, -108, -101, -97, 101};
    }

    public C1856jm(C1855jl c1855jl) {
        this.A00 = c1855jl;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        C1673gi c1673gi;
        AbstractC1319ay abstractC1319ay;
        C1857jn c1857jn;
        c1673gi = this.A00.A03;
        c1673gi.A0F().AKw();
        abstractC1319ay = this.A00.A05;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 29));
        c1857jn = this.A00.A00;
        abstractC1319ay.loadUrl(append.append(c1857jn.A03()).toString());
    }
}
