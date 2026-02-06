package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZZ implements View.OnClickListener {
    public final /* synthetic */ C1234Zb A00;

    public ZZ(C1234Zb c1234Zb) {
        this.A00 = c1234Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1238Zf interfaceC1238Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1238Zf = this.A00.A04;
            interfaceC1238Zf.AAp();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
