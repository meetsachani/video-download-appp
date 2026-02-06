package o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.PointF;

/* renamed from: o.uN1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9964uN1 extends X11 {
    public RZ0 h;
    public float i;

    /* renamed from: o.uN1$a */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C9964uN1.this.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            InterfaceC9744tT0 interfaceC9744tT0 = C9964uN1.this.g;
            if (interfaceC9744tT0 != null) {
                interfaceC9744tT0.a();
            }
        }
    }

    @Override // o.X11
    public void a(Canvas canvas) {
        canvas.save();
        float f = this.i;
        PointF pointF = this.f;
        canvas.rotate(f, pointF.x, pointF.y);
        this.h.a(canvas);
        canvas.restore();
    }

    @Override // o.X11
    public void d() {
        RZ0 rz0 = new RZ0();
        this.h = rz0;
        rz0.h(this.f);
        this.h.i(new PointF(0.0f, Math.min(this.b, this.c) / 2.0f));
        this.h.c(this.a);
        this.h.e(5.0f);
    }

    @Override // o.X11
    public void j() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 359.0f);
        ofFloat.setDuration(1000L);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new a());
        ofFloat.start();
    }
}
