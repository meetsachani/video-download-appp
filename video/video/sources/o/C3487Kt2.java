package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import o.AbstractC5921dt2;
import o.BM1;

/* renamed from: o.Kt2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3487Kt2 {
    public static Animator a(View view, C3291It2 c3291It2, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, AbstractC5921dt2 abstractC5921dt2) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) c3291It2.b.getTag(BM1.a.transition_position);
        if (iArr != null) {
            f = (iArr[0] - i) + translationX;
            f2 = (iArr[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f, f3), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f2, f4));
        a aVar = new a(view, c3291It2.b, translationX, translationY);
        abstractC5921dt2.d(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    /* renamed from: o.Kt2$a */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements AbstractC5921dt2.j {
        public final View a;
        public final View b;
        public int[] c;
        public float d;
        public float e;
        public final float f;
        public final float g;
        public boolean h;

        public a(View view, View view2, float f, float f2) {
            this.b = view;
            this.a = view2;
            this.f = f;
            this.g = f2;
            int i = BM1.a.transition_position;
            int[] iArr = (int[]) view2.getTag(i);
            this.c = iArr;
            if (iArr != null) {
                view2.setTag(i, null);
            }
        }

        public final void a() {
            if (this.c == null) {
                this.c = new int[2];
            }
            this.b.getLocationOnScreen(this.c);
            this.a.setTag(BM1.a.transition_position, this.c);
        }

        @Override // o.AbstractC5921dt2.j
        public void d(AbstractC5921dt2 abstractC5921dt2) {
            this.b.setTranslationX(this.d);
            this.b.setTranslationY(this.e);
        }

        @Override // o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
            h(abstractC5921dt2, false);
        }

        @Override // o.AbstractC5921dt2.j
        public void h(AbstractC5921dt2 abstractC5921dt2, boolean z) {
            if (!this.h) {
                this.a.setTag(BM1.a.transition_position, null);
            }
        }

        @Override // o.AbstractC5921dt2.j
        public void l(AbstractC5921dt2 abstractC5921dt2) {
            a();
            this.d = this.b.getTranslationX();
            this.e = this.b.getTranslationY();
            this.b.setTranslationX(this.f);
            this.b.setTranslationY(this.g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.h = true;
            this.b.setTranslationX(this.f);
            this.b.setTranslationY(this.g);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            this.b.setTranslationX(this.f);
            this.b.setTranslationY(this.g);
        }

        @Override // o.AbstractC5921dt2.j
        public void p(AbstractC5921dt2 abstractC5921dt2) {
            this.h = true;
            this.b.setTranslationX(this.f);
            this.b.setTranslationY(this.g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // o.AbstractC5921dt2.j
        public void j(AbstractC5921dt2 abstractC5921dt2) {
        }
    }
}
