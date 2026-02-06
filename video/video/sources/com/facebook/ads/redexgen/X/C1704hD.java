package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.hD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1704hD implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1703hC A01;

    public C1704hD(C1703hC c1703hC, int i) {
        this.A01 = c1703hC;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.XN
    public final void ADS() {
        C1673gi c1673gi;
        c1673gi = this.A01.A0C;
        c1673gi.A0F().ABa();
    }

    @Override // com.facebook.ads.redexgen.X.XN
    public final void AFV(float f) {
        C1354bX c1354bX;
        C1354bX c1354bX2;
        float f2 = 1.0f - (f / this.A00);
        c1354bX = this.A01.A0G;
        if (c1354bX != null) {
            c1354bX2 = this.A01.A0G;
            c1354bX2.setProgressWithAnimation(100.0f * f2);
        }
    }
}
