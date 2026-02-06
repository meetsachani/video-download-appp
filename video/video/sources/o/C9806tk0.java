package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.tk0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9806tk0 extends Drawable {
    public final Drawable a;
    public final Drawable b;
    public final float[] c;
    public float d;

    public C9806tk0(@InterfaceC11300zs1 Drawable drawable, @InterfaceC11300zs1 Drawable drawable2) {
        Drawable bVar;
        Drawable bVar2;
        int i;
        if (drawable != null) {
            bVar = drawable.getConstantState().newDrawable().mutate();
        } else {
            bVar = new b();
        }
        this.a = bVar;
        if (drawable2 != null) {
            bVar2 = drawable2.getConstantState().newDrawable().mutate();
        } else {
            bVar2 = new b();
        }
        this.b = bVar2;
        if (drawable != null) {
            i = D60.f(drawable);
        } else {
            i = 3;
        }
        int f = drawable2 != null ? D60.f(drawable2) : 3;
        D60.m(bVar, i);
        D60.m(bVar2, f);
        bVar2.setAlpha(0);
        this.c = new float[2];
    }

    public void a(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f) {
        if (this.d != f) {
            this.d = f;
            C10781xk0.a(f, this.c);
            this.a.setAlpha((int) (this.c[0] * 255.0f));
            this.b.setAlpha((int) (this.c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        this.a.draw(canvas);
        this.b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.a.getIntrinsicHeight(), this.b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.a.getIntrinsicWidth(), this.b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.a.getMinimumHeight(), this.b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.a.getMinimumWidth(), this.b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.a.isStateful() && !this.b.isStateful()) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.d <= 0.5f) {
            this.a.setAlpha(i);
            this.b.setAlpha(0);
        } else {
            this.a.setAlpha(0);
            this.b.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.setBounds(i, i2, i3, i4);
        this.b.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@InterfaceC11300zs1 ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.a.setState(iArr);
        boolean state2 = this.b.setState(iArr);
        if (!state && !state2) {
            return false;
        }
        return true;
    }

    /* renamed from: o.tk0$b */
    /* loaded from: classes3.dex */
    public static class b extends Drawable {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@InterfaceC5670cr1 Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@InterfaceC11300zs1 ColorFilter colorFilter) {
        }
    }
}
