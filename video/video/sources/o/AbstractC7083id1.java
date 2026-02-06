package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import o.WI2;

@ES1(21)
/* renamed from: o.id1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7083id1<P extends WI2> extends Visibility {
    public final P X;
    @InterfaceC11300zs1
    public WI2 Y;
    public final List<WI2> Z = new ArrayList();

    public AbstractC7083id1(P p, @InterfaceC11300zs1 WI2 wi2) {
        this.X = p;
        this.Y = wi2;
    }

    public static void c(List<Animator> list, @InterfaceC11300zs1 WI2 wi2, ViewGroup viewGroup, View view, boolean z) {
        Animator a;
        if (wi2 != null) {
            if (z) {
                a = wi2.b(viewGroup, view);
            } else {
                a = wi2.a(viewGroup, view);
            }
            if (a != null) {
                list.add(a);
            }
        }
    }

    public void b(@InterfaceC5670cr1 WI2 wi2) {
        this.Z.add(wi2);
    }

    public void d() {
        this.Z.clear();
    }

    public final Animator e(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        c(arrayList, this.X, viewGroup, view, z);
        c(arrayList, this.Y, viewGroup, view, z);
        for (WI2 wi2 : this.Z) {
            c(arrayList, wi2, viewGroup, view, z);
        }
        k(viewGroup.getContext(), z);
        C7069ia.a(animatorSet, arrayList);
        return animatorSet;
    }

    @InterfaceC5670cr1
    public TimeInterpolator f(boolean z) {
        return C5600ca.b;
    }

    @InterfaceC8568og
    public int g(boolean z) {
        return 0;
    }

    @InterfaceC8568og
    public int h(boolean z) {
        return 0;
    }

    @InterfaceC5670cr1
    public P i() {
        return this.X;
    }

    @InterfaceC11300zs1
    public WI2 j() {
        return this.Y;
    }

    public final void k(@InterfaceC5670cr1 Context context, boolean z) {
        C2997Ft2.r(this, context, g(z));
        C2997Ft2.s(this, context, h(z), f(z));
    }

    public boolean l(@InterfaceC5670cr1 WI2 wi2) {
        return this.Z.remove(wi2);
    }

    public void m(@InterfaceC11300zs1 WI2 wi2) {
        this.Y = wi2;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return e(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return e(viewGroup, view, false);
    }
}
