package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;
import o.C10548wm2;
import o.C2653Ck;
import o.C7025iN1;
import o.HT1;

@InterfaceC3980Pv1(markerClass = {InterfaceC11259zi0.class})
/* renamed from: o.Bk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2555Bk extends Drawable implements C10548wm2.b {
    public static final String i1 = "Badge";
    public static final int j1 = 8388661;
    public static final int k1 = 8388659;
    @Deprecated
    public static final int l1 = 8388693;
    @Deprecated
    public static final int m1 = 8388691;
    @InterfaceC4698Xf2
    public static final int n1 = C7025iN1.n.Widget_MaterialComponents_Badge;
    @InterfaceC8568og
    public static final int o1 = C7025iN1.c.badgeStyle;
    public static final String p1 = "+";
    public static final String q1 = "…";
    public static final int r1 = 0;
    public static final int s1 = 1;
    public static final int t1 = 0;
    public static final int u1 = 1;
    public static final int v1 = -1;
    public static final int w1 = -2;
    public static final float x1 = 0.3f;
    @InterfaceC5670cr1
    public final WeakReference<Context> X;
    @InterfaceC5670cr1
    public final C4394Uc1 Y;
    @InterfaceC5670cr1
    public final Rect Y0;
    @InterfaceC5670cr1
    public final C10548wm2 Z;
    @InterfaceC5670cr1
    public final C2653Ck Z0;
    public float a1;
    public float b1;
    public int c1;
    public float d1;
    public float e1;
    public float f1;
    @InterfaceC11300zs1
    public WeakReference<View> g1;
    @InterfaceC11300zs1
    public WeakReference<FrameLayout> h1;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Bk$a */
    /* loaded from: classes3.dex */
    public @interface a {
    }

    public C2555Bk(@InterfaceC5670cr1 Context context, @XN2 int i, @InterfaceC8568og int i2, @InterfaceC4698Xf2 int i3, @InterfaceC11300zs1 C2653Ck.a aVar) {
        int k;
        int j;
        this.X = new WeakReference<>(context);
        C7608kn2.c(context);
        this.Y0 = new Rect();
        C10548wm2 c10548wm2 = new C10548wm2(this);
        this.Z = c10548wm2;
        c10548wm2.g().setTextAlign(Paint.Align.CENTER);
        C2653Ck c2653Ck = new C2653Ck(context, i, i2, i3, aVar);
        this.Z0 = c2653Ck;
        if (S()) {
            k = c2653Ck.o();
        } else {
            k = c2653Ck.k();
        }
        if (S()) {
            j = c2653Ck.n();
        } else {
            j = c2653Ck.j();
        }
        this.Y = new C4394Uc1(O22.b(context, k, j).m());
        g0();
    }

    public static void M0(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    @InterfaceC5670cr1
    public static C2555Bk g(@InterfaceC5670cr1 Context context) {
        return new C2555Bk(context, 0, o1, n1, null);
    }

    @InterfaceC5670cr1
    public static C2555Bk h(@InterfaceC5670cr1 Context context, @XN2 int i) {
        return new C2555Bk(context, i, o1, n1, null);
    }

    @InterfaceC5670cr1
    public static C2555Bk i(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 C2653Ck.a aVar) {
        return new C2555Bk(context, 0, o1, n1, aVar);
    }

    public final float A(float f) {
        return (this.a1 - this.e1) + f;
    }

    public void A0(@PK1 int i) {
        if (i != this.Z0.i()) {
            this.Z0.Q(i);
            Q0();
        }
    }

    public int B() {
        return this.Z0.w();
    }

    public void B0(@PK1 int i) {
        this.Z0.d0(i);
        Q0();
    }

    public int C() {
        return this.Z0.x();
    }

    public void C0(int i) {
        if (this.Z0.w() != i) {
            this.Z0.e0(i);
            c0();
        }
    }

    public int D() {
        if (this.Z0.F()) {
            return this.Z0.y();
        }
        return 0;
    }

    public void D0(int i) {
        if (this.Z0.x() != i) {
            this.Z0.f0(i);
            c0();
        }
    }

    @InterfaceC5670cr1
    public final String E() {
        if (this.c1 != -2 && D() > this.c1) {
            Context context = this.X.get();
            if (context == null) {
                return "";
            }
            return String.format(this.Z0.z(), context.getString(C7025iN1.m.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.c1), p1);
        }
        return NumberFormat.getInstance(this.Z0.z()).format(D());
    }

    public void E0(int i) {
        int max = Math.max(0, i);
        if (this.Z0.y() != max) {
            this.Z0.g0(max);
            d0();
        }
    }

    @InterfaceC11300zs1
    public final String F() {
        Context context;
        if (this.Z0.s() == 0 || (context = this.X.get()) == null) {
            return null;
        }
        if (this.c1 != -2 && D() > this.c1) {
            return context.getString(this.Z0.p(), Integer.valueOf(this.c1));
        }
        return context.getResources().getQuantityString(this.Z0.s(), D(), Integer.valueOf(D()));
    }

    public void F0(@InterfaceC11300zs1 String str) {
        if (!TextUtils.equals(this.Z0.B(), str)) {
            this.Z0.i0(str);
            e0();
        }
    }

    public final float G(float f, float f2) {
        return ((this.a1 + this.e1) - f) + f2;
    }

    public void G0(@InterfaceC4698Xf2 int i) {
        this.Z0.j0(i);
        a0();
    }

    @InterfaceC5670cr1
    public C2653Ck.a H() {
        return this.Z0.A();
    }

    public void H0(int i) {
        J0(i);
        I0(i);
    }

    @InterfaceC11300zs1
    public String I() {
        return this.Z0.B();
    }

    public void I0(@PK1 int i) {
        this.Z0.k0(i);
        Q0();
    }

    @InterfaceC11300zs1
    public final String J() {
        String I = I();
        int B = B();
        if (B != -2 && I != null && I.length() > B) {
            Context context = this.X.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(C7025iN1.m.m3_exceed_max_badge_text_suffix), I.substring(0, B - 1), "…");
        }
        return I;
    }

    public void J0(@PK1 int i) {
        this.Z0.l0(i);
        Q0();
    }

    @InterfaceC11300zs1
    public final CharSequence K() {
        CharSequence q = this.Z0.q();
        if (q != null) {
            return q;
        }
        return I();
    }

    public void K0(@PK1 int i) {
        if (i != this.Z0.m()) {
            this.Z0.U(i);
            Q0();
        }
    }

    public final float L(float f) {
        return (this.b1 - this.f1) + f;
    }

    public void L0(boolean z) {
        this.Z0.m0(z);
        f0();
    }

    public final int M() {
        int u;
        int i;
        if (S()) {
            u = this.Z0.t();
        } else {
            u = this.Z0.u();
        }
        if (this.Z0.k == 1) {
            if (S()) {
                i = this.Z0.j;
            } else {
                i = this.Z0.i;
            }
            u += i;
        }
        return u + this.Z0.d();
    }

    public final int N() {
        int E = this.Z0.E();
        if (S()) {
            E = this.Z0.D();
            Context context = this.X.get();
            if (context != null) {
                E = C5600ca.c(E, E - this.Z0.v(), C5600ca.b(0.0f, 1.0f, 0.3f, 1.0f, C4297Tc1.f(context) - 1.0f));
            }
        }
        if (this.Z0.k == 0) {
            E -= Math.round(this.f1);
        }
        return E + this.Z0.e();
    }

    public void N0(@InterfaceC5670cr1 View view) {
        P0(view, null);
    }

    public int O() {
        return this.Z0.E();
    }

    @Deprecated
    public void O0(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            P0(view, (FrameLayout) viewGroup);
            return;
        }
        throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
    }

    @PK1
    public int P() {
        return this.Z0.D();
    }

    public void P0(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 FrameLayout frameLayout) {
        this.g1 = new WeakReference<>(view);
        this.h1 = new WeakReference<>(frameLayout);
        M0(view);
        Q0();
        invalidateSelf();
    }

    @PK1
    public int Q() {
        return this.Z0.E();
    }

    public final void Q0() {
        View view;
        Context context = this.X.get();
        WeakReference<View> weakReference = this.g1;
        FrameLayout frameLayout = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.Y0);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.h1;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            }
            if (frameLayout != null) {
                frameLayout.offsetDescendantRectToMyCoords(view, rect2);
            }
            d(rect2, view);
            C2849Ek.q(this.Y0, this.a1, this.b1, this.e1, this.f1);
            float f = this.d1;
            if (f != -1.0f) {
                this.Y.t0(f);
            }
            if (!rect.equals(this.Y0)) {
                this.Y.setBounds(this.Y0);
            }
        }
    }

    @PK1
    public int R() {
        return this.Z0.m();
    }

    public final void R0() {
        if (B() != -2) {
            this.c1 = ((int) Math.pow(10.0d, B() - 1.0d)) - 1;
        } else {
            this.c1 = C();
        }
    }

    public final boolean S() {
        if (!U() && !T()) {
            return false;
        }
        return true;
    }

    public boolean T() {
        if (!this.Z0.G() && this.Z0.F()) {
            return true;
        }
        return false;
    }

    public boolean U() {
        return this.Z0.G();
    }

    public final void V() {
        this.Z.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    public final void W() {
        ColorStateList valueOf = ColorStateList.valueOf(this.Z0.g());
        if (this.Y.G() != valueOf) {
            this.Y.y0(valueOf);
            invalidateSelf();
        }
    }

    public final void X() {
        this.Z.m(true);
        Z();
        Q0();
        invalidateSelf();
    }

    public final void Y() {
        FrameLayout frameLayout;
        WeakReference<View> weakReference = this.g1;
        if (weakReference != null && weakReference.get() != null) {
            View view = this.g1.get();
            WeakReference<FrameLayout> weakReference2 = this.h1;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            } else {
                frameLayout = null;
            }
            P0(view, frameLayout);
        }
    }

    public final void Z() {
        int k;
        int j;
        Context context = this.X.get();
        if (context == null) {
            return;
        }
        C4394Uc1 c4394Uc1 = this.Y;
        if (S()) {
            k = this.Z0.o();
        } else {
            k = this.Z0.k();
        }
        if (S()) {
            j = this.Z0.n();
        } else {
            j = this.Z0.j();
        }
        c4394Uc1.setShapeAppearanceModel(O22.b(context, k, j).m());
        invalidateSelf();
    }

    @Override // o.C10548wm2.b
    @HT1({HT1.a.Y})
    public void a() {
        invalidateSelf();
    }

    public final void a0() {
        C9081qm2 c9081qm2;
        Context context = this.X.get();
        if (context == null || this.Z.e() == (c9081qm2 = new C9081qm2(context, this.Z0.C()))) {
            return;
        }
        this.Z.l(c9081qm2, context);
        b0();
        Q0();
        invalidateSelf();
    }

    public final void b(@InterfaceC5670cr1 View view) {
        ViewParent t = t();
        if (t == null) {
            t = view.getParent();
        }
        if ((t instanceof View) && (t.getParent() instanceof View)) {
            c(view, (View) t.getParent());
        }
    }

    public final void b0() {
        this.Z.g().setColor(this.Z0.l());
        invalidateSelf();
    }

    public final void c(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 View view2) {
        float f;
        float f2;
        boolean z;
        ViewParent t = t();
        if (t == null) {
            float y = view.getY();
            f2 = view.getX();
            t = view.getParent();
            f = y;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        while (true) {
            z = t instanceof View;
            if (!z || t == view2) {
                break;
            }
            ViewParent parent = t.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view3 = (View) t;
            f += view3.getY();
            f2 += view3.getX();
            t = t.getParent();
        }
        if (z) {
            float L = L(f);
            float A = A(f2);
            View view4 = (View) t;
            float r = r(view4.getHeight(), f);
            float G = G(view4.getWidth(), f2);
            if (L < 0.0f) {
                this.b1 += Math.abs(L);
            }
            if (A < 0.0f) {
                this.a1 += Math.abs(A);
            }
            if (r > 0.0f) {
                this.b1 -= Math.abs(r);
            }
            if (G > 0.0f) {
                this.a1 -= Math.abs(G);
            }
        }
    }

    public final void c0() {
        R0();
        this.Z.m(true);
        Q0();
        invalidateSelf();
    }

    public final void d(@InterfaceC5670cr1 Rect rect, @InterfaceC5670cr1 View view) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (S()) {
            f = this.Z0.d;
        } else {
            f = this.Z0.c;
        }
        this.d1 = f;
        if (f != -1.0f) {
            this.e1 = f;
            this.f1 = f;
        } else {
            if (S()) {
                f2 = this.Z0.g;
            } else {
                f2 = this.Z0.e;
            }
            this.e1 = Math.round(f2 / 2.0f);
            if (S()) {
                f3 = this.Z0.h;
            } else {
                f3 = this.Z0.f;
            }
            this.f1 = Math.round(f3 / 2.0f);
        }
        if (S()) {
            String n = n();
            this.e1 = Math.max(this.e1, (this.Z.h(n) / 2.0f) + this.Z0.i());
            float max = Math.max(this.f1, (this.Z.f(n) / 2.0f) + this.Z0.m());
            this.f1 = max;
            this.e1 = Math.max(this.e1, max);
        }
        int N = N();
        int h = this.Z0.h();
        if (h != 8388691 && h != 8388693) {
            this.b1 = rect.top + N;
        } else {
            this.b1 = rect.bottom - N;
        }
        int M = M();
        int h2 = this.Z0.h();
        if (h2 != 8388659 && h2 != 8388691) {
            if (this.Z0.l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f5 = (rect.right + this.e1) - M;
                } else {
                    f5 = (rect.left - this.e1) + M;
                }
            } else if (view.getLayoutDirection() == 0) {
                f5 = (rect.right - this.e1) + ((this.f1 * 2.0f) - M);
            } else {
                f5 = (rect.left + this.e1) - ((this.f1 * 2.0f) - M);
            }
            this.a1 = f5;
        } else {
            if (this.Z0.l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f4 = (rect.left + this.e1) - ((this.f1 * 2.0f) - M);
                } else {
                    f4 = (rect.right - this.e1) + ((this.f1 * 2.0f) - M);
                }
            } else if (view.getLayoutDirection() == 0) {
                f4 = (rect.left - this.e1) + M;
            } else {
                f4 = (rect.right + this.e1) - M;
            }
            this.a1 = f4;
        }
        if (this.Z0.H()) {
            b(view);
        } else {
            c(view, null);
        }
    }

    public final void d0() {
        if (!U()) {
            X();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.Y.draw(canvas);
            if (S()) {
                j(canvas);
            }
        }
    }

    public void e() {
        if (this.Z0.F()) {
            this.Z0.a();
            d0();
        }
    }

    public final void e0() {
        X();
    }

    public void f() {
        if (this.Z0.G()) {
            this.Z0.b();
            e0();
        }
    }

    public final void f0() {
        setVisible(this.Z0.I(), false);
    }

    public final void g0() {
        Z();
        a0();
        c0();
        X();
        V();
        W();
        b0();
        Y();
        Q0();
        f0();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.Z0.f();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.Y0.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.Y0.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h0(int i) {
        this.Z0.K(i);
        Q0();
    }

    public void i0(@PK1 int i) {
        this.Z0.L(i);
        Q0();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public final void j(Canvas canvas) {
        int round;
        String n = n();
        if (n != null) {
            Rect rect = new Rect();
            this.Z.g().getTextBounds(n, 0, n.length(), rect);
            float exactCenterY = this.b1 - rect.exactCenterY();
            float f = this.a1;
            if (rect.bottom <= 0) {
                round = (int) exactCenterY;
            } else {
                round = Math.round(exactCenterY);
            }
            canvas.drawText(n, f, round, this.Z.g());
        }
    }

    @Deprecated
    public void j0(boolean z) {
        if (this.Z0.H() != z) {
            this.Z0.N(z);
            WeakReference<View> weakReference = this.g1;
            if (weakReference != null && weakReference.get() != null) {
                b(this.g1.get());
            }
        }
    }

    public int k() {
        return this.Z0.d();
    }

    public void k0(@JF int i) {
        this.Z0.O(i);
        W();
    }

    @PK1
    public int l() {
        return this.Z0.e();
    }

    public void l0(int i) {
        C2653Ck c2653Ck = this.Z0;
        if (c2653Ck.l != i) {
            c2653Ck.l = i;
            Q0();
        }
    }

    @JF
    public int m() {
        return this.Y.G().getDefaultColor();
    }

    public void m0(int i) {
        if (i == 8388691 || i == 8388693) {
            Log.w(i1, "Bottom badge gravities are deprecated; please use a top gravity instead.");
        }
        if (this.Z0.h() != i) {
            this.Z0.P(i);
            Y();
        }
    }

    @InterfaceC11300zs1
    public final String n() {
        if (U()) {
            return J();
        }
        if (T()) {
            return E();
        }
        return null;
    }

    public void n0(@InterfaceC5670cr1 Locale locale) {
        if (!locale.equals(this.Z0.z())) {
            this.Z0.h0(locale);
            invalidateSelf();
        }
    }

    public int o() {
        return this.Z0.h();
    }

    public void o0(@JF int i) {
        if (this.Z.g().getColor() != i) {
            this.Z0.T(i);
            b0();
        }
    }

    @Override // android.graphics.drawable.Drawable, o.C10548wm2.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @InterfaceC5670cr1
    public Locale p() {
        return this.Z0.z();
    }

    public void p0(@InterfaceC4698Xf2 int i) {
        this.Z0.W(i);
        Z();
    }

    @JF
    public int q() {
        return this.Z.g().getColor();
    }

    public void q0(@InterfaceC4698Xf2 int i) {
        this.Z0.V(i);
        Z();
    }

    public final float r(float f, float f2) {
        return ((this.b1 + this.f1) - f) + f2;
    }

    public void r0(@InterfaceC4698Xf2 int i) {
        this.Z0.S(i);
        Z();
    }

    @InterfaceC11300zs1
    public CharSequence s() {
        if (!isVisible()) {
            return null;
        }
        if (U()) {
            return K();
        }
        if (T()) {
            return F();
        }
        return u();
    }

    public void s0(@InterfaceC4698Xf2 int i) {
        this.Z0.R(i);
        Z();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.Z0.M(i);
        V();
    }

    @InterfaceC11300zs1
    public FrameLayout t() {
        WeakReference<FrameLayout> weakReference = this.h1;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void t0(@InterfaceC3329Je2 int i) {
        this.Z0.X(i);
    }

    public final CharSequence u() {
        return this.Z0.r();
    }

    public void u0(@InterfaceC11300zs1 CharSequence charSequence) {
        this.Z0.Y(charSequence);
    }

    public int v() {
        return this.Z0.u();
    }

    public void v0(CharSequence charSequence) {
        this.Z0.Z(charSequence);
    }

    @PK1
    public int w() {
        return this.Z0.t();
    }

    public void w0(@RD1 int i) {
        this.Z0.a0(i);
    }

    @PK1
    public int x() {
        return this.Z0.u();
    }

    public void x0(int i) {
        z0(i);
        y0(i);
    }

    @PK1
    public int y() {
        return this.Z0.i();
    }

    public void y0(@PK1 int i) {
        this.Z0.b0(i);
        Q0();
    }

    @PK1
    public int z() {
        return this.Z0.v();
    }

    public void z0(@PK1 int i) {
        this.Z0.c0(i);
        Q0();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
