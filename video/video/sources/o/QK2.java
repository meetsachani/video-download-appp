package o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public class QK2 extends X11 {
    public C3615Md[] h;
    public int i = 3;
    public float[] j;

    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            QK2.this.j[this.a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InterfaceC9744tT0 interfaceC9744tT0 = QK2.this.g;
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
        float min = Math.min(this.b, this.c) / 2.0f;
        int i = this.i;
        this.h = new C3615Md[i];
        this.j = new float[i];
        for (int i2 = 0; i2 < this.i; i2++) {
            float f = (min / 4.0f) + ((i2 * min) / 4.0f);
            this.h[i2] = new C3615Md();
            this.h[i2].c(this.a);
            C3615Md c3615Md = this.h[i2];
            PointF pointF = this.f;
            float f2 = pointF.x;
            float f3 = pointF.y;
            c3615Md.g(new RectF(f2 - f, f3 - f, f2 + f, f3 + f));
            int i3 = i2 * 45;
            this.h[i2].h(i3);
            this.h[i2].i(i3 + 90);
            this.h[i2].d(Paint.Style.STROKE);
            this.h[i2].e(min / 10.0f);
        }
    }

    @Override // o.X11
    public void j() {
        int i;
        for (int i2 = this.i - 1; i2 >= 0; i2--) {
            float f = this.h[i2].f();
            float f2 = this.h[i2].f();
            if (i2 % 2 == 0) {
                i = -1;
            } else {
                i = 1;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2 + (i * 360));
            ofFloat.setRepeatCount(-1);
            ofFloat.setDuration((i2 + 1) * 500);
            ofFloat.addUpdateListener(new a(i2));
            ofFloat.start();
        }
    }
}
