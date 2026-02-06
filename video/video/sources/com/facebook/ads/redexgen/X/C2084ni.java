package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.ni  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2084ni implements InterfaceC0725Ez {
    public long A00;
    public long A01;
    public C2084ni A02;
    public C0724Ey A03;

    public C2084ni(long j, int i) {
        A02(j, i);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final C2084ni A01() {
        this.A03 = null;
        C2084ni c2084ni = this.A02;
        this.A02 = null;
        return c2084ni;
    }

    public final void A02(long j, int i) {
        AbstractC04543y.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = i + j;
    }

    public final void A03(C0724Ey c0724Ey, C2084ni c2084ni) {
        this.A03 = c0724Ey;
        this.A02 = c2084ni;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0725Ez
    public final C0724Ey A6u() {
        return (C0724Ey) AbstractC04543y.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0725Ez
    public final C2084ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
