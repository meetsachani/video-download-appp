package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import o.AbstractC11027yl;
import o.C10122v20;
import o.C6597gd1;
import o.C7025iN1;
import o.C7310ja;
import o.C7608kn2;
import o.C9076ql1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC6826ha;
import o.O22;

/* loaded from: classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final int k2 = 0;
    public static final int l2 = 1;
    public static final int m2 = 2;
    public static final int n2 = 0;
    public static final int o2 = 1;
    public static final int p2 = 2;
    public static final int q2 = 3;
    public static final int r2 = 0;
    public static final int s2 = 1;
    public static final int t2 = 2;
    public int R1;
    public boolean S1;
    public final C7310ja T1;
    @InterfaceC5670cr1
    public final com.google.android.material.floatingactionbutton.b U1;
    @InterfaceC5670cr1
    public final com.google.android.material.floatingactionbutton.b V1;
    public final com.google.android.material.floatingactionbutton.b W1;
    public final com.google.android.material.floatingactionbutton.b X1;
    public final int Y1;
    public int Z1;
    public int a2;
    @InterfaceC5670cr1
    public final CoordinatorLayout.c<ExtendedFloatingActionButton> b2;
    public boolean c2;
    public boolean d2;
    public boolean e2;
    @InterfaceC5670cr1
    public ColorStateList f2;
    public int g2;
    public int h2;
    public final int i2;
    public static final int j2 = C7025iN1.n.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;
    public static final Property<View, Float> u2 = new f(Float.class, "width");
    public static final Property<View, Float> v2 = new g(Float.class, "height");
    public static final Property<View, Float> w2 = new h(Float.class, "paddingStart");
    public static final Property<View, Float> x2 = new i(Float.class, "paddingEnd");

    /* loaded from: classes3.dex */
    public class a implements n {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int b() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements n {
        public b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.a2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int b() {
            return ExtendedFloatingActionButton.this.Z1;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return ((ExtendedFloatingActionButton.this.getMeasuredWidth() - ExtendedFloatingActionButton.this.getPaddingStart()) - ExtendedFloatingActionButton.this.getPaddingEnd()) + ExtendedFloatingActionButton.this.Z1 + ExtendedFloatingActionButton.this.a2;
        }
    }

    /* loaded from: classes3.dex */
    public class c implements n {
        public final /* synthetic */ n a;

        public c(n nVar) {
            this.a = nVar;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.a2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int b() {
            return ExtendedFloatingActionButton.this.Z1;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            int i;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (ExtendedFloatingActionButton.this.h2 == -1) {
                if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                    return this.a.getHeight();
                }
                View view = (View) ExtendedFloatingActionButton.this.getParent();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.height == -2) {
                    return this.a.getHeight();
                }
                int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
                if ((ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) != null) {
                    i = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    i = 0;
                }
                return (view.getHeight() - i) - paddingTop;
            } else if (ExtendedFloatingActionButton.this.h2 != 0 && ExtendedFloatingActionButton.this.h2 != -2) {
                return ExtendedFloatingActionButton.this.h2;
            } else {
                return this.a.getHeight();
            }
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams getLayoutParams() {
            int i;
            if (ExtendedFloatingActionButton.this.h2 != 0) {
                i = ExtendedFloatingActionButton.this.h2;
            } else {
                i = -2;
            }
            return new ViewGroup.LayoutParams(-1, i);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            int i;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.a.getWidth();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.width == -2) {
                return this.a.getWidth();
            }
            int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
            if ((ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) != null) {
                i = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            } else {
                i = 0;
            }
            return (view.getWidth() - i) - paddingLeft;
        }
    }

    /* loaded from: classes3.dex */
    public class d implements n {
        public final /* synthetic */ n a;
        public final /* synthetic */ n b;

        public d(n nVar, n nVar2) {
            this.a = nVar;
            this.b = nVar2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int a() {
            return ExtendedFloatingActionButton.this.a2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int b() {
            return ExtendedFloatingActionButton.this.Z1;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            if (ExtendedFloatingActionButton.this.h2 == -1) {
                return this.a.getHeight();
            }
            if (ExtendedFloatingActionButton.this.h2 != 0 && ExtendedFloatingActionButton.this.h2 != -2) {
                return ExtendedFloatingActionButton.this.h2;
            }
            return this.b.getHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams getLayoutParams() {
            int i;
            int i2 = -2;
            if (ExtendedFloatingActionButton.this.g2 != 0) {
                i = ExtendedFloatingActionButton.this.g2;
            } else {
                i = -2;
            }
            if (ExtendedFloatingActionButton.this.h2 != 0) {
                i2 = ExtendedFloatingActionButton.this.h2;
            }
            return new ViewGroup.LayoutParams(i, i2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            if (ExtendedFloatingActionButton.this.g2 == -1) {
                return this.a.getWidth();
            }
            if (ExtendedFloatingActionButton.this.g2 != 0 && ExtendedFloatingActionButton.this.g2 != -2) {
                return ExtendedFloatingActionButton.this.g2;
            }
            return this.b.getWidth();
        }
    }

    /* loaded from: classes3.dex */
    public class e extends AnimatorListenerAdapter {
        public boolean a;
        public final /* synthetic */ com.google.android.material.floatingactionbutton.b b;
        public final /* synthetic */ l c;

        public e(com.google.android.material.floatingactionbutton.b bVar, l lVar) {
            this.b = bVar;
            this.c = lVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
            this.b.g();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.a();
            if (!this.a) {
                this.b.m(this.c);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.b.onAnimationStart(animator);
            this.a = false;
        }
    }

    /* loaded from: classes3.dex */
    public class f extends Property<View, Float> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @InterfaceC5670cr1
        /* renamed from: a */
        public Float get(@InterfaceC5670cr1 View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    public class g extends Property<View, Float> {
        public g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @InterfaceC5670cr1
        /* renamed from: a */
        public Float get(@InterfaceC5670cr1 View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    public class h extends Property<View, Float> {
        public h(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @InterfaceC5670cr1
        /* renamed from: a */
        public Float get(@InterfaceC5670cr1 View view) {
            return Float.valueOf(view.getPaddingStart());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 Float f) {
            view.setPaddingRelative(f.intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    /* loaded from: classes3.dex */
    public class i extends Property<View, Float> {
        public i(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @InterfaceC5670cr1
        /* renamed from: a */
        public Float get(@InterfaceC5670cr1 View view) {
            return Float.valueOf(view.getPaddingEnd());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 Float f) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* loaded from: classes3.dex */
    public class j extends AbstractC11027yl {
        public final n g;
        public final boolean h;

        public j(C7310ja c7310ja, n nVar, boolean z) {
            super(ExtendedFloatingActionButton.this, c7310ja);
            this.g = nVar;
            this.h = z;
        }

        @Override // o.AbstractC11027yl, com.google.android.material.floatingactionbutton.b
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.d2 = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.g.getLayoutParams().width;
            layoutParams.height = this.g.getLayoutParams().height;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void c() {
            ExtendedFloatingActionButton.this.c2 = this.h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.h) {
                ExtendedFloatingActionButton.this.g2 = layoutParams.width;
                ExtendedFloatingActionButton.this.h2 = layoutParams.height;
            }
            layoutParams.width = this.g.getLayoutParams().width;
            layoutParams.height = this.g.getLayoutParams().height;
            if (this.h) {
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                extendedFloatingActionButton.k0(extendedFloatingActionButton.f2);
            } else if (ExtendedFloatingActionButton.this.getText() != null && ExtendedFloatingActionButton.this.getText() != "") {
                ExtendedFloatingActionButton.this.k0(ColorStateList.valueOf(0));
            }
            ExtendedFloatingActionButton.this.setPaddingRelative(this.g.b(), ExtendedFloatingActionButton.this.getPaddingTop(), this.g.a(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public boolean e() {
            if (this.h != ExtendedFloatingActionButton.this.c2 && ExtendedFloatingActionButton.this.getIcon() != null && !TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText())) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public int h() {
            if (this.h) {
                return C7025iN1.b.mtrl_extended_fab_change_size_expand_motion_spec;
            }
            return C7025iN1.b.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // o.AbstractC11027yl, com.google.android.material.floatingactionbutton.b
        @InterfaceC5670cr1
        public AnimatorSet k() {
            float f;
            C9076ql1 b = b();
            if (b.j("width")) {
                PropertyValuesHolder[] g = b.g("width");
                g[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.g.getWidth());
                b.l("width", g);
            }
            if (b.j("height")) {
                PropertyValuesHolder[] g2 = b.g("height");
                g2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.g.getHeight());
                b.l("height", g2);
            }
            if (b.j("paddingStart")) {
                PropertyValuesHolder[] g3 = b.g("paddingStart");
                g3[0].setFloatValues(ExtendedFloatingActionButton.this.getPaddingStart(), this.g.b());
                b.l("paddingStart", g3);
            }
            if (b.j("paddingEnd")) {
                PropertyValuesHolder[] g4 = b.g("paddingEnd");
                g4[0].setFloatValues(ExtendedFloatingActionButton.this.getPaddingEnd(), this.g.a());
                b.l("paddingEnd", g4);
            }
            if (b.j("labelOpacity")) {
                PropertyValuesHolder[] g5 = b.g("labelOpacity");
                boolean z = this.h;
                float f2 = 1.0f;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                if (!z) {
                    f2 = 0.0f;
                }
                g5[0].setFloatValues(f, f2);
                b.l("labelOpacity", g5);
            }
            return super.o(b);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void m(@InterfaceC11300zs1 l lVar) {
            if (lVar == null) {
                return;
            }
            if (this.h) {
                lVar.a(ExtendedFloatingActionButton.this);
            } else {
                lVar.d(ExtendedFloatingActionButton.this);
            }
        }

        @Override // o.AbstractC11027yl, com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.c2 = this.h;
            ExtendedFloatingActionButton.this.d2 = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* loaded from: classes3.dex */
    public class k extends AbstractC11027yl {
        public boolean g;

        public k(C7310ja c7310ja) {
            super(ExtendedFloatingActionButton.this, c7310ja);
        }

        @Override // o.AbstractC11027yl, com.google.android.material.floatingactionbutton.b
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.R1 = 0;
            if (!this.g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void c() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public boolean e() {
            return ExtendedFloatingActionButton.this.X();
        }

        @Override // o.AbstractC11027yl, com.google.android.material.floatingactionbutton.b
        public void g() {
            super.g();
            this.g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public int h() {
            return C7025iN1.b.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void m(@InterfaceC11300zs1 l lVar) {
            if (lVar != null) {
                lVar.b(ExtendedFloatingActionButton.this);
            }
        }

        @Override // o.AbstractC11027yl, com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.R1 = 1;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class l {
        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    /* loaded from: classes3.dex */
    public class m extends AbstractC11027yl {
        public m(C7310ja c7310ja) {
            super(ExtendedFloatingActionButton.this, c7310ja);
        }

        @Override // o.AbstractC11027yl, com.google.android.material.floatingactionbutton.b
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.R1 = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void c() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public boolean e() {
            return ExtendedFloatingActionButton.this.Y();
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public int h() {
            return C7025iN1.b.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.b
        public void m(@InterfaceC11300zs1 l lVar) {
            if (lVar != null) {
                lVar.c(ExtendedFloatingActionButton.this);
            }
        }

        @Override // o.AbstractC11027yl, com.google.android.material.floatingactionbutton.b
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.R1 = 2;
        }
    }

    /* loaded from: classes3.dex */
    public interface n {
        int a();

        int b();

        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean X() {
        if (getVisibility() == 0) {
            if (this.R1 != 1) {
                return false;
            }
            return true;
        } else if (this.R1 == 2) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y() {
        if (getVisibility() != 0) {
            if (this.R1 != 2) {
                return false;
            }
            return true;
        } else if (this.R1 == 1) {
            return false;
        } else {
            return true;
        }
    }

    public void M(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        this.V1.i(animatorListener);
    }

    public void N(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        this.X1.i(animatorListener);
    }

    public void O(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        this.W1.i(animatorListener);
    }

    public void P(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        this.U1.i(animatorListener);
    }

    public void Q() {
        Z(3, null);
    }

    public void R(@InterfaceC5670cr1 l lVar) {
        Z(3, lVar);
    }

    public final n S(int i2) {
        b bVar = new b();
        c cVar = new c(bVar);
        d dVar = new d(cVar, bVar);
        if (i2 != 1) {
            if (i2 != 2) {
                return dVar;
            }
            return cVar;
        }
        return bVar;
    }

    public void T() {
        Z(1, null);
    }

    public void U(@InterfaceC5670cr1 l lVar) {
        Z(1, lVar);
    }

    public boolean V() {
        return this.S1;
    }

    public final boolean W() {
        return this.c2;
    }

    public final void Z(int i2, @InterfaceC11300zs1 l lVar) {
        com.google.android.material.floatingactionbutton.b bVar;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        bVar = this.V1;
                    } else {
                        throw new IllegalStateException("Unknown strategy type: " + i2);
                    }
                } else {
                    bVar = this.U1;
                }
            } else {
                bVar = this.X1;
            }
        } else {
            bVar = this.W1;
        }
        if (bVar.e()) {
            return;
        }
        if (!f0()) {
            bVar.c();
            bVar.m(lVar);
            return;
        }
        if (i2 == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.g2 = layoutParams.width;
                this.h2 = layoutParams.height;
            } else {
                this.g2 = getWidth();
                this.h2 = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet k3 = bVar.k();
        k3.addListener(new e(bVar, lVar));
        for (Animator.AnimatorListener animatorListener : bVar.l()) {
            k3.addListener(animatorListener);
        }
        k3.start();
    }

    public void a0(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        this.V1.f(animatorListener);
    }

    public void b0(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        this.X1.f(animatorListener);
    }

    public void c0(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        this.W1.f(animatorListener);
    }

    public void d0(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener) {
        this.U1.f(animatorListener);
    }

    public final void e0() {
        this.f2 = getTextColors();
    }

    public final boolean f0() {
        if (this.S1) {
            if ((isLaidOut() || (!Y() && this.e2)) && !isInEditMode()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void g0() {
        Z(0, null);
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return FloatingActionButton.p1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @InterfaceC5670cr1
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.b2;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @InterfaceC5056aJ2
    public int getCollapsedSize() {
        int i2 = this.Y1;
        if (i2 < 0) {
            return (Math.min(getPaddingStart(), getPaddingEnd()) * 2) + getIconSize();
        }
        return i2;
    }

    @InterfaceC11300zs1
    public C9076ql1 getExtendMotionSpec() {
        return this.V1.d();
    }

    @InterfaceC11300zs1
    public C9076ql1 getHideMotionSpec() {
        return this.X1.d();
    }

    @InterfaceC11300zs1
    public C9076ql1 getShowMotionSpec() {
        return this.W1.d();
    }

    @InterfaceC11300zs1
    public C9076ql1 getShrinkMotionSpec() {
        return this.U1.d();
    }

    public void h0(@InterfaceC5670cr1 l lVar) {
        Z(0, lVar);
    }

    public void i0() {
        Z(2, null);
    }

    public void j0(@InterfaceC5670cr1 l lVar) {
        Z(2, lVar);
    }

    public void k0(@InterfaceC5670cr1 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c2 && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.c2 = false;
            this.U1.c();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.e2 = z;
    }

    public void setAnimationEnabled(boolean z) {
        this.S1 = z;
    }

    public void setExtendMotionSpec(@InterfaceC11300zs1 C9076ql1 c9076ql1) {
        this.V1.j(c9076ql1);
    }

    public void setExtendMotionSpecResource(@InterfaceC6826ha int i2) {
        setExtendMotionSpec(C9076ql1.d(getContext(), i2));
    }

    public void setExtended(boolean z) {
        com.google.android.material.floatingactionbutton.b bVar;
        if (this.c2 != z) {
            if (z) {
                bVar = this.V1;
            } else {
                bVar = this.U1;
            }
            if (bVar.e()) {
                return;
            }
            bVar.c();
        }
    }

    public void setHideMotionSpec(@InterfaceC11300zs1 C9076ql1 c9076ql1) {
        this.X1.j(c9076ql1);
    }

    public void setHideMotionSpecResource(@InterfaceC6826ha int i2) {
        setHideMotionSpec(C9076ql1.d(getContext(), i2));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
        if (this.c2 && !this.d2) {
            this.Z1 = getPaddingStart();
            this.a2 = getPaddingEnd();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
        if (this.c2 && !this.d2) {
            this.Z1 = i2;
            this.a2 = i4;
        }
    }

    public void setShowMotionSpec(@InterfaceC11300zs1 C9076ql1 c9076ql1) {
        this.W1.j(c9076ql1);
    }

    public void setShowMotionSpecResource(@InterfaceC6826ha int i2) {
        setShowMotionSpec(C9076ql1.d(getContext(), i2));
    }

    public void setShrinkMotionSpec(@InterfaceC11300zs1 C9076ql1 c9076ql1) {
        this.U1.j(c9076ql1);
    }

    public void setShrinkMotionSpecResource(@InterfaceC6826ha int i2) {
        setShrinkMotionSpec(C9076ql1.d(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
        super.setTextColor(i2);
        e0();
    }

    public ExtendedFloatingActionButton(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.extendedFloatingActionButtonStyle);
    }

    /* loaded from: classes3.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        public static final boolean a1 = false;
        public static final boolean b1 = true;
        public Rect X;
        @InterfaceC11300zs1
        public l Y;
        public boolean Y0;
        @InterfaceC11300zs1
        public l Z;
        public boolean Z0;

        public ExtendedFloatingActionButtonBehavior() {
            this.Y0 = false;
            this.Z0 = true;
        }

        public static boolean R(@InterfaceC5670cr1 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                return ((CoordinatorLayout.g) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        public void N(@InterfaceC5670cr1 ExtendedFloatingActionButton extendedFloatingActionButton) {
            l lVar;
            int i;
            boolean z = this.Z0;
            if (z) {
                lVar = this.Z;
            } else {
                lVar = this.Y;
            }
            if (z) {
                i = 3;
            } else {
                i = 0;
            }
            extendedFloatingActionButton.Z(i, lVar);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: O */
        public boolean i(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 ExtendedFloatingActionButton extendedFloatingActionButton, @InterfaceC5670cr1 Rect rect) {
            return super.i(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean P() {
            return this.Y0;
        }

        public boolean Q() {
            return this.Z0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: S */
        public boolean p(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a0(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (R(view)) {
                b0(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: T */
        public boolean t(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> w = coordinatorLayout.w(extendedFloatingActionButton);
            int size = w.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = w.get(i2);
                if (view instanceof AppBarLayout) {
                    if (a0(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (R(view) && b0(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.N(extendedFloatingActionButton, i);
            return true;
        }

        public void U(boolean z) {
            this.Y0 = z;
        }

        public void V(boolean z) {
            this.Z0 = z;
        }

        @InterfaceC5056aJ2
        public void W(@InterfaceC11300zs1 l lVar) {
            this.Y = lVar;
        }

        @InterfaceC5056aJ2
        public void X(@InterfaceC11300zs1 l lVar) {
            this.Z = lVar;
        }

        public final boolean Y(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams();
            if ((!this.Y0 && !this.Z0) || gVar.e() != view.getId()) {
                return false;
            }
            return true;
        }

        public void Z(@InterfaceC5670cr1 ExtendedFloatingActionButton extendedFloatingActionButton) {
            l lVar;
            int i;
            boolean z = this.Z0;
            if (z) {
                lVar = this.Z;
            } else {
                lVar = this.Y;
            }
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            extendedFloatingActionButton.Z(i, lVar);
        }

        public final boolean a0(CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 AppBarLayout appBarLayout, @InterfaceC5670cr1 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!Y(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.X == null) {
                this.X = new Rect();
            }
            Rect rect = this.X;
            C10122v20.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                Z(extendedFloatingActionButton);
                return true;
            }
            N(extendedFloatingActionButton);
            return true;
        }

        public final boolean b0(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!Y(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                Z(extendedFloatingActionButton);
                return true;
            }
            N(extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void o(@InterfaceC5670cr1 CoordinatorLayout.g gVar) {
            if (gVar.h == 0) {
                gVar.h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.G3);
            this.Y0 = obtainStyledAttributes.getBoolean(C7025iN1.o.H3, false);
            this.Z0 = obtainStyledAttributes.getBoolean(C7025iN1.o.I3, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExtendedFloatingActionButton(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i2) {
        super(C6597gd1.d(context, attributeSet, i2, r5), attributeSet, i2);
        int i3 = j2;
        this.R1 = 0;
        this.S1 = true;
        C7310ja c7310ja = new C7310ja();
        this.T1 = c7310ja;
        m mVar = new m(c7310ja);
        this.W1 = mVar;
        k kVar = new k(c7310ja);
        this.X1 = kVar;
        this.c2 = true;
        this.d2 = false;
        this.e2 = false;
        Context context2 = getContext();
        this.b2 = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray k3 = C7608kn2.k(context2, attributeSet, C7025iN1.o.y3, i2, i3, new int[0]);
        C9076ql1 c2 = C9076ql1.c(context2, k3, C7025iN1.o.E3);
        C9076ql1 c3 = C9076ql1.c(context2, k3, C7025iN1.o.D3);
        C9076ql1 c4 = C9076ql1.c(context2, k3, C7025iN1.o.B3);
        C9076ql1 c5 = C9076ql1.c(context2, k3, C7025iN1.o.F3);
        this.Y1 = k3.getDimensionPixelSize(C7025iN1.o.z3, -1);
        int i4 = k3.getInt(C7025iN1.o.C3, 1);
        this.i2 = i4;
        this.Z1 = getPaddingStart();
        this.a2 = getPaddingEnd();
        C7310ja c7310ja2 = new C7310ja();
        j jVar = new j(c7310ja2, S(i4), true);
        this.V1 = jVar;
        j jVar2 = new j(c7310ja2, new a(), false);
        this.U1 = jVar2;
        mVar.j(c2);
        kVar.j(c3);
        jVar.j(c4);
        jVar2.j(c5);
        k3.recycle();
        setShapeAppearanceModel(O22.g(context2, attributeSet, i2, i3, O22.n).m());
        e0();
    }

    @Override // android.widget.TextView
    public void setTextColor(@InterfaceC5670cr1 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        e0();
    }
}
