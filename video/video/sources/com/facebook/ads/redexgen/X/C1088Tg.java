package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Tg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1088Tg extends AbstractRunnableC1160Wc {
    public static byte[] A01;
    public final /* synthetic */ WD A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-81, -78, -90, -92, -81, -94, -73, -85, -75, -78, -73, -73, -81, -88};
    }

    public C1088Tg(WD wd) {
        this.A00 = wd;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        C1673gi c1673gi;
        c1673gi = this.A00.A05;
        c1673gi.A08().AA3(A00(0, 14, 26));
    }
}
