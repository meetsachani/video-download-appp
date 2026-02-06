package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import o.OL1;

/* renamed from: o.Nb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3705Nb {
    public final View a;
    public C2676Cp2 d;
    public C2676Cp2 e;
    public C2676Cp2 f;
    public int c = -1;
    public final C9038qc b = C9038qc.b();

    public C3705Nb(View view) {
        this.a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f == null) {
            this.f = new C2676Cp2();
        }
        C2676Cp2 c2676Cp2 = this.f;
        c2676Cp2.a();
        ColorStateList Q = C6516gH2.Q(this.a);
        if (Q != null) {
            c2676Cp2.d = true;
            c2676Cp2.a = Q;
        }
        PorterDuff.Mode R = C6516gH2.R(this.a);
        if (R != null) {
            c2676Cp2.c = true;
            c2676Cp2.b = R;
        }
        if (!c2676Cp2.d && !c2676Cp2.c) {
            return false;
        }
        C9038qc.j(drawable, c2676Cp2, this.a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.a.getBackground();
        if (background != null) {
            if (!k() || !a(background)) {
                C2676Cp2 c2676Cp2 = this.e;
                if (c2676Cp2 != null) {
                    C9038qc.j(background, c2676Cp2, this.a.getDrawableState());
                    return;
                }
                C2676Cp2 c2676Cp22 = this.d;
                if (c2676Cp22 != null) {
                    C9038qc.j(background, c2676Cp22, this.a.getDrawableState());
                }
            }
        }
    }

    public ColorStateList c() {
        C2676Cp2 c2676Cp2 = this.e;
        if (c2676Cp2 != null) {
            return c2676Cp2.a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        C2676Cp2 c2676Cp2 = this.e;
        if (c2676Cp2 != null) {
            return c2676Cp2.b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i) {
        Context context = this.a.getContext();
        int[] iArr = OL1.m.c7;
        C2872Ep2 G = C2872Ep2.G(context, attributeSet, iArr, i, 0);
        View view = this.a;
        C6516gH2.G1(view, view.getContext(), iArr, attributeSet, G.B(), i, 0);
        try {
            int i2 = OL1.m.d7;
            if (G.C(i2)) {
                this.c = G.u(i2, -1);
                ColorStateList f = this.b.f(this.a.getContext(), this.c);
                if (f != null) {
                    h(f);
                }
            }
            int i3 = OL1.m.e7;
            if (G.C(i3)) {
                C6516gH2.R1(this.a, G.d(i3));
            }
            int i4 = OL1.m.f7;
            if (G.C(i4)) {
                C6516gH2.S1(this.a, X60.e(G.o(i4, -1), null));
            }
            G.I();
        } catch (Throwable th) {
            G.I();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.c = -1;
        h(null);
        b();
    }

    public void g(int i) {
        ColorStateList colorStateList;
        this.c = i;
        C9038qc c9038qc = this.b;
        if (c9038qc != null) {
            colorStateList = c9038qc.f(this.a.getContext(), i);
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new C2676Cp2();
            }
            C2676Cp2 c2676Cp2 = this.d;
            c2676Cp2.a = colorStateList;
            c2676Cp2.d = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new C2676Cp2();
        }
        C2676Cp2 c2676Cp2 = this.e;
        c2676Cp2.a = colorStateList;
        c2676Cp2.d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new C2676Cp2();
        }
        C2676Cp2 c2676Cp2 = this.e;
        c2676Cp2.b = mode;
        c2676Cp2.c = true;
        b();
    }

    public final boolean k() {
        if (this.d != null) {
            return true;
        }
        return false;
    }
}
