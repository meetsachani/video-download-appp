package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* loaded from: assets/audience_network/classes2.dex */
public class H8 extends AbstractC1617fo {
    public final /* synthetic */ AbstractC0760Gj A00;

    public H8(AbstractC0760Gj abstractC0760Gj) {
        this.A00 = abstractC0760Gj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1617fo
    public final void A03() {
        if (!this.A00.A08.A07()) {
            this.A00.A08.A05();
            if (!TextUtils.isEmpty(this.A00.A03.A2E())) {
                this.A00.A06.ABJ(this.A00.A03.A2E(), new C1330b9().A03(this.A00.A0C).A02(this.A00.A08).A04(this.A00.A03.A0z()).A05());
                if (this.A00.A03.A1u()) {
                    this.A00.A05.A0F().AEW();
                }
                C1169Wl.A00(this.A00.A05).A0E(this.A00.A0B.A8l(), this.A00.A03.A2E());
                C0937Ng.A07(this.A00.A03.A2A(), this.A00.A05);
                this.A00.A05.A0F().A3L();
                AbstractC0957Oa.A02(this.A00.A03.A0y(), AbstractC1193Xm.A00(this.A00.A03.A10()));
                this.A00.A0A.A4j(this.A00.A0B.A8G());
            }
        }
    }
}
