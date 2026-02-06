package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.f7  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1574f7 extends AnimatorListenerAdapter {
    public final /* synthetic */ C04343c A00;

    public C1574f7(C04343c c04343c) {
        this.A00 = c04343c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C0682Di(this), 2000L);
    }
}
