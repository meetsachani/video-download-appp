package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import o.AbstractC6717h70;
import o.InterfaceC8441o9;

/* loaded from: classes3.dex */
public final class EC extends AbstractC6291fP0<ObjectAnimator> {
    public static final int k = 4;
    public static final int l = 5400;
    public static final int m = 667;
    public static final int n = 667;

    /* renamed from: o  reason: collision with root package name */
    public static final int f446o = 333;
    public static final int p = 333;
    public static final int t = -20;
    public static final int u = 250;
    public static final int v = 1520;
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final C10304vn0 e;
    public final AbstractC2755Dl f;
    public int g;
    public float h;
    public float i;
    public InterfaceC8441o9.a j;
    public static final int[] q = {0, 1350, 2700, 4050};
    public static final int[] r = {667, 2017, 3367, 4717};
    public static final int[] s = {1000, 2350, 3700, 5050};
    public static final Property<EC, Float> w = new c(Float.class, "animationFraction");
    public static final Property<EC, Float> x = new d(Float.class, "completeEndFraction");

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            EC ec = EC.this;
            ec.g = (ec.g + 4) % EC.this.f.e.length;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            EC.this.a();
            EC ec = EC.this;
            InterfaceC8441o9.a aVar = ec.j;
            if (aVar != null) {
                aVar.b(ec.a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c extends Property<EC, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(EC ec) {
            return Float.valueOf(ec.q());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(EC ec, Float f) {
            ec.h(f.floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public class d extends Property<EC, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(EC ec) {
            return Float.valueOf(ec.r());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(EC ec, Float f) {
            ec.u(f.floatValue());
        }
    }

    public EC(@InterfaceC5670cr1 KC kc) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = kc;
        this.e = new C10304vn0();
    }

    @Override // o.AbstractC6291fP0
    public void a() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // o.AbstractC6291fP0
    public void c() {
        v();
        g();
    }

    @Override // o.AbstractC6291fP0
    public void d(@InterfaceC5670cr1 InterfaceC8441o9.a aVar) {
        this.j = aVar;
    }

    @Override // o.AbstractC6291fP0
    public void f() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.a.isVisible()) {
                this.d.start();
            } else {
                a();
            }
        }
    }

    @Override // o.AbstractC6291fP0
    @InterfaceC5056aJ2
    public void g() {
        this.g = 0;
        this.b.get(0).c = this.f.e[0];
        this.i = 0.0f;
    }

    @Override // o.AbstractC6291fP0
    @InterfaceC5056aJ2
    public void h(float f) {
        this.h = f;
        int i = (int) (f * 5400.0f);
        w(i);
        t(i);
        this.a.invalidateSelf();
    }

    @Override // o.AbstractC6291fP0
    public void i() {
        s();
        g();
        this.c.start();
    }

    @Override // o.AbstractC6291fP0
    public void j() {
        this.j = null;
    }

    public final float q() {
        return this.h;
    }

    public final float r() {
        return this.i;
    }

    public final void s() {
        if (this.c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, w, 0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration(this.f.n * 5400.0f);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new a());
        }
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, x, 0.0f, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration(this.f.n * 333.0f);
            this.d.setInterpolator(this.e);
            this.d.addListener(new b());
        }
    }

    public final void t(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float b2 = b(i, s[i2], 333);
            if (b2 > 0.0f && b2 < 1.0f) {
                int i3 = i2 + this.g;
                int[] iArr = this.f.e;
                int length = i3 % iArr.length;
                this.b.get(0).c = C4590Wd.b().evaluate(this.e.getInterpolation(b2), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[(length + 1) % iArr.length])).intValue();
                return;
            }
        }
    }

    public final void u(float f) {
        this.i = f;
    }

    public final void v() {
        s();
        this.c.setDuration(this.f.n * 5400.0f);
        this.d.setDuration(this.f.n * 333.0f);
    }

    public final void w(int i) {
        AbstractC6717h70.a aVar = this.b.get(0);
        float f = this.h;
        aVar.a = (f * 1520.0f) - 20.0f;
        aVar.b = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            aVar.b += this.e.getInterpolation(b(i, q[i2], 667)) * 250.0f;
            aVar.a += this.e.getInterpolation(b(i, r[i2], 667)) * 250.0f;
        }
        float f2 = aVar.a;
        float f3 = aVar.b;
        aVar.a = (f2 + ((f3 - f2) * this.i)) / 360.0f;
        aVar.b = f3 / 360.0f;
    }
}
