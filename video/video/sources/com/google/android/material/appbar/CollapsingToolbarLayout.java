package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.AbstractC4051Qo1;
import o.BR0;
import o.C10122v20;
import o.C2691Ct1;
import o.C4297Tc1;
import o.C5600ca;
import o.C6516gH2;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.C9179r91;
import o.C9293rd1;
import o.C9523sa0;
import o.C9811tl1;
import o.D60;
import o.ES1;
import o.HT1;
import o.InterfaceC10336vu1;
import o.InterfaceC11300zs1;
import o.InterfaceC2501Av0;
import o.InterfaceC3614Mc2;
import o.InterfaceC4698Xf2;
import o.InterfaceC5670cr1;
import o.JF;
import o.K60;
import o.LH2;
import o.OL1;
import o.RL2;
import o.XE;

/* loaded from: classes3.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public static final int J1 = C7025iN1.n.Widget_Design_CollapsingToolbar;
    public static final int K1 = 600;
    public static final int L1 = 0;
    public static final int M1 = 1;
    public static final int N1 = 0;
    public static final int O1 = 1;
    public int A1;
    public int B1;
    @InterfaceC11300zs1
    public RL2 C1;
    public int D1;
    public boolean E1;
    public int F1;
    public int G1;
    public boolean H1;
    public int I1;
    public boolean Y0;
    public int Z0;
    @InterfaceC11300zs1
    public ViewGroup a1;
    @InterfaceC11300zs1
    public View b1;
    public View c1;
    public int d1;
    public int e1;
    public int f1;
    public int g1;
    public int h1;
    public final Rect i1;
    @InterfaceC5670cr1
    public final XE j1;
    @InterfaceC5670cr1
    public final XE k1;
    @InterfaceC5670cr1
    public final C9523sa0 l1;
    public boolean m1;
    public boolean n1;
    public final int o1;
    @InterfaceC11300zs1
    public Drawable p1;
    @InterfaceC11300zs1
    public Drawable q1;
    public int r1;
    public boolean s1;
    public ValueAnimator t1;
    public long u1;
    public final TimeInterpolator v1;
    public final TimeInterpolator w1;
    public int x1;
    public AppBarLayout.h y1;
    public int z1;

    /* loaded from: classes3.dex */
    public class a implements InterfaceC10336vu1 {
        public a() {
        }

        @Override // o.InterfaceC10336vu1
        public RL2 a(View view, @InterfaceC5670cr1 RL2 rl2) {
            return CollapsingToolbarLayout.this.t(rl2);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface c {
    }

    /* loaded from: classes3.dex */
    public class e implements AppBarLayout.h {
        public e() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.h, com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i) {
            int i2;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.z1 = i;
            RL2 rl2 = collapsingToolbarLayout.C1;
            if (rl2 != null) {
                i2 = rl2.r();
            } else {
                i2 = 0;
            }
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                d dVar = (d) childAt.getLayoutParams();
                LH2 l = CollapsingToolbarLayout.l(childAt);
                int i4 = dVar.a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        l.k(Math.round((-i) * dVar.b));
                    }
                } else {
                    l.k(C9293rd1.e(-i, 0, CollapsingToolbarLayout.this.i(childAt)));
                }
            }
            CollapsingToolbarLayout.this.B();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.q1 != null && i2 > 0) {
                collapsingToolbarLayout2.postInvalidateOnAnimation();
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int minimumHeight = (height - CollapsingToolbarLayout.this.getMinimumHeight()) - i2;
            int scrimVisibleHeightTrigger = height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger();
            int i5 = CollapsingToolbarLayout.this.z1 + minimumHeight;
            float f = minimumHeight;
            float abs = Math.abs(i) / f;
            float f2 = scrimVisibleHeightTrigger / f;
            CollapsingToolbarLayout.this.j1.H0(Math.min(1.0f, f2));
            CollapsingToolbarLayout.this.j1.s0(i5);
            CollapsingToolbarLayout.this.j1.F0(abs);
            CollapsingToolbarLayout.this.k1.H0(Math.min(1.0f, f2));
            CollapsingToolbarLayout.this.k1.s0(i5);
            CollapsingToolbarLayout.this.k1.F0(abs);
        }
    }

    @HT1({HT1.a.Y})
    @ES1(23)
    /* loaded from: classes3.dex */
    public interface f extends InterfaceC3614Mc2 {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface g {
    }

    public CollapsingToolbarLayout(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    @JF
    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        ColorStateList l = C9179r91.l(getContext(), C7025iN1.c.colorSurfaceContainer);
        if (l != null) {
            return l.getDefaultColor();
        }
        return this.l1.g(getResources().getDimension(C7025iN1.f.design_appbar_elevation));
    }

    public static int h(@InterfaceC5670cr1 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    @InterfaceC11300zs1
    public static CharSequence j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getSubtitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getSubtitle();
        }
        return null;
    }

    @InterfaceC11300zs1
    public static CharSequence k(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @InterfaceC5670cr1
    public static LH2 l(@InterfaceC5670cr1 View view) {
        int i = C7025iN1.h.view_offset_helper;
        LH2 lh2 = (LH2) view.getTag(i);
        if (lh2 == null) {
            LH2 lh22 = new LH2(view);
            view.setTag(i, lh22);
            return lh22;
        }
        return lh2;
    }

    public static boolean r(View view) {
        if (!(view instanceof Toolbar) && !(view instanceof android.widget.Toolbar)) {
            return false;
        }
        return true;
    }

    public final void A() {
        View view;
        if (!this.m1 && (view = this.c1) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.c1);
            }
        }
        if (this.m1 && this.a1 != null) {
            if (this.c1 == null) {
                this.c1 = new View(getContext());
            }
            if (this.c1.getParent() == null) {
                this.a1.addView(this.c1, -1, -1);
            }
        }
    }

    public final void B() {
        boolean z;
        if (this.p1 == null && this.q1 == null) {
            return;
        }
        if (getHeight() + this.z1 < getScrimVisibleHeightTrigger()) {
            z = true;
        } else {
            z = false;
        }
        setScrimsShown(z);
    }

    public final void C(int i, int i2, int i3, int i4, boolean z) {
        View view;
        boolean z2;
        int i5;
        int i6;
        if (this.m1 && (view = this.c1) != null) {
            boolean z3 = false;
            if (view.isAttachedToWindow() && this.c1.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.n1 = z2;
            if (z2 || z) {
                if (getLayoutDirection() == 1) {
                    z3 = true;
                }
                w(z3);
                if (z3) {
                    i5 = this.f1;
                } else {
                    i5 = this.d1;
                }
                int i7 = i5;
                int i8 = this.i1.top + this.e1;
                int i9 = i3 - i;
                if (z3) {
                    i6 = this.d1;
                } else {
                    i6 = this.f1;
                }
                int i10 = i9 - i6;
                int i11 = (i4 - i2) - this.g1;
                if (TextUtils.isEmpty(this.k1.Q())) {
                    this.j1.t0(i7, i8, i10, i11);
                    this.j1.e0(z);
                    return;
                }
                this.j1.u0(i7, i8, i10, (int) ((i11 - (this.k1.C() + this.G1)) - this.h1), false);
                this.k1.u0(i7, (int) (i8 + this.j1.C() + this.F1 + this.h1), i10, i11, false);
                this.j1.e0(z);
                this.k1.e0(z);
            }
        }
    }

    public final void D() {
        ViewGroup viewGroup = this.a1;
        if (viewGroup != null && this.m1) {
            CharSequence k = k(viewGroup);
            if (TextUtils.isEmpty(this.j1.Q()) && !TextUtils.isEmpty(k)) {
                setTitle(k);
            }
            CharSequence j = j(this.a1);
            if (TextUtils.isEmpty(this.k1.Q()) && !TextUtils.isEmpty(j)) {
                setSubtitle(j);
            }
        }
    }

    public final void a(int i) {
        TimeInterpolator timeInterpolator;
        d();
        ValueAnimator valueAnimator = this.t1;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.t1 = valueAnimator2;
            if (i > this.r1) {
                timeInterpolator = this.v1;
            } else {
                timeInterpolator = this.w1;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.t1.addUpdateListener(new b());
        } else if (valueAnimator.isRunning()) {
            this.t1.cancel();
        }
        this.t1.setDuration(this.u1);
        this.t1.setIntValues(this.r1, i);
        this.t1.start();
    }

    public final TextUtils.TruncateAt b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return TextUtils.TruncateAt.END;
                }
                return TextUtils.TruncateAt.MARQUEE;
            }
            return TextUtils.TruncateAt.MIDDLE;
        }
        return TextUtils.TruncateAt.START;
    }

    public final void c(AppBarLayout appBarLayout) {
        if (p()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    public final void d() {
        if (!this.Y0) {
            return;
        }
        ViewGroup viewGroup = null;
        this.a1 = null;
        this.b1 = null;
        int i = this.Z0;
        if (i != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
            this.a1 = viewGroup2;
            if (viewGroup2 != null) {
                this.b1 = e(viewGroup2);
            }
        }
        if (this.a1 == null) {
            int childCount = getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                if (r(childAt)) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
                i2++;
            }
            this.a1 = viewGroup;
        }
        A();
        this.Y0 = false;
    }

    @Override // android.view.View
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        int i;
        Drawable drawable;
        super.draw(canvas);
        d();
        if (this.a1 == null && (drawable = this.p1) != null && this.r1 > 0) {
            drawable.mutate().setAlpha(this.r1);
            this.p1.draw(canvas);
        }
        if (this.m1 && this.n1) {
            if (this.a1 != null && this.p1 != null && this.r1 > 0 && p() && this.j1.I() < this.j1.J()) {
                int save = canvas.save();
                canvas.clipRect(this.p1.getBounds(), Region.Op.DIFFERENCE);
                this.j1.k(canvas);
                this.k1.k(canvas);
                canvas.restoreToCount(save);
            } else {
                this.j1.k(canvas);
                this.k1.k(canvas);
            }
        }
        if (this.q1 != null && this.r1 > 0) {
            RL2 rl2 = this.C1;
            if (rl2 != null) {
                i = rl2.r();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.q1.setBounds(0, -this.z1, getWidth(), i - this.z1);
                this.q1.mutate().setAlpha(this.r1);
                this.q1.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.p1 != null && this.r1 > 0 && s(view)) {
            z(this.p1, view, getWidth(), getHeight());
            this.p1.mutate().setAlpha(this.r1);
            this.p1.draw(canvas);
            z = true;
        } else {
            z = false;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.q1;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        } else {
            z = false;
        }
        Drawable drawable2 = this.p1;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        XE xe = this.j1;
        if (xe != null) {
            z |= xe.O0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @InterfaceC5670cr1
    public final View e(@InterfaceC5670cr1 View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return view;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: f */
    public d generateDefaultLayoutParams() {
        return new d(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* renamed from: g */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new d(layoutParams);
    }

    public float getCollapsedSubtitleTextSize() {
        return this.k1.u();
    }

    @InterfaceC5670cr1
    public Typeface getCollapsedSubtitleTypeface() {
        return this.k1.v();
    }

    public int getCollapsedTitleGravity() {
        return this.j1.q();
    }

    public float getCollapsedTitleTextSize() {
        return this.j1.u();
    }

    @InterfaceC5670cr1
    public Typeface getCollapsedTitleTypeface() {
        return this.j1.v();
    }

    @InterfaceC11300zs1
    public Drawable getContentScrim() {
        return this.p1;
    }

    public float getExpandedSubtitleTextSize() {
        return this.k1.G();
    }

    @InterfaceC5670cr1
    public Typeface getExpandedSubtitleTypeface() {
        return this.k1.H();
    }

    public int getExpandedTitleGravity() {
        return this.j1.D();
    }

    public int getExpandedTitleMarginBottom() {
        return this.g1;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f1;
    }

    public int getExpandedTitleMarginStart() {
        return this.d1;
    }

    public int getExpandedTitleMarginTop() {
        return this.e1;
    }

    public int getExpandedTitleSpacing() {
        return this.h1;
    }

    public float getExpandedTitleTextSize() {
        return this.j1.G();
    }

    @InterfaceC5670cr1
    public Typeface getExpandedTitleTypeface() {
        return this.j1.H();
    }

    @HT1({HT1.a.Y})
    @ES1(23)
    public int getHyphenationFrequency() {
        return this.j1.K();
    }

    @HT1({HT1.a.Y})
    public int getLineCount() {
        return this.j1.L();
    }

    @HT1({HT1.a.Y})
    @ES1(23)
    public float getLineSpacingAdd() {
        return this.j1.M();
    }

    @HT1({HT1.a.Y})
    @ES1(23)
    public float getLineSpacingMultiplier() {
        return this.j1.N();
    }

    @HT1({HT1.a.Y})
    public int getMaxLines() {
        return this.j1.A();
    }

    public int getScrimAlpha() {
        return this.r1;
    }

    public long getScrimAnimationDuration() {
        return this.u1;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.x1;
        if (i2 >= 0) {
            return i2 + this.D1 + this.F1 + this.G1 + this.I1;
        }
        RL2 rl2 = this.C1;
        if (rl2 != null) {
            i = rl2.r();
        } else {
            i = 0;
        }
        int minimumHeight = getMinimumHeight();
        if (minimumHeight > 0) {
            return Math.min((minimumHeight * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    @InterfaceC11300zs1
    public Drawable getStatusBarScrim() {
        return this.q1;
    }

    @InterfaceC11300zs1
    public CharSequence getSubtitle() {
        if (this.m1) {
            return this.k1.Q();
        }
        return null;
    }

    @InterfaceC11300zs1
    public CharSequence getTitle() {
        if (this.m1) {
            return this.j1.Q();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.B1;
    }

    @InterfaceC11300zs1
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.j1.P();
    }

    @InterfaceC5670cr1
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.j1.T();
    }

    public final int i(@InterfaceC5670cr1 View view) {
        return ((getHeight() - l(view).c()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((d) view.getLayoutParams())).bottomMargin;
    }

    @HT1({HT1.a.Y})
    public boolean m() {
        return this.H1;
    }

    @HT1({HT1.a.Y})
    public boolean n() {
        return this.E1;
    }

    @HT1({HT1.a.Y})
    public boolean o() {
        return this.j1.X();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            c(appBarLayout);
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.y1 == null) {
                this.y1 = new e();
            }
            appBarLayout.f(this.y1);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(@InterfaceC5670cr1 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.j1.b0(configuration);
        if (this.A1 != configuration.orientation && this.H1 && this.j1.I() == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.A1 = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.h hVar = this.y1;
        if (hVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).E(hVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        RL2 rl2 = this.C1;
        if (rl2 != null) {
            int r = rl2.r();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < r) {
                    C6516gH2.k1(childAt, r);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            l(getChildAt(i6)).h();
        }
        C(i, i2, i3, i4, false);
        D();
        B();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            l(getChildAt(i7)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        CollapsingToolbarLayout collapsingToolbarLayout;
        float C;
        d();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        RL2 rl2 = this.C1;
        if (rl2 != null) {
            i3 = rl2.r();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.E1) && i3 > 0) {
            this.D1 = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        D();
        if (this.m1 && !TextUtils.isEmpty(this.j1.Q())) {
            int measuredHeight = getMeasuredHeight();
            collapsingToolbarLayout = this;
            collapsingToolbarLayout.C(0, 0, getMeasuredWidth(), measuredHeight, true);
            float C2 = collapsingToolbarLayout.D1 + collapsingToolbarLayout.e1 + collapsingToolbarLayout.j1.C();
            if (TextUtils.isEmpty(collapsingToolbarLayout.k1.Q())) {
                C = 0.0f;
            } else {
                C = collapsingToolbarLayout.h1 + collapsingToolbarLayout.k1.C();
            }
            int i4 = (int) (C2 + C + collapsingToolbarLayout.g1);
            if (i4 > measuredHeight) {
                collapsingToolbarLayout.I1 = i4 - measuredHeight;
            } else {
                collapsingToolbarLayout.I1 = 0;
            }
            if (collapsingToolbarLayout.H1) {
                if (collapsingToolbarLayout.j1.A() > 1) {
                    int z = collapsingToolbarLayout.j1.z();
                    if (z > 1) {
                        collapsingToolbarLayout.F1 = Math.round(collapsingToolbarLayout.j1.C()) * (z - 1);
                    } else {
                        collapsingToolbarLayout.F1 = 0;
                    }
                }
                if (collapsingToolbarLayout.k1.A() > 1) {
                    int z2 = collapsingToolbarLayout.k1.z();
                    if (z2 > 1) {
                        collapsingToolbarLayout.G1 = Math.round(collapsingToolbarLayout.k1.C()) * (z2 - 1);
                    } else {
                        collapsingToolbarLayout.G1 = 0;
                    }
                }
            }
            int i5 = collapsingToolbarLayout.I1;
            int i6 = collapsingToolbarLayout.F1;
            int i7 = collapsingToolbarLayout.G1;
            if (i5 + i6 + i7 > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight + i5 + i6 + i7, 1073741824));
            }
        } else {
            collapsingToolbarLayout = this;
        }
        ViewGroup viewGroup = collapsingToolbarLayout.a1;
        if (viewGroup != null) {
            View view = collapsingToolbarLayout.b1;
            if (view != null && view != collapsingToolbarLayout) {
                setMinimumHeight(h(view));
            } else {
                setMinimumHeight(h(viewGroup));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.p1;
        if (drawable != null) {
            y(drawable, i, i2);
        }
    }

    public final boolean p() {
        if (this.B1 == 1) {
            return true;
        }
        return false;
    }

    public boolean q() {
        return this.m1;
    }

    public final boolean s(View view) {
        View view2 = this.b1;
        if (view2 != null && view2 != this) {
            if (view != view2) {
                return false;
            }
            return true;
        } else if (view != this.a1) {
            return false;
        } else {
            return true;
        }
    }

    public void setCollapsedSubtitleTextAppearance(@InterfaceC4698Xf2 int i) {
        this.k1.l0(i);
    }

    public void setCollapsedSubtitleTextColor(@JF int i) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedSubtitleTextSize(float f2) {
        this.k1.p0(f2);
    }

    public void setCollapsedSubtitleTypeface(@InterfaceC11300zs1 Typeface typeface) {
        this.k1.q0(typeface);
    }

    public void setCollapsedTitleGravity(int i) {
        this.j1.o0(i);
        this.k1.o0(i);
    }

    public void setCollapsedTitleTextAppearance(@InterfaceC4698Xf2 int i) {
        this.j1.l0(i);
    }

    public void setCollapsedTitleTextColor(@JF int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f2) {
        this.j1.p0(f2);
    }

    public void setCollapsedTitleTypeface(@InterfaceC11300zs1 Typeface typeface) {
        this.j1.q0(typeface);
    }

    public void setContentScrim(@InterfaceC11300zs1 Drawable drawable) {
        Drawable drawable2 = this.p1;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.p1 = drawable3;
            if (drawable3 != null) {
                y(drawable3, getWidth(), getHeight());
                this.p1.setCallback(this);
                this.p1.setAlpha(this.r1);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(@JF int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@K60 int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedSubtitleColor(@JF int i) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedSubtitleTextAppearance(@InterfaceC4698Xf2 int i) {
        this.k1.y0(i);
    }

    public void setExpandedSubtitleTextColor(@InterfaceC5670cr1 ColorStateList colorStateList) {
        this.k1.A0(colorStateList);
    }

    public void setExpandedSubtitleTextSize(float f2) {
        this.k1.C0(f2);
    }

    public void setExpandedSubtitleTypeface(@InterfaceC11300zs1 Typeface typeface) {
        this.k1.D0(typeface);
    }

    public void setExpandedTitleColor(@JF int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.j1.B0(i);
        this.k1.B0(i);
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.g1 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f1 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.d1 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.e1 = i;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i) {
        this.h1 = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@InterfaceC4698Xf2 int i) {
        this.j1.y0(i);
    }

    public void setExpandedTitleTextColor(@InterfaceC5670cr1 ColorStateList colorStateList) {
        this.j1.A0(colorStateList);
    }

    public void setExpandedTitleTextSize(float f2) {
        this.j1.C0(f2);
    }

    public void setExpandedTitleTypeface(@InterfaceC11300zs1 Typeface typeface) {
        this.j1.D0(typeface);
    }

    @HT1({HT1.a.Y})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.H1 = z;
    }

    @HT1({HT1.a.Y})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.E1 = z;
    }

    @HT1({HT1.a.Y})
    @ES1(23)
    public void setHyphenationFrequency(int i) {
        this.j1.I0(i);
    }

    @HT1({HT1.a.Y})
    @ES1(23)
    public void setLineSpacingAdd(float f2) {
        this.j1.K0(f2);
    }

    @HT1({HT1.a.Y})
    @ES1(23)
    public void setLineSpacingMultiplier(@InterfaceC2501Av0(from = 0.0d) float f2) {
        this.j1.L0(f2);
    }

    @HT1({HT1.a.Y})
    public void setMaxLines(int i) {
        this.j1.x0(i);
        this.k1.x0(i);
    }

    @HT1({HT1.a.Y})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.j1.N0(z);
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.r1) {
            if (this.p1 != null && (viewGroup = this.a1) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.r1 = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(@BR0(from = 0) long j) {
        this.u1 = j;
    }

    public void setScrimVisibleHeightTrigger(@BR0(from = 0) int i) {
        if (this.x1 != i) {
            this.x1 = i;
            B();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2;
        if (isLaidOut() && !isInEditMode()) {
            z2 = true;
        } else {
            z2 = false;
        }
        v(z, z2);
    }

    @HT1({HT1.a.Y})
    @ES1(23)
    public void setStaticLayoutBuilderConfigurer(@InterfaceC11300zs1 f fVar) {
        this.j1.P0(fVar);
    }

    public void setStatusBarScrim(@InterfaceC11300zs1 Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.q1;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.q1 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.q1.setState(getDrawableState());
                }
                D60.m(this.q1, getLayoutDirection());
                Drawable drawable4 = this.q1;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.q1.setCallback(this);
                this.q1.setAlpha(this.r1);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(@JF int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@K60 int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setSubtitle(@InterfaceC11300zs1 CharSequence charSequence) {
        this.k1.Q0(charSequence);
    }

    public void setTitle(@InterfaceC11300zs1 CharSequence charSequence) {
        this.j1.Q0(charSequence);
        x();
    }

    public void setTitleCollapseMode(int i) {
        this.B1 = i;
        boolean p = p();
        this.j1.G0(p);
        this.k1.G0(p);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            c((AppBarLayout) parent);
        }
        if (p && this.p1 == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(@InterfaceC5670cr1 TextUtils.TruncateAt truncateAt) {
        this.j1.S0(truncateAt);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.m1) {
            this.m1 = z;
            x();
            A();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@InterfaceC11300zs1 TimeInterpolator timeInterpolator) {
        this.j1.M0(timeInterpolator);
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
        Drawable drawable = this.q1;
        if (drawable != null && drawable.isVisible() != z) {
            this.q1.setVisible(z, false);
        }
        Drawable drawable2 = this.p1;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.p1.setVisible(z, false);
        }
    }

    public RL2 t(@InterfaceC5670cr1 RL2 rl2) {
        RL2 rl22;
        if (getFitsSystemWindows()) {
            rl22 = rl2;
        } else {
            rl22 = null;
        }
        if (!C2691Ct1.a(this.C1, rl22)) {
            this.C1 = rl22;
            requestLayout();
        }
        return rl2.c();
    }

    public void u(int i, int i2, int i3, int i4) {
        this.d1 = i;
        this.e1 = i2;
        this.f1 = i3;
        this.g1 = i4;
        requestLayout();
    }

    public void v(boolean z, boolean z2) {
        if (this.s1 != z) {
            int i = 0;
            if (z2) {
                if (z) {
                    i = 255;
                }
                a(i);
            } else {
                if (z) {
                    i = 255;
                }
                setScrimAlpha(i);
            }
            this.s1 = z;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(@InterfaceC5670cr1 Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.p1 && drawable != this.q1) {
            return false;
        }
        return true;
    }

    public final void w(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view = this.b1;
        if (view == null) {
            view = this.a1;
        }
        int i8 = i(view);
        C10122v20.a(this, this.c1, this.i1);
        ViewGroup viewGroup = this.a1;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i = toolbar.getTitleMarginStart();
            i3 = toolbar.getTitleMarginEnd();
            i4 = toolbar.getTitleMarginTop();
            i2 = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i = toolbar2.getTitleMarginStart();
            i3 = toolbar2.getTitleMarginEnd();
            i4 = toolbar2.getTitleMarginTop();
            i2 = toolbar2.getTitleMarginBottom();
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        Rect rect = this.i1;
        int i9 = rect.left;
        if (z) {
            i5 = i3;
        } else {
            i5 = i;
        }
        int i10 = i9 + i5;
        int i11 = rect.right;
        if (z) {
            i6 = i;
        } else {
            i6 = i3;
        }
        int i12 = i11 - i6;
        int i13 = rect.top + i8 + i4;
        int i14 = (rect.bottom + i8) - i2;
        int m = (int) (i14 - this.k1.m());
        int m2 = (int) (i13 + this.j1.m());
        if (TextUtils.isEmpty(this.k1.Q())) {
            this.j1.h0(i10, i13, i12, i14);
        } else {
            this.j1.h0(i10, i13, i12, m);
            this.k1.h0(i10, m2, i12, i14);
        }
        if (this.o1 == 0) {
            C10122v20.a(this, this, this.i1);
            Rect rect2 = this.i1;
            int i15 = rect2.left;
            if (z) {
                i7 = i3;
            } else {
                i7 = i;
            }
            int i16 = i15 + i7;
            int i17 = rect2.right;
            if (!z) {
                i = i3;
            }
            int i18 = i17 - i;
            if (TextUtils.isEmpty(this.k1.Q())) {
                this.j1.j0(i16, i13, i18, i14);
                return;
            }
            this.j1.j0(i16, i13, i18, m);
            this.k1.j0(i16, m2, i18, i14);
        }
    }

    public final void x() {
        setContentDescription(getTitle());
    }

    public final void y(@InterfaceC5670cr1 Drawable drawable, int i, int i2) {
        z(drawable, this.a1, i, i2);
    }

    public final void z(@InterfaceC5670cr1 Drawable drawable, @InterfaceC11300zs1 View view, int i, int i2) {
        if (p() && view != null && this.m1) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    public CollapsingToolbarLayout(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.collapsingToolbarLayoutStyle);
    }

    public void setCollapsedSubtitleTextColor(@InterfaceC5670cr1 ColorStateList colorStateList) {
        this.k1.n0(colorStateList);
    }

    public void setCollapsedTitleTextColor(@InterfaceC5670cr1 ColorStateList colorStateList) {
        this.j1.n0(colorStateList);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CollapsingToolbarLayout(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = J1;
        this.Y0 = true;
        this.i1 = new Rect();
        this.x1 = -1;
        this.D1 = 0;
        this.F1 = 0;
        this.G1 = 0;
        this.I1 = 0;
        Context context2 = getContext();
        this.A1 = getResources().getConfiguration().orientation;
        XE xe = new XE(this);
        this.j1 = xe;
        TimeInterpolator timeInterpolator = C5600ca.e;
        xe.R0(timeInterpolator);
        xe.N0(false);
        this.l1 = new C9523sa0(context2);
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.J2, i, i2, new int[0]);
        int i3 = k.getInt(C7025iN1.o.T2, 8388691);
        int i4 = k.getInt(C7025iN1.o.M2, AbstractC4051Qo1.o1);
        this.o1 = k.getInt(C7025iN1.o.N2, 1);
        xe.B0(i3);
        xe.o0(i4);
        int dimensionPixelSize = k.getDimensionPixelSize(C7025iN1.o.U2, 0);
        this.g1 = dimensionPixelSize;
        this.f1 = dimensionPixelSize;
        this.e1 = dimensionPixelSize;
        this.d1 = dimensionPixelSize;
        int i5 = C7025iN1.o.X2;
        if (k.hasValue(i5)) {
            this.d1 = k.getDimensionPixelSize(i5, 0);
        }
        int i6 = C7025iN1.o.W2;
        if (k.hasValue(i6)) {
            this.f1 = k.getDimensionPixelSize(i6, 0);
        }
        int i7 = C7025iN1.o.Y2;
        if (k.hasValue(i7)) {
            this.e1 = k.getDimensionPixelSize(i7, 0);
        }
        int i8 = C7025iN1.o.V2;
        if (k.hasValue(i8)) {
            this.g1 = k.getDimensionPixelSize(i8, 0);
        }
        int i9 = C7025iN1.o.Z2;
        if (k.hasValue(i9)) {
            this.h1 = k.getDimensionPixelSize(i9, 0);
        }
        this.m1 = k.getBoolean(C7025iN1.o.m3, true);
        setTitle(k.getText(C7025iN1.o.k3));
        xe.y0(C7025iN1.n.TextAppearance_Design_CollapsingToolbar_Expanded);
        xe.l0(OL1.l.m3);
        int i10 = C7025iN1.o.a3;
        if (k.hasValue(i10)) {
            xe.y0(k.getResourceId(i10, 0));
        }
        int i11 = C7025iN1.o.O2;
        if (k.hasValue(i11)) {
            xe.l0(k.getResourceId(i11, 0));
        }
        int i12 = C7025iN1.o.p3;
        if (k.hasValue(i12)) {
            setTitleEllipsize(b(k.getInt(i12, -1)));
        }
        int i13 = C7025iN1.o.b3;
        if (k.hasValue(i13)) {
            xe.A0(C4297Tc1.a(context2, k, i13));
        }
        int i14 = C7025iN1.o.P2;
        if (k.hasValue(i14)) {
            xe.n0(C4297Tc1.a(context2, k, i14));
        }
        this.x1 = k.getDimensionPixelSize(C7025iN1.o.g3, -1);
        int i15 = C7025iN1.o.n3;
        if (k.hasValue(i15)) {
            xe.x0(k.getInt(i15, 1));
        } else {
            int i16 = C7025iN1.o.e3;
            if (k.hasValue(i16)) {
                xe.x0(k.getInt(i16, 1));
            }
        }
        int i17 = C7025iN1.o.o3;
        if (k.hasValue(i17)) {
            xe.M0(AnimationUtils.loadInterpolator(context2, k.getResourceId(i17, 0)));
        }
        XE xe2 = new XE(this);
        this.k1 = xe2;
        xe2.R0(timeInterpolator);
        xe2.N0(false);
        int i18 = C7025iN1.o.i3;
        if (k.hasValue(i18)) {
            setSubtitle(k.getText(i18));
        }
        xe2.B0(i3);
        xe2.o0(i4);
        xe2.y0(OL1.l.P2);
        xe2.l0(OL1.l.k3);
        int i19 = C7025iN1.o.R2;
        if (k.hasValue(i19)) {
            xe2.y0(k.getResourceId(i19, 0));
        }
        int i20 = C7025iN1.o.K2;
        if (k.hasValue(i20)) {
            xe2.l0(k.getResourceId(i20, 0));
        }
        int i21 = C7025iN1.o.S2;
        if (k.hasValue(i21)) {
            xe2.A0(C4297Tc1.a(context2, k, i21));
        }
        int i22 = C7025iN1.o.L2;
        if (k.hasValue(i22)) {
            xe2.n0(C4297Tc1.a(context2, k, i22));
        }
        int i23 = C7025iN1.o.j3;
        if (k.hasValue(i23)) {
            xe2.x0(k.getInt(i23, 1));
        }
        if (k.hasValue(i17)) {
            xe2.M0(AnimationUtils.loadInterpolator(context2, k.getResourceId(i17, 0)));
        }
        this.u1 = k.getInt(C7025iN1.o.f3, 600);
        int i24 = C7025iN1.c.motionEasingStandardInterpolator;
        this.v1 = C9811tl1.g(context2, i24, C5600ca.c);
        this.w1 = C9811tl1.g(context2, i24, C5600ca.d);
        setContentScrim(k.getDrawable(C7025iN1.o.Q2));
        setStatusBarScrim(k.getDrawable(C7025iN1.o.h3));
        setTitleCollapseMode(k.getInt(C7025iN1.o.l3, 0));
        this.Z0 = k.getResourceId(C7025iN1.o.q3, -1);
        this.E1 = k.getBoolean(C7025iN1.o.d3, false);
        this.H1 = k.getBoolean(C7025iN1.o.c3, false);
        k.recycle();
        setWillNotDraw(false);
        C6516gH2.l2(this, new a());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    /* loaded from: classes3.dex */
    public static class d extends FrameLayout.LayoutParams {
        public static final float c = 0.5f;
        public static final int d = 0;
        public static final int e = 1;
        public static final int f = 2;
        public int a;
        public float b;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            this.b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.r3);
            this.a = obtainStyledAttributes.getInt(C7025iN1.o.s3, 0);
            d(obtainStyledAttributes.getFloat(C7025iN1.o.t3, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public int a() {
            return this.a;
        }

        public float b() {
            return this.b;
        }

        public void c(int i) {
            this.a = i;
        }

        public void d(float f2) {
            this.b = f2;
        }

        public d(int i, int i2) {
            super(i, i2);
            this.a = 0;
            this.b = 0.5f;
        }

        public d(int i, int i2, int i3) {
            super(i, i2, i3);
            this.a = 0;
            this.b = 0.5f;
        }

        public d(@InterfaceC5670cr1 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
            this.b = 0.5f;
        }

        public d(@InterfaceC5670cr1 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 0;
            this.b = 0.5f;
        }

        public d(@InterfaceC5670cr1 FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
            this.b = 0.5f;
        }

        public d(@InterfaceC5670cr1 d dVar) {
            super((FrameLayout.LayoutParams) dVar);
            this.a = 0;
            this.b = 0.5f;
            this.a = dVar.a;
            this.b = dVar.b;
        }
    }
}
