package o;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import o.C7025iN1;

@ES1(21)
/* renamed from: o.Mc1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3613Mc1 extends AbstractC7083id1<C10049uk0> {
    public static final float Y0 = 0.92f;
    @InterfaceC8568og
    public static final int Z0 = C7025iN1.c.motionDurationLong1;
    @InterfaceC8568og
    public static final int a1 = C7025iN1.c.motionEasingEmphasizedInterpolator;

    public C3613Mc1() {
        super(n(), o());
    }

    public static C10049uk0 n() {
        return new C10049uk0();
    }

    private static WI2 o() {
        SX1 sx1 = new SX1();
        sx1.o(false);
        sx1.l(0.92f);
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
    @InterfaceC8568og
    public int g(boolean z) {
        return Z0;
    }

    @Override // o.AbstractC7083id1
    @InterfaceC8568og
    public int h(boolean z) {
        return a1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.WI2, o.uk0] */
    @Override // o.AbstractC7083id1
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ C10049uk0 i() {
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
