package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1224Yr implements View.OnClickListener {
    public final /* synthetic */ PU A00;

    public View$OnClickListenerC1224Yr(PU pu) {
        this.A00 = pu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1207Ya interfaceC1207Ya;
        ZM zm;
        InterfaceC1207Ya interfaceC1207Ya2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1207Ya = this.A00.A01;
            if (interfaceC1207Ya != null) {
                zm = this.A00.A02;
                if (zm.A03()) {
                    interfaceC1207Ya2 = this.A00.A01;
                    interfaceC1207Ya2.ACl(this.A00);
                }
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
