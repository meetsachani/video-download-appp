package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Yl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class animation.Animation$AnimationListenerC1218Yl implements Animation.AnimationListener {
    public final /* synthetic */ View$OnClickListenerC05316x A00;

    public animation.Animation$AnimationListenerC1218Yl(View$OnClickListenerC05316x view$OnClickListenerC05316x) {
        this.A00 = view$OnClickListenerC05316x;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i;
        Handler handler;
        Runnable runnable;
        int i2;
        this.A00.A06();
        i = this.A00.A04;
        if (i > 0) {
            handler = this.A00.A05;
            runnable = this.A00.A07;
            i2 = this.A00.A04;
            handler.postDelayed(runnable, i2);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
