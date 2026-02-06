package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bt  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1376bt implements View.OnClickListener {
    public final /* synthetic */ View$OnClickListenerC0871Kr A00;
    public final /* synthetic */ String A01;

    public View$OnClickListenerC1376bt(View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr, String str) {
        this.A00 = view$OnClickListenerC0871Kr;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0E(this.A01);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
