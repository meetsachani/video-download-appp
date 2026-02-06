package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1344bN implements View.OnClickListener {
    public final /* synthetic */ C0877Kx A00;

    public View$OnClickListenerC1344bN(C0877Kx c0877Kx) {
        this.A00 = c0877Kx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
