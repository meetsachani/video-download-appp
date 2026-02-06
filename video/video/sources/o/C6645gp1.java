package o;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import o.C10920yI2;
import o.C7025iN1;
import o.HT1;
import o.RL2;

/* renamed from: o.gp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6645gp1 extends AbstractC4051Qo1 {
    public static final int K1 = 49;
    public static final int L1 = 7;
    public static final int M1 = 49;
    public static final int N1 = -1;
    public static final int O1 = 500;
    public static final TimeInterpolator P1 = new PathInterpolator(0.38f, 1.21f, 0.22f, 1.0f);
    public static final int Q1 = 100;
    public boolean A1;
    public int B1;
    public int C1;
    public int D1;
    public int E1;
    public int F1;
    public int G1;
    public int H1;
    public int I1;
    public C5904dp1 J1;
    public final int q1;
    public final int r1;
    public final int s1;
    public final int t1;
    public final boolean u1;
    public boolean v1;
    @InterfaceC11300zs1
    public View w1;
    @InterfaceC11300zs1
    public Boolean x1;
    @InterfaceC11300zs1
    public Boolean y1;
    @InterfaceC11300zs1
    public Boolean z1;

    /* renamed from: o.gp1$a */
    /* loaded from: classes3.dex */
    public class a implements C10920yI2.e {
        public a() {
        }

        @Override // o.C10920yI2.e
        @InterfaceC5670cr1
        public RL2 a(View view, @InterfaceC5670cr1 RL2 rl2, @InterfaceC5670cr1 C10920yI2.f fVar) {
            C9246rQ0 f = rl2.f(RL2.p.i());
            C9246rQ0 f2 = rl2.f(RL2.p.c());
            C6645gp1 c6645gp1 = C6645gp1.this;
            if (c6645gp1.C(c6645gp1.x1)) {
                fVar.b += f.b;
            }
            C6645gp1 c6645gp12 = C6645gp1.this;
            if (c6645gp12.C(c6645gp12.y1)) {
                fVar.d += f.d;
            }
            C6645gp1 c6645gp13 = C6645gp1.this;
            if (c6645gp13.C(c6645gp13.z1)) {
                if (C10920yI2.s(view)) {
                    fVar.a += Math.max(f.c, f2.c);
                } else {
                    fVar.a += Math.max(f.a, f2.a);
                }
            }
            fVar.a(view);
            return rl2;
        }
    }

    public C6645gp1(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    private int getMaxChildWidth() {
        int childCount = getNavigationRailMenuView().getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getNavigationRailMenuView().getChildAt(i2);
            if (childAt.getVisibility() != 8 && !(childAt instanceof C2976Fo1)) {
                i = Math.max(i, childAt.getMeasuredWidth());
            }
        }
        return i;
    }

    private C6390fp1 getNavigationRailMenuView() {
        return (C6390fp1) getMenuView();
    }

    private void setExpanded(boolean z) {
        if (this.A1 == z) {
            return;
        }
        D();
        this.A1 = z;
        int i = this.D1;
        int i2 = this.B1;
        int i3 = this.C1;
        int i4 = this.E1;
        if (z) {
            i = this.G1;
            i2 = this.I1;
            i3 = this.F1;
            i4 = this.H1;
        }
        getNavigationRailMenuView().setItemGravity(i4);
        super.setItemIconGravity(i);
        getNavigationRailMenuView().setItemSpacing(i2);
        getNavigationRailMenuView().setItemMinimumHeight(i3);
        getNavigationRailMenuView().setExpanded(z);
    }

    private void u() {
        C10920yI2.h(this, new a());
    }

    public final int A(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumWidth > 0) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
        }
        return i;
    }

    public void B() {
        View view = this.w1;
        if (view != null) {
            this.J1.removeView(view);
            this.w1 = null;
        }
    }

    public final boolean C(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return getFitsSystemWindows();
    }

    public final void D() {
        if (!isLaidOut()) {
            return;
        }
        AbstractC5921dt2 K0 = new C5502cA().I0(500L).K0(P1);
        AbstractC5921dt2 I0 = new C7351jk0().I0(100L);
        AbstractC5921dt2 I02 = new C7351jk0().I0(100L);
        C7548kY0 c7548kY0 = new C7548kY0();
        AbstractC5921dt2 I03 = new C7351jk0().I0(100L);
        int childCount = getNavigationRailMenuView().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getNavigationRailMenuView().getChildAt(i);
            if (childAt instanceof AbstractC3270Io1) {
                AbstractC3270Io1 abstractC3270Io1 = (AbstractC3270Io1) childAt;
                K0.D(abstractC3270Io1.getLabelGroup(), true);
                K0.D(abstractC3270Io1.getExpandedLabelGroup(), true);
                if (this.A1) {
                    I02.f(abstractC3270Io1.getExpandedLabelGroup());
                    I0.f(abstractC3270Io1.getLabelGroup());
                } else {
                    I02.f(abstractC3270Io1.getLabelGroup());
                    I0.f(abstractC3270Io1.getExpandedLabelGroup());
                }
                c7548kY0.f(abstractC3270Io1.getExpandedLabelGroup());
            }
            I03.f(childAt);
        }
        C2692Ct2 c2692Ct2 = new C2692Ct2();
        c2692Ct2.m1(0);
        c2692Ct2.X0(K0).X0(I0).X0(c7548kY0);
        if (!this.A1) {
            c2692Ct2.X0(I03);
        }
        C2692Ct2 c2692Ct22 = new C2692Ct2();
        c2692Ct22.m1(0);
        c2692Ct22.X0(I02);
        if (this.A1) {
            c2692Ct22.X0(I03);
        }
        C2692Ct2 c2692Ct23 = new C2692Ct2();
        c2692Ct23.m1(1);
        c2692Ct23.X0(c2692Ct22).X0(c2692Ct2);
        C10576wt2.b((ViewGroup) getParent(), c2692Ct23);
    }

    public int getCollapsedItemMinimumHeight() {
        return this.C1;
    }

    @Override // o.AbstractC4051Qo1
    @HT1({HT1.a.Y})
    public int getCollapsedMaxItemCount() {
        return 7;
    }

    public int getExpandedItemMinimumHeight() {
        return this.F1;
    }

    @InterfaceC11300zs1
    public View getHeaderView() {
        return this.w1;
    }

    @Override // o.AbstractC4051Qo1
    public int getItemGravity() {
        return getNavigationRailMenuView().getItemGravity();
    }

    @Override // o.AbstractC4051Qo1
    public int getItemIconGravity() {
        return getNavigationRailMenuView().getItemIconGravity();
    }

    public int getItemMinimumHeight() {
        return getNavigationRailMenuView().getItemMinimumHeight();
    }

    public int getItemSpacing() {
        return getNavigationRailMenuView().getItemSpacing();
    }

    @Override // o.AbstractC4051Qo1
    public int getMaxItemCount() {
        return Integer.MAX_VALUE;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    public boolean getSubmenuDividersEnabled() {
        return this.v1;
    }

    @Override // o.AbstractC4051Qo1
    public boolean i() {
        return true;
    }

    @Override // o.AbstractC4051Qo1
    @HT1({HT1.a.Y})
    public boolean m() {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int A = A(i);
        if (this.A1) {
            measureChild(getNavigationRailMenuView(), i, i2);
            View view = this.w1;
            if (view != null) {
                measureChild(view, i, i2);
            }
            A = z(i, getMaxChildWidth());
            if (getItemActiveIndicatorExpandedWidth() == -1) {
                getNavigationRailMenuView().x(View.MeasureSpec.getSize(A));
            }
        }
        super.onMeasure(A, i2);
        if (this.J1.getMeasuredHeight() < getMeasuredHeight()) {
            measureChild(this.J1, A, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@InterfaceC5670cr1 MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void r() {
        View view = (View) getMenuView();
        C5904dp1 c5904dp1 = new C5904dp1(getContext());
        this.J1 = c5904dp1;
        c5904dp1.setPaddingTop(this.q1);
        this.J1.setScrollingEnabled(this.u1);
        this.J1.setClipChildren(false);
        this.J1.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.J1.addView(view);
        if (!this.u1) {
            addView(this.J1);
            return;
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.addView(this.J1);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(scrollView);
    }

    public void s(@BY0 int i) {
        t(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false));
    }

    public void setCollapsedItemMinimumHeight(@PK1 int i) {
        this.C1 = i;
        if (!this.A1) {
            ((C6390fp1) getMenuView()).setItemMinimumHeight(i);
        }
    }

    public void setCollapsedItemSpacing(@PK1 int i) {
        this.B1 = i;
        if (!this.A1) {
            getNavigationRailMenuView().setItemSpacing(i);
        }
    }

    public void setExpandedItemMinimumHeight(@PK1 int i) {
        this.F1 = i;
        if (this.A1) {
            ((C6390fp1) getMenuView()).setItemMinimumHeight(i);
        }
    }

    @Override // o.AbstractC4051Qo1
    public void setItemGravity(int i) {
        this.E1 = i;
        this.H1 = i;
        super.setItemGravity(i);
    }

    @Override // o.AbstractC4051Qo1
    public void setItemIconGravity(int i) {
        this.D1 = i;
        this.G1 = i;
        super.setItemIconGravity(i);
    }

    public void setItemMinimumHeight(@PK1 int i) {
        this.C1 = i;
        this.F1 = i;
        ((C6390fp1) getMenuView()).setItemMinimumHeight(i);
    }

    public void setItemSpacing(@PK1 int i) {
        this.B1 = i;
        this.I1 = i;
        getNavigationRailMenuView().setItemSpacing(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.v1 == z) {
            return;
        }
        this.v1 = z;
        getNavigationRailMenuView().setSubmenuDividersEnabled(z);
    }

    public void t(@InterfaceC5670cr1 View view) {
        B();
        this.w1 = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.bottomMargin = this.r1;
        this.J1.addView(view, 0, layoutParams);
    }

    public void v() {
        if (!this.A1) {
            return;
        }
        setExpanded(false);
        announceForAccessibility(getResources().getString(C7025iN1.m.nav_rail_collapsed_a11y_label));
    }

    @Override // o.AbstractC4051Qo1
    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    /* renamed from: w */
    public C6390fp1 c(@InterfaceC5670cr1 Context context) {
        return new C6390fp1(context);
    }

    public void x() {
        if (this.A1) {
            return;
        }
        setExpanded(true);
        announceForAccessibility(getResources().getString(C7025iN1.m.nav_rail_expanded_a11y_label));
    }

    public boolean y() {
        return this.A1;
    }

    public final int z(int i, int i2) {
        int min = Math.min(this.s1, View.MeasureSpec.getSize(i));
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            int max = Math.max(i2, min);
            View view = this.w1;
            if (view != null) {
                max = Math.max(max, view.getMeasuredWidth());
            }
            return View.MeasureSpec.makeMeasureSpec(Math.max(getSuggestedMinimumWidth(), Math.min(max, this.t1)), 1073741824);
        }
        return i;
    }

    public C6645gp1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.navigationRailStyle);
    }

    public C6645gp1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C7025iN1.n.Widget_MaterialComponents_NavigationRailView);
    }

    public C6645gp1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.x1 = null;
        this.y1 = null;
        this.z1 = null;
        this.A1 = false;
        this.C1 = -1;
        this.D1 = 0;
        this.E1 = 49;
        Context context2 = getContext();
        this.I1 = getContext().getResources().getDimensionPixelSize(C7025iN1.f.m3_navigation_rail_expanded_item_spacing);
        this.H1 = AbstractC4051Qo1.o1;
        this.G1 = 1;
        C2872Ep2 l = C7608kn2.l(context2, attributeSet, C7025iN1.o.z8, i, i2, new int[0]);
        int i3 = C7025iN1.o.B8;
        Resources resources = getResources();
        int i4 = C7025iN1.f.mtrl_navigation_rail_margin;
        this.q1 = l.g(i3, resources.getDimensionPixelSize(i4));
        this.r1 = l.g(C7025iN1.o.H8, getResources().getDimensionPixelSize(i4));
        this.u1 = l.a(C7025iN1.o.O8, false);
        setSubmenuDividersEnabled(l.a(C7025iN1.o.R8, false));
        r();
        int u = l.u(C7025iN1.o.G8, 0);
        if (u != 0) {
            s(u);
        }
        setMenuGravity(l.o(C7025iN1.o.K8, 49));
        int i5 = C7025iN1.o.I8;
        int g = l.g(i5, -1);
        int g2 = l.g(i5, -1);
        int i6 = C7025iN1.o.A8;
        g = l.C(i6) ? l.g(i6, -1) : g;
        int i7 = C7025iN1.o.D8;
        g2 = l.C(i7) ? l.g(i7, -1) : g2;
        setCollapsedItemMinimumHeight(g);
        setExpandedItemMinimumHeight(g2);
        this.s1 = l.g(C7025iN1.o.F8, context2.getResources().getDimensionPixelSize(C7025iN1.f.m3_navigation_rail_min_expanded_width));
        this.t1 = l.g(C7025iN1.o.E8, context2.getResources().getDimensionPixelSize(C7025iN1.f.m3_navigation_rail_max_expanded_width));
        int i8 = C7025iN1.o.N8;
        if (l.C(i8)) {
            this.x1 = Boolean.valueOf(l.a(i8, false));
        }
        int i9 = C7025iN1.o.L8;
        if (l.C(i9)) {
            this.y1 = Boolean.valueOf(l.a(i9, false));
        }
        int i10 = C7025iN1.o.M8;
        if (l.C(i10)) {
            this.z1 = Boolean.valueOf(l.a(i10, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C7025iN1.f.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C7025iN1.f.m3_navigation_rail_item_padding_bottom_with_large_font);
        float b = C5600ca.b(0.0f, 1.0f, 0.3f, 1.0f, C4297Tc1.f(context2) - 1.0f);
        setItemPaddingTop(Math.round(C5600ca.c(getItemPaddingTop(), dimensionPixelOffset, b)));
        setItemPaddingBottom(Math.round(C5600ca.c(getItemPaddingBottom(), dimensionPixelOffset2, b)));
        setCollapsedItemSpacing(l.g(C7025iN1.o.J8, 0));
        setExpanded(l.a(C7025iN1.o.C8, false));
        l.I();
        u();
    }
}
