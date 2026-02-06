package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class F1 extends AbstractRunnableC1160Wc {
    public final /* synthetic */ C0720Eu A00;

    public F1(C0720Eu c0720Eu) {
        this.A00 = c0720Eu;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        C1547eg c1547eg;
        C0710Ek c0710Ek;
        E4 e4;
        EA ea;
        c1547eg = this.A00.A03;
        c1547eg.A07();
        c0710Ek = this.A00.A04;
        UM<UN, UL> eventBus = c0710Ek.getEventBus();
        e4 = this.A00.A06;
        ea = this.A00.A05;
        eventBus.A04(e4, ea);
    }
}
