package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.cN  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1406cN extends AnimatorListenerAdapter {
    public final /* synthetic */ KE A00;
    public final /* synthetic */ boolean A01;

    public C1406cN(KE ke, boolean z) {
        this.A00 = ke;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1422cd c1422cd;
        DZ dz;
        AbstractC1847jd abstractC1847jd;
        DZ dz2;
        DZ dz3;
        M3 m3;
        M3 m32;
        super.onAnimationEnd(animator);
        c1422cd = this.A00.A0K;
        c1422cd.setTranslationY(0.0f);
        this.A00.A0T();
        if (!this.A01) {
            m3 = this.A00.A0I;
            if (m3 != null) {
                m32 = this.A00.A0I;
                m32.destroy();
            }
        }
        dz = this.A00.A0g;
        if (dz != null) {
            abstractC1847jd = this.A00.A0E;
            if (!abstractC1847jd.A1i()) {
                dz3 = this.A00.A0g;
                dz3.setVisibility(this.A01 ? 8 : 0);
                return;
            }
            dz2 = this.A00.A0g;
            dz2.setVisibility(8);
        }
    }
}
