package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.fQ  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1593fQ implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ DB A02;

    public C1593fQ(DB db, int i, int i2) {
        this.A02 = db;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A02.A07(this.A00, this.A01, false);
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        EnumC1586fJ enumC1586fJ;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        DB db = this.A02;
        int i2 = this.A01;
        i = this.A02.A04;
        if (i2 == i) {
            enumC1586fJ = EnumC1586fJ.A02;
        } else {
            enumC1586fJ = EnumC1586fJ.A04;
        }
        db.A01 = enumC1586fJ;
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
