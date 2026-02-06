package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class K6 extends AbstractRunnableC1160Wc {
    public final /* synthetic */ C0836Ji A00;
    public final /* synthetic */ boolean A01;

    public K6(C0836Ji c0836Ji, boolean z) {
        this.A00 = c0836Ji;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        C1390c7 c1390c7;
        c1390c7 = this.A00.A0b;
        AbstractC1208Yb A0B = c1390c7.A0B();
        if (A0B == null) {
            return;
        }
        A0B.setPageDetailsVisible((this.A01 || A0B.A0E()) ? false : true);
        A0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
