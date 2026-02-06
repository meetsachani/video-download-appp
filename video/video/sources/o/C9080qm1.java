package o;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.Collection;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.qm1 */
/* loaded from: classes3.dex */
public class C9080qm1 implements ValueAnimator.AnimatorUpdateListener {
    public final a a;
    public final View[] b;

    /* renamed from: o.qm1$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a(@InterfaceC5670cr1 ValueAnimator valueAnimator, @InterfaceC5670cr1 View view);
    }

    @SuppressLint({"LambdaLast"})
    public C9080qm1(@InterfaceC5670cr1 a aVar, @InterfaceC5670cr1 View... viewArr) {
        this.a = aVar;
        this.b = viewArr;
    }

    @InterfaceC5670cr1
    public static C9080qm1 e(@InterfaceC5670cr1 Collection<View> collection) {
        return new C9080qm1(new C8837pm1(), collection);
    }

    @InterfaceC5670cr1
    public static C9080qm1 f(@InterfaceC5670cr1 View... viewArr) {
        return new C9080qm1(new C8837pm1(), viewArr);
    }

    @InterfaceC5670cr1
    public static C9080qm1 g(@InterfaceC5670cr1 Collection<View> collection) {
        return new C9080qm1(new C8350nm1(), collection);
    }

    @InterfaceC5670cr1
    public static C9080qm1 h(@InterfaceC5670cr1 View... viewArr) {
        return new C9080qm1(new C8350nm1(), viewArr);
    }

    public static void i(@InterfaceC5670cr1 ValueAnimator valueAnimator, @InterfaceC5670cr1 View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void j(@InterfaceC5670cr1 ValueAnimator valueAnimator, @InterfaceC5670cr1 View view) {
        Float f = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f.floatValue());
        view.setScaleY(f.floatValue());
    }

    public static void k(@InterfaceC5670cr1 ValueAnimator valueAnimator, @InterfaceC5670cr1 View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static void l(@InterfaceC5670cr1 ValueAnimator valueAnimator, @InterfaceC5670cr1 View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    @InterfaceC5670cr1
    public static C9080qm1 m(@InterfaceC5670cr1 Collection<View> collection) {
        return new C9080qm1(new C8107mm1(), collection);
    }

    @InterfaceC5670cr1
    public static C9080qm1 n(@InterfaceC5670cr1 View... viewArr) {
        return new C9080qm1(new C8107mm1(), viewArr);
    }

    @InterfaceC5670cr1
    public static C9080qm1 o(@InterfaceC5670cr1 Collection<View> collection) {
        return new C9080qm1(new C8594om1(), collection);
    }

    @InterfaceC5670cr1
    public static C9080qm1 p(@InterfaceC5670cr1 View... viewArr) {
        return new C9080qm1(new C8594om1(), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
        for (View view : this.b) {
            this.a.a(valueAnimator, view);
        }
    }

    @SuppressLint({"LambdaLast"})
    public C9080qm1(@InterfaceC5670cr1 a aVar, @InterfaceC5670cr1 Collection<View> collection) {
        this.a = aVar;
        this.b = (View[]) collection.toArray(new View[0]);
    }
}
