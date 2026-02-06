package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class IC extends Drawable implements Animatable {
    public static final int d1 = 0;
    public static final float e1 = 11.0f;
    public static final float f1 = 3.0f;
    public static final int g1 = 12;
    public static final int h1 = 6;
    public static final int i1 = 1;
    public static final float j1 = 7.5f;
    public static final float k1 = 2.5f;
    public static final int l1 = 10;
    public static final int m1 = 5;
    public static final float o1 = 0.75f;
    public static final float p1 = 0.5f;
    public static final int q1 = 1332;
    public static final float r1 = 216.0f;
    public static final float s1 = 0.8f;
    public static final float t1 = 0.01f;
    public static final float u1 = 0.20999998f;
    public final d X;
    public float Y;
    public Animator Y0;
    public Resources Z;
    public float Z0;
    public boolean a1;
    public static final Interpolator b1 = new LinearInterpolator();
    public static final Interpolator c1 = new C10304vn0();
    public static final int[] n1 = {-16777216};

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            IC.this.G(floatValue, this.a);
            IC.this.d(floatValue, this.a, false);
            IC.this.invalidateSelf();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* loaded from: classes.dex */
    public static class d {
        public final RectF a = new RectF();
        public final Paint b;
        public final Paint c;
        public final Paint d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int[] i;
        public int j;
        public float k;
        public float l;
        public float m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public Path f492o;
        public float p;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;

        public d() {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.c = paint2;
            Paint paint3 = new Paint();
            this.d = paint3;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A(int i) {
            this.d.setColor(i);
        }

        public void B(float f) {
            this.q = f;
        }

        public void C(int i) {
            this.u = i;
        }

        public void D(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }

        public void E(int i) {
            this.j = i;
            this.u = this.i[i];
        }

        public void F(int[] iArr) {
            this.i = iArr;
            E(0);
        }

        public void G(float f) {
            this.f = f;
        }

        public void H(float f) {
            this.g = f;
        }

        public void I(boolean z) {
            if (this.n != z) {
                this.n = z;
            }
        }

        public void J(float f) {
            this.e = f;
        }

        public void K(Paint.Cap cap) {
            this.b.setStrokeCap(cap);
        }

        public void L(float f) {
            this.h = f;
            this.b.setStrokeWidth(f);
        }

        public void M() {
            this.k = this.e;
            this.l = this.f;
            this.m = this.g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.a;
            float f = this.q;
            float f2 = (this.h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.r * this.p) / 2.0f, this.h / 2.0f);
            }
            rectF.set(rect.centerX() - f2, rect.centerY() - f2, rect.centerX() + f2, rect.centerY() + f2);
            float f3 = this.e;
            float f4 = this.g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f + f4) * 360.0f) - f5;
            this.b.setColor(this.u);
            this.b.setAlpha(this.t);
            float f7 = this.h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.b);
            b(canvas, f5, f6, rectF);
        }

        public void b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.n) {
                Path path = this.f492o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f492o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f492o.moveTo(0.0f, 0.0f);
                this.f492o.lineTo(this.r * this.p, 0.0f);
                Path path3 = this.f492o;
                float f3 = this.p;
                path3.lineTo((this.r * f3) / 2.0f, this.s * f3);
                this.f492o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((this.r * this.p) / 2.0f), rectF.centerY() + (this.h / 2.0f));
                this.f492o.close();
                this.c.setColor(this.u);
                this.c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f492o, this.c);
                canvas.restore();
            }
        }

        public int c() {
            return this.t;
        }

        public float d() {
            return this.s;
        }

        public float e() {
            return this.p;
        }

        public float f() {
            return this.r;
        }

        public int g() {
            return this.d.getColor();
        }

        public float h() {
            return this.q;
        }

        public int[] i() {
            return this.i;
        }

        public float j() {
            return this.f;
        }

        public int k() {
            return this.i[l()];
        }

        public int l() {
            return (this.j + 1) % this.i.length;
        }

        public float m() {
            return this.g;
        }

        public boolean n() {
            return this.n;
        }

        public float o() {
            return this.e;
        }

        public int p() {
            return this.i[this.j];
        }

        public float q() {
            return this.l;
        }

        public float r() {
            return this.m;
        }

        public float s() {
            return this.k;
        }

        public Paint.Cap t() {
            return this.b.getStrokeCap();
        }

        public float u() {
            return this.h;
        }

        public void v() {
            E(l());
        }

        public void w() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
            J(0.0f);
            G(0.0f);
            H(0.0f);
        }

        public void x(int i) {
            this.t = i;
        }

        public void y(float f, float f2) {
            this.r = (int) f;
            this.s = (int) f2;
        }

        public void z(float f) {
            if (f != this.p) {
                this.p = f;
            }
        }
    }

    public IC(Context context) {
        this.Z = ((Context) C10907yF1.l(context)).getResources();
        d dVar = new d();
        this.X = dVar;
        dVar.F(n1);
        D(2.5f);
        F();
    }

    public final void A(float f, float f2, float f3, float f4) {
        d dVar = this.X;
        float f5 = this.Z.getDisplayMetrics().density;
        dVar.L(f2 * f5);
        dVar.B(f * f5);
        dVar.E(0);
        dVar.y(f3 * f5, f4 * f5);
    }

    public void B(float f, float f2) {
        this.X.J(f);
        this.X.G(f2);
        invalidateSelf();
    }

    public void C(Paint.Cap cap) {
        this.X.K(cap);
        invalidateSelf();
    }

    public void D(float f) {
        this.X.L(f);
        invalidateSelf();
    }

    public void E(int i) {
        if (i == 0) {
            A(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            A(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void F() {
        d dVar = this.X;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(b1);
        ofFloat.addListener(new b(dVar));
        this.Y0 = ofFloat;
    }

    public void G(float f, d dVar) {
        if (f > 0.75f) {
            dVar.C(e((f - 0.75f) / 0.25f, dVar.p(), dVar.k()));
        } else {
            dVar.C(dVar.p());
        }
    }

    public final void a(float f, d dVar) {
        G(f, dVar);
        dVar.J(dVar.s() + (((dVar.q() - 0.01f) - dVar.s()) * f));
        dVar.G(dVar.q());
        dVar.H(dVar.r() + ((((float) (Math.floor(dVar.r() / 0.8f) + 1.0d)) - dVar.r()) * f));
    }

    public void d(float f, d dVar, boolean z) {
        float interpolation;
        float f2;
        if (this.a1) {
            a(f, dVar);
        } else if (f == 1.0f && !z) {
        } else {
            float r = dVar.r();
            if (f < 0.5f) {
                interpolation = dVar.s();
                f2 = (c1.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float s = dVar.s() + 0.79f;
                interpolation = s - (((1.0f - c1.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = s;
            }
            dVar.J(interpolation);
            dVar.G(f2);
            dVar.H(r + (0.20999998f * f));
            z((f + this.Z0) * 216.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.Y, bounds.exactCenterX(), bounds.exactCenterY());
        this.X.a(canvas, bounds);
        canvas.restore();
    }

    public final int e(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) ((((i2 >> 24) & 255) - i3) * f))) << 24) | ((i4 + ((int) ((((i2 >> 16) & 255) - i4) * f))) << 16) | ((i5 + ((int) ((((i2 >> 8) & 255) - i5) * f))) << 8) | (i6 + ((int) (f * ((i2 & 255) - i6))));
    }

    public boolean f() {
        return this.X.n();
    }

    public float g() {
        return this.X.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.X.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.X.e();
    }

    public float i() {
        return this.X.f();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.Y0.isRunning();
    }

    public int j() {
        return this.X.g();
    }

    public float k() {
        return this.X.h();
    }

    public int[] l() {
        return this.X.i();
    }

    public float m() {
        return this.X.j();
    }

    public float n() {
        return this.X.m();
    }

    public final float o() {
        return this.Y;
    }

    public float p() {
        return this.X.o();
    }

    public Paint.Cap q() {
        return this.X.t();
    }

    public float r() {
        return this.X.u();
    }

    public void s(float f, float f2) {
        this.X.y(f, f2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.X.x(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.X.D(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.Y0.cancel();
        this.X.M();
        if (this.X.j() != this.X.o()) {
            this.a1 = true;
            this.Y0.setDuration(666L);
            this.Y0.start();
            return;
        }
        this.X.E(0);
        this.X.w();
        this.Y0.setDuration(1332L);
        this.Y0.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.Y0.cancel();
        z(0.0f);
        this.X.I(false);
        this.X.E(0);
        this.X.w();
        invalidateSelf();
    }

    public void t(boolean z) {
        this.X.I(z);
        invalidateSelf();
    }

    public void u(float f) {
        this.X.z(f);
        invalidateSelf();
    }

    public void v(int i) {
        this.X.A(i);
        invalidateSelf();
    }

    public void w(float f) {
        this.X.B(f);
        invalidateSelf();
    }

    public void x(int... iArr) {
        this.X.F(iArr);
        this.X.E(0);
        invalidateSelf();
    }

    public void y(float f) {
        this.X.H(f);
        invalidateSelf();
    }

    public final void z(float f) {
        this.Y = f;
    }

    /* loaded from: classes.dex */
    public class b implements Animator.AnimatorListener {
        public final /* synthetic */ d a;

        public b(d dVar) {
            this.a = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IC.this.d(1.0f, this.a, true);
            this.a.M();
            this.a.v();
            IC ic = IC.this;
            if (ic.a1) {
                ic.a1 = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
                this.a.I(false);
                return;
            }
            ic.Z0 += 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IC.this.Z0 = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }
    }
}
