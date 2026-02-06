package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.e91  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5985e91 extends Z81<View> {
    public final float k;
    public final float l;

    /* renamed from: o.e91$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5985e91.this.b.setTranslationY(0.0f);
            C5985e91.this.k(0.0f);
        }
    }

    public C5985e91(@InterfaceC5670cr1 View view) {
        super(view);
        Resources resources = view.getResources();
        this.k = resources.getDimension(C7025iN1.f.m3_back_progress_bottom_container_max_scale_x_distance);
        this.l = resources.getDimension(C7025iN1.f.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator g = g();
        g.setDuration(this.e);
        g.start();
    }

    public final Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.b, View.SCALE_Y, 1.0f));
        V v = this.b;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new C10304vn0());
        return animatorSet;
    }

    public void h(@InterfaceC5670cr1 C8827pk c8827pk, @InterfaceC11300zs1 Animator.AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.b, View.TRANSLATION_Y, this.b.getHeight() * this.b.getScaleY());
        ofFloat.setInterpolator(new C10304vn0());
        ofFloat.setDuration(C5600ca.c(this.c, this.d, c8827pk.b()));
        ofFloat.addListener(new a());
        if (animatorListener != null) {
            ofFloat.addListener(animatorListener);
        }
        ofFloat.start();
    }

    public void i(@InterfaceC5670cr1 C8827pk c8827pk, @InterfaceC11300zs1 Animator.AnimatorListener animatorListener) {
        Animator g = g();
        g.setDuration(C5600ca.c(this.c, this.d, c8827pk.b()));
        if (animatorListener != null) {
            g.addListener(animatorListener);
        }
        g.start();
    }

    public void j(@InterfaceC5670cr1 C8827pk c8827pk) {
        super.d(c8827pk);
    }

    @InterfaceC5056aJ2
    public void k(float f) {
        float f2;
        float a2 = a(f);
        float width = this.b.getWidth();
        float height = this.b.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float a3 = 1.0f - C5600ca.a(0.0f, this.k / width, a2);
            float a4 = 1.0f - C5600ca.a(0.0f, this.l / height, a2);
            if (!Float.isNaN(a3) && !Float.isNaN(a4)) {
                this.b.setScaleX(a3);
                this.b.setPivotY(height);
                this.b.setScaleY(a4);
                V v = this.b;
                if (v instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) v;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        View childAt = viewGroup.getChildAt(i);
                        childAt.setPivotY(-childAt.getTop());
                        if (a4 != 0.0f) {
                            f2 = a3 / a4;
                        } else {
                            f2 = 1.0f;
                        }
                        childAt.setScaleY(f2);
                    }
                }
            }
        }
    }

    public void l(@InterfaceC5670cr1 C8827pk c8827pk) {
        if (super.e(c8827pk) == null) {
            return;
        }
        k(c8827pk.b());
    }
}
