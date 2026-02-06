package o;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import o.AbstractC2755Dl;
import o.AbstractC6717h70;
import o.C7025iN1;
import o.D80;
import o.InterfaceC8441o9;

/* loaded from: classes3.dex */
public final class N20<S extends AbstractC2755Dl> extends AbstractC5006a70 {
    public static final int A1 = 10000;
    public static final float B1 = 0.1f;
    public static final float C1 = 0.9f;
    public static final float D1 = 50.0f;
    public static final float E1 = 0.01f;
    public static final int F1 = 1000;
    public static final int G1 = 500;
    public static final AbstractC11311zv0<N20<?>> H1 = new a("indicatorLevel");
    public AbstractC6717h70<S> p1;
    public final C6092eb2 q1;
    public final C5850db2 r1;
    public final AbstractC6717h70.a s1;
    public float t1;
    public boolean u1;
    @InterfaceC5670cr1
    public final ValueAnimator v1;
    @InterfaceC5670cr1
    public ValueAnimator w1;
    public TimeInterpolator x1;
    @InterfaceC5670cr1
    public TimeInterpolator y1;
    @InterfaceC5670cr1
    public TimeInterpolator z1;

    /* loaded from: classes3.dex */
    public class a extends AbstractC11311zv0<N20<?>> {
        public a(String str) {
            super(str);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(N20<?> n20) {
            return n20.M() * 10000.0f;
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(N20<?> n20, float f) {
            n20.T(f / 10000.0f);
            n20.O((int) f);
        }
    }

    public N20(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 final AbstractC2755Dl abstractC2755Dl, @InterfaceC5670cr1 AbstractC6717h70<S> abstractC6717h70) {
        super(context, abstractC2755Dl);
        this.u1 = false;
        R(abstractC6717h70);
        AbstractC6717h70.a aVar = new AbstractC6717h70.a();
        this.s1 = aVar;
        aVar.h = true;
        C6092eb2 c6092eb2 = new C6092eb2();
        this.q1 = c6092eb2;
        c6092eb2.g(1.0f);
        c6092eb2.i(50.0f);
        C5850db2 c5850db2 = new C5850db2(this, (AbstractC11311zv0<N20<S>>) H1);
        this.r1 = c5850db2;
        c5850db2.G(c6092eb2);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.v1 = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.M20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                N20.A(N20.this, abstractC2755Dl, valueAnimator2);
            }
        });
        if (abstractC2755Dl.b(true) && abstractC2755Dl.m != 0) {
            valueAnimator.start();
        }
        r(1.0f);
    }

    public static /* synthetic */ void A(N20 n20, AbstractC2755Dl abstractC2755Dl, ValueAnimator valueAnimator) {
        n20.getClass();
        if (abstractC2755Dl.b(true) && abstractC2755Dl.m != 0 && n20.isVisible()) {
            n20.invalidateSelf();
        }
    }

    @InterfaceC5670cr1
    public static N20<KC> G(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 KC kc) {
        return H(context, kc, new AC(kc));
    }

    @InterfaceC5670cr1
    public static N20<KC> H(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 KC kc, @InterfaceC5670cr1 AC ac) {
        return new N20<>(context, kc, ac);
    }

    @InterfaceC5670cr1
    public static N20<C9629t01> I(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 C9629t01 c9629t01) {
        return J(context, c9629t01, new C6192f01(c9629t01));
    }

    @InterfaceC5670cr1
    public static N20<C9629t01> J(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 C9629t01 c9629t01, @InterfaceC5670cr1 C6192f01 c6192f01) {
        return new N20<>(context, c9629t01, c6192f01);
    }

    public void F(@InterfaceC5670cr1 D80.q qVar) {
        this.r1.b(qVar);
    }

    public final float K(int i) {
        float f = i;
        if (f >= 1000.0f && f <= 9000.0f) {
            return 1.0f;
        }
        return 0.0f;
    }

    @InterfaceC5670cr1
    public AbstractC6717h70<S> L() {
        return this.p1;
    }

    public final float M() {
        return this.s1.b;
    }

    public final void N() {
        if (this.w1 != null) {
            return;
        }
        Context context = this.X;
        int i = C7025iN1.c.motionEasingStandardInterpolator;
        TimeInterpolator timeInterpolator = C5600ca.a;
        this.y1 = C9811tl1.g(context, i, timeInterpolator);
        this.z1 = C9811tl1.g(this.X, C7025iN1.c.motionEasingEmphasizedAccelerateInterpolator, timeInterpolator);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.w1 = valueAnimator;
        valueAnimator.setDuration(500L);
        this.w1.setFloatValues(0.0f, 1.0f);
        this.w1.setInterpolator(null);
        this.w1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.L20
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                N20.this.s1.e = r0.x1.getInterpolation(r0.w1.getAnimatedFraction());
            }
        });
    }

    public final void O(int i) {
        if (this.Y.b(true)) {
            N();
            float K = K(i);
            if (K != this.t1) {
                if (this.w1.isRunning()) {
                    this.w1.cancel();
                }
                this.t1 = K;
                if (K == 1.0f) {
                    this.x1 = this.y1;
                    this.w1.start();
                    return;
                }
                this.x1 = this.z1;
                this.w1.reverse();
            } else if (!this.w1.isRunning()) {
                Q(K);
            }
        }
    }

    public void P(@InterfaceC5670cr1 D80.q qVar) {
        this.r1.n(qVar);
    }

    public final void Q(float f) {
        this.s1.e = f;
        invalidateSelf();
    }

    public void R(@InterfaceC5670cr1 AbstractC6717h70<S> abstractC6717h70) {
        this.p1 = abstractC6717h70;
    }

    public void S(boolean z) {
        if (z && !this.v1.isRunning()) {
            this.v1.start();
        } else if (!z && this.v1.isRunning()) {
            this.v1.cancel();
        }
    }

    public final void T(float f) {
        this.s1.b = f;
        invalidateSelf();
    }

    public void U(float f) {
        setLevel((int) (f * 10000.0f));
    }

    @Override // o.AbstractC5006a70, o.InterfaceC8441o9
    public /* bridge */ /* synthetic */ boolean b(@InterfaceC5670cr1 InterfaceC8441o9.a aVar) {
        return super.b(aVar);
    }

    @Override // o.AbstractC5006a70, o.InterfaceC8441o9
    public /* bridge */ /* synthetic */ void c(@InterfaceC5670cr1 InterfaceC8441o9.a aVar) {
        super.c(aVar);
    }

    @Override // o.AbstractC5006a70, o.InterfaceC8441o9
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.k1)) {
            canvas.save();
            this.p1.h(canvas, getBounds(), j(), p(), o());
            this.s1.f = l();
            this.i1.setStyle(Paint.Style.FILL);
            this.i1.setAntiAlias(true);
            AbstractC6717h70.a aVar = this.s1;
            AbstractC2755Dl abstractC2755Dl = this.Y;
            aVar.c = abstractC2755Dl.e[0];
            int i = abstractC2755Dl.i;
            if (i > 0) {
                if (!(this.p1 instanceof C6192f01)) {
                    i = (int) ((i * C9293rd1.d(M(), 0.0f, 0.01f)) / 0.01f);
                }
                this.p1.d(canvas, this.i1, M(), 1.0f, this.Y.f, getAlpha(), i);
            } else {
                this.p1.d(canvas, this.i1, 0.0f, 1.0f, abstractC2755Dl.f, getAlpha(), 0);
            }
            this.p1.c(canvas, this.i1, this.s1, getAlpha());
            this.p1.b(canvas, this.i1, this.Y.e[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.p1.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.p1.f();
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.r1.H();
        T(getLevel() / 10000.0f);
    }

    @Override // o.AbstractC5006a70
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // o.AbstractC5006a70
    public /* bridge */ /* synthetic */ boolean o() {
        return super.o();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        float K = K(i);
        if (this.u1) {
            this.r1.H();
            T(i / 10000.0f);
            Q(K);
            return true;
        }
        this.r1.w(M() * 10000.0f);
        this.r1.C(i);
        return true;
    }

    @Override // o.AbstractC5006a70
    public /* bridge */ /* synthetic */ boolean p() {
        return super.p();
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(@BR0(from = 0, to = 255) int i) {
        super.setAlpha(i);
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@InterfaceC11300zs1 ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // o.AbstractC5006a70, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // o.AbstractC5006a70
    public /* bridge */ /* synthetic */ boolean y(boolean z, boolean z2, boolean z3) {
        return super.y(z, z2, z3);
    }

    @Override // o.AbstractC5006a70
    public boolean z(boolean z, boolean z2, boolean z3) {
        boolean z4 = super.z(z, z2, z3);
        float a2 = this.Z.a(this.X.getContentResolver());
        if (a2 == 0.0f) {
            this.u1 = true;
            return z4;
        }
        this.u1 = false;
        this.q1.i(50.0f / a2);
        return z4;
    }
}
