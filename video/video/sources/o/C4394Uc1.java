package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import o.C4992a32;
import o.C7025iN1;
import o.HT1;
import o.O22;
import o.P22;

/* renamed from: o.Uc1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4394Uc1 extends Drawable implements InterfaceC2480Ap2, InterfaceC6946i32 {
    public static final String A1 = "Uc1";
    public static final float B1 = 0.75f;
    public static final float C1 = 0.25f;
    public static final O22 D1 = O22.a().q(0, 0.0f).m();
    public static final int E1 = 0;
    public static final int F1 = 1;
    public static final int G1 = 2;
    public static final Paint H1;
    public static final f[] I1;
    public final O22.c X;
    public d Y;
    public final C4992a32.j[] Y0;
    public final C4992a32.j[] Z;
    public final BitSet Z0;
    public boolean a1;
    public boolean b1;
    public final Matrix c1;
    public final Path d1;
    public final Path e1;
    public final RectF f1;
    public final RectF g1;
    public final Region h1;
    public final Region i1;
    public final Paint j1;
    public final Paint k1;
    public final M22 l1;
    @InterfaceC5670cr1
    public final P22.b m1;
    public final P22 n1;
    @InterfaceC11300zs1
    public PorterDuffColorFilter o1;
    @InterfaceC11300zs1
    public PorterDuffColorFilter p1;
    public int q1;
    @InterfaceC5670cr1
    public final RectF r1;
    public boolean s1;
    public boolean t1;
    @InterfaceC5670cr1
    public O22 u1;
    @InterfaceC11300zs1
    public C6092eb2 v1;
    @InterfaceC5670cr1
    public C5850db2[] w1;
    @InterfaceC11300zs1
    public float[] x1;
    @InterfaceC11300zs1
    public float[] y1;
    @InterfaceC11300zs1
    public e z1;

    /* renamed from: o.Uc1$a */
    /* loaded from: classes3.dex */
    public class a implements O22.c {
        public a() {
        }

        @Override // o.O22.c
        @InterfaceC5670cr1
        public YP a(@InterfaceC5670cr1 YP yp) {
            if (yp instanceof YQ1) {
                return yp;
            }
            return new C9898u7(-C4394Uc1.this.X(), yp);
        }
    }

    /* renamed from: o.Uc1$b */
    /* loaded from: classes3.dex */
    public class b implements P22.b {
        public b() {
        }

        @Override // o.P22.b
        public void a(@InterfaceC5670cr1 C4992a32 c4992a32, Matrix matrix, int i) {
            C4394Uc1.this.Z0.set(i, c4992a32.e());
            C4394Uc1.this.Z[i] = c4992a32.f(matrix);
        }

        @Override // o.P22.b
        public void b(@InterfaceC5670cr1 C4992a32 c4992a32, Matrix matrix, int i) {
            C4394Uc1.this.Z0.set(i + 4, c4992a32.e());
            C4394Uc1.this.Y0[i] = c4992a32.f(matrix);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Uc1$c */
    /* loaded from: classes3.dex */
    public @interface c {
    }

    @HT1({HT1.a.Y})
    /* renamed from: o.Uc1$e */
    /* loaded from: classes3.dex */
    public interface e {
        void a(float f);
    }

    /* renamed from: o.Uc1$f */
    /* loaded from: classes3.dex */
    public static class f extends AbstractC11311zv0<C4394Uc1> {
        public final int b;

        public f(int i) {
            super("cornerSizeAtIndex" + i);
            this.b = i;
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(@InterfaceC5670cr1 C4394Uc1 c4394Uc1) {
            if (c4394Uc1.x1 != null) {
                return c4394Uc1.x1[this.b];
            }
            return 0.0f;
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(@InterfaceC5670cr1 C4394Uc1 c4394Uc1, float f) {
            if (c4394Uc1.x1 != null && c4394Uc1.x1[this.b] != f) {
                c4394Uc1.x1[this.b] = f;
                if (c4394Uc1.z1 != null) {
                    c4394Uc1.z1.a(c4394Uc1.D());
                }
                c4394Uc1.invalidateSelf();
            }
        }
    }

    static {
        int i = 0;
        Paint paint = new Paint(1);
        H1 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        I1 = new f[4];
        while (true) {
            f[] fVarArr = I1;
            if (i < fVarArr.length) {
                fVarArr[i] = new f(i);
                i++;
            } else {
                return;
            }
        }
    }

    public C4394Uc1() {
        this(new O22());
    }

    public static int q0(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    @InterfaceC5670cr1
    public static C4394Uc1 r(Context context) {
        return s(context, 0.0f);
    }

    @InterfaceC5670cr1
    public static C4394Uc1 s(@InterfaceC5670cr1 Context context, float f2) {
        return t(context, f2, null);
    }

    @InterfaceC5670cr1
    public static C4394Uc1 t(@InterfaceC5670cr1 Context context, float f2, @InterfaceC11300zs1 ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(C9179r91.c(context, C7025iN1.c.colorSurface, C4394Uc1.class.getSimpleName()));
        }
        C4394Uc1 c4394Uc1 = new C4394Uc1();
        c4394Uc1.i0(context);
        c4394Uc1.y0(colorStateList);
        c4394Uc1.x0(f2);
        return c4394Uc1;
    }

    public float A() {
        float[] fArr = this.x1;
        if (fArr != null) {
            return fArr[1];
        }
        return this.Y.a.l().a(B());
    }

    @HT1({HT1.a.Y})
    public void A0(@InterfaceC11300zs1 e eVar) {
        this.z1 = eVar;
    }

    @InterfaceC5670cr1
    public RectF B() {
        this.f1.set(getBounds());
        return this.f1;
    }

    public void B0(int i, int i2, int i3, int i4) {
        d dVar = this.Y;
        if (dVar.j == null) {
            dVar.j = new Rect();
        }
        this.Y.j.set(i, i2, i3, i4);
        invalidateSelf();
    }

    @InterfaceC5670cr1
    public final RectF C() {
        this.g1.set(B());
        float X = X();
        this.g1.inset(X, X);
        return this.g1;
    }

    public void C0(Paint.Style style) {
        this.Y.w = style;
        j0();
    }

    @HT1({HT1.a.Y})
    public float D() {
        float a2;
        float a3;
        float[] fArr = this.x1;
        if (fArr != null) {
            a2 = (fArr[3] + fArr[2]) - fArr[1];
            a3 = fArr[0];
        } else {
            RectF B = B();
            a2 = (this.n1.h(3, getShapeAppearanceModel()).a(B) + this.n1.h(2, getShapeAppearanceModel()).a(B)) - this.n1.h(1, getShapeAppearanceModel()).a(B);
            a3 = this.n1.h(0, getShapeAppearanceModel()).a(B);
        }
        return (a2 - a3) / 2.0f;
    }

    public void D0(float f2) {
        d dVar = this.Y;
        if (dVar.f629o != f2) {
            dVar.f629o = f2;
            d1();
        }
    }

    @InterfaceC11300zs1
    @HT1({HT1.a.Y})
    public C6092eb2 E() {
        return this.v1;
    }

    public void E0(float f2) {
        d dVar = this.Y;
        if (dVar.k != f2) {
            dVar.k = f2;
            invalidateSelf();
        }
    }

    public float F() {
        return this.Y.p;
    }

    @HT1({HT1.a.Y})
    public void F0(boolean z) {
        this.s1 = z;
    }

    @InterfaceC11300zs1
    public ColorStateList G() {
        return this.Y.e;
    }

    public void G0(int i) {
        this.l1.e(i);
        this.Y.v = false;
        j0();
    }

    public float H() {
        return this.Y.l;
    }

    public void H0(int i) {
        d dVar = this.Y;
        if (dVar.u != i) {
            dVar.u = i;
            j0();
        }
    }

    public Paint.Style I() {
        return this.Y.w;
    }

    public void I0(int i) {
        d dVar = this.Y;
        if (dVar.r != i) {
            dVar.r = i;
            j0();
        }
    }

    public float J() {
        return this.Y.f629o;
    }

    @Deprecated
    public void J0(int i) {
        x0(i);
    }

    @Deprecated
    public void K(int i, int i2, @InterfaceC5670cr1 Path path) {
        l(new RectF(0.0f, 0.0f, i, i2), path);
    }

    @Deprecated
    public void K0(boolean z) {
        I0(!z ? 1 : 0);
    }

    @JF
    public int L() {
        return this.q1;
    }

    @Deprecated
    public void L0(int i) {
        this.Y.s = i;
    }

    public float M() {
        return this.Y.k;
    }

    @HT1({HT1.a.Y})
    public void M0(int i) {
        d dVar = this.Y;
        if (dVar.t != i) {
            dVar.t = i;
            j0();
        }
    }

    public int N() {
        return this.Y.u;
    }

    @Deprecated
    public void N0(@InterfaceC5670cr1 C5477c32 c5477c32) {
        setShapeAppearanceModel(c5477c32);
    }

    public int O() {
        return this.Y.r;
    }

    @HT1({HT1.a.Y})
    public void O0(@InterfaceC5670cr1 C10751xc2 c10751xc2) {
        d dVar = this.Y;
        if (dVar.b != c10751xc2) {
            dVar.b = c10751xc2;
            a1(getState(), true);
            invalidateSelf();
        }
    }

    @Deprecated
    public int P() {
        return (int) F();
    }

    public void P0(float f2, @JF int i) {
        U0(f2);
        R0(ColorStateList.valueOf(i));
    }

    public int Q() {
        d dVar = this.Y;
        return (int) (dVar.t * Math.sin(Math.toRadians(dVar.u)));
    }

    public void Q0(float f2, @InterfaceC11300zs1 ColorStateList colorStateList) {
        U0(f2);
        R0(colorStateList);
    }

    public int R() {
        d dVar = this.Y;
        return (int) (dVar.t * Math.cos(Math.toRadians(dVar.u)));
    }

    public void R0(@InterfaceC11300zs1 ColorStateList colorStateList) {
        d dVar = this.Y;
        if (dVar.f != colorStateList) {
            dVar.f = colorStateList;
            onStateChange(getState());
        }
    }

    public int S() {
        return this.Y.s;
    }

    public void S0(@JF int i) {
        T0(ColorStateList.valueOf(i));
    }

    @HT1({HT1.a.Y})
    public int T() {
        return this.Y.t;
    }

    public void T0(ColorStateList colorStateList) {
        this.Y.g = colorStateList;
        c1();
        j0();
    }

    @InterfaceC11300zs1
    @Deprecated
    public C5477c32 U() {
        O22 shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof C5477c32) {
            return (C5477c32) shapeAppearanceModel;
        }
        return null;
    }

    public void U0(float f2) {
        this.Y.m = f2;
        invalidateSelf();
    }

    @InterfaceC11300zs1
    @HT1({HT1.a.Y})
    public C10751xc2 V() {
        return this.Y.b;
    }

    public void V0(float f2) {
        d dVar = this.Y;
        if (dVar.q != f2) {
            dVar.q = f2;
            d1();
        }
    }

    @InterfaceC11300zs1
    public ColorStateList W() {
        return this.Y.f;
    }

    public void W0(boolean z) {
        d dVar = this.Y;
        if (dVar.v != z) {
            dVar.v = z;
            invalidateSelf();
        }
    }

    public final float X() {
        if (h0()) {
            return this.k1.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public void X0(float f2) {
        V0(f2 - F());
    }

    @InterfaceC11300zs1
    public ColorStateList Y() {
        return this.Y.g;
    }

    public final boolean Y0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.Y.e != null && color2 != (colorForState2 = this.Y.e.getColorForState(iArr, (color2 = this.j1.getColor())))) {
            this.j1.setColor(colorForState2);
            z = true;
        } else {
            z = false;
        }
        if (this.Y.f != null && color != (colorForState = this.Y.f.getColorForState(iArr, (color = this.k1.getColor())))) {
            this.k1.setColor(colorForState);
            return true;
        }
        return z;
    }

    public float Z() {
        return this.Y.m;
    }

    public final void Z0(int[] iArr) {
        a1(iArr, false);
    }

    @InterfaceC11300zs1
    public ColorStateList a0() {
        return this.Y.h;
    }

    public final void a1(int[] iArr, boolean z) {
        boolean z2;
        RectF B = B();
        if (this.Y.b != null && !B.isEmpty()) {
            if (this.v1 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = z | z2;
            if (this.x1 == null) {
                this.x1 = new float[4];
            }
            O22 d2 = this.Y.b.d(iArr);
            for (int i = 0; i < 4; i++) {
                float a2 = this.n1.h(i, d2).a(B);
                if (z3) {
                    this.x1[i] = a2;
                }
                C5850db2 c5850db2 = this.w1[i];
                if (c5850db2 != null) {
                    c5850db2.C(a2);
                    if (z3) {
                        this.w1[i].H();
                    }
                }
            }
            if (z3) {
                invalidateSelf();
            }
        }
    }

    public float b0() {
        float[] fArr = this.x1;
        if (fArr != null) {
            return fArr[3];
        }
        return this.Y.a.r().a(B());
    }

    public final void b1() {
        this.u1 = getShapeAppearanceModel().z(this.X);
        float[] fArr = this.x1;
        if (fArr == null) {
            this.y1 = null;
            return;
        }
        if (this.y1 == null) {
            this.y1 = new float[fArr.length];
        }
        float X = X();
        int i = 0;
        while (true) {
            float[] fArr2 = this.x1;
            if (i < fArr2.length) {
                this.y1[i] = Math.max(0.0f, fArr2[i] - X);
                i++;
            } else {
                return;
            }
        }
    }

    public float c0() {
        float[] fArr = this.x1;
        if (fArr != null) {
            return fArr[0];
        }
        return this.Y.a.t().a(B());
    }

    public final boolean c1() {
        PorterDuffColorFilter porterDuffColorFilter = this.o1;
        PorterDuffColorFilter porterDuffColorFilter2 = this.p1;
        d dVar = this.Y;
        this.o1 = p(dVar.h, dVar.i, this.j1, true);
        d dVar2 = this.Y;
        this.p1 = p(dVar2.g, dVar2.i, this.k1, false);
        d dVar3 = this.Y;
        if (dVar3.v) {
            this.l1.e(dVar3.h.getColorForState(getState(), 0));
        }
        if (!C2691Ct1.a(porterDuffColorFilter, this.o1) || !C2691Ct1.a(porterDuffColorFilter2, this.p1)) {
            return true;
        }
        return false;
    }

    public float d0() {
        return this.Y.q;
    }

    public final void d1() {
        float e0 = e0();
        this.Y.s = (int) Math.ceil(0.75f * e0);
        this.Y.t = (int) Math.ceil(e0 * 0.25f);
        c1();
        j0();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        this.j1.setColorFilter(this.o1);
        int alpha = this.j1.getAlpha();
        this.j1.setAlpha(q0(alpha, this.Y.n));
        this.k1.setColorFilter(this.p1);
        this.k1.setStrokeWidth(this.Y.m);
        int alpha2 = this.k1.getAlpha();
        this.k1.setAlpha(q0(alpha2, this.Y.n));
        if (g0()) {
            if (this.a1) {
                k(B(), this.d1);
                this.a1 = false;
            }
            p0(canvas);
            v(canvas);
        }
        if (h0()) {
            if (this.b1) {
                n();
                this.b1 = false;
            }
            y(canvas);
        }
        this.j1.setAlpha(alpha);
        this.k1.setAlpha(alpha2);
    }

    public float e0() {
        return F() + d0();
    }

    public final boolean f0() {
        d dVar = this.Y;
        int i = dVar.r;
        if (i != 1 && dVar.s > 0) {
            if (i == 2 || s0()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g0() {
        Paint.Style style = this.Y.w;
        if (style != Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.Y.n;
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC11300zs1
    public Drawable.ConstantState getConstantState() {
        return this.Y;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@InterfaceC5670cr1 Outline outline) {
        if (this.Y.r != 2) {
            RectF B = B();
            if (B.isEmpty()) {
                return;
            }
            float m = m(B, this.Y.a, this.x1);
            if (m >= 0.0f) {
                outline.setRoundRect(getBounds(), m * this.Y.l);
                return;
            }
            if (this.a1) {
                k(B, this.d1);
                this.a1 = false;
            }
            Z60.l(outline, this.d1);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@InterfaceC5670cr1 Rect rect) {
        Rect rect2 = this.Y.j;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // o.InterfaceC6946i32
    @InterfaceC5670cr1
    public O22 getShapeAppearanceModel() {
        return this.Y.a;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.h1.set(getBounds());
        k(B(), this.d1);
        this.i1.setPath(this.d1, this.h1);
        this.h1.op(this.i1, Region.Op.DIFFERENCE);
        return this.h1;
    }

    public final boolean h0() {
        Paint.Style style = this.Y.w;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.k1.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public void i0(Context context) {
        this.Y.c = new C9523sa0(context);
        d1();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.a1 = true;
        this.b1 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.Y.h;
            if (colorStateList == null || !colorStateList.isStateful()) {
                ColorStateList colorStateList2 = this.Y.g;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.Y.f;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        ColorStateList colorStateList4 = this.Y.e;
                        if (colorStateList4 == null || !colorStateList4.isStateful()) {
                            C10751xc2 c10751xc2 = this.Y.b;
                            if (c10751xc2 == null || !c10751xc2.g()) {
                                return false;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @InterfaceC11300zs1
    public final PorterDuffColorFilter j(@InterfaceC5670cr1 Paint paint, boolean z) {
        if (z) {
            int color = paint.getColor();
            int q = q(color);
            this.q1 = q;
            if (q != color) {
                return new PorterDuffColorFilter(q, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        return null;
    }

    public final void j0() {
        super.invalidateSelf();
    }

    public final void k(@InterfaceC5670cr1 RectF rectF, @InterfaceC5670cr1 Path path) {
        l(rectF, path);
        if (this.Y.k != 1.0f) {
            this.c1.reset();
            Matrix matrix = this.c1;
            float f2 = this.Y.k;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.c1);
        }
        path.computeBounds(this.r1, true);
    }

    public boolean k0() {
        C9523sa0 c9523sa0 = this.Y.c;
        if (c9523sa0 != null && c9523sa0.l()) {
            return true;
        }
        return false;
    }

    @HT1({HT1.a.Y})
    public final void l(@InterfaceC5670cr1 RectF rectF, @InterfaceC5670cr1 Path path) {
        P22 p22 = this.n1;
        d dVar = this.Y;
        p22.f(dVar.a, this.x1, dVar.l, rectF, this.m1, path);
    }

    public boolean l0() {
        if (this.Y.c != null) {
            return true;
        }
        return false;
    }

    public final float m(@InterfaceC5670cr1 RectF rectF, @InterfaceC5670cr1 O22 o22, @InterfaceC11300zs1 float[] fArr) {
        if (fArr == null) {
            if (o22.v(rectF)) {
                return o22.r().a(rectF);
            }
            return -1.0f;
        } else if (C8801pd1.a(fArr) && o22.u()) {
            return fArr[0];
        } else {
            return -1.0f;
        }
    }

    public boolean m0(int i, int i2) {
        return getTransparentRegion().contains(i, i2);
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC5670cr1
    public Drawable mutate() {
        this.Y = new d(this.Y);
        return this;
    }

    public final void n() {
        b1();
        this.n1.f(this.u1, this.y1, this.Y.l, C(), null, this.e1);
    }

    @HT1({HT1.a.Y})
    public boolean n0() {
        if (!this.Y.a.v(B())) {
            float[] fArr = this.x1;
            if (fArr == null || !C8801pd1.a(fArr) || !this.Y.a.u()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @InterfaceC5670cr1
    public final PorterDuffColorFilter o(@InterfaceC5670cr1 ColorStateList colorStateList, @InterfaceC5670cr1 PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = q(colorForState);
        }
        this.q1 = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @Deprecated
    public boolean o0() {
        int i = this.Y.r;
        if (i != 0 && i != 2) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.a1 = true;
        this.b1 = true;
        super.onBoundsChange(rect);
        if (this.Y.b != null && !rect.isEmpty()) {
            a1(getState(), this.t1);
        }
        this.t1 = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, o.C10548wm2.b
    public boolean onStateChange(int[] iArr) {
        boolean z;
        if (this.Y.b != null) {
            Z0(iArr);
        }
        boolean Y0 = Y0(iArr);
        boolean c1 = c1();
        if (!Y0 && !c1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @InterfaceC5670cr1
    public final PorterDuffColorFilter p(@InterfaceC11300zs1 ColorStateList colorStateList, @InterfaceC11300zs1 PorterDuff.Mode mode, @InterfaceC5670cr1 Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            return o(colorStateList, mode, z);
        }
        return j(paint, z);
    }

    public final void p0(@InterfaceC5670cr1 Canvas canvas) {
        if (!f0()) {
            return;
        }
        canvas.save();
        r0(canvas);
        if (!this.s1) {
            u(canvas);
            canvas.restore();
            return;
        }
        int width = (int) (this.r1.width() - getBounds().width());
        int height = (int) (this.r1.height() - getBounds().height());
        if (width >= 0 && height >= 0) {
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.r1.width()) + (this.Y.s * 2) + width, ((int) this.r1.height()) + (this.Y.s * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f2 = (getBounds().left - this.Y.s) - width;
            float f3 = (getBounds().top - this.Y.s) - height;
            canvas2.translate(-f2, -f3);
            u(canvas2);
            canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    @HT1({HT1.a.Y})
    @JF
    public int q(@JF int i) {
        float e0 = e0() + J();
        C9523sa0 c9523sa0 = this.Y.c;
        if (c9523sa0 != null) {
            return c9523sa0.e(i, e0);
        }
        return i;
    }

    public final void r0(@InterfaceC5670cr1 Canvas canvas) {
        canvas.translate(Q(), R());
    }

    public boolean s0() {
        if (!n0() && !this.d1.isConvex() && Build.VERSION.SDK_INT < 29) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@BR0(from = 0, to = 255) int i) {
        d dVar = this.Y;
        if (dVar.n != i) {
            dVar.n = i;
            j0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@InterfaceC11300zs1 ColorFilter colorFilter) {
        this.Y.d = colorFilter;
        j0();
    }

    @Override // o.InterfaceC6946i32
    public void setShapeAppearanceModel(@InterfaceC5670cr1 O22 o22) {
        d dVar = this.Y;
        dVar.a = o22;
        dVar.b = null;
        this.x1 = null;
        this.y1 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTint(@JF int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.Y.h = colorStateList;
        c1();
        j0();
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        d dVar = this.Y;
        if (dVar.i != mode) {
            dVar.i = mode;
            c1();
            j0();
        }
    }

    public void t0(float f2) {
        setShapeAppearanceModel(this.Y.a.x(f2));
    }

    public final void u(@InterfaceC5670cr1 Canvas canvas) {
        if (this.Z0.cardinality() > 0) {
            Log.w(A1, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.Y.t != 0) {
            canvas.drawPath(this.d1, this.l1.d());
        }
        for (int i = 0; i < 4; i++) {
            this.Z[i].b(this.l1, this.Y.s, canvas);
            this.Y0[i].b(this.l1, this.Y.s, canvas);
        }
        if (this.s1) {
            int Q = Q();
            int R = R();
            canvas.translate(-Q, -R);
            canvas.drawPath(this.d1, H1);
            canvas.translate(Q, R);
        }
    }

    public void u0(@InterfaceC5670cr1 YP yp) {
        setShapeAppearanceModel(this.Y.a.y(yp));
    }

    public final void v(@InterfaceC5670cr1 Canvas canvas) {
        x(canvas, this.j1, this.d1, this.Y.a, this.x1, B());
    }

    @HT1({HT1.a.Y})
    public void v0(@InterfaceC5670cr1 C6092eb2 c6092eb2) {
        if (this.v1 != c6092eb2) {
            this.v1 = c6092eb2;
            int i = 0;
            while (true) {
                C5850db2[] c5850db2Arr = this.w1;
                if (i < c5850db2Arr.length) {
                    if (c5850db2Arr[i] == null) {
                        c5850db2Arr[i] = new C5850db2(this, I1[i]);
                    }
                    this.w1[i].G(new C6092eb2().g(c6092eb2.c()).i(c6092eb2.e()));
                    i++;
                } else {
                    a1(getState(), true);
                    invalidateSelf();
                    return;
                }
            }
        }
    }

    @HT1({HT1.a.Y})
    public void w(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @InterfaceC5670cr1 Path path, @InterfaceC5670cr1 RectF rectF) {
        x(canvas, paint, path, this.Y.a, this.x1, rectF);
    }

    @HT1({HT1.a.Y})
    public void w0(boolean z) {
        this.n1.o(z);
    }

    public final void x(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @InterfaceC5670cr1 Path path, @InterfaceC5670cr1 O22 o22, @InterfaceC11300zs1 float[] fArr, @InterfaceC5670cr1 RectF rectF) {
        float m = m(rectF, o22, fArr);
        if (m >= 0.0f) {
            float f2 = m * this.Y.l;
            canvas.drawRoundRect(rectF, f2, f2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void x0(float f2) {
        d dVar = this.Y;
        if (dVar.p != f2) {
            dVar.p = f2;
            d1();
        }
    }

    @HT1({HT1.a.Y})
    public void y(@InterfaceC5670cr1 Canvas canvas) {
        x(canvas, this.k1, this.e1, this.u1, this.y1, C());
    }

    public void y0(@InterfaceC11300zs1 ColorStateList colorStateList) {
        d dVar = this.Y;
        if (dVar.e != colorStateList) {
            dVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public float z() {
        float[] fArr = this.x1;
        if (fArr != null) {
            return fArr[2];
        }
        return this.Y.a.j().a(B());
    }

    public void z0(float f2) {
        d dVar = this.Y;
        if (dVar.l != f2) {
            dVar.l = f2;
            this.a1 = true;
            this.b1 = true;
            invalidateSelf();
        }
    }

    public C4394Uc1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        this(O22.e(context, attributeSet, i, i2).m());
    }

    @Deprecated
    public C4394Uc1(@InterfaceC5670cr1 C5477c32 c5477c32) {
        this((O22) c5477c32);
    }

    public C4394Uc1(@InterfaceC5670cr1 O22 o22) {
        this(new d(o22, null));
    }

    @HT1({HT1.a.Y})
    public C4394Uc1(@InterfaceC5670cr1 d dVar) {
        P22 p22;
        this.X = new a();
        this.Z = new C4992a32.j[4];
        this.Y0 = new C4992a32.j[4];
        this.Z0 = new BitSet(8);
        this.c1 = new Matrix();
        this.d1 = new Path();
        this.e1 = new Path();
        this.f1 = new RectF();
        this.g1 = new RectF();
        this.h1 = new Region();
        this.i1 = new Region();
        Paint paint = new Paint(1);
        this.j1 = paint;
        Paint paint2 = new Paint(1);
        this.k1 = paint2;
        this.l1 = new M22();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            p22 = P22.l();
        } else {
            p22 = new P22();
        }
        this.n1 = p22;
        this.r1 = new RectF();
        this.s1 = true;
        this.t1 = true;
        this.w1 = new C5850db2[4];
        this.Y = dVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        c1();
        Y0(getState());
        this.m1 = new b();
    }

    @HT1({HT1.a.Y})
    /* renamed from: o.Uc1$d */
    /* loaded from: classes3.dex */
    public static class d extends Drawable.ConstantState {
        @InterfaceC5670cr1
        public O22 a;
        @InterfaceC11300zs1
        public C10751xc2 b;
        @InterfaceC11300zs1
        public C9523sa0 c;
        @InterfaceC11300zs1
        public ColorFilter d;
        @InterfaceC11300zs1
        public ColorStateList e;
        @InterfaceC11300zs1
        public ColorStateList f;
        @InterfaceC11300zs1
        public ColorStateList g;
        @InterfaceC11300zs1
        public ColorStateList h;
        @InterfaceC11300zs1
        public PorterDuff.Mode i;
        @InterfaceC11300zs1
        public Rect j;
        public float k;
        public float l;
        public float m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public float f629o;
        public float p;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;
        public boolean v;
        public Paint.Style w;

        public d(@InterfaceC5670cr1 O22 o22, @InterfaceC11300zs1 C9523sa0 c9523sa0) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = PorterDuff.Mode.SRC_IN;
            this.j = null;
            this.k = 1.0f;
            this.l = 1.0f;
            this.n = 255;
            this.f629o = 0.0f;
            this.p = 0.0f;
            this.q = 0.0f;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            this.v = false;
            this.w = Paint.Style.FILL_AND_STROKE;
            this.a = o22;
            this.c = c9523sa0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @InterfaceC5670cr1
        public Drawable newDrawable() {
            C4394Uc1 c4394Uc1 = new C4394Uc1(this);
            c4394Uc1.a1 = true;
            c4394Uc1.b1 = true;
            return c4394Uc1;
        }

        public d(@InterfaceC5670cr1 d dVar) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = PorterDuff.Mode.SRC_IN;
            this.j = null;
            this.k = 1.0f;
            this.l = 1.0f;
            this.n = 255;
            this.f629o = 0.0f;
            this.p = 0.0f;
            this.q = 0.0f;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            this.v = false;
            this.w = Paint.Style.FILL_AND_STROKE;
            this.a = dVar.a;
            this.b = dVar.b;
            this.c = dVar.c;
            this.m = dVar.m;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.i = dVar.i;
            this.h = dVar.h;
            this.n = dVar.n;
            this.k = dVar.k;
            this.t = dVar.t;
            this.r = dVar.r;
            this.v = dVar.v;
            this.l = dVar.l;
            this.f629o = dVar.f629o;
            this.p = dVar.p;
            this.q = dVar.q;
            this.s = dVar.s;
            this.u = dVar.u;
            this.g = dVar.g;
            this.w = dVar.w;
            if (dVar.j != null) {
                this.j = new Rect(dVar.j);
            }
        }
    }
}
