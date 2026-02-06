package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1210Yd implements View.OnClickListener {
    public final /* synthetic */ C0987Pe A00;

    public View$OnClickListenerC1210Yd(C0987Pe c0987Pe) {
        this.A00 = c0987Pe;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0G();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
