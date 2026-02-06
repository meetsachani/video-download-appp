package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1363bg implements View.OnClickListener {
    public final /* synthetic */ C1365bi A00;

    public View$OnClickListenerC1363bg(C1365bi c1365bi) {
        this.A00 = c1365bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
