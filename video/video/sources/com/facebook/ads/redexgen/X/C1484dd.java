package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.dd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1484dd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass55 A00;

    public C1484dd(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C0710Ek c0710Ek;
        C0710Ek c0710Ek2;
        c0710Ek = this.A00.A0b;
        c0710Ek.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        c0710Ek2 = this.A00.A0b;
        c0710Ek2.requestLayout();
    }
}
