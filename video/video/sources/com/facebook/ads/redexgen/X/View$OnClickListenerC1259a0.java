package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a0  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1259a0 implements View.OnClickListener {
    public final /* synthetic */ MC A00;

    public View$OnClickListenerC1259a0(MC mc) {
        this.A00 = mc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.A9c();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
