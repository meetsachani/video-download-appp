package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C10201vM;
import o.C5600ca;
import o.C6566gU0;
import o.C7025iN1;
import o.C9811tl1;
import o.DH0;
import o.EH0;
import o.FH0;
import o.HH0;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC9397s30;
import o.UE;

/* loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int j1 = 225;
    public static final int k1 = 175;
    public static final int l1 = C7025iN1.c.motionDurationLong2;
    public static final int m1 = C7025iN1.c.motionDurationMedium4;
    public static final int n1 = C7025iN1.c.motionEasingEmphasizedInterpolator;
    public static final int o1 = 0;
    public static final int p1 = 1;
    public static final int q1 = 2;
    public static final int r1 = 1;
    public static final int s1 = 2;
    public HH0 X;
    public AccessibilityManager Y;
    public boolean Y0;
    public AccessibilityManager.TouchExplorationStateChangeListener Z;
    @InterfaceC5670cr1
    public final LinkedHashSet<c> Z0;
    public int a1;
    public int b1;
    @InterfaceC11300zs1
    public TimeInterpolator c1;
    @InterfaceC11300zs1
    public TimeInterpolator d1;
    public int e1;
    public int f1;
    public int g1;
    @InterfaceC11300zs1
    public ViewPropertyAnimator h1;
    public boolean i1;

    /* loaded from: classes3.dex */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@InterfaceC5670cr1 View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@InterfaceC5670cr1 View view) {
            if (HideViewOnScrollBehavior.this.Z != null && HideViewOnScrollBehavior.this.Y != null) {
                HideViewOnScrollBehavior.this.Y.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.Z);
                HideViewOnScrollBehavior.this.Z = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.h1 = null;
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

    public HideViewOnScrollBehavior() {
        this.Y0 = true;
        this.Z0 = new LinkedHashSet<>();
        this.e1 = 0;
        this.f1 = 2;
        this.g1 = 0;
        this.i1 = false;
    }

    public static /* synthetic */ void N(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z) {
        if (hideViewOnScrollBehavior.Y0 && z && hideViewOnScrollBehavior.c0()) {
            hideViewOnScrollBehavior.i0(view);
        }
    }

    private void T(@InterfaceC5670cr1 V v, int i, long j, @InterfaceC5670cr1 TimeInterpolator timeInterpolator) {
        this.h1 = this.X.d(v, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new b());
    }

    private void V(final V v) {
        if (this.Y == null) {
            this.Y = (AccessibilityManager) C10201vM.s(v.getContext(), AccessibilityManager.class);
        }
        if (this.Y != null && this.Z == null) {
            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: o.GH0
                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public final void onTouchExplorationStateChanged(boolean z) {
                    HideViewOnScrollBehavior.N(HideViewOnScrollBehavior.this, v, z);
                }
            };
            this.Z = touchExplorationStateChangeListener;
            this.Y.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
            v.addOnAttachStateChangeListener(new a());
        }
    }

    @InterfaceC5670cr1
    public static <V extends View> HideViewOnScrollBehavior<V> X(@InterfaceC5670cr1 V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c f = ((CoordinatorLayout.g) layoutParams).f();
            if (f instanceof HideViewOnScrollBehavior) {
                return (HideViewOnScrollBehavior) f;
            }
            throw new IllegalArgumentException("The view is not associated with HideViewOnScrollBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private void m0(@InterfaceC5670cr1 V v, int i) {
        this.f1 = i;
        Iterator<c> it = this.Z0.iterator();
        while (it.hasNext()) {
            it.next().a(v, this.f1);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 View view, int i, int i2, int i3, int i4, int i5, @InterfaceC5670cr1 int[] iArr) {
        if (i2 > 0) {
            k0(v);
        } else if (i2 < 0) {
            i0(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean I(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, int i, int i2) {
        return i == 2;
    }

    public void S(@InterfaceC5670cr1 c cVar) {
        this.Z0.add(cVar);
    }

    public void U() {
        this.Z0.clear();
    }

    public void W(boolean z) {
        this.Y0 = z;
    }

    public boolean Y() {
        return this.Y0;
    }

    public final boolean Z(int i) {
        return i == 80 || i == 81;
    }

    public final boolean a0(int i) {
        return i == 3 || i == 19;
    }

    public boolean b0() {
        if (this.f1 == 2) {
            return true;
        }
        return false;
    }

    public boolean c0() {
        if (this.f1 == 1) {
            return true;
        }
        return false;
    }

    public void d0(@InterfaceC5670cr1 c cVar) {
        this.Z0.remove(cVar);
    }

    public void e0(@InterfaceC5670cr1 V v, @InterfaceC9397s30 int i) {
        this.g1 = i;
        if (this.f1 == 1) {
            this.X.e(v, this.e1, i);
        }
    }

    public void f0(int i) {
        this.i1 = true;
        h0(i);
    }

    public final void g0(@InterfaceC5670cr1 V v, int i) {
        int i2;
        if (this.i1) {
            return;
        }
        int i3 = ((CoordinatorLayout.g) v.getLayoutParams()).c;
        if (Z(i3)) {
            h0(1);
            return;
        }
        if (a0(Gravity.getAbsoluteGravity(i3, i))) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        h0(i2);
    }

    public final void h0(int i) {
        HH0 hh0 = this.X;
        if (hh0 != null && hh0.c() == i) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.X = new EH0();
                    return;
                }
                throw new IllegalArgumentException("Invalid view edge position value: " + i + ". Must be 0" + C6566gU0.h + "1 or 2" + UE.h);
            }
            this.X = new DH0();
            return;
        }
        this.X = new FH0();
    }

    public void i0(@InterfaceC5670cr1 V v) {
        j0(v, true);
    }

    public void j0(@InterfaceC5670cr1 V v, boolean z) {
        if (b0()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.h1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        m0(v, 2);
        int b2 = this.X.b();
        if (z) {
            T(v, b2, this.a1, this.c1);
        } else {
            this.X.f(v, b2);
        }
    }

    public void k0(@InterfaceC5670cr1 V v) {
        l0(v, true);
    }

    public void l0(@InterfaceC5670cr1 V v, boolean z) {
        AccessibilityManager accessibilityManager;
        if (!c0()) {
            if (this.Y0 && (accessibilityManager = this.Y) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h1;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            m0(v, 1);
            int i = this.e1 + this.g1;
            if (z) {
                T(v, i, this.b1, this.d1);
            } else {
                this.X.f(v, i);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 V v, int i) {
        V(v);
        g0(v, i);
        this.e1 = this.X.a(v, (ViewGroup.MarginLayoutParams) v.getLayoutParams());
        this.a1 = C9811tl1.f(v.getContext(), l1, 225);
        this.b1 = C9811tl1.f(v.getContext(), m1, 175);
        Context context = v.getContext();
        int i2 = n1;
        this.c1 = C9811tl1.g(context, i2, C5600ca.d);
        this.d1 = C9811tl1.g(v.getContext(), i2, C5600ca.c);
        return super.t(coordinatorLayout, v, i);
    }

    public HideViewOnScrollBehavior(int i) {
        this();
        f0(i);
    }

    public HideViewOnScrollBehavior(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Y0 = true;
        this.Z0 = new LinkedHashSet<>();
        this.e1 = 0;
        this.f1 = 2;
        this.g1 = 0;
        this.i1 = false;
    }
}
