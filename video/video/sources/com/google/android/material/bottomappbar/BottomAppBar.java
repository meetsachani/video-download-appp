package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C10920yI2;
import o.C4297Tc1;
import o.C4394Uc1;
import o.C4491Vc1;
import o.C4731Xo;
import o.C5600ca;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.C9811tl1;
import o.D60;
import o.HT1;
import o.InterfaceC10285vi1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC5917ds2;
import o.InterfaceC9397s30;
import o.J;
import o.JE0;
import o.JF;
import o.O22;
import o.PK1;
import o.RL2;

/* loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final int A2 = 0;
    public static final int B2 = 1;
    public static final int C2 = 0;
    public static final int D2 = 1;
    public static final int E2 = 0;
    public static final int F2 = 1;
    public static final int G2 = -1;
    public static final int H2 = 0;
    public static final int u2 = 300;
    public static final float x2 = 0.2f;
    public static final int y2 = 0;
    public static final int z2 = 1;
    @InterfaceC11300zs1
    public Integer T1;
    public final C4394Uc1 U1;
    @InterfaceC11300zs1
    public Animator V1;
    @InterfaceC11300zs1
    public Animator W1;
    public int X1;
    public int Y1;
    public int Z1;
    public final int a2;
    @PK1
    public int b2;
    public int c2;
    public final boolean d2;
    public boolean e2;
    public final boolean f2;
    public final boolean g2;
    public final boolean h2;
    public int i2;
    public ArrayList<j> j2;
    @InterfaceC10285vi1
    public int k2;
    public boolean l2;
    public boolean m2;
    public Behavior n2;
    public int o2;
    public int p2;
    public int q2;
    @InterfaceC5670cr1
    public AnimatorListenerAdapter r2;
    @InterfaceC5670cr1
    public InterfaceC5917ds2<FloatingActionButton> s2;
    public static final int t2 = C7025iN1.n.Widget_MaterialComponents_BottomAppBar;
    public static final int v2 = C7025iN1.c.motionDurationLong2;
    public static final int w2 = C7025iN1.c.motionEasingEmphasizedInterpolator;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.l2) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.c1(bottomAppBar.X1, BottomAppBar.this.m2);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements InterfaceC5917ds2<FloatingActionButton> {
        public b() {
        }

        @Override // o.InterfaceC5917ds2
        /* renamed from: c */
        public void a(@InterfaceC5670cr1 FloatingActionButton floatingActionButton) {
            float f;
            C4394Uc1 c4394Uc1 = BottomAppBar.this.U1;
            if (floatingActionButton.getVisibility() == 0 && BottomAppBar.this.Z1 == 1) {
                f = floatingActionButton.getScaleY();
            } else {
                f = 0.0f;
            }
            c4394Uc1.z0(f);
        }

        @Override // o.InterfaceC5917ds2
        /* renamed from: d */
        public void b(@InterfaceC5670cr1 FloatingActionButton floatingActionButton) {
            if (BottomAppBar.this.Z1 != 1) {
                return;
            }
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().j() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().p(translationX);
                BottomAppBar.this.U1.invalidateSelf();
            }
            float f = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().e() != max) {
                BottomAppBar.this.getTopEdgeTreatment().k(max);
                BottomAppBar.this.U1.invalidateSelf();
            }
            C4394Uc1 c4394Uc1 = BottomAppBar.this.U1;
            if (floatingActionButton.getVisibility() == 0) {
                f = floatingActionButton.getScaleY();
            }
            c4394Uc1.z0(f);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements C10920yI2.e {
        public c() {
        }

        @Override // o.C10920yI2.e
        @InterfaceC5670cr1
        public RL2 a(View view, @InterfaceC5670cr1 RL2 rl2, @InterfaceC5670cr1 C10920yI2.f fVar) {
            boolean z;
            if (BottomAppBar.this.f2) {
                BottomAppBar.this.o2 = rl2.o();
            }
            boolean z2 = true;
            boolean z3 = false;
            if (BottomAppBar.this.g2) {
                if (BottomAppBar.this.q2 != rl2.p()) {
                    z = true;
                } else {
                    z = false;
                }
                BottomAppBar.this.q2 = rl2.p();
            } else {
                z = false;
            }
            if (BottomAppBar.this.h2) {
                if (BottomAppBar.this.p2 == rl2.q()) {
                    z2 = false;
                }
                BottomAppBar.this.p2 = rl2.q();
                z3 = z2;
            }
            if (z || z3) {
                BottomAppBar.this.O0();
                BottomAppBar.this.n1();
                BottomAppBar.this.m1();
                return rl2;
            }
            return rl2;
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.T0();
            BottomAppBar.this.V1 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.U0();
        }
    }

    /* loaded from: classes3.dex */
    public class e extends FloatingActionButton.b {
        public final /* synthetic */ int a;

        /* loaded from: classes3.dex */
        public class a extends FloatingActionButton.b {
            public a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.T0();
            }
        }

        public e(int i) {
            this.a = i;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(@InterfaceC5670cr1 FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.Y0(this.a));
            floatingActionButton.y(new a());
        }
    }

    /* loaded from: classes3.dex */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.T0();
            BottomAppBar.this.l2 = false;
            BottomAppBar.this.W1 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.U0();
        }
    }

    /* loaded from: classes3.dex */
    public class g extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ ActionMenuView b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;

        public g(ActionMenuView actionMenuView, int i, boolean z) {
            this.b = actionMenuView;
            this.c = i;
            this.d = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z;
            if (!this.a) {
                if (BottomAppBar.this.k2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.l1(bottomAppBar.k2);
                BottomAppBar.this.r1(this.b, this.c, this.d, z);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Runnable {
        public final /* synthetic */ ActionMenuView X;
        public final /* synthetic */ int Y;
        public final /* synthetic */ boolean Z;

        public h(ActionMenuView actionMenuView, int i, boolean z) {
            this.X = actionMenuView;
            this.Y = i;
            this.Z = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.X;
            actionMenuView.setTranslationX(BottomAppBar.this.X0(actionMenuView, this.Y, this.Z));
        }
    }

    /* loaded from: classes3.dex */
    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.r2.onAnimationStart(animator);
            FloatingActionButton V0 = BottomAppBar.this.V0();
            if (V0 != null) {
                V0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface j {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface k {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface l {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface m {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface n {
    }

    /* loaded from: classes3.dex */
    public static class o extends J {
        public static final Parcelable.Creator<o> CREATOR = new a();
        public boolean Y0;
        public int Z;

        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<o> {
            @Override // android.os.Parcelable.Creator
            @InterfaceC11300zs1
            /* renamed from: a */
            public o createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @InterfaceC5670cr1
            /* renamed from: b */
            public o createFromParcel(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: c */
            public o[] newArray(int i) {
                return new o[i];
            }
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.Z);
            parcel.writeInt(this.Y0 ? 1 : 0);
        }

        public o(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readInt();
            this.Y0 = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    @InterfaceC11300zs1
    private Drawable e1(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable != null && this.T1 != null) {
            Drawable r = D60.r(drawable.mutate());
            r.setTint(this.T1.intValue());
            return r;
        }
        return drawable;
    }

    @InterfaceC11300zs1
    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.o2;
    }

    private int getFabAlignmentAnimationDuration() {
        return C9811tl1.f(getContext(), v2, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return Y0(this.X1);
    }

    private float getFabTranslationY() {
        int i2;
        if (this.Z1 == 1) {
            return -getTopEdgeTreatment().e();
        }
        View W0 = W0();
        if (W0 != null) {
            i2 = (-((getMeasuredHeight() + getBottomInset()) - W0.getMeasuredHeight())) / 2;
        } else {
            i2 = 0;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.q2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.p2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5670cr1
    public C4731Xo getTopEdgeTreatment() {
        return (C4731Xo) this.U1.getShapeAppearanceModel().p();
    }

    public static void s1(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
        gVar.d = 17;
        int i2 = bottomAppBar.Z1;
        if (i2 == 1) {
            gVar.d = 17 | 48;
        }
        if (i2 == 0) {
            gVar.d |= 80;
        }
    }

    public void L0(@InterfaceC5670cr1 j jVar) {
        if (this.j2 == null) {
            this.j2 = new ArrayList<>();
        }
        this.j2.add(jVar);
    }

    public final void M0(@InterfaceC5670cr1 FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.r2);
        floatingActionButton.f(new i());
        floatingActionButton.g(this.s2);
    }

    public void N0(@InterfaceC5670cr1 HideBottomViewOnScrollBehavior.c cVar) {
        getBehavior().S(cVar);
    }

    public final void O0() {
        Animator animator = this.W1;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.V1;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    public void P0() {
        getBehavior().U();
    }

    public void Q0(int i2, List<Animator> list) {
        FloatingActionButton V0 = V0();
        if (V0 != null && !V0.p()) {
            U0();
            V0.n(new e(i2));
        }
    }

    public final void R0(int i2, @InterfaceC5670cr1 List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(V0(), "translationX", Y0(i2));
        ofFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(ofFloat);
    }

    public final void S0(int i2, boolean z, @InterfaceC5670cr1 List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            ofFloat.setDuration(0.8f * fabAlignmentAnimationDuration);
            if (Math.abs(actionMenuView.getTranslationX() - X0(actionMenuView, i2, z)) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                ofFloat2.setDuration(fabAlignmentAnimationDuration * 0.2f);
                ofFloat2.addListener(new g(actionMenuView, i2, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ofFloat2, ofFloat);
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    public final void T0() {
        ArrayList<j> arrayList;
        int i2 = this.i2 - 1;
        this.i2 = i2;
        if (i2 == 0 && (arrayList = this.j2) != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }

    public final void U0() {
        ArrayList<j> arrayList;
        int i2 = this.i2;
        this.i2 = i2 + 1;
        if (i2 == 0 && (arrayList = this.j2) != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
        }
    }

    @InterfaceC11300zs1
    public final FloatingActionButton V0() {
        View W0 = W0();
        if (W0 instanceof FloatingActionButton) {
            return (FloatingActionButton) W0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View W0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).x(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
            while (r0.hasNext()) {
            }
        }
        return null;
    }

    public int X0(@InterfaceC5670cr1 ActionMenuView actionMenuView, int i2, boolean z) {
        int i3;
        int left;
        int i4;
        int i5 = 0;
        if (this.c2 != 1 && (i2 != 1 || !z)) {
            return 0;
        }
        boolean s = C10920yI2.s(this);
        if (s) {
            i3 = getMeasuredWidth();
        } else {
            i3 = 0;
        }
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).a & JE0.d) == 8388611) {
                if (s) {
                    i3 = Math.min(i3, childAt.getLeft());
                } else {
                    i3 = Math.max(i3, childAt.getRight());
                }
            }
        }
        if (s) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        if (s) {
            i4 = this.p2;
        } else {
            i4 = -this.q2;
        }
        if (getNavigationIcon() == null) {
            i5 = getResources().getDimensionPixelOffset(C7025iN1.f.m3_bottomappbar_horizontal_padding);
            if (!s) {
                i5 = -i5;
            }
        }
        return i3 - ((left + i4) + i5);
    }

    public final float Y0(int i2) {
        int i3;
        int i4;
        boolean s = C10920yI2.s(this);
        int i5 = 1;
        if (i2 == 1) {
            View W0 = W0();
            if (s) {
                i3 = this.q2;
            } else {
                i3 = this.p2;
            }
            if (this.b2 != -1 && W0 != null) {
                i4 = (W0.getMeasuredWidth() / 2) + this.b2;
            } else {
                i4 = this.a2;
            }
            int measuredWidth = (getMeasuredWidth() / 2) - (i3 + i4);
            if (s) {
                i5 = -1;
            }
            return measuredWidth * i5;
        }
        return 0.0f;
    }

    public final boolean Z0() {
        FloatingActionButton V0 = V0();
        if (V0 != null && V0.q()) {
            return true;
        }
        return false;
    }

    public boolean a1() {
        return getBehavior().Y();
    }

    public boolean b1() {
        return getBehavior().Z();
    }

    public final void c1(int i2, boolean z) {
        if (!isLaidOut()) {
            this.l2 = false;
            l1(this.k2);
            return;
        }
        Animator animator = this.W1;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!Z0()) {
            i2 = 0;
            z = false;
        }
        S0(i2, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.W1 = animatorSet;
        animatorSet.addListener(new f());
        this.W1.start();
    }

    public final void d1(int i2) {
        if (this.X1 != i2 && isLaidOut()) {
            Animator animator = this.V1;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.Y1 == 1) {
                R0(i2, arrayList);
            } else {
                Q0(i2, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.setInterpolator(C9811tl1.g(getContext(), w2, C5600ca.a));
            this.V1 = animatorSet;
            animatorSet.addListener(new d());
            this.V1.start();
        }
    }

    public void f1() {
        g1(true);
    }

    public void g1(boolean z) {
        getBehavior().d0(this, z);
    }

    @InterfaceC11300zs1
    public ColorStateList getBackgroundTint() {
        return this.U1.a0();
    }

    @InterfaceC9397s30
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().e();
    }

    public int getFabAlignmentMode() {
        return this.X1;
    }

    @PK1
    public int getFabAlignmentModeEndMargin() {
        return this.b2;
    }

    public int getFabAnchorMode() {
        return this.Z1;
    }

    public int getFabAnimationMode() {
        return this.Y1;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().g();
    }

    @InterfaceC9397s30
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().h();
    }

    public boolean getHideOnScroll() {
        return this.e2;
    }

    public int getMenuAlignmentMode() {
        return this.c2;
    }

    public void h1() {
        i1(true);
    }

    public void i1(boolean z) {
        getBehavior().f0(this, z);
    }

    public void j1(@InterfaceC5670cr1 j jVar) {
        ArrayList<j> arrayList = this.j2;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    public void k1(@InterfaceC5670cr1 HideBottomViewOnScrollBehavior.c cVar) {
        getBehavior().a0(cVar);
    }

    public void l1(@InterfaceC10285vi1 int i2) {
        if (i2 != 0) {
            this.k2 = 0;
            getMenu().clear();
            y(i2);
        }
    }

    public final void m1() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.W1 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!Z0()) {
                q1(actionMenuView, 0, false);
            } else {
                q1(actionMenuView, this.X1, this.m2);
            }
        }
    }

    public final void n1() {
        float f2;
        getTopEdgeTreatment().p(getFabTranslationX());
        C4394Uc1 c4394Uc1 = this.U1;
        if (this.m2 && Z0() && this.Z1 == 1) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        c4394Uc1.z0(f2);
        View W0 = W0();
        if (W0 != null) {
            W0.setTranslationY(getFabTranslationY());
            W0.setTranslationX(getFabTranslationX());
        }
    }

    public void o1(int i2, @InterfaceC10285vi1 int i3) {
        this.k2 = i3;
        this.l2 = true;
        c1(i2, this.m2);
        d1(i2);
        this.X1 = i2;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4491Vc1.f(this, this.U1);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            O0();
            n1();
            final View W0 = W0();
            if (W0 != null && W0.isLaidOut()) {
                W0.post(new Runnable() { // from class: o.Wo
                    @Override // java.lang.Runnable
                    public final void run() {
                        W0.requestLayout();
                    }
                });
            }
        }
        m1();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        this.X1 = oVar.Z;
        this.m2 = oVar.Y0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @InterfaceC5670cr1
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.Z = this.X1;
        oVar.Y0 = this.m2;
        return oVar;
    }

    public boolean p1(@PK1 int i2) {
        float f2 = i2;
        if (f2 != getTopEdgeTreatment().i()) {
            getTopEdgeTreatment().o(f2);
            this.U1.invalidateSelf();
            return true;
        }
        return false;
    }

    public final void q1(@InterfaceC5670cr1 ActionMenuView actionMenuView, int i2, boolean z) {
        r1(actionMenuView, i2, z, false);
    }

    public final void r1(@InterfaceC5670cr1 ActionMenuView actionMenuView, int i2, boolean z, boolean z3) {
        h hVar = new h(actionMenuView, i2, z);
        if (z3) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    public void setBackgroundTint(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.U1.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(@InterfaceC9397s30 float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().k(f2);
            this.U1.invalidateSelf();
            n1();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.U1.x0(f2);
        getBehavior().b0(this, this.U1.S() - this.U1.R());
    }

    public void setFabAlignmentMode(int i2) {
        o1(i2, 0);
    }

    public void setFabAlignmentModeEndMargin(@PK1 int i2) {
        if (this.b2 != i2) {
            this.b2 = i2;
            n1();
        }
    }

    public void setFabAnchorMode(int i2) {
        this.Z1 = i2;
        n1();
        View W0 = W0();
        if (W0 != null) {
            s1(this, W0);
            W0.requestLayout();
            this.U1.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i2) {
        this.Y1 = i2;
    }

    public void setFabCornerSize(@InterfaceC9397s30 float f2) {
        if (f2 != getTopEdgeTreatment().f()) {
            getTopEdgeTreatment().l(f2);
            this.U1.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@InterfaceC9397s30 float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().m(f2);
            this.U1.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@InterfaceC9397s30 float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().n(f2);
            this.U1.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.e2 = z;
    }

    public void setMenuAlignmentMode(int i2) {
        if (this.c2 != i2) {
            this.c2 = i2;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                q1(actionMenuView, this.X1, Z0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@InterfaceC11300zs1 Drawable drawable) {
        super.setNavigationIcon(e1(drawable));
    }

    public void setNavigationIconTint(@JF int i2) {
        this.T1 = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public BottomAppBar(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @InterfaceC5670cr1
    public Behavior getBehavior() {
        if (this.n2 == null) {
            this.n2 = new Behavior();
        }
        return this.n2;
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        @InterfaceC5670cr1
        public final Rect o1;
        public WeakReference<BottomAppBar> p1;
        public int q1;
        public final View.OnLayoutChangeListener r1;

        /* loaded from: classes3.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.p1.get();
                if (bottomAppBar != null && ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        floatingActionButton.j(Behavior.this.o1);
                        int height2 = Behavior.this.o1.height();
                        bottomAppBar.p1(height2);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.o1)));
                        height = height2;
                    }
                    CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
                    if (Behavior.this.q1 == 0) {
                        if (bottomAppBar.Z1 == 1) {
                            ((ViewGroup.MarginLayoutParams) gVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C7025iN1.f.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) gVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) gVar).rightMargin = bottomAppBar.getRightInset();
                        if (C10920yI2.s(view)) {
                            ((ViewGroup.MarginLayoutParams) gVar).leftMargin += bottomAppBar.a2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) gVar).rightMargin += bottomAppBar.a2;
                        }
                    }
                    bottomAppBar.n1();
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.r1 = new a();
            this.o1 = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: k0 */
        public boolean t(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 BottomAppBar bottomAppBar, int i) {
            this.p1 = new WeakReference<>(bottomAppBar);
            View W0 = bottomAppBar.W0();
            if (W0 != null && !W0.isLaidOut()) {
                BottomAppBar.s1(bottomAppBar, W0);
                this.q1 = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) W0.getLayoutParams())).bottomMargin;
                if (W0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) W0;
                    if (bottomAppBar.Z1 == 0 && bottomAppBar.d2) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C7025iN1.b.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C7025iN1.b.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar.M0(floatingActionButton);
                }
                W0.addOnLayoutChangeListener(this.r1);
                bottomAppBar.n1();
            }
            coordinatorLayout.N(bottomAppBar, i);
            return super.t(coordinatorLayout, bottomAppBar, i);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: l0 */
        public boolean I(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 BottomAppBar bottomAppBar, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2, int i, int i2) {
            if (bottomAppBar.getHideOnScroll() && super.I(coordinatorLayout, bottomAppBar, view, view2, i, i2)) {
                return true;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.r1 = new a();
            this.o1 = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BottomAppBar(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i2) {
        super(C6597gd1.d(context, attributeSet, i2, r4), attributeSet, i2);
        int i3 = t2;
        C4394Uc1 c4394Uc1 = new C4394Uc1();
        this.U1 = c4394Uc1;
        this.i2 = 0;
        this.k2 = 0;
        this.l2 = false;
        this.m2 = true;
        this.r2 = new a();
        this.s2 = new b();
        Context context2 = getContext();
        TypedArray k2 = C7608kn2.k(context2, attributeSet, C7025iN1.o.n0, i2, i3, new int[0]);
        ColorStateList a2 = C4297Tc1.a(context2, k2, C7025iN1.o.p0);
        int i4 = C7025iN1.o.A0;
        if (k2.hasValue(i4)) {
            setNavigationIconTint(k2.getColor(i4, -1));
        }
        int dimensionPixelSize = k2.getDimensionPixelSize(C7025iN1.o.q0, 0);
        this.X1 = k2.getInt(C7025iN1.o.r0, 0);
        this.Y1 = k2.getInt(C7025iN1.o.u0, 0);
        this.Z1 = k2.getInt(C7025iN1.o.t0, 1);
        this.d2 = k2.getBoolean(C7025iN1.o.E0, true);
        this.c2 = k2.getInt(C7025iN1.o.z0, 0);
        this.e2 = k2.getBoolean(C7025iN1.o.y0, false);
        this.f2 = k2.getBoolean(C7025iN1.o.B0, false);
        this.g2 = k2.getBoolean(C7025iN1.o.C0, false);
        this.h2 = k2.getBoolean(C7025iN1.o.D0, false);
        this.b2 = k2.getDimensionPixelOffset(C7025iN1.o.s0, -1);
        boolean z = k2.getBoolean(C7025iN1.o.o0, true);
        k2.recycle();
        this.a2 = getResources().getDimensionPixelOffset(C7025iN1.f.mtrl_bottomappbar_fabOffsetEndMode);
        c4394Uc1.setShapeAppearanceModel(O22.a().G(new C4731Xo(k2.getDimensionPixelOffset(C7025iN1.o.v0, 0), k2.getDimensionPixelOffset(C7025iN1.o.w0, 0), k2.getDimensionPixelOffset(C7025iN1.o.x0, 0))).m());
        if (z) {
            c4394Uc1.I0(2);
        } else {
            c4394Uc1.I0(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        c4394Uc1.C0(Paint.Style.FILL);
        c4394Uc1.i0(context2);
        c4394Uc1.setTintList(a2);
        setElevation(dimensionPixelSize);
        setBackground(c4394Uc1);
        C10920yI2.g(this, attributeSet, i2, i3, new c());
    }
}
