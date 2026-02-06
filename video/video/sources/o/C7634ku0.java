package o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.PointF;

/* renamed from: o.ku0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7634ku0 extends X11 {
    public C8940qC[] h;
    public int i = 5;
    public float[] j = new float[5];

    /* renamed from: o.ku0$a */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7634ku0.this.j[this.a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InterfaceC9744tT0 interfaceC9744tT0 = C7634ku0.this.g;
            if (interfaceC9744tT0 != null) {
                interfaceC9744tT0.a();
            }
        }
    }

    @Override // o.X11
    public void a(Canvas canvas) {
        for (int i = 0; i < this.i; i++) {
            canvas.save();
            float f = this.j[i];
            PointF pointF = this.f;
            canvas.rotate(f, pointF.x, pointF.y);
            this.h[i].a(canvas);
            canvas.restore();
        }
    }

    @Override // o.X11
    public void d() {
        float min = Math.min(this.b, this.c) / 10.0f;
        this.h = new C8940qC[this.i];
        for (int i = 0; i < this.i; i++) {
            this.h[i] = new C8940qC();
            this.h[i].f(this.f.x, min);
            this.h[i].c(this.a);
            this.h[i].g(min - ((i * min) / 6.0f));
        }
    }

    @Override // o.X11
    public void j() {
        for (int i = 0; i < this.i; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
            ofFloat.setRepeatCount(-1);
            ofFloat.setDuration(1700L);
            ofFloat.setStartDelay(i * 100);
            ofFloat.addUpdateListener(new a(i));
            ofFloat.start();
        }
    }
}
