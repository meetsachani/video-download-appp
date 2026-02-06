package com.facebook.ads.redexgen.X;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.bP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1346bP implements Animator.AnimatorListener {
    public final /* synthetic */ C1348bR A00;

    public C1346bP(C1348bR c1348bR) {
        this.A00 = c1348bR;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1673gi c1673gi;
        this.A00.A06();
        this.A00.A02 = true;
        c1673gi = this.A00.A07;
        c1673gi.A0F().ADF();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
