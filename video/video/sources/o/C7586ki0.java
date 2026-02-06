package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.ki0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7586ki0 {
    public final View a;
    public final View b;
    public final List<AnimatorListenerAdapter> c = new ArrayList();
    public final List<View> d = new ArrayList();
    @InterfaceC11300zs1
    public ValueAnimator.AnimatorUpdateListener e;
    public long f;
    public int g;
    public int h;

    /* renamed from: o.ki0$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C7586ki0.this.b.setVisibility(0);
        }
    }

    /* renamed from: o.ki0$b */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C7586ki0.this.b.setVisibility(8);
        }
    }

    public C7586ki0(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2) {
        this.a = view;
        this.b = view2;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C7586ki0 c(@InterfaceC5670cr1 Collection<View> collection) {
        this.d.addAll(collection);
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C7586ki0 d(@InterfaceC5670cr1 View... viewArr) {
        Collections.addAll(this.d, viewArr);
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C7586ki0 e(@InterfaceC5670cr1 AnimatorListenerAdapter animatorListenerAdapter) {
        this.c.add(animatorListenerAdapter);
        return this;
    }

    public final void f(Animator animator, List<AnimatorListenerAdapter> list) {
        for (AnimatorListenerAdapter animatorListenerAdapter : list) {
            animator.addListener(animatorListenerAdapter);
        }
    }

    public final AnimatorSet g(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(k(z), l(z), i(z));
        return animatorSet;
    }

    @InterfaceC5670cr1
    public Animator h() {
        AnimatorSet g = g(false);
        g.addListener(new b());
        f(g, this.c);
        return g;
    }

    public final Animator i(boolean z) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat((this.b.getLeft() - this.a.getLeft()) + (this.a.getRight() - this.b.getRight()), 0.0f);
        ofFloat.addUpdateListener(C9080qm1.m(this.d));
        ofFloat.setDuration(this.f);
        ofFloat.setInterpolator(C10967yU1.a(z, C5600ca.b));
        return ofFloat;
    }

    @InterfaceC5670cr1
    public Animator j() {
        AnimatorSet g = g(true);
        g.addListener(new a());
        f(g, this.c);
        return g;
    }

    public final Animator k(boolean z) {
        Rect e = C10920yI2.e(this.a, this.g);
        Rect e2 = C10920yI2.e(this.b, this.h);
        final Rect rect = new Rect(e);
        ValueAnimator ofObject = ValueAnimator.ofObject(new C10947yP1(rect), e, e2);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.ji0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C10920yI2.z(C7586ki0.this.b, rect);
            }
        });
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.e;
        if (animatorUpdateListener != null) {
            ofObject.addUpdateListener(animatorUpdateListener);
        }
        ofObject.setDuration(this.f);
        ofObject.setInterpolator(C10967yU1.a(z, C5600ca.b));
        return ofObject;
    }

    public final Animator l(boolean z) {
        List<View> k = C10920yI2.k(this.b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(C9080qm1.e(k));
        ofFloat.setDuration(this.f);
        ofFloat.setInterpolator(C10967yU1.a(z, C5600ca.a));
        return ofFloat;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C7586ki0 m(@InterfaceC11300zs1 ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.e = animatorUpdateListener;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C7586ki0 n(int i) {
        this.g = i;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C7586ki0 o(long j) {
        this.f = j;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public C7586ki0 p(int i) {
        this.h = i;
        return this;
    }
}
