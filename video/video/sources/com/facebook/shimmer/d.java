package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class d extends Drawable {
    public final ValueAnimator.AnimatorUpdateListener a = new a();
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    @InterfaceC11300zs1
    public ValueAnimator e;
    @InterfaceC11300zs1
    public c f;

    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.invalidateSelf();
        }
    }

    public d() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public boolean a() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            return true;
        }
        return false;
    }

    public void b() {
        c cVar;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (cVar = this.f) != null && cVar.p && getCallback() != null) {
            this.e.start();
        }
    }

    public final float c(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public void d(@InterfaceC11300zs1 c cVar) {
        PorterDuff.Mode mode;
        this.f = cVar;
        if (cVar != null) {
            Paint paint = this.b;
            if (this.f.q) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        g();
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        float f;
        float c;
        float c2;
        if (this.f != null && this.b.getShader() != null) {
            float tan = (float) Math.tan(Math.toRadians(this.f.n));
            float height = this.c.height() + (this.c.width() * tan);
            float width = this.c.width() + (tan * this.c.height());
            ValueAnimator valueAnimator = this.e;
            float f2 = 0.0f;
            if (valueAnimator != null) {
                f = valueAnimator.getAnimatedFraction();
            } else {
                f = 0.0f;
            }
            int i = this.f.d;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        c2 = c(-width, width, f);
                    } else {
                        c = c(height, -height, f);
                    }
                } else {
                    c2 = c(width, -width, f);
                }
                f2 = c2;
                c = 0.0f;
            } else {
                c = c(-height, height, f);
            }
            this.d.reset();
            this.d.setRotate(this.f.n, this.c.width() / 2.0f, this.c.height() / 2.0f);
            this.d.postTranslate(f2, c);
            this.b.getShader().setLocalMatrix(this.d);
            canvas.drawRect(this.c, this.b);
        }
    }

    public void e() {
        if (this.e != null && !a() && getCallback() != null) {
            this.e.start();
        }
    }

    public void f() {
        if (this.e != null && a()) {
            this.e.cancel();
        }
    }

    public final void g() {
        c cVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width != 0 && height != 0 && (cVar = this.f) != null) {
            int e = cVar.e(width);
            int a2 = this.f.a(height);
            c cVar2 = this.f;
            boolean z = true;
            if (cVar2.g != 1) {
                int i = cVar2.d;
                if (i != 1 && i != 3) {
                    z = false;
                }
                if (z) {
                    e = 0;
                }
                if (!z) {
                    a2 = 0;
                }
                float f = a2;
                c cVar3 = this.f;
                radialGradient = new LinearGradient(0.0f, 0.0f, e, f, cVar3.b, cVar3.a, Shader.TileMode.CLAMP);
            } else {
                float max = (float) (Math.max(e, a2) / Math.sqrt(2.0d));
                c cVar4 = this.f;
                radialGradient = new RadialGradient(e / 2.0f, a2 / 2.0f, max, cVar4.b, cVar4.a, Shader.TileMode.CLAMP);
            }
            this.b.setShader(radialGradient);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        c cVar = this.f;
        if (cVar != null) {
            if (cVar.f159o || cVar.q) {
                return -3;
            }
            return -1;
        }
        return -1;
    }

    public final void h() {
        boolean z;
        if (this.f != null) {
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                this.e.cancel();
                this.e.removeAllUpdateListeners();
            } else {
                z = false;
            }
            c cVar = this.f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (cVar.u / cVar.t)) + 1.0f);
            this.e = ofFloat;
            ofFloat.setRepeatMode(this.f.s);
            this.e.setRepeatCount(this.f.r);
            ValueAnimator valueAnimator2 = this.e;
            c cVar2 = this.f;
            valueAnimator2.setDuration(cVar2.t + cVar2.u);
            this.e.addUpdateListener(this.a);
            if (z) {
                this.e.start();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        g();
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@InterfaceC11300zs1 ColorFilter colorFilter) {
    }
}
