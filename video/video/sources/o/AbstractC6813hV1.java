package o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

/* renamed from: o.hV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6813hV1 extends Drawable {
    public static final int n = 3;
    public final Bitmap a;
    public int b;
    public final BitmapShader e;
    public float g;
    public boolean k;
    public int l;
    public int m;
    public int c = 119;
    public final Paint d = new Paint(3);
    public final Matrix f = new Matrix();
    public final Rect h = new Rect();
    public final RectF i = new RectF();
    public boolean j = true;

    public AbstractC6813hV1(Resources resources, Bitmap bitmap) {
        this.b = 160;
        if (resources != null) {
            this.b = resources.getDisplayMetrics().densityDpi;
        }
        this.a = bitmap;
        if (bitmap != null) {
            a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.e = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.m = -1;
        this.l = -1;
        this.e = null;
    }

    public static boolean j(float f) {
        if (f > 0.05f) {
            return true;
        }
        return false;
    }

    public final void a() {
        this.l = this.a.getScaledWidth(this.b);
        this.m = this.a.getScaledHeight(this.b);
    }

    public final Bitmap b() {
        return this.a;
    }

    public float c() {
        return this.g;
    }

    public int d() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        t();
        if (this.d.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.h, this.d);
            return;
        }
        RectF rectF = this.i;
        float f = this.g;
        canvas.drawRoundRect(rectF, f, f, this.d);
    }

    public final Paint e() {
        return this.d;
    }

    public void f(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    public boolean g() {
        return this.d.isAntiAlias();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        if (this.c != 119 || this.k || (bitmap = this.a) == null || bitmap.hasAlpha() || this.d.getAlpha() < 255 || j(this.g)) {
            return -3;
        }
        return -1;
    }

    public boolean h() {
        throw new UnsupportedOperationException();
    }

    public boolean i() {
        return this.k;
    }

    public void k(boolean z) {
        this.d.setAntiAlias(z);
        invalidateSelf();
    }

    public void l(boolean z) {
        this.k = z;
        this.j = true;
        if (z) {
            s();
            this.d.setShader(this.e);
            invalidateSelf();
            return;
        }
        m(0.0f);
    }

    public void m(float f) {
        if (this.g == f) {
            return;
        }
        this.k = false;
        if (j(f)) {
            this.d.setShader(this.e);
        } else {
            this.d.setShader(null);
        }
        this.g = f;
        invalidateSelf();
    }

    public void n(int i) {
        if (this.c != i) {
            this.c = i;
            this.j = true;
            invalidateSelf();
        }
    }

    public void o(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.k) {
            s();
        }
        this.j = true;
    }

    public void p(int i) {
        if (this.b != i) {
            if (i == 0) {
                i = 160;
            }
            this.b = i;
            if (this.a != null) {
                a();
            }
            invalidateSelf();
        }
    }

    public void q(Canvas canvas) {
        p(canvas.getDensity());
    }

    public void r(DisplayMetrics displayMetrics) {
        p(displayMetrics.densityDpi);
    }

    public final void s() {
        this.g = Math.min(this.m, this.l) / 2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.d.getAlpha()) {
            this.d.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.d.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.d.setFilterBitmap(z);
        invalidateSelf();
    }

    public void t() {
        AbstractC6813hV1 abstractC6813hV1;
        if (this.j) {
            if (this.k) {
                int min = Math.min(this.l, this.m);
                abstractC6813hV1 = this;
                abstractC6813hV1.f(this.c, min, min, getBounds(), this.h);
                int min2 = Math.min(abstractC6813hV1.h.width(), abstractC6813hV1.h.height());
                abstractC6813hV1.h.inset(Math.max(0, (abstractC6813hV1.h.width() - min2) / 2), Math.max(0, (abstractC6813hV1.h.height() - min2) / 2));
                abstractC6813hV1.g = min2 * 0.5f;
            } else {
                abstractC6813hV1 = this;
                abstractC6813hV1.f(abstractC6813hV1.c, abstractC6813hV1.l, abstractC6813hV1.m, getBounds(), abstractC6813hV1.h);
            }
            abstractC6813hV1.i.set(abstractC6813hV1.h);
            if (abstractC6813hV1.e != null) {
                Matrix matrix = abstractC6813hV1.f;
                RectF rectF = abstractC6813hV1.i;
                matrix.setTranslate(rectF.left, rectF.top);
                abstractC6813hV1.f.preScale(abstractC6813hV1.i.width() / abstractC6813hV1.a.getWidth(), abstractC6813hV1.i.height() / abstractC6813hV1.a.getHeight());
                abstractC6813hV1.e.setLocalMatrix(abstractC6813hV1.f);
                abstractC6813hV1.d.setShader(abstractC6813hV1.e);
            }
            abstractC6813hV1.j = false;
        }
    }
}
