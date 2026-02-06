package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1362bf implements View.OnClickListener {
    public final /* synthetic */ C1365bi A00;

    public View$OnClickListenerC1362bf(C1365bi c1365bi) {
        this.A00 = c1365bi;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1364bh interfaceC1364bh;
        AbstractC1208Yb abstractC1208Yb;
        List<View> list;
        C0710Ek c0710Ek;
        C0710Ek c0710Ek2;
        C0710Ek c0710Ek3;
        AbstractC1208Yb abstractC1208Yb2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1364bh = this.A00.A05;
            interfaceC1364bh.AEm();
            abstractC1208Yb = this.A00.A00;
            if (abstractC1208Yb != null) {
                abstractC1208Yb2 = this.A00.A00;
                YB.A0L(abstractC1208Yb2);
            }
            list = this.A00.A07;
            for (View view2 : list) {
                YB.A0O(view2, 0);
            }
            YB.A0J(this.A00);
            c0710Ek = this.A00.A06;
            if (c0710Ek == null) {
                return;
            }
            c0710Ek2 = this.A00.A06;
            YB.A0O(c0710Ek2, 0);
            c0710Ek3 = this.A00.A06;
            c0710Ek3.A0e(EnumC1560et.A02, 14);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
