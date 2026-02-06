package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Gh  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0758Gh implements InterfaceC1493dm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0755Ge A01;

    public C0758Gh(C0755Ge c0755Ge, int i) {
        this.A01 = c0755Ge;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1493dm
    public final void ACQ() {
        this.A01.A0G();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1493dm
    public final void ADA() {
        this.A01.A0X(false, this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1493dm
    public final void ADc(int i) {
        C0755Ge.A03(this.A01, i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1493dm
    public final void ADw(float f) {
        boolean z;
        z = this.A01.A08;
        if (!z) {
            this.A01.A0L(f);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1493dm
    public final void AFw(boolean z) {
        this.A01.A0W(z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1493dm
    public final void AGQ(String str) {
        C1673gi c1673gi;
        C1839jT c1839jT;
        InterfaceC1214Yh interfaceC1214Yh;
        ZU zu;
        int i;
        C1839jT c1839jT2;
        C1673gi c1673gi2;
        c1673gi = this.A01.A0D;
        c1673gi.A0F().A3a(str);
        c1839jT = this.A01.A0A;
        if (c1839jT.A2H()) {
            i = this.A01.A00;
            c1839jT2 = this.A01.A0A;
            if (i < c1839jT2.A23()) {
                c1673gi2 = this.A01.A0D;
                c1673gi2.A0F().AC2();
                this.A01.A0X(false, this.A00);
                return;
            }
        }
        interfaceC1214Yh = this.A01.A0I;
        zu = this.A01.A0J;
        interfaceC1214Yh.A4j(zu.A81());
        this.A01.A0M(3);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1493dm
    public final void AKc() {
        AbstractC1208Yb abstractC1208Yb;
        AbstractC1208Yb abstractC1208Yb2;
        this.A01.setUnskippableSecondsComplete(false);
        abstractC1208Yb = this.A01.A0H;
        abstractC1208Yb.setProgressImmediate(0.0f);
        abstractC1208Yb2 = this.A01.A0H;
        abstractC1208Yb2.setToolbarActionMode(2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1493dm
    public final void AKd(float f) {
        AbstractC1208Yb abstractC1208Yb;
        abstractC1208Yb = this.A01.A0H;
        abstractC1208Yb.setProgress(100.0f * f);
    }
}
