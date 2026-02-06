package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class IU implements XN {
    public final /* synthetic */ C5S A00;

    public IU(C5S c5s) {
        this.A00 = c5s;
    }

    @Override // com.facebook.ads.redexgen.X.XN
    public final void ADS() {
        InterfaceC1493dm interfaceC1493dm;
        int i;
        InterfaceC1493dm interfaceC1493dm2;
        interfaceC1493dm = this.A00.A0P;
        i = this.A00.A0F;
        interfaceC1493dm.ADc(i);
        interfaceC1493dm2 = this.A00.A0P;
        interfaceC1493dm2.ADA();
    }

    @Override // com.facebook.ads.redexgen.X.XN
    public final void AFV(float f) {
        int i;
        boolean z;
        C0710Ek c0710Ek;
        int duration;
        boolean z2;
        int i2;
        InterfaceC1493dm interfaceC1493dm;
        i = this.A00.A0F;
        float f2 = i - f;
        z = this.A00.A0d;
        if (z) {
            duration = 0;
        } else {
            c0710Ek = this.A00.A0S;
            duration = c0710Ek.getDuration();
        }
        float totalForce = f2 + duration;
        z2 = this.A00.A0d;
        if (z2) {
            i2 = this.A00.A0F;
        } else {
            i2 = this.A00.A0E;
        }
        float seenTime = i2;
        float totalForce2 = totalForce / seenTime;
        interfaceC1493dm = this.A00.A0P;
        interfaceC1493dm.AKd(totalForce2);
    }
}
