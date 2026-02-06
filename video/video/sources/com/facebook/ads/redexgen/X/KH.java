package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class KH extends AbstractRunnableC1160Wc {
    public final /* synthetic */ KE A00;

    public KH(KE ke) {
        this.A00 = ke;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        boolean z;
        C1422cd c1422cd;
        z = this.A00.A0Y;
        if (!z) {
            c1422cd = this.A00.A0K;
            YB.A0F(1000, c1422cd);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
