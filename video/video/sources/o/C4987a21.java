package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import o.C5472c21;

/* renamed from: o.a21  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4987a21 {
    public static final int i = 650;
    public static final int j = 50;
    public static final int k = 90;
    public static final float l = 200.0f;
    public static final float m = 0.6f;
    public static final Property<C4987a21, Float> n = new b(Float.class, "animationFraction");

    /* renamed from: o  reason: collision with root package name */
    public static final AbstractC11311zv0<C4987a21> f690o = new c("morphFactor");
    public int a;
    public float b;
    public float c;
    public ObjectAnimator d;
    public C5850db2 e;
    @InterfaceC5670cr1
    public C5715d21 f;
    @InterfaceC11300zs1
    public C5230b21 g;
    public C5472c21.a h = new C5472c21.a();

    /* renamed from: o.a21$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C4987a21.this.e.C(C4987a21.a(C4987a21.this));
        }
    }

    /* renamed from: o.a21$b */
    /* loaded from: classes3.dex */
    public class b extends Property<C4987a21, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C4987a21 c4987a21) {
            return Float.valueOf(c4987a21.f());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C4987a21 c4987a21, Float f) {
            c4987a21.l(f.floatValue());
        }
    }

    /* renamed from: o.a21$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC11311zv0<C4987a21> {
        public c(String str) {
            super(str);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(C4987a21 c4987a21) {
            return c4987a21.g();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(C4987a21 c4987a21, float f) {
            c4987a21.m(f);
        }
    }

    public C4987a21(@InterfaceC5670cr1 C5715d21 c5715d21) {
        this.f = c5715d21;
    }

    public static /* synthetic */ int a(C4987a21 c4987a21) {
        int i2 = c4987a21.a + 1;
        c4987a21.a = i2;
        return i2;
    }

    public void e() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        C5850db2 c5850db2 = this.e;
        if (c5850db2 != null) {
            c5850db2.H();
        }
    }

    public final float f() {
        return this.b;
    }

    public final float g() {
        return this.c;
    }

    public void h() {
        k();
    }

    public final void i() {
        if (this.e == null) {
            this.e = new C5850db2(this, f690o).G(new C6092eb2().i(200.0f).g(0.6f)).t(0.01f);
        }
        if (this.d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.d = ofFloat;
            ofFloat.setDuration(650L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new a());
        }
    }

    public void j(@InterfaceC5670cr1 C5230b21 c5230b21) {
        this.g = c5230b21;
    }

    public void k() {
        this.a = 1;
        m(0.0f);
        this.h.a = this.f.e[0];
    }

    @InterfaceC5056aJ2
    public void l(float f) {
        this.b = f;
        p((int) (f * 650.0f));
        C5230b21 c5230b21 = this.g;
        if (c5230b21 != null) {
            c5230b21.invalidateSelf();
        }
    }

    @InterfaceC5056aJ2
    public void m(float f) {
        this.c = f;
        q();
        C5230b21 c5230b21 = this.g;
        if (c5230b21 != null) {
            c5230b21.invalidateSelf();
        }
    }

    @InterfaceC5056aJ2
    public void n(int i2) {
        this.a = i2;
    }

    public void o() {
        i();
        k();
        this.e.C(this.a);
        this.d.start();
    }

    public final void p(int i2) {
        float f = this.a - 1;
        float f2 = this.c - f;
        float f3 = i2 / 650.0f;
        if (f3 == 1.0f) {
            f3 = 0.0f;
        }
        this.h.c = (((f * 140.0f) + (f3 * 50.0f)) + (f2 * 90.0f)) % 360.0f;
    }

    public final void q() {
        C5472c21.a aVar = this.h;
        aVar.b = this.c;
        int[] iArr = this.f.e;
        int length = (this.a - 1) % iArr.length;
        aVar.a = C4590Wd.b().evaluate(C9293rd1.d(this.c - (this.a - 1), 0.0f, 1.0f), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[(length + 1) % iArr.length])).intValue();
    }
}
