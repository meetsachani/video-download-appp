package o;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import o.C7025iN1;
import o.EL1;
import o.HT1;
import o.O22;
import o.OL1;

@HT1({HT1.a.Y})
/* renamed from: o.m91  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7957m91 {
    public static final float A = 1.5f;
    public static final int B = 2;
    public static final Drawable C;
    public static final int D = 300;
    public static final int y = -1;
    public static final double z = Math.cos(Math.toRadians(45.0d));
    @InterfaceC5670cr1
    public final C7453k91 a;
    @InterfaceC5670cr1
    public final C4394Uc1 c;
    @InterfaceC5670cr1
    public final C4394Uc1 d;
    @InterfaceC9397s30
    public int e;
    @InterfaceC9397s30
    public int f;
    public int g;
    @InterfaceC9397s30
    public int h;
    @InterfaceC11300zs1
    public Drawable i;
    @InterfaceC11300zs1
    public Drawable j;
    @InterfaceC11300zs1
    public ColorStateList k;
    @InterfaceC11300zs1
    public ColorStateList l;
    @InterfaceC11300zs1
    public O22 m;
    @InterfaceC11300zs1
    public ColorStateList n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public Drawable f802o;
    @InterfaceC11300zs1
    public LayerDrawable p;
    @InterfaceC11300zs1
    public C4394Uc1 q;
    public boolean s;
    @InterfaceC11300zs1
    public ValueAnimator t;
    public final TimeInterpolator u;
    public final int v;
    public final int w;
    @InterfaceC5670cr1
    public final Rect b = new Rect();
    public boolean r = false;
    public float x = 0.0f;

    /* renamed from: o.m91$a */
    /* loaded from: classes3.dex */
    public class a extends InsetDrawable {
        public a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        C = colorDrawable;
    }

    public C7957m91(@InterfaceC5670cr1 C7453k91 c7453k91, AttributeSet attributeSet, int i, @InterfaceC4698Xf2 int i2) {
        this.a = c7453k91;
        C4394Uc1 c4394Uc1 = new C4394Uc1(c7453k91.getContext(), attributeSet, i, i2);
        this.c = c4394Uc1;
        c4394Uc1.i0(c7453k91.getContext());
        c4394Uc1.G0(-12303292);
        O22.b w = c4394Uc1.getShapeAppearanceModel().w();
        TypedArray obtainStyledAttributes = c7453k91.getContext().obtainStyledAttributes(attributeSet, EL1.e.a, i, EL1.d.b);
        int i3 = EL1.e.e;
        if (obtainStyledAttributes.hasValue(i3)) {
            w.o(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.d = new C4394Uc1();
        W(w.m());
        this.u = C9811tl1.g(c7453k91.getContext(), C7025iN1.c.motionEasingLinearInterpolator, C5600ca.a);
        this.v = C9811tl1.f(c7453k91.getContext(), C7025iN1.c.motionDurationShort2, 300);
        this.w = C9811tl1.f(c7453k91.getContext(), C7025iN1.c.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(C7957m91 c7957m91, ValueAnimator valueAnimator) {
        c7957m91.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c7957m91.j.setAlpha((int) (255.0f * floatValue));
        c7957m91.x = floatValue;
    }

    @InterfaceC5670cr1
    public Rect A() {
        return this.b;
    }

    @InterfaceC5670cr1
    public final Drawable B(Drawable drawable) {
        int i;
        int i2;
        if (this.a.getUseCompatPadding()) {
            i2 = (int) Math.ceil(f());
            i = (int) Math.ceil(e());
        } else {
            i = 0;
            i2 = 0;
        }
        return new a(drawable, i, i2, i, i2);
    }

    public boolean C() {
        return this.r;
    }

    public boolean D() {
        return this.s;
    }

    public final boolean E() {
        if ((this.g & 80) == 80) {
            return true;
        }
        return false;
    }

    public final boolean F() {
        if ((this.g & 8388613) == 8388613) {
            return true;
        }
        return false;
    }

    public void G(@InterfaceC5670cr1 TypedArray typedArray) {
        Drawable drawable;
        ColorStateList a2 = C4297Tc1.a(this.a.getContext(), typedArray, C7025iN1.o.F6);
        this.n = a2;
        if (a2 == null) {
            this.n = ColorStateList.valueOf(-1);
        }
        this.h = typedArray.getDimensionPixelSize(C7025iN1.o.G6, 0);
        boolean z2 = typedArray.getBoolean(C7025iN1.o.u6, false);
        this.s = z2;
        this.a.setLongClickable(z2);
        this.l = C4297Tc1.a(this.a.getContext(), typedArray, C7025iN1.o.A6);
        O(C4297Tc1.e(this.a.getContext(), typedArray, C7025iN1.o.w6));
        R(typedArray.getDimensionPixelSize(C7025iN1.o.z6, 0));
        Q(typedArray.getDimensionPixelSize(C7025iN1.o.y6, 0));
        this.g = typedArray.getInteger(C7025iN1.o.x6, 8388661);
        ColorStateList a3 = C4297Tc1.a(this.a.getContext(), typedArray, C7025iN1.o.B6);
        this.k = a3;
        if (a3 == null) {
            this.k = ColorStateList.valueOf(C9179r91.d(this.a, OL1.b.G0));
        }
        K(C4297Tc1.a(this.a.getContext(), typedArray, C7025iN1.o.v6));
        i0();
        f0();
        j0();
        this.a.setBackgroundInternal(B(this.c));
        if (c0()) {
            drawable = r();
        } else {
            drawable = this.d;
        }
        this.i = drawable;
        this.a.setForeground(B(drawable));
    }

    public void H(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.p != null) {
            if (this.a.getUseCompatPadding()) {
                i3 = (int) Math.ceil(f() * 2.0f);
                i4 = (int) Math.ceil(e() * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (F()) {
                i5 = ((i - this.e) - this.f) - i4;
            } else {
                i5 = this.e;
            }
            if (E()) {
                i6 = this.e;
            } else {
                i6 = ((i2 - this.e) - this.f) - i3;
            }
            int i11 = i6;
            if (F()) {
                i7 = this.e;
            } else {
                i7 = ((i - this.e) - this.f) - i4;
            }
            if (E()) {
                i8 = ((i2 - this.e) - this.f) - i3;
            } else {
                i8 = this.e;
            }
            int i12 = i8;
            if (this.a.getLayoutDirection() == 1) {
                i10 = i7;
                i9 = i5;
            } else {
                i9 = i7;
                i10 = i5;
            }
            this.p.setLayerInset(2, i10, i12, i9, i11);
        }
    }

    public void I(boolean z2) {
        this.r = z2;
    }

    public void J(ColorStateList colorStateList) {
        this.c.y0(colorStateList);
    }

    public void K(@InterfaceC11300zs1 ColorStateList colorStateList) {
        C4394Uc1 c4394Uc1 = this.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c4394Uc1.y0(colorStateList);
    }

    public void L(boolean z2) {
        this.s = z2;
    }

    public void M(boolean z2) {
        N(z2, false);
    }

    public void N(boolean z2, boolean z3) {
        int i;
        float f;
        Drawable drawable = this.j;
        if (drawable != null) {
            if (z3) {
                b(z2);
                return;
            }
            if (z2) {
                i = 255;
            } else {
                i = 0;
            }
            drawable.setAlpha(i);
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            this.x = f;
        }
    }

    public void O(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = D60.r(drawable).mutate();
            this.j = mutate;
            mutate.setTintList(this.l);
            M(this.a.isChecked());
        } else {
            this.j = C;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C7025iN1.h.mtrl_card_checked_layer_id, this.j);
        }
    }

    public void P(int i) {
        this.g = i;
        H(this.a.getMeasuredWidth(), this.a.getMeasuredHeight());
    }

    public void Q(@InterfaceC9397s30 int i) {
        this.e = i;
    }

    public void R(@InterfaceC9397s30 int i) {
        this.f = i;
    }

    public void S(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.l = colorStateList;
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public void T(float f) {
        W(this.m.x(f));
        this.i.invalidateSelf();
        if (b0() || a0()) {
            e0();
        }
        if (b0()) {
            h0();
        }
    }

    public void U(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        this.c.z0(f);
        C4394Uc1 c4394Uc1 = this.d;
        if (c4394Uc1 != null) {
            c4394Uc1.z0(f);
        }
        C4394Uc1 c4394Uc12 = this.q;
        if (c4394Uc12 != null) {
            c4394Uc12.z0(f);
        }
    }

    public void V(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.k = colorStateList;
        i0();
    }

    public void W(@InterfaceC5670cr1 O22 o22) {
        this.m = o22;
        this.c.setShapeAppearanceModel(o22);
        C4394Uc1 c4394Uc1 = this.c;
        c4394Uc1.F0(!c4394Uc1.n0());
        C4394Uc1 c4394Uc12 = this.d;
        if (c4394Uc12 != null) {
            c4394Uc12.setShapeAppearanceModel(o22);
        }
        C4394Uc1 c4394Uc13 = this.q;
        if (c4394Uc13 != null) {
            c4394Uc13.setShapeAppearanceModel(o22);
        }
    }

    public void X(ColorStateList colorStateList) {
        if (this.n == colorStateList) {
            return;
        }
        this.n = colorStateList;
        j0();
    }

    public void Y(@InterfaceC9397s30 int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        j0();
    }

    public void Z(int i, int i2, int i3, int i4) {
        this.b.set(i, i2, i3, i4);
        e0();
    }

    public final boolean a0() {
        if (this.a.getPreventCornerOverlap() && !g()) {
            return true;
        }
        return false;
    }

    public void b(boolean z2) {
        float f;
        float f2;
        int i;
        if (z2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (z2) {
            f2 = 1.0f - this.x;
        } else {
            f2 = this.x;
        }
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.t = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.x, f);
        this.t = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.l91
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C7957m91.a(C7957m91.this, valueAnimator2);
            }
        });
        this.t.setInterpolator(this.u);
        ValueAnimator valueAnimator2 = this.t;
        if (z2) {
            i = this.v;
        } else {
            i = this.w;
        }
        valueAnimator2.setDuration(i * f2);
        this.t.start();
    }

    public final boolean b0() {
        if (this.a.getPreventCornerOverlap() && g() && this.a.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    public final float c() {
        return Math.max(Math.max(d(this.m.q(), this.c.b0()), d(this.m.s(), this.c.c0())), Math.max(d(this.m.k(), this.c.A()), d(this.m.i(), this.c.z())));
    }

    public final boolean c0() {
        if (this.a.isClickable()) {
            return true;
        }
        View view = this.a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final float d(ZP zp, float f) {
        if (zp instanceof C7540kV1) {
            return (float) ((1.0d - z) * f);
        }
        if (zp instanceof QT) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public void d0() {
        Drawable drawable;
        Drawable drawable2 = this.i;
        if (c0()) {
            drawable = r();
        } else {
            drawable = this.d;
        }
        this.i = drawable;
        if (drawable2 != drawable) {
            g0(drawable);
        }
    }

    public final float e() {
        float f;
        float maxCardElevation = this.a.getMaxCardElevation();
        if (b0()) {
            f = c();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    public void e0() {
        float c;
        if (!a0() && !b0()) {
            c = 0.0f;
        } else {
            c = c();
        }
        int t = (int) (c - t());
        C7453k91 c7453k91 = this.a;
        Rect rect = this.b;
        c7453k91.m(rect.left + t, rect.top + t, rect.right + t, rect.bottom + t);
    }

    public final float f() {
        float f;
        float maxCardElevation = this.a.getMaxCardElevation() * 1.5f;
        if (b0()) {
            f = c();
        } else {
            f = 0.0f;
        }
        return maxCardElevation + f;
    }

    public void f0() {
        this.c.x0(this.a.getCardElevation());
    }

    public final boolean g() {
        return this.c.n0();
    }

    public final void g0(Drawable drawable) {
        if (this.a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.a.getForeground()).setDrawable(drawable);
        } else {
            this.a.setForeground(B(drawable));
        }
    }

    @InterfaceC5670cr1
    public final Drawable h() {
        this.q = new C4394Uc1(this.m);
        return new RippleDrawable(this.k, null, this.q);
    }

    public void h0() {
        if (!C()) {
            this.a.setBackgroundInternal(B(this.c));
        }
        this.a.setForeground(B(this.i));
    }

    @ES1(api = 23)
    public void i() {
        Drawable drawable = this.f802o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f802o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f802o.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    public final void i0() {
        Drawable drawable = this.f802o;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(this.k);
        }
    }

    @InterfaceC5670cr1
    public C4394Uc1 j() {
        return this.c;
    }

    public void j0() {
        this.d.Q0(this.h, this.n);
    }

    public ColorStateList k() {
        return this.c.G();
    }

    public ColorStateList l() {
        return this.d.G();
    }

    @InterfaceC11300zs1
    public Drawable m() {
        return this.j;
    }

    public int n() {
        return this.g;
    }

    @InterfaceC9397s30
    public int o() {
        return this.e;
    }

    @InterfaceC9397s30
    public int p() {
        return this.f;
    }

    @InterfaceC11300zs1
    public ColorStateList q() {
        return this.l;
    }

    @InterfaceC5670cr1
    public final Drawable r() {
        if (this.f802o == null) {
            this.f802o = h();
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f802o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, C7025iN1.h.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    public float s() {
        return this.c.b0();
    }

    public final float t() {
        if (this.a.getPreventCornerOverlap() && this.a.getUseCompatPadding()) {
            return (float) ((1.0d - z) * this.a.getCardViewRadius());
        }
        return 0.0f;
    }

    @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
    public float u() {
        return this.c.H();
    }

    @InterfaceC11300zs1
    public ColorStateList v() {
        return this.k;
    }

    public O22 w() {
        return this.m;
    }

    @JF
    public int x() {
        ColorStateList colorStateList = this.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @InterfaceC11300zs1
    public ColorStateList y() {
        return this.n;
    }

    @InterfaceC9397s30
    public int z() {
        return this.h;
    }
}
