package o;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: o.ci  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractView$OnTouchListenerC5632ci implements View.OnTouchListener {
    public static final int A1 = ViewConfiguration.getTapTimeout();
    public static final int B1 = 500;
    public static final int C1 = 500;
    public static final float m1 = 0.0f;
    public static final float n1 = Float.MAX_VALUE;
    public static final float o1 = 0.0f;
    public static final int p1 = 0;
    public static final int q1 = 1;
    public static final int r1 = 2;
    public static final int s1 = 0;
    public static final int t1 = 1;
    public static final int u1 = 1;
    public static final int v1 = 315;
    public static final int w1 = 1575;
    public static final float x1 = Float.MAX_VALUE;
    public static final float y1 = 0.2f;
    public static final float z1 = 1.0f;
    public Runnable Y0;
    public final View Z;
    public int b1;
    public int c1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public final a X = new a();
    public final Interpolator Y = new AccelerateInterpolator();
    public float[] Z0 = {0.0f, 0.0f};
    public float[] a1 = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] d1 = {0.0f, 0.0f};
    public float[] e1 = {0.0f, 0.0f};
    public float[] f1 = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o.ci$a */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public int b;
        public float c;
        public float d;
        public float j;
        public int k;
        public long e = Long.MIN_VALUE;
        public long i = -1;
        public long f = 0;
        public int g = 0;
        public int h = 0;

        public void a() {
            if (this.f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = g(e(currentAnimationTimeMillis));
                this.f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f)) * g;
                this.g = (int) (this.c * f);
                this.h = (int) (f * this.d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f = this.c;
            return (int) (f / Math.abs(f));
        }

        public final float e(long j) {
            long j2 = this.e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.i;
            if (j3 >= 0 && j >= j3) {
                float f = this.j;
                return (1.0f - f) + (f * AbstractView$OnTouchListenerC5632ci.f(((float) (j - j3)) / this.k, 0.0f, 1.0f));
            }
            return AbstractView$OnTouchListenerC5632ci.f(((float) (j - j2)) / this.a, 0.0f, 1.0f) * 0.5f;
        }

        public int f() {
            float f = this.d;
            return (int) (f / Math.abs(f));
        }

        public final float g(float f) {
            return ((-4.0f) * f * f) + (f * 4.0f);
        }

        public boolean h() {
            if (this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + this.k) {
                return true;
            }
            return false;
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = AbstractView$OnTouchListenerC5632ci.g((int) (currentAnimationTimeMillis - this.e), 0, this.b);
            this.j = e(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }

        public void j(int i) {
            this.b = i;
        }

        public void k(int i) {
            this.a = i;
        }

        public void l(float f, float f2) {
            this.c = f;
            this.d = f2;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = currentAnimationTimeMillis;
            this.i = -1L;
            this.f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    /* renamed from: o.ci$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractView$OnTouchListenerC5632ci abstractView$OnTouchListenerC5632ci = AbstractView$OnTouchListenerC5632ci.this;
            if (!abstractView$OnTouchListenerC5632ci.j1) {
                return;
            }
            if (abstractView$OnTouchListenerC5632ci.h1) {
                abstractView$OnTouchListenerC5632ci.h1 = false;
                abstractView$OnTouchListenerC5632ci.X.m();
            }
            a aVar = AbstractView$OnTouchListenerC5632ci.this.X;
            if (!aVar.h() && AbstractView$OnTouchListenerC5632ci.this.H()) {
                AbstractView$OnTouchListenerC5632ci abstractView$OnTouchListenerC5632ci2 = AbstractView$OnTouchListenerC5632ci.this;
                if (abstractView$OnTouchListenerC5632ci2.i1) {
                    abstractView$OnTouchListenerC5632ci2.i1 = false;
                    abstractView$OnTouchListenerC5632ci2.c();
                }
                aVar.a();
                AbstractView$OnTouchListenerC5632ci.this.v(aVar.b(), aVar.c());
                C6516gH2.w1(AbstractView$OnTouchListenerC5632ci.this.Z, this);
                return;
            }
            AbstractView$OnTouchListenerC5632ci.this.j1 = false;
        }
    }

    public AbstractView$OnTouchListenerC5632ci(View view) {
        this.Z = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        B(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        C(f3, f3);
        x(1);
        A(Float.MAX_VALUE, Float.MAX_VALUE);
        F(0.2f, 0.2f);
        G(1.0f, 1.0f);
        w(A1);
        E(500);
        D(500);
    }

    public static float f(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    public static int g(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < i2) {
            return i2;
        }
        return i;
    }

    public AbstractView$OnTouchListenerC5632ci A(float f, float f2) {
        float[] fArr = this.a1;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public AbstractView$OnTouchListenerC5632ci B(float f, float f2) {
        float[] fArr = this.f1;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public AbstractView$OnTouchListenerC5632ci C(float f, float f2) {
        float[] fArr = this.e1;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public AbstractView$OnTouchListenerC5632ci D(int i) {
        this.X.j(i);
        return this;
    }

    public AbstractView$OnTouchListenerC5632ci E(int i) {
        this.X.k(i);
        return this;
    }

    public AbstractView$OnTouchListenerC5632ci F(float f, float f2) {
        float[] fArr = this.Z0;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public AbstractView$OnTouchListenerC5632ci G(float f, float f2) {
        float[] fArr = this.d1;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    public boolean H() {
        a aVar = this.X;
        int f = aVar.f();
        int d = aVar.d();
        if (f == 0 || !b(f)) {
            if (d != 0 && a(d)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void I() {
        int i;
        if (this.Y0 == null) {
            this.Y0 = new b();
        }
        this.j1 = true;
        this.h1 = true;
        if (!this.g1 && (i = this.c1) > 0) {
            C6516gH2.x1(this.Z, this.Y0, i);
        } else {
            this.Y0.run();
        }
        this.g1 = true;
    }

    public abstract boolean a(int i);

    public abstract boolean b(int i);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.Z.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float d(int i, float f, float f2, float f3) {
        float r = r(this.Z0[i], f2, this.a1[i], f);
        int i2 = (r > 0.0f ? 1 : (r == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.d1[i];
        float f5 = this.e1[i];
        float f6 = this.f1[i];
        float f7 = f4 * f3;
        if (i2 > 0) {
            return f(r * f7, f5, f6);
        }
        return -f((-r) * f7, f5, f6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.k1) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            u();
            if (this.l1 || !this.j1) {
                return false;
            }
            return true;
        }
        this.i1 = true;
        this.g1 = false;
        this.X.l(d(0, motionEvent.getX(), view.getWidth(), this.Z.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.Z.getHeight()));
        if (!this.j1 && H()) {
            I();
        }
        if (this.l1) {
        }
        return false;
    }

    public final float q(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.b1;
        if (i != 0 && i != 1) {
            if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        } else if (f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.j1 && i == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final float r(float f, float f2, float f3, float f4) {
        float interpolation;
        float f5 = f(f * f2, 0.0f, f3);
        float q = q(f2 - f4, f5) - q(f4, f5);
        if (q < 0.0f) {
            interpolation = -this.Y.getInterpolation(-q);
        } else if (q <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.Y.getInterpolation(q);
        }
        return f(interpolation, -1.0f, 1.0f);
    }

    public boolean s() {
        return this.k1;
    }

    public boolean t() {
        return this.l1;
    }

    public final void u() {
        if (this.h1) {
            this.j1 = false;
        } else {
            this.X.i();
        }
    }

    public abstract void v(int i, int i2);

    public AbstractView$OnTouchListenerC5632ci w(int i) {
        this.c1 = i;
        return this;
    }

    public AbstractView$OnTouchListenerC5632ci x(int i) {
        this.b1 = i;
        return this;
    }

    public AbstractView$OnTouchListenerC5632ci y(boolean z) {
        if (this.k1 && !z) {
            u();
        }
        this.k1 = z;
        return this;
    }

    public AbstractView$OnTouchListenerC5632ci z(boolean z) {
        this.l1 = z;
        return this;
    }
}
