package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.f4  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1571f4 extends AbstractRunnableC1160Wc {
    public final /* synthetic */ C1669ge A00;

    public C1571f4(C1669ge c1669ge) {
        this.A00 = c1669ge;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        for (TY ty : TX.A02()) {
            TX.A0A(this.A00, ty.A02(), ty.A00(), ty.A01(), false);
        }
        TX.A02().clear();
    }
}
