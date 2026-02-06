package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class GZ extends AbstractRunnableC1160Wc {
    public final /* synthetic */ C04794x A00;

    public GZ(C04794x c04794x) {
        this.A00 = c04794x;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        AbstractC1386c3 abstractC1386c3;
        AbstractC1386c3 abstractC1386c32;
        abstractC1386c3 = this.A00.A00;
        if (abstractC1386c3 != null) {
            abstractC1386c32 = this.A00.A00;
            if (abstractC1386c32.A1N()) {
                ((AbstractC0760Gj) this.A00).A02 = true;
                this.A00.A09.setToolbarActionMode(8);
            }
        }
    }
}
