package o;

import android.view.Choreographer;

/* loaded from: classes.dex */
public class N61 extends AbstractC9566sl implements Choreographer.FrameCallback {
    public C10624x51 g1;
    public float Y0 = 1.0f;
    public boolean Z0 = false;
    public long a1 = 0;
    public float b1 = 0.0f;
    public float c1 = 0.0f;
    public int d1 = 0;
    public float e1 = -2.1474836E9f;
    public float f1 = 2.1474836E9f;
    public boolean h1 = false;
    public boolean i1 = false;

    public void A(float f) {
        if (this.b1 == f) {
            return;
        }
        float c = C4713Xj1.c(f, p(), o());
        this.b1 = c;
        if (this.i1) {
            c = (float) Math.floor(c);
        }
        this.c1 = c;
        this.a1 = 0L;
        h();
    }

    public void B(float f) {
        C(this.e1, f);
    }

    public void C(float f, float f2) {
        float r;
        float f3;
        if (f <= f2) {
            C10624x51 c10624x51 = this.g1;
            if (c10624x51 == null) {
                r = -3.4028235E38f;
            } else {
                r = c10624x51.r();
            }
            C10624x51 c10624x512 = this.g1;
            if (c10624x512 == null) {
                f3 = Float.MAX_VALUE;
            } else {
                f3 = c10624x512.f();
            }
            float c = C4713Xj1.c(f, r, f3);
            float c2 = C4713Xj1.c(f2, r, f3);
            if (c == this.e1 && c2 == this.f1) {
                return;
            }
            this.e1 = c;
            this.f1 = c2;
            A((int) C4713Xj1.c(this.c1, c, c2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    public void D(int i) {
        C(i, (int) this.f1);
    }

    public void E(float f) {
        this.Y0 = f;
    }

    public void F(boolean z) {
        this.i1 = z;
    }

    public final void G() {
        if (this.g1 != null) {
            float f = this.c1;
            if (f >= this.e1 && f <= this.f1) {
                return;
            }
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.e1), Float.valueOf(this.f1), Float.valueOf(this.c1)));
        }
    }

    @Override // o.AbstractC9566sl
    public void b() {
        super.b();
        c(r());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        b();
        v();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        float p;
        float o2;
        u();
        if (this.g1 != null && isRunning()) {
            if (ZX0.h()) {
                ZX0.b("LottieValueAnimator#doFrame");
            }
            long j2 = this.a1;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float n = ((float) j3) / n();
            float f = this.b1;
            if (r()) {
                n = -n;
            }
            float f2 = f + n;
            boolean e = C4713Xj1.e(f2, p(), o());
            float f3 = this.b1;
            float c = C4713Xj1.c(f2, p(), o());
            this.b1 = c;
            if (this.i1) {
                c = (float) Math.floor(c);
            }
            this.c1 = c;
            this.a1 = j;
            if (!e) {
                if (getRepeatCount() != -1 && this.d1 >= getRepeatCount()) {
                    if (this.Y0 < 0.0f) {
                        o2 = p();
                    } else {
                        o2 = o();
                    }
                    this.b1 = o2;
                    this.c1 = o2;
                    v();
                    i(f3);
                    c(r());
                } else {
                    if (getRepeatMode() == 2) {
                        this.Z0 = !this.Z0;
                        y();
                    } else {
                        if (r()) {
                            p = o();
                        } else {
                            p = p();
                        }
                        this.b1 = p;
                        this.c1 = p;
                    }
                    this.a1 = j;
                    i(f3);
                    e();
                    this.d1++;
                }
            } else {
                i(f3);
            }
            G();
            if (ZX0.h()) {
                ZX0.c("LottieValueAnimator#doFrame");
            }
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float p;
        float o2;
        float p2;
        if (this.g1 == null) {
            return 0.0f;
        }
        if (r()) {
            p = o() - this.c1;
            o2 = o();
            p2 = p();
        } else {
            p = this.c1 - p();
            o2 = o();
            p2 = p();
        }
        return p / (o2 - p2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(l());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C10624x51 c10624x51 = this.g1;
        if (c10624x51 == null) {
            return 0L;
        }
        return c10624x51.d();
    }

    public final void i(float f) {
        if (this.i1 && this.b1 == f) {
            return;
        }
        h();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.h1;
    }

    public void j() {
        this.g1 = null;
        this.e1 = -2.1474836E9f;
        this.f1 = 2.1474836E9f;
    }

    public void k() {
        v();
        c(r());
    }

    public float l() {
        C10624x51 c10624x51 = this.g1;
        if (c10624x51 == null) {
            return 0.0f;
        }
        return (this.c1 - c10624x51.r()) / (this.g1.f() - this.g1.r());
    }

    public float m() {
        return this.c1;
    }

    public final float n() {
        C10624x51 c10624x51 = this.g1;
        if (c10624x51 == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c10624x51.i()) / Math.abs(this.Y0);
    }

    public float o() {
        C10624x51 c10624x51 = this.g1;
        if (c10624x51 == null) {
            return 0.0f;
        }
        float f = this.f1;
        if (f == 2.1474836E9f) {
            return c10624x51.f();
        }
        return f;
    }

    public float p() {
        C10624x51 c10624x51 = this.g1;
        if (c10624x51 == null) {
            return 0.0f;
        }
        float f = this.e1;
        if (f == -2.1474836E9f) {
            return c10624x51.r();
        }
        return f;
    }

    public float q() {
        return this.Y0;
    }

    public final boolean r() {
        if (q() < 0.0f) {
            return true;
        }
        return false;
    }

    public void s() {
        v();
        d();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.Z0) {
            this.Z0 = false;
            y();
        }
    }

    public void t() {
        float p;
        this.h1 = true;
        g(r());
        if (r()) {
            p = o();
        } else {
            p = p();
        }
        A((int) p);
        this.a1 = 0L;
        this.d1 = 0;
        u();
    }

    public void u() {
        if (isRunning()) {
            w(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void v() {
        w(true);
    }

    public void w(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.h1 = false;
        }
    }

    public void x() {
        this.h1 = true;
        u();
        this.a1 = 0L;
        if (r() && m() == p()) {
            A(o());
        } else if (!r() && m() == o()) {
            A(p());
        }
        f();
    }

    public void y() {
        E(-q());
    }

    public void z(C10624x51 c10624x51) {
        boolean z;
        if (this.g1 == null) {
            z = true;
        } else {
            z = false;
        }
        this.g1 = c10624x51;
        if (z) {
            C(Math.max(this.e1, c10624x51.r()), Math.min(this.f1, c10624x51.f()));
        } else {
            C((int) c10624x51.r(), (int) c10624x51.f());
        }
        float f = this.c1;
        this.c1 = 0.0f;
        this.b1 = 0.0f;
        A((int) f);
        h();
    }
}
