package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1252Zt implements View.OnClickListener {
    public final /* synthetic */ C1254Zv A00;

    public View$OnClickListenerC1252Zt(C1254Zv c1254Zv) {
        this.A00 = c1254Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1238Zf interfaceC1238Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1238Zf = this.A00.A02;
            interfaceC1238Zf.A9c();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
