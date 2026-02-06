package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.bu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1377bu {
    public static float A00(NR nr) {
        int height = nr.A0H().A01();
        int width = nr.A0H().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d) {
        int availableWidth = (int) ((XW.A00().widthPixels - (AbstractC1386c3.A08 * 2)) / d);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = YB.A01(16);
        int ctaTextHeight = AbstractC1358bb.A0D;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC1386c3.A08;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = XW.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static View$OnClickListenerC1376bt A03(View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr, String str) {
        return new View$OnClickListenerC1376bt(view$OnClickListenerC0871Kr, str);
    }

    public static boolean A04(double d) {
        return d < 0.9d;
    }

    public static boolean A05(double d, int i) {
        return A02(i) < A01(d);
    }

    public static boolean A06(int i, int i2, double d) {
        return i == 2 || A05(d, i2);
    }
}
