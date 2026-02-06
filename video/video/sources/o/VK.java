package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import o.C5163am;
import o.UK;

/* loaded from: classes.dex */
public class VK extends TK2 {
    public static final int h2 = 8;
    public static final boolean i2 = false;
    public static final boolean j2 = false;
    public static final boolean k2 = false;
    public static int l2;
    public C5163am C1;
    public C8658p20 D1;
    public int E1;
    public C5163am.b F1;
    public boolean G1;
    public C3641Mj1 H1;
    public C9872u01 I1;
    public int J1;
    public int K1;
    public int L1;
    public int M1;
    public int N1;
    public int O1;
    public C4478Uz[] P1;
    public C4478Uz[] Q1;
    public boolean R1;
    public boolean S1;
    public boolean T1;
    public int U1;
    public int V1;
    public int W1;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;
    public int a2;
    public WeakReference<MK> b2;
    public WeakReference<MK> c2;
    public WeakReference<MK> d2;
    public WeakReference<MK> e2;
    public HashSet<UK> f2;
    public C5163am.a g2;

    public VK() {
        this.C1 = new C5163am(this);
        this.D1 = new C8658p20(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new C9872u01();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new C4478Uz[4];
        this.Q1 = new C4478Uz[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 257;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.a2 = 0;
        this.b2 = null;
        this.c2 = null;
        this.d2 = null;
        this.e2 = null;
        this.f2 = new HashSet<>();
        this.g2 = new C5163am.a();
    }

    public static boolean S2(int i, UK uk, C5163am.b bVar, C5163am.a aVar, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        if (bVar == null) {
            return false;
        }
        if (uk.l0() != 8 && !(uk instanceof C9445sF0) && !(uk instanceof C4327Tk)) {
            aVar.a = uk.H();
            aVar.b = uk.j0();
            aVar.c = uk.m0();
            aVar.d = uk.D();
            aVar.i = false;
            aVar.j = i3;
            UK.b bVar2 = aVar.a;
            UK.b bVar3 = UK.b.MATCH_CONSTRAINT;
            if (bVar2 == bVar3) {
                z = true;
            } else {
                z = false;
            }
            if (aVar.b == bVar3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && uk.f0 > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && uk.f0 > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && uk.r0(0) && uk.w == 0 && !z3) {
                aVar.a = UK.b.WRAP_CONTENT;
                if (z2 && uk.x == 0) {
                    aVar.a = UK.b.FIXED;
                }
                z = false;
            }
            if (z2 && uk.r0(1) && uk.x == 0 && !z4) {
                aVar.b = UK.b.WRAP_CONTENT;
                if (z && uk.w == 0) {
                    aVar.b = UK.b.FIXED;
                }
                z2 = false;
            }
            if (uk.G0()) {
                aVar.a = UK.b.FIXED;
                z = false;
            }
            if (uk.H0()) {
                aVar.b = UK.b.FIXED;
                z2 = false;
            }
            if (z3) {
                if (uk.y[0] == 4) {
                    aVar.a = UK.b.FIXED;
                } else if (!z2) {
                    UK.b bVar4 = aVar.b;
                    UK.b bVar5 = UK.b.FIXED;
                    if (bVar4 == bVar5) {
                        i5 = aVar.d;
                    } else {
                        aVar.a = UK.b.WRAP_CONTENT;
                        bVar.b(uk, aVar);
                        i5 = aVar.f;
                    }
                    aVar.a = bVar5;
                    aVar.c = (int) (uk.A() * i5);
                }
            }
            if (z4) {
                if (uk.y[1] == 4) {
                    aVar.b = UK.b.FIXED;
                } else if (!z) {
                    UK.b bVar6 = aVar.a;
                    UK.b bVar7 = UK.b.FIXED;
                    if (bVar6 == bVar7) {
                        i4 = aVar.c;
                    } else {
                        aVar.b = UK.b.WRAP_CONTENT;
                        bVar.b(uk, aVar);
                        i4 = aVar.e;
                    }
                    aVar.b = bVar7;
                    if (uk.B() == -1) {
                        aVar.d = (int) (i4 / uk.A());
                    } else {
                        aVar.d = (int) (uk.A() * i4);
                    }
                }
            }
            bVar.b(uk, aVar);
            uk.d2(aVar.e);
            uk.z1(aVar.f);
            uk.y1(aVar.h);
            uk.h1(aVar.g);
            aVar.j = C5163am.a.k;
            return aVar.i;
        }
        aVar.e = 0;
        aVar.f = 0;
        return false;
    }

    public void A2(MK mk) {
        WeakReference<MK> weakReference = this.b2;
        if (weakReference != null && weakReference.get() != null && mk.f() <= this.b2.get().f()) {
            return;
        }
        this.b2 = new WeakReference<>(mk);
    }

    public void B2() {
        this.D1.f(H(), j0());
    }

    public boolean C2(boolean z) {
        return this.D1.g(z);
    }

    public boolean D2(boolean z) {
        return this.D1.h(z);
    }

    public boolean E2(boolean z, int i) {
        return this.D1.i(z, i);
    }

    public void F2(C3641Mj1 c3641Mj1) {
        this.H1 = c3641Mj1;
        this.I1.D(c3641Mj1);
    }

    public ArrayList<C9445sF0> G2() {
        ArrayList<C9445sF0> arrayList = new ArrayList<>();
        int size = this.B1.size();
        for (int i = 0; i < size; i++) {
            UK uk = this.B1.get(i);
            if (uk instanceof C9445sF0) {
                C9445sF0 c9445sF0 = (C9445sF0) uk;
                if (c9445sF0.o2() == 0) {
                    arrayList.add(c9445sF0);
                }
            }
        }
        return arrayList;
    }

    public C5163am.b H2() {
        return this.F1;
    }

    public int I2() {
        return this.W1;
    }

    public C9872u01 J2() {
        return this.I1;
    }

    public ArrayList<C9445sF0> K2() {
        ArrayList<C9445sF0> arrayList = new ArrayList<>();
        int size = this.B1.size();
        for (int i = 0; i < size; i++) {
            UK uk = this.B1.get(i);
            if (uk instanceof C9445sF0) {
                C9445sF0 c9445sF0 = (C9445sF0) uk;
                if (c9445sF0.o2() == 1) {
                    arrayList.add(c9445sF0);
                }
            }
        }
        return arrayList;
    }

    public boolean L2() {
        return false;
    }

    public void M2() {
        this.D1.o();
    }

    public void N2() {
        this.D1.p();
    }

    public boolean O2() {
        return this.Z1;
    }

    public boolean P2() {
        return this.G1;
    }

    public boolean Q2() {
        return this.Y1;
    }

    @Override // o.TK2, o.UK
    public void R0() {
        this.I1.W();
        this.J1 = 0;
        this.L1 = 0;
        this.K1 = 0;
        this.M1 = 0;
        this.X1 = false;
        super.R0();
    }

    public long R2(int i, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.J1 = i9;
        this.K1 = i10;
        return this.C1.d(this, i, i9, i10, i3, i4, i5, i6, i7, i8);
    }

    public boolean T2(int i) {
        if ((this.W1 & i) == i) {
            return true;
        }
        return false;
    }

    public final void U2() {
        this.N1 = 0;
        this.O1 = 0;
    }

    public void V2(C5163am.b bVar) {
        this.F1 = bVar;
        this.D1.u(bVar);
    }

    public void W2(int i) {
        this.W1 = i;
        C9872u01.w = T2(512);
    }

    public void X2(int i, int i3, int i4, int i5) {
        this.J1 = i;
        this.K1 = i3;
        this.L1 = i4;
        this.M1 = i5;
    }

    public void Y2(int i) {
        this.E1 = i;
    }

    public void Z2(boolean z) {
        this.G1 = z;
    }

    public boolean a3(C9872u01 c9872u01, boolean[] zArr) {
        zArr[2] = false;
        boolean T2 = T2(64);
        k2(c9872u01, T2);
        int size = this.B1.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            UK uk = this.B1.get(i);
            uk.k2(c9872u01, T2);
            if (uk.t0()) {
                z = true;
            }
        }
        return z;
    }

    @Override // o.UK
    public void b0(StringBuilder sb) {
        sb.append(this.f625o + ":{\n");
        sb.append("  actualWidth:" + this.d0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.e0);
        sb.append("\n");
        Iterator<UK> it = m2().iterator();
        while (it.hasNext()) {
            it.next().b0(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public void b3() {
        this.C1.e(this);
    }

    @Override // o.UK
    public String f0() {
        return ConstraintLayout.y1;
    }

    @Override // o.UK
    public void j2(boolean z, boolean z2) {
        super.j2(z, z2);
        int size = this.B1.size();
        for (int i = 0; i < size; i++) {
            this.B1.get(i).j2(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0247 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033b  */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    @Override // o.TK2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void o2() {
        int i;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        char c;
        boolean z5;
        boolean z6;
        int max;
        int max2;
        int i5;
        ?? r6;
        UK.b bVar;
        int i6 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.Y1 = false;
        this.Z1 = false;
        int size = this.B1.size();
        int max3 = Math.max(0, m0());
        int max4 = Math.max(0, D());
        UK.b[] bVarArr = this.b0;
        boolean z7 = true;
        UK.b bVar2 = bVarArr[1];
        UK.b bVar3 = bVarArr[0];
        C3641Mj1 c3641Mj1 = this.H1;
        if (c3641Mj1 != null) {
            c3641Mj1.K++;
        }
        if (this.E1 == 0 && C4077Qv1.b(this.W1, 1)) {
            C10615x30.j(this, H2());
            for (int i7 = 0; i7 < size; i7++) {
                UK uk = this.B1.get(i7);
                if (uk.F0() && !(uk instanceof C9445sF0) && !(uk instanceof C4327Tk) && !(uk instanceof UI2) && !uk.E0()) {
                    UK.b z8 = uk.z(0);
                    UK.b z9 = uk.z(1);
                    UK.b bVar4 = UK.b.MATCH_CONSTRAINT;
                    if (z8 != bVar4 || uk.w == 1 || z9 != bVar4 || uk.x == 1) {
                        S2(0, uk, this.F1, new C5163am.a(), C5163am.a.k);
                    }
                }
            }
        }
        char c2 = 2;
        if (size > 2 && ((bVar3 == (bVar = UK.b.WRAP_CONTENT) || bVar2 == bVar) && C4077Qv1.b(this.W1, 1024) && VE0.c(this, H2()))) {
            if (bVar3 == bVar) {
                if (max3 < m0() && max3 > 0) {
                    d2(max3);
                    this.Y1 = true;
                } else {
                    max3 = m0();
                }
            }
            if (bVar2 == bVar) {
                if (max4 < D() && max4 > 0) {
                    z1(max4);
                    this.Z1 = true;
                } else {
                    max4 = D();
                }
            }
            i = max4;
            i3 = max3;
            z = true;
        } else {
            i = max4;
            i3 = max3;
            z = false;
        }
        if (!T2(64) && !T2(128)) {
            z2 = false;
        } else {
            z2 = true;
        }
        C9872u01 c9872u01 = this.I1;
        c9872u01.i = false;
        c9872u01.j = false;
        if (this.W1 != 0 && z2) {
            c9872u01.j = true;
        }
        ArrayList<UK> arrayList = this.B1;
        UK.b H = H();
        UK.b bVar5 = UK.b.WRAP_CONTENT;
        if (H != bVar5 && j0() != bVar5) {
            z3 = false;
        } else {
            z3 = true;
        }
        U2();
        for (int i8 = 0; i8 < size; i8++) {
            UK uk2 = this.B1.get(i8);
            if (uk2 instanceof TK2) {
                ((TK2) uk2).o2();
            }
        }
        boolean T2 = T2(64);
        boolean z10 = z;
        int i9 = 0;
        boolean z11 = true;
        while (z11) {
            int i10 = i9 + 1;
            try {
                this.I1.W();
                U2();
                o(this.I1);
                int i11 = i6;
                while (i11 < size) {
                    i4 = i6;
                    try {
                        c = c2;
                    } catch (Exception e) {
                        e = e;
                        c = c2;
                    }
                    try {
                        this.B1.get(i11).o(this.I1);
                        i11++;
                        i6 = i4;
                        c2 = c;
                    } catch (Exception e2) {
                        e = e2;
                        z4 = z7;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                        if (z11) {
                        }
                        if (!z3) {
                        }
                        z6 = z5;
                        max = Math.max(this.o0, m0());
                        if (max > m0()) {
                        }
                        max2 = Math.max(this.p0, D());
                        if (max2 > D()) {
                        }
                        if (!z10) {
                        }
                        i5 = 8;
                        if (i10 <= i5) {
                        }
                        i9 = i10;
                        i6 = i4;
                        c2 = c;
                        z7 = true;
                    }
                }
                i4 = i6;
                c = c2;
                z11 = s2(this.I1);
                WeakReference<MK> weakReference = this.b2;
                if (weakReference != null && weakReference.get() != null) {
                    z4 = z7;
                    try {
                        x2(this.b2.get(), this.I1.s(this.R));
                        this.b2 = null;
                        z4 = z4;
                    } catch (Exception e3) {
                        e = e3;
                        z4 = z4;
                        e.printStackTrace();
                        System.out.println("EXCEPTION : " + e);
                        if (z11) {
                        }
                        if (!z3) {
                        }
                        z6 = z5;
                        max = Math.max(this.o0, m0());
                        if (max > m0()) {
                        }
                        max2 = Math.max(this.p0, D());
                        if (max2 > D()) {
                        }
                        if (!z10) {
                        }
                        i5 = 8;
                        if (i10 <= i5) {
                        }
                        i9 = i10;
                        i6 = i4;
                        c2 = c;
                        z7 = true;
                    }
                } else {
                    z4 = z7;
                }
                WeakReference<MK> weakReference2 = this.d2;
                if (weakReference2 != null && weakReference2.get() != null) {
                    w2(this.d2.get(), this.I1.s(this.T));
                    this.d2 = null;
                }
                WeakReference<MK> weakReference3 = this.c2;
                if (weakReference3 != null && weakReference3.get() != null) {
                    x2(this.c2.get(), this.I1.s(this.Q));
                    this.c2 = null;
                }
                WeakReference<MK> weakReference4 = this.e2;
                if (weakReference4 != null && weakReference4.get() != null) {
                    w2(this.e2.get(), this.I1.s(this.S));
                    this.e2 = null;
                }
                if (z11) {
                    this.I1.R();
                }
            } catch (Exception e4) {
                e = e4;
                i4 = i6;
                z4 = z7;
                c = c2;
            }
            if (z11) {
                z5 = a3(this.I1, C4077Qv1.n);
            } else {
                k2(this.I1, T2);
                for (int i12 = i4; i12 < size; i12++) {
                    this.B1.get(i12).k2(this.I1, T2);
                }
                z5 = i4;
            }
            if (!z3 && i10 < 8 && C4077Qv1.n[c]) {
                int i13 = i4;
                int i14 = i13;
                int i15 = i14;
                while (i13 < size) {
                    UK uk3 = this.B1.get(i13);
                    i14 = Math.max(i14, uk3.h0 + uk3.m0());
                    i15 = Math.max(i15, uk3.i0 + uk3.D());
                    i13++;
                    z5 = z5;
                }
                z6 = z5;
                int max5 = Math.max(this.o0, i14);
                int max6 = Math.max(this.p0, i15);
                UK.b bVar6 = UK.b.WRAP_CONTENT;
                if (bVar3 == bVar6 && m0() < max5) {
                    d2(max5);
                    this.b0[i4] = bVar6;
                    z10 = z4;
                    z6 = z10;
                }
                if (bVar2 == bVar6 && D() < max6) {
                    z1(max6);
                    this.b0[z4] = bVar6;
                    z10 = z4;
                    z6 = z10;
                }
            } else {
                z6 = z5;
            }
            max = Math.max(this.o0, m0());
            if (max > m0()) {
                d2(max);
                this.b0[i4] = UK.b.FIXED;
                z10 = z4;
                z6 = z10;
            }
            max2 = Math.max(this.p0, D());
            if (max2 > D()) {
                z1(max2);
                this.b0[z4] = UK.b.FIXED;
                z10 = z4;
                z6 = z10;
            }
            if (!z10) {
                UK.b bVar7 = this.b0[i4];
                UK.b bVar8 = UK.b.WRAP_CONTENT;
                if (bVar7 == bVar8 && i3 > 0 && m0() > i3) {
                    boolean z12 = z4;
                    this.Y1 = z12;
                    this.b0[i4] = UK.b.FIXED;
                    d2(i3);
                    z10 = z12 ? 1 : 0;
                    z6 = z10;
                    r6 = z12;
                } else {
                    r6 = z4;
                }
                if (this.b0[r6] == bVar8 && i > 0 && D() > i) {
                    this.Z1 = r6;
                    this.b0[r6] = UK.b.FIXED;
                    z1(i);
                    i5 = 8;
                    z10 = true;
                    z6 = true;
                    if (i10 <= i5) {
                        z11 = i4;
                    } else {
                        z11 = z6;
                    }
                    i9 = i10;
                    i6 = i4;
                    c2 = c;
                    z7 = true;
                }
            }
            i5 = 8;
            if (i10 <= i5) {
            }
            i9 = i10;
            i6 = i4;
            c2 = c;
            z7 = true;
        }
        int i16 = i6;
        this.B1 = arrayList;
        if (z10) {
            UK.b[] bVarArr2 = this.b0;
            bVarArr2[i16] = bVar3;
            bVarArr2[1] = bVar2;
        }
        W0(this.I1.E());
    }

    public void r2(UK uk, int i) {
        if (i == 0) {
            t2(uk);
        } else if (i == 1) {
            y2(uk);
        }
    }

    public boolean s2(C9872u01 c9872u01) {
        VK vk;
        C9872u01 c9872u012;
        int i;
        boolean T2 = T2(64);
        g(c9872u01, T2);
        int size = this.B1.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            UK uk = this.B1.get(i3);
            uk.H1(0, false);
            uk.H1(1, false);
            if (uk instanceof C4327Tk) {
                z = true;
            }
        }
        if (z) {
            for (int i4 = 0; i4 < size; i4++) {
                UK uk2 = this.B1.get(i4);
                if (uk2 instanceof C4327Tk) {
                    ((C4327Tk) uk2).t2();
                }
            }
        }
        this.f2.clear();
        for (int i5 = 0; i5 < size; i5++) {
            UK uk3 = this.B1.get(i5);
            if (uk3.f()) {
                if (uk3 instanceof UI2) {
                    this.f2.add(uk3);
                } else {
                    uk3.g(c9872u01, T2);
                }
            }
        }
        while (this.f2.size() > 0) {
            int size2 = this.f2.size();
            Iterator<UK> it = this.f2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UI2 ui2 = (UI2) it.next();
                if (ui2.p2(this.f2)) {
                    ui2.g(c9872u01, T2);
                    this.f2.remove(ui2);
                    break;
                }
            }
            if (size2 == this.f2.size()) {
                Iterator<UK> it2 = this.f2.iterator();
                while (it2.hasNext()) {
                    it2.next().g(c9872u01, T2);
                }
                this.f2.clear();
            }
        }
        if (C9872u01.w) {
            HashSet<UK> hashSet = new HashSet<>();
            for (int i6 = 0; i6 < size; i6++) {
                UK uk4 = this.B1.get(i6);
                if (!uk4.f()) {
                    hashSet.add(uk4);
                }
            }
            if (H() == UK.b.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            vk = this;
            c9872u012 = c9872u01;
            vk.e(this, c9872u012, hashSet, i, false);
            Iterator<UK> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                UK next = it3.next();
                C4077Qv1.a(this, c9872u012, next);
                next.g(c9872u012, T2);
            }
        } else {
            vk = this;
            c9872u012 = c9872u01;
            for (int i7 = 0; i7 < size; i7++) {
                UK uk5 = vk.B1.get(i7);
                if (uk5 instanceof VK) {
                    UK.b[] bVarArr = uk5.b0;
                    UK.b bVar = bVarArr[0];
                    UK.b bVar2 = bVarArr[1];
                    UK.b bVar3 = UK.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        uk5.E1(UK.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        uk5.Z1(UK.b.FIXED);
                    }
                    uk5.g(c9872u012, T2);
                    if (bVar == bVar3) {
                        uk5.E1(bVar);
                    }
                    if (bVar2 == bVar3) {
                        uk5.Z1(bVar2);
                    }
                } else {
                    C4077Qv1.a(this, c9872u012, uk5);
                    if (!uk5.f()) {
                        uk5.g(c9872u012, T2);
                    }
                }
            }
        }
        if (vk.N1 > 0) {
            C4381Tz.b(this, c9872u012, null, 0);
        }
        if (vk.O1 > 0) {
            C4381Tz.b(this, c9872u012, null, 1);
        }
        return true;
    }

    public final void t2(UK uk) {
        int i = this.N1 + 1;
        C4478Uz[] c4478UzArr = this.Q1;
        if (i >= c4478UzArr.length) {
            this.Q1 = (C4478Uz[]) Arrays.copyOf(c4478UzArr, c4478UzArr.length * 2);
        }
        this.Q1[this.N1] = new C4478Uz(uk, 0, P2());
        this.N1++;
    }

    public void u2(MK mk) {
        WeakReference<MK> weakReference = this.e2;
        if (weakReference != null && weakReference.get() != null && mk.f() <= this.e2.get().f()) {
            return;
        }
        this.e2 = new WeakReference<>(mk);
    }

    public void v2(MK mk) {
        WeakReference<MK> weakReference = this.c2;
        if (weakReference != null && weakReference.get() != null && mk.f() <= this.c2.get().f()) {
            return;
        }
        this.c2 = new WeakReference<>(mk);
    }

    public final void w2(MK mk, Q92 q92) {
        this.I1.h(q92, this.I1.s(mk), 0, 5);
    }

    public final void x2(MK mk, Q92 q92) {
        this.I1.h(this.I1.s(mk), q92, 0, 5);
    }

    public final void y2(UK uk) {
        int i = this.O1 + 1;
        C4478Uz[] c4478UzArr = this.P1;
        if (i >= c4478UzArr.length) {
            this.P1 = (C4478Uz[]) Arrays.copyOf(c4478UzArr, c4478UzArr.length * 2);
        }
        this.P1[this.O1] = new C4478Uz(uk, 1, P2());
        this.O1++;
    }

    public void z2(MK mk) {
        WeakReference<MK> weakReference = this.d2;
        if (weakReference != null && weakReference.get() != null && mk.f() <= this.d2.get().f()) {
            return;
        }
        this.d2 = new WeakReference<>(mk);
    }

    public VK(int i, int i3, int i4, int i5) {
        super(i, i3, i4, i5);
        this.C1 = new C5163am(this);
        this.D1 = new C8658p20(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new C9872u01();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new C4478Uz[4];
        this.Q1 = new C4478Uz[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 257;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.a2 = 0;
        this.b2 = null;
        this.c2 = null;
        this.d2 = null;
        this.e2 = null;
        this.f2 = new HashSet<>();
        this.g2 = new C5163am.a();
    }

    public VK(int i, int i3) {
        super(i, i3);
        this.C1 = new C5163am(this);
        this.D1 = new C8658p20(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new C9872u01();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new C4478Uz[4];
        this.Q1 = new C4478Uz[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 257;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.a2 = 0;
        this.b2 = null;
        this.c2 = null;
        this.d2 = null;
        this.e2 = null;
        this.f2 = new HashSet<>();
        this.g2 = new C5163am.a();
    }

    public VK(String str, int i, int i3) {
        super(i, i3);
        this.C1 = new C5163am(this);
        this.D1 = new C8658p20(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new C9872u01();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new C4478Uz[4];
        this.Q1 = new C4478Uz[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 257;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.a2 = 0;
        this.b2 = null;
        this.c2 = null;
        this.d2 = null;
        this.e2 = null;
        this.f2 = new HashSet<>();
        this.g2 = new C5163am.a();
        k1(str);
    }
}
