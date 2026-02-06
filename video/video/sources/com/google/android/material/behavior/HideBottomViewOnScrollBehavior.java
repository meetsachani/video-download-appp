package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C10201vM;
import o.C5600ca;
import o.C7025iN1;
import o.C9811tl1;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC9397s30;

@Deprecated
/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int h1 = 225;
    public static final int i1 = 175;
    public static final int j1 = C7025iN1.c.motionDurationLong2;
    public static final int k1 = C7025iN1.c.motionDurationMedium4;
    public static final int l1 = C7025iN1.c.motionEasingEmphasizedInterpolator;
    public static final int m1 = 1;
    public static final int n1 = 2;
    @InterfaceC5670cr1
    public final LinkedHashSet<c> X;
    public int Y;
    public TimeInterpolator Y0;
    public int Z;
    public TimeInterpolator Z0;
    public int a1;
    public AccessibilityManager b1;
    public AccessibilityManager.TouchExplorationStateChangeListener c1;
    public boolean d1;
    public int e1;
    public int f1;
    @InterfaceC11300zs1
    public ViewPropertyAnimator g1;

    /* loaded from: classes3.dex */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@InterfaceC5670cr1 View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@InterfaceC5670cr1 View view) {
            if (HideBottomViewOnScrollBehavior.this.c1 != null && HideBottomViewOnScrollBehavior.this.b1 != null) {
                HideBottomViewOnScrollBehavior.this.b1.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.c1);
                HideBottomViewOnScrollBehavior.this.c1 = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.g1 = null;
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(@InterfaceC5670cr1 View view, int i);
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface d {
    }

    public HideBottomViewOnScrollBehavior() {
        this.X = new LinkedHashSet<>();
        this.a1 = 0;
        this.d1 = true;
        this.e1 = 2;
        this.f1 = 0;
    }

    public static /* synthetic */ void N(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean z) {
        if (z) {
            if (hideBottomViewOnScrollBehavior.Y()) {
                hideBottomViewOnScrollBehavior.e0(view);
                return;
            }
            return;
        }
        hideBottomViewOnScrollBehavior.getClass();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 View view, int i, int i2, int i3, int i4, int i5, @InterfaceC5670cr1 int[] iArr) {
        if (i2 > 0) {
            c0(v);
        } else if (i2 < 0) {
            e0(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean I(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, int i, int i2) {
        return i == 2;
    }

    public void S(@InterfaceC5670cr1 c cVar) {
        this.X.add(cVar);
    }

    public final void T(@InterfaceC5670cr1 V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.g1 = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new b());
    }

    public void U() {
        this.X.clear();
    }

    public final void V(final V v) {
        if (this.b1 == null) {
            this.b1 = (AccessibilityManager) C10201vM.s(v.getContext(), AccessibilityManager.class);
        }
        if (this.b1 != null && this.c1 == null) {
            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: o.CH0
                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public final void onTouchExplorationStateChanged(boolean z) {
                    HideBottomViewOnScrollBehavior.N(HideBottomViewOnScrollBehavior.this, v, z);
                }
            };
            this.c1 = touchExplorationStateChangeListener;
            this.b1.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
            v.addOnAttachStateChangeListener(new a());
        }
    }

    public void W(boolean z) {
        this.d1 = z;
    }

    public boolean X() {
        return this.d1;
    }

    public boolean Y() {
        if (this.e1 == 1) {
            return true;
        }
        return false;
    }

    public boolean Z() {
        if (this.e1 == 2) {
            return true;
        }
        return false;
    }

    public void a0(@InterfaceC5670cr1 c cVar) {
        this.X.remove(cVar);
    }

    public void b0(@InterfaceC5670cr1 V v, @InterfaceC9397s30 int i) {
        this.f1 = i;
        if (this.e1 == 1) {
            v.setTranslationY(this.a1 + i);
        }
    }

    public void c0(@InterfaceC5670cr1 V v) {
        d0(v, true);
    }

    public void d0(@InterfaceC5670cr1 V v, boolean z) {
        AccessibilityManager accessibilityManager;
        if (!Y()) {
            if (this.d1 && (accessibilityManager = this.b1) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.g1;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            g0(v, 1);
            int i = this.a1 + this.f1;
            if (z) {
                T(v, i, this.Z, this.Z0);
            } else {
                v.setTranslationY(i);
            }
        }
    }

    public void e0(@InterfaceC5670cr1 V v) {
        f0(v, true);
    }

    public void f0(@InterfaceC5670cr1 V v, boolean z) {
        if (Z()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.g1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        g0(v, 2);
        if (z) {
            T(v, 0, this.Y, this.Y0);
        } else {
            v.setTranslationY(0);
        }
    }

    public final void g0(@InterfaceC5670cr1 V v, int i) {
        this.e1 = i;
        Iterator<c> it = this.X.iterator();
        while (it.hasNext()) {
            it.next().a(v, this.e1);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, int i) {
        this.a1 = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.Y = C9811tl1.f(v.getContext(), j1, 225);
        this.Z = C9811tl1.f(v.getContext(), k1, 175);
        Context context = v.getContext();
        int i2 = l1;
        this.Y0 = C9811tl1.g(context, i2, C5600ca.d);
        this.Z0 = C9811tl1.g(v.getContext(), i2, C5600ca.c);
        V(v);
        return super.t(coordinatorLayout, v, i);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.X = new LinkedHashSet<>();
        this.a1 = 0;
        this.d1 = true;
        this.e1 = 2;
        this.f1 = 0;
    }
}
