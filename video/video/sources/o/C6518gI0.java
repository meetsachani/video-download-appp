package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

@ES1(21)
/* renamed from: o.gI0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6518gI0 extends Visibility {
    @Override // android.transition.Visibility
    @InterfaceC5670cr1
    public Animator onAppear(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 View view, @InterfaceC11300zs1 TransitionValues transitionValues, @InterfaceC11300zs1 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // android.transition.Visibility
    @InterfaceC5670cr1
    public Animator onDisappear(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 View view, @InterfaceC11300zs1 TransitionValues transitionValues, @InterfaceC11300zs1 TransitionValues transitionValues2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
