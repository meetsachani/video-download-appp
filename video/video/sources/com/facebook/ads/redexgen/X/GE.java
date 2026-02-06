package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class GE implements InterfaceC1503dx {
    public final /* synthetic */ C4V A00;

    public GE(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1503dx
    public final void A9l() {
        AbstractC1386c3 abstractC1386c3;
        AbstractC1386c3 abstractC1386c32;
        abstractC1386c3 = this.A00.A02;
        if (abstractC1386c3 instanceof C6H) {
            abstractC1386c32 = this.A00.A02;
            ((C6H) abstractC1386c32).A1X();
            VI.A02(VH.A0e, null, ((AbstractC0760Gj) this.A00).A03.A2E(), ((AbstractC0760Gj) this.A00).A05.A0A());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1503dx
    public final void AJz() {
        AbstractC1386c3 abstractC1386c3;
        AbstractC1386c3 abstractC1386c32;
        C4L c4l;
        abstractC1386c3 = this.A00.A02;
        if (abstractC1386c3 instanceof C6H) {
            abstractC1386c32 = this.A00.A02;
            c4l = this.A00.A0N;
            ((C6H) abstractC1386c32).A1b(c4l);
            VI.A02(VH.A0e, null, ((AbstractC0760Gj) this.A00).A03.A2E(), ((AbstractC0760Gj) this.A00).A05.A0A());
        }
        this.A00.A0n();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1503dx
    public final void AKE() {
        AbstractC1386c3 abstractC1386c3;
        AbstractC1386c3 abstractC1386c32;
        this.A00.A0e();
        abstractC1386c3 = this.A00.A02;
        if (abstractC1386c3 instanceof C6H) {
            abstractC1386c32 = this.A00.A02;
            ((C6H) abstractC1386c32).getAdDetailsView().setVisibility(8);
        }
    }
}
