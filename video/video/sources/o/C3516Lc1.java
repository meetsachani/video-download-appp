package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import o.C7025iN1;

/* renamed from: o.Lc1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3516Lc1 extends AbstractC7324jd1<C9320rk0> {
    public static final float h2 = 0.8f;
    public static final float i2 = 0.3f;
    @InterfaceC8568og
    public static final int j2 = C7025iN1.c.motionDurationMedium4;
    @InterfaceC8568og
    public static final int k2 = C7025iN1.c.motionDurationShort3;
    @InterfaceC8568og
    public static final int l2 = C7025iN1.c.motionEasingEmphasizedDecelerateInterpolator;
    @InterfaceC8568og
    public static final int m2 = C7025iN1.c.motionEasingEmphasizedAccelerateInterpolator;

    public C3516Lc1() {
        super(o1(), p1());
    }

    public static C9320rk0 o1() {
        C9320rk0 c9320rk0 = new C9320rk0();
        c9320rk0.e(0.3f);
        return c9320rk0;
    }

    private static XI2 p1() {
        TX1 tx1 = new TX1();
        tx1.o(false);
        tx1.l(0.8f);
        return tx1;
    }

    @Override // o.AbstractC7324jd1, o.VI2
    public /* bridge */ /* synthetic */ Animator W0(ViewGroup viewGroup, View view, C3291It2 c3291It2, C3291It2 c3291It22) {
        return super.W0(viewGroup, view, c3291It2, c3291It22);
    }

    @Override // o.AbstractC7324jd1, o.VI2
    public /* bridge */ /* synthetic */ Animator Y0(ViewGroup viewGroup, View view, C3291It2 c3291It2, C3291It2 c3291It22) {
        return super.Y0(viewGroup, view, c3291It2, c3291It22);
    }

    @Override // o.AbstractC7324jd1
    public /* bridge */ /* synthetic */ void c1(@InterfaceC5670cr1 XI2 xi2) {
        super.c1(xi2);
    }

    @Override // o.AbstractC7324jd1, o.AbstractC5921dt2
    public /* bridge */ /* synthetic */ boolean d0() {
        return super.d0();
    }

    @Override // o.AbstractC7324jd1
    public /* bridge */ /* synthetic */ void e1() {
        super.e1();
    }

    @Override // o.AbstractC7324jd1
    @InterfaceC5670cr1
    public TimeInterpolator g1(boolean z) {
        return C5600ca.a;
    }

    @Override // o.AbstractC7324jd1
    @InterfaceC8568og
    public int h1(boolean z) {
        if (z) {
            return j2;
        }
        return k2;
    }

    @Override // o.AbstractC7324jd1
    @InterfaceC8568og
    public int i1(boolean z) {
        if (z) {
            return l2;
        }
        return m2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.XI2, o.rk0] */
    @Override // o.AbstractC7324jd1
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ C9320rk0 j1() {
        return super.j1();
    }

    @Override // o.AbstractC7324jd1
    @InterfaceC11300zs1
    public /* bridge */ /* synthetic */ XI2 k1() {
        return super.k1();
    }

    @Override // o.AbstractC7324jd1
    public /* bridge */ /* synthetic */ boolean m1(@InterfaceC5670cr1 XI2 xi2) {
        return super.m1(xi2);
    }

    @Override // o.AbstractC7324jd1
    public /* bridge */ /* synthetic */ void n1(@InterfaceC11300zs1 XI2 xi2) {
        super.n1(xi2);
    }
}
