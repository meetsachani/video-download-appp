package o;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.C7025iN1;
import o.HT1;

@ES1(21)
/* renamed from: o.Yc1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4782Yc1 extends AbstractC7083id1<WI2> {
    public static final int a1 = 0;
    public static final int b1 = 1;
    public static final int c1 = 2;
    @InterfaceC8568og
    public static final int d1 = C7025iN1.c.motionDurationLong1;
    @InterfaceC8568og
    public static final int e1 = C7025iN1.c.motionEasingEmphasizedInterpolator;
    public final int Y0;
    public final boolean Z0;

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Yc1$a */
    /* loaded from: classes3.dex */
    public @interface a {
    }

    public C4782Yc1(int i, boolean z) {
        super(n(i, z), o());
        this.Y0 = i;
        this.Z0 = z;
    }

    public static WI2 n(int i, boolean z) {
        int i2;
        int i3;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return new SX1(z);
                }
                throw new IllegalArgumentException("Invalid axis: " + i);
            }
            if (z) {
                i3 = 80;
            } else {
                i3 = 48;
            }
            return new C5501c92(i3);
        }
        if (z) {
            i2 = 8388613;
        } else {
            i2 = JE0.b;
        }
        return new C5501c92(i2);
    }

    private static WI2 o() {
        return new C10049uk0();
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
        return d1;
    }

    @Override // o.AbstractC7083id1
    @InterfaceC8568og
    public int h(boolean z) {
        return e1;
    }

    @Override // o.AbstractC7083id1
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ WI2 i() {
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

    public int p() {
        return this.Y0;
    }

    public boolean q() {
        return this.Z0;
    }
}
