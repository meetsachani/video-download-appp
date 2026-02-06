package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.cg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1425cg extends AnimatorListenerAdapter {
    public final /* synthetic */ C0836Ji A00;
    public final /* synthetic */ boolean A01;

    public C1425cg(C0836Ji c0836Ji, boolean z) {
        this.A00 = c0836Ji;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        M3 m3;
        M3 m32;
        super.onAnimationEnd(animator);
        C0836Ji c0836Ji = this.A00;
        z = this.A00.A0D;
        c0836Ji.A0t(z, true);
        if (!this.A01) {
            m3 = this.A00.A08;
            if (m3 != null) {
                m32 = this.A00.A08;
                m32.destroy();
            }
        }
    }
}
