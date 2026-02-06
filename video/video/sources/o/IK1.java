package o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.PointF;

/* loaded from: classes3.dex */
public class IK1 extends X11 {
    public RZ0[] h;
    public int i;
    public float j;
    public float k;
    public float[] l;

    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IK1.this.l[this.a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InterfaceC9744tT0 interfaceC9744tT0 = IK1.this.g;
            if (interfaceC9744tT0 != null) {
                interfaceC9744tT0.a();
            }
        }
    }

    public IK1(int i) throws C9009qT0 {
        if (i >= 3 && i <= 5) {
            this.i = i;
            this.h = new RZ0[i];
            this.l = new float[i];
            return;
        }
        throw new C9009qT0();
    }

    @Override // o.X11
    public void a(Canvas canvas) {
        for (int i = 0; i < this.i; i++) {
            canvas.save();
            canvas.translate(i * (this.j + this.k), 0.0f);
            canvas.scale(1.0f, this.l[i], this.h[i].f().x, this.f.y);
            this.h[i].a(canvas);
            canvas.restore();
        }
    }

    @Override // o.X11
    public void d() {
        int i = this.b;
        int i2 = this.i;
        float f = i / (i2 * 2);
        this.j = f;
        float f2 = f / 4.0f;
        this.k = f2;
        float f3 = ((i - ((i2 * f) + (f2 * (i2 - 1)))) / 2.0f) + (f / 2.0f);
        for (int i3 = 0; i3 < this.i; i3++) {
            this.h[i3] = new RZ0();
            this.h[i3].c(this.a);
            this.h[i3].e(this.j);
            this.h[i3].h(new PointF(f3, this.f.y - (this.c / 4.0f)));
            this.h[i3].i(new PointF(f3, this.f.y + (this.c / 4.0f)));
        }
    }

    @Override // o.X11
    public void j() {
        for (int i = 0; i < this.i; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.5f, 1.0f);
            ofFloat.setDuration(1000L);
            ofFloat.setStartDelay(i * 120);
            ofFloat.setRepeatCount(-1);
            ofFloat.addUpdateListener(new a(i));
            ofFloat.start();
        }
    }
}
