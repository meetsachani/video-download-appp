package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.Wv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1178Wv implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C1673gi A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C2638Cg0.v7, C2638Cg0.z7, C2638Cg0.y7, C2638Cg0.t7, -1, -3, 6, -3, 10, 1, -5};
    }

    public RunnableC1178Wv(C1673gi c1673gi) {
        this.A00 = c1673gi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            C1086Te otsl = new C1086Te(A00(0, 4, 14));
            otsl.A05(1);
            otsl.A06(1);
            otsl.A0A(false);
            this.A00.A08().ABD(A00(4, 7, 44), AbstractC1085Td.A1Y, otsl);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
