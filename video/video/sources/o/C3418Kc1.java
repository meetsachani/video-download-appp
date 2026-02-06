package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import o.C7025iN1;

@ES1(21)
/* renamed from: o.Kc1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3418Kc1 extends AbstractC7083id1<C9071qk0> {
    public static final float Y0 = 0.8f;
    public static final float Z0 = 0.3f;
    @InterfaceC8568og
    public static final int a1 = C7025iN1.c.motionDurationMedium4;
    @InterfaceC8568og
    public static final int b1 = C7025iN1.c.motionDurationShort3;
    @InterfaceC8568og
    public static final int c1 = C7025iN1.c.motionEasingEmphasizedDecelerateInterpolator;
    @InterfaceC8568og
    public static final int d1 = C7025iN1.c.motionEasingEmphasizedAccelerateInterpolator;

    public C3418Kc1() {
        super(n(), o());
    }

    public static C9071qk0 n() {
        C9071qk0 c9071qk0 = new C9071qk0();
        c9071qk0.e(0.3f);
        return c9071qk0;
    }

    private static WI2 o() {
        SX1 sx1 = new SX1();
        sx1.o(false);
        sx1.l(0.8f);
        return sx1;
    }

    @Override // o.AbstractC7083id1
    public /* bridge */ /* synthetic */ void b(@InterfaceC5670cr1 WI2 wi2) {
        super.b(wi2);
    }

    @Override // o.AbstractC7083id1
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // o.AbstractC7083id1
    @InterfaceC5670cr1
    public TimeInterpolator f(boolean z) {
        return C5600ca.a;
    }

    @Override // o.AbstractC7083id1
    @InterfaceC8568og
    public int g(boolean z) {
        if (z) {
            return a1;
        }
        return b1;
    }

    @Override // o.AbstractC7083id1
    @InterfaceC8568og
    public int h(boolean z) {
        if (z) {
            return c1;
        }
        return d1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.WI2, o.qk0] */
    @Override // o.AbstractC7083id1
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ C9071qk0 i() {
        return super.i();
    }

    @Override // o.AbstractC7083id1
    @InterfaceC11300zs1
    public /* bridge */ /* synthetic */ WI2 j() {
        return super.j();
    }

    @Override // o.AbstractC7083id1
    public /* bridge */ /* synthetic */ boolean l(@InterfaceC5670cr1 WI2 wi2) {
        return super.l(wi2);
    }

    @Override // o.AbstractC7083id1
    public /* bridge */ /* synthetic */ void m(@InterfaceC11300zs1 WI2 wi2) {
        super.m(wi2);
    }

    @Override // o.AbstractC7083id1, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // o.AbstractC7083id1, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }
}
