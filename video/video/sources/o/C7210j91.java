package o;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import o.C4394Uc1;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.j91  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7210j91 {
    public final MaterialButton a;
    @InterfaceC5670cr1
    public O22 b;
    @InterfaceC11300zs1
    public C10751xc2 c;
    @InterfaceC11300zs1
    public C6092eb2 d;
    @InterfaceC11300zs1
    public C4394Uc1.e e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    @InterfaceC11300zs1
    public PorterDuff.Mode l;
    @InterfaceC11300zs1
    public ColorStateList m;
    @InterfaceC11300zs1
    public ColorStateList n;
    @InterfaceC11300zs1

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f772o;
    @InterfaceC11300zs1
    public Drawable p;
    public boolean t;
    public LayerDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public C7210j91(MaterialButton materialButton, @InterfaceC5670cr1 O22 o22) {
        this.a = materialButton;
        this.b = o22;
    }

    public void A(@InterfaceC9397s30 int i) {
        L(this.h, i);
    }

    public void B(@InterfaceC9397s30 int i) {
        L(i, this.i);
    }

    public void C(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.f772o != colorStateList) {
            this.f772o = colorStateList;
            if (this.a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.a.getBackground()).setColor(QU1.e(colorStateList));
            }
        }
    }

    public void D(@InterfaceC5670cr1 O22 o22) {
        this.b = o22;
        this.c = null;
        N();
    }

    public void E(boolean z) {
        this.q = z;
        P();
    }

    public void F(@InterfaceC5670cr1 C10751xc2 c10751xc2) {
        this.c = c10751xc2;
        N();
    }

    public void G(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            P();
        }
    }

    public void H(int i) {
        if (this.k != i) {
            this.k = i;
            P();
        }
    }

    public void I(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            if (g() != null) {
                g().setTintList(this.m);
            }
        }
    }

    public void J(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        if (this.l != mode) {
            this.l = mode;
            if (g() != null && this.l != null) {
                g().setTintMode(this.l);
            }
        }
    }

    public void K(boolean z) {
        this.u = z;
    }

    public final void L(@InterfaceC9397s30 int i, @InterfaceC9397s30 int i2) {
        int paddingStart = this.a.getPaddingStart();
        int paddingTop = this.a.getPaddingTop();
        int paddingEnd = this.a.getPaddingEnd();
        int paddingBottom = this.a.getPaddingBottom();
        int i3 = this.h;
        int i4 = this.i;
        this.i = i2;
        this.h = i;
        if (!this.r) {
            M();
        }
        this.a.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void M() {
        this.a.setInternalBackground(a());
        C4394Uc1 g = g();
        if (g != null) {
            g.x0(this.w);
            g.setState(this.a.getDrawableState());
        }
    }

    public final void N() {
        C4394Uc1 g = g();
        if (g != null) {
            C10751xc2 c10751xc2 = this.c;
            if (c10751xc2 != null) {
                g.O0(c10751xc2);
            } else {
                g.setShapeAppearanceModel(this.b);
            }
            C6092eb2 c6092eb2 = this.d;
            if (c6092eb2 != null) {
                g.v0(c6092eb2);
            }
        }
        C4394Uc1 p = p();
        if (p != null) {
            C10751xc2 c10751xc22 = this.c;
            if (c10751xc22 != null) {
                p.O0(c10751xc22);
            } else {
                p.setShapeAppearanceModel(this.b);
            }
            C6092eb2 c6092eb22 = this.d;
            if (c6092eb22 != null) {
                p.v0(c6092eb22);
            }
        }
        InterfaceC6946i32 f = f();
        if (f != null) {
            f.setShapeAppearanceModel(this.b);
            if (f instanceof C4394Uc1) {
                C4394Uc1 c4394Uc1 = (C4394Uc1) f;
                C10751xc2 c10751xc23 = this.c;
                if (c10751xc23 != null) {
                    c4394Uc1.O0(c10751xc23);
                }
                C6092eb2 c6092eb23 = this.d;
                if (c6092eb23 != null) {
                    c4394Uc1.v0(c6092eb23);
                }
            }
        }
    }

    public void O(int i, int i2) {
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setBounds(this.f, this.h, i2 - this.g, i - this.i);
        }
    }

    public final void P() {
        int i;
        C4394Uc1 g = g();
        C4394Uc1 p = p();
        if (g != null) {
            g.Q0(this.k, this.n);
            if (p != null) {
                float f = this.k;
                if (this.q) {
                    i = C9179r91.d(this.a, C7025iN1.c.colorSurface);
                } else {
                    i = 0;
                }
                p.P0(f, i);
            }
        }
    }

    @InterfaceC5670cr1
    public final InsetDrawable Q(Drawable drawable) {
        return new InsetDrawable(drawable, this.f, this.h, this.g, this.i);
    }

    public final Drawable a() {
        int i;
        C4394Uc1 c4394Uc1 = new C4394Uc1(this.b);
        C10751xc2 c10751xc2 = this.c;
        if (c10751xc2 != null) {
            c4394Uc1.O0(c10751xc2);
        }
        C6092eb2 c6092eb2 = this.d;
        if (c6092eb2 != null) {
            c4394Uc1.v0(c6092eb2);
        }
        C4394Uc1.e eVar = this.e;
        if (eVar != null) {
            c4394Uc1.A0(eVar);
        }
        c4394Uc1.i0(this.a.getContext());
        c4394Uc1.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            c4394Uc1.setTintMode(mode);
        }
        c4394Uc1.Q0(this.k, this.n);
        C4394Uc1 c4394Uc12 = new C4394Uc1(this.b);
        C10751xc2 c10751xc22 = this.c;
        if (c10751xc22 != null) {
            c4394Uc12.O0(c10751xc22);
        }
        C6092eb2 c6092eb22 = this.d;
        if (c6092eb22 != null) {
            c4394Uc12.v0(c6092eb22);
        }
        c4394Uc12.setTint(0);
        float f = this.k;
        if (this.q) {
            i = C9179r91.d(this.a, C7025iN1.c.colorSurface);
        } else {
            i = 0;
        }
        c4394Uc12.P0(f, i);
        C4394Uc1 c4394Uc13 = new C4394Uc1(this.b);
        this.p = c4394Uc13;
        C10751xc2 c10751xc23 = this.c;
        if (c10751xc23 != null) {
            c4394Uc13.O0(c10751xc23);
        }
        C6092eb2 c6092eb23 = this.d;
        if (c6092eb23 != null) {
            ((C4394Uc1) this.p).v0(c6092eb23);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(QU1.e(this.f772o), Q(new LayerDrawable(new Drawable[]{c4394Uc12, c4394Uc1})), this.p);
        this.v = rippleDrawable;
        return rippleDrawable;
    }

    public int b() {
        return this.j;
    }

    @InterfaceC11300zs1
    public C6092eb2 c() {
        return this.d;
    }

    public int d() {
        return this.i;
    }

    public int e() {
        return this.h;
    }

    @InterfaceC11300zs1
    public InterfaceC6946i32 f() {
        LayerDrawable layerDrawable = this.v;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.v.getNumberOfLayers() > 2) {
                return (InterfaceC6946i32) this.v.getDrawable(2);
            }
            return (InterfaceC6946i32) this.v.getDrawable(1);
        }
        return null;
    }

    @InterfaceC11300zs1
    public C4394Uc1 g() {
        return h(false);
    }

    @InterfaceC11300zs1
    public final C4394Uc1 h(boolean z) {
        LayerDrawable layerDrawable = this.v;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            return (C4394Uc1) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    @InterfaceC11300zs1
    public ColorStateList i() {
        return this.f772o;
    }

    @InterfaceC5670cr1
    public O22 j() {
        return this.b;
    }

    @InterfaceC11300zs1
    public C10751xc2 k() {
        return this.c;
    }

    @InterfaceC11300zs1
    public ColorStateList l() {
        return this.n;
    }

    public int m() {
        return this.k;
    }

    public ColorStateList n() {
        return this.m;
    }

    public PorterDuff.Mode o() {
        return this.l;
    }

    @InterfaceC11300zs1
    public final C4394Uc1 p() {
        return h(true);
    }

    public boolean q() {
        return this.r;
    }

    public boolean r() {
        return this.t;
    }

    public boolean s() {
        return this.u;
    }

    public void t(@InterfaceC5670cr1 TypedArray typedArray) {
        this.f = typedArray.getDimensionPixelOffset(C7025iN1.o.k5, 0);
        this.g = typedArray.getDimensionPixelOffset(C7025iN1.o.l5, 0);
        this.h = typedArray.getDimensionPixelOffset(C7025iN1.o.m5, 0);
        this.i = typedArray.getDimensionPixelOffset(C7025iN1.o.n5, 0);
        int i = C7025iN1.o.r5;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.j = dimensionPixelSize;
            D(this.b.x(dimensionPixelSize));
            this.s = true;
        }
        this.k = typedArray.getDimensionPixelSize(C7025iN1.o.E5, 0);
        this.l = C10920yI2.t(typedArray.getInt(C7025iN1.o.q5, -1), PorterDuff.Mode.SRC_IN);
        this.m = C4297Tc1.a(this.a.getContext(), typedArray, C7025iN1.o.p5);
        this.n = C4297Tc1.a(this.a.getContext(), typedArray, C7025iN1.o.D5);
        this.f772o = C4297Tc1.a(this.a.getContext(), typedArray, C7025iN1.o.A5);
        this.t = typedArray.getBoolean(C7025iN1.o.o5, false);
        this.w = typedArray.getDimensionPixelSize(C7025iN1.o.s5, 0);
        this.u = typedArray.getBoolean(C7025iN1.o.F5, true);
        int paddingStart = this.a.getPaddingStart();
        int paddingTop = this.a.getPaddingTop();
        int paddingEnd = this.a.getPaddingEnd();
        int paddingBottom = this.a.getPaddingBottom();
        if (typedArray.hasValue(C7025iN1.o.i5)) {
            v();
        } else {
            M();
        }
        this.a.setPaddingRelative(paddingStart + this.f, paddingTop + this.h, paddingEnd + this.g, paddingBottom + this.i);
    }

    public void u(int i) {
        if (g() != null) {
            g().setTint(i);
        }
    }

    public void v() {
        this.r = true;
        this.a.setSupportBackgroundTintList(this.m);
        this.a.setSupportBackgroundTintMode(this.l);
    }

    public void w(boolean z) {
        this.t = z;
    }

    public void x(int i) {
        if (this.s && this.j == i) {
            return;
        }
        this.j = i;
        this.s = true;
        D(this.b.x(i));
    }

    public void y(@InterfaceC11300zs1 C4394Uc1.e eVar) {
        this.e = eVar;
        C4394Uc1 g = g();
        if (g != null) {
            g.A0(eVar);
        }
    }

    public void z(@InterfaceC5670cr1 C6092eb2 c6092eb2) {
        this.d = c6092eb2;
        if (this.c != null) {
            N();
        }
    }
}
