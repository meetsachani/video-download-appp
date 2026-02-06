package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.f8  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1575f8 extends AnimatorListenerAdapter {
    public final /* synthetic */ C0681Dh A00;

    public C1575f8(C0681Dh c0681Dh) {
        this.A00 = c0681Dh;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        view = this.A00.A00;
        view.setVisibility(8);
    }
}
