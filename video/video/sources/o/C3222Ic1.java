package o;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;

@ES1(21)
/* renamed from: o.Ic1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3222Ic1 extends AbstractC7083id1<SX1> {
    public static final float Z0 = 0.85f;
    public final boolean Y0;

    public C3222Ic1(boolean z) {
        super(n(z), o());
        this.Y0 = z;
    }

    public static SX1 n(boolean z) {
        SX1 sx1 = new SX1(z);
        sx1.m(0.85f);
        sx1.l(0.85f);
        return sx1;
    }

    public static WI2 o() {
        return new C9071qk0();
    }

    @Override // o.AbstractC7083id1
    public /* bridge */ /* synthetic */ void b(@InterfaceC5670cr1 WI2 wi2) {
        super.b(wi2);
    }

    @Override // o.AbstractC7083id1
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.WI2, o.SX1] */
    @Override // o.AbstractC7083id1
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ SX1 i() {
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

    public boolean p() {
        return this.Y0;
    }
}
