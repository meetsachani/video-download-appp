package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import o.OL1;

/* renamed from: o.yc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10991yc {
    public final ImageView a;
    public C2676Cp2 b;
    public C2676Cp2 c;
    public C2676Cp2 d;
    public int e = 0;

    public C10991yc(ImageView imageView) {
        this.a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.d == null) {
            this.d = new C2676Cp2();
        }
        C2676Cp2 c2676Cp2 = this.d;
        c2676Cp2.a();
        ColorStateList a = C10452wN0.a(this.a);
        if (a != null) {
            c2676Cp2.d = true;
            c2676Cp2.a = a;
        }
        PorterDuff.Mode b = C10452wN0.b(this.a);
        if (b != null) {
            c2676Cp2.c = true;
            c2676Cp2.b = b;
        }
        if (!c2676Cp2.d && !c2676Cp2.c) {
            return false;
        }
        C9038qc.j(drawable, c2676Cp2, this.a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.a.getDrawable() != null) {
            this.a.getDrawable().setLevel(this.e);
        }
    }

    public void c() {
        Drawable drawable = this.a.getDrawable();
        if (drawable != null) {
            X60.b(drawable);
        }
        if (drawable != null) {
            if (!m() || !a(drawable)) {
                C2676Cp2 c2676Cp2 = this.c;
                if (c2676Cp2 != null) {
                    C9038qc.j(drawable, c2676Cp2, this.a.getDrawableState());
                    return;
                }
                C2676Cp2 c2676Cp22 = this.b;
                if (c2676Cp22 != null) {
                    C9038qc.j(drawable, c2676Cp22, this.a.getDrawableState());
                }
            }
        }
    }

    public ColorStateList d() {
        C2676Cp2 c2676Cp2 = this.c;
        if (c2676Cp2 != null) {
            return c2676Cp2.a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        C2676Cp2 c2676Cp2 = this.c;
        if (c2676Cp2 != null) {
            return c2676Cp2.b;
        }
        return null;
    }

    public boolean f() {
        if (this.a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    public void g(AttributeSet attributeSet, int i) {
        int u;
        Context context = this.a.getContext();
        int[] iArr = OL1.m.d0;
        C2872Ep2 G = C2872Ep2.G(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.a;
        C6516gH2.G1(imageView, imageView.getContext(), iArr, attributeSet, G.B(), i, 0);
        try {
            Drawable drawable = this.a.getDrawable();
            if (drawable == null && (u = G.u(OL1.m.f0, -1)) != -1 && (drawable = C3220Ic.b(this.a.getContext(), u)) != null) {
                this.a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                X60.b(drawable);
            }
            int i2 = OL1.m.g0;
            if (G.C(i2)) {
                C10452wN0.c(this.a, G.d(i2));
            }
            int i3 = OL1.m.h0;
            if (G.C(i3)) {
                C10452wN0.d(this.a, X60.e(G.o(i3, -1), null));
            }
            G.I();
        } catch (Throwable th) {
            G.I();
            throw th;
        }
    }

    public void h(Drawable drawable) {
        this.e = drawable.getLevel();
    }

    public void i(int i) {
        if (i != 0) {
            Drawable b = C3220Ic.b(this.a.getContext(), i);
            if (b != null) {
                X60.b(b);
            }
            this.a.setImageDrawable(b);
        } else {
            this.a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.b == null) {
                this.b = new C2676Cp2();
            }
            C2676Cp2 c2676Cp2 = this.b;
            c2676Cp2.a = colorStateList;
            c2676Cp2.d = true;
        } else {
            this.b = null;
        }
        c();
    }

    public void k(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new C2676Cp2();
        }
        C2676Cp2 c2676Cp2 = this.c;
        c2676Cp2.a = colorStateList;
        c2676Cp2.d = true;
        c();
    }

    public void l(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new C2676Cp2();
        }
        C2676Cp2 c2676Cp2 = this.c;
        c2676Cp2.b = mode;
        c2676Cp2.c = true;
        c();
    }

    public final boolean m() {
        if (this.b != null) {
            return true;
        }
        return false;
    }
}
