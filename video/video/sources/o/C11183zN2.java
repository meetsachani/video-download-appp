package o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.PointF;

/* renamed from: o.zN2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11183zN2 extends X11 {
    public C8940qC[] h;
    public float j;
    public int i = 5;
    public int[] k = {-2, -1, 0, 1, 2};

    /* renamed from: o.zN2$a */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C11183zN2.this.h[this.a].f(C11183zN2.this.f.x, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            InterfaceC9744tT0 interfaceC9744tT0 = C11183zN2.this.g;
            if (interfaceC9744tT0 != null) {
                interfaceC9744tT0.a();
            }
        }
    }

    @Override // o.X11
    public void a(Canvas canvas) {
        for (int i = 0; i < this.i; i++) {
            canvas.save();
            canvas.translate(this.j * 2.0f * this.k[i], 0.0f);
            this.h[i].a(canvas);
            canvas.restore();
        }
    }

    @Override // o.X11
    public void d() {
        this.h = new C8940qC[this.i];
        int i = this.b;
        this.j = (i / 10.0f) - (i / 100.0f);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.h[i2] = new C8940qC();
            this.h[i2].c(this.a);
            this.h[i2].g(this.j);
            C8940qC c8940qC = this.h[i2];
            PointF pointF = this.f;
            c8940qC.f(pointF.x, pointF.y);
        }
    }

    @Override // o.X11
    public void j() {
        int i;
        for (int i2 = 0; i2 < this.i; i2++) {
            float f = this.f.y;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, this.c / 4.0f, (i * 3) / 4.0f, f);
            ofFloat.setDuration(1000L);
            ofFloat.setStartDelay(i2 * 120);
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new a(i2));
            ofFloat.start();
        }
    }
}
