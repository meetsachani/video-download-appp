package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class KV implements XN {
    public final /* synthetic */ C6H A00;

    public KV(C6H c6h) {
        this.A00 = c6h;
    }

    @Override // com.facebook.ads.redexgen.X.XN
    public final void ADS() {
        AbstractC1208Yb abstractC1208Yb;
        AbstractC1208Yb abstractC1208Yb2;
        this.A00.A0B = false;
        abstractC1208Yb = this.A00.A05;
        if (abstractC1208Yb != null) {
            abstractC1208Yb2 = this.A00.A05;
            abstractC1208Yb2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.X.XN
    public final void AFV(float f) {
        AbstractC1208Yb abstractC1208Yb;
        AbstractC1208Yb abstractC1208Yb2;
        abstractC1208Yb = this.A00.A05;
        if (abstractC1208Yb != null) {
            abstractC1208Yb2 = this.A00.A05;
            abstractC1208Yb2.setProgressImmediate(100.0f * (1.0f - (f / ((float) this.A00.getAdInfo().A0K().A00()))));
        }
    }
}
