package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class QF implements InterfaceC1198Xr {
    public final C1197Xq A00;
    public final InterfaceC1198Xr A01;

    public QF(InterfaceC1198Xr interfaceC1198Xr, int i, int i2) {
        this.A01 = interfaceC1198Xr;
        this.A00 = new C1197Xq(i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1198Xr
    public final void AH8(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() == null) {
            return;
        }
        A08 = AbstractC1200Xt.A08(this.A00);
        if (A08) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1198Xr
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = AbstractC1200Xt.A08(this.A00);
            if (A08) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
