package com.facebook.ads.redexgen.X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* loaded from: assets/audience_network/classes2.dex */
public class GX extends AbstractRunnableC1160Wc {
    public final /* synthetic */ InterfaceC1495dp A00;
    public final /* synthetic */ C1496dq A01;

    public GX(C1496dq c1496dq, InterfaceC1495dp interfaceC1495dp) {
        this.A01 = c1496dq;
        this.A00 = interfaceC1495dp;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new GY(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
