package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import o.InterfaceC11300zs1;
import o.InterfaceC2591Bt;
import o.InterfaceC5670cr1;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    @InterfaceC11300zs1
    public AnimatorSet Z0;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.Z0 = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @InterfaceC2591Bt
    public boolean R(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        AnimatorSet animatorSet = this.Z0;
        if (animatorSet != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet T = T(view, view2, z, z3);
        this.Z0 = T;
        T.addListener(new a());
        this.Z0.start();
        if (!z2) {
            this.Z0.end();
        }
        return true;
    }

    @InterfaceC5670cr1
    public abstract AnimatorSet T(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
