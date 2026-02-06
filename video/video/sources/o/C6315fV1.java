package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import o.EL1;

/* renamed from: o.fV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6315fV1 extends Drawable {
    public static final double q = Math.cos(Math.toRadians(45.0d));
    public static final float r = 1.5f;
    public static a s;
    public final int a;
    public Paint c;
    public Paint d;
    public final RectF e;
    public float f;
    public Path g;
    public float h;
    public float i;
    public float j;
    public ColorStateList k;
    public final int m;
    public final int n;
    public boolean l = true;

    /* renamed from: o  reason: collision with root package name */
    public boolean f743o = true;
    public boolean p = false;
    public Paint b = new Paint(5);

    /* renamed from: o.fV1$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    public C6315fV1(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.m = resources.getColor(EL1.b.d);
        this.n = resources.getColor(EL1.b.c);
        this.a = resources.getDimensionPixelSize(EL1.c.a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f = (int) (f + 0.5f);
        this.e = new RectF();
        Paint paint2 = new Paint(this.c);
        this.d = paint2;
        paint2.setAntiAlias(false);
        s(f2, f3);
    }

    public static float c(float f, float f2, boolean z) {
        if (z) {
            return (float) (f + ((1.0d - q) * f2));
        }
        return f;
    }

    public static float d(float f, float f2, boolean z) {
        if (z) {
            return (float) ((f * 1.5f) + ((1.0d - q) * f2));
        }
        return f * 1.5f;
    }

    public final void a(Rect rect) {
        float f = this.h;
        float f2 = 1.5f * f;
        this.e.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        b();
    }

    public final void b() {
        float f = this.f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.i;
        rectF2.inset(-f2, -f2);
        Path path = this.g;
        if (path == null) {
            this.g = new Path();
        } else {
            path.reset();
        }
        this.g.setFillType(Path.FillType.EVEN_ODD);
        this.g.moveTo(-this.f, 0.0f);
        this.g.rLineTo(-this.i, 0.0f);
        this.g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.g.arcTo(rectF, 270.0f, -90.0f, false);
        this.g.close();
        float f3 = this.f;
        float f4 = f3 / (this.i + f3);
        Paint paint = this.c;
        float f5 = this.f + this.i;
        int i = this.m;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.n}, new float[]{0.0f, f4, 1.0f}, tileMode));
        Paint paint2 = this.d;
        float f6 = this.f;
        float f7 = this.i;
        float f8 = (-f6) - f7;
        int i2 = this.m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, f8, new int[]{i2, i2, this.n}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        this.d.setAntiAlias(false);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.l) {
            a(getBounds());
            this.l = false;
        }
        canvas.translate(0.0f, this.j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.j) / 2.0f);
        s.a(canvas, this.e, this.f, this.b);
    }

    public final void e(Canvas canvas) {
        boolean z;
        boolean z2;
        Canvas canvas2;
        float f = this.f;
        float f2 = (-f) - this.i;
        float f3 = f + this.a + (this.j / 2.0f);
        float f4 = 2.0f * f3;
        if (this.e.width() - f4 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.e.height() - f4 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        int save = canvas.save();
        RectF rectF = this.e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.g, this.c);
        if (z) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, f2, this.e.width() - f4, -this.f, this.d);
        } else {
            canvas2 = canvas;
        }
        canvas2.restoreToCount(save);
        int save2 = canvas2.save();
        RectF rectF2 = this.e;
        canvas2.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.g, this.c);
        if (z) {
            canvas2.drawRect(0.0f, f2, this.e.width() - f4, (-this.f) + this.i, this.d);
        }
        canvas2.restoreToCount(save2);
        int save3 = canvas2.save();
        RectF rectF3 = this.e;
        canvas2.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.g, this.c);
        if (z2) {
            canvas2.drawRect(0.0f, f2, this.e.height() - f4, -this.f, this.d);
        }
        canvas2.restoreToCount(save3);
        int save4 = canvas2.save();
        RectF rectF4 = this.e;
        canvas2.translate(rectF4.right - f3, rectF4.top + f3);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.g, this.c);
        if (z2) {
            canvas2.drawRect(0.0f, f2, this.e.height() - f4, -this.f, this.d);
        }
        canvas2.restoreToCount(save4);
    }

    public ColorStateList f() {
        return this.k;
    }

    public float g() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(d(this.h, this.f, this.f743o));
        int ceil2 = (int) Math.ceil(c(this.h, this.f, this.f743o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public void h(Rect rect) {
        getPadding(rect);
    }

    public float i() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.k;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    public float j() {
        float f = this.h;
        return (Math.max(f, this.f + this.a + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.h * 1.5f) + this.a) * 2.0f);
    }

    public float k() {
        float f = this.h;
        return (Math.max(f, this.f + this.a + (f / 2.0f)) * 2.0f) + ((this.h + this.a) * 2.0f);
    }

    public float l() {
        return this.j;
    }

    public void m(boolean z) {
        this.f743o = z;
        invalidateSelf();
    }

    public final void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.k = colorStateList;
        this.b.setColor(colorStateList.getColorForState(getState(), this.k.getDefaultColor()));
    }

    public void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.b.getColor() == colorForState) {
            return false;
        }
        this.b.setColor(colorForState);
        this.l = true;
        invalidateSelf();
        return true;
    }

    public void p(float f) {
        if (f >= 0.0f) {
            float f2 = (int) (f + 0.5f);
            if (this.f == f2) {
                return;
            }
            this.f = f2;
            this.l = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    public void q(float f) {
        s(this.j, f);
    }

    public void r(float f) {
        s(f, this.h);
    }

    public final void s(float f, float f2) {
        if (f >= 0.0f) {
            if (f2 >= 0.0f) {
                float t = t(f);
                float t2 = t(f2);
                if (t > t2) {
                    if (!this.p) {
                        this.p = true;
                    }
                    t = t2;
                }
                if (this.j == t && this.h == t2) {
                    return;
                }
                this.j = t;
                this.h = t2;
                this.i = (int) ((t * 1.5f) + this.a + 0.5f);
                this.l = true;
                invalidateSelf();
                return;
            }
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
        throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.b.setAlpha(i);
        this.c.setAlpha(i);
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }

    public final int t(float f) {
        int i = (int) (f + 0.5f);
        if (i % 2 == 1) {
            return i - 1;
        }
        return i;
    }
}
