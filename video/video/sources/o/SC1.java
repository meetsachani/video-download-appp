package o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public class SC1 extends X11 {
    public C3615Md[] h;
    public int i = 3;

    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SC1.this.h[this.a].b(((Integer) valueAnimator.getAnimatedValue()).intValue());
            InterfaceC9744tT0 interfaceC9744tT0 = SC1.this.g;
            if (interfaceC9744tT0 != null) {
                interfaceC9744tT0.a();
            }
        }
    }

    @Override // o.X11
    public void a(Canvas canvas) {
        for (int i = 0; i < this.i; i++) {
            this.h[i].a(canvas);
        }
    }

    @Override // o.X11
    public void d() {
        float min = Math.min(this.b, this.c) / 2.0f;
        this.h = new C3615Md[this.i];
        for (int i = 0; i < this.i; i++) {
            float f = (min / 4.0f) + ((i * min) / 4.0f);
            this.h[i] = new C3615Md();
            this.h[i].c(this.a);
            this.h[i].b(126);
            C3615Md c3615Md = this.h[i];
            PointF pointF = this.f;
            float f2 = pointF.x;
            float f3 = pointF.y;
            float f4 = min / 3.0f;
            c3615Md.g(new RectF(f2 - f, (f3 - f) + f4, f2 + f, f3 + f + f4));
            this.h[i].h(225.0f);
            this.h[i].i(90.0f);
            this.h[i].d(Paint.Style.STROKE);
            this.h[i].e(min / 10.0f);
        }
    }

    @Override // o.X11
    public void j() {
        for (int i = 0; i < this.i; i++) {
            ValueAnimator ofInt = ValueAnimator.ofInt(126, 255, 126);
            ofInt.setRepeatCount(-1);
            ofInt.setDuration(1000L);
            ofInt.setStartDelay(i * 120);
            ofInt.addUpdateListener(new a(i));
            ofInt.start();
        }
    }
}
