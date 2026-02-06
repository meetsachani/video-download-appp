package o;

import android.animation.ValueAnimator;
import android.view.View;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.wk0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10538wk0 implements ValueAnimator.AnimatorUpdateListener {
    @InterfaceC11300zs1
    public final View a;
    @InterfaceC11300zs1
    public final View b;
    public final float[] c = new float[2];

    public C10538wk0(@InterfaceC11300zs1 View view, @InterfaceC11300zs1 View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
        C10781xk0.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.c);
        View view = this.a;
        if (view != null) {
            view.setAlpha(this.c[0]);
        }
        View view2 = this.b;
        if (view2 != null) {
            view2.setAlpha(this.c[1]);
        }
    }
}
