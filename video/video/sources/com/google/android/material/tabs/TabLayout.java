package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o.AbstractC3694Mx1;
import o.BY0;
import o.C10861y4;
import o.C10920yI2;
import o.C2555Bk;
import o.C2849Ek;
import o.C3220Ic;
import o.C3549Lk2;
import o.C4297Tc1;
import o.C4394Uc1;
import o.C4491Vc1;
import o.C4930Zm2;
import o.C5600ca;
import o.C6516gH2;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.C9097qq2;
import o.C9563sk0;
import o.C9811tl1;
import o.D60;
import o.FE1;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC2669Co;
import o.InterfaceC3329Je2;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;
import o.InterfaceC6509gG;
import o.InterfaceC9397s30;
import o.JE0;
import o.JF;
import o.K60;
import o.OL1;
import o.Q90;
import o.QU1;
import o.Z60;
import o.ZD1;

@ViewPager.e
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {
    @InterfaceC9397s30(unit = 0)
    public static final int W1 = 72;
    @InterfaceC9397s30(unit = 0)
    public static final int X1 = 8;
    @InterfaceC9397s30(unit = 0)
    public static final int Y1 = 48;
    @InterfaceC9397s30(unit = 0)
    public static final int Z1 = 56;
    @InterfaceC9397s30(unit = 0)
    public static final int a2 = 16;
    public static final int b2 = -1;
    public static final int c2 = 300;
    public static final int d2 = -1;
    public static final String f2 = "TabLayout";
    public static final int g2 = 0;
    public static final int h2 = 1;
    public static final int i2 = 2;
    public static final int j2 = 0;
    public static final int k2 = 1;
    public static final int l2 = 0;
    public static final int m2 = 1;
    public static final int n2 = 2;
    public static final int o2 = 0;
    public static final int p2 = 1;
    public static final int q2 = 2;
    public static final int r2 = 3;
    public static final int s2 = 0;
    public static final int t2 = 1;
    public static final int u2 = 2;
    public int A1;
    public int B1;
    public boolean C1;
    public boolean D1;
    public int E1;
    public int F1;
    public boolean G1;
    public com.google.android.material.tabs.a H1;
    public final TimeInterpolator I1;
    @InterfaceC11300zs1
    public c J1;
    public final ArrayList<c> K1;
    @InterfaceC11300zs1
    public c L1;
    public ValueAnimator M1;
    @InterfaceC11300zs1
    public ViewPager N1;
    @InterfaceC11300zs1
    public AbstractC3694Mx1 O1;
    public DataSetObserver P1;
    public m Q1;
    public b R1;
    public boolean S1;
    public int T1;
    public final FE1.a<n> U1;
    public int Y0;
    public final ArrayList<i> Z0;
    @InterfaceC11300zs1
    public i a1;
    @InterfaceC5670cr1
    public final h b1;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public final int g1;
    public final int h1;
    public int i1;
    public ColorStateList j1;
    public ColorStateList k1;
    public ColorStateList l1;
    @InterfaceC5670cr1
    public Drawable m1;
    public int n1;
    public PorterDuff.Mode o1;
    public float p1;
    public float q1;
    public float r1;
    public final int s1;
    public int t1;
    public final int u1;
    public final int v1;
    public final int w1;
    public int x1;
    public int y1;
    public int z1;
    public static final int V1 = C7025iN1.n.Widget_Design_TabLayout;
    public static final FE1.a<i> e2 = new FE1.c(16);

    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ViewPager.i {
        public boolean a;

        public b() {
        }

        public void a(boolean z) {
            this.a = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void d(@InterfaceC5670cr1 ViewPager viewPager, @InterfaceC11300zs1 AbstractC3694Mx1 abstractC3694Mx1, @InterfaceC11300zs1 AbstractC3694Mx1 abstractC3694Mx12) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.N1 == viewPager) {
                tabLayout.T(abstractC3694Mx12, this.a);
            }
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface c<T extends i> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface d {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface e {
    }

    /* loaded from: classes3.dex */
    public interface f extends c<i> {
    }

    /* loaded from: classes3.dex */
    public class g extends DataSetObserver {
        public g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.J();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.J();
        }
    }

    /* loaded from: classes3.dex */
    public class h extends LinearLayout {
        public ValueAnimator Y0;
        public int Z0;

        /* loaded from: classes3.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ View a;
            public final /* synthetic */ View b;

            public a(View view, View view2) {
                this.a = view;
                this.b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
                h.this.j(this.a, this.b, valueAnimator.getAnimatedFraction());
            }
        }

        public h(Context context) {
            super(context);
            this.Z0 = -1;
            setWillNotDraw(false);
        }

        public void c(int i, int i2) {
            ValueAnimator valueAnimator = this.Y0;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.Y0 != i) {
                this.Y0.cancel();
            }
            k(true, i, i2);
        }

        public boolean d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(@InterfaceC5670cr1 Canvas canvas) {
            int height;
            int height2 = TabLayout.this.m1.getBounds().height();
            if (height2 < 0) {
                height2 = TabLayout.this.m1.getIntrinsicHeight();
            }
            int i = TabLayout.this.A1;
            if (i != 0) {
                if (i != 1) {
                    height = 0;
                    if (i != 2) {
                        if (i != 3) {
                            height2 = 0;
                        } else {
                            height2 = getHeight();
                        }
                    }
                } else {
                    height = (getHeight() - height2) / 2;
                    height2 = (getHeight() + height2) / 2;
                }
            } else {
                height = getHeight() - height2;
                height2 = getHeight();
            }
            if (TabLayout.this.m1.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.m1.getBounds();
                TabLayout.this.m1.setBounds(bounds.left, height, bounds.right, height2);
                TabLayout.this.m1.draw(canvas);
            }
            super.draw(canvas);
        }

        public final void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.Y0 == -1) {
                tabLayout.Y0 = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.Y0);
        }

        public final void f(int i) {
            if (TabLayout.this.T1 != 0 && (TabLayout.this.getTabSelectedIndicator().getBounds().left != -1 || TabLayout.this.getTabSelectedIndicator().getBounds().right != -1)) {
                return;
            }
            View childAt = getChildAt(i);
            com.google.android.material.tabs.a aVar = TabLayout.this.H1;
            TabLayout tabLayout = TabLayout.this;
            aVar.c(tabLayout, childAt, tabLayout.m1);
            TabLayout.this.Y0 = i;
        }

        public final void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        public void h(int i, float f) {
            TabLayout.this.Y0 = Math.round(i + f);
            ValueAnimator valueAnimator = this.Y0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.Y0.cancel();
            }
            j(getChildAt(i), getChildAt(i + 1), f);
        }

        public void i(int i) {
            Rect bounds = TabLayout.this.m1.getBounds();
            TabLayout.this.m1.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void j(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                com.google.android.material.tabs.a aVar = TabLayout.this.H1;
                TabLayout tabLayout = TabLayout.this;
                aVar.d(tabLayout, view, view2, f, tabLayout.m1);
            } else {
                Drawable drawable = TabLayout.this.m1;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.m1.getBounds().bottom);
            }
            postInvalidateOnAnimation();
        }

        public final void k(boolean z, int i, int i2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.Y0 == i) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.Y0 = i;
            a aVar = new a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.Y0 = valueAnimator;
                valueAnimator.setInterpolator(TabLayout.this.I1);
                valueAnimator.setDuration(i2);
                valueAnimator.setFloatValues(0.0f, 1.0f);
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.start();
                return;
            }
            this.Y0.removeAllUpdateListeners();
            this.Y0.addUpdateListener(aVar);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.Y0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            } else {
                e();
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.y1 == 1 || tabLayout.B1 == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) C10920yI2.i(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.y1 = 0;
                            tabLayout2.c0(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    /* loaded from: classes3.dex */
    public static class i {
        public static final int k = -1;
        @InterfaceC11300zs1
        public Object a;
        @InterfaceC11300zs1
        public Drawable b;
        @InterfaceC11300zs1
        public CharSequence c;
        @InterfaceC11300zs1
        public CharSequence d;
        @InterfaceC11300zs1
        public View f;
        @InterfaceC11300zs1
        public TabLayout h;
        @InterfaceC5670cr1
        public n i;
        public int e = -1;
        public int g = 1;
        public int j = -1;

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public i A(int i) {
            this.g = i;
            TabLayout tabLayout = this.h;
            if (tabLayout.y1 == 1 || tabLayout.B1 == 2) {
                tabLayout.c0(true);
            }
            E();
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public i B(@InterfaceC11300zs1 Object obj) {
            this.a = obj;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public i C(@InterfaceC3329Je2 int i) {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                return D(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public i D(@InterfaceC11300zs1 CharSequence charSequence) {
            if (TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(charSequence)) {
                this.i.setContentDescription(charSequence);
            }
            this.c = charSequence;
            E();
            return this;
        }

        public void E() {
            n nVar = this.i;
            if (nVar != null) {
                nVar.t();
            }
        }

        @InterfaceC11300zs1
        public C2555Bk e() {
            return this.i.getBadge();
        }

        @InterfaceC11300zs1
        public CharSequence f() {
            n nVar = this.i;
            if (nVar == null) {
                return null;
            }
            return nVar.getContentDescription();
        }

        @InterfaceC11300zs1
        public View g() {
            return this.f;
        }

        @InterfaceC11300zs1
        public Drawable h() {
            return this.b;
        }

        public int i() {
            return this.j;
        }

        @InterfaceC5670cr1
        public C2555Bk j() {
            return this.i.getOrCreateBadge();
        }

        public int k() {
            return this.e;
        }

        public int l() {
            return this.g;
        }

        @InterfaceC11300zs1
        public Object m() {
            return this.a;
        }

        @InterfaceC11300zs1
        public CharSequence n() {
            return this.c;
        }

        public boolean o() {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == this.e) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void p() {
            this.i.n();
        }

        public void q() {
            this.h = null;
            this.i = null;
            this.a = null;
            this.b = null;
            this.j = -1;
            this.c = null;
            this.d = null;
            this.e = -1;
            this.f = null;
        }

        public void r() {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                tabLayout.R(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public i s(@InterfaceC3329Je2 int i) {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                return t(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public i t(@InterfaceC11300zs1 CharSequence charSequence) {
            this.d = charSequence;
            E();
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public i u(@BY0 int i) {
            return v(LayoutInflater.from(this.i.getContext()).inflate(i, (ViewGroup) this.i, false));
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public i v(@InterfaceC11300zs1 View view) {
            this.f = view;
            E();
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public i w(@K60 int i) {
            TabLayout tabLayout = this.h;
            if (tabLayout != null) {
                return x(C3220Ic.b(tabLayout.getContext(), i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public i x(@InterfaceC11300zs1 Drawable drawable) {
            this.b = drawable;
            TabLayout tabLayout = this.h;
            if (tabLayout.y1 == 1 || tabLayout.B1 == 2) {
                tabLayout.c0(true);
            }
            E();
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5670cr1
        public i y(int i) {
            this.j = i;
            n nVar = this.i;
            if (nVar != null) {
                nVar.setId(i);
            }
            return this;
        }

        public void z(int i) {
            this.e = i;
        }
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface j {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface k {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface l {
    }

    /* loaded from: classes3.dex */
    public static class m implements ViewPager.j {
        @InterfaceC5670cr1
        public final WeakReference<TabLayout> a;
        public int b;
        public int c;

        public m(TabLayout tabLayout) {
            this.a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                int i3 = this.c;
                boolean z2 = true;
                if (i3 == 2 && this.b != 1) {
                    z = true;
                    z2 = false;
                } else {
                    z = true;
                }
                if (i3 == 2 && this.b == 0) {
                    z = false;
                }
                tabLayout.W(i, f, z2, z, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
            this.b = this.c;
            this.c = i;
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null) {
                tabLayout.d0(this.c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i) {
            boolean z;
            TabLayout tabLayout = this.a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.c;
                if (i2 != 0 && (i2 != 2 || this.b != 0)) {
                    z = false;
                } else {
                    z = true;
                }
                tabLayout.S(tabLayout.D(i), z);
            }
        }

        public void d() {
            this.c = 0;
            this.b = 0;
        }
    }

    /* loaded from: classes3.dex */
    public final class n extends LinearLayout {
        public i Y0;
        public TextView Z0;
        public ImageView a1;
        @InterfaceC11300zs1
        public View b1;
        @InterfaceC11300zs1
        public C2555Bk c1;
        @InterfaceC11300zs1
        public View d1;
        @InterfaceC11300zs1
        public TextView e1;
        @InterfaceC11300zs1
        public ImageView f1;
        @InterfaceC11300zs1
        public Drawable g1;
        public int h1;

        /* loaded from: classes3.dex */
        public class a implements View.OnLayoutChangeListener {
            public final /* synthetic */ View X;

            public a(View view) {
                this.X = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.X.getVisibility() == 0) {
                    n.this.s(this.X);
                }
            }
        }

        public n(@InterfaceC5670cr1 Context context) {
            super(context);
            this.h1 = 2;
            u(context);
            setPaddingRelative(TabLayout.this.c1, TabLayout.this.d1, TabLayout.this.e1, TabLayout.this.f1);
            setGravity(17);
            setOrientation(!TabLayout.this.C1 ? 1 : 0);
            setClickable(true);
            C6516gH2.r2(this, ZD1.c(getContext(), 1002));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC11300zs1
        public C2555Bk getBadge() {
            return this.c1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @InterfaceC5670cr1
        public C2555Bk getOrCreateBadge() {
            if (this.c1 == null) {
                this.c1 = C2555Bk.g(getContext());
            }
            r();
            C2555Bk c2555Bk = this.c1;
            if (c2555Bk != null) {
                return c2555Bk;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            boolean z;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.g1;
            if (drawable != null && drawable.isStateful()) {
                z = this.g1.setState(drawableState);
            } else {
                z = false;
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void g(@InterfaceC11300zs1 View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        public int getContentHeight() {
            View[] viewArr = {this.Z0, this.a1, this.d1};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getTop());
                    } else {
                        i2 = view.getTop();
                    }
                    if (z) {
                        i = Math.max(i, view.getBottom());
                    } else {
                        i = view.getBottom();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        public int getContentWidth() {
            View[] viewArr = {this.Z0, this.a1, this.d1};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getLeft());
                    } else {
                        i2 = view.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view.getRight());
                    } else {
                        i = view.getRight();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        @InterfaceC11300zs1
        public i getTab() {
            return this.Y0;
        }

        public final float h(@InterfaceC5670cr1 Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        public final void i(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        public final void j(@InterfaceC5670cr1 Canvas canvas) {
            Drawable drawable = this.g1;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.g1.draw(canvas);
            }
        }

        public final boolean k() {
            if (this.c1 != null) {
                return true;
            }
            return false;
        }

        public final void l() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C7025iN1.k.design_layout_tab_icon, (ViewGroup) this, false);
            this.a1 = imageView;
            addView(imageView, 0);
        }

        public final void m() {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C7025iN1.k.design_layout_tab_text, (ViewGroup) this, false);
            this.Z0 = textView;
            addView(textView);
        }

        public final void n() {
            if (this.b1 != null) {
                q();
            }
            this.c1 = null;
        }

        public void o() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@InterfaceC5670cr1 AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C10861y4 t2 = C10861y4.t2(accessibilityNodeInfo);
            C2555Bk c2555Bk = this.c1;
            if (c2555Bk != null && c2555Bk.isVisible()) {
                t2.p1(this.c1.s());
            }
            t2.n1(C10861y4.g.j(0, 1, this.Y0.k(), 1, false, isSelected()));
            if (isSelected()) {
                t2.l1(false);
                t2.W0(C10861y4.a.j);
            }
            t2.X1(getResources().getString(C7025iN1.m.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.t1, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.Z0 != null) {
                float f = TabLayout.this.p1;
                if (isSelected() && TabLayout.this.i1 != -1) {
                    f = TabLayout.this.q1;
                }
                int i3 = this.h1;
                ImageView imageView = this.a1;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i3 = 1;
                } else {
                    TextView textView = this.Z0;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.r1;
                    }
                }
                float textSize = this.Z0.getTextSize();
                int lineCount = this.Z0.getLineCount();
                int maxLines = this.Z0.getMaxLines();
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.B1 == 1 && i4 > 0 && lineCount == 1 && ((layout = this.Z0.getLayout()) == null || h(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        return;
                    }
                    this.Z0.setTextSize(0, f);
                    this.Z0.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
        }

        public final void p(@InterfaceC11300zs1 View view) {
            if (k() && view != null) {
                i(false);
                C2849Ek.e(this.c1, view, null);
                this.b1 = view;
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.Y0 != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                this.Y0.r();
                return true;
            }
            return performClick;
        }

        public final void q() {
            if (k()) {
                i(true);
                View view = this.b1;
                if (view != null) {
                    C2849Ek.k(this.c1, view);
                    this.b1 = null;
                }
            }
        }

        public final void r() {
            i iVar;
            i iVar2;
            if (!k()) {
                return;
            }
            if (this.d1 != null) {
                q();
            } else if (this.a1 != null && (iVar2 = this.Y0) != null && iVar2.h() != null) {
                View view = this.b1;
                ImageView imageView = this.a1;
                if (view != imageView) {
                    q();
                    p(this.a1);
                    return;
                }
                s(imageView);
            } else if (this.Z0 != null && (iVar = this.Y0) != null && iVar.l() == 1) {
                View view2 = this.b1;
                TextView textView = this.Z0;
                if (view2 != textView) {
                    q();
                    p(this.Z0);
                    return;
                }
                s(textView);
            } else {
                q();
            }
        }

        public final void s(@InterfaceC5670cr1 View view) {
            if (k() && view == this.b1) {
                C2849Ek.o(this.c1, view, null);
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.Z0;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.a1;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.d1;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@InterfaceC11300zs1 i iVar) {
            if (iVar != this.Y0) {
                this.Y0 = iVar;
                t();
            }
        }

        public final void t() {
            boolean z;
            w();
            i iVar = this.Y0;
            if (iVar != null && iVar.o()) {
                z = true;
            } else {
                z = false;
            }
            setSelected(z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.google.android.material.tabs.TabLayout$n] */
        public final void u(Context context) {
            int i = TabLayout.this.s1;
            GradientDrawable gradientDrawable = null;
            if (i != 0) {
                Drawable b = C3220Ic.b(context, i);
                this.g1 = b;
                if (b != null && b.isStateful()) {
                    this.g1.setState(getDrawableState());
                }
            } else {
                this.g1 = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.l1 != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList a2 = QU1.a(TabLayout.this.l1);
                boolean z = TabLayout.this.G1;
                if (z) {
                    gradientDrawable2 = null;
                }
                if (!z) {
                    gradientDrawable = gradientDrawable3;
                }
                gradientDrawable2 = new RippleDrawable(a2, gradientDrawable2, gradientDrawable);
            }
            setBackground(gradientDrawable2);
            TabLayout.this.invalidate();
        }

        public final void v() {
            setOrientation(!TabLayout.this.C1 ? 1 : 0);
            TextView textView = this.e1;
            if (textView == null && this.f1 == null) {
                x(this.Z0, this.a1, true);
            } else {
                x(textView, this.f1, false);
            }
        }

        public final void w() {
            View view;
            ViewParent parent;
            i iVar = this.Y0;
            if (iVar != null) {
                view = iVar.g();
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.d1;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.d1);
                    }
                    addView(view);
                }
                this.d1 = view;
                TextView textView = this.Z0;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.a1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.a1.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.e1 = textView2;
                if (textView2 != null) {
                    this.h1 = textView2.getMaxLines();
                }
                this.f1 = (ImageView) view.findViewById(16908294);
            } else {
                View view3 = this.d1;
                if (view3 != null) {
                    removeView(view3);
                    this.d1 = null;
                }
                this.e1 = null;
                this.f1 = null;
            }
            if (this.d1 == null) {
                if (this.a1 == null) {
                    l();
                }
                if (this.Z0 == null) {
                    m();
                    this.h1 = this.Z0.getMaxLines();
                }
                C4930Zm2.D(this.Z0, TabLayout.this.g1);
                if (isSelected() && TabLayout.this.i1 != -1) {
                    C4930Zm2.D(this.Z0, TabLayout.this.i1);
                } else {
                    C4930Zm2.D(this.Z0, TabLayout.this.h1);
                }
                ColorStateList colorStateList = TabLayout.this.j1;
                if (colorStateList != null) {
                    this.Z0.setTextColor(colorStateList);
                }
                x(this.Z0, this.a1, true);
                r();
                g(this.a1);
                g(this.Z0);
            } else {
                TextView textView3 = this.e1;
                if (textView3 != null || this.f1 != null) {
                    x(textView3, this.f1, false);
                }
            }
            if (iVar != null && !TextUtils.isEmpty(iVar.d)) {
                setContentDescription(iVar.d);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
            if (r7.Y0.g == 1) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void x(@InterfaceC11300zs1 TextView textView, @InterfaceC11300zs1 ImageView imageView, boolean z) {
            Drawable drawable;
            CharSequence charSequence;
            boolean z2;
            int i;
            CharSequence charSequence2;
            int i2;
            i iVar = this.Y0;
            CharSequence charSequence3 = null;
            if (iVar != null && iVar.h() != null) {
                drawable = D60.r(this.Y0.h()).mutate();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                drawable.setTintList(TabLayout.this.k1);
                PorterDuff.Mode mode = TabLayout.this.o1;
                if (mode != null) {
                    drawable.setTintMode(mode);
                }
            }
            i iVar2 = this.Y0;
            if (iVar2 != null) {
                charSequence = iVar2.n();
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (!isEmpty) {
                    z2 = true;
                }
                z2 = false;
                if (!isEmpty) {
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = null;
                }
                textView.setText(charSequence2);
                if (z2) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                if (!isEmpty) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z2 && imageView.getVisibility() == 0) {
                    i = (int) C10920yI2.i(getContext(), 8);
                } else {
                    i = 0;
                }
                if (TabLayout.this.C1) {
                    if (i != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            i iVar3 = this.Y0;
            if (iVar3 != null) {
                charSequence3 = iVar3.d;
            }
            if (isEmpty) {
                charSequence = charSequence3;
            }
            C9097qq2.a(this, charSequence);
        }
    }

    /* loaded from: classes3.dex */
    public static class o implements f {
        public final ViewPager a;

        public o(ViewPager viewPager) {
            this.a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@InterfaceC5670cr1 i iVar) {
            this.a.setCurrentItem(iVar.k());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(i iVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(i iVar) {
        }
    }

    public TabLayout(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    @InterfaceC9397s30(unit = 0)
    private int getDefaultHeight() {
        int size = this.Z0.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.Z0.get(i3);
            if (iVar != null && iVar.h() != null && !TextUtils.isEmpty(iVar.n())) {
                if (!this.C1) {
                    return 72;
                }
                return 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i3 = this.u1;
        if (i3 != -1) {
            return i3;
        }
        int i4 = this.B1;
        if (i4 != 0 && i4 != 2) {
            return 0;
        }
        return this.w1;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.b1.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i3) {
        boolean z;
        boolean z2;
        int childCount = this.b1.getChildCount();
        if (i3 < childCount) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.b1.getChildAt(i4);
                boolean z3 = true;
                if ((i4 == i3 && !childAt.isSelected()) || (i4 != i3 && childAt.isSelected())) {
                    if (i4 == i3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    childAt.setSelected(z2);
                    if (i4 != i3) {
                        z3 = false;
                    }
                    childAt.setActivated(z3);
                    if (childAt instanceof n) {
                        ((n) childAt).w();
                    }
                } else {
                    if (i4 == i3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    childAt.setSelected(z);
                    if (i4 != i3) {
                        z3 = false;
                    }
                    childAt.setActivated(z3);
                }
            }
        }
    }

    @InterfaceC5670cr1
    public static ColorStateList v(int i3, int i4) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i4, i3});
    }

    public final void A(@InterfaceC5670cr1 i iVar) {
        for (int size = this.K1.size() - 1; size >= 0; size--) {
            this.K1.get(size).a(iVar);
        }
    }

    public final void B(@InterfaceC5670cr1 i iVar) {
        for (int size = this.K1.size() - 1; size >= 0; size--) {
            this.K1.get(size).b(iVar);
        }
    }

    public final void C() {
        if (this.M1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.M1 = valueAnimator;
            valueAnimator.setInterpolator(this.I1);
            this.M1.setDuration(this.z1);
            this.M1.addUpdateListener(new a());
        }
    }

    @InterfaceC11300zs1
    public i D(int i3) {
        if (i3 >= 0 && i3 < getTabCount()) {
            return this.Z0.get(i3);
        }
        return null;
    }

    public boolean E() {
        return this.G1;
    }

    public boolean F() {
        return this.C1;
    }

    public final boolean G() {
        if (getTabMode() != 0 && getTabMode() != 2) {
            return false;
        }
        return true;
    }

    public boolean H() {
        return this.D1;
    }

    @InterfaceC5670cr1
    public i I() {
        i x = x();
        x.h = this;
        x.i = y(x);
        if (x.j != -1) {
            x.i.setId(x.j);
        }
        return x;
    }

    public void J() {
        int currentItem;
        L();
        AbstractC3694Mx1 abstractC3694Mx1 = this.O1;
        if (abstractC3694Mx1 != null) {
            int e3 = abstractC3694Mx1.e();
            for (int i3 = 0; i3 < e3; i3++) {
                l(I().D(this.O1.g(i3)), false);
            }
            ViewPager viewPager = this.N1;
            if (viewPager != null && e3 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                R(D(currentItem));
            }
        }
    }

    public boolean K(i iVar) {
        return e2.b(iVar);
    }

    public void L() {
        for (int childCount = this.b1.getChildCount() - 1; childCount >= 0; childCount--) {
            Q(childCount);
        }
        Iterator<i> it = this.Z0.iterator();
        while (it.hasNext()) {
            i next = it.next();
            it.remove();
            next.q();
            K(next);
        }
        this.a1 = null;
    }

    @Deprecated
    public void M(@InterfaceC11300zs1 c cVar) {
        this.K1.remove(cVar);
    }

    public void N(@InterfaceC5670cr1 f fVar) {
        M(fVar);
    }

    public void O(@InterfaceC5670cr1 i iVar) {
        if (iVar.h == this) {
            P(iVar.k());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void P(int i3) {
        int i4;
        i iVar;
        i iVar2 = this.a1;
        if (iVar2 != null) {
            i4 = iVar2.k();
        } else {
            i4 = 0;
        }
        Q(i3);
        i remove = this.Z0.remove(i3);
        if (remove != null) {
            remove.q();
            K(remove);
        }
        int size = this.Z0.size();
        int i5 = -1;
        for (int i6 = i3; i6 < size; i6++) {
            if (this.Z0.get(i6).k() == this.Y0) {
                i5 = i6;
            }
            this.Z0.get(i6).z(i6);
        }
        this.Y0 = i5;
        if (i4 == i3) {
            if (this.Z0.isEmpty()) {
                iVar = null;
            } else {
                iVar = this.Z0.get(Math.max(0, i3 - 1));
            }
            R(iVar);
        }
    }

    public final void Q(int i3) {
        n nVar = (n) this.b1.getChildAt(i3);
        this.b1.removeViewAt(i3);
        if (nVar != null) {
            nVar.o();
            this.U1.b(nVar);
        }
        requestLayout();
    }

    public void R(@InterfaceC11300zs1 i iVar) {
        S(iVar, true);
    }

    public void S(@InterfaceC11300zs1 i iVar, boolean z) {
        int i3;
        i iVar2 = this.a1;
        if (iVar2 == iVar) {
            if (iVar2 != null) {
                z(iVar);
                p(iVar.k());
                return;
            }
            return;
        }
        if (iVar != null) {
            i3 = iVar.k();
        } else {
            i3 = -1;
        }
        if (z) {
            if ((iVar2 == null || iVar2.k() == -1) && i3 != -1) {
                U(i3, 0.0f, true);
            } else {
                p(i3);
            }
            if (i3 != -1) {
                setSelectedTabView(i3);
            }
        }
        this.a1 = iVar;
        if (iVar2 != null && iVar2.h != null) {
            B(iVar2);
        }
        if (iVar != null) {
            A(iVar);
        }
    }

    public void T(@InterfaceC11300zs1 AbstractC3694Mx1 abstractC3694Mx1, boolean z) {
        DataSetObserver dataSetObserver;
        AbstractC3694Mx1 abstractC3694Mx12 = this.O1;
        if (abstractC3694Mx12 != null && (dataSetObserver = this.P1) != null) {
            abstractC3694Mx12.u(dataSetObserver);
        }
        this.O1 = abstractC3694Mx1;
        if (z && abstractC3694Mx1 != null) {
            if (this.P1 == null) {
                this.P1 = new g();
            }
            abstractC3694Mx1.m(this.P1);
        }
        J();
    }

    public void U(int i3, float f3, boolean z) {
        V(i3, f3, z, true);
    }

    public void V(int i3, float f3, boolean z, boolean z2) {
        W(i3, f3, z, z2, true);
    }

    public void W(int i3, float f3, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int round = Math.round(i3 + f3);
        if (round >= 0 && round < this.b1.getChildCount()) {
            if (z2) {
                this.b1.h(i3, f3);
            }
            ValueAnimator valueAnimator = this.M1;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.M1.cancel();
            }
            int s = s(i3, f3);
            int scrollX = getScrollX();
            if ((i3 < getSelectedTabPosition() && s >= scrollX) || ((i3 > getSelectedTabPosition() && s <= scrollX) || i3 == getSelectedTabPosition())) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (getLayoutDirection() == 1) {
                if ((i3 < getSelectedTabPosition() && s <= scrollX) || ((i3 > getSelectedTabPosition() && s >= scrollX) || i3 == getSelectedTabPosition())) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z4 || this.T1 == 1 || z3) {
                if (i3 < 0) {
                    s = 0;
                }
                scrollTo(s, 0);
            }
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void X(int i3, int i4) {
        setTabTextColors(v(i3, i4));
    }

    public void Y(@InterfaceC11300zs1 ViewPager viewPager, boolean z) {
        Z(viewPager, z, false);
    }

    public final void Z(@InterfaceC11300zs1 ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.N1;
        if (viewPager2 != null) {
            m mVar = this.Q1;
            if (mVar != null) {
                viewPager2.O(mVar);
            }
            b bVar = this.R1;
            if (bVar != null) {
                this.N1.N(bVar);
            }
        }
        c cVar = this.L1;
        if (cVar != null) {
            M(cVar);
            this.L1 = null;
        }
        if (viewPager != null) {
            this.N1 = viewPager;
            if (this.Q1 == null) {
                this.Q1 = new m(this);
            }
            this.Q1.d();
            viewPager.c(this.Q1);
            o oVar = new o(viewPager);
            this.L1 = oVar;
            g(oVar);
            AbstractC3694Mx1 adapter = viewPager.getAdapter();
            if (adapter != null) {
                T(adapter, z);
            }
            if (this.R1 == null) {
                this.R1 = new b();
            }
            this.R1.a(z);
            viewPager.b(this.R1);
            U(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.N1 = null;
            T(null, false);
        }
        this.S1 = z2;
    }

    public final void a0() {
        int size = this.Z0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.Z0.get(i3).E();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        o(view);
    }

    public final void b0(@InterfaceC5670cr1 LinearLayout.LayoutParams layoutParams) {
        if (this.B1 == 1 && this.y1 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void c0(boolean z) {
        for (int i3 = 0; i3 < this.b1.getChildCount(); i3++) {
            View childAt = this.b1.getChildAt(i3);
            childAt.setMinimumWidth(getTabMinWidth());
            b0((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void d0(int i3) {
        this.T1 = i3;
    }

    @Deprecated
    public void g(@InterfaceC11300zs1 c cVar) {
        if (!this.K1.contains(cVar)) {
            this.K1.add(cVar);
        }
    }

    public int getSelectedTabPosition() {
        i iVar = this.a1;
        if (iVar != null) {
            return iVar.k();
        }
        return -1;
    }

    public int getTabCount() {
        return this.Z0.size();
    }

    public int getTabGravity() {
        return this.y1;
    }

    @InterfaceC11300zs1
    public ColorStateList getTabIconTint() {
        return this.k1;
    }

    public int getTabIndicatorAnimationMode() {
        return this.F1;
    }

    public int getTabIndicatorGravity() {
        return this.A1;
    }

    public int getTabMaxWidth() {
        return this.t1;
    }

    public int getTabMode() {
        return this.B1;
    }

    @InterfaceC11300zs1
    public ColorStateList getTabRippleColor() {
        return this.l1;
    }

    @InterfaceC5670cr1
    public Drawable getTabSelectedIndicator() {
        return this.m1;
    }

    @InterfaceC11300zs1
    public ColorStateList getTabTextColors() {
        return this.j1;
    }

    public void h(@InterfaceC5670cr1 f fVar) {
        g(fVar);
    }

    public void i(@InterfaceC5670cr1 i iVar) {
        l(iVar, this.Z0.isEmpty());
    }

    public void j(@InterfaceC5670cr1 i iVar, int i3) {
        k(iVar, i3, this.Z0.isEmpty());
    }

    public void k(@InterfaceC5670cr1 i iVar, int i3, boolean z) {
        if (iVar.h == this) {
            u(iVar, i3);
            n(iVar);
            if (z) {
                iVar.r();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void l(@InterfaceC5670cr1 i iVar, boolean z) {
        k(iVar, this.Z0.size(), z);
    }

    public final void m(@InterfaceC5670cr1 C3549Lk2 c3549Lk2) {
        i I = I();
        CharSequence charSequence = c3549Lk2.Y0;
        if (charSequence != null) {
            I.D(charSequence);
        }
        Drawable drawable = c3549Lk2.Z0;
        if (drawable != null) {
            I.x(drawable);
        }
        int i3 = c3549Lk2.a1;
        if (i3 != 0) {
            I.u(i3);
        }
        if (!TextUtils.isEmpty(c3549Lk2.getContentDescription())) {
            I.t(c3549Lk2.getContentDescription());
        }
        i(I);
    }

    public final void n(@InterfaceC5670cr1 i iVar) {
        n nVar = iVar.i;
        nVar.setSelected(false);
        nVar.setActivated(false);
        this.b1.addView(nVar, iVar.k(), w());
    }

    public final void o(View view) {
        if (view instanceof C3549Lk2) {
            m((C3549Lk2) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4491Vc1.e(this);
        if (this.N1 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                Z((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.S1) {
            setupWithViewPager(null);
            this.S1 = false;
        }
    }

    @Override // android.view.View
    public void onDraw(@InterfaceC5670cr1 Canvas canvas) {
        for (int i3 = 0; i3 < this.b1.getChildCount(); i3++) {
            View childAt = this.b1.getChildAt(i3);
            if (childAt instanceof n) {
                ((n) childAt).j(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@InterfaceC5670cr1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C10861y4.t2(accessibilityNodeInfo).m1(C10861y4.f.h(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (G() && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        int round = Math.round(C10920yI2.i(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i4);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i4 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i4) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i3);
        if (View.MeasureSpec.getMode(i3) != 0) {
            int i5 = this.v1;
            if (i5 <= 0) {
                i5 = (int) (size - C10920yI2.i(getContext(), 56));
            }
            this.t1 = i5;
        }
        super.onMeasure(i3, i4);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i6 = this.B1;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8 && !G()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(int i3) {
        if (i3 == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut() && !this.b1.d()) {
            int scrollX = getScrollX();
            int s = s(i3, 0.0f);
            if (scrollX != s) {
                C();
                this.M1.setIntValues(scrollX, s);
                this.M1.start();
            }
            this.b1.c(i3, this.z1);
            return;
        }
        U(i3, 0.0f, true);
    }

    public final void q(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
            } else {
                this.b1.setGravity(1);
                return;
            }
        } else {
            Log.w(f2, "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        this.b1.setGravity(JE0.b);
    }

    public final void r() {
        int max;
        int i3 = this.B1;
        if (i3 != 0 && i3 != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.x1 - this.c1);
        }
        this.b1.setPaddingRelative(max, 0, 0, 0);
        int i4 = this.B1;
        if (i4 != 0) {
            if (i4 == 1 || i4 == 2) {
                if (this.y1 == 2) {
                    Log.w(f2, "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                this.b1.setGravity(1);
            }
        } else {
            q(this.y1);
        }
        c0(true);
    }

    public final int s(int i3, float f3) {
        View childAt;
        View view;
        int i4 = this.B1;
        int i5 = 0;
        if ((i4 != 0 && i4 != 2) || (childAt = this.b1.getChildAt(i3)) == null) {
            return 0;
        }
        int i6 = i3 + 1;
        if (i6 < this.b1.getChildCount()) {
            view = this.b1.getChildAt(i6);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i5 = view.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i7 = (int) ((width + i5) * 0.5f * f3);
        if (getLayoutDirection() == 0) {
            return left + i7;
        }
        return left - i7;
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        C4491Vc1.d(this, f3);
    }

    public void setInlineLabel(boolean z) {
        if (this.C1 != z) {
            this.C1 = z;
            for (int i3 = 0; i3 < this.b1.getChildCount(); i3++) {
                View childAt = this.b1.getChildAt(i3);
                if (childAt instanceof n) {
                    ((n) childAt).v();
                }
            }
            r();
        }
    }

    public void setInlineLabelResource(@InterfaceC2669Co int i3) {
        setInlineLabel(getResources().getBoolean(i3));
    }

    @Deprecated
    public void setOnTabSelectedListener(@InterfaceC11300zs1 f fVar) {
        setOnTabSelectedListener((c) fVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        C();
        this.M1.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = D60.r(drawable).mutate();
        this.m1 = mutate;
        Z60.n(mutate, this.n1);
        int i3 = this.E1;
        if (i3 == -1) {
            i3 = this.m1.getIntrinsicHeight();
        }
        this.b1.i(i3);
    }

    public void setSelectedTabIndicatorColor(@JF int i3) {
        this.n1 = i3;
        Z60.n(this.m1, i3);
        c0(false);
    }

    public void setSelectedTabIndicatorGravity(int i3) {
        if (this.A1 != i3) {
            this.A1 = i3;
            this.b1.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i3) {
        this.E1 = i3;
        this.b1.i(i3);
    }

    public void setTabGravity(int i3) {
        if (this.y1 != i3) {
            this.y1 = i3;
            r();
        }
    }

    public void setTabIconTint(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.k1 != colorStateList) {
            this.k1 = colorStateList;
            a0();
        }
    }

    public void setTabIconTintResource(@InterfaceC6509gG int i3) {
        setTabIconTint(C3220Ic.a(getContext(), i3));
    }

    public void setTabIndicatorAnimationMode(int i3) {
        this.F1 = i3;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    this.H1 = new C9563sk0();
                    return;
                }
                throw new IllegalArgumentException(i3 + " is not a valid TabIndicatorAnimationMode");
            }
            this.H1 = new Q90();
            return;
        }
        this.H1 = new com.google.android.material.tabs.a();
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.D1 = z;
        this.b1.g();
        this.b1.postInvalidateOnAnimation();
    }

    public void setTabMode(int i3) {
        if (i3 != this.B1) {
            this.B1 = i3;
            r();
        }
    }

    public void setTabRippleColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.l1 != colorStateList) {
            this.l1 = colorStateList;
            for (int i3 = 0; i3 < this.b1.getChildCount(); i3++) {
                View childAt = this.b1.getChildAt(i3);
                if (childAt instanceof n) {
                    ((n) childAt).u(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@InterfaceC6509gG int i3) {
        setTabRippleColor(C3220Ic.a(getContext(), i3));
    }

    public void setTabTextColors(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.j1 != colorStateList) {
            this.j1 = colorStateList;
            a0();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@InterfaceC11300zs1 AbstractC3694Mx1 abstractC3694Mx1) {
        T(abstractC3694Mx1, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.G1 != z) {
            this.G1 = z;
            for (int i3 = 0; i3 < this.b1.getChildCount(); i3++) {
                View childAt = this.b1.getChildAt(i3);
                if (childAt instanceof n) {
                    ((n) childAt).u(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@InterfaceC2669Co int i3) {
        setUnboundedRipple(getResources().getBoolean(i3));
    }

    public void setupWithViewPager(@InterfaceC11300zs1 ViewPager viewPager) {
        Y(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public void t() {
        this.K1.clear();
    }

    public final void u(@InterfaceC5670cr1 i iVar, int i3) {
        iVar.z(i3);
        this.Z0.add(i3, iVar);
        int size = this.Z0.size();
        int i4 = -1;
        for (int i5 = i3 + 1; i5 < size; i5++) {
            if (this.Z0.get(i5).k() == this.Y0) {
                i4 = i5;
            }
            this.Z0.get(i5).z(i5);
        }
        this.Y0 = i4;
    }

    @InterfaceC5670cr1
    public final LinearLayout.LayoutParams w() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        b0(layoutParams);
        return layoutParams;
    }

    public i x() {
        i a3 = e2.a();
        if (a3 == null) {
            return new i();
        }
        return a3;
    }

    @InterfaceC5670cr1
    public final n y(@InterfaceC5670cr1 i iVar) {
        n nVar;
        FE1.a<n> aVar = this.U1;
        if (aVar != null) {
            nVar = aVar.a();
        } else {
            nVar = null;
        }
        if (nVar == null) {
            nVar = new n(getContext());
        }
        nVar.setTab(iVar);
        nVar.setFocusable(true);
        nVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(iVar.d)) {
            nVar.setContentDescription(iVar.c);
            return nVar;
        }
        nVar.setContentDescription(iVar.d);
        return nVar;
    }

    public final void z(@InterfaceC5670cr1 i iVar) {
        for (int size = this.K1.size() - 1; size >= 0; size--) {
            this.K1.get(size).c(iVar);
        }
    }

    public TabLayout(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i3) {
        o(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@InterfaceC11300zs1 c cVar) {
        c cVar2 = this.J1;
        if (cVar2 != null) {
            M(cVar2);
        }
        this.J1 = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TabLayout(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i3) {
        super(C6597gd1.d(context, attributeSet, i3, r4), attributeSet, i3);
        int i4 = V1;
        this.Y0 = -1;
        this.Z0 = new ArrayList<>();
        this.i1 = -1;
        this.n1 = 0;
        this.t1 = Integer.MAX_VALUE;
        this.E1 = -1;
        this.K1 = new ArrayList<>();
        this.U1 = new FE1.b(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        h hVar = new h(context2);
        this.b1 = hVar;
        super.addView(hVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = C7025iN1.o.Dc;
        int i5 = C7025iN1.o.cd;
        TypedArray k3 = C7608kn2.k(context2, attributeSet, iArr, i3, i4, i5);
        ColorStateList g3 = Z60.g(getBackground());
        if (g3 != null) {
            C4394Uc1 c4394Uc1 = new C4394Uc1();
            c4394Uc1.y0(g3);
            c4394Uc1.i0(context2);
            c4394Uc1.x0(getElevation());
            setBackground(c4394Uc1);
        }
        setSelectedTabIndicator(C4297Tc1.e(context2, k3, C7025iN1.o.Jc));
        setSelectedTabIndicatorColor(k3.getColor(C7025iN1.o.Mc, 0));
        hVar.i(k3.getDimensionPixelSize(C7025iN1.o.Pc, -1));
        setSelectedTabIndicatorGravity(k3.getInt(C7025iN1.o.Oc, 0));
        setTabIndicatorAnimationMode(k3.getInt(C7025iN1.o.Lc, 0));
        setTabIndicatorFullWidth(k3.getBoolean(C7025iN1.o.Nc, true));
        int dimensionPixelSize = k3.getDimensionPixelSize(C7025iN1.o.Uc, 0);
        this.f1 = dimensionPixelSize;
        this.e1 = dimensionPixelSize;
        this.d1 = dimensionPixelSize;
        this.c1 = dimensionPixelSize;
        this.c1 = k3.getDimensionPixelSize(C7025iN1.o.Xc, dimensionPixelSize);
        this.d1 = k3.getDimensionPixelSize(C7025iN1.o.Yc, this.d1);
        this.e1 = k3.getDimensionPixelSize(C7025iN1.o.Wc, this.e1);
        this.f1 = k3.getDimensionPixelSize(C7025iN1.o.Vc, this.f1);
        if (C7608kn2.h(context2)) {
            this.g1 = C7025iN1.c.textAppearanceTitleSmall;
        } else {
            this.g1 = C7025iN1.c.textAppearanceButton;
        }
        int resourceId = k3.getResourceId(i5, C7025iN1.n.TextAppearance_Design_Tab);
        this.h1 = resourceId;
        int[] iArr2 = OL1.m.a6;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            int i6 = OL1.m.b6;
            this.p1 = obtainStyledAttributes.getDimensionPixelSize(i6, 0);
            int i7 = OL1.m.e6;
            this.j1 = C4297Tc1.a(context2, obtainStyledAttributes, i7);
            obtainStyledAttributes.recycle();
            int i8 = C7025iN1.o.ad;
            if (k3.hasValue(i8)) {
                this.i1 = k3.getResourceId(i8, resourceId);
            }
            int i9 = this.i1;
            if (i9 != -1) {
                obtainStyledAttributes = context2.obtainStyledAttributes(i9, iArr2);
                try {
                    this.q1 = obtainStyledAttributes.getDimensionPixelSize(i6, (int) this.p1);
                    ColorStateList a3 = C4297Tc1.a(context2, obtainStyledAttributes, i7);
                    if (a3 != null) {
                        this.j1 = v(this.j1.getDefaultColor(), a3.getColorForState(new int[]{16842913}, a3.getDefaultColor()));
                    }
                } finally {
                }
            }
            int i10 = C7025iN1.o.dd;
            if (k3.hasValue(i10)) {
                this.j1 = C4297Tc1.a(context2, k3, i10);
            }
            int i11 = C7025iN1.o.bd;
            if (k3.hasValue(i11)) {
                this.j1 = v(this.j1.getDefaultColor(), k3.getColor(i11, 0));
            }
            this.k1 = C4297Tc1.a(context2, k3, C7025iN1.o.Hc);
            this.o1 = C10920yI2.t(k3.getInt(C7025iN1.o.Ic, -1), null);
            this.l1 = C4297Tc1.a(context2, k3, C7025iN1.o.Zc);
            this.z1 = k3.getInt(C7025iN1.o.Kc, 300);
            this.I1 = C9811tl1.g(context2, C7025iN1.c.motionEasingEmphasizedInterpolator, C5600ca.b);
            this.u1 = k3.getDimensionPixelSize(C7025iN1.o.Sc, -1);
            this.v1 = k3.getDimensionPixelSize(C7025iN1.o.Rc, -1);
            this.s1 = k3.getResourceId(C7025iN1.o.Ec, 0);
            this.x1 = k3.getDimensionPixelSize(C7025iN1.o.Fc, 0);
            this.B1 = k3.getInt(C7025iN1.o.Tc, 1);
            this.y1 = k3.getInt(C7025iN1.o.Gc, 0);
            this.C1 = k3.getBoolean(C7025iN1.o.Qc, false);
            this.G1 = k3.getBoolean(C7025iN1.o.ed, false);
            k3.recycle();
            Resources resources = getResources();
            this.r1 = resources.getDimensionPixelSize(C7025iN1.f.design_tab_text_size_2line);
            this.w1 = resources.getDimensionPixelSize(C7025iN1.f.design_tab_scrollable_min_width);
            r();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        o(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        o(view);
    }

    public void setSelectedTabIndicator(@K60 int i3) {
        if (i3 != 0) {
            setSelectedTabIndicator(C3220Ic.b(getContext(), i3));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
