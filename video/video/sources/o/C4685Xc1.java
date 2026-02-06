package o;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.C7025iN1;
import o.HT1;

/* renamed from: o.Xc1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4685Xc1 extends AbstractC7324jd1<XI2> {
    public static final int j2 = 0;
    public static final int k2 = 1;
    public static final int l2 = 2;
    @InterfaceC8568og
    public static final int m2 = C7025iN1.c.motionDurationLong1;
    @InterfaceC8568og
    public static final int n2 = C7025iN1.c.motionEasingEmphasizedInterpolator;
    public final int h2;
    public final boolean i2;

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Xc1$a */
    /* loaded from: classes3.dex */
    public @interface a {
    }

    public C4685Xc1(int i, boolean z) {
        super(o1(i, z), p1());
        this.h2 = i;
        this.i2 = z;
    }

    public static XI2 o1(int i, boolean z) {
        int i2;
        int i3;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return new TX1(z);
                }
                throw new IllegalArgumentException("Invalid axis: " + i);
            }
            if (z) {
                i3 = 80;
            } else {
                i3 = 48;
            }
            return new C5744d92(i3);
        }
        if (z) {
            i2 = 8388613;
        } else {
            i2 = JE0.b;
        }
        return new C5744d92(i2);
    }

    private static XI2 p1() {
        return new C10292vk0();
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
    @InterfaceC8568og
    public int h1(boolean z) {
        return m2;
    }

    @Override // o.AbstractC7324jd1
    @InterfaceC8568og
    public int i1(boolean z) {
        return n2;
    }

    @Override // o.AbstractC7324jd1
    @InterfaceC5670cr1
    public /* bridge */ /* synthetic */ XI2 j1() {
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

    public int q1() {
        return this.h2;
    }

    public boolean r1() {
        return this.i2;
    }
}
