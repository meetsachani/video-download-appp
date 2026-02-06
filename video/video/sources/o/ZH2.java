package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ZH2 {
    public final WeakReference<View> a;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ InterfaceC5295bI2 a;
        public final /* synthetic */ View b;

        public a(InterfaceC5295bI2 interfaceC5295bI2, View view) {
            ZH2.this = r1;
            this.a = interfaceC5295bI2;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a.a(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.b(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.a.c(this.b);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZ(f);
        }

        public static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZBy(f);
        }

        public static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.z(f);
        }

        public static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.zBy(f);
        }
    }

    public ZH2(View view) {
        this.a = new WeakReference<>(view);
    }

    public static /* synthetic */ void a(InterfaceC5780dI2 interfaceC5780dI2, View view, ValueAnimator valueAnimator) {
        interfaceC5780dI2.a(view);
    }

    public ZH2 A(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public ZH2 B(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    public ZH2 C(float f) {
        View view = this.a.get();
        if (view != null) {
            b.a(view.animate(), f);
        }
        return this;
    }

    public ZH2 D(float f) {
        View view = this.a.get();
        if (view != null) {
            b.b(view.animate(), f);
        }
        return this;
    }

    public ZH2 E(Runnable runnable) {
        View view = this.a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    public ZH2 F() {
        View view = this.a.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    public ZH2 G(Runnable runnable) {
        View view = this.a.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    public ZH2 H(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    public ZH2 I(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    public ZH2 J(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    public ZH2 K(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    public ZH2 L(float f) {
        View view = this.a.get();
        if (view != null) {
            b.c(view.animate(), f);
        }
        return this;
    }

    public ZH2 M(float f) {
        View view = this.a.get();
        if (view != null) {
            b.d(view.animate(), f);
        }
        return this;
    }

    public ZH2 b(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public ZH2 c(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    public void d() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long e() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public Interpolator f() {
        View view = this.a.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long g() {
        View view = this.a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    public ZH2 h(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    public ZH2 i(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    public ZH2 j(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    public ZH2 k(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    public ZH2 l(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    public ZH2 m(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    public ZH2 n(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public ZH2 o(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    public ZH2 p(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public ZH2 q(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    public ZH2 r(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public ZH2 s(Interpolator interpolator) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public ZH2 t(InterfaceC5295bI2 interfaceC5295bI2) {
        View view = this.a.get();
        if (view != null) {
            u(view, interfaceC5295bI2);
        }
        return this;
    }

    public final void u(View view, InterfaceC5295bI2 interfaceC5295bI2) {
        if (interfaceC5295bI2 != null) {
            view.animate().setListener(new a(interfaceC5295bI2, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public ZH2 v(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public ZH2 w(final InterfaceC5780dI2 interfaceC5780dI2) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        final View view = this.a.get();
        if (view != null) {
            if (interfaceC5780dI2 != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: o.YH2
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ZH2.a(InterfaceC5780dI2.this, view, valueAnimator);
                    }
                };
            } else {
                animatorUpdateListener = null;
            }
            view.animate().setUpdateListener(animatorUpdateListener);
        }
        return this;
    }

    public void x() {
        View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public ZH2 y(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public ZH2 z(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }
}
