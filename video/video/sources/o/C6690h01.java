package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import o.AbstractC6717h70;
import o.C7025iN1;
import o.InterfaceC8441o9;

/* renamed from: o.h01  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6690h01 extends AbstractC6291fP0<ObjectAnimator> {
    public static final int k = 1800;
    public static final int[] l = {533, 567, 850, 750};
    public static final int[] m = {1267, 1000, 333, 0};
    public static final Property<C6690h01, Float> n = new c(Float.class, "animationFraction");
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final Interpolator[] e;
    public final AbstractC2755Dl f;
    public int g;
    public boolean h;
    public float i;
    public InterfaceC8441o9.a j;

    /* renamed from: o.h01$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C6690h01 c6690h01 = C6690h01.this;
            c6690h01.g = (c6690h01.g + 1) % C6690h01.this.f.e.length;
            C6690h01.this.h = true;
        }
    }

    /* renamed from: o.h01$b */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C6690h01.this.a();
            C6690h01 c6690h01 = C6690h01.this;
            InterfaceC8441o9.a aVar = c6690h01.j;
            if (aVar != null) {
                aVar.b(c6690h01.a);
            }
        }
    }

    /* renamed from: o.h01$c */
    /* loaded from: classes3.dex */
    public class c extends Property<C6690h01, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(C6690h01 c6690h01) {
            return Float.valueOf(c6690h01.p());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C6690h01 c6690h01, Float f) {
            c6690h01.h(f.floatValue());
        }
    }

    public C6690h01(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 C9629t01 c9629t01) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = c9629t01;
        this.e = new Interpolator[]{C5843da.b(context, C7025iN1.a.linear_indeterminate_line1_head_interpolator), C5843da.b(context, C7025iN1.a.linear_indeterminate_line1_tail_interpolator), C5843da.b(context, C7025iN1.a.linear_indeterminate_line2_head_interpolator), C5843da.b(context, C7025iN1.a.linear_indeterminate_line2_tail_interpolator)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.i;
    }

    private void q() {
        if (this.c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration(this.f.n * 1800.0f);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new a());
        }
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, n, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration(this.f.n * 1800.0f);
            this.d.setInterpolator(null);
            this.d.addListener(new b());
        }
    }

    private void r() {
        if (this.h) {
            for (AbstractC6717h70.a aVar : this.b) {
                aVar.c = this.f.e[this.g];
            }
            this.h = false;
        }
    }

    private void s() {
        q();
        this.c.setDuration(this.f.n * 1800.0f);
        this.d.setDuration(this.f.n * 1800.0f);
    }

    private void t(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            AbstractC6717h70.a aVar = this.b.get(i2);
            int[] iArr = m;
            int i3 = i2 * 2;
            int i4 = iArr[i3];
            int[] iArr2 = l;
            aVar.a = C9293rd1.d(this.e[i3].getInterpolation(b(i, i4, iArr2[i3])), 0.0f, 1.0f);
            int i5 = i3 + 1;
            aVar.b = C9293rd1.d(this.e[i5].getInterpolation(b(i, iArr[i5], iArr2[i5])), 0.0f, 1.0f);
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
        s();
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
            a();
            if (this.a.isVisible()) {
                this.d.setFloatValues(this.i, 1.0f);
                this.d.setDuration((1.0f - this.i) * 1800.0f);
                this.d.start();
            }
        }
    }

    @Override // o.AbstractC6291fP0
    @InterfaceC5056aJ2
    public void g() {
        this.g = 0;
        for (AbstractC6717h70.a aVar : this.b) {
            aVar.c = this.f.e[0];
        }
    }

    @Override // o.AbstractC6291fP0
    @InterfaceC5056aJ2
    public void h(float f) {
        this.i = f;
        t((int) (f * 1800.0f));
        r();
        this.a.invalidateSelf();
    }

    @Override // o.AbstractC6291fP0
    public void i() {
        q();
        g();
        this.c.start();
    }

    @Override // o.AbstractC6291fP0
    public void j() {
        this.j = null;
    }
}
