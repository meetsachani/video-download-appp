package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.j1  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1811j1 extends AbstractRunnableC1160Wc {
    public final /* synthetic */ AbstractC1810j0 A00;
    public final /* synthetic */ C1145Vm A01;

    public C1811j1(AbstractC1810j0 abstractC1810j0, C1145Vm c1145Vm) {
        this.A00 = abstractC1810j0;
        this.A01 = c1145Vm;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
