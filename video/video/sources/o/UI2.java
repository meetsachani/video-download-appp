package o;

import java.util.HashSet;
import o.C5163am;
import o.UK;

/* loaded from: classes.dex */
public class UI2 extends C9696tH0 {
    public int D1 = 0;
    public int E1 = 0;
    public int F1 = 0;
    public int G1 = 0;
    public int H1 = 0;
    public int I1 = 0;
    public int J1 = 0;
    public int K1 = 0;
    public boolean L1 = false;
    public int M1 = 0;
    public int N1 = 0;
    public C5163am.a O1 = new C5163am.a();
    public C5163am.b P1 = null;

    public void A2(boolean z) {
        this.L1 = z;
    }

    public void B2(int i, int i2) {
        this.M1 = i;
        this.N1 = i2;
    }

    public void C2(int i) {
        this.F1 = i;
        this.D1 = i;
        this.G1 = i;
        this.E1 = i;
        this.H1 = i;
        this.I1 = i;
    }

    public void D2(int i) {
        this.E1 = i;
    }

    public void E2(int i) {
        this.I1 = i;
    }

    public void F2(int i) {
        this.F1 = i;
        this.J1 = i;
    }

    public void G2(int i) {
        this.G1 = i;
        this.K1 = i;
    }

    public void H2(int i) {
        this.H1 = i;
        this.J1 = i;
        this.K1 = i;
    }

    public void I2(int i) {
        this.D1 = i;
    }

    @Override // o.C9696tH0, o.InterfaceC8961qH0
    public void b(VK vk) {
        o2();
    }

    public void n2(boolean z) {
        int i = this.H1;
        if (i <= 0 && this.I1 <= 0) {
            return;
        }
        if (z) {
            this.J1 = this.I1;
            this.K1 = i;
            return;
        }
        this.J1 = i;
        this.K1 = this.I1;
    }

    public void o2() {
        for (int i = 0; i < this.C1; i++) {
            UK uk = this.B1[i];
            if (uk != null) {
                uk.J1(true);
            }
        }
    }

    public boolean p2(HashSet<UK> hashSet) {
        for (int i = 0; i < this.C1; i++) {
            if (hashSet.contains(this.B1[i])) {
                return true;
            }
        }
        return false;
    }

    public int q2() {
        return this.N1;
    }

    public int r2() {
        return this.M1;
    }

    public int s2() {
        return this.E1;
    }

    public int t2() {
        return this.J1;
    }

    public int u2() {
        return this.K1;
    }

    public int v2() {
        return this.D1;
    }

    public void x2(UK uk, UK.b bVar, int i, UK.b bVar2, int i2) {
        while (this.P1 == null && U() != null) {
            this.P1 = ((VK) U()).H2();
        }
        C5163am.a aVar = this.O1;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.P1.b(uk, aVar);
        uk.d2(this.O1.e);
        uk.z1(this.O1.f);
        uk.y1(this.O1.h);
        uk.h1(this.O1.g);
    }

    public boolean y2() {
        C5163am.b bVar;
        UK uk = this.c0;
        if (uk != null) {
            bVar = ((VK) uk).H2();
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return false;
        }
        for (int i = 0; i < this.C1; i++) {
            UK uk2 = this.B1[i];
            if (uk2 != null && !(uk2 instanceof C9445sF0)) {
                UK.b z = uk2.z(0);
                UK.b z2 = uk2.z(1);
                UK.b bVar2 = UK.b.MATCH_CONSTRAINT;
                if (z != bVar2 || uk2.w == 1 || z2 != bVar2 || uk2.x == 1) {
                    if (z == bVar2) {
                        z = UK.b.WRAP_CONTENT;
                    }
                    if (z2 == bVar2) {
                        z2 = UK.b.WRAP_CONTENT;
                    }
                    C5163am.a aVar = this.O1;
                    aVar.a = z;
                    aVar.b = z2;
                    aVar.c = uk2.m0();
                    this.O1.d = uk2.D();
                    bVar.b(uk2, this.O1);
                    uk2.d2(this.O1.e);
                    uk2.z1(this.O1.f);
                    uk2.h1(this.O1.g);
                }
            }
        }
        return true;
    }

    public boolean z2() {
        return this.L1;
    }

    public void w2(int i, int i2, int i3, int i4) {
    }
}
