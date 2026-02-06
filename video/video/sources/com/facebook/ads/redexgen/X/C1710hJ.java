package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.hJ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1710hJ extends AbstractRunnableC1160Wc {
    public final /* synthetic */ C1709hI A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C1710hJ(C1709hI c1709hI, AnonymousClass62 anonymousClass62) {
        this.A00 = c1709hI;
        this.A01 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1G());
        this.A00.A02.A1o(true, true);
    }
}
