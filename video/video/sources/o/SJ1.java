package o;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class SJ1 {
    public static final Interpolator l = new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
    public static final Interpolator m = new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
    public static final Interpolator n = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);

    /* renamed from: o */
    public static final Interpolator f606o = new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    public static final long p = 333;
    public static final long q = 166;
    public final int a;
    public final a b = new a();
    public C9246rQ0 c;
    public C9246rQ0 d;
    public float e;
    public float f;
    public float g;
    public float h;
    public Object i;
    public ValueAnimator j;
    public ValueAnimator k;

    public SJ1(int i) {
        C9246rQ0 c9246rQ0 = C9246rQ0.e;
        this.c = c9246rQ0;
        this.d = c9246rQ0;
        this.e = 1.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = null;
        this.j = null;
        this.k = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            throw new IllegalArgumentException("Unexpected side: " + i);
        }
        this.a = i;
    }

    public static /* synthetic */ void a(SJ1 sj1, ValueAnimator valueAnimator) {
        sj1.getClass();
        sj1.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void b(SJ1 sj1, ValueAnimator valueAnimator) {
        sj1.getClass();
        sj1.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public C9246rQ0 A() {
        int i;
        float f;
        C9246rQ0 c9246rQ0 = C9246rQ0.e;
        int i2 = this.a;
        boolean z = false;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        i = 0;
                    } else {
                        i = this.c.d;
                        this.b.v(n(this.d.d));
                        if (o()) {
                            c9246rQ0 = C9246rQ0.d(0, 0, 0, n(i));
                        }
                    }
                } else {
                    i = this.c.c;
                    this.b.A(n(this.d.c));
                    if (o()) {
                        c9246rQ0 = C9246rQ0.d(0, 0, n(i), 0);
                    }
                }
            } else {
                i = this.c.b;
                this.b.v(n(this.d.b));
                if (o()) {
                    c9246rQ0 = C9246rQ0.d(0, n(i), 0, 0);
                }
            }
        } else {
            i = this.c.a;
            this.b.A(n(this.d.a));
            if (o()) {
                c9246rQ0 = C9246rQ0.d(n(i), 0, 0, 0);
            }
        }
        if (i > 0) {
            z = true;
        }
        x(z);
        float f2 = 0.0f;
        if (i > 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        v(f);
        if (i > 0) {
            f2 = 1.0f;
        }
        w(f2);
        return c9246rQ0;
    }

    public void c(float f) {
        e();
        float f2 = this.f;
        if (f == f2) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.j = ofFloat;
        if (this.f < f) {
            ofFloat.setDuration(333L);
            this.j.setInterpolator(n);
        } else {
            ofFloat.setDuration(166L);
            this.j.setInterpolator(f606o);
        }
        this.j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.RJ1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SJ1.a(SJ1.this, valueAnimator);
            }
        });
        this.j.start();
    }

    public void d(float f) {
        f();
        float f2 = this.h;
        if (f == f2) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.k = ofFloat;
        if (this.h < f) {
            ofFloat.setDuration(333L);
            this.k.setInterpolator(l);
        } else {
            ofFloat.setDuration(166L);
            this.k.setInterpolator(m);
        }
        this.k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.QJ1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SJ1.b(SJ1.this, valueAnimator);
            }
        });
        this.k.start();
    }

    public final void e() {
        ValueAnimator valueAnimator = this.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.j = null;
        }
    }

    public final void f() {
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.k = null;
        }
    }

    public C9246rQ0 h(C9246rQ0 c9246rQ0, C9246rQ0 c9246rQ02, C9246rQ0 c9246rQ03) {
        this.c = c9246rQ0;
        this.d = c9246rQ02;
        this.b.w(c9246rQ03);
        return A();
    }

    public float i() {
        return this.f;
    }

    public a j() {
        return this.b;
    }

    public Object k() {
        return this.i;
    }

    public float l() {
        return this.h;
    }

    public int m() {
        return this.a;
    }

    public boolean o() {
        return false;
    }

    public void p(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            e();
            q(f);
            return;
        }
        throw new IllegalArgumentException("Alpha must in a range of [0, 1]. Got: " + f);
    }

    public final void q(float f) {
        this.f = f;
        y();
    }

    public void r(Object obj) {
        this.i = obj;
    }

    public void s(Drawable drawable) {
        this.b.u(drawable);
    }

    public void t(float f) {
        if (f >= 0.0f && f <= 1.0f) {
            f();
            u(f);
            return;
        }
        throw new IllegalArgumentException("Inset amount must in a range of [0, 1]. Got: " + f);
    }

    public final void u(float f) {
        this.h = f;
        z();
    }

    public void v(float f) {
        this.e = f;
        y();
    }

    public void w(float f) {
        this.g = f;
        z();
    }

    public void x(boolean z) {
        this.b.z(z);
    }

    public final void y() {
        this.b.s(this.e * this.f);
    }

    public final void z() {
        float f = this.h * this.g;
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        return;
                    }
                    a aVar = this.b;
                    aVar.y((1.0f - f) * aVar.b);
                    return;
                }
                a aVar2 = this.b;
                aVar2.x((1.0f - f) * aVar2.a);
                return;
            }
            a aVar3 = this.b;
            aVar3.y((-(1.0f - f)) * aVar3.b);
            return;
        }
        a aVar4 = this.b;
        aVar4.x((-(1.0f - f)) * aVar4.a);
    }

    /* loaded from: classes.dex */
    public static class a {
        public static final int j = -1;
        public int a = -1;
        public int b = -1;
        public C9246rQ0 c = C9246rQ0.e;
        public boolean d = false;
        public Drawable e = null;
        public float f = 0.0f;
        public float g = 0.0f;
        public float h = 1.0f;
        public InterfaceC0228a i;

        public final void A(int i) {
            if (this.a != i) {
                this.a = i;
                InterfaceC0228a interfaceC0228a = this.i;
                if (interfaceC0228a != null) {
                    interfaceC0228a.e(i);
                }
            }
        }

        public float k() {
            return this.h;
        }

        public Drawable l() {
            return this.e;
        }

        public int m() {
            return this.b;
        }

        public C9246rQ0 n() {
            return this.c;
        }

        public float o() {
            return this.f;
        }

        public float p() {
            return this.g;
        }

        public int q() {
            return this.a;
        }

        public boolean r() {
            return this.d;
        }

        public final void s(float f) {
            if (this.h != f) {
                this.h = f;
                InterfaceC0228a interfaceC0228a = this.i;
                if (interfaceC0228a != null) {
                    interfaceC0228a.c(f);
                }
            }
        }

        public void t(InterfaceC0228a interfaceC0228a) {
            if (this.i != null && interfaceC0228a != null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            this.i = interfaceC0228a;
        }

        public final void u(Drawable drawable) {
            this.e = drawable;
            InterfaceC0228a interfaceC0228a = this.i;
            if (interfaceC0228a != null) {
                interfaceC0228a.h(drawable);
            }
        }

        public final void v(int i) {
            if (this.b != i) {
                this.b = i;
                InterfaceC0228a interfaceC0228a = this.i;
                if (interfaceC0228a != null) {
                    interfaceC0228a.a(i);
                }
            }
        }

        public final void w(C9246rQ0 c9246rQ0) {
            if (!this.c.equals(c9246rQ0)) {
                this.c = c9246rQ0;
                InterfaceC0228a interfaceC0228a = this.i;
                if (interfaceC0228a != null) {
                    interfaceC0228a.d(c9246rQ0);
                }
            }
        }

        public final void x(float f) {
            if (this.f != f) {
                this.f = f;
                InterfaceC0228a interfaceC0228a = this.i;
                if (interfaceC0228a != null) {
                    interfaceC0228a.f(f);
                }
            }
        }

        public final void y(float f) {
            if (this.g != f) {
                this.g = f;
                InterfaceC0228a interfaceC0228a = this.i;
                if (interfaceC0228a != null) {
                    interfaceC0228a.g(f);
                }
            }
        }

        public final void z(boolean z) {
            if (this.d != z) {
                this.d = z;
                InterfaceC0228a interfaceC0228a = this.i;
                if (interfaceC0228a != null) {
                    interfaceC0228a.b(z);
                }
            }
        }

        /* renamed from: o.SJ1$a$a */
        /* loaded from: classes.dex */
        public interface InterfaceC0228a {
            default void a(int i) {
            }

            default void b(boolean z) {
            }

            default void c(float f) {
            }

            default void d(C9246rQ0 c9246rQ0) {
            }

            default void e(int i) {
            }

            default void f(float f) {
            }

            default void g(float f) {
            }

            default void h(Drawable drawable) {
            }
        }
    }

    public void g(int i) {
    }

    public int n(int i) {
        return i;
    }
}
