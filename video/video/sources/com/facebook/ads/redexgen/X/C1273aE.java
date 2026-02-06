package com.facebook.ads.redexgen.X;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.aE  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1273aE implements Animator.AnimatorListener {
    public final /* synthetic */ C1278aJ A00;

    public C1273aE(C1278aJ c1278aJ) {
        this.A00 = c1278aJ;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A00.A08();
        this.A00.A0B();
    }
}
