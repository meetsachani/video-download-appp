package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1242Zj implements View.OnClickListener {
    public final /* synthetic */ ME A00;

    public View$OnClickListenerC1242Zj(ME me) {
        this.A00 = me;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0D.AEr(EnumC0965Oi.A04);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
