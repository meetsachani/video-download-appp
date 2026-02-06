package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.kY0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7548kY0 extends AbstractC5921dt2 {
    public static final String X1 = "NavigationRailLabelVisibility";
    public static final float Y1 = -30.0f;

    @Override // o.AbstractC5921dt2
    public void m(@InterfaceC5670cr1 C3291It2 c3291It2) {
        c3291It2.a.put(X1, Integer.valueOf(c3291It2.b.getVisibility()));
    }

    @Override // o.AbstractC5921dt2
    public void p(@InterfaceC5670cr1 C3291It2 c3291It2) {
        c3291It2.a.put(X1, Integer.valueOf(c3291It2.b.getVisibility()));
    }

    @Override // o.AbstractC5921dt2
    @InterfaceC11300zs1
    public Animator t(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC11300zs1 C3291It2 c3291It2, @InterfaceC11300zs1 C3291It2 c3291It22) {
        if (c3291It2 != null && c3291It22 != null && c3291It2.a.get(X1) != null && c3291It22.a.get(X1) != null) {
            if (((Integer) c3291It2.a.get(X1)).intValue() == 8 && ((Integer) c3291It22.a.get(X1)).intValue() == 0) {
                final View view = c3291It22.b;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.jY0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        view.setTranslationX((1.0f - valueAnimator.getAnimatedFraction()) * (-30.0f));
                    }
                });
                return ofFloat;
            }
            return super.t(viewGroup, c3291It2, c3291It22);
        }
        return super.t(viewGroup, c3291It2, c3291It22);
    }
}
