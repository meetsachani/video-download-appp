package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import o.XI2;

/* renamed from: o.jd1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7324jd1<P extends XI2> extends VI2 {
    public final P e2;
    @InterfaceC11300zs1
    public XI2 f2;
    public final List<XI2> g2 = new ArrayList();

    public AbstractC7324jd1(P p, @InterfaceC11300zs1 XI2 xi2) {
        this.e2 = p;
        this.f2 = xi2;
    }

    public static void d1(List<Animator> list, @InterfaceC11300zs1 XI2 xi2, ViewGroup viewGroup, View view, boolean z) {
        Animator a;
        if (xi2 != null) {
            if (z) {
                a = xi2.b(viewGroup, view);
            } else {
                a = xi2.a(viewGroup, view);
            }
            if (a != null) {
                list.add(a);
            }
        }
    }

    @Override // o.VI2
    public Animator W0(ViewGroup viewGroup, View view, C3291It2 c3291It2, C3291It2 c3291It22) {
        return f1(viewGroup, view, true);
    }

    @Override // o.VI2
    public Animator Y0(ViewGroup viewGroup, View view, C3291It2 c3291It2, C3291It2 c3291It22) {
        return f1(viewGroup, view, false);
    }

    public void c1(@InterfaceC5670cr1 XI2 xi2) {
        this.g2.add(xi2);
    }

    @Override // o.AbstractC5921dt2
    public boolean d0() {
        return true;
    }

    public void e1() {
        this.g2.clear();
    }

    public final Animator f1(@InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 View view, boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        d1(arrayList, this.e2, viewGroup, view, z);
        d1(arrayList, this.f2, viewGroup, view, z);
        for (XI2 xi2 : this.g2) {
            d1(arrayList, xi2, viewGroup, view, z);
        }
        l1(viewGroup.getContext(), z);
        C7069ia.a(animatorSet, arrayList);
        return animatorSet;
    }

    @InterfaceC5670cr1
    public TimeInterpolator g1(boolean z) {
        return C5600ca.b;
    }

    @InterfaceC8568og
    public int h1(boolean z) {
        return 0;
    }

    @InterfaceC8568og
    public int i1(boolean z) {
        return 0;
    }

    @InterfaceC5670cr1
    public P j1() {
        return this.e2;
    }

    @InterfaceC11300zs1
    public XI2 k1() {
        return this.f2;
    }

    public final void l1(@InterfaceC5670cr1 Context context, boolean z) {
        C3095Gt2.r(this, context, h1(z));
        C3095Gt2.s(this, context, i1(z), g1(z));
    }

    public boolean m1(@InterfaceC5670cr1 XI2 xi2) {
        return this.g2.remove(xi2);
    }

    public void n1(@InterfaceC11300zs1 XI2 xi2) {
        this.f2 = xi2;
    }
}
