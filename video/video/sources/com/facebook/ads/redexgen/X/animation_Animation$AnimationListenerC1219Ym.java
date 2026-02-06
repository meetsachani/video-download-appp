package com.facebook.ads.redexgen.X;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Ym  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class animation.Animation$AnimationListenerC1219Ym implements Animation.AnimationListener {
    public final /* synthetic */ View$OnClickListenerC05316x A00;

    public animation.Animation$AnimationListenerC1219Ym(View$OnClickListenerC05316x view$OnClickListenerC05316x) {
        this.A00 = view$OnClickListenerC05316x;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ((PZ) this.A00).A08.finish(16);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
