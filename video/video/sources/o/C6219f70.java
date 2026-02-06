package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.f70  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6219f70 {
    public static final int a = -1728053248;
    public static final int b = Color.alpha(-1728053248);

    /* renamed from: o.f70$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ C5734d70 a;
        public final /* synthetic */ View b;

        public a(C5734d70 c5734d70, View view) {
            this.a = c5734d70;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.g(this.b, false);
            this.a.setScrimColor(-1728053248);
        }
    }

    @InterfaceC5670cr1
    public static Animator.AnimatorListener b(@InterfaceC5670cr1 C5734d70 c5734d70, @InterfaceC5670cr1 View view) {
        return new a(c5734d70, view);
    }

    @InterfaceC5670cr1
    public static ValueAnimator.AnimatorUpdateListener c(@InterfaceC5670cr1 final C5734d70 c5734d70) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: o.e70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C5734d70.this.setScrimColor(C9205rG.D(-1728053248, C5600ca.c(C6219f70.b, 0, valueAnimator.getAnimatedFraction())));
            }
        };
    }
}
