package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Nz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0956Nz implements InterfaceC1364bh {
    public final /* synthetic */ NO A00;

    public C0956Nz(NO no) {
        this.A00 = no;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1364bh
    public final void ACt() {
        boolean A0X;
        A0X = this.A00.A0X();
        if (A0X) {
            this.A00.A0N();
            this.A00.A0g.setToolbarActionMessage("");
            this.A00.A0g.setToolbarActionMode(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1364bh
    public final void AEm() {
        XO xo;
        this.A00.A0K = false;
        xo = this.A00.A0U;
        xo.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1364bh
    public final void AEn() {
        XO xo;
        this.A00.A0K = true;
        xo = this.A00.A0U;
        xo.A06();
    }
}
