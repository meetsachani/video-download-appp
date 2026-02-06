package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import o.UC;

/* loaded from: classes3.dex */
public final class NC {

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ UC a;

        public a(UC uc) {
            this.a = uc;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.a();
        }
    }

    @InterfaceC5670cr1
    public static Animator a(@InterfaceC5670cr1 UC uc, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(uc, (Property<UC, V>) UC.c.a, (TypeEvaluator) UC.b.b, (Object[]) new UC.e[]{new UC.e(f, f2, f3)});
        UC.e revealInfo = uc.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) uc, (int) f, (int) f2, revealInfo.c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    @InterfaceC5670cr1
    public static Animator b(UC uc, float f, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(uc, (Property<UC, V>) UC.c.a, (TypeEvaluator) UC.b.b, (Object[]) new UC.e[]{new UC.e(f, f2, f3), new UC.e(f, f2, f4)});
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) uc, (int) f, (int) f2, f3, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    @InterfaceC5670cr1
    public static Animator.AnimatorListener c(@InterfaceC5670cr1 UC uc) {
        return new a(uc);
    }
}
