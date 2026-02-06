package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzs extends AnimatorListenerAdapter {
    public final /* synthetic */ zzu a;

    public zzs(zzu zzuVar) {
        this.a = zzuVar;
    }

    public final void a(boolean z) {
        ImageButton imageButton;
        zzu zzuVar = this.a;
        zzuVar.setEnabled(z);
        imageButton = zzuVar.Y0;
        imageButton.setEnabled(z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        a(false);
    }
}
