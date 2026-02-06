package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class EH extends AbstractC0960Od {
    public final /* synthetic */ EF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EH(EF ef, double d, double d2, double d3, boolean z) {
        super(d, d2, d3, z);
        this.A00 = ef;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0960Od
    public final void A00(boolean z, boolean z2, C0962Of c0962Of) {
        C1673gi c1673gi;
        String str;
        Map A0J;
        boolean z3;
        c1673gi = this.A00.A0D;
        if (C1123Up.A0z(c1673gi)) {
            z3 = this.A00.A09;
            if (z3) {
                return;
            }
        }
        if (z2) {
            this.A00.A09 = true;
            EF ef = this.A00;
            str = this.A00.A0J;
            A0J = this.A00.A0J(EnumC1551ek.A03);
            ef.A0R(str, A0J);
        }
    }
}
