package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import o.AbstractC6717h70;
import o.InterfaceC8441o9;

/* renamed from: o.g01  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6435g01 extends AbstractC6291fP0<ObjectAnimator> {
    public static final int i = 667;
    public static final int j = 333;
    public static final Property<C6435g01, Float> k = new b(Float.class, "animationFraction");
    public ObjectAnimator c;
    public C10304vn0 d;
    public final AbstractC2755Dl e;
    public int f;
    public boolean g;
    public float h;

    /* renamed from: o.g01$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C6435g01 c6435g01 = C6435g01.this;
            c6435g01.f = (c6435g01.f + 1) % C6435g01.this.e.e.length;
            C6435g01.this.g = true;
        }
    }

    /* renamed from: o.g01$b */
    /* loaded from: classes3.dex */
    public class b extends Property<C6435g01, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C6435g01 c6435g01) {
            return Float.valueOf(c6435g01.p());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C6435g01 c6435g01, Float f) {
            c6435g01.h(f.floatValue());
        }
    }

    public C6435g01(@InterfaceC5670cr1 C9629t01 c9629t01) {
        super(3);
        this.f = 1;
        this.e = c9629t01;
        this.d = new C10304vn0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.h;
    }

    private void q() {
        if (this.c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, k, 0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration(this.e.n * 333.0f);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new a());
        }
    }

    private void s() {
        q();
        this.c.setDuration(this.e.n * 333.0f);
    }

    private void t(int i2) {
        this.b.get(0).a = 0.0f;
        float b2 = b(i2, 0, 667);
        float interpolation = this.d.getInterpolation(b2);
        this.b.get(1).a = interpolation;
        this.b.get(0).b = interpolation;
        float interpolation2 = this.d.getInterpolation(b2 + 0.49925038f);
        this.b.get(2).a = interpolation2;
        this.b.get(1).b = interpolation2;
        this.b.get(2).b = 1.0f;
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
        s();
        g();
    }

    @Override // o.AbstractC6291fP0
    @InterfaceC5056aJ2
    public void g() {
        this.g = true;
        this.f = 1;
        for (AbstractC6717h70.a aVar : this.b) {
            AbstractC2755Dl abstractC2755Dl = this.e;
            aVar.c = abstractC2755Dl.e[0];
            aVar.d = abstractC2755Dl.i / 2;
        }
    }

    @Override // o.AbstractC6291fP0
    @InterfaceC5056aJ2
    public void h(float f) {
        this.h = f;
        t((int) (f * 333.0f));
        r();
        this.a.invalidateSelf();
    }

    @Override // o.AbstractC6291fP0
    public void i() {
        q();
        g();
        this.c.start();
    }

    public final void r() {
        if (this.g && this.b.get(1).b < 1.0f) {
            this.b.get(2).c = this.b.get(1).c;
            this.b.get(1).c = this.b.get(0).c;
            this.b.get(0).c = this.e.e[this.f];
            this.g = false;
        }
    }

    @Override // o.AbstractC6291fP0
    public void f() {
    }

    @Override // o.AbstractC6291fP0
    public void j() {
    }

    @Override // o.AbstractC6291fP0
    public void d(@InterfaceC11300zs1 InterfaceC8441o9.a aVar) {
    }
}
