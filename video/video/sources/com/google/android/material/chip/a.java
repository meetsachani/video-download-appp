package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o.C10548wm2;
import o.C10920yI2;
import o.C2705Cy;
import o.C3220Ic;
import o.C4297Tc1;
import o.C4394Uc1;
import o.C4820Ym;
import o.C7025iN1;
import o.C7608kn2;
import o.C9076ql1;
import o.C9081qm2;
import o.C9179r91;
import o.C9205rG;
import o.D60;
import o.InterfaceC11300zs1;
import o.InterfaceC2480Ap2;
import o.InterfaceC2669Co;
import o.InterfaceC3329Je2;
import o.InterfaceC4698Xf2;
import o.InterfaceC5670cr1;
import o.InterfaceC6509gG;
import o.InterfaceC6826ha;
import o.InterfaceC8568og;
import o.InterfaceC9154r30;
import o.InterfaceC9397s30;
import o.InterfaceMenuC9553sh2;
import o.JF;
import o.K60;
import o.PK1;
import o.QU1;
import o.XN2;
import o.Z60;

/* loaded from: classes3.dex */
public class a extends C4394Uc1 implements InterfaceC2480Ap2, Drawable.Callback, C10548wm2.b {
    public static final boolean T2 = false;
    public static final String V2 = "http://schemas.android.com/apk/res-auto";
    public static final int W2 = 24;
    @JF
    public int A2;
    @JF
    public int B2;
    @JF
    public int C2;
    @JF
    public int D2;
    public boolean E2;
    @JF
    public int F2;
    public int G2;
    @InterfaceC11300zs1
    public ColorFilter H2;
    @InterfaceC11300zs1
    public PorterDuffColorFilter I2;
    @InterfaceC11300zs1
    public ColorStateList J1;
    @InterfaceC11300zs1
    public ColorStateList J2;
    @InterfaceC11300zs1
    public ColorStateList K1;
    @InterfaceC11300zs1
    public PorterDuff.Mode K2;
    public float L1;
    public int[] L2;
    public float M1;
    public boolean M2;
    @InterfaceC11300zs1
    public ColorStateList N1;
    @InterfaceC11300zs1
    public ColorStateList N2;
    public float O1;
    @InterfaceC5670cr1
    public WeakReference<InterfaceC0123a> O2;
    @InterfaceC11300zs1
    public ColorStateList P1;
    public TextUtils.TruncateAt P2;
    @InterfaceC11300zs1
    public CharSequence Q1;
    public boolean Q2;
    public boolean R1;
    public int R2;
    @InterfaceC11300zs1
    public Drawable S1;
    public boolean S2;
    @InterfaceC11300zs1
    public ColorStateList T1;
    public float U1;
    public boolean V1;
    public boolean W1;
    @InterfaceC11300zs1
    public Drawable X1;
    @InterfaceC11300zs1
    public Drawable Y1;
    @InterfaceC11300zs1
    public ColorStateList Z1;
    public float a2;
    @InterfaceC11300zs1
    public CharSequence b2;
    public boolean c2;
    public boolean d2;
    @InterfaceC11300zs1
    public Drawable e2;
    @InterfaceC11300zs1
    public ColorStateList f2;
    @InterfaceC11300zs1
    public C9076ql1 g2;
    @InterfaceC11300zs1
    public C9076ql1 h2;
    public float i2;
    public float j2;
    public float k2;
    public float l2;
    public float m2;
    public float n2;
    public float o2;
    public float p2;
    @InterfaceC5670cr1
    public final Context q2;
    public final Paint r2;
    @InterfaceC11300zs1
    public final Paint s2;
    public final Paint.FontMetrics t2;
    public final RectF u2;
    public final PointF v2;
    public final Path w2;
    @InterfaceC5670cr1
    public final C10548wm2 x2;
    @JF
    public int y2;
    @JF
    public int z2;
    public static final int[] U2 = {16842910};
    public static final ShapeDrawable X2 = new ShapeDrawable(new OvalShape());

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0123a {
        void a();
    }

    public a(@InterfaceC5670cr1 Context context, AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        super(context, attributeSet, i, i2);
        this.M1 = -1.0f;
        this.r2 = new Paint(1);
        this.t2 = new Paint.FontMetrics();
        this.u2 = new RectF();
        this.v2 = new PointF();
        this.w2 = new Path();
        this.G2 = 255;
        this.K2 = PorterDuff.Mode.SRC_IN;
        this.O2 = new WeakReference<>(null);
        i0(context);
        this.q2 = context;
        C10548wm2 c10548wm2 = new C10548wm2(this);
        this.x2 = c10548wm2;
        this.Q1 = "";
        c10548wm2.g().density = context.getResources().getDisplayMetrics().density;
        this.s2 = null;
        int[] iArr = U2;
        setState(iArr);
        v3(iArr);
        this.Q2 = true;
        X2.setTint(-1);
    }

