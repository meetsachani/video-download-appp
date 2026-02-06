package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import o.C7069ia;
import o.C9568sl1;
import o.InterfaceC5670cr1;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public static final long c1 = 75;
    public static final long d1 = 150;
    public static final long e1 = 0;
    public static final long f1 = 150;
    public final C9568sl1 a1;
    public final C9568sl1 b1;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ View b;

        public a(boolean z, View view) {
            this.a = z;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                this.b.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.a1 = new C9568sl1(75L, 150L);
        this.b1 = new C9568sl1(0L, 150L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean L(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 MotionEvent motionEvent) {
        return super.L(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @InterfaceC5670cr1
    public AnimatorSet T(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        U(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C7069ia.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2));
        return animatorSet;
    }

    public final void U(@InterfaceC5670cr1 View view, boolean z, boolean z2, @InterfaceC5670cr1 List<Animator> list, List<Animator.AnimatorListener> list2) {
        C9568sl1 c9568sl1;
        ObjectAnimator ofFloat;
        if (z) {
            c9568sl1 = this.a1;
        } else {
            c9568sl1 = this.b1;
        }
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f);
        }
        c9568sl1.a(ofFloat);
        list.add(ofFloat);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a1 = new C9568sl1(75L, 150L);
        this.b1 = new C9568sl1(0L, 150L);
    }
}
