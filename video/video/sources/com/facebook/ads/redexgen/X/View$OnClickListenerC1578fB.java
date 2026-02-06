package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fB  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1578fB implements View.OnClickListener {
    public final /* synthetic */ C0679Df A00;

    public View$OnClickListenerC1578fB(C0679Df c0679Df) {
        this.A00 = c0679Df;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VI vi;
        C1673gi c1673gi;
        C0710Ek c0710Ek;
        boolean A07;
        C0710Ek c0710Ek2;
        C0710Ek c0710Ek3;
        if (WU.A02(this)) {
            return;
        }
        try {
            vi = this.A00.A04;
            vi.A04(VH.A0l, null);
            c1673gi = this.A00.A03;
            c1673gi.A0F().A3m();
            c0710Ek = this.A00.A00;
            if (c0710Ek != null) {
                A07 = this.A00.A07();
                if (A07) {
                    c0710Ek3 = this.A00.A00;
                    c0710Ek3.setVolume(1.0f);
                } else {
                    c0710Ek2 = this.A00.A00;
                    c0710Ek2.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
