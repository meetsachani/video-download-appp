package o;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import o.C3517Lc2;
import o.C7892ly;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public final class XE {
    public static final boolean A0 = false;
    @InterfaceC11300zs1
    public static final Paint B0 = null;
    public static final int C0 = 1090453759;
    public static final int D0 = 1;
    public static final String x0 = "CollapsingTextHelper";
    public static final String y0 = "…";
    public static final float z0 = 0.5f;
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public Typeface D;
    public C7892ly E;
    public C7892ly F;
    @InterfaceC11300zs1
    public CharSequence H;
    @InterfaceC11300zs1
    public CharSequence I;
    public boolean J;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int R;
    public int[] S;
    public boolean T;
    @InterfaceC5670cr1
    public final TextPaint U;
    @InterfaceC5670cr1
    public final TextPaint V;
    public TimeInterpolator W;
    public TimeInterpolator X;
    public float Y;
    public float Z;
    public final View a;
    public float a0;
    public float b;
    public ColorStateList b0;
    public boolean c;
    public float c0;
    public float d;
    public float d0;
    public float e;
    public float e0;
    public int f;
    public ColorStateList f0;
    @InterfaceC5670cr1
    public final Rect g;
    public float g0;
    @InterfaceC5670cr1
    public final Rect h;
    public float h0;
    @InterfaceC11300zs1
    public Rect i;
    public float i0;
    @InterfaceC5670cr1
    public final RectF j;
    public StaticLayout j0;
    public float k0;
    public float l0;
    public float m0;
    public CharSequence n0;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f658o;
    public ColorStateList p;
    public int q;
    public float r;
    public float s;
    public float t;
    @InterfaceC11300zs1
    public InterfaceC3614Mc2 t0;
    public float u;
    public float v;
    public float w;
    public boolean w0;
    public Typeface x;
    public Typeface y;
    public Typeface z;
    public int k = 16;
    public int l = 16;
    public float m = 15.0f;
    public float n = 15.0f;
    public TextUtils.TruncateAt G = TextUtils.TruncateAt.END;
    public boolean K = true;
    public int o0 = 1;
    public int p0 = 1;
    public float q0 = 0.0f;
    public float r0 = 1.0f;
    public int s0 = C3517Lc2.f537o;
    public int u0 = -1;
    public int v0 = -1;

    /* loaded from: classes3.dex */
    public class a implements C7892ly.a {
        public a() {
        }

        @Override // o.C7892ly.a
        public void a(Typeface typeface) {
            XE.this.q0(typeface);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements C7892ly.a {
        public b() {
        }

        @Override // o.C7892ly.a
        public void a(Typeface typeface) {
            XE.this.D0(typeface);
        }
    }

    public XE(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.U = textPaint;
        this.V = new TextPaint(textPaint);
        this.h = new Rect();
        this.g = new Rect();
        this.j = new RectF();
        this.e = e();
        b0(view.getContext().getResources().getConfiguration());
    }

    public static boolean V(float f, float f2) {
        if (Math.abs(f - f2) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    @JF
    public static int a(@JF int i, @JF int i2, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    public static float a0(float f, float f2, float f3, @InterfaceC11300zs1 TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C5600ca.a(f, f2, f3);
    }

    public static boolean f0(@InterfaceC5670cr1 Rect rect, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return true;
        }
        return false;
    }

    public int A() {
        return this.o0;
    }

    public void A0(ColorStateList colorStateList) {
        if (this.f658o != colorStateList) {
            this.f658o = colorStateList;
            d0();
        }
    }

    public ColorStateList B() {
        return this.f658o;
    }

    public void B0(int i) {
        if (this.k != i) {
            this.k = i;
            d0();
        }
    }

    public float C() {
        S(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public void C0(float f) {
        if (this.m != f) {
            this.m = f;
            d0();
        }
    }

    public int D() {
        return this.k;
    }

    public void D0(Typeface typeface) {
        if (E0(typeface)) {
            d0();
        }
    }

    public float E() {
        int i = this.v0;
        if (i != -1) {
            return i;
        }
        return F();
    }

    public final boolean E0(Typeface typeface) {
        C7892ly c7892ly = this.E;
        if (c7892ly != null) {
            c7892ly.c();
        }
        if (this.C != typeface) {
            this.C = typeface;
            Typeface b2 = Dw2.b(this.a.getContext().getResources().getConfiguration(), typeface);
            this.B = b2;
            if (b2 == null) {
                b2 = this.C;
            }
            this.A = b2;
            return true;
        }
        return false;
    }

    public float F() {
        S(this.V);
        return -this.V.ascent();
    }

    public void F0(float f) {
        float d = C9293rd1.d(f, 0.0f, 1.0f);
        if (d != this.b) {
            this.b = d;
            c();
        }
    }

    public float G() {
        return this.m;
    }

    public void G0(boolean z) {
        this.c = z;
    }

    public Typeface H() {
        Typeface typeface = this.A;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public void H0(float f) {
        this.d = f;
        this.e = e();
    }

    public float I() {
        return this.b;
    }

    @ES1(23)
    public void I0(int i) {
        this.s0 = i;
    }

    public float J() {
        return this.e;
    }

    public final void J0(float f) {
        h(f);
        this.a.postInvalidateOnAnimation();
    }

    @ES1(23)
    public int K() {
        return this.s0;
    }

    @ES1(23)
    public void K0(float f) {
        this.q0 = f;
    }

    public int L() {
        StaticLayout staticLayout = this.j0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @ES1(23)
    public void L0(@InterfaceC2501Av0(from = 0.0d) float f) {
        this.r0 = f;
    }

    @ES1(23)
    public float M() {
        return this.j0.getSpacingAdd();
    }

    public void M0(TimeInterpolator timeInterpolator) {
        this.W = timeInterpolator;
        d0();
    }

    @ES1(23)
    public float N() {
        return this.j0.getSpacingMultiplier();
    }

    public void N0(boolean z) {
        this.K = z;
    }

    public final Layout.Alignment O() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.k, this.J ? 1 : 0) & 7;
        if (absoluteGravity != 1) {
            if (absoluteGravity != 5) {
                if (this.J) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            } else if (this.J) {
                return Layout.Alignment.ALIGN_NORMAL;
            } else {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    public final boolean O0(int[] iArr) {
        this.S = iArr;
        if (Y()) {
            d0();
            return true;
        }
        return false;
    }

    @InterfaceC11300zs1
    public TimeInterpolator P() {
        return this.W;
    }

    @ES1(23)
    public void P0(@InterfaceC11300zs1 InterfaceC3614Mc2 interfaceC3614Mc2) {
        if (this.t0 != interfaceC3614Mc2) {
            this.t0 = interfaceC3614Mc2;
            e0(true);
        }
    }

    @InterfaceC11300zs1
    public CharSequence Q() {
        return this.H;
    }

    public void Q0(@InterfaceC11300zs1 CharSequence charSequence) {
        if (charSequence != null && TextUtils.equals(this.H, charSequence)) {
            return;
        }
        this.H = charSequence;
        this.I = null;
        d0();
    }

    public final void R(@InterfaceC5670cr1 TextPaint textPaint) {
        textPaint.setTextSize(this.n);
        textPaint.setTypeface(this.x);
        textPaint.setLetterSpacing(this.g0);
    }

    public void R0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        d0();
    }

    public final void S(@InterfaceC5670cr1 TextPaint textPaint) {
        textPaint.setTextSize(this.m);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.h0);
    }

    public void S0(@InterfaceC5670cr1 TextUtils.TruncateAt truncateAt) {
        this.G = truncateAt;
        d0();
    }

    @InterfaceC5670cr1
    public TextUtils.TruncateAt T() {
        return this.G;
    }

    public void T0(Typeface typeface) {
        boolean r0 = r0(typeface);
        boolean E0 = E0(typeface);
        if (!r0 && !E0) {
            return;
        }
        d0();
    }

    public final void U(float f) {
        Rect rect;
        if (this.c) {
            RectF rectF = this.j;
            if (f < this.e) {
                rect = this.g;
            } else {
                rect = this.h;
            }
            rectF.set(rect);
            return;
        }
        this.j.left = a0(this.g.left, this.h.left, f, this.W);
        this.j.top = a0(this.r, this.s, f, this.W);
        this.j.right = a0(this.g.right, this.h.right, f, this.W);
        this.j.bottom = a0(this.g.bottom, this.h.bottom, f, this.W);
    }

    public final boolean U0() {
        if (this.o0 > 1 || this.p0 > 1) {
            if (!this.J || this.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean V0() {
        if (this.p0 == 1) {
            return true;
        }
        return false;
    }

    public final boolean W() {
        if (this.a.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public void W0(int i) {
        R(this.V);
        float f = i;
        this.u0 = j(this.p0, this.V, this.H, f * (this.n / this.m), this.J).getHeight();
        S(this.V);
        this.v0 = j(this.o0, this.V, this.H, f, this.J).getHeight();
    }

    public boolean X() {
        return this.K;
    }

    public final boolean Y() {
        ColorStateList colorStateList = this.p;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.f658o;
            if (colorStateList2 != null && colorStateList2.isStateful()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean Z(@InterfaceC5670cr1 CharSequence charSequence, boolean z) {
        InterfaceC10059um2 interfaceC10059um2;
        if (z) {
            interfaceC10059um2 = C10302vm2.d;
        } else {
            interfaceC10059um2 = C10302vm2.c;
        }
        return interfaceC10059um2.isRtl(charSequence, 0, charSequence.length());
    }

    public final void b(boolean z) {
        float f;
        float f2;
        int i;
        CharSequence charSequence;
        i(1.0f, z);
        if (this.I != null && this.j0 != null) {
            if (V0()) {
                charSequence = TextUtils.ellipsize(this.I, this.U, this.j0.getWidth(), this.G);
            } else {
                charSequence = this.I;
            }
            this.n0 = charSequence;
        }
        CharSequence charSequence2 = this.n0;
        float f3 = 0.0f;
        if (charSequence2 != null) {
            this.k0 = c0(this.U, charSequence2);
        } else {
            this.k0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.l, this.J ? 1 : 0);
        Rect rect = this.i;
        if (rect == null) {
            rect = this.h;
        }
        int i2 = absoluteGravity & 112;
        if (i2 != 48) {
            if (i2 != 80) {
                this.s = rect.centerY() - ((this.U.descent() - this.U.ascent()) / 2.0f);
            } else {
                this.s = rect.bottom + this.U.ascent();
            }
        } else {
            this.s = rect.top;
        }
        int i3 = absoluteGravity & JE0.d;
        if (i3 != 1) {
            if (i3 != 5) {
                this.u = rect.left;
            } else {
                this.u = rect.right - this.k0;
            }
        } else {
            this.u = rect.centerX() - (this.k0 / 2.0f);
        }
        if (this.k0 <= this.h.width()) {
            float f4 = this.u;
            float max = f4 + Math.max(0.0f, this.h.left - f4);
            this.u = max;
            this.u = max + Math.min(0.0f, this.h.right - (this.k0 + max));
        }
        if (m() <= this.h.height()) {
            float f5 = this.s;
            float max2 = f5 + Math.max(0.0f, this.h.top - f5);
            this.s = max2;
            this.s = max2 + Math.min(0.0f, this.h.bottom - (r() + max2));
        }
        i(0.0f, z);
        StaticLayout staticLayout = this.j0;
        if (staticLayout != null) {
            f = staticLayout.getHeight();
        } else {
            f = 0.0f;
        }
        StaticLayout staticLayout2 = this.j0;
        if (staticLayout2 != null && this.o0 > 1) {
            f2 = staticLayout2.getWidth();
        } else {
            CharSequence charSequence3 = this.I;
            if (charSequence3 != null) {
                f2 = c0(this.U, charSequence3);
            } else {
                f2 = 0.0f;
            }
        }
        StaticLayout staticLayout3 = this.j0;
        if (staticLayout3 != null) {
            i = staticLayout3.getLineCount();
        } else {
            i = 0;
        }
        this.q = i;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.k, this.J ? 1 : 0);
        int i4 = absoluteGravity2 & 112;
        if (i4 != 48) {
            if (i4 != 80) {
                this.r = this.g.centerY() - (f / 2.0f);
            } else {
                float f6 = this.g.bottom - f;
                if (this.w0) {
                    f3 = this.U.descent();
                }
                this.r = f6 + f3;
            }
        } else {
            this.r = this.g.top;
        }
        int i5 = absoluteGravity2 & JE0.d;
        if (i5 != 1) {
            if (i5 != 5) {
                this.t = this.g.left;
            } else {
                this.t = this.g.right - f2;
            }
        } else {
            this.t = this.g.centerX() - (f2 / 2.0f);
        }
        J0(this.b);
    }

    public void b0(@InterfaceC5670cr1 Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.z;
            if (typeface != null) {
                this.y = Dw2.b(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = Dw2.b(configuration, typeface2);
            }
            Typeface typeface3 = this.y;
            if (typeface3 == null) {
                typeface3 = this.z;
            }
            this.x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            e0(true);
        }
    }

    public final void c() {
        g(this.b);
    }

    public final float c0(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final float d(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        float f2 = this.e;
        if (f <= f2) {
            return C5600ca.b(1.0f, 0.0f, this.d, f2, f);
        }
        return C5600ca.b(0.0f, 1.0f, f2, 1.0f, f);
    }

    public void d0() {
        e0(false);
    }

    public final float e() {
        float f = this.d;
        return f + ((1.0f - f) * 0.5f);
    }

    public void e0(boolean z) {
        if ((this.a.getHeight() > 0 && this.a.getWidth() > 0) || z) {
            b(z);
            c();
        }
    }

    public final boolean f(@InterfaceC5670cr1 CharSequence charSequence) {
        boolean W = W();
        if (this.K) {
            return Z(charSequence, W);
        }
        return W;
    }

    public final void g(float f) {
        float f2;
        U(f);
        if (this.c) {
            if (f < this.e) {
                this.v = this.t;
                this.w = this.r;
                J0(0.0f);
                f2 = 0.0f;
            } else {
                this.v = this.u;
                this.w = this.s - Math.max(0, this.f);
                J0(1.0f);
                f2 = 1.0f;
            }
        } else {
            this.v = a0(this.t, this.u, f, this.W);
            this.w = a0(this.r, this.s, f, this.W);
            J0(f);
            f2 = f;
        }
        TimeInterpolator timeInterpolator = C5600ca.b;
        m0(1.0f - a0(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        z0(a0(1.0f, 0.0f, f, timeInterpolator));
        if (this.p != this.f658o) {
            this.U.setColor(a(y(), w(), f2));
        } else {
            this.U.setColor(w());
        }
        float f3 = this.g0;
        float f4 = this.h0;
        if (f3 != f4) {
            this.U.setLetterSpacing(a0(f4, f3, f, timeInterpolator));
        } else {
            this.U.setLetterSpacing(f3);
        }
        this.N = a0(this.c0, this.Y, f, null);
        this.O = a0(this.d0, this.Z, f, null);
        this.P = a0(this.e0, this.a0, f, null);
        int a2 = a(x(this.f0), x(this.b0), f);
        this.Q = a2;
        this.U.setShadowLayer(this.N, this.O, this.P, a2);
        if (this.c) {
            this.U.setAlpha((int) (d(f) * this.U.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, C9179r91.a(this.Q, textPaint.getAlpha()));
            }
        }
        this.a.postInvalidateOnAnimation();
    }

    public void g0(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.p == colorStateList && this.f658o == colorStateList) {
            return;
        }
        this.p = colorStateList;
        this.f658o = colorStateList;
        d0();
    }

    public final void h(float f) {
        i(f, false);
    }

    public void h0(int i, int i2, int i3, int i4) {
        if (!f0(this.h, i, i2, i3, i4)) {
            this.h.set(i, i2, i3, i4);
            this.T = true;
        }
    }

    public final void i(float f, boolean z) {
        Typeface typeface;
        float f2;
        float f3;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        StaticLayout staticLayout;
        boolean z5;
        boolean z6;
        boolean z7;
        float a0;
        if (this.H != null) {
            float width = this.h.width();
            float width2 = this.g.width();
            float f4 = 1.0f;
            if (V(f, 1.0f)) {
                if (V0()) {
                    f2 = this.n;
                } else {
                    f2 = this.m;
                }
                if (V0()) {
                    f3 = this.g0;
                } else {
                    f3 = this.h0;
                }
                if (V0()) {
                    a0 = 1.0f;
                } else {
                    a0 = a0(this.m, this.n, f, this.X) / this.m;
                }
                this.L = a0;
                if (!V0()) {
                    width = width2;
                }
                typeface = this.x;
                width2 = width;
            } else {
                float f5 = this.m;
                float f6 = this.h0;
                typeface = this.A;
                if (V(f, 0.0f)) {
                    this.L = 1.0f;
                } else {
                    this.L = a0(this.m, this.n, f, this.X) / this.m;
                }
                float f7 = this.n / this.m;
                float f8 = width2 * f7;
                if (!z && !this.c && f8 > width && V0()) {
                    width2 = Math.min(width / f7, width2);
                }
                f2 = f5;
                f3 = f6;
            }
            if (f < 0.5f) {
                i = this.o0;
            } else {
                i = this.p0;
            }
            boolean z8 = false;
            if (width2 > 0.0f) {
                if (this.M != f2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.i0 != f3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.D != typeface) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.j0 != null && width2 != staticLayout.getWidth()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.R != i) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z2 && !z3 && !z5 && !z4 && !z6 && !this.T) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                this.M = f2;
                this.i0 = f3;
                this.D = typeface;
                this.T = false;
                this.R = i;
                TextPaint textPaint = this.U;
                if (this.L != 1.0f) {
                    z8 = true;
                }
                textPaint.setLinearText(z8);
                z8 = z7;
            }
            if (this.I != null && !z8) {
                return;
            }
            this.U.setTextSize(this.M);
            this.U.setTypeface(this.D);
            this.U.setLetterSpacing(this.i0);
            this.J = f(this.H);
            if (U0()) {
                i2 = i;
            } else {
                i2 = 1;
            }
            TextPaint textPaint2 = this.U;
            CharSequence charSequence = this.H;
            if (!V0()) {
                f4 = this.L;
            }
            StaticLayout j = j(i2, textPaint2, charSequence, width2 * f4, this.J);
            this.j0 = j;
            this.I = j.getText();
        }
    }

    public void i0(@InterfaceC5670cr1 Rect rect) {
        h0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final StaticLayout j(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        StaticLayout staticLayout;
        Layout.Alignment O;
        try {
            if (i == 1) {
                O = Layout.Alignment.ALIGN_NORMAL;
            } else {
                O = O();
            }
            staticLayout = C3517Lc2.c(charSequence, textPaint, (int) f).e(this.G).i(z).d(O).h(false).k(i).j(this.q0, this.r0).g(this.s0).m(this.t0).a();
        } catch (C3517Lc2.a e) {
            Log.e(x0, e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) C10907yF1.l(staticLayout);
    }

    public void j0(int i, int i2, int i3, int i4) {
        if (this.i == null) {
            this.i = new Rect(i, i2, i3, i4);
            this.T = true;
        }
        if (!f0(this.i, i, i2, i3, i4)) {
            this.i.set(i, i2, i3, i4);
            this.T = true;
        }
    }

    public void k(@InterfaceC5670cr1 Canvas canvas) {
        int save = canvas.save();
        if (this.I != null && this.j.width() > 0.0f && this.j.height() > 0.0f) {
            this.U.setTextSize(this.M);
            float f = this.v;
            float f2 = this.w;
            float f3 = this.L;
            if (f3 != 1.0f && !this.c) {
                canvas.scale(f3, f3, f, f2);
            }
            if (U0() && V0() && (!this.c || this.b > this.e)) {
                l(canvas, this.v - this.j0.getLineStart(0), f2);
            } else {
                canvas.translate(f, f2);
                this.j0.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public void k0(int i) {
        if (i != this.p0) {
            this.p0 = i;
            d0();
        }
    }

    public final void l(@InterfaceC5670cr1 Canvas canvas, float f, float f2) {
        int alpha = this.U.getAlpha();
        canvas.translate(f, f2);
        if (!this.c) {
            this.U.setAlpha((int) (this.m0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.U;
                textPaint.setShadowLayer(this.N, this.O, this.P, C9179r91.a(this.Q, textPaint.getAlpha()));
            }
            this.j0.draw(canvas);
        }
        if (!this.c) {
            this.U.setAlpha((int) (this.l0 * alpha));
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint2 = this.U;
            textPaint2.setShadowLayer(this.N, this.O, this.P, C9179r91.a(this.Q, textPaint2.getAlpha()));
        }
        int lineBaseline = this.j0.getLineBaseline(0);
        CharSequence charSequence = this.n0;
        float f3 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f3, this.U);
        if (i >= 31) {
            this.U.setShadowLayer(this.N, this.O, this.P, this.Q);
        }
        if (!this.c) {
            String trim = this.n0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.U.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.j0.getLineEnd(0), str.length()), 0.0f, f3, (Paint) this.U);
        }
    }

    public void l0(int i) {
        C9081qm2 c9081qm2 = new C9081qm2(this.a.getContext(), i);
        if (c9081qm2.k() != null) {
            this.p = c9081qm2.k();
        }
        if (c9081qm2.l() != 0.0f) {
            this.n = c9081qm2.l();
        }
        ColorStateList colorStateList = c9081qm2.c;
        if (colorStateList != null) {
            this.b0 = colorStateList;
        }
        this.Z = c9081qm2.i;
        this.a0 = c9081qm2.j;
        this.Y = c9081qm2.k;
        this.g0 = c9081qm2.m;
        C7892ly c7892ly = this.F;
        if (c7892ly != null) {
            c7892ly.c();
        }
        this.F = new C7892ly(new a(), c9081qm2.e());
        c9081qm2.h(this.a.getContext(), this.F);
        d0();
    }

    public float m() {
        R(this.V);
        return (-this.V.ascent()) + this.V.descent();
    }

    public final void m0(float f) {
        this.l0 = f;
        this.a.postInvalidateOnAnimation();
    }

    public float n() {
        R(this.V);
        return -this.V.ascent();
    }

    public void n0(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            d0();
        }
    }

    public void o(@InterfaceC5670cr1 RectF rectF, int i, int i2) {
        this.J = f(this.H);
        rectF.left = Math.max(s(i, i2), this.h.left);
        rectF.top = this.h.top;
        rectF.right = Math.min(t(rectF, i, i2), this.h.right);
        rectF.bottom = this.h.top + r();
        if (this.j0 != null && !V0()) {
            StaticLayout staticLayout = this.j0;
            float lineWidth = staticLayout.getLineWidth(staticLayout.getLineCount() - 1) * (this.n / this.m);
            if (this.J) {
                rectF.left = rectF.right - lineWidth;
            } else {
                rectF.right = rectF.left + lineWidth;
            }
        }
    }

    public void o0(int i) {
        if (this.l != i) {
            this.l = i;
            d0();
        }
    }

    public ColorStateList p() {
        return this.p;
    }

    public void p0(float f) {
        if (this.n != f) {
            this.n = f;
            d0();
        }
    }

    public int q() {
        return this.l;
    }

    public void q0(Typeface typeface) {
        if (r0(typeface)) {
            d0();
        }
    }

    public float r() {
        int i = this.u0;
        if (i != -1) {
            return i;
        }
        return n();
    }

    public final boolean r0(Typeface typeface) {
        C7892ly c7892ly = this.F;
        if (c7892ly != null) {
            c7892ly.c();
        }
        if (this.z != typeface) {
            this.z = typeface;
            Typeface b2 = Dw2.b(this.a.getContext().getResources().getConfiguration(), typeface);
            this.y = b2;
            if (b2 == null) {
                b2 = this.z;
            }
            this.x = b2;
            return true;
        }
        return false;
    }

    public final float s(int i, int i2) {
        if (i2 != 17 && (i2 & 7) != 1) {
            if ((i2 & 8388613) != 8388613 && (i2 & 5) != 5) {
                if (this.J) {
                    return this.h.right - this.k0;
                }
                return this.h.left;
            } else if (this.J) {
                return this.h.left;
            } else {
                return this.h.right - this.k0;
            }
        }
        return (i / 2.0f) - (this.k0 / 2.0f);
    }

    public void s0(int i) {
        this.f = i;
    }

    public final float t(@InterfaceC5670cr1 RectF rectF, int i, int i2) {
        if (i2 != 17 && (i2 & 7) != 1) {
            if ((i2 & 8388613) != 8388613 && (i2 & 5) != 5) {
                if (this.J) {
                    return this.h.right;
                }
                return rectF.left + this.k0;
            } else if (this.J) {
                return rectF.left + this.k0;
            } else {
                return this.h.right;
            }
        }
        return (i / 2.0f) + (this.k0 / 2.0f);
    }

    public void t0(int i, int i2, int i3, int i4) {
        u0(i, i2, i3, i4, true);
    }

    public float u() {
        return this.n;
    }

    public void u0(int i, int i2, int i3, int i4, boolean z) {
        if (f0(this.g, i, i2, i3, i4) && z == this.w0) {
            return;
        }
        this.g.set(i, i2, i3, i4);
        this.T = true;
        this.w0 = z;
    }

    public Typeface v() {
        Typeface typeface = this.x;
        if (typeface != null) {
            return typeface;
        }
        return Typeface.DEFAULT;
    }

    public void v0(@InterfaceC5670cr1 Rect rect) {
        t0(rect.left, rect.top, rect.right, rect.bottom);
    }

    @JF
    public int w() {
        return x(this.p);
    }

    public void w0(float f) {
        if (this.h0 != f) {
            this.h0 = f;
            d0();
        }
    }

    @JF
    public final int x(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.S;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public void x0(int i) {
        if (i != this.o0) {
            this.o0 = i;
            d0();
        }
    }

    @JF
    public final int y() {
        return x(this.f658o);
    }

    public void y0(int i) {
        C9081qm2 c9081qm2 = new C9081qm2(this.a.getContext(), i);
        if (c9081qm2.k() != null) {
            this.f658o = c9081qm2.k();
        }
        if (c9081qm2.l() != 0.0f) {
            this.m = c9081qm2.l();
        }
        ColorStateList colorStateList = c9081qm2.c;
        if (colorStateList != null) {
            this.f0 = colorStateList;
        }
        this.d0 = c9081qm2.i;
        this.e0 = c9081qm2.j;
        this.c0 = c9081qm2.k;
        this.h0 = c9081qm2.m;
        C7892ly c7892ly = this.E;
        if (c7892ly != null) {
            c7892ly.c();
        }
        this.E = new C7892ly(new b(), c9081qm2.e());
        c9081qm2.h(this.a.getContext(), this.E);
        d0();
    }

    public int z() {
        return this.q;
    }

    public final void z0(float f) {
        this.m0 = f;
        this.a.postInvalidateOnAnimation();
    }
}
