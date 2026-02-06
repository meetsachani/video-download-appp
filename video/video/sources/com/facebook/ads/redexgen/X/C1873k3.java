package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.k3  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1873k3 extends AbstractRunnableC1160Wc {
    public final /* synthetic */ C1872k2 A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C1873k3(C1872k2 c1872k2, AnonymousClass62 anonymousClass62) {
        this.A00 = c1872k2;
        this.A01 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        C1618fp c1618fp;
        C1618fp c1618fp2;
        C1618fp c1618fp3;
        this.A00.A00.A0A();
        c1618fp = this.A00.A00.A0B;
        if (c1618fp != null) {
            AnonymousClass62 anonymousClass62 = this.A01;
            c1618fp2 = this.A00.A00.A0B;
            anonymousClass62.setAdViewabilityChecker(c1618fp2);
            c1618fp3 = this.A00.A00.A0B;
            c1618fp3.A0U();
        }
    }
}
