package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ad  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1298ad implements View.OnClickListener {
    public final /* synthetic */ M6 A00;

    public View$OnClickListenerC1298ad(M6 m6) {
        this.A00 = m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1673gi c1673gi;
        InterfaceC1315au interfaceC1315au;
        InterfaceC1315au interfaceC1315au2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1673gi = this.A00.A09;
            c1673gi.A0F().A9w();
            interfaceC1315au = this.A00.A06;
            if (interfaceC1315au != null) {
                interfaceC1315au2 = this.A00.A06;
                interfaceC1315au2.ADO();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
