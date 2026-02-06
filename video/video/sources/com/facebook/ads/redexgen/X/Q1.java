package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class Q1 extends AbstractRunnableC1160Wc {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ YR A01;

    public Q1(YR yr, DialogInterface dialogInterface) {
        this.A01 = yr;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        InterfaceC1624fv interfaceC1624fv;
        InterfaceC1624fv interfaceC1624fv2;
        C1669ge c1669ge;
        Map<? extends String, ? extends String> A02;
        interfaceC1624fv = this.A01.A01.A02;
        if (interfaceC1624fv != null) {
            interfaceC1624fv2 = this.A01.A01.A02;
            c1669ge = this.A01.A01.A00;
            String A03 = WI.A03(c1669ge);
            C1638g9 c1638g9 = new C1638g9();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC1624fv2.AGx(A03, c1638g9.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
