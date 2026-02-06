package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import o.OL1;

/* renamed from: o.Kc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3416Kc extends C2719Dc {
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public C3416Kc(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    @Override // o.C2719Dc
    public void c(AttributeSet attributeSet, int i) {
        super.c(attributeSet, i);
        Context context = this.d.getContext();
        int[] iArr = OL1.m.i0;
        C2872Ep2 G = C2872Ep2.G(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.d;
        C6516gH2.G1(seekBar, seekBar.getContext(), iArr, attributeSet, G.B(), i, 0);
        Drawable i2 = G.i(OL1.m.j0);
        if (i2 != null) {
            this.d.setThumb(i2);
        }
        m(G.h(OL1.m.k0));
        int i3 = OL1.m.m0;
        if (G.C(i3)) {
            this.g = X60.e(G.o(i3, -1), this.g);
            this.i = true;
        }
        int i4 = OL1.m.l0;
        if (G.C(i4)) {
            this.f = G.d(i4);
            this.h = true;
        }
        G.I();
        f();
    }

    public final void f() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable r = D60.r(drawable.mutate());
                this.e = r;
                if (this.h) {
                    D60.o(r, this.f);
                }
                if (this.i) {
                    D60.p(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        int i;
        if (this.e != null) {
            int max = this.d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public void h() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    public Drawable i() {
        return this.e;
    }

    public ColorStateList j() {
        return this.f;
    }

    public PorterDuff.Mode k() {
        return this.g;
    }

    public void l() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void m(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.d);
            D60.m(drawable, this.d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            f();
        }
        this.d.invalidate();
    }

    public void n(ColorStateList colorStateList) {
        this.f = colorStateList;
        this.h = true;
        f();
    }

    public void o(PorterDuff.Mode mode) {
        this.g = mode;
        this.i = true;
        f();
    }
}
