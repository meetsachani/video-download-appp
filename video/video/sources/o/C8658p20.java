package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.AbstractC4253Sp2;
import o.C5163am;
import o.UK;

/* renamed from: o.p20  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8658p20 {
    public static final boolean j = true;
    public static final boolean k = false;
    public VK a;
    public VK d;
    public boolean b = true;
    public boolean c = true;
    public ArrayList<WK2> e = new ArrayList<>();
    public ArrayList<C7543kW1> f = new ArrayList<>();
    public C5163am.b g = null;
    public C5163am.a h = new C5163am.a();
    public ArrayList<C7543kW1> i = new ArrayList<>();

    public C8658p20(VK vk) {
        this.a = vk;
        this.d = vk;
    }

    public final void a(C8901q20 c8901q20, int i, int i2, C8901q20 c8901q202, ArrayList<C7543kW1> arrayList, C7543kW1 c7543kW1) {
        int i3;
        C8901q20 c8901q203;
        ArrayList<C7543kW1> arrayList2;
        WK2 wk2 = c8901q20.d;
        if (wk2.c == null) {
            VK vk = this.a;
            if (wk2 != vk.e && wk2 != vk.f) {
                if (c7543kW1 == null) {
                    c7543kW1 = new C7543kW1(wk2, i2);
                    arrayList.add(c7543kW1);
                }
                C7543kW1 c7543kW12 = c7543kW1;
                wk2.c = c7543kW12;
                c7543kW12.a(wk2);
                for (InterfaceC7910m20 interfaceC7910m20 : wk2.h.k) {
                    if (interfaceC7910m20 instanceof C8901q20) {
                        i3 = i;
                        c8901q203 = c8901q202;
                        arrayList2 = arrayList;
                        a((C8901q20) interfaceC7910m20, i3, 0, c8901q203, arrayList2, c7543kW12);
                    } else {
                        i3 = i;
                        c8901q203 = c8901q202;
                        arrayList2 = arrayList;
                    }
                    i = i3;
                    c8901q202 = c8901q203;
                    arrayList = arrayList2;
                }
                int i4 = i;
                C8901q20 c8901q204 = c8901q202;
                ArrayList<C7543kW1> arrayList3 = arrayList;
                for (InterfaceC7910m20 interfaceC7910m202 : wk2.i.k) {
                    if (interfaceC7910m202 instanceof C8901q20) {
                        a((C8901q20) interfaceC7910m202, i4, 1, c8901q204, arrayList3, c7543kW12);
                    }
                }
                if (i4 == 1 && (wk2 instanceof C6010eF2)) {
                    for (InterfaceC7910m20 interfaceC7910m203 : ((C6010eF2) wk2).k.k) {
                        if (interfaceC7910m203 instanceof C8901q20) {
                            a((C8901q20) interfaceC7910m203, i4, 2, c8901q204, arrayList3, c7543kW12);
                        }
                    }
                }
                for (C8901q20 c8901q205 : wk2.h.l) {
                    if (c8901q205 == c8901q204) {
                        c7543kW12.b = true;
                    }
                    a(c8901q205, i4, 0, c8901q204, arrayList3, c7543kW12);
                }
                for (C8901q20 c8901q206 : wk2.i.l) {
                    if (c8901q206 == c8901q204) {
                        c7543kW12.b = true;
                    }
                    a(c8901q206, i4, 1, c8901q204, arrayList3, c7543kW12);
                }
                if (i4 == 1 && (wk2 instanceof C6010eF2)) {
                    for (C8901q20 c8901q207 : ((C6010eF2) wk2).k.l) {
                        a(c8901q207, i4, 2, c8901q204, arrayList3, c7543kW12);
                    }
                }
            }
        }
    }

    public final boolean b(VK vk) {
        UK.b bVar;
        int i;
        char c;
        UK.b bVar2;
        float f;
        UK.b bVar3;
        UK.b bVar4;
        UK.b bVar5;
        Iterator<UK> it = vk.B1.iterator();
        while (it.hasNext()) {
            UK next = it.next();
            UK.b[] bVarArr = next.b0;
            UK.b bVar6 = bVarArr[0];
            UK.b bVar7 = bVarArr[1];
            if (next.l0() == 8) {
                next.a = true;
            } else {
                if (next.B < 1.0f && bVar6 == UK.b.MATCH_CONSTRAINT) {
                    next.w = 2;
                }
                if (next.E < 1.0f && bVar7 == UK.b.MATCH_CONSTRAINT) {
                    next.x = 2;
                }
                if (next.A() > 0.0f) {
                    UK.b bVar8 = UK.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == UK.b.WRAP_CONTENT || bVar7 == UK.b.FIXED)) {
                        next.w = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == UK.b.WRAP_CONTENT || bVar6 == UK.b.FIXED)) {
                        next.x = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (next.w == 0) {
                            next.w = 3;
                        }
                        if (next.x == 0) {
                            next.x = 3;
                        }
                    }
                }
                UK.b bVar9 = UK.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && next.w == 1 && (next.Q.f == null || next.S.f == null)) {
                    bVar6 = UK.b.WRAP_CONTENT;
                }
                if (bVar7 == bVar9 && next.x == 1 && (next.R.f == null || next.T.f == null)) {
                    bVar7 = UK.b.WRAP_CONTENT;
                }
                C7731lI0 c7731lI0 = next.e;
                c7731lI0.d = bVar6;
                int i2 = next.w;
                c7731lI0.a = i2;
                C6010eF2 c6010eF2 = next.f;
                c6010eF2.d = bVar7;
                int i3 = next.x;
                c6010eF2.a = i3;
                UK.b bVar10 = UK.b.MATCH_PARENT;
                if ((bVar6 == bVar10 || bVar6 == UK.b.FIXED || bVar6 == UK.b.WRAP_CONTENT) && (bVar7 == bVar10 || bVar7 == UK.b.FIXED || bVar7 == UK.b.WRAP_CONTENT)) {
                    UK.b bVar11 = bVar7;
                    UK.b bVar12 = bVar6;
                    int m0 = next.m0();
                    if (bVar12 == bVar10) {
                        m0 = (vk.m0() - next.Q.g) - next.S.g;
                        bVar12 = UK.b.FIXED;
                    }
                    int i4 = m0;
                    int D = next.D();
                    if (bVar11 == bVar10) {
                        D = (vk.D() - next.R.g) - next.T.g;
                        bVar11 = UK.b.FIXED;
                    }
                    r(next, bVar12, i4, bVar11, D);
                    next.e.e.e(next.m0());
                    next.f.e.e(next.D());
                    next.a = true;
                } else {
                    if (bVar6 == bVar9) {
                        bVar2 = bVar9;
                        UK.b bVar13 = UK.b.WRAP_CONTENT;
                        c = 0;
                        if (bVar7 != bVar13 && bVar7 != UK.b.FIXED) {
                            bVar = bVar7;
                            i = 3;
                        } else if (i2 == 3) {
                            if (bVar7 == bVar13) {
                                r(next, bVar13, 0, bVar13, 0);
                            }
                            int D2 = next.D();
                            UK.b bVar14 = UK.b.FIXED;
                            r(next, bVar14, (int) ((D2 * next.f0) + 0.5f), bVar14, D2);
                            next.e.e.e(next.m0());
                            next.f.e.e(next.D());
                            next.a = true;
                        } else if (i2 == 1) {
                            r(next, bVar13, 0, bVar7, 0);
                            next.e.e.m = next.m0();
                        } else {
                            bVar = bVar7;
                            i = 3;
                            if (i2 == 2) {
                                UK.b bVar15 = vk.b0[0];
                                UK.b bVar16 = UK.b.FIXED;
                                if (bVar15 == bVar16 || bVar15 == bVar10) {
                                    r(next, bVar16, (int) ((next.B * vk.m0()) + 0.5f), bVar, next.D());
                                    next.e.e.e(next.m0());
                                    next.f.e.e(next.D());
                                    next.a = true;
                                }
                            } else {
                                MK[] mkArr = next.Y;
                                f = 1.0f;
                                if (mkArr[0].f == null || mkArr[1].f == null) {
                                    r(next, bVar13, 0, bVar, 0);
                                    next.e.e.e(next.m0());
                                    next.f.e.e(next.D());
                                    next.a = true;
                                } else {
                                    if (bVar == bVar2 || !(bVar6 == (bVar4 = UK.b.WRAP_CONTENT) || bVar6 == UK.b.FIXED)) {
                                        bVar3 = bVar6;
                                    } else if (i3 == i) {
                                        if (bVar6 == bVar4) {
                                            r(next, bVar4, 0, bVar4, 0);
                                        }
                                        int m02 = next.m0();
                                        float f2 = next.f0;
                                        if (next.B() == -1) {
                                            f2 = f / f2;
                                        }
                                        UK.b bVar17 = UK.b.FIXED;
                                        r(next, bVar17, m02, bVar17, (int) ((m02 * f2) + 0.5f));
                                        next.e.e.e(next.m0());
                                        next.f.e.e(next.D());
                                        next.a = true;
                                    } else if (i3 == 1) {
                                        r(next, bVar6, 0, bVar4, 0);
                                        next.f.e.m = next.D();
                                    } else {
                                        bVar3 = bVar6;
                                        if (i3 == 2) {
                                            UK.b bVar18 = vk.b0[1];
                                            bVar5 = bVar;
                                            UK.b bVar19 = UK.b.FIXED;
                                            if (bVar18 == bVar19 || bVar18 == bVar10) {
                                                r(next, bVar3, next.m0(), bVar19, (int) ((next.E * vk.D()) + 0.5f));
                                                next.e.e.e(next.m0());
                                                next.f.e.e(next.D());
                                                next.a = true;
                                            } else {
                                                bVar = bVar5;
                                            }
                                        } else {
                                            bVar5 = bVar;
                                            MK[] mkArr2 = next.Y;
                                            if (mkArr2[2].f == null || mkArr2[i].f == null) {
                                                r(next, bVar4, 0, bVar5, 0);
                                                next.e.e.e(next.m0());
                                                next.f.e.e(next.D());
                                                next.a = true;
                                            } else {
                                                bVar = bVar5;
                                            }
                                        }
                                    }
                                    if (bVar3 == bVar2 && bVar == bVar2) {
                                        if (i2 != 1 || i3 == 1) {
                                            UK.b bVar20 = UK.b.WRAP_CONTENT;
                                            r(next, bVar20, 0, bVar20, 0);
                                            next.e.e.m = next.m0();
                                            next.f.e.m = next.D();
                                        } else if (i3 == 2 && i2 == 2) {
                                            UK.b[] bVarArr2 = vk.b0;
                                            UK.b bVar21 = bVarArr2[c];
                                            UK.b bVar22 = UK.b.FIXED;
                                            if (bVar21 == bVar22 && bVarArr2[1] == bVar22) {
                                                r(next, bVar22, (int) ((next.B * vk.m0()) + 0.5f), bVar22, (int) ((next.E * vk.D()) + 0.5f));
                                                next.e.e.e(next.m0());
                                                next.f.e.e(next.D());
                                                next.a = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        bVar = bVar7;
                        i = 3;
                        c = 0;
                        bVar2 = bVar9;
                    }
                    f = 1.0f;
                    if (bVar == bVar2) {
                    }
                    bVar3 = bVar6;
                    if (bVar3 == bVar2) {
                        if (i2 != 1) {
                        }
                        UK.b bVar202 = UK.b.WRAP_CONTENT;
                        r(next, bVar202, 0, bVar202, 0);
                        next.e.e.m = next.m0();
                        next.f.e.m = next.D();
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        d(this.e);
        this.i.clear();
        C7543kW1.k = 0;
        k(this.a.e, 0, this.i);
        k(this.a.f, 1, this.i);
        this.b = false;
    }

    public void d(ArrayList<WK2> arrayList) {
        arrayList.clear();
        this.d.e.f();
        this.d.f.f();
        arrayList.add(this.d.e);
        arrayList.add(this.d.f);
        Iterator<UK> it = this.d.B1.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            UK next = it.next();
            if (next instanceof C9445sF0) {
                arrayList.add(new C9931uF0(next));
            } else {
                if (next.B0()) {
                    if (next.c == null) {
                        next.c = new C4672Wz(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.c);
                } else {
                    arrayList.add(next.e);
                }
                if (next.D0()) {
                    if (next.d == null) {
                        next.d = new C4672Wz(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.d);
                } else {
                    arrayList.add(next.f);
                }
                if (next instanceof C9696tH0) {
                    arrayList.add(new C9453sH0(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WK2> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<WK2> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WK2 next2 = it3.next();
            if (next2.b != this.d) {
                next2.d();
            }
        }
    }

    public final int e(VK vk, int i) {
        int size = this.i.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = Math.max(j2, this.i.get(i2).b(vk, i));
        }
        return (int) j2;
    }

    public void f(UK.b bVar, UK.b bVar2) {
        boolean z;
        boolean z2;
        if (this.b) {
            c();
            Iterator<UK> it = this.a.B1.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                UK next = it.next();
                boolean[] zArr = next.g;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof C4327Tk) {
                    z3 = true;
                }
            }
            if (!z3) {
                Iterator<C7543kW1> it2 = this.i.iterator();
                while (it2.hasNext()) {
                    C7543kW1 next2 = it2.next();
                    UK.b bVar3 = UK.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVar2 == bVar3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    next2.d(z, z2);
                }
            }
        }
    }

    public boolean g(boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.b || this.c) {
            Iterator<UK> it = this.a.B1.iterator();
            while (it.hasNext()) {
                UK next = it.next();
                next.q();
                next.a = false;
                next.e.n();
                next.f.n();
            }
            this.a.q();
            VK vk = this.a;
            vk.a = false;
            vk.e.n();
            this.a.f.n();
            this.c = false;
        }
        if (b(this.d)) {
            return false;
        }
        this.a.g2(0);
        this.a.h2(0);
        UK.b z4 = this.a.z(0);
        UK.b z5 = this.a.z(1);
        if (this.b) {
            c();
        }
        int o0 = this.a.o0();
        int p0 = this.a.p0();
        this.a.e.h.e(o0);
        this.a.f.h.e(p0);
        s();
        UK.b bVar = UK.b.WRAP_CONTENT;
        if (z4 == bVar || z5 == bVar) {
            if (z) {
                Iterator<WK2> it2 = this.e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().p()) {
                        z = false;
                        break;
                    }
                }
            }
            if (z && z4 == UK.b.WRAP_CONTENT) {
                this.a.E1(UK.b.FIXED);
                VK vk2 = this.a;
                vk2.d2(e(vk2, 0));
                VK vk3 = this.a;
                vk3.e.e.e(vk3.m0());
            }
            if (z && z5 == UK.b.WRAP_CONTENT) {
                this.a.Z1(UK.b.FIXED);
                VK vk4 = this.a;
                vk4.z1(e(vk4, 1));
                VK vk5 = this.a;
                vk5.f.e.e(vk5.D());
            }
        }
        VK vk6 = this.a;
        UK.b bVar2 = vk6.b0[0];
        UK.b bVar3 = UK.b.FIXED;
        if (bVar2 != bVar3 && bVar2 != UK.b.MATCH_PARENT) {
            z2 = false;
        } else {
            int m0 = vk6.m0() + o0;
            this.a.e.i.e(m0);
            this.a.e.e.e(m0 - o0);
            s();
            VK vk7 = this.a;
            UK.b bVar4 = vk7.b0[1];
            if (bVar4 == bVar3 || bVar4 == UK.b.MATCH_PARENT) {
                int D = vk7.D() + p0;
                this.a.f.i.e(D);
                this.a.f.e.e(D - p0);
            }
            s();
            z2 = true;
        }
        Iterator<WK2> it3 = this.e.iterator();
        while (it3.hasNext()) {
            WK2 next2 = it3.next();
            if (next2.b != this.a || next2.g) {
                next2.e();
            }
        }
        Iterator<WK2> it4 = this.e.iterator();
        while (true) {
            if (it4.hasNext()) {
                WK2 next3 = it4.next();
                if (z2 || next3.b != this.a) {
                    if (!next3.h.j) {
                        break;
                    }
                    if (!next3.i.j) {
                        if (!(next3 instanceof C9931uF0)) {
                            break;
                        }
                    }
                    if (!next3.e.j && !(next3 instanceof C4672Wz) && !(next3 instanceof C9931uF0)) {
                        break;
                    }
                }
            } else {
                z3 = true;
                break;
            }
        }
        this.a.E1(z4);
        this.a.Z1(z5);
        return z3;
    }

    public boolean h(boolean z) {
        if (this.b) {
            Iterator<UK> it = this.a.B1.iterator();
            while (it.hasNext()) {
                UK next = it.next();
                next.q();
                next.a = false;
                C7731lI0 c7731lI0 = next.e;
                c7731lI0.e.j = false;
                c7731lI0.g = false;
                c7731lI0.n();
                C6010eF2 c6010eF2 = next.f;
                c6010eF2.e.j = false;
                c6010eF2.g = false;
                c6010eF2.n();
            }
            this.a.q();
            VK vk = this.a;
            vk.a = false;
            C7731lI0 c7731lI02 = vk.e;
            c7731lI02.e.j = false;
            c7731lI02.g = false;
            c7731lI02.n();
            C6010eF2 c6010eF22 = this.a.f;
            c6010eF22.e.j = false;
            c6010eF22.g = false;
            c6010eF22.n();
            c();
        }
        if (b(this.d)) {
            return false;
        }
        this.a.g2(0);
        this.a.h2(0);
        this.a.e.h.e(0);
        this.a.f.h.e(0);
        return true;
    }

    public boolean i(boolean z, int i) {
        boolean z2;
        UK.b bVar;
        boolean z3 = false;
        UK.b z4 = this.a.z(0);
        UK.b z5 = this.a.z(1);
        int o0 = this.a.o0();
        int p0 = this.a.p0();
        if (z && (z4 == (bVar = UK.b.WRAP_CONTENT) || z5 == bVar)) {
            Iterator<WK2> it = this.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WK2 next = it.next();
                if (next.f == i && !next.p()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && z4 == UK.b.WRAP_CONTENT) {
                    this.a.E1(UK.b.FIXED);
                    VK vk = this.a;
                    vk.d2(e(vk, 0));
                    VK vk2 = this.a;
                    vk2.e.e.e(vk2.m0());
                }
            } else if (z && z5 == UK.b.WRAP_CONTENT) {
                this.a.Z1(UK.b.FIXED);
                VK vk3 = this.a;
                vk3.z1(e(vk3, 1));
                VK vk4 = this.a;
                vk4.f.e.e(vk4.D());
            }
        }
        if (i == 0) {
            VK vk5 = this.a;
            UK.b bVar2 = vk5.b0[0];
            if (bVar2 == UK.b.FIXED || bVar2 == UK.b.MATCH_PARENT) {
                int m0 = vk5.m0() + o0;
                this.a.e.i.e(m0);
                this.a.e.e.e(m0 - o0);
                z2 = true;
            }
            z2 = false;
        } else {
            VK vk6 = this.a;
            UK.b bVar3 = vk6.b0[1];
            if (bVar3 == UK.b.FIXED || bVar3 == UK.b.MATCH_PARENT) {
                int D = vk6.D() + p0;
                this.a.f.i.e(D);
                this.a.f.e.e(D - p0);
                z2 = true;
            }
            z2 = false;
        }
        s();
        Iterator<WK2> it2 = this.e.iterator();
        while (it2.hasNext()) {
            WK2 next2 = it2.next();
            if (next2.f == i && (next2.b != this.a || next2.g)) {
                next2.e();
            }
        }
        Iterator<WK2> it3 = this.e.iterator();
        while (true) {
            if (it3.hasNext()) {
                WK2 next3 = it3.next();
                if (next3.f == i && (z2 || next3.b != this.a)) {
                    if (!next3.h.j) {
                        break;
                    } else if (!next3.i.j) {
                        break;
                    } else if (!(next3 instanceof C4672Wz) && !next3.e.j) {
                        break;
                    }
                }
            } else {
                z3 = true;
                break;
            }
        }
        this.a.E1(z4);
        this.a.Z1(z5);
        return z3;
    }

    public final void j() {
        Iterator<WK2> it = this.e.iterator();
        String str = "digraph {\n";
        while (it.hasNext()) {
            str = m(it.next(), str);
        }
        String str2 = str + "\n}\n";
        System.out.println("content:<<\n" + str2 + "\n>>");
    }

    public final void k(WK2 wk2, int i, ArrayList<C7543kW1> arrayList) {
        for (InterfaceC7910m20 interfaceC7910m20 : wk2.h.k) {
            if (interfaceC7910m20 instanceof C8901q20) {
                a((C8901q20) interfaceC7910m20, i, 0, wk2.i, arrayList, null);
            } else if (interfaceC7910m20 instanceof WK2) {
                a(((WK2) interfaceC7910m20).h, i, 0, wk2.i, arrayList, null);
            }
        }
        for (InterfaceC7910m20 interfaceC7910m202 : wk2.i.k) {
            if (interfaceC7910m202 instanceof C8901q20) {
                a((C8901q20) interfaceC7910m202, i, 1, wk2.h, arrayList, null);
            } else if (interfaceC7910m202 instanceof WK2) {
                a(((WK2) interfaceC7910m202).i, i, 1, wk2.h, arrayList, null);
            }
        }
        int i2 = i;
        if (i2 == 1) {
            for (InterfaceC7910m20 interfaceC7910m203 : ((C6010eF2) wk2).k.k) {
                if (interfaceC7910m203 instanceof C8901q20) {
                    a((C8901q20) interfaceC7910m203, i2, 2, null, arrayList, null);
                }
                i2 = i;
            }
        }
    }

    public final String l(C4672Wz c4672Wz, String str) {
        int i = c4672Wz.f;
        StringBuilder sb = new StringBuilder("subgraph ");
        sb.append("cluster_");
        sb.append(c4672Wz.b.y());
        if (i == 0) {
            sb.append("_h");
        } else {
            sb.append("_v");
        }
        sb.append(" {\n");
        Iterator<WK2> it = c4672Wz.k.iterator();
        String str2 = "";
        while (it.hasNext()) {
            WK2 next = it.next();
            sb.append(next.b.y());
            if (i == 0) {
                sb.append("_HORIZONTAL");
            } else {
                sb.append("_VERTICAL");
            }
            sb.append(";\n");
            str2 = m(next, str2);
        }
        sb.append("}\n");
        return str + str2 + ((Object) sb);
    }

    public final String m(WK2 wk2, String str) {
        boolean z;
        C8901q20 c8901q20 = wk2.h;
        C8901q20 c8901q202 = wk2.i;
        StringBuilder sb = new StringBuilder(str);
        if (!(wk2 instanceof C9453sH0) && c8901q20.k.isEmpty() && c8901q202.k.isEmpty() && c8901q20.l.isEmpty() && c8901q202.l.isEmpty()) {
            return str;
        }
        sb.append(t(wk2));
        boolean q = q(c8901q20, c8901q202);
        String n = n(c8901q202, q, n(c8901q20, q, str));
        boolean z2 = wk2 instanceof C6010eF2;
        if (z2) {
            n = n(((C6010eF2) wk2).k, q, n);
        }
        if (!(wk2 instanceof C7731lI0) && (!((z = wk2 instanceof C4672Wz)) || ((C4672Wz) wk2).f != 0)) {
            if (z2 || (z && ((C4672Wz) wk2).f == 1)) {
                UK.b j0 = wk2.b.j0();
                if (j0 != UK.b.FIXED && j0 != UK.b.WRAP_CONTENT) {
                    if (j0 == UK.b.MATCH_CONSTRAINT && wk2.b.A() > 0.0f) {
                        sb.append("\n");
                        sb.append(wk2.b.y());
                        sb.append("_VERTICAL -> ");
                        sb.append(wk2.b.y());
                        sb.append("_HORIZONTAL;\n");
                    }
                } else if (!c8901q20.l.isEmpty() && c8901q202.l.isEmpty()) {
                    sb.append("\n");
                    sb.append(c8901q202.d());
                    sb.append(B8.d);
                    sb.append(c8901q20.d());
                    sb.append("\n");
                } else if (c8901q20.l.isEmpty() && !c8901q202.l.isEmpty()) {
                    sb.append("\n");
                    sb.append(c8901q20.d());
                    sb.append(B8.d);
                    sb.append(c8901q202.d());
                    sb.append("\n");
                }
            }
        } else {
            UK.b H = wk2.b.H();
            if (H != UK.b.FIXED && H != UK.b.WRAP_CONTENT) {
                if (H == UK.b.MATCH_CONSTRAINT && wk2.b.A() > 0.0f) {
                    sb.append("\n");
                    sb.append(wk2.b.y());
                    sb.append("_HORIZONTAL -> ");
                    sb.append(wk2.b.y());
                    sb.append("_VERTICAL;\n");
                }
            } else if (!c8901q20.l.isEmpty() && c8901q202.l.isEmpty()) {
                sb.append("\n");
                sb.append(c8901q202.d());
                sb.append(B8.d);
                sb.append(c8901q20.d());
                sb.append("\n");
            } else if (c8901q20.l.isEmpty() && !c8901q202.l.isEmpty()) {
                sb.append("\n");
                sb.append(c8901q20.d());
                sb.append(B8.d);
                sb.append(c8901q202.d());
                sb.append("\n");
            }
        }
        if (wk2 instanceof C4672Wz) {
            return l((C4672Wz) wk2, n);
        }
        return sb.toString();
    }

    public final String n(C8901q20 c8901q20, boolean z, String str) {
        StringBuilder sb = new StringBuilder(str);
        Iterator<C8901q20> it = c8901q20.l.iterator();
        while (it.hasNext()) {
            String str2 = ("\n" + c8901q20.d()) + B8.d + it.next().d();
            if (c8901q20.f > 0 || z || (c8901q20.d instanceof C9453sH0)) {
                String str3 = str2 + C6566gU0.f;
                if (c8901q20.f > 0) {
                    str3 = str3 + "label=\"" + c8901q20.f + AbstractC4253Sp2.b.x1;
                    if (z) {
                        str3 = str3 + ",";
                    }
                }
                if (z) {
                    str3 = str3 + " style=dashed ";
                }
                if (c8901q20.d instanceof C9453sH0) {
                    str3 = str3 + " style=bold,color=gray ";
                }
                str2 = str3 + C6566gU0.g;
            }
            sb.append(str2 + "\n");
        }
        return sb.toString();
    }

    public void o() {
        this.b = true;
    }

    public void p() {
        this.c = true;
    }

    public final boolean q(C8901q20 c8901q20, C8901q20 c8901q202) {
        int i = 0;
        for (C8901q20 c8901q203 : c8901q20.l) {
            if (c8901q203 != c8901q202) {
                i++;
            }
        }
        int i2 = 0;
        for (C8901q20 c8901q204 : c8901q202.l) {
            if (c8901q204 != c8901q20) {
                i2++;
            }
        }
        if (i <= 0 || i2 <= 0) {
            return false;
        }
        return true;
    }

    public final void r(UK uk, UK.b bVar, int i, UK.b bVar2, int i2) {
        C5163am.a aVar = this.h;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.g.b(uk, aVar);
        uk.d2(this.h.e);
        uk.z1(this.h.f);
        uk.y1(this.h.h);
        uk.h1(this.h.g);
    }

    public void s() {
        boolean z;
        C10126v30 c10126v30;
        Iterator<UK> it = this.a.B1.iterator();
        while (it.hasNext()) {
            UK next = it.next();
            if (!next.a) {
                UK.b[] bVarArr = next.b0;
                boolean z2 = false;
                UK.b bVar = bVarArr[0];
                UK.b bVar2 = bVarArr[1];
                int i = next.w;
                int i2 = next.x;
                UK.b bVar3 = UK.b.WRAP_CONTENT;
                if (bVar != bVar3 && (bVar != UK.b.MATCH_CONSTRAINT || i != 1)) {
                    z = false;
                } else {
                    z = true;
                }
                if (bVar2 == bVar3 || (bVar2 == UK.b.MATCH_CONSTRAINT && i2 == 1)) {
                    z2 = true;
                }
                C10126v30 c10126v302 = next.e.e;
                boolean z3 = c10126v302.j;
                C10126v30 c10126v303 = next.f.e;
                boolean z4 = c10126v303.j;
                if (z3 && z4) {
                    UK.b bVar4 = UK.b.FIXED;
                    r(next, bVar4, c10126v302.g, bVar4, c10126v303.g);
                    next.a = true;
                } else if (z3 && z2) {
                    r(next, UK.b.FIXED, c10126v302.g, bVar3, c10126v303.g);
                    if (bVar2 == UK.b.MATCH_CONSTRAINT) {
                        next.f.e.m = next.D();
                    } else {
                        next.f.e.e(next.D());
                        next.a = true;
                    }
                } else if (z4 && z) {
                    r(next, bVar3, c10126v302.g, UK.b.FIXED, c10126v303.g);
                    if (bVar == UK.b.MATCH_CONSTRAINT) {
                        next.e.e.m = next.m0();
                    } else {
                        next.e.e.e(next.m0());
                        next.a = true;
                    }
                }
                if (next.a && (c10126v30 = next.f.l) != null) {
                    c10126v30.e(next.t());
                }
            }
        }
    }

    public final String t(WK2 wk2) {
        UK.b j0;
        boolean z = wk2 instanceof C6010eF2;
        String y = wk2.b.y();
        StringBuilder sb = new StringBuilder(y);
        if (!z) {
            j0 = wk2.b.H();
        } else {
            j0 = wk2.b.j0();
        }
        C7543kW1 c7543kW1 = wk2.c;
        if (!z) {
            sb.append("_HORIZONTAL");
        } else {
            sb.append("_VERTICAL");
        }
        sb.append(" [shape=none, label=<");
        sb.append("<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">");
        sb.append("  <TR>");
        if (!z) {
            sb.append("    <TD ");
            if (wk2.h.j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        } else {
            sb.append("    <TD ");
            if (wk2.h.j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
        }
        sb.append("    <TD BORDER=\"1\" ");
        boolean z2 = wk2.e.j;
        if (z2 && !wk2.b.a) {
            sb.append(" BGCOLOR=\"green\" ");
        } else if (z2) {
            sb.append(" BGCOLOR=\"lightgray\" ");
        } else if (wk2.b.a) {
            sb.append(" BGCOLOR=\"yellow\" ");
        }
        if (j0 == UK.b.MATCH_CONSTRAINT) {
            sb.append("style=\"dashed\"");
        }
        sb.append(">");
        sb.append(y);
        if (c7543kW1 != null) {
            sb.append(" [");
            sb.append(c7543kW1.f + 1);
            sb.append(RemoteSettings.i);
            sb.append(C7543kW1.k);
            sb.append(C6566gU0.g);
        }
        sb.append(" </TD>");
        if (!z) {
            sb.append("    <TD ");
            if (wk2.i.j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        } else {
            sb.append("    <TD ");
            if (((C6010eF2) wk2).k.j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>");
            sb.append("    <TD ");
            if (wk2.i.j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        }
        sb.append("  </TR></TABLE>");
        sb.append(">];\n");
        return sb.toString();
    }

    public void u(C5163am.b bVar) {
        this.g = bVar;
    }
}
