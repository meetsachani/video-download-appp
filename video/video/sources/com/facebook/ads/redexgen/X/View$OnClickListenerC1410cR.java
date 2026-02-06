package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cR  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class View$OnClickListenerC1410cR implements View.OnClickListener {
    public final /* synthetic */ KE A00;

    public View$OnClickListenerC1410cR(KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        AbstractC0925Mt abstractC0925Mt;
        AbstractC1847jd abstractC1847jd;
        Handler handler;
        Runnable runnable;
        AbstractC1847jd abstractC1847jd2;
        AbstractC0925Mt abstractC0925Mt2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0M;
            if (!z) {
                this.A00.A0N = true;
                abstractC0925Mt = this.A00.A0b;
                if (abstractC0925Mt != null) {
                    KE ke = this.A00;
                    abstractC0925Mt2 = this.A00.A0b;
                    ke.A0f(((AnonymousClass85) abstractC0925Mt2).A0M().toString());
                }
                abstractC1847jd = this.A00.A0E;
                if (abstractC1847jd.A0q() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0h;
                    abstractC1847jd2 = this.A00.A0E;
                    handler.postDelayed(runnable, abstractC1847jd2.A0q());
                }
            }
            KE ke2 = this.A00;
            z2 = this.A00.A0M;
            ke2.A0i(z2 ? false : true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
