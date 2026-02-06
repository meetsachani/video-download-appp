package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.bQ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1347bQ implements Animator.AnimatorListener {
    public final /* synthetic */ C1348bR A00;

    public C1347bQ(C1348bR c1348bR) {
        this.A00 = c1348bR;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RelativeLayout relativeLayout;
        C1673gi c1673gi;
        this.A00.A06();
        relativeLayout = this.A00.A05;
        YB.A0O(relativeLayout, 8);
        c1673gi = this.A00.A07;
        c1673gi.A0F().ADG();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A00.A01 = true;
    }
}
