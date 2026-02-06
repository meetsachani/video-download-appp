package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* loaded from: assets/audience_network/classes2.dex */
public final class XS {
    public static String[] A05 = {"hdh4k6eZclrlxxYg19ck", "OIQuDIQFpzBifrZrtJIvg4BasUaQd63c", "6y0NffGMqcG8EugdtirNjkqg6svCH2Zl", "13Ua2r6CYJwc6p6BI5coDxRAaPqMz7yS", "7WkbYpbXunBRly3lB1oHckvOip2eqLp6", "2PYz6J8qU0vRqLO17bgOak7iCaiihwk", "gvpJ77qQnx", "SLFhDDNvl2CxgKHJ1vqMDyCxDe74woQD"};
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC1847jd A02;
    public final C1673gi A03;
    public final XQ A04;

    public XS(C1673gi c1673gi, AbstractC1847jd abstractC1847jd, XQ xq) {
        this.A03 = c1673gi;
        this.A04 = xq;
        this.A02 = abstractC1847jd;
    }

    public static XS A00(C1673gi c1673gi, AbstractC1847jd abstractC1847jd, XQ xq) {
        Object creativeAsCtaLoggingHelper = c1673gi.A0I();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new XS(c1673gi, abstractC1847jd, xq);
            c1673gi.A0P(creativeAsCtaLoggingHelper);
        }
        return (XS) creativeAsCtaLoggingHelper;
    }

    public static boolean A01(C1673gi c1673gi) {
        return C1123Up.A1g(c1673gi) && X6.A0I(c1673gi);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r5 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final XR A02(AbstractC1847jd abstractC1847jd) {
        boolean z = true;
        if (C1123Up.A1m(this.A03)) {
            z = (abstractC1847jd.A1e() && A01(this.A03)) ? false : false;
            return new XR(z, z);
        }
        boolean A1e = abstractC1847jd.A1e();
        if (A1e) {
            boolean A01 = A01(this.A03);
            String[] strArr = A05;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "D5RQoHah0ZffyX7n6MMHscTeZuBHZQ8g";
            strArr2[4] = "oKN8Sif1fTCm3hFJqGEcKAR8lt3N8fjA";
        }
        z = false;
        return new XR(A1e, z);
    }

    public final void A03() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }
}
