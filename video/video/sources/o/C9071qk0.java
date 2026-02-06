package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

@ES1(21)
/* renamed from: o.qk0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9071qk0 implements WI2 {
    public float a = 1.0f;

    /* renamed from: o.qk0$a */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;

        public a(View view, float f, float f2, float f3, float f4) {
            this.a = view;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.a.setAlpha(C2997Ft2.m(this.b, this.c, this.d, this.e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: o.qk0$b */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ View a;
        public final /* synthetic */ float b;

        public b(View view, float f) {
            this.a = view;
            this.b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setAlpha(this.b);
        }
    }

    public static Animator c(View view, float f, float f2, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f3, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f, f2, f3, f4));
        ofFloat.addListener(new b(view, f5));
        return ofFloat;
    }

    @Override // o.WI2
    @InterfaceC11300zs1
    public Animator a(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        float f = alpha;
        return c(view, f, 0.0f, 0.0f, 1.0f, f);
    }

    @Override // o.WI2
    @InterfaceC11300zs1
    public Animator b(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        float f = alpha;
        return c(view, 0.0f, f, 0.0f, this.a, f);
    }

    public float d() {
        return this.a;
    }

    public void e(float f) {
        this.a = f;
    }
}