    public static boolean k2(@InterfaceC11300zs1 int[] iArr, @InterfaceC8568og int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC5670cr1
    public static a p1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.x2(attributeSet, i, i2);
        return aVar;
    }

    @InterfaceC5670cr1
    public static a q1(@InterfaceC5670cr1 Context context, @XN2 int i) {
        AttributeSet k = Z60.k(context, i, "chip");
        int styleAttribute = k.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = C7025iN1.n.Widget_MaterialComponents_Chip_Entry;
        }
        return p1(context, k, C7025iN1.c.chipStandaloneStyle, styleAttribute);
    }

    public static boolean u2(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean v2(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean w2(@InterfaceC11300zs1 C9081qm2 c9081qm2) {
        if (c9081qm2 != null && c9081qm2.k() != null && c9081qm2.k().isStateful()) {
            return true;
        }
        return false;
    }

    @InterfaceC11300zs1
    public Drawable A1() {
        return this.e2;
    }

    public boolean A2(boolean z) {
        if (this.X1 == null) {
            return false;
        }
        return v3(z ? new int[]{16842919, 16842910} : U2);
    }

    public void A3(@InterfaceC11300zs1 InterfaceC0123a interfaceC0123a) {
        this.O2 = new WeakReference<>(interfaceC0123a);
    }

    @InterfaceC11300zs1
    public ColorStateList B1() {
        return this.f2;
    }

    public void B2(boolean z) {
        if (this.c2 != z) {
            this.c2 = z;
            float g1 = g1();
            if (!z && this.E2) {
                this.E2 = false;
            }
            float g12 = g1();
            invalidateSelf();
            if (g1 != g12) {
                y2();
            }
        }
    }

    public void B3(@InterfaceC11300zs1 TextUtils.TruncateAt truncateAt) {
        this.P2 = truncateAt;
    }

    @InterfaceC11300zs1
    public ColorStateList C1() {
        return this.K1;
    }

    public void C2(@InterfaceC2669Co int i) {
        B2(this.q2.getResources().getBoolean(i));
    }

    public void C3(@InterfaceC11300zs1 C9076ql1 c9076ql1) {
        this.h2 = c9076ql1;
    }

    public float D1() {
        if (this.S2) {
            return b0();
        }
        return this.M1;
    }

    public void D2(@InterfaceC11300zs1 Drawable drawable) {
        if (this.e2 != drawable) {
            float g1 = g1();
            this.e2 = drawable;
            float g12 = g1();
            e4(this.e2);
            e1(this.e2);
            invalidateSelf();
            if (g1 != g12) {
                y2();
            }
        }
    }

    public void D3(@InterfaceC6826ha int i) {
        C3(C9076ql1.d(this.q2, i));
    }

    public float E1() {
        return this.p2;
    }

    @Deprecated
    public void E2(boolean z) {
        K2(z);
    }

    public void E3(float f) {
        if (this.k2 != f) {
            float g1 = g1();
            this.k2 = f;
            float g12 = g1();
            invalidateSelf();
            if (g1 != g12) {
                y2();
            }
        }
    }

    @InterfaceC11300zs1
    public Drawable F1() {
        Drawable drawable = this.S1;
        if (drawable != null) {
            return D60.q(drawable);
        }
        return null;
    }

    @Deprecated
    public void F2(@InterfaceC2669Co int i) {
        K2(this.q2.getResources().getBoolean(i));
    }

    public void F3(@InterfaceC9154r30 int i) {
        E3(this.q2.getResources().getDimension(i));
    }

    public float G1() {
        return this.U1;
    }

    public void G2(@K60 int i) {
        D2(C3220Ic.b(this.q2, i));
    }

    public void G3(float f) {
        if (this.j2 != f) {
            float g1 = g1();
            this.j2 = f;
            float g12 = g1();
            invalidateSelf();
            if (g1 != g12) {
                y2();
            }
        }
    }

    @InterfaceC11300zs1
    public ColorStateList H1() {
        return this.T1;
    }

    public void H2(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.f2 != colorStateList) {
            this.f2 = colorStateList;
            if (o1()) {
                this.e2.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void H3(@InterfaceC9154r30 int i) {
        G3(this.q2.getResources().getDimension(i));
    }

    public float I1() {
        return this.L1;
    }

    public void I2(@InterfaceC6509gG int i) {
        H2(C3220Ic.a(this.q2, i));
    }

    public void I3(@PK1 int i) {
        this.R2 = i;
    }

    public float J1() {
        return this.i2;
    }

    public void J2(@InterfaceC2669Co int i) {
        K2(this.q2.getResources().getBoolean(i));
    }

    public void J3(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.P1 != colorStateList) {
            this.P1 = colorStateList;
            f4();
            onStateChange(getState());
        }
    }

    @InterfaceC11300zs1
    public ColorStateList K1() {
        return this.N1;
    }

    public void K2(boolean z) {
        if (this.d2 != z) {
            boolean b4 = b4();
            this.d2 = z;
            boolean b42 = b4();
            if (b4 != b42) {
                if (b42) {
                    e1(this.e2);
                } else {
                    e4(this.e2);
                }
                invalidateSelf();
                y2();
            }
        }
    }

    public void K3(@InterfaceC6509gG int i) {
        J3(C3220Ic.a(this.q2, i));
    }

    public float L1() {
        return this.O1;
    }

    public void L2(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.K1 != colorStateList) {
            this.K1 = colorStateList;
            onStateChange(getState());
        }
    }

    public void L3(boolean z) {
        this.Q2 = z;
    }

    public void M1(@InterfaceC5670cr1 RectF rectF) {
        h1(getBounds(), rectF);
    }

    public void M2(@InterfaceC6509gG int i) {
        L2(C3220Ic.a(this.q2, i));
    }

    public void M3(@InterfaceC11300zs1 C9076ql1 c9076ql1) {
        this.g2 = c9076ql1;
    }

    @InterfaceC11300zs1
    public Drawable N1() {
        Drawable drawable = this.X1;
        if (drawable != null) {
            return D60.q(drawable);
        }
        return null;
    }

    @Deprecated
    public void N2(float f) {
        if (this.M1 != f) {
            this.M1 = f;
            setShapeAppearanceModel(getShapeAppearanceModel().x(f));
        }
    }

    public void N3(@InterfaceC6826ha int i) {
        M3(C9076ql1.d(this.q2, i));
    }

    @InterfaceC11300zs1
    public CharSequence O1() {
        return this.b2;
    }

    @Deprecated
    public void O2(@InterfaceC9154r30 int i) {
        N2(this.q2.getResources().getDimension(i));
    }

    public void O3(@InterfaceC11300zs1 CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.Q1, charSequence)) {
            this.Q1 = charSequence;
            this.x2.n(true);
            invalidateSelf();
            y2();
        }
    }

    public float P1() {
        return this.o2;
    }

    public void P2(float f) {
        if (this.p2 != f) {
            this.p2 = f;
            invalidateSelf();
            y2();
        }
    }

    public void P3(@InterfaceC11300zs1 C9081qm2 c9081qm2) {
        this.x2.l(c9081qm2, this.q2);
    }

    public float Q1() {
        return this.a2;
    }

    public void Q2(@InterfaceC9154r30 int i) {
        P2(this.q2.getResources().getDimension(i));
    }

    public void Q3(@InterfaceC4698Xf2 int i) {
        P3(new C9081qm2(this.q2, i));
    }

    public float R1() {
        return this.n2;
    }

    public void R2(@InterfaceC11300zs1 Drawable drawable) {
        Drawable drawable2;
        Drawable F1 = F1();
        if (F1 != drawable) {
            float g1 = g1();
            if (drawable != null) {
                drawable2 = D60.r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.S1 = drawable2;
            float g12 = g1();
            e4(F1);
            if (c4()) {
                e1(this.S1);
            }
            invalidateSelf();
            if (g1 != g12) {
                y2();
            }
        }
    }

    public void R3(@JF int i) {
        S3(ColorStateList.valueOf(i));
    }

    @InterfaceC5670cr1
    public int[] S1() {
        return this.L2;
    }

    @Deprecated
    public void S2(boolean z) {
        a3(z);
    }

    public void S3(@InterfaceC11300zs1 ColorStateList colorStateList) {
        C9081qm2 f2 = f2();
        if (f2 != null) {
            f2.p(colorStateList);
            invalidateSelf();
        }
    }

    @InterfaceC11300zs1
    public ColorStateList T1() {
        return this.Z1;
    }

    @Deprecated
    public void T2(@InterfaceC2669Co int i) {
        Z2(i);
    }

    public void T3(float f) {
        if (this.m2 != f) {
            this.m2 = f;
            invalidateSelf();
            y2();
        }
    }

    public void U1(@InterfaceC5670cr1 RectF rectF) {
        j1(getBounds(), rectF);
    }

    public void U2(@K60 int i) {
        R2(C3220Ic.b(this.q2, i));
    }

    public void U3(@InterfaceC9154r30 int i) {
        T3(this.q2.getResources().getDimension(i));
    }

    public final float V1() {
        Drawable drawable;
        if (this.E2) {
            drawable = this.e2;
        } else {
            drawable = this.S1;
        }
        float f = this.U1;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil(C10920yI2.i(this.q2, 24));
            if (drawable.getIntrinsicHeight() <= f) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    public void V2(float f) {
        if (this.U1 != f) {
            float g1 = g1();
            this.U1 = f;
            float g12 = g1();
            invalidateSelf();
            if (g1 != g12) {
                y2();
            }
        }
    }

    public void V3(@InterfaceC3329Je2 int i) {
        O3(this.q2.getResources().getString(i));
    }

    public final float W1() {
        Drawable drawable;
        if (this.E2) {
            drawable = this.e2;
        } else {
            drawable = this.S1;
        }
        float f = this.U1;
        if (f <= 0.0f && drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return f;
    }

    public void W2(@InterfaceC9154r30 int i) {
        V2(this.q2.getResources().getDimension(i));
    }

    public void W3(@InterfaceC9397s30 float f) {
        C9081qm2 f2 = f2();
        if (f2 != null) {
            f2.q(f);
            this.x2.g().setTextSize(f);
            a();
        }
    }

    public TextUtils.TruncateAt X1() {
        return this.P2;
    }

    public void X2(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.V1 = true;
        if (this.T1 != colorStateList) {
            this.T1 = colorStateList;
            if (c4()) {
                this.S1.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void X3(float f) {
        if (this.l2 != f) {
            this.l2 = f;
            invalidateSelf();
            y2();
        }
    }

    @InterfaceC11300zs1
    public C9076ql1 Y1() {
        return this.h2;
    }

    public void Y2(@InterfaceC6509gG int i) {
        X2(C3220Ic.a(this.q2, i));
    }

    public void Y3(@InterfaceC9154r30 int i) {
        X3(this.q2.getResources().getDimension(i));
    }

    public float Z1() {
        return this.k2;
    }

    public void Z2(@InterfaceC2669Co int i) {
        a3(this.q2.getResources().getBoolean(i));
    }

    public void Z3(boolean z) {
        if (this.M2 != z) {
            this.M2 = z;
            f4();
            onStateChange(getState());
        }
    }

    @Override // o.C10548wm2.b
    public void a() {
        y2();
        invalidateSelf();
    }

    public float a2() {
        return this.j2;
    }

    public void a3(boolean z) {
        if (this.R1 != z) {
            boolean c4 = c4();
            this.R1 = z;
            boolean c42 = c4();
            if (c4 != c42) {
                if (c42) {
                    e1(this.S1);
                } else {
                    e4(this.S1);
                }
                invalidateSelf();
                y2();
            }
        }
    }

    public boolean a4() {
        return this.Q2;
    }

    @PK1
    public int b2() {
        return this.R2;
    }

    public void b3(float f) {
        if (this.L1 != f) {
            this.L1 = f;
            invalidateSelf();
            y2();
        }
    }

    public final boolean b4() {
        if (this.d2 && this.e2 != null && this.E2) {
            return true;
        }
        return false;
    }

    @InterfaceC11300zs1
    public ColorStateList c2() {
        return this.P1;
    }

    public void c3(@InterfaceC9154r30 int i) {
        b3(this.q2.getResources().getDimension(i));
    }

    public final boolean c4() {
        if (this.R1 && this.S1 != null) {
            return true;
        }
        return false;
    }

    @InterfaceC11300zs1
    public C9076ql1 d2() {
        return this.g2;
    }

    public void d3(float f) {
        if (this.i2 != f) {
            this.i2 = f;
            invalidateSelf();
            y2();
        }
    }

    public final boolean d4() {
        if (this.W1 && this.X1 != null) {
            return true;
        }
        return false;
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        Canvas canvas2;
        int i;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i2 = this.G2;
            if (i2 < 255) {
                canvas2 = canvas;
                i = C2705Cy.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
            } else {
                canvas2 = canvas;
                i = 0;
            }
            v1(canvas2, bounds);
            s1(canvas2, bounds);
            if (this.S2) {
                super.draw(canvas2);
            }
            u1(canvas2, bounds);
            x1(canvas2, bounds);
            t1(canvas2, bounds);
            r1(canvas2, bounds);
            if (this.Q2) {
                z1(canvas2, bounds);
            }
            w1(canvas2, bounds);
            y1(canvas2, bounds);
            if (this.G2 < 255) {
                canvas2.restoreToCount(i);
            }
        }
    }

    public final void e1(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            D60.m(drawable, D60.f(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.X1) {
                if (drawable.isStateful()) {
                    drawable.setState(S1());
                }
                drawable.setTintList(this.Z1);
                return;
            }
            Drawable drawable2 = this.S1;
            if (drawable == drawable2 && this.V1) {
                drawable2.setTintList(this.T1);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    @InterfaceC11300zs1
    public CharSequence e2() {
        return this.Q1;
    }

    public void e3(@InterfaceC9154r30 int i) {
        d3(this.q2.getResources().getDimension(i));
    }

    public final void e4(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void f1(@InterfaceC5670cr1 Rect rect, @InterfaceC5670cr1 RectF rectF) {
        rectF.setEmpty();
        if (!c4() && !b4()) {
            return;
        }
        float f = this.i2 + this.j2;
        float W1 = W1();
        if (D60.f(this) == 0) {
            float f2 = rect.left + f;
            rectF.left = f2;
            rectF.right = f2 + W1;
        } else {
            float f3 = rect.right - f;
            rectF.right = f3;
            rectF.left = f3 - W1;
        }
        float V1 = V1();
        float exactCenterY = rect.exactCenterY() - (V1 / 2.0f);
        rectF.top = exactCenterY;
        rectF.bottom = exactCenterY + V1;
    }

    @InterfaceC11300zs1
    public C9081qm2 f2() {
        return this.x2.e();
    }

    public void f3(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.N1 != colorStateList) {
            this.N1 = colorStateList;
            if (this.S2) {
                R0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void f4() {
        ColorStateList colorStateList;
        if (this.M2) {
            colorStateList = QU1.e(this.P1);
        } else {
            colorStateList = null;
        }
        this.N2 = colorStateList;
    }

    public float g1() {
        if (!c4() && !b4()) {
            return 0.0f;
        }
        return this.j2 + W1() + this.k2;
    }

    public float g2() {
        return this.m2;
    }

    public void g3(@InterfaceC6509gG int i) {
        f3(C3220Ic.a(this.q2, i));
    }

    public final void g4() {
        this.Y1 = new RippleDrawable(QU1.e(c2()), this.X1, X2);
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.G2;
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC11300zs1
    public ColorFilter getColorFilter() {
        return this.H2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.L1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.i2 + g1() + this.l2 + this.x2.h(e2().toString()) + this.m2 + k1() + this.p2), this.R2);
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable
    public void getOutline(@InterfaceC5670cr1 Outline outline) {
        Outline outline2;
        if (this.S2) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.M1);
            outline2 = outline;
        } else {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.M1);
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public final void h1(@InterfaceC5670cr1 Rect rect, @InterfaceC5670cr1 RectF rectF) {
        rectF.set(rect);
        if (d4()) {
            float f = this.p2 + this.o2 + this.a2 + this.n2 + this.m2;
            if (D60.f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    public float h2() {
        return this.l2;
    }

    public void h3(float f) {
        if (this.O1 != f) {
            this.O1 = f;
            this.r2.setStrokeWidth(f);
            if (this.S2) {
                super.U0(f);
            }
            invalidateSelf();
        }
    }

    public final void i1(@InterfaceC5670cr1 Rect rect, @InterfaceC5670cr1 RectF rectF) {
        rectF.setEmpty();
        if (d4()) {
            float f = this.p2 + this.o2;
            if (D60.f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.a2;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.a2;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.a2;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    @InterfaceC11300zs1
    public final ColorFilter i2() {
        ColorFilter colorFilter = this.H2;
        if (colorFilter != null) {
            return colorFilter;
        }
        return this.I2;
    }

    public void i3(@InterfaceC9154r30 int i) {
        h3(this.q2.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@InterfaceC5670cr1 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!u2(this.J1) && !u2(this.K1) && !u2(this.N1)) {
            if ((!this.M2 || !u2(this.N2)) && !w2(this.x2.e()) && !o1() && !v2(this.S1) && !v2(this.e2) && !u2(this.J2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void j1(@InterfaceC5670cr1 Rect rect, @InterfaceC5670cr1 RectF rectF) {
        rectF.setEmpty();
        if (d4()) {
            float f = this.p2 + this.o2 + this.a2 + this.n2 + this.m2;
            if (D60.f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean j2() {
        return this.M2;
    }

    public final void j3(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.J1 != colorStateList) {
            this.J1 = colorStateList;
            onStateChange(getState());
        }
    }

    public float k1() {
        if (d4()) {
            return this.n2 + this.a2 + this.o2;
        }
        return 0.0f;
    }

    public void k3(@InterfaceC11300zs1 Drawable drawable) {
        Drawable drawable2;
        Drawable N1 = N1();
        if (N1 != drawable) {
            float k1 = k1();
            if (drawable != null) {
                drawable2 = D60.r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.X1 = drawable2;
            g4();
            float k12 = k1();
            e4(N1);
            if (d4()) {
                e1(this.X1);
            }
            invalidateSelf();
            if (k1 != k12) {
                y2();
            }
        }
    }

    public final void l1(@InterfaceC5670cr1 Rect rect, @InterfaceC5670cr1 RectF rectF) {
        rectF.setEmpty();
        if (this.Q1 != null) {
            float g1 = this.i2 + g1() + this.l2;
            float k1 = this.p2 + k1() + this.m2;
            if (D60.f(this) == 0) {
                rectF.left = rect.left + g1;
                rectF.right = rect.right - k1;
            } else {
                rectF.left = rect.left + k1;
                rectF.right = rect.right - g1;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean l2() {
        return this.c2;
    }

    public void l3(@InterfaceC11300zs1 CharSequence charSequence) {
        if (this.b2 != charSequence) {
            this.b2 = C4820Ym.c().m(charSequence);
            invalidateSelf();
        }
    }

    public final float m1() {
        this.x2.g().getFontMetrics(this.t2);
        Paint.FontMetrics fontMetrics = this.t2;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    @Deprecated
    public boolean m2() {
        return n2();
    }

    @Deprecated
    public void m3(boolean z) {
        z3(z);
    }

    @InterfaceC5670cr1
    public Paint.Align n1(@InterfaceC5670cr1 Rect rect, @InterfaceC5670cr1 PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.Q1 != null) {
            float g1 = this.i2 + g1() + this.l2;
            if (D60.f(this) == 0) {
                pointF.x = rect.left + g1;
            } else {
                pointF.x = rect.right - g1;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m1();
        }
        return align;
    }

    public boolean n2() {
        return this.d2;
    }

    @Deprecated
    public void n3(@InterfaceC2669Co int i) {
        y3(i);
    }

    public final boolean o1() {
        if (this.d2 && this.e2 != null && this.c2) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean o2() {
        return p2();
    }

    public void o3(float f) {
        if (this.o2 != f) {
            this.o2 = f;
            invalidateSelf();
            if (d4()) {
                y2();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (c4()) {
            onLayoutDirectionChanged |= D60.m(this.S1, i);
        }
        if (b4()) {
            onLayoutDirectionChanged |= D60.m(this.e2, i);
        }
        if (d4()) {
            onLayoutDirectionChanged |= D60.m(this.X1, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (c4()) {
            onLevelChange |= this.S1.setLevel(i);
        }
        if (b4()) {
            onLevelChange |= this.e2.setLevel(i);
        }
        if (d4()) {
            onLevelChange |= this.X1.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable, o.C10548wm2.b
    public boolean onStateChange(@InterfaceC5670cr1 int[] iArr) {
        if (this.S2) {
            super.onStateChange(iArr);
        }
        return z2(iArr, S1());
    }

    public boolean p2() {
        return this.R1;
    }

    public void p3(@InterfaceC9154r30 int i) {
        o3(this.q2.getResources().getDimension(i));
    }

    @Deprecated
    public boolean q2() {
        return s2();
    }

    public void q3(@K60 int i) {
        k3(C3220Ic.b(this.q2, i));
    }

    public final void r1(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect) {
        if (b4()) {
            f1(rect, this.u2);
            RectF rectF = this.u2;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.e2.setBounds(0, 0, (int) this.u2.width(), (int) this.u2.height());
            this.e2.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public boolean r2() {
        return v2(this.X1);
    }

    public void r3(float f) {
        if (this.a2 != f) {
            this.a2 = f;
            invalidateSelf();
            if (d4()) {
                y2();
            }
        }
    }

    public final void s1(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect) {
        if (!this.S2) {
            this.r2.setColor(this.z2);
            this.r2.setStyle(Paint.Style.FILL);
            this.r2.setColorFilter(i2());
            this.u2.set(rect);
            canvas.drawRoundRect(this.u2, D1(), D1(), this.r2);
        }
    }

    public boolean s2() {
        return this.W1;
    }

    public void s3(@InterfaceC9154r30 int i) {
        r3(this.q2.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@InterfaceC5670cr1 Drawable drawable, @InterfaceC5670cr1 Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.G2 != i) {
            this.G2 = i;
            invalidateSelf();
        }
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable
    public void setColorFilter(@InterfaceC11300zs1 ColorFilter colorFilter) {
        if (this.H2 != colorFilter) {
            this.H2 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.J2 != colorStateList) {
            this.J2 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintMode(@InterfaceC5670cr1 PorterDuff.Mode mode) {
        if (this.K2 != mode) {
            this.K2 = mode;
            this.I2 = Z60.o(this, this.J2, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (c4()) {
            visible |= this.S1.setVisible(z, z2);
        }
        if (b4()) {
            visible |= this.e2.setVisible(z, z2);
        }
        if (d4()) {
            visible |= this.X1.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t1(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect) {
        if (c4()) {
            f1(rect, this.u2);
            RectF rectF = this.u2;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.S1.setBounds(0, 0, (int) this.u2.width(), (int) this.u2.height());
            this.S1.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public boolean t2() {
        return this.S2;
    }

    public void t3(float f) {
        if (this.n2 != f) {
            this.n2 = f;
            invalidateSelf();
            if (d4()) {
                y2();
            }
        }
    }

    public final void u1(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect) {
        if (this.O1 > 0.0f && !this.S2) {
            this.r2.setColor(this.B2);
            this.r2.setStyle(Paint.Style.STROKE);
            if (!this.S2) {
                this.r2.setColorFilter(i2());
            }
            RectF rectF = this.u2;
            float f = this.O1;
            rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
            float f2 = this.M1 - (this.O1 / 2.0f);
            canvas.drawRoundRect(this.u2, f2, f2, this.r2);
        }
    }

    public void u3(@InterfaceC9154r30 int i) {
        t3(this.q2.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@InterfaceC5670cr1 Drawable drawable, @InterfaceC5670cr1 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v1(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect) {
        if (!this.S2) {
            this.r2.setColor(this.y2);
            this.r2.setStyle(Paint.Style.FILL);
            this.u2.set(rect);
            canvas.drawRoundRect(this.u2, D1(), D1(), this.r2);
        }
    }

    public boolean v3(@InterfaceC5670cr1 int[] iArr) {
        if (!Arrays.equals(this.L2, iArr)) {
            this.L2 = iArr;
            if (d4()) {
                return z2(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    public final void w1(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect) {
        if (d4()) {
            i1(rect, this.u2);
            RectF rectF = this.u2;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.X1.setBounds(0, 0, (int) this.u2.width(), (int) this.u2.height());
            this.Y1.setBounds(this.X1.getBounds());
            this.Y1.jumpToCurrentState();
            this.Y1.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    public void w3(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.Z1 != colorStateList) {
            this.Z1 = colorStateList;
            if (d4()) {
                this.X1.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void x1(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect) {
        this.r2.setColor(this.C2);
        this.r2.setStyle(Paint.Style.FILL);
        this.u2.set(rect);
        if (!this.S2) {
            canvas.drawRoundRect(this.u2, D1(), D1(), this.r2);
            return;
        }
        l(new RectF(rect), this.w2);
        super.w(canvas, this.r2, this.w2, B());
    }

    public final void x2(@InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        TypedArray k = C7608kn2.k(this.q2, attributeSet, C7025iN1.o.x1, i, i2, new int[0]);
        this.S2 = k.hasValue(C7025iN1.o.j2);
        j3(C4297Tc1.a(this.q2, k, C7025iN1.o.W1));
        L2(C4297Tc1.a(this.q2, k, C7025iN1.o.J1));
        b3(k.getDimension(C7025iN1.o.R1, 0.0f));
        int i3 = C7025iN1.o.K1;
        if (k.hasValue(i3)) {
            N2(k.getDimension(i3, 0.0f));
        }
        f3(C4297Tc1.a(this.q2, k, C7025iN1.o.U1));
        h3(k.getDimension(C7025iN1.o.V1, 0.0f));
        J3(C4297Tc1.a(this.q2, k, C7025iN1.o.i2));
        O3(k.getText(C7025iN1.o.D1));
        C9081qm2 h = C4297Tc1.h(this.q2, k, C7025iN1.o.y1);
        h.q(k.getDimension(C7025iN1.o.z1, h.l()));
        P3(h);
        int i4 = k.getInt(C7025iN1.o.B1, 0);
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    B3(TextUtils.TruncateAt.END);
                }
            } else {
                B3(TextUtils.TruncateAt.MIDDLE);
            }
        } else {
            B3(TextUtils.TruncateAt.START);
        }
        a3(k.getBoolean(C7025iN1.o.Q1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            a3(k.getBoolean(C7025iN1.o.N1, false));
        }
        R2(C4297Tc1.e(this.q2, k, C7025iN1.o.M1));
        int i5 = C7025iN1.o.P1;
        if (k.hasValue(i5)) {
            X2(C4297Tc1.a(this.q2, k, i5));
        }
        V2(k.getDimension(C7025iN1.o.O1, -1.0f));
        z3(k.getBoolean(C7025iN1.o.d2, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            z3(k.getBoolean(C7025iN1.o.Y1, false));
        }
        k3(C4297Tc1.e(this.q2, k, C7025iN1.o.X1));
        w3(C4297Tc1.a(this.q2, k, C7025iN1.o.c2));
        r3(k.getDimension(C7025iN1.o.a2, 0.0f));
        B2(k.getBoolean(C7025iN1.o.E1, false));
        K2(k.getBoolean(C7025iN1.o.I1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            K2(k.getBoolean(C7025iN1.o.G1, false));
        }
        D2(C4297Tc1.e(this.q2, k, C7025iN1.o.F1));
        int i6 = C7025iN1.o.H1;
        if (k.hasValue(i6)) {
            H2(C4297Tc1.a(this.q2, k, i6));
        }
        M3(C9076ql1.c(this.q2, k, C7025iN1.o.l2));
        C3(C9076ql1.c(this.q2, k, C7025iN1.o.f2));
        d3(k.getDimension(C7025iN1.o.T1, 0.0f));
        G3(k.getDimension(C7025iN1.o.h2, 0.0f));
        E3(k.getDimension(C7025iN1.o.g2, 0.0f));
        X3(k.getDimension(C7025iN1.o.n2, 0.0f));
        T3(k.getDimension(C7025iN1.o.m2, 0.0f));
        t3(k.getDimension(C7025iN1.o.b2, 0.0f));
        o3(k.getDimension(C7025iN1.o.Z1, 0.0f));
        P2(k.getDimension(C7025iN1.o.L1, 0.0f));
        I3(k.getDimensionPixelSize(C7025iN1.o.C1, Integer.MAX_VALUE));
        k.recycle();
    }

    public void x3(@InterfaceC6509gG int i) {
        w3(C3220Ic.a(this.q2, i));
    }

    public final void y1(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect) {
        Canvas canvas2;
        Paint paint = this.s2;
        if (paint != null) {
            paint.setColor(C9205rG.D(-16777216, 127));
            canvas.drawRect(rect, this.s2);
            if (c4() || b4()) {
                f1(rect, this.u2);
                canvas.drawRect(this.u2, this.s2);
            }
            if (this.Q1 != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.s2);
            } else {
                canvas2 = canvas;
            }
            if (d4()) {
                i1(rect, this.u2);
                canvas2.drawRect(this.u2, this.s2);
            }
            this.s2.setColor(C9205rG.D(InterfaceMenuC9553sh2.c, 127));
            h1(rect, this.u2);
            canvas2.drawRect(this.u2, this.s2);
            this.s2.setColor(C9205rG.D(-16711936, 127));
            j1(rect, this.u2);
            canvas2.drawRect(this.u2, this.s2);
        }
    }

    public void y2() {
        InterfaceC0123a interfaceC0123a = this.O2.get();
        if (interfaceC0123a != null) {
            interfaceC0123a.a();
        }
    }

    public void y3(@InterfaceC2669Co int i) {
        z3(this.q2.getResources().getBoolean(i));
    }

    public final void z1(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect) {
        boolean z;
        if (this.Q1 != null) {
            Paint.Align n1 = n1(rect, this.v2);
            l1(rect, this.u2);
            if (this.x2.e() != null) {
                this.x2.g().drawableState = getState();
                this.x2.o(this.q2);
            }
            this.x2.g().setTextAlign(n1);
            int i = 0;
            if (Math.round(this.x2.h(e2().toString())) > Math.round(this.u2.width())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.u2);
            }
            CharSequence charSequence = this.Q1;
            if (z && this.P2 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.x2.g(), this.u2.width(), this.P2);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.v2;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.x2.g());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    public final boolean z2(@InterfaceC5670cr1 int[] iArr, @InterfaceC5670cr1 int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.J1;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, this.y2);
        } else {
            i = 0;
        }
        int q = q(i);
        boolean z5 = true;
        if (this.y2 != q) {
            this.y2 = q;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.K1;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(iArr, this.z2);
        } else {
            i2 = 0;
        }
        int q2 = q(i2);
        if (this.z2 != q2) {
            this.z2 = q2;
            onStateChange = true;
        }
        int s = C9179r91.s(q, q2);
        if (this.A2 != s) {
            z = true;
        } else {
            z = false;
        }
        if (G() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z | z2) {
            this.A2 = s;
            y0(ColorStateList.valueOf(s));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.N1;
        if (colorStateList3 != null) {
            i3 = colorStateList3.getColorForState(iArr, this.B2);
        } else {
            i3 = 0;
        }
        if (this.B2 != i3) {
            this.B2 = i3;
            onStateChange = true;
        }
        if (this.N2 != null && QU1.f(iArr)) {
            i4 = this.N2.getColorForState(iArr, this.C2);
        } else {
            i4 = 0;
        }
        if (this.C2 != i4) {
            this.C2 = i4;
            if (this.M2) {
                onStateChange = true;
            }
        }
        if (this.x2.e() != null && this.x2.e().k() != null) {
            i5 = this.x2.e().k().getColorForState(iArr, this.D2);
        } else {
            i5 = 0;
        }
        if (this.D2 != i5) {
            this.D2 = i5;
            onStateChange = true;
        }
        if (k2(getState(), 16842912) && this.c2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.E2 != z3 && this.e2 != null) {
            float g1 = g1();
            this.E2 = z3;
            if (g1 != g1()) {
                onStateChange = true;
                z4 = true;
            } else {
                z4 = false;
                onStateChange = true;
            }
        } else {
            z4 = false;
        }
        ColorStateList colorStateList4 = this.J2;
        if (colorStateList4 != null) {
            i6 = colorStateList4.getColorForState(iArr, this.F2);
        } else {
            i6 = 0;
        }
        if (this.F2 != i6) {
            this.F2 = i6;
            this.I2 = Z60.o(this, this.J2, this.K2);
        } else {
            z5 = onStateChange;
        }
        if (v2(this.S1)) {
            z5 |= this.S1.setState(iArr);
        }
        if (v2(this.e2)) {
            z5 |= this.e2.setState(iArr);
        }
        if (v2(this.X1)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z5 |= this.X1.setState(iArr3);
        }
        if (v2(this.Y1)) {
            z5 |= this.Y1.setState(iArr2);
        }
        if (z5) {
            invalidateSelf();
        }
        if (z4) {
            y2();
        }
        return z5;
    }

    public void z3(boolean z) {
        if (this.W1 != z) {
            boolean d4 = d4();
            this.W1 = z;
            boolean d42 = d4();
            if (d4 != d42) {
                if (d42) {
                    e1(this.X1);
                } else {
                    e4(this.X1);
                }
                invalidateSelf();
                y2();
            }
        }
    }
}
