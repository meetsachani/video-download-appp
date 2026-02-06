package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import o.AbstractC5531cH0;
import o.C10861y4;
import o.C2691Ct1;
import o.C2715Db;
import o.C3220Ic;
import o.C4297Tc1;
import o.C4394Uc1;
import o.C4491Vc1;
import o.C5600ca;
import o.C6516gH2;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.C9179r91;
import o.C9293rd1;
import o.C9811tl1;
import o.D60;
import o.HT1;
import o.InterfaceC10336vu1;
import o.InterfaceC11300zs1;
import o.InterfaceC2501Av0;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;
import o.InterfaceC9341rp1;
import o.InterfaceC9397s30;
import o.J;
import o.JF;
import o.K60;
import o.NG0;
import o.NI2;
import o.PL0;
import o.Q3;
import o.RL2;
import o.Z60;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public static final int A1 = 1;
    public static final int B1 = 2;
    public static final int C1 = 4;
    public static final int D1 = 8;
    public static final int E1 = C7025iN1.n.Widget_Design_AppBarLayout;
    public static final int F1 = -1;
    public static final int z1 = 0;
    public int Y0;
    public int Z0;
    public int a1;
    public int b1;
    public boolean c1;
    public int d1;
    @InterfaceC11300zs1
    public RL2 e1;
    public List<b> f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    @InterfaceC11300zs1
    public ColorStateList k1;
    @PL0
    public int l1;
    @InterfaceC11300zs1
    public WeakReference<View> m1;
    @InterfaceC11300zs1
    public ValueAnimator n1;
    @InterfaceC11300zs1
    public ValueAnimator.AnimatorUpdateListener o1;
    public final List<f> p1;
    public final LinkedHashSet<g> q1;
    public final long r1;
    public final TimeInterpolator s1;
    public int[] t1;
    @JF
    public int u1;
    @InterfaceC11300zs1
    public Drawable v1;
    @InterfaceC11300zs1
    public Integer w1;
    public final float x1;
    public Behavior y1;

    /* loaded from: classes3.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends NG0<T> {
        public static final int m1 = 600;
        public int g1;
        public int h1;
        public ValueAnimator i1;
        public d j1;
        @InterfaceC11300zs1
        public WeakReference<View> k1;
        public c l1;

        /* loaded from: classes3.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ CoordinatorLayout a;
            public final /* synthetic */ AppBarLayout b;

            public a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.a = coordinatorLayout;
                this.b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
                BaseBehavior.this.e0(this.a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* loaded from: classes3.dex */
        public class b extends Q3 {
            public final /* synthetic */ AppBarLayout d;
            public final /* synthetic */ CoordinatorLayout e;

            public b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.d = appBarLayout;
                this.e = coordinatorLayout;
            }

            @Override // o.Q3
            public void g(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
                View u0;
                super.g(view, c10861y4);
                c10861y4.k1(ScrollView.class.getName());
                if (this.d.getTotalScrollRange() != 0 && (u0 = BaseBehavior.this.u0(this.e)) != null && BaseBehavior.this.q0(this.d)) {
                    if (BaseBehavior.this.b0() != (-this.d.getTotalScrollRange())) {
                        c10861y4.b(C10861y4.a.r);
                        c10861y4.Z1(true);
                    }
                    if (BaseBehavior.this.b0() != 0) {
                        if (u0.canScrollVertically(-1)) {
                            if ((-this.d.getDownNestedPreScrollRange()) != 0) {
                                c10861y4.b(C10861y4.a.s);
                                c10861y4.Z1(true);
                                return;
                            }
                            return;
                        }
                        c10861y4.b(C10861y4.a.s);
                        c10861y4.Z1(true);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.Q3
            public boolean j(View view, int i, Bundle bundle) {
                if (i == 4096) {
                    this.d.setExpanded(false);
                    return true;
                } else if (i == 8192) {
                    if (BaseBehavior.this.b0() != 0) {
                        View u0 = BaseBehavior.this.u0(this.e);
                        if (u0.canScrollVertically(-1)) {
                            int i2 = -this.d.getDownNestedPreScrollRange();
                            if (i2 != 0) {
                                BaseBehavior.this.y(this.e, this.d, u0, 0, i2, new int[]{0, 0}, 1);
                                return true;
                            }
                        } else {
                            this.d.setExpanded(true);
                            return true;
                        }
                    }
                    return false;
                } else {
                    return super.j(view, i, bundle);
                }
            }
        }

        /* loaded from: classes3.dex */
        public static abstract class c<T extends AppBarLayout> {
            public abstract boolean a(@InterfaceC5670cr1 T t);
        }

        public BaseBehavior() {
        }

        public static boolean p0(int i, int i2) {
            return (i & i2) == i2;
        }

        @InterfaceC11300zs1
        public static View s0(@InterfaceC5670cr1 AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // o.KH2, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: A0 */
        public boolean t(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t, int i) {
            boolean z;
            int round;
            boolean t2 = super.t(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            d dVar = this.j1;
            if (dVar != null && (pendingAction & 8) == 0) {
                if (dVar.Z) {
                    e0(coordinatorLayout, t, -t.getTotalScrollRange());
                } else if (dVar.Y0) {
                    e0(coordinatorLayout, t, 0);
                } else {
                    View childAt = t.getChildAt(dVar.Z0);
                    int i2 = -childAt.getBottom();
                    if (this.j1.b1) {
                        round = childAt.getMinimumHeight() + t.getTopInset();
                    } else {
                        round = Math.round(childAt.getHeight() * this.j1.a1);
                    }
                    e0(coordinatorLayout, t, i2 + round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i3 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        k0(coordinatorLayout, t, i3, 0.0f);
                    } else {
                        e0(coordinatorLayout, t, i3);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        k0(coordinatorLayout, t, 0, 0.0f);
                    } else {
                        e0(coordinatorLayout, t, 0);
                    }
                }
            }
            t.F();
            this.j1 = null;
            U(C9293rd1.e(O(), -t.getTotalScrollRange(), 0));
            O0(coordinatorLayout, t, O(), 0, true);
            t.z(O());
            j0(coordinatorLayout, t);
            return t2;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: B0 */
        public boolean u(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) t.getLayoutParams())).height == -2) {
                coordinatorLayout.O(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.u(coordinatorLayout, t, i, i2, i3, i4);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: C0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void y(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t, View view, int i, int i2, int[] iArr, int i3) {
            T t2;
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.getTotalScrollRange();
                    i5 = t.getDownNestedPreScrollRange() + i4;
                } else {
                    i4 = -t.getUpNestedPreScrollRange();
                    i5 = 0;
                }
                int i6 = i4;
                int i7 = i5;
                if (i6 != i7) {
                    t2 = t;
                    iArr[1] = d0(coordinatorLayout, t2, i2, i6, i7);
                    if (!t2.u()) {
                        t2.L(t2.O(view));
                        return;
                    }
                    return;
                }
            }
            t2 = t;
            if (!t2.u()) {
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: D0 */
        public void B(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            T t2;
            int i6;
            if (i4 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                t2 = t;
                i6 = i4;
                iArr[1] = d0(coordinatorLayout2, t2, i6, -t.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t2 = t;
                i6 = i4;
            }
            if (i6 == 0) {
                j0(coordinatorLayout2, t2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: E0 */
        public void F(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t, Parcelable parcelable) {
            if (parcelable instanceof d) {
                I0((d) parcelable, true);
                super.F(coordinatorLayout, t, this.j1.a());
                return;
            }
            super.F(coordinatorLayout, t, parcelable);
            this.j1 = null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: F0 */
        public Parcelable G(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t) {
            Parcelable G = super.G(coordinatorLayout, t);
            d J0 = J0(G, t);
            if (J0 == null) {
                return G;
            }
            return J0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: G0 */
        public boolean I(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t, @InterfaceC5670cr1 View view, View view2, int i, int i2) {
            boolean z;
            ValueAnimator valueAnimator;
            if ((i & 2) != 0 && (t.u() || t.w() || o0(coordinatorLayout, t, view))) {
                z = true;
            } else {
                z = false;
            }
            if (z && (valueAnimator = this.i1) != null) {
                valueAnimator.cancel();
            }
            this.k1 = null;
            this.h1 = i2;
            return z;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H0 */
        public void K(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t, View view, int i) {
            if (this.h1 == 0 || i == 1) {
                N0(coordinatorLayout, t);
                if (t.u()) {
                    t.L(t.O(view));
                }
            }
            this.k1 = new WeakReference<>(view);
        }

        public void I0(@InterfaceC11300zs1 d dVar, boolean z) {
            if (this.j1 != null && !z) {
                return;
            }
            this.j1 = dVar;
        }

        @InterfaceC11300zs1
        public d J0(@InterfaceC11300zs1 Parcelable parcelable, @InterfaceC5670cr1 T t) {
            boolean z;
            boolean z2;
            int O = O();
            int childCount = t.getChildCount();
            boolean z3 = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + O;
                if (childAt.getTop() + O <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = J.Y;
                    }
                    d dVar = new d(parcelable);
                    if (O == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dVar.Y0 = z;
                    if (!z && (-O) >= t.getTotalScrollRange()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    dVar.Z = z2;
                    dVar.Z0 = i;
                    if (bottom == childAt.getMinimumHeight() + t.getTopInset()) {
                        z3 = true;
                    }
                    dVar.b1 = z3;
                    dVar.a1 = bottom / childAt.getHeight();
                    return dVar;
                }
            }
            return null;
        }

        public void K0(@InterfaceC11300zs1 c cVar) {
            this.l1 = cVar;
        }

        @Override // o.NG0
        /* renamed from: L0 */
        public int f0(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t, int i, int i2, int i3) {
            CoordinatorLayout coordinatorLayout2;
            T t2;
            int i4;
            int b0 = b0();
            int i5 = 0;
            if (i2 != 0 && b0 >= i2 && b0 <= i3) {
                int e = C9293rd1.e(i, i2, i3);
                if (b0 != e) {
                    if (t.o()) {
                        i4 = x0(t, e);
                    } else {
                        i4 = e;
                    }
                    boolean U = U(i4);
                    int i6 = b0 - e;
                    this.g1 = e - i4;
                    int i7 = 1;
                    if (U) {
                        while (i5 < t.getChildCount()) {
                            e eVar = (e) t.getChildAt(i5).getLayoutParams();
                            c b2 = eVar.b();
                            if (b2 != null && (eVar.c() & 1) != 0) {
                                b2.a(t, t.getChildAt(i5), O());
                            }
                            i5++;
                        }
                    }
                    if (!U && t.o()) {
                        coordinatorLayout.j(t);
                    }
                    t.z(O());
                    if (e < b0) {
                        i7 = -1;
                    }
                    coordinatorLayout2 = coordinatorLayout;
                    t2 = t;
                    O0(coordinatorLayout2, t2, e, i7, false);
                    i5 = i6;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    t2 = t;
                }
            } else {
                coordinatorLayout2 = coordinatorLayout;
                t2 = t;
                this.g1 = 0;
            }
            j0(coordinatorLayout2, t2);
            return i5;
        }

        public final boolean M0(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t) {
            List<View> x = coordinatorLayout.x(t);
            int size = x.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.c f = ((CoordinatorLayout.g) x.get(i).getLayoutParams()).f();
                if (f instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) f).Z() == 0) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }

        public final void N0(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t) {
            int topInset = t.getTopInset() + t.getPaddingTop();
            int b0 = b0() - topInset;
            int t0 = t0(t, b0);
            if (t0 >= 0) {
                View childAt = t.getChildAt(t0);
                e eVar = (e) childAt.getLayoutParams();
                int c2 = eVar.c();
                if ((c2 & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (t0 == 0 && t.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        i -= t.getTopInset();
                    }
                    if (p0(c2, 2)) {
                        i2 += childAt.getMinimumHeight();
                    } else if (p0(c2, 5)) {
                        int minimumHeight = childAt.getMinimumHeight() + i2;
                        if (b0 < minimumHeight) {
                            i = minimumHeight;
                        } else {
                            i2 = minimumHeight;
                        }
                    }
                    if (p0(c2, 32)) {
                        i += ((LinearLayout.LayoutParams) eVar).topMargin;
                        i2 -= ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    k0(coordinatorLayout, t, C9293rd1.e(m0(b0, i2, i) + topInset, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void O0(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t, int i, int i2, boolean z) {
            View s0 = s0(t, i);
            boolean z2 = false;
            if (s0 != null) {
                int c2 = ((e) s0.getLayoutParams()).c();
                if ((c2 & 1) != 0) {
                    int minimumHeight = s0.getMinimumHeight();
                    if (i2 <= 0 || (c2 & 12) == 0 ? !((c2 & 2) == 0 || (-i) < (s0.getBottom() - minimumHeight) - t.getTopInset()) : (-i) >= (s0.getBottom() - minimumHeight) - t.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (t.u()) {
                z2 = t.O(r0(coordinatorLayout));
            }
            boolean L = t.L(z2);
            if (z || (L && M0(coordinatorLayout, t))) {
                if (t.getBackground() != null) {
                    t.getBackground().jumpToCurrentState();
                }
                if (t.getForeground() != null) {
                    t.getForeground().jumpToCurrentState();
                }
                if (t.getStateListAnimator() != null) {
                    t.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // o.NG0
        public int b0() {
            return O() + this.g1;
        }

        public final void j0(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t) {
            if (!C6516gH2.L0(coordinatorLayout)) {
                C6516gH2.I1(coordinatorLayout, new b(t, coordinatorLayout));
            }
        }

        public final void k0(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t, int i, float f) {
            int height;
            int abs = Math.abs(b0() - i);
            float abs2 = Math.abs(f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t.getHeight()) + 1.0f) * 150.0f);
            }
            l0(coordinatorLayout, t, i, height);
        }

        public final void l0(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int b0 = b0();
            if (b0 == i) {
                ValueAnimator valueAnimator = this.i1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.i1.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.i1;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.i1 = valueAnimator3;
                valueAnimator3.setInterpolator(C5600ca.e);
                this.i1.addUpdateListener(new a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.i1.setDuration(Math.min(i2, 600));
            this.i1.setIntValues(b0, i);
            this.i1.start();
        }

        public final int m0(int i, int i2, int i3) {
            if (i < (i2 + i3) / 2) {
                return i2;
            }
            return i3;
        }

        @Override // o.NG0
        /* renamed from: n0 */
        public boolean W(T t) {
            c cVar = this.l1;
            if (cVar != null) {
                return cVar.a(t);
            }
            WeakReference<View> weakReference = this.k1;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            if (view != null && view.isShown() && !view.canScrollVertically(-1)) {
                return true;
            }
            return false;
        }

        public final boolean o0(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t, @InterfaceC5670cr1 View view) {
            if (t.q() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight()) {
                return true;
            }
            return false;
        }

        public final boolean q0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((e) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                    return true;
                }
            }
            return false;
        }

        @InterfaceC11300zs1
        public final View r0(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof InterfaceC9341rp1) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int t0(@InterfaceC5670cr1 T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                e eVar = (e) childAt.getLayoutParams();
                if (p0(eVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        @InterfaceC11300zs1
        public final View u0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.g) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // o.NG0
        /* renamed from: v0 */
        public int Z(@InterfaceC5670cr1 T t) {
            return (-t.getDownNestedScrollRange()) + t.getTopInset();
        }

        @Override // o.NG0
        /* renamed from: w0 */
        public int a0(@InterfaceC5670cr1 T t) {
            return t.getTotalScrollRange();
        }

        public final int x0(@InterfaceC5670cr1 T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                Interpolator d2 = eVar.d();
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    if (d2 != null) {
                        int c2 = eVar.c();
                        if ((c2 & 1) != 0) {
                            i2 = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                            if ((c2 & 2) != 0) {
                                i2 -= childAt.getMinimumHeight();
                            }
                        }
                        if (childAt.getFitsSystemWindows()) {
                            i2 -= t.getTopInset();
                        }
                        if (i2 > 0) {
                            float f = i2;
                            return Integer.signum(i) * (childAt.getTop() + Math.round(f * d2.getInterpolation((abs - childAt.getTop()) / f)));
                        }
                    }
                } else {
                    i3++;
                }
            }
            return i;
        }

        @InterfaceC5056aJ2
        public boolean y0() {
            ValueAnimator valueAnimator = this.i1;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return true;
            }
            return false;
        }

        @Override // o.NG0
        /* renamed from: z0 */
        public void c0(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 T t) {
            N0(coordinatorLayout, t);
            if (t.u()) {
                t.L(t.O(r0(coordinatorLayout)));
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* loaded from: classes3.dex */
        public static class d extends J {
            public static final Parcelable.Creator<d> CREATOR = new a();
            public boolean Y0;
            public boolean Z;
            public int Z0;
            public float a1;
            public boolean b1;

            /* loaded from: classes3.dex */
            public class a implements Parcelable.ClassLoaderCreator<d> {
                @Override // android.os.Parcelable.Creator
                @InterfaceC11300zs1
                /* renamed from: a */
                public d createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
                    return new d(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                @InterfaceC5670cr1
                /* renamed from: b */
                public d createFromParcel(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
                    return new d(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                @InterfaceC5670cr1
                /* renamed from: c */
                public d[] newArray(int i) {
                    return new d[i];
                }
            }

            public d(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.Z = parcel.readByte() != 0;
                this.Y0 = parcel.readByte() != 0;
                this.Z0 = parcel.readInt();
                this.a1 = parcel.readFloat();
                this.b1 = parcel.readByte() != 0;
            }

            @Override // o.J, android.os.Parcelable
            public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.Z ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.Y0 ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.Z0);
                parcel.writeFloat(this.a1);
                parcel.writeByte(this.b1 ? (byte) 1 : (byte) 0);
            }

            public d(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* loaded from: classes3.dex */
        public static abstract class a extends BaseBehavior.c<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean A0(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 AppBarLayout appBarLayout, int i) {
            return super.t(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean B0(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.u(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void C0(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.y(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void D0(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.B(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void E0(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 AppBarLayout appBarLayout, Parcelable parcelable) {
            super.F(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable F0(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 AppBarLayout appBarLayout) {
            return super.G(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean G0(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 AppBarLayout appBarLayout, @InterfaceC5670cr1 View view, View view2, int i, int i2) {
            return super.I(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void H0(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 AppBarLayout appBarLayout, View view, int i) {
            super.K(coordinatorLayout, appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void K0(@InterfaceC11300zs1 BaseBehavior.c cVar) {
            super.K0(cVar);
        }

        @Override // o.NG0, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean L(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 MotionEvent motionEvent) {
            return super.L(coordinatorLayout, view, motionEvent);
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ int N() {
            return super.N();
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ int O() {
            return super.O();
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ boolean P() {
            return super.P();
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ boolean Q() {
            return super.Q();
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ void S(boolean z) {
            super.S(z);
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ boolean T(int i) {
            return super.T(i);
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ boolean U(int i) {
            return super.U(i);
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ void V(boolean z) {
            super.V(z);
        }

        @Override // o.NG0, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean s(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 MotionEvent motionEvent) {
            return super.s(coordinatorLayout, view, motionEvent);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes3.dex */
    public static class ScrollingViewBehavior extends AbstractC5531cH0 {
        public ScrollingViewBehavior() {
        }

        public static int g0(@InterfaceC5670cr1 AppBarLayout appBarLayout) {
            CoordinatorLayout.c f = ((CoordinatorLayout.g) appBarLayout.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).b0();
            }
            return 0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean E(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 Rect rect, boolean z) {
            AppBarLayout W = W(coordinatorLayout.w(view));
            if (W != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.Y0;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    W.G(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ int N() {
            return super.N();
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ int O() {
            return super.O();
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ boolean P() {
            return super.P();
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ boolean Q() {
            return super.Q();
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ void S(boolean z) {
            super.S(z);
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ boolean T(int i) {
            return super.T(i);
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ boolean U(int i) {
            return super.U(i);
        }

        @Override // o.KH2
        public /* bridge */ /* synthetic */ void V(boolean z) {
            super.V(z);
        }

        @Override // o.AbstractC5531cH0
        public float Y(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int g0 = g0(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + g0 > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (g0 / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // o.AbstractC5531cH0
        public int a0(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.a0(view);
        }

        @Override // o.AbstractC5531cH0
        @InterfaceC11300zs1
        /* renamed from: f0 */
        public AppBarLayout W(@InterfaceC5670cr1 List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public final void h0(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2) {
            CoordinatorLayout.c f = ((CoordinatorLayout.g) view2.getLayoutParams()).f();
            if (f instanceof BaseBehavior) {
                C6516gH2.k1(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).g1) + b0()) - X(view2));
            }
        }

        public final void i0(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.u()) {
                    appBarLayout.L(appBarLayout.O(view));
                }
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean m(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean p(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2) {
            h0(view, view2);
            i0(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void q(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2) {
            if (view2 instanceof AppBarLayout) {
                C6516gH2.I1(coordinatorLayout, null);
            }
        }

        @Override // o.KH2, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean t(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, int i) {
            return super.t(coordinatorLayout, view, i);
        }

        @Override // o.AbstractC5531cH0, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean u(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, int i, int i2, int i3, int i4) {
            return super.u(coordinatorLayout, view, i, i2, i3, i4);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.M9);
            d0(obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.N9, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes3.dex */
    public class a implements InterfaceC10336vu1 {
        public a() {
        }

        @Override // o.InterfaceC10336vu1
        public RL2 a(View view, RL2 rl2) {
            return AppBarLayout.this.A(rl2);
        }
    }

    /* loaded from: classes3.dex */
    public interface b<T extends AppBarLayout> {
        void a(T t, int i);
    }

    /* loaded from: classes3.dex */
    public static abstract class c {
        public abstract void a(@InterfaceC5670cr1 AppBarLayout appBarLayout, @InterfaceC5670cr1 View view, float f);
    }

    /* loaded from: classes3.dex */
    public static class d extends c {
        public static final float c = 0.3f;
        public final Rect a = new Rect();
        public final Rect b = new Rect();

        public static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.c
        public void a(@InterfaceC5670cr1 AppBarLayout appBarLayout, @InterfaceC5670cr1 View view, float f) {
            b(this.a, appBarLayout, view);
            float abs = this.a.top - Math.abs(f);
            if (abs <= 0.0f) {
                float d = 1.0f - C9293rd1.d(Math.abs(abs / this.a.height()), 0.0f, 1.0f);
                float height = (-abs) - ((this.a.height() * 0.3f) * (1.0f - (d * d)));
                view.setTranslationY(height);
                view.getDrawingRect(this.b);
                this.b.offset(0, (int) (-height));
                if (height >= this.b.height()) {
                    view.setAlpha(0.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                view.setClipBounds(this.b);
                return;
            }
            view.setClipBounds(null);
            view.setTranslationY(0.0f);
            view.setAlpha(1.0f);
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface f {
        void a(@InterfaceC9397s30 float f, @JF int i);
    }

    /* loaded from: classes3.dex */
    public static abstract class g {
        public abstract void a(@InterfaceC9397s30 float f, @JF int i, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2);
    }

    /* loaded from: classes3.dex */
    public interface h extends b<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.b
        void a(AppBarLayout appBarLayout, int i);
    }

    public AppBarLayout(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, C4394Uc1 c4394Uc1, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c4394Uc1.x0(floatValue);
        Drawable drawable = appBarLayout.v1;
        if (drawable instanceof C4394Uc1) {
            ((C4394Uc1) drawable).x0(floatValue);
        }
        for (f fVar : appBarLayout.p1) {
            fVar.a(floatValue, c4394Uc1.L());
        }
        Iterator<g> it = appBarLayout.q1.iterator();
        while (it.hasNext()) {
            it.next().a(floatValue, c4394Uc1.L(), floatValue / appBarLayout.x1);
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, C4394Uc1 c4394Uc1, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int t = C9179r91.t(appBarLayout.u1, colorStateList.getDefaultColor(), floatValue);
        c4394Uc1.y0(ColorStateList.valueOf(t));
        if (appBarLayout.v1 != null && (num2 = appBarLayout.w1) != null && num2.equals(num)) {
            appBarLayout.v1.setTint(t);
        }
        if (!appBarLayout.p1.isEmpty()) {
            for (f fVar : appBarLayout.p1) {
                if (c4394Uc1.G() != null) {
                    fVar.a(0.0f, t);
                }
            }
        }
        if (!appBarLayout.q1.isEmpty()) {
            Iterator<g> it = appBarLayout.q1.iterator();
            while (it.hasNext()) {
                it.next().a(0.0f, t, floatValue);
            }
        }
    }

    public RL2 A(RL2 rl2) {
        RL2 rl22;
        if (getFitsSystemWindows()) {
            rl22 = rl2;
        } else {
            rl22 = null;
        }
        if (!C2691Ct1.a(this.e1, rl22)) {
            this.e1 = rl22;
            R();
            requestLayout();
        }
        return rl2;
    }

    @InterfaceC6181ey
    @Deprecated
    public boolean B(@InterfaceC5670cr1 f fVar) {
        return this.p1.remove(fVar);
    }

    @InterfaceC6181ey
    public boolean C(@InterfaceC5670cr1 g gVar) {
        return this.q1.remove(gVar);
    }

    public void D(@InterfaceC11300zs1 b bVar) {
        List<b> list = this.f1;
        if (list != null && bVar != null) {
            list.remove(bVar);
        }
    }

    public void E(h hVar) {
        D(hVar);
    }

    public void F() {
        this.d1 = 0;
    }

    public void G(boolean z, boolean z2) {
        H(z, z2, true);
    }

    public final void H(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.d1 = i4 | i3;
        requestLayout();
    }

    public boolean I(boolean z) {
        this.g1 = true;
        return J(z);
    }

    public final boolean J(boolean z) {
        if (this.h1 != z) {
            this.h1 = z;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    public boolean K(boolean z) {
        return M(z, true);
    }

    public boolean L(boolean z) {
        return M(z, !this.g1);
    }

    public boolean M(boolean z, boolean z2) {
        float f2;
        float f3;
        if (z2 && this.i1 != z) {
            this.i1 = z;
            refreshDrawableState();
            if (v()) {
                float f4 = 0.0f;
                if (this.k1 != null) {
                    if (z) {
                        f3 = 0.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    if (z) {
                        f4 = 1.0f;
                    }
                    Q(f3, f4);
                    return true;
                } else if (this.j1) {
                    if (z) {
                        f2 = 0.0f;
                    } else {
                        f2 = this.x1;
                    }
                    if (z) {
                        f4 = this.x1;
                    }
                    Q(f2, f4);
                    return true;
                } else {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean N() {
        if (this.v1 != null && getTopInset() > 0) {
            return true;
        }
        return false;
    }

    public boolean O(@InterfaceC11300zs1 View view) {
        View k = k(view);
        if (k != null) {
            view = k;
        }
        if (view != null) {
            if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean P() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    public final void Q(float f2, float f3) {
        ValueAnimator valueAnimator = this.n1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.n1 = ofFloat;
        ofFloat.setDuration(this.r1);
        this.n1.setInterpolator(this.s1);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.o1;
        if (animatorUpdateListener != null) {
            this.n1.addUpdateListener(animatorUpdateListener);
        }
        this.n1.start();
    }

    public final void R() {
        setWillNotDraw(!N());
    }

    @Deprecated
    public void c(@InterfaceC5670cr1 f fVar) {
        this.p1.add(fVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d(@InterfaceC5670cr1 g gVar) {
        this.q1.add(gVar);
    }

    @Override // android.view.View
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        super.draw(canvas);
        if (N()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.Y0);
            this.v1.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v1;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public void e(@InterfaceC11300zs1 b bVar) {
        if (this.f1 == null) {
            this.f1 = new ArrayList();
        }
        if (bVar != null && !this.f1.contains(bVar)) {
            this.f1.add(bVar);
        }
    }

    public void f(h hVar) {
        e(hVar);
    }

    @Deprecated
    public void g() {
        this.p1.clear();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @InterfaceC5670cr1
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.y1 = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.a1;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = eVar.a;
                if ((i4 & 5) == 5) {
                    int i5 = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = i5 + minimumHeight;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                } else if (i3 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i3);
        this.a1 = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.b1;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                int i4 = eVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.b1 = max;
        return max;
    }

    @PL0
    public int getLiftOnScrollTargetViewId() {
        return this.l1;
    }

    @InterfaceC11300zs1
    public C4394Uc1 getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof C4394Uc1) {
            return (C4394Uc1) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int i;
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i2 = (minimumHeight * 2) + topInset;
            if (i2 < getHeight()) {
                return i2;
            }
            return minimumHeight + topInset;
        }
        int childCount = getChildCount();
        if (childCount >= 1) {
            i = getChildAt(childCount - 1).getMinimumHeight();
        } else {
            i = 0;
        }
        if (i != 0) {
            int i3 = (i * 2) + topInset;
            if (i3 < getHeight()) {
                return i3;
            }
            return i + topInset;
        }
        return getHeight() / 3;
    }

    public int getPendingAction() {
        return this.d1;
    }

    @InterfaceC11300zs1
    public Drawable getStatusBarForeground() {
        return this.v1;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @InterfaceC5056aJ2
    public final int getTopInset() {
        RL2 rl2 = this.e1;
        if (rl2 != null) {
            return rl2.r();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.Z0;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = eVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    i3 -= getTopInset();
                }
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.Z0 = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public void h() {
        this.q1.clear();
    }

    public final void i() {
        WeakReference<View> weakReference = this.m1;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.m1 = null;
    }

    @InterfaceC11300zs1
    public final Integer j() {
        Drawable drawable = this.v1;
        if (drawable instanceof C4394Uc1) {
            return Integer.valueOf(((C4394Uc1) drawable).L());
        }
        ColorStateList g2 = Z60.g(drawable);
        if (g2 != null) {
            return Integer.valueOf(g2.getDefaultColor());
        }
        return null;
    }

    @InterfaceC11300zs1
    public final View k(@InterfaceC11300zs1 View view) {
        int i;
        View view2;
        if (this.m1 == null && (i = this.l1) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.l1);
            }
            if (view2 != null) {
                this.m1 = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.m1;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: l */
    public e generateDefaultLayoutParams() {
        return new e(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: m */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: n */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new e((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public boolean o() {
        return this.c1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4491Vc1.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        if (this.t1 == null) {
            this.t1 = new int[4];
        }
        int[] iArr = this.t1;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.h1;
        int i4 = C7025iN1.c.state_liftable;
        if (!z) {
            i4 = -i4;
        }
        iArr[0] = i4;
        if (z && this.i1) {
            i2 = C7025iN1.c.state_lifted;
        } else {
            i2 = -C7025iN1.c.state_lifted;
        }
        iArr[1] = i2;
        int i5 = C7025iN1.c.state_collapsible;
        if (!z) {
            i5 = -i5;
        }
        iArr[2] = i5;
        if (z && this.i1) {
            i3 = C7025iN1.c.state_collapsed;
        } else {
            i3 = -C7025iN1.c.state_collapsed;
        }
        iArr[3] = i3;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && P()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C6516gH2.k1(getChildAt(childCount), topInset);
            }
        }
        t();
        this.c1 = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((e) getChildAt(i5).getLayoutParams()).d() != null) {
                this.c1 = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.v1;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.g1) {
            if (!this.j1 && !p()) {
                z2 = false;
            }
            J(z2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && P()) {
            int measuredHeight = getMeasuredHeight();
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    measuredHeight += getTopInset();
                }
            } else {
                measuredHeight = C9293rd1.e(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        t();
    }

    public final boolean p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((e) getChildAt(i).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    public boolean q() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    public final void r(final C4394Uc1 c4394Uc1, @InterfaceC5670cr1 final ColorStateList colorStateList) {
        final Integer f2 = C9179r91.f(getContext(), C7025iN1.c.colorSurface);
        this.o1 = new ValueAnimator.AnimatorUpdateListener() { // from class: o.Eb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(AppBarLayout.this, colorStateList, c4394Uc1, f2, valueAnimator);
            }
        };
    }

    public final void s(Context context, final C4394Uc1 c4394Uc1) {
        c4394Uc1.i0(context);
        this.o1 = new ValueAnimator.AnimatorUpdateListener() { // from class: o.Fb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(AppBarLayout.this, c4394Uc1, valueAnimator);
            }
        };
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(y(getContext(), drawable));
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C4491Vc1.d(this, f2);
    }

    public void setExpanded(boolean z) {
        G(z, isLaidOut());
    }

    public void setLiftOnScroll(boolean z) {
        this.j1 = z;
    }

    public void setLiftOnScrollColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.k1 != colorStateList) {
            this.k1 = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(@InterfaceC11300zs1 View view) {
        this.l1 = -1;
        if (view == null) {
            i();
        } else {
            this.m1 = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(@PL0 int i) {
        this.l1 = i;
        i();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.g1 = z;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setPendingAction(int i) {
        this.d1 = i;
    }

    public void setStatusBarForeground(@InterfaceC11300zs1 Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.v1;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.v1 = drawable3;
            this.w1 = j();
            Drawable drawable4 = this.v1;
            if (drawable4 != null) {
                if (drawable4.isStateful()) {
                    this.v1.setState(getDrawableState());
                }
                D60.m(this.v1, getLayoutDirection());
                Drawable drawable5 = this.v1;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.v1.setCallback(this);
            }
            R();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(@JF int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(@K60 int i) {
        setStatusBarForeground(C3220Ic.b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        NI2.b(this, f2);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.v1;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    public final void t() {
        BaseBehavior.d dVar;
        Behavior behavior = this.y1;
        if (behavior != null && this.Z0 != -1 && this.d1 == 0) {
            dVar = behavior.J0(J.Y, this);
        } else {
            dVar = null;
        }
        this.Z0 = -1;
        this.a1 = -1;
        this.b1 = -1;
        if (dVar != null) {
            this.y1.I0(dVar, false);
        }
    }

    public boolean u() {
        return this.j1;
    }

    public final boolean v() {
        return getBackground() instanceof C4394Uc1;
    }

    @Override // android.view.View
    public boolean verifyDrawable(@InterfaceC5670cr1 Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.v1) {
            return false;
        }
        return true;
    }

    public boolean w() {
        return this.i1;
    }

    @InterfaceC11300zs1
    public final C4394Uc1 x(Drawable drawable) {
        if (drawable instanceof C4394Uc1) {
            return (C4394Uc1) drawable;
        }
        ColorStateList g2 = Z60.g(drawable);
        if (g2 == null) {
            return null;
        }
        C4394Uc1 c4394Uc1 = new C4394Uc1();
        c4394Uc1.y0(g2);
        return c4394Uc1;
    }

    public final Drawable y(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Drawable drawable) {
        C4394Uc1 x = x(drawable);
        if (x != null && x.G() != null) {
            this.u1 = x.G().getDefaultColor();
            ColorStateList colorStateList = this.k1;
            if (colorStateList != null) {
                r(x, colorStateList);
                return x;
            }
            s(context, x);
            return x;
        }
        return drawable;
    }

    public void z(int i) {
        this.Y0 = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List<b> list = this.f1;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.f1.get(i2);
                if (bVar != null) {
                    bVar.a(this, i);
                }
            }
        }
    }

    public AppBarLayout(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.appBarLayoutStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AppBarLayout(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = E1;
        this.Z0 = -1;
        this.a1 = -1;
        this.b1 = -1;
        this.d1 = 0;
        this.p1 = new ArrayList();
        this.q1 = new LinkedHashSet<>();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            NI2.a(this);
        }
        NI2.c(this, attributeSet, i, i2);
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.a, i, i2, new int[0]);
        this.k1 = C4297Tc1.a(context2, k, C7025iN1.o.h);
        this.r1 = C9811tl1.f(context2, C7025iN1.c.motionDurationMedium2, getResources().getInteger(C7025iN1.i.app_bar_elevation_anim_duration));
        this.s1 = C9811tl1.g(context2, C7025iN1.c.motionEasingStandardInterpolator, C5600ca.a);
        int i3 = C7025iN1.o.f;
        if (k.hasValue(i3)) {
            H(k.getBoolean(i3, false), false, false);
        }
        int i4 = C7025iN1.o.e;
        if (k.hasValue(i4)) {
            NI2.b(this, k.getDimensionPixelSize(i4, 0));
        }
        setBackground(k.getDrawable(C7025iN1.o.b));
        if (Build.VERSION.SDK_INT >= 26) {
            int i5 = C7025iN1.o.d;
            if (k.hasValue(i5)) {
                C2715Db.a(this, k.getBoolean(i5, false));
            }
            int i6 = C7025iN1.o.c;
            if (k.hasValue(i6)) {
                setTouchscreenBlocksFocus(k.getBoolean(i6, false));
            }
        }
        this.x1 = getResources().getDimension(C7025iN1.f.design_appbar_elevation);
        this.j1 = k.getBoolean(C7025iN1.o.g, false);
        this.l1 = k.getResourceId(C7025iN1.o.i, -1);
        setStatusBarForeground(k.getDrawable(C7025iN1.o.j));
        k.recycle();
        C6516gH2.l2(this, new a());
    }

    /* loaded from: classes3.dex */
    public static class e extends LinearLayout.LayoutParams {
        public static final int d = 0;
        public static final int e = 1;
        public static final int f = 2;
        public static final int g = 4;
        public static final int h = 8;
        public static final int i = 16;
        public static final int j = 32;
        public static final int k = 5;
        public static final int l = 17;
        public static final int m = 10;
        public static final int n = 0;

        /* renamed from: o  reason: collision with root package name */
        public static final int f319o = 1;
        public int a;
        public c b;
        public Interpolator c;

        @HT1({HT1.a.Y})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface a {
        }

        @HT1({HT1.a.Y})
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface b {
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.p);
            this.a = obtainStyledAttributes.getInt(C7025iN1.o.r, 0);
            f(obtainStyledAttributes.getInt(C7025iN1.o.q, 0));
            int i2 = C7025iN1.o.s;
            if (obtainStyledAttributes.hasValue(i2)) {
                this.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        @InterfaceC11300zs1
        public final c a(int i2) {
            if (i2 != 1) {
                return null;
            }
            return new d();
        }

        @InterfaceC11300zs1
        public c b() {
            return this.b;
        }

        public int c() {
            return this.a;
        }

        public Interpolator d() {
            return this.c;
        }

        public boolean e() {
            int i2 = this.a;
            if ((i2 & 1) == 1 && (i2 & 10) != 0) {
                return true;
            }
            return false;
        }

        public void f(int i2) {
            this.b = a(i2);
        }

        public void g(@InterfaceC11300zs1 c cVar) {
            this.b = cVar;
        }

        public void h(int i2) {
            this.a = i2;
        }

        public void i(Interpolator interpolator) {
            this.c = interpolator;
        }

        public e(int i2, int i3) {
            super(i2, i3);
            this.a = 1;
        }

        public e(int i2, int i3, float f2) {
            super(i2, i3, f2);
            this.a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
        }

        public e(@InterfaceC5670cr1 e eVar) {
            super((LinearLayout.LayoutParams) eVar);
            this.a = 1;
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
        }
    }
}
