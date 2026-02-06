package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cZ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1418cZ implements View.OnClickListener {
    public final /* synthetic */ KB A00;

    public View$OnClickListenerC1418cZ(KB kb) {
        this.A00 = kb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1503dx interfaceC1503dx;
        InterfaceC1503dx interfaceC1503dx2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1503dx = this.A00.A08;
            if (interfaceC1503dx != null) {
                interfaceC1503dx2 = this.A00.A08;
                interfaceC1503dx2.A9l();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
