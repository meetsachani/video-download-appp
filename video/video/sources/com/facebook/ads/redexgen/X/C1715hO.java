package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;

/* renamed from: com.facebook.ads.redexgen.X.hO  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1715hO extends WP {
    public static String[] A01 = {"12g74Y80MldwuLH5Sc5BNMhqIci3y3n7", "gYGMtvDgCappq8Eqx1aX2vuQToh52UHd", "GlXHohOtVJhIOcbHhrFcSUyeAoJlZUN4", "CknPoCaYYZqOx1VHoQWkocTpfCeiqOL0", "IgiYYUSARpIlAyCBMTexeC9bH0PhGiJU", "Cia0Frm0699G8jcollxZnIfMYARIEex0", "Mzdi9MK983UUFZlepuPfFCQdgw1DK7MX", "jSW62lJNNGtUKopGO2HTdr7H5wR53AmM"};
    public final /* synthetic */ C1713hM A00;

    public C1715hO(C1713hM c1713hM) {
        this.A00 = c1713hM;
    }

    @Override // com.facebook.ads.redexgen.X.WP
    public final void A01() {
        C1034Rd c1034Rd;
        C1034Rd c1034Rd2;
        C1034Rd c1034Rd3;
        c1034Rd = this.A00.A01;
        if (c1034Rd.A06() != null) {
            c1034Rd2 = this.A00.A01;
            String[] strArr = A01;
            if (strArr[3].charAt(29) == strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "nnCrEA10h1A2hd08C5n1xIwFCKPiTwdC";
            strArr2[0] = "49SRRBhRmQihygS20ldMlh5Gkuzwxt90";
            AdListener A06 = c1034Rd2.A06();
            c1034Rd3 = this.A00.A01;
            A06.onAdClicked(c1034Rd3.A07());
        }
    }
}
