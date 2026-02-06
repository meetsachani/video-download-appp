package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cV  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1414cV implements View.OnClickListener {
    public final /* synthetic */ KD A00;

    public View$OnClickListenerC1414cV(KD kd) {
        this.A00 = kd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1503dx interfaceC1503dx;
        InterfaceC1503dx interfaceC1503dx2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1503dx = this.A00.A02;
            if (interfaceC1503dx != null) {
                interfaceC1503dx2 = this.A00.A02;
                interfaceC1503dx2.A9l();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
