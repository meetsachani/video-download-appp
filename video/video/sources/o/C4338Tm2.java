package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.Tm2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4338Tm2 extends AbstractC5921dt2 {
    public static final String X1 = "android:textscale:scale";

    /* renamed from: o.Tm2$a */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ TextView a;

        public a(TextView textView) {
            this.a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.a.setScaleX(floatValue);
            this.a.setScaleY(floatValue);
        }
    }

    private void R0(@InterfaceC5670cr1 C3291It2 c3291It2) {
        View view = c3291It2.b;
        if (view instanceof TextView) {
            c3291It2.a.put(X1, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // o.AbstractC5921dt2
    public void m(@InterfaceC5670cr1 C3291It2 c3291It2) {
        R0(c3291It2);
    }

    @Override // o.AbstractC5921dt2
    public void p(@InterfaceC5670cr1 C3291It2 c3291It2) {
        R0(c3291It2);
    }

    @Override // o.AbstractC5921dt2
    public Animator t(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC11300zs1 C3291It2 c3291It2, @InterfaceC11300zs1 C3291It2 c3291It22) {
        float f;
        if (c3291It2 == null || c3291It22 == null || !(c3291It2.b instanceof TextView)) {
            return null;
        }
        View view = c3291It22.b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = c3291It2.a;
        Map<String, Object> map2 = c3291It22.a;
        float f2 = 1.0f;
        if (map.get(X1) != null) {
            f = ((Float) map.get(X1)).floatValue();
        } else {
            f = 1.0f;
        }
        if (map2.get(X1) != null) {
            f2 = ((Float) map2.get(X1)).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
