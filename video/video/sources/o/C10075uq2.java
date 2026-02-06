package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import o.C10548wm2;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.uq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10075uq2 extends C4394Uc1 implements C10548wm2.b {
    @InterfaceC4698Xf2
    public static final int b2 = C7025iN1.n.Widget_MaterialComponents_Tooltip;
    @InterfaceC8568og
    public static final int c2 = C7025iN1.c.tooltipStyle;
    @InterfaceC11300zs1
    public CharSequence J1;
    @InterfaceC5670cr1
    public final Context K1;
    @InterfaceC11300zs1
    public final Paint.FontMetrics L1;
    @InterfaceC5670cr1
    public final C10548wm2 M1;
    @InterfaceC5670cr1
    public final View.OnLayoutChangeListener N1;
    @InterfaceC5670cr1
    public final Rect O1;
    public int P1;
    public int Q1;
    public int R1;
    public int S1;
    public boolean T1;
    public int U1;
    public int V1;
    public float W1;
    public float X1;
    public float Y1;
    public float Z1;
    public float a2;

    /* renamed from: o.uq2$a */
    /* loaded from: classes3.dex */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C10075uq2.this.H1(view);
        }
    }

    public C10075uq2(@InterfaceC5670cr1 Context context, AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        super(context, attributeSet, i, i2);
        this.L1 = new Paint.FontMetrics();
        C10548wm2 c10548wm2 = new C10548wm2(this);
        this.M1 = c10548wm2;
        this.N1 = new a();
        this.O1 = new Rect();
        this.W1 = 1.0f;
        this.X1 = 1.0f;
        this.Y1 = 0.5f;
        this.Z1 = 0.5f;
        this.a2 = 1.0f;
        this.K1 = context;
        c10548wm2.g().density = context.getResources().getDisplayMetrics().density;
        c10548wm2.g().setTextAlign(Paint.Align.CENTER);
    }

    private float g1() {
        this.M1.g().getFontMetrics(this.L1);
        Paint.FontMetrics fontMetrics = this.L1;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    @InterfaceC5670cr1
    public static C10075uq2 i1(@InterfaceC5670cr1 Context context) {
        return k1(context, null, c2, b2);
    }

    @InterfaceC5670cr1
    public static C10075uq2 j1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        return k1(context, attributeSet, c2, b2);
    }

    @InterfaceC5670cr1
    public static C10075uq2 k1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        C10075uq2 c10075uq2 = new C10075uq2(context, attributeSet, i, i2);
        c10075uq2.v1(attributeSet, i, i2);
        return c10075uq2;
    }

    private void v1(@InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        TypedArray k = C7608kn2.k(this.K1, attributeSet, C7025iN1.o.Je, i, i2, new int[0]);
        this.U1 = this.K1.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_tooltip_arrowSize);
        boolean z = k.getBoolean(C7025iN1.o.Se, true);
        this.T1 = z;
        if (z) {
            setShapeAppearanceModel(getShapeAppearanceModel().w().t(l1()).m());
        } else {
            this.U1 = 0;
        }
        C1(k.getText(C7025iN1.o.Qe));
        C9081qm2 h = C4297Tc1.h(this.K1, k, C7025iN1.o.Ke);
        if (h != null) {
            int i3 = C7025iN1.o.Le;
            if (k.hasValue(i3)) {
                h.p(C4297Tc1.a(this.K1, k, i3));
            }
        }
        D1(h);
        y0(ColorStateList.valueOf(k.getColor(C7025iN1.o.Re, C9179r91.s(C9205rG.D(C9179r91.c(this.K1, 16842801, C10075uq2.class.getCanonicalName()), 229), C9205rG.D(C9179r91.c(this.K1, C7025iN1.c.colorOnBackground, C10075uq2.class.getCanonicalName()), C3503Kz.m0)))));
        R0(ColorStateList.valueOf(C9179r91.c(this.K1, C7025iN1.c.colorSurface, C10075uq2.class.getCanonicalName())));
        this.P1 = k.getDimensionPixelSize(C7025iN1.o.Me, 0);
        this.Q1 = k.getDimensionPixelSize(C7025iN1.o.Oe, 0);
        this.R1 = k.getDimensionPixelSize(C7025iN1.o.Pe, 0);
        this.S1 = k.getDimensionPixelSize(C7025iN1.o.Ne, 0);
        k.recycle();
    }

    public void A1(@InterfaceC11300zs1 View view) {
        if (view == null) {
            return;
        }
        H1(view);
        view.addOnLayoutChangeListener(this.N1);
    }

    public void B1(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        this.W1 = f;
        this.X1 = f;
        this.a2 = C5600ca.b(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    public void C1(@InterfaceC11300zs1 CharSequence charSequence) {
        if (!TextUtils.equals(this.J1, charSequence)) {
            this.J1 = charSequence;
            this.M1.n(true);
            invalidateSelf();
        }
    }

    public void D1(@InterfaceC11300zs1 C9081qm2 c9081qm2) {
        this.M1.l(c9081qm2, this.K1);
    }

    public void E1(@InterfaceC4698Xf2 int i) {
        D1(new C9081qm2(this.K1, i));
    }

    public void F1(@PK1 int i) {
        this.P1 = i;
        invalidateSelf();
    }

    public void G1(@InterfaceC3329Je2 int i) {
        C1(this.K1.getResources().getString(i));
    }

    public final void H1(@InterfaceC5670cr1 View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.V1 = iArr[0];
        view.getWindowVisibleDisplayFrame(this.O1);
    }

    @Override // o.C10548wm2.b
    public void a() {
        invalidateSelf();
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        canvas.save();
        canvas.scale(this.W1, this.X1, getBounds().left + (getBounds().width() * this.Y1), getBounds().top + (getBounds().height() * this.Z1));
        canvas.translate(f1(), (float) (-((this.U1 * Math.sqrt(2.0d)) - this.U1)));
        super.draw(canvas);
        n1(canvas);
        canvas.restore();
    }

    public final float f1() {
        int i;
        if (((this.O1.right - getBounds().right) - this.V1) - this.S1 < 0) {
            i = ((this.O1.right - getBounds().right) - this.V1) - this.S1;
        } else if (((this.O1.left - getBounds().left) - this.V1) + this.S1 > 0) {
            i = ((this.O1.left - getBounds().left) - this.V1) + this.S1;
        } else {
            return 0.0f;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.M1.g().getTextSize(), this.R1);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.P1 * 2) + u1(), this.Q1);
    }

    public final float h1(@InterfaceC5670cr1 Rect rect) {
        return rect.centerY() - g1();
    }

    public final A90 l1() {
        float width = (float) ((getBounds().width() - (this.U1 * Math.sqrt(2.0d))) / 2.0d);
        return new C6908hu1(new C10879y81(this.U1), Math.min(Math.max(-f1(), -width), width));
    }

    public void m1(@InterfaceC11300zs1 View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.N1);
    }

    public final void n1(@InterfaceC5670cr1 Canvas canvas) {
        if (this.J1 == null) {
            return;
        }
        Rect bounds = getBounds();
        int h1 = (int) h1(bounds);
        if (this.M1.e() != null) {
            this.M1.g().drawableState = getState();
            this.M1.o(this.K1);
            this.M1.g().setAlpha((int) (this.a2 * 255.0f));
        }
        CharSequence charSequence = this.J1;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), h1, this.M1.g());
    }

    public int o1() {
        return this.S1;
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.T1) {
            setShapeAppearanceModel(getShapeAppearanceModel().w().t(l1()).m());
        }
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable, o.C10548wm2.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public int p1() {
        return this.R1;
    }

    public int q1() {
        return this.Q1;
    }

    @InterfaceC11300zs1
    public CharSequence r1() {
        return this.J1;
    }

    @InterfaceC11300zs1
    public C9081qm2 s1() {
        return this.M1.e();
    }

    public int t1() {
        return this.P1;
    }

    public final float u1() {
        CharSequence charSequence = this.J1;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.M1.h(charSequence.toString());
    }

    public void w1(@PK1 int i) {
        this.S1 = i;
        invalidateSelf();
    }

    public void x1(@PK1 int i) {
        this.R1 = i;
        invalidateSelf();
    }

    public void y1(@PK1 int i) {
        this.Q1 = i;
        invalidateSelf();
    }

    @HT1({HT1.a.Y})
    public void z1(float f, float f2) {
        this.Y1 = f;
        this.Z1 = f2;
        invalidateSelf();
    }
}
