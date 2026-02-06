package o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.PointF;

/* renamed from: o.tD  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9679tD extends X11 {
    public C8940qC[] h;
    public int i = 8;

    /* renamed from: o.tD$a */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C9679tD.this.h[this.a].b(((Integer) valueAnimator.getAnimatedValue()).intValue());
            InterfaceC9744tT0 interfaceC9744tT0 = C9679tD.this.g;
            if (interfaceC9744tT0 != null) {
                interfaceC9744tT0.a();
            }
        }
    }

    @Override // o.X11
    public void a(Canvas canvas) {
        for (int i = 0; i < this.i; i++) {
            canvas.save();
            PointF pointF = this.f;
            canvas.rotate(i * 45, pointF.x, pointF.y);
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
            this.h[i].b(126);
            this.h[i].g(min);
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
