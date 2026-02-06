package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network/classes2.dex */
public class QI implements InterfaceC1198Xr {
    public int A00;
    public final InterfaceC1198Xr A01;

    public QI(InterfaceC1198Xr interfaceC1198Xr, int i) {
        this.A01 = interfaceC1198Xr;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1198Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1198Xr
    public final void flush() {
        this.A01.flush();
    }
}
