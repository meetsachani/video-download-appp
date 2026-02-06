package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import o.AbstractC5921dt2;
import o.BM1;

/* renamed from: o.jk0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7351jk0 extends VI2 {
    public static final String e2 = "android:fade:transitionAlpha";
    public static final String f2 = "Fade";
    public static final int g2 = 1;
    public static final int h2 = 2;

    /* renamed from: o.jk0$a */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements AbstractC5921dt2.j {
        public final View a;
        public boolean b = false;

        public a(View view) {
            this.a = view;
        }

        @Override // o.AbstractC5921dt2.j
        public void d(AbstractC5921dt2 abstractC5921dt2) {
            this.a.setTag(BM1.a.transition_pause_alpha, null);
        }

        @Override // o.AbstractC5921dt2.j
        public void l(AbstractC5921dt2 abstractC5921dt2) {
            float f;
            if (this.a.getVisibility() == 0) {
                f = AI2.b(this.a);
            } else {
                f = 0.0f;
            }
            this.a.setTag(BM1.a.transition_pause_alpha, Float.valueOf(f));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AI2.f(this.a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (this.b) {
                this.a.setLayerType(0, null);
            }
            if (z) {
                return;
            }
            AI2.f(this.a, 1.0f);
            AI2.a(this.a);
        }

        @Override // o.AbstractC5921dt2.j
        public void g(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void j(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void p(AbstractC5921dt2 abstractC5921dt2) {
        }

        @Override // o.AbstractC5921dt2.j
        public void k(AbstractC5921dt2 abstractC5921dt2, boolean z) {
        }
    }

    public C7351jk0(int i) {
        b1(i);
    }

    public static float d1(C3291It2 c3291It2, float f) {
        Float f3;
        if (c3291It2 != null && (f3 = (Float) c3291It2.a.get(e2)) != null) {
            return f3.floatValue();
        }
        return f;
    }

    @Override // o.VI2
    public Animator W0(ViewGroup viewGroup, View view, C3291It2 c3291It2, C3291It2 c3291It22) {
        AI2.c(view);
        return c1(view, d1(c3291It2, 0.0f), 1.0f);
    }

    @Override // o.VI2
    public Animator Y0(ViewGroup viewGroup, View view, C3291It2 c3291It2, C3291It2 c3291It22) {
        AI2.c(view);
        Animator c1 = c1(view, d1(c3291It2, 1.0f), 0.0f);
        if (c1 == null) {
            AI2.f(view, d1(c3291It22, 1.0f));
        }
        return c1;
    }

    public final Animator c1(View view, float f, float f3) {
        if (f == f3) {
            return null;
        }
        AI2.f(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, AI2.c, f3);
        a aVar = new a(view);
        ofFloat.addListener(aVar);
        R().d(aVar);
        return ofFloat;
    }

    @Override // o.AbstractC5921dt2
    public boolean d0() {
        return true;
    }

    @Override // o.VI2, o.AbstractC5921dt2
    public void p(C3291It2 c3291It2) {
        super.p(c3291It2);
        Float f = (Float) c3291It2.b.getTag(BM1.a.transition_pause_alpha);
        if (f == null) {
            if (c3291It2.b.getVisibility() == 0) {
                f = Float.valueOf(AI2.b(c3291It2.b));
            } else {
                f = Float.valueOf(0.0f);
            }
        }
        c3291It2.a.put(e2, f);
    }

    public C7351jk0() {
    }

    public C7351jk0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4795Yf2.f);
        b1(C5206aw2.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, S0()));
        obtainStyledAttributes.recycle();
    }
}
