package o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.PointF;

/* renamed from: o.jv2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7397jv2 extends X11 {
    public C8940qC[] h;
    public int i = 10;
    public float[] j = new float[10];

    /* renamed from: o.jv2$a */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7397jv2.this.j[this.a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InterfaceC9744tT0 interfaceC9744tT0 = C7397jv2.this.g;
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
        int i;
        float min = Math.min(this.b, this.c);
        float f = min / 10.0f;
        this.h = new C8940qC[this.i];
        int i2 = 0;
        while (true) {
            i = this.i;
            if (i2 >= i / 2) {
                break;
            }
            this.h[i2] = new C8940qC();
            this.h[i2].f(this.f.x, f);
            this.h[i2].c(this.a);
            this.h[i2].g(f - ((i2 * f) / 6.0f));
            i2++;
        }
        for (int i3 = i / 2; i3 < this.i; i3++) {
            this.h[i3] = new C8940qC();
            this.h[i3].f(this.f.x, min - f);
            this.h[i3].c(this.a);
            this.h[i3].g(f - (((i3 - 5) * f) / 6.0f));
        }
    }

    @Override // o.X11
    public void j() {
        for (int i = 0; i < this.i; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
            ofFloat.setRepeatCount(-1);
            ofFloat.setDuration(1700L);
            int i2 = i >= 5 ? i - 5 : i;
            ofFloat.setStartDelay(i2 * 100);
            ofFloat.addUpdateListener(new a(i));
            ofFloat.start();
        }
    }
}
