package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ep  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0715Ep extends AbstractRunnableC1160Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0710Ek A02;

    public C0715Ep(C0710Ek c0710Ek, int i, int i2) {
        this.A02 = c0710Ek;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        UM um;
        um = this.A02.A0C;
        um.A02(new C0698Dy(this.A00, this.A01));
    }
}
