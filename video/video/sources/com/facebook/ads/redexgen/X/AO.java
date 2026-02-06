package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public final class AO implements C5Y {
    public InterfaceC05015t A02;
    public InterfaceC1913kj<String> A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C04965o A07 = new C04965o();
    public int A00 = 8000;
    public int A01 = 8000;

    public final AO A00(InterfaceC05015t interfaceC05015t) {
        this.A02 = interfaceC05015t;
        return this;
    }

    public final AO A01(String str) {
        this.A04 = str;
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.C5Y
    /* renamed from: A02 */
    public final C03921k A5I() {
        C03921k c03921k = new C03921k(this.A04, this.A00, this.A01, this.A05, this.A07, this.A03, this.A06);
        if (this.A02 != null) {
            c03921k.A43(this.A02);
        }
        return c03921k;
    }
}
