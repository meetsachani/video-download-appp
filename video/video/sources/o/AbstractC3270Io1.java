package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.BaselineLayout;
import o.C10861y4;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Io1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3270Io1 extends FrameLayout implements InterfaceC3564Lo1 {
    public static final int e2 = -1;
    public static final int[] f2 = {16842912};
    public static final c g2 = new c(null);
    public static final c h2 = new d(null);
    @InterfaceC4698Xf2
    public int A1;
    @InterfaceC4698Xf2
    public int B1;
    @InterfaceC4698Xf2
    public int C1;
    @InterfaceC4698Xf2
    public int D1;
    @InterfaceC11300zs1
    public ColorStateList E1;
    public boolean F1;
    @InterfaceC11300zs1
    public androidx.appcompat.view.menu.h G1;
    @InterfaceC11300zs1
    public ColorStateList H1;
    @InterfaceC11300zs1
    public Drawable I1;
    @InterfaceC11300zs1
    public Drawable J1;
    public ValueAnimator K1;
    public c L1;
    public float M1;
    public boolean N1;
    public int O1;
    public int P1;
    public int Q1;
    public int R1;
    public boolean S1;
    public int T1;
    public int U1;
    @InterfaceC11300zs1
    public C2555Bk V1;
    public int W1;
    public int X1;
    public boolean Y0;
    public int Y1;
    public ColorStateList Z0;
    public boolean Z1;
    @InterfaceC11300zs1
    public Drawable a1;
    public boolean a2;
    public int b1;
    public boolean b2;
    public int c1;
    public boolean c2;
    public int d1;
    public Rect d2;
    public int e1;
    public float f1;
    public float g1;
    public float h1;
    public float i1;
    public float j1;
    public float k1;
    public int l1;
    public boolean m1;
    @InterfaceC5670cr1
    public final LinearLayout n1;
    @InterfaceC5670cr1
    public final LinearLayout o1;
    @InterfaceC5670cr1
    public final View p1;
    @InterfaceC5670cr1
    public final FrameLayout q1;
    public final ImageView r1;
    public final BaselineLayout s1;
    public final TextView t1;
    public final TextView u1;
    public BaselineLayout v1;
    public TextView w1;
    public TextView x1;
    public BaselineLayout y1;
    public int z1;

    /* renamed from: o.Io1$a */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ int X;

        public a(int i) {
            this.X = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3270Io1.this.E(this.X);
        }
    }

    /* renamed from: o.Io1$b */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ float a;

        public b(float f) {
            this.a = f;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC3270Io1.this.t(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.a);
        }
    }

    /* renamed from: o.Io1$c */
    /* loaded from: classes3.dex */
    public static class c {
        public static final float a = 0.4f;
        public static final float b = 1.0f;
        public static final float c = 0.2f;

        public c() {
        }

        public float a(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2) {
            float f3;
            float f4;
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i == 0) {
                f3 = 0.8f;
            } else {
                f3 = 0.0f;
            }
            if (i == 0) {
                f4 = 1.0f;
            } else {
                f4 = 0.2f;
            }
            return C5600ca.b(0.0f, 1.0f, f3, f4, f);
        }

        public float b(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
            return C5600ca.a(0.4f, 1.0f, f);
        }

        public float c(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
            return 1.0f;
        }

        public void d(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2, @InterfaceC5670cr1 View view) {
            view.setScaleX(b(f));
            view.setScaleY(c(f));
            view.setAlpha(a(f, f2));
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* renamed from: o.Io1$d */
    /* loaded from: classes3.dex */
    public static class d extends c {
        public d() {
            super(null);
        }

        @Override // o.AbstractC3270Io1.c
        public float c(float f) {
            return b(f);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public AbstractC3270Io1(@InterfaceC5670cr1 Context context) {
        super(context);
        this.Y0 = false;
        this.z1 = -1;
        this.A1 = 0;
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = 0;
        this.F1 = false;
        this.L1 = g2;
        this.M1 = 0.0f;
        this.N1 = false;
        this.O1 = 0;
        this.P1 = 0;
        this.Q1 = -2;
        this.R1 = 0;
        this.S1 = false;
        this.T1 = 0;
        this.U1 = 0;
        this.X1 = 0;
        this.Y1 = 49;
        this.Z1 = false;
        this.a2 = false;
        this.b2 = false;
        this.c2 = false;
        this.d2 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.n1 = (LinearLayout) findViewById(C7025iN1.h.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(C7025iN1.h.navigation_bar_item_inner_content_container);
        this.o1 = linearLayout;
        this.p1 = findViewById(C7025iN1.h.navigation_bar_item_active_indicator_view);
        this.q1 = (FrameLayout) findViewById(C7025iN1.h.navigation_bar_item_icon_container);
        this.r1 = (ImageView) findViewById(C7025iN1.h.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(C7025iN1.h.navigation_bar_item_labels_group);
        this.s1 = baselineLayout;
        TextView textView = (TextView) findViewById(C7025iN1.h.navigation_bar_item_small_label_view);
        this.t1 = textView;
        TextView textView2 = (TextView) findViewById(C7025iN1.h.navigation_bar_item_large_label_view);
        this.u1 = textView2;
        k();
        this.y1 = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.b1 = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.c1 = baselineLayout.getPaddingBottom();
        this.d1 = 0;
        this.e1 = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.w1.setImportantForAccessibility(2);
        this.x1.setImportantForAccessibility(2);
        setFocusable(true);
        f();
        this.R1 = getResources().getDimensionPixelSize(C7025iN1.f.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.Ho1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                AbstractC3270Io1.b(AbstractC3270Io1.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    public static void A(@InterfaceC5670cr1 View view, float f, float f3, int i) {
        view.setScaleX(f);
        view.setScaleY(f3);
        view.setVisibility(i);
    }

    public static void K(@InterfaceC5670cr1 View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private void L() {
        int i;
        androidx.appcompat.view.menu.h hVar = this.G1;
        if (hVar != null) {
            if (hVar.isVisible() && (this.Z1 || !this.a2)) {
                i = 0;
            } else {
                i = 8;
            }
            setVisibility(i);
        }
    }

    public static /* synthetic */ void b(AbstractC3270Io1 abstractC3270Io1, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        if (abstractC3270Io1.r1.getVisibility() == 0) {
            abstractC3270Io1.D(abstractC3270Io1.r1);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) abstractC3270Io1.o1.getLayoutParams();
        int i9 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
        int i10 = (i4 - i2) + layoutParams.topMargin + layoutParams.bottomMargin;
        boolean z2 = true;
        if (abstractC3270Io1.W1 == 1 && abstractC3270Io1.Q1 == -2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) abstractC3270Io1.p1.getLayoutParams();
            if (abstractC3270Io1.Q1 == -2 && abstractC3270Io1.p1.getMeasuredWidth() != i9) {
                layoutParams2.width = Math.max(i9, Math.min(abstractC3270Io1.O1, abstractC3270Io1.getMeasuredWidth() - (abstractC3270Io1.T1 * 2)));
                z = true;
            } else {
                z = false;
            }
            if (abstractC3270Io1.p1.getMeasuredHeight() < i10) {
                layoutParams2.height = i10;
            } else {
                z2 = z;
            }
            if (z2) {
                abstractC3270Io1.p1.setLayoutParams(layoutParams2);
            }
        }
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof AbstractC3270Io1) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconWidth() {
        int minimumWidth;
        C2555Bk c2555Bk = this.V1;
        if (c2555Bk == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = c2555Bk.getMinimumWidth() - this.V1.v();
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.q1.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.r1.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    public static Drawable i(@InterfaceC5670cr1 ColorStateList colorStateList) {
        return new RippleDrawable(QU1.a(colorStateList), null, null);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    public static void y(TextView textView, @InterfaceC4698Xf2 int i) {
        C4930Zm2.D(textView, i);
        int j = C4297Tc1.j(textView.getContext(), i, 0);
        if (j != 0) {
            textView.setTextSize(0, j);
        }
    }

    public static void z(@InterfaceC5670cr1 View view, int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    public final void B(@InterfaceC11300zs1 View view) {
        if (j() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C2849Ek.d(this.V1, view);
        }
    }

    public final void C(@InterfaceC11300zs1 View view) {
        if (!j()) {
            return;
        }
        if (view != null) {
            setClipChildren(true);
            setClipToPadding(true);
            C2849Ek.k(this.V1, view);
        }
        this.V1 = null;
    }

    public final void D(View view) {
        if (!j()) {
            return;
        }
        C2849Ek.o(this.V1, view, null);
    }

    public void E(int i) {
        if (i <= 0 && getVisibility() == 0) {
            return;
        }
        int min = Math.min(this.O1, i - (this.T1 * 2));
        int i2 = this.P1;
        if (this.W1 == 1) {
            int i3 = i - (this.U1 * 2);
            int i4 = this.Q1;
            if (i4 != -1) {
                if (i4 == -2) {
                    i3 = this.n1.getMeasuredWidth();
                } else {
                    i3 = Math.min(i4, i3);
                }
            }
            min = i3;
            i2 = Math.max(this.R1, this.o1.getMeasuredHeight());
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.p1.getLayoutParams();
        if (l()) {
            i2 = min;
        }
        layoutParams.height = i2;
        layoutParams.width = Math.max(0, min);
        this.p1.setLayoutParams(layoutParams);
    }

    public final void F() {
        if (l()) {
            this.L1 = h2;
        } else {
            this.L1 = g2;
        }
    }

    public final void G() {
        TextView textView = this.u1;
        textView.setTypeface(textView.getTypeface(), this.F1 ? 1 : 0);
        TextView textView2 = this.x1;
        textView2.setTypeface(textView2.getTypeface(), this.F1 ? 1 : 0);
    }

    public final void H(@InterfaceC11300zs1 TextView textView, @InterfaceC4698Xf2 int i) {
        if (textView == null) {
            return;
        }
        x(textView, i);
        f();
        textView.setMinimumHeight(C4297Tc1.i(textView.getContext(), i, 0));
        ColorStateList colorStateList = this.E1;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        G();
    }

    public final void I(@InterfaceC11300zs1 TextView textView, @InterfaceC4698Xf2 int i) {
        if (textView != null) {
            x(textView, i);
            f();
            textView.setMinimumHeight(C4297Tc1.i(textView.getContext(), i, 0));
            ColorStateList colorStateList = this.E1;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public final void J() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.X1 = 0;
        this.y1 = this.s1;
        int i7 = 8;
        if (this.W1 == 1) {
            if (this.v1.getParent() == null) {
                e();
            }
            Rect rect = this.d2;
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = rect.top;
            i = rect.bottom;
            this.X1 = 1;
            int i11 = this.U1;
            this.y1 = this.v1;
            i5 = i10;
            i4 = i9;
            i3 = i8;
            i2 = i11;
            i6 = 0;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 8;
            i7 = 0;
        }
        this.s1.setVisibility(i7);
        this.v1.setVisibility(i6);
        ((FrameLayout.LayoutParams) this.n1.getLayoutParams()).gravity = this.Y1;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.o1.getLayoutParams();
        layoutParams.leftMargin = i3;
        layoutParams.rightMargin = i4;
        layoutParams.topMargin = i5;
        layoutParams.bottomMargin = i;
        setPadding(i2, 0, i2, 0);
        E(getWidth());
    }

    @Override // o.InterfaceC3564Lo1
    public boolean a() {
        return this.Z1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.N1) {
            this.q1.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.o1.addView(this.v1, layoutParams);
        u();
    }

    public final void f() {
        float textSize = this.t1.getTextSize();
        float textSize2 = this.u1.getTextSize();
        this.f1 = textSize - textSize2;
        this.g1 = (textSize2 * 1.0f) / textSize;
        this.h1 = (textSize * 1.0f) / textSize2;
        float textSize3 = this.w1.getTextSize();
        float textSize4 = this.x1.getTextSize();
        this.i1 = textSize3 - textSize4;
        this.j1 = (textSize4 * 1.0f) / textSize3;
        this.k1 = (textSize3 * 1.0f) / textSize4;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void g(@InterfaceC5670cr1 androidx.appcompat.view.menu.h hVar, int i) {
        CharSequence title;
        this.G1 = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitle());
        setId(hVar.getItemId());
        if (!TextUtils.isEmpty(hVar.getContentDescription())) {
            setContentDescription(hVar.getContentDescription());
        }
        if (!TextUtils.isEmpty(hVar.getTooltipText())) {
            title = hVar.getTooltipText();
        } else {
            title = hVar.getTitle();
        }
        C9097qq2.a(this, title);
        L();
        this.Y0 = true;
    }

    @InterfaceC11300zs1
    public Drawable getActiveIndicatorDrawable() {
        return this.p1.getBackground();
    }

    @InterfaceC11300zs1
    public C2555Bk getBadge() {
        return this.V1;
    }

    @InterfaceC5670cr1
    public BaselineLayout getExpandedLabelGroup() {
        return this.v1;
    }

    @K60
    public int getItemBackgroundResId() {
        return C7025iN1.g.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.k.a
    @InterfaceC11300zs1
    public androidx.appcompat.view.menu.h getItemData() {
        return this.G1;
    }

    @InterfaceC9154r30
    public int getItemDefaultMarginResId() {
        return C7025iN1.f.mtrl_navigation_bar_item_default_margin;
    }

    @BY0
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.z1;
    }

    @InterfaceC5670cr1
    public BaselineLayout getLabelGroup() {
        return this.s1;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.n1.getLayoutParams();
        return this.n1.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.W1 == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.o1.getLayoutParams();
            return this.o1.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.s1.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams2.leftMargin + this.s1.getMeasuredWidth() + layoutParams2.rightMargin);
    }

    public void h() {
        p();
        this.G1 = null;
        this.M1 = 0.0f;
        this.Y0 = false;
    }

    public final boolean j() {
        if (this.V1 != null) {
            return true;
        }
        return false;
    }

    public final void k() {
        float dimension = getResources().getDimension(C7025iN1.f.default_navigation_text_size);
        float dimension2 = getResources().getDimension(C7025iN1.f.default_navigation_active_text_size);
        BaselineLayout baselineLayout = new BaselineLayout(getContext());
        this.v1 = baselineLayout;
        baselineLayout.setVisibility(8);
        this.v1.setDuplicateParentStateEnabled(true);
        this.v1.setMeasurePaddingFromBaseline(this.b2);
        TextView textView = new TextView(getContext());
        this.w1 = textView;
        textView.setMaxLines(1);
        TextView textView2 = this.w1;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.w1.setDuplicateParentStateEnabled(true);
        this.w1.setIncludeFontPadding(false);
        this.w1.setGravity(16);
        this.w1.setTextSize(dimension);
        TextView textView3 = new TextView(getContext());
        this.x1 = textView3;
        textView3.setMaxLines(1);
        this.x1.setEllipsize(truncateAt);
        this.x1.setDuplicateParentStateEnabled(true);
        this.x1.setVisibility(4);
        this.x1.setIncludeFontPadding(false);
        this.x1.setGravity(16);
        this.x1.setTextSize(dimension2);
        this.v1.addView(this.w1);
        this.v1.addView(this.x1);
    }

    public final boolean l() {
        if (this.S1 && this.l1 == 2) {
            return true;
        }
        return false;
    }

    public final void m(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        if (this.N1 && this.Y0 && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.K1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.K1 = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M1, f);
            this.K1 = ofFloat;
            ofFloat.addUpdateListener(new b(f));
            this.K1.setInterpolator(C9811tl1.g(getContext(), C7025iN1.c.motionEasingEmphasizedInterpolator, C5600ca.b));
            this.K1.setDuration(C9811tl1.f(getContext(), C7025iN1.c.motionDurationLong2, getResources().getInteger(C7025iN1.i.material_motion_duration_long_1)));
            this.K1.start();
            return;
        }
        t(f, f);
    }

    public final void n() {
        androidx.appcompat.view.menu.h hVar = this.G1;
        if (hVar != null) {
            setChecked(hVar.isChecked());
        }
    }

    public final void o() {
        Drawable drawable = this.a1;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.Z0 != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.N1 && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable = new RippleDrawable(QU1.e(this.Z0), null, activeIndicatorDrawable);
                z = false;
            } else if (drawable == null) {
                drawable = i(this.Z0);
            }
        }
        this.q1.setPadding(0, 0, 0, 0);
        this.q1.setForeground(rippleDrawable);
        setBackground(drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @InterfaceC5670cr1
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        androidx.appcompat.view.menu.h hVar = this.G1;
        if (hVar != null && hVar.isCheckable() && this.G1.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@InterfaceC5670cr1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C2555Bk c2555Bk = this.V1;
        if (c2555Bk != null && c2555Bk.isVisible()) {
            CharSequence title = this.G1.getTitle();
            if (!TextUtils.isEmpty(this.G1.getContentDescription())) {
                title = this.G1.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + C6566gU0.h + ((Object) this.V1.s()));
        }
        C10861y4 t2 = C10861y4.t2(accessibilityNodeInfo);
        t2.n1(C10861y4.g.j(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            t2.l1(false);
            t2.W0(C10861y4.a.j);
        }
        t2.X1(getResources().getString(C7025iN1.m.item_view_role_description));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new a(i));
    }

    public void p() {
        C(this.r1);
    }

    @Override // o.InterfaceC3564Lo1
    public boolean q() {
        return this.a2;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean r() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean s() {
        return true;
    }

    public void setActiveIndicatorDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.p1.setBackground(drawable);
        o();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        int i;
        this.N1 = z;
        o();
        View view = this.p1;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i) {
        this.R1 = i;
        E(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(@PK1 int i) {
        this.U1 = i;
        if (this.W1 == 1) {
            setPadding(i, 0, i, 0);
        }
        E(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(@InterfaceC5670cr1 Rect rect) {
        this.d2 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i) {
        this.Q1 = i;
        E(getWidth());
    }

    public void setActiveIndicatorHeight(int i) {
        this.P1 = i;
        E(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        int i2;
        if (this.d1 != i) {
            this.d1 = i;
            ((LinearLayout.LayoutParams) this.s1.getLayoutParams()).topMargin = i;
            if (this.v1.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.v1.getLayoutParams();
                if (getLayoutDirection() == 1) {
                    i2 = i;
                } else {
                    i2 = 0;
                }
                layoutParams.rightMargin = i2;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(@PK1 int i) {
        this.T1 = i;
        E(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.S1 = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.O1 = i;
        E(getWidth());
    }

    public void setBadge(@InterfaceC5670cr1 C2555Bk c2555Bk) {
        if (this.V1 != c2555Bk) {
            if (j() && this.r1 != null) {
                Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
                C(this.r1);
            }
            this.V1 = c2555Bk;
            c2555Bk.l0(this.X1);
            ImageView imageView = this.r1;
            if (imageView != null) {
                B(imageView);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setChecked(boolean z) {
        float f;
        setLabelPivots(this.u1);
        setLabelPivots(this.t1);
        setLabelPivots(this.x1);
        setLabelPivots(this.w1);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        m(f);
        TextView textView = this.u1;
        TextView textView2 = this.t1;
        float f3 = this.f1;
        float f4 = this.g1;
        float f5 = this.h1;
        if (this.W1 == 1) {
            textView = this.x1;
            textView2 = this.w1;
            f3 = this.i1;
            f4 = this.j1;
            f5 = this.k1;
        }
        int i = this.l1;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        w();
                    }
                } else if (z) {
                    v(textView, textView2, f4, f3);
                } else {
                    v(textView2, textView, f5, 0.0f);
                }
            } else if (z) {
                v(textView, textView2, f4, 0.0f);
            } else {
                w();
            }
        } else if (this.m1) {
            if (z) {
                v(textView, textView2, f4, 0.0f);
            } else {
                w();
            }
        } else if (z) {
            v(textView, textView2, f4, f3);
        } else {
            v(textView2, textView, f5, 0.0f);
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.k.a
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.t1.setEnabled(z);
        this.u1.setEnabled(z);
        this.w1.setEnabled(z);
        this.x1.setEnabled(z);
        this.r1.setEnabled(z);
    }

    @Override // o.InterfaceC3564Lo1
    public void setExpanded(boolean z) {
        this.Z1 = z;
        L();
    }

    public void setHorizontalTextAppearanceActive(@InterfaceC4698Xf2 int i) {
        this.C1 = i;
        TextView textView = this.x1;
        if (i == 0) {
            i = this.A1;
        }
        H(textView, i);
    }

    public void setHorizontalTextAppearanceInactive(@InterfaceC4698Xf2 int i) {
        this.D1 = i;
        TextView textView = this.w1;
        if (i == 0) {
            i = this.B1;
        }
        I(textView, i);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setIcon(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable == this.I1) {
            return;
        }
        this.I1 = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = D60.r(drawable).mutate();
            this.J1 = drawable;
            ColorStateList colorStateList = this.H1;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.r1.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        if (this.e1 != i) {
            this.e1 = i;
            u();
            requestLayout();
        }
    }

    public void setIconSize(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.r1.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.r1.setLayoutParams(layoutParams);
        u();
    }

    public void setIconTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        Drawable drawable;
        this.H1 = colorStateList;
        if (this.G1 != null && (drawable = this.J1) != null) {
            drawable.setTintList(colorStateList);
            this.J1.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemGravity(int i) {
        this.Y1 = i;
        requestLayout();
    }

    public void setItemIconGravity(int i) {
        if (this.W1 != i) {
            this.W1 = i;
            J();
            o();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.c1 != i) {
            this.c1 = i;
            n();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.b1 != i) {
            this.b1 = i;
            n();
        }
    }

    public void setItemPosition(int i) {
        this.z1 = i;
    }

    public void setItemRippleColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.Z0 = colorStateList;
        o();
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.c2 = z;
        setTextAppearanceActive(this.A1);
        setTextAppearanceInactive(this.B1);
        setHorizontalTextAppearanceActive(this.C1);
        setHorizontalTextAppearanceInactive(this.D1);
    }

    public void setLabelMaxLines(int i) {
        this.t1.setMaxLines(i);
        this.u1.setMaxLines(i);
        this.w1.setMaxLines(i);
        this.x1.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            this.t1.setGravity(17);
            this.u1.setGravity(17);
        } else if (i > 1) {
            this.t1.setEllipsize(null);
            this.u1.setEllipsize(null);
            this.t1.setGravity(17);
            this.u1.setGravity(17);
        } else {
            this.t1.setGravity(16);
            this.u1.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.l1 != i) {
            this.l1 = i;
            F();
            E(getWidth());
            n();
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.b2 = z;
        this.s1.setMeasurePaddingFromBaseline(z);
        this.t1.setIncludeFontPadding(z);
        this.u1.setIncludeFontPadding(z);
        this.v1.setMeasurePaddingFromBaseline(z);
        this.w1.setIncludeFontPadding(z);
        this.x1.setIncludeFontPadding(z);
        requestLayout();
    }

    @Override // o.InterfaceC3564Lo1
    public void setOnlyShowWhenExpanded(boolean z) {
        this.a2 = z;
        L();
    }

    public void setShifting(boolean z) {
        if (this.m1 != z) {
            this.m1 = z;
            n();
        }
    }

    public void setTextAppearanceActive(@InterfaceC4698Xf2 int i) {
        this.A1 = i;
        H(this.u1, i);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        this.F1 = z;
        setTextAppearanceActive(this.A1);
        setHorizontalTextAppearanceActive(this.C1);
        G();
    }

    public void setTextAppearanceInactive(@InterfaceC4698Xf2 int i) {
        this.B1 = i;
        I(this.t1, i);
    }

    public void setTextColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.E1 = colorStateList;
        if (colorStateList != null) {
            this.t1.setTextColor(colorStateList);
            this.u1.setTextColor(colorStateList);
            this.w1.setTextColor(colorStateList);
            this.x1.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setTitle(@InterfaceC11300zs1 CharSequence charSequence) {
        this.t1.setText(charSequence);
        this.u1.setText(charSequence);
        this.w1.setText(charSequence);
        this.x1.setText(charSequence);
        androidx.appcompat.view.menu.h hVar = this.G1;
        if (hVar == null || TextUtils.isEmpty(hVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        androidx.appcompat.view.menu.h hVar2 = this.G1;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.getTooltipText())) {
            charSequence = this.G1.getTooltipText();
        }
        C9097qq2.a(this, charSequence);
    }

    public final void t(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f, float f3) {
        this.L1.d(f, f3, this.p1);
        this.M1 = f;
    }

    public final void u() {
        int i;
        int i2;
        int i3 = 0;
        if (this.r1.getLayoutParams().width > 0) {
            i = this.e1;
        } else {
            i = 0;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.v1.getLayoutParams();
        if (layoutParams != null) {
            if (getLayoutDirection() == 1) {
                i2 = i;
            } else {
                i2 = 0;
            }
            layoutParams.rightMargin = i2;
            if (getLayoutDirection() != 1) {
                i3 = i;
            }
            layoutParams.leftMargin = i3;
        }
    }

    public final void v(View view, View view2, float f, float f3) {
        int i;
        int i2;
        int i3;
        int i4;
        LinearLayout linearLayout = this.n1;
        if (this.W1 == 0) {
            i = (int) (this.b1 + f3);
        } else {
            i = 0;
        }
        z(linearLayout, i, 0, this.Y1);
        LinearLayout linearLayout2 = this.o1;
        int i5 = this.W1;
        if (i5 == 0) {
            i2 = 0;
        } else {
            i2 = this.d2.top;
        }
        if (i5 == 0) {
            i3 = 0;
        } else {
            i3 = this.d2.bottom;
        }
        if (i5 == 0) {
            i4 = 17;
        } else {
            i4 = AbstractC4051Qo1.o1;
        }
        z(linearLayout2, i2, i3, i4);
        K(this.s1, this.c1);
        this.y1.setVisibility(0);
        A(view, 1.0f, 1.0f, 0);
        A(view2, f, f, 4);
    }

    public final void w() {
        int i;
        LinearLayout linearLayout = this.n1;
        int i2 = this.b1;
        if (this.W1 == 0) {
            i = 17;
        } else {
            i = this.Y1;
        }
        z(linearLayout, i2, i2, i);
        z(this.o1, 0, 0, 17);
        K(this.s1, 0);
        this.y1.setVisibility(8);
    }

    public final void x(TextView textView, int i) {
        if (this.c2) {
            C4930Zm2.D(textView, i);
        } else {
            y(textView, i);
        }
    }

    public void setItemBackground(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.a1 = drawable;
        o();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(boolean z, char c2) {
    }
}
