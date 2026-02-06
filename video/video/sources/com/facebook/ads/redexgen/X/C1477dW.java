package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.dW  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1477dW extends AnimatorListenerAdapter {
    public final /* synthetic */ C5F A00;
    public final /* synthetic */ boolean A01;

    public C1477dW(C5F c5f, boolean z) {
        this.A00 = c5f;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1422cd c1422cd;
        M3 m3;
        M3 m32;
        super.onAnimationEnd(animator);
        c1422cd = this.A00.A0H;
        c1422cd.setTranslationY(0.0f);
        this.A00.A0V();
        if (!this.A01) {
            m3 = this.A00.A0G;
            if (m3 != null) {
                m32 = this.A00.A0G;
                m32.destroy();
            }
        }
    }
}
