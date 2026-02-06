package o;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;

/* renamed from: o.n42  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8181n42 extends X11 {
    public C8940qC h;
    public C8940qC i;
    public C8940qC[] j;
    public int k = 3;
    public float l;
    public float m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public float f819o;

    /* renamed from: o.n42$a */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8181n42.this.l = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InterfaceC9744tT0 interfaceC9744tT0 = C8181n42.this.g;
            if (interfaceC9744tT0 != null) {
                interfaceC9744tT0.a();
            }
        }
    }

    /* renamed from: o.n42$b */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8181n42.this.m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InterfaceC9744tT0 interfaceC9744tT0 = C8181n42.this.g;
            if (interfaceC9744tT0 != null) {
                interfaceC9744tT0.a();
            }
        }
    }

    @Override // o.X11
    public void a(Canvas canvas) {
        canvas.save();
        float f = this.m;
        PointF pointF = this.f;
        canvas.scale(f, f, pointF.x, pointF.y);
        float f2 = this.l;
        PointF pointF2 = this.f;
        canvas.rotate(f2, pointF2.x, pointF2.y);
        this.h.a(canvas);
        this.i.a(canvas);
        for (int i = 0; i < this.k; i++) {
            canvas.save();
            PointF pointF3 = this.f;
            canvas.rotate(i * 120, pointF3.x, pointF3.y);
            this.j[i].a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // o.X11
    public void d() {
        float min = Math.min(this.b, this.c) / 2.0f;
        this.n = min / 1.5f;
        C8940qC c8940qC = new C8940qC();
        this.h = c8940qC;
        PointF pointF = this.f;
        c8940qC.f(pointF.x, pointF.y);
        this.h.c(this.a);
        this.h.g(min / 4.0f);
        C8940qC c8940qC2 = new C8940qC();
        this.i = c8940qC2;
        PointF pointF2 = this.f;
        c8940qC2.f(pointF2.x, pointF2.y);
        this.i.c(this.a);
        this.i.g(this.n);
        this.i.d(Paint.Style.STROKE);
        this.i.e(min / 20.0f);
        this.j = new C8940qC[this.k];
        for (int i = 0; i < this.k; i++) {
            this.j[i] = new C8940qC();
            C8940qC c8940qC3 = this.j[i];
            PointF pointF3 = this.f;
            c8940qC3.f(pointF3.x, pointF3.y - this.n);
            this.j[i].c(this.a);
            this.j[i].g(min / 6.0f);
        }
    }

    @Override // o.X11
    public void j() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.setDuration(1500L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new a());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        ofFloat2.setDuration(1000L);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.addUpdateListener(new b());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }
}
