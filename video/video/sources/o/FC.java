package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import o.AbstractC6717h70;
import o.C7025iN1;
import o.InterfaceC8441o9;

/* loaded from: classes3.dex */
public final class FC extends AbstractC6291fP0<ObjectAnimator> {
    public static final int l = 6000;
    public static final int m = 500;
    public static final int n = 3000;

    /* renamed from: o  reason: collision with root package name */
    public static final int f451o = 3000;
    public static final int q = 0;
    public static final int r = 3000;
    public static final int s = 500;
    public static final int t = 100;
    public static final int u = 1080;
    public static final int v = 90;
    public static final float w = 0.0f;
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final TimeInterpolator e;
    public final AbstractC2755Dl f;
    public int g;
    public float h;
    public float i;
    public InterfaceC8441o9.a j;
    public static final TimeInterpolator k = C5600ca.b;
    public static final int[] p = {0, 1500, 3000, 4500};
    public static final float[] x = {0.1f, 0.87f};
    public static final Property<FC, Float> y = new c(Float.class, "animationFraction");
    public static final Property<FC, Float> z = new d(Float.class, "completeEndFraction");

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            FC fc = FC.this;
            fc.g = (fc.g + FC.p.length) % FC.this.f.e.length;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FC.this.a();
            FC fc = FC.this;
            InterfaceC8441o9.a aVar = fc.j;
            if (aVar != null) {
                aVar.b(fc.a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c extends Property<FC, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(FC fc) {
            return Float.valueOf(fc.r());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(FC fc, Float f) {
            fc.h(f.floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public class d extends Property<FC, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(FC fc) {
            return Float.valueOf(fc.s());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(FC fc, Float f) {
            fc.v(f.floatValue());
        }
    }

    public FC(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 KC kc) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = kc;
        this.e = C9811tl1.g(context, C7025iN1.c.motionEasingStandardInterpolator, k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float r() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float s() {
        return this.i;
    }

    private void t() {
        if (this.c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, y, 0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration(this.f.n * 6000.0f);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new a());
        }
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, z, 0.0f, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration(this.f.n * 500.0f);
            this.d.addListener(new b());
        }
    }

    private void u(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = p;
            if (i2 < iArr.length) {
                float b2 = b(i, iArr[i2], 100);
                if (b2 >= 0.0f && b2 <= 1.0f) {
                    int i3 = i2 + this.g;
                    int[] iArr2 = this.f.e;
                    int length = i3 % iArr2.length;
                    this.b.get(0).c = C4590Wd.b().evaluate(this.e.getInterpolation(b2), Integer.valueOf(iArr2[length]), Integer.valueOf(iArr2[(length + 1) % iArr2.length])).intValue();
                    return;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(float f) {
        this.i = f;
    }

    private void w() {
        t();
        this.c.setDuration(this.f.n * 6000.0f);
        this.d.setDuration(this.f.n * 500.0f);
    }

    private void x(int i) {
        AbstractC6717h70.a aVar = this.b.get(0);
        float f = this.h * 1080.0f;
        float f2 = 0.0f;
        for (int i2 : p) {
            f2 += this.e.getInterpolation(b(i, i2, 500)) * 90.0f;
        }
        aVar.g = f + f2;
        float interpolation = this.e.getInterpolation(b(i, 0, 3000)) - this.e.getInterpolation(b(i, 3000, 3000));
        aVar.a = 0.0f;
        float[] fArr = x;
        float g = C8801pd1.g(fArr[0], fArr[1], interpolation);
        aVar.b = g;
        float f3 = this.i;
        if (f3 > 0.0f) {
            aVar.b = g * (1.0f - f3);
        }
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
        w();
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
        int i = (int) (f * 6000.0f);
        x(i);
        u(i);
        this.a.invalidateSelf();
    }

    @Override // o.AbstractC6291fP0
    public void i() {
        t();
        g();
        this.c.start();
    }

    @Override // o.AbstractC6291fP0
    public void j() {
        this.j = null;
    }
}
