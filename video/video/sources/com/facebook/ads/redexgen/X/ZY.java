package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZY implements View.OnClickListener {
    public final /* synthetic */ C1234Zb A00;

    public ZY(C1234Zb c1234Zb) {
        this.A00 = c1234Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC1238Zf interfaceC1238Zf;
        InterfaceC1238Zf interfaceC1238Zf2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                interfaceC1238Zf2 = this.A00.A04;
                interfaceC1238Zf2.A53();
                return;
            }
            interfaceC1238Zf = this.A00.A04;
            interfaceC1238Zf.A54();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
