package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.List;
import o.C9076ql1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6826ha;

/* loaded from: classes3.dex */
public interface b {
    void a();

    C9076ql1 b();

    void c();

    @InterfaceC11300zs1
    C9076ql1 d();

    boolean e();

    void f(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener);

    void g();

    @InterfaceC6826ha
    int h();

    void i(@InterfaceC5670cr1 Animator.AnimatorListener animatorListener);

    void j(@InterfaceC11300zs1 C9076ql1 c9076ql1);

    AnimatorSet k();

    List<Animator.AnimatorListener> l();

    void m(@InterfaceC11300zs1 ExtendedFloatingActionButton.l lVar);

    void onAnimationStart(Animator animator);
}
