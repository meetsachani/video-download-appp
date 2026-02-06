package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;

@ES1(21)
/* loaded from: classes3.dex */
public final class SX1 implements WI2 {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ View a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;

        public a(View view, float f, float f2) {
            this.a = view;
            this.b = f;
            this.c = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setScaleX(this.b);
            this.a.setScaleY(this.c);
        }
    }

    public SX1() {
        this(true);
    }

    public static Animator c(View view, float f, float f2) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat(View.SCALE_Y, f * scaleY, f2 * scaleY));
        ofPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // o.WI2
    @InterfaceC11300zs1
    public Animator a(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 View view) {
        if (!this.f) {
            return null;
        }
        if (this.e) {
            return c(view, this.a, this.b);
        }
        return c(view, this.d, this.c);
    }

    @Override // o.WI2
    @InterfaceC11300zs1
    public Animator b(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 View view) {
        if (this.e) {
            return c(view, this.c, this.d);
        }
        return c(view, this.b, this.a);
    }

    public float d() {
        return this.d;
    }

    public float e() {
        return this.c;
    }

    public float f() {
        return this.b;
    }

    public float g() {
        return this.a;
    }

    public boolean h() {
        return this.e;
    }

    public boolean i() {
        return this.f;
    }

    public void j(boolean z) {
        this.e = z;
    }

    public void k(float f) {
        this.d = f;
    }

    public void l(float f) {
        this.c = f;
    }

    public void m(float f) {
        this.b = f;
    }

    public void n(float f) {
        this.a = f;
    }

    public void o(boolean z) {
        this.f = z;
    }

    public SX1(boolean z) {
        this.a = 1.0f;
        this.b = 1.1f;
        this.c = 0.8f;
        this.d = 1.0f;
        this.f = true;
        this.e = z;
    }
}
