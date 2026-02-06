package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import o.C7025iN1;

@Deprecated
/* loaded from: classes3.dex */
public class L22 extends C5249b70 {
    public static final double m1 = Math.cos(Math.toRadians(45.0d));
    public static final float n1 = 1.5f;
    public static final float o1 = 0.25f;
    public static final float p1 = 0.5f;
    public static final float q1 = 1.0f;
    @InterfaceC5670cr1
    public final Paint Y;
    @InterfaceC5670cr1
    public final RectF Y0;
    @InterfaceC5670cr1
    public final Paint Z;
    public float Z0;
    public Path a1;
    public float b1;
    public float c1;
    public float d1;
    public float e1;
    public boolean f1;
    public final int g1;
    public final int h1;
    public final int i1;
    public boolean j1;
    public float k1;
    public boolean l1;

    public L22(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f1 = true;
        this.j1 = true;
        this.l1 = false;
        this.g1 = C10201vM.g(context, C7025iN1.e.design_fab_shadow_start_color);
        this.h1 = C10201vM.g(context, C7025iN1.e.design_fab_shadow_mid_color);
        this.i1 = C10201vM.g(context, C7025iN1.e.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.Y = paint;
        paint.setStyle(Paint.Style.FILL);
        this.Z0 = Math.round(f);
        this.Y0 = new RectF();
        Paint paint2 = new Paint(paint);
        this.Z = paint2;
        paint2.setAntiAlias(false);
        r(f2, f3);
    }

    public static float e(float f, float f2, boolean z) {
        if (z) {
            return (float) (f + ((1.0d - m1) * f2));
        }
        return f;
    }

    public static float f(float f, float f2, boolean z) {
        if (z) {
            return (float) ((f * 1.5f) + ((1.0d - m1) * f2));
        }
        return f * 1.5f;
    }

    public static int s(float f) {
        int round = Math.round(f);
        if (round % 2 == 1) {
            return round - 1;
        }
        return round;
    }

    public final void c(@InterfaceC5670cr1 Rect rect) {
        float f = this.c1;
        float f2 = 1.5f * f;
        this.Y0.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        Drawable a = a();
        RectF rectF = this.Y0;
        a.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        d();
    }

    public final void d() {
        float f = this.Z0;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.d1;
        rectF2.inset(-f2, -f2);
        Path path = this.a1;
        if (path == null) {
            this.a1 = new Path();
        } else {
            path.reset();
        }
        this.a1.setFillType(Path.FillType.EVEN_ODD);
        this.a1.moveTo(-this.Z0, 0.0f);
        this.a1.rLineTo(-this.d1, 0.0f);
        this.a1.arcTo(rectF2, 180.0f, 90.0f, false);
        this.a1.arcTo(rectF, 270.0f, -90.0f, false);
        this.a1.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.Z0 / f3;
            this.Y.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.g1, this.h1, this.i1}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.Z.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.g1, this.h1, this.i1}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.Z.setAntiAlias(false);
    }

    @Override // o.C5249b70, android.graphics.drawable.Drawable
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        if (this.f1) {
            c(getBounds());
            this.f1 = false;
        }
        g(canvas);
        super.draw(canvas);
    }

    public final void g(@InterfaceC5670cr1 Canvas canvas) {
        boolean z;
        boolean z2;
        float f;
        int i;
        int save = canvas.save();
        canvas.rotate(this.k1, this.Y0.centerX(), this.Y0.centerY());
        float f2 = this.Z0;
        float f3 = (-f2) - this.d1;
        float f4 = f2 * 2.0f;
        if (this.Y0.width() - f4 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (this.Y0.height() - f4 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f5 = this.e1;
        float f6 = f2 / ((f5 - (0.5f * f5)) + f2);
        float f7 = f2 / ((f5 - (0.25f * f5)) + f2);
        float f8 = f2 / ((f5 - (f5 * 1.0f)) + f2);
        int save2 = canvas.save();
        RectF rectF = this.Y0;
        canvas.translate(rectF.left + f2, rectF.top + f2);
        canvas.scale(f6, f7);
        canvas.drawPath(this.a1, this.Y);
        if (z) {
            canvas.scale(1.0f / f6, 1.0f);
            f = 1.0f;
            i = save2;
            canvas.drawRect(0.0f, f3, this.Y0.width() - f4, -this.Z0, this.Z);
        } else {
            f = 1.0f;
            i = save2;
        }
        canvas.restoreToCount(i);
        int save3 = canvas.save();
        RectF rectF2 = this.Y0;
        canvas.translate(rectF2.right - f2, rectF2.bottom - f2);
        canvas.scale(f6, f8);
        canvas.rotate(180.0f);
        canvas.drawPath(this.a1, this.Y);
        if (z) {
            canvas.scale(f / f6, f);
            canvas.drawRect(0.0f, f3, this.Y0.width() - f4, this.d1 + (-this.Z0), this.Z);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.Y0;
        canvas.translate(rectF3.left + f2, rectF3.bottom - f2);
        canvas.scale(f6, f8);
        canvas.rotate(270.0f);
        canvas.drawPath(this.a1, this.Y);
        if (z2) {
            canvas.scale(1.0f / f8, 1.0f);
            canvas.drawRect(0.0f, f3, this.Y0.height() - f4, -this.Z0, this.Z);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.Y0;
        canvas.translate(rectF4.right - f2, rectF4.top + f2);
        canvas.scale(f6, f7);
        canvas.rotate(90.0f);
        canvas.drawPath(this.a1, this.Y);
        if (z2) {
            canvas.scale(1.0f / f7, 1.0f);
            canvas.drawRect(0.0f, f3, this.Y0.height() - f4, -this.Z0, this.Z);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(save);
    }

    @Override // o.C5249b70, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // o.C5249b70, android.graphics.drawable.Drawable
    public boolean getPadding(@InterfaceC5670cr1 Rect rect) {
        int ceil = (int) Math.ceil(f(this.c1, this.Z0, this.j1));
        int ceil2 = (int) Math.ceil(e(this.c1, this.Z0, this.j1));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float h() {
        return this.Z0;
    }

    public float i() {
        return this.c1;
    }

    public float j() {
        float f = this.c1;
        return (Math.max(f, this.Z0 + ((f * 1.5f) / 2.0f)) * 2.0f) + (this.c1 * 1.5f * 2.0f);
    }

    public float k() {
        float f = this.c1;
        return (Math.max(f, this.Z0 + (f / 2.0f)) * 2.0f) + (this.c1 * 2.0f);
    }

    public float l() {
        return this.e1;
    }

    public void m(boolean z) {
        this.j1 = z;
        invalidateSelf();
    }

    public void n(float f) {
        float round = Math.round(f);
        if (this.Z0 == round) {
            return;
        }
        this.Z0 = round;
        this.f1 = true;
        invalidateSelf();
    }

    public void o(float f) {
        r(this.e1, f);
    }

    @Override // o.C5249b70, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f1 = true;
    }

    public final void p(float f) {
        if (this.k1 != f) {
            this.k1 = f;
            invalidateSelf();
        }
    }

    public void q(float f) {
        r(f, this.c1);
    }

    public void r(float f, float f2) {
        if (f >= 0.0f && f2 >= 0.0f) {
            float s = s(f);
            float s2 = s(f2);
            if (s > s2) {
                if (!this.l1) {
                    this.l1 = true;
                }
                s = s2;
            }
            if (this.e1 == s && this.c1 == s2) {
                return;
            }
            this.e1 = s;
            this.c1 = s2;
            this.d1 = Math.round(s * 1.5f);
            this.b1 = s2;
            this.f1 = true;
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("invalid shadow size");
    }

    @Override // o.C5249b70, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        this.Y.setAlpha(i);
        this.Z.setAlpha(i);
    }
}
