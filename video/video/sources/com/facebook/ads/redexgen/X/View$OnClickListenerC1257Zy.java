package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1257Zy implements View.OnClickListener {
    public final /* synthetic */ C1240Zh A00;
    public final /* synthetic */ MC A01;

    public View$OnClickListenerC1257Zy(MC mc, C1240Zh c1240Zh) {
        this.A01 = mc;
        this.A00 = c1240Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC0965Oi.A06);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
