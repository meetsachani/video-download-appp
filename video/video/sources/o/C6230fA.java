package o;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.fA  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6230fA extends AbstractC5921dt2 {
    public static final String X1 = "android:changeScroll:x";
    public static final String Y1 = "android:changeScroll:y";
    public static final String[] Z1 = {X1, Y1};

    public C6230fA() {
    }

    private void R0(C3291It2 c3291It2) {
        c3291It2.a.put(X1, Integer.valueOf(c3291It2.b.getScrollX()));
        c3291It2.a.put(Y1, Integer.valueOf(c3291It2.b.getScrollY()));
    }

    @Override // o.AbstractC5921dt2
    public String[] Z() {
        return Z1;
    }

    @Override // o.AbstractC5921dt2
    public boolean d0() {
        return true;
    }

    @Override // o.AbstractC5921dt2
    public void m(C3291It2 c3291It2) {
        R0(c3291It2);
    }

    @Override // o.AbstractC5921dt2
    public void p(C3291It2 c3291It2) {
        R0(c3291It2);
    }

    @Override // o.AbstractC5921dt2
    public Animator t(ViewGroup viewGroup, C3291It2 c3291It2, C3291It2 c3291It22) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (c3291It2 == null || c3291It22 == null) {
            return null;
        }
        View view = c3291It22.b;
        int intValue = ((Integer) c3291It2.a.get(X1)).intValue();
        int intValue2 = ((Integer) c3291It22.a.get(X1)).intValue();
        int intValue3 = ((Integer) c3291It2.a.get(Y1)).intValue();
        int intValue4 = ((Integer) c3291It22.a.get(Y1)).intValue();
        if (intValue != intValue2) {
            view.setScrollX(intValue);
            objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
        } else {
            objectAnimator = null;
        }
        if (intValue3 != intValue4) {
            view.setScrollY(intValue3);
            objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
        }
        return C3193Ht2.c(objectAnimator, objectAnimator2);
    }

    public C6230fA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
