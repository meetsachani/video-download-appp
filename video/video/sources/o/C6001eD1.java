package o;

import o.MK;

/* renamed from: o.eD1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6001eD1 extends UI2 {
    @Override // o.UK
    public void g(C9872u01 c9872u01, boolean z) {
        super.g(c9872u01, z);
        if (this.C1 > 0) {
            UK uk = this.B1[0];
            uk.S0();
            MK.a aVar = MK.a.LEFT;
            uk.j(aVar, this, aVar);
            MK.a aVar2 = MK.a.RIGHT;
            uk.j(aVar2, this, aVar2);
            MK.a aVar3 = MK.a.TOP;
            uk.j(aVar3, this, aVar3);
            MK.a aVar4 = MK.a.BOTTOM;
            uk.j(aVar4, this, aVar4);
        }
    }

    @Override // o.UI2
    public void w2(int i, int i2, int i3, int i4) {
        int t2 = t2() + u2();
        int v2 = v2() + s2();
        boolean z = false;
        if (this.C1 > 0) {
            t2 += this.B1[0].m0();
            v2 += this.B1[0].D();
        }
        int max = Math.max(Q(), t2);
        int max2 = Math.max(P(), v2);
        if (i != 1073741824) {
            if (i == Integer.MIN_VALUE) {
                i2 = Math.min(max, i2);
            } else if (i == 0) {
                i2 = max;
            } else {
                i2 = 0;
            }
        }
        if (i3 != 1073741824) {
            if (i3 == Integer.MIN_VALUE) {
                i4 = Math.min(max2, i4);
            } else if (i3 == 0) {
                i4 = max2;
            } else {
                i4 = 0;
            }
        }
        B2(i2, i4);
        d2(i2);
        z1(i4);
        if (this.C1 > 0) {
            z = true;
        }
        A2(z);
    }
}
