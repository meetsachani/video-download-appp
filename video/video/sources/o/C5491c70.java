package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.OL1;

/* renamed from: o.c70  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5491c70 extends Drawable {
    public static final int m = 0;
    public static final int n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f703o = 2;
    public static final int p = 3;
    public static final float q = (float) Math.toRadians(45.0d);
    public final Paint a;
    public float b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public final Path g;
    public final int h;
    public boolean i;
    public float j;
    public float k;
    public int l;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.c70$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    public C5491c70(Context context) {
        Paint paint = new Paint();
        this.a = paint;
        this.g = new Path();
        this.i = false;
        this.l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, OL1.m.C3, OL1.b.o1, OL1.l.v1);
        p(obtainStyledAttributes.getColor(OL1.m.G3, 0));
        o(obtainStyledAttributes.getDimension(OL1.m.K3, 0.0f));
        t(obtainStyledAttributes.getBoolean(OL1.m.J3, true));
        r(Math.round(obtainStyledAttributes.getDimension(OL1.m.I3, 0.0f)));
        this.h = obtainStyledAttributes.getDimensionPixelSize(OL1.m.H3, 0);
        this.c = Math.round(obtainStyledAttributes.getDimension(OL1.m.F3, 0.0f));
        this.b = Math.round(obtainStyledAttributes.getDimension(OL1.m.D3, 0.0f));
        this.d = obtainStyledAttributes.getDimension(OL1.m.E3, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public static float k(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public float a() {
        return this.b;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.c;
    }

    public float d() {
        return this.a.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        int i;
        Rect bounds = getBounds();
        int i2 = this.l;
        boolean z = false;
        if (i2 != 0 && (i2 == 1 || (i2 == 3 ? D60.f(this) == 0 : D60.f(this) == 1))) {
            z = true;
        }
        float f4 = this.b;
        float k = k(this.c, (float) Math.sqrt(f4 * f4 * 2.0f), this.j);
        float k2 = k(this.c, this.d, this.j);
        float round = Math.round(k(0.0f, this.k, this.j));
        float k3 = k(0.0f, q, this.j);
        if (z) {
            f = 0.0f;
        } else {
            f = -180.0f;
        }
        if (z) {
            f2 = 180.0f;
        } else {
            f2 = 0.0f;
        }
        float k4 = k(f, f2, this.j);
        double d = k;
        double d2 = k3;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(d * Math.sin(d2));
        this.g.rewind();
        float k5 = k(this.e + this.a.getStrokeWidth(), -this.k, this.j);
        float f5 = (-k2) / 2.0f;
        this.g.moveTo(f5 + round, 0.0f);
        this.g.rLineTo(k2 - (round * 2.0f), 0.0f);
        this.g.moveTo(f5, k5);
        this.g.rLineTo(round2, round3);
        this.g.moveTo(f5, -k5);
        this.g.rLineTo(round2, -round3);
        this.g.close();
        canvas.save();
        float strokeWidth = this.a.getStrokeWidth();
        float height = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (height - (f3 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + this.e);
        if (this.f) {
            if (this.i ^ z2) {
                i = -1;
            } else {
                i = 1;
            }
            canvas.rotate(k4 * i);
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.g, this.a);
        canvas.restore();
    }

    public int e() {
        return this.a.getColor();
    }

    public int f() {
        return this.l;
    }

    public float g() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.a;
    }

    public float i() {
        return this.j;
    }

    public boolean j() {
        return this.f;
    }

    public void l(float f) {
        if (this.b != f) {
            this.b = f;
            invalidateSelf();
        }
    }

    public void m(float f) {
        if (this.d != f) {
            this.d = f;
            invalidateSelf();
        }
    }

    public void n(float f) {
        if (this.c != f) {
            this.c = f;
            invalidateSelf();
        }
    }

    public void o(float f) {
        if (this.a.getStrokeWidth() != f) {
            this.a.setStrokeWidth(f);
            this.k = (float) ((f / 2.0f) * Math.cos(q));
            invalidateSelf();
        }
    }

    public void p(int i) {
        if (i != this.a.getColor()) {
            this.a.setColor(i);
            invalidateSelf();
        }
    }

    public void q(int i) {
        if (i != this.l) {
            this.l = i;
            invalidateSelf();
        }
    }

    public void r(float f) {
        if (f != this.e) {
            this.e = f;
            invalidateSelf();
        }
    }

    public void s(float f) {
        if (this.j != f) {
            this.j = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.a.getAlpha()) {
            this.a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void t(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidateSelf();
        }
    }

    public void u(boolean z) {
        if (this.i != z) {
            this.i = z;
            invalidateSelf();
        }
    }
}
