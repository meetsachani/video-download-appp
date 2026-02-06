package o;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.Jc1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3320Jc1 extends AbstractC7324jd1<TX1> {
    public static final float i2 = 0.85f;
    public final boolean h2;

    public C3320Jc1(boolean z) {
        super(o1(z), p1());
        this.h2 = z;
    }

    public static TX1 o1(boolean z) {
        TX1 tx1 = new TX1(z);
        tx1.m(0.85f);
        tx1.l(0.85f);
        return tx1;
    }

    public static XI2 p1() {
        return new C9320rk0();
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

    /* JADX WARN: Type inference failed for: r0v0, types: [o.XI2, o.TX1] */
    @Override // o.AbstractC7324jd1
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ TX1 j1() {
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

    public boolean q1() {
        return this.h2;
    }
}
