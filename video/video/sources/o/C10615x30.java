package o;

import java.util.ArrayList;
import java.util.Iterator;
import o.C5163am;
import o.MK;
import o.TD0;
import o.UK;

/* renamed from: o.x30  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10615x30 {
    public static final boolean a = false;
    public static final boolean b = false;
    public static final boolean d = true;
    public static C5163am.a c = new C5163am.a();
    public static int e = 0;
    public static int f = 0;

    public static boolean a(int i, UK uk) {
        VK vk;
        boolean z;
        boolean z2;
        UK.b bVar;
        UK.b bVar2;
        UK.b H = uk.H();
        UK.b j0 = uk.j0();
        if (uk.U() != null) {
            vk = (VK) uk.U();
        } else {
            vk = null;
        }
        if (vk != null) {
            vk.H();
            UK.b bVar3 = UK.b.FIXED;
        }
        if (vk != null) {
            vk.j0();
            UK.b bVar4 = UK.b.FIXED;
        }
        UK.b bVar5 = UK.b.FIXED;
        if (H != bVar5 && !uk.G0() && H != UK.b.WRAP_CONTENT && ((H != (bVar2 = UK.b.MATCH_CONSTRAINT) || uk.w != 0 || uk.f0 != 0.0f || !uk.r0(0)) && (H != bVar2 || uk.w != 1 || !uk.u0(0, uk.m0())))) {
            z = false;
        } else {
            z = true;
        }
        if (j0 != bVar5 && !uk.H0() && j0 != UK.b.WRAP_CONTENT && ((j0 != (bVar = UK.b.MATCH_CONSTRAINT) || uk.x != 0 || uk.f0 != 0.0f || !uk.r0(1)) && (j0 != bVar || uk.x != 1 || !uk.u0(1, uk.D())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (uk.f0 > 0.0f && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static void b(int i, UK uk, C5163am.b bVar, boolean z) {
        boolean z2;
        MK mk;
        MK mk2;
        boolean z3;
        boolean z4;
        MK mk3;
        MK mk4;
        if (uk.z0()) {
            return;
        }
        boolean z5 = true;
        e++;
        if (!(uk instanceof VK) && uk.F0()) {
            int i2 = i + 1;
            if (a(i2, uk)) {
                VK.S2(i2, uk, bVar, new C5163am.a(), C5163am.a.k);
            }
        }
        MK r = uk.r(MK.a.LEFT);
        MK r2 = uk.r(MK.a.RIGHT);
        int f2 = r.f();
        int f3 = r2.f();
        if (r.e() != null && r.o()) {
            Iterator<MK> it = r.e().iterator();
            while (it.hasNext()) {
                MK next = it.next();
                UK uk2 = next.d;
                int i3 = i + 1;
                boolean a2 = a(i3, uk2);
                if (uk2.F0() && a2) {
                    z3 = z5;
                    VK.S2(i3, uk2, bVar, new C5163am.a(), C5163am.a.k);
                } else {
                    z3 = z5;
                }
                if ((next == uk2.Q && (mk4 = uk2.S.f) != null && mk4.o()) || (next == uk2.S && (mk3 = uk2.Q.f) != null && mk3.o())) {
                    z4 = z3;
                } else {
                    z4 = false;
                }
                UK.b H = uk2.H();
                UK.b bVar2 = UK.b.MATCH_CONSTRAINT;
                if (H == bVar2 && !a2) {
                    if (uk2.H() == bVar2 && uk2.A >= 0 && uk2.z >= 0 && ((uk2.l0() == 8 || (uk2.w == 0 && uk2.A() == 0.0f)) && !uk2.B0() && !uk2.E0() && z4 && !uk2.B0())) {
                        g(i3, uk, bVar, uk2, z);
                    }
                } else if (!uk2.F0()) {
                    MK mk5 = uk2.Q;
                    if (next == mk5 && uk2.S.f == null) {
                        int g = mk5.g() + f2;
                        uk2.r1(g, uk2.m0() + g);
                        b(i3, uk2, bVar, z);
                    } else {
                        MK mk6 = uk2.S;
                        if (next == mk6 && mk5.f == null) {
                            int g2 = f2 - mk6.g();
                            uk2.r1(g2 - uk2.m0(), g2);
                            b(i3, uk2, bVar, z);
                        } else if (z4 && !uk2.B0()) {
                            f(i3, bVar, uk2, z);
                        }
                    }
                }
                z5 = z3;
            }
        }
        boolean z6 = z5;
        if (uk instanceof C9445sF0) {
            return;
        }
        if (r2.e() != null && r2.o()) {
            Iterator<MK> it2 = r2.e().iterator();
            while (it2.hasNext()) {
                MK next2 = it2.next();
                UK uk3 = next2.d;
                int i4 = i + 1;
                boolean a3 = a(i4, uk3);
                if (uk3.F0() && a3) {
                    VK.S2(i4, uk3, bVar, new C5163am.a(), C5163am.a.k);
                }
                if ((next2 == uk3.Q && (mk2 = uk3.S.f) != null && mk2.o()) || (next2 == uk3.S && (mk = uk3.Q.f) != null && mk.o())) {
                    z2 = z6;
                } else {
                    z2 = false;
                }
                UK.b H2 = uk3.H();
                UK.b bVar3 = UK.b.MATCH_CONSTRAINT;
                if (H2 == bVar3 && !a3) {
                    if (uk3.H() == bVar3 && uk3.A >= 0 && uk3.z >= 0 && (uk3.l0() == 8 || (uk3.w == 0 && uk3.A() == 0.0f))) {
                        if (!uk3.B0() && !uk3.E0() && z2 && !uk3.B0()) {
                            g(i4, uk, bVar, uk3, z);
                        }
                    }
                } else if (!uk3.F0()) {
                    MK mk7 = uk3.Q;
                    if (next2 == mk7 && uk3.S.f == null) {
                        int g3 = mk7.g() + f3;
                        uk3.r1(g3, uk3.m0() + g3);
                        b(i4, uk3, bVar, z);
                    } else {
                        MK mk8 = uk3.S;
                        if (next2 == mk8 && mk7.f == null) {
                            int g4 = f3 - mk8.g();
                            uk3.r1(g4 - uk3.m0(), g4);
                            b(i4, uk3, bVar, z);
                        } else if (z2 && !uk3.B0()) {
                            f(i4, bVar, uk3, z);
                        }
                    }
                }
            }
        }
        uk.N0();
    }

    public static String c(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(TD0.a.Y0);
        }
        sb.append("+-(" + i + ") ");
        return sb.toString();
    }

    public static void d(int i, C4327Tk c4327Tk, C5163am.b bVar, int i2, boolean z) {
        if (c4327Tk.n2()) {
            if (i2 == 0) {
                b(i + 1, c4327Tk, bVar, z);
            } else {
                k(i + 1, c4327Tk, bVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d9, code lost:
        if (r6.d == r2) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0154  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean e(VK vk, C9872u01 c9872u01, int i, int i2, C4478Uz c4478Uz, boolean z, boolean z2, boolean z3) {
        int i3;
        int D;
        UK uk;
        float g0;
        UK uk2;
        int D2;
        if (z3) {
            return false;
        }
        if (i == 0) {
            if (!vk.G0()) {
                return false;
            }
        } else if (!vk.H0()) {
            return false;
        }
        boolean P2 = vk.P2();
        UK c2 = c4478Uz.c();
        UK g = c4478Uz.g();
        UK e2 = c4478Uz.e();
        UK i4 = c4478Uz.i();
        UK f2 = c4478Uz.f();
        MK mk = c2.Y[i2];
        int i5 = i2 + 1;
        MK mk2 = g.Y[i5];
        MK mk3 = mk.f;
        if (mk3 == null || mk2.f == null) {
            return false;
        }
        if (!mk3.o() || !mk2.f.o()) {
            return false;
        }
        if (e2 == null || i4 == null) {
            return false;
        }
        int f3 = mk.f.f() + e2.Y[i2].g();
        int f4 = mk2.f.f() - i4.Y[i5].g();
        int i6 = f4 - f3;
        if (i6 <= 0) {
            return false;
        }
        C5163am.a aVar = new C5163am.a();
        boolean z4 = false;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z5 = false;
        UK uk3 = c2;
        while (true) {
            UK uk4 = null;
            if (!z4) {
                if (!a(1, uk3)) {
                    return false;
                }
                UK uk5 = c2;
                if (uk3.b0[i] == UK.b.MATCH_CONSTRAINT) {
                    return false;
                }
                if (uk3.F0()) {
                    uk2 = f2;
                    VK.S2(1, uk3, vk.H2(), aVar, C5163am.a.k);
                } else {
                    uk2 = f2;
                }
                int g2 = i9 + uk3.Y[i2].g();
                if (i == 0) {
                    D2 = uk3.m0();
                } else {
                    D2 = uk3.D();
                }
                i9 = g2 + D2 + uk3.Y[i5].g();
                i8++;
                if (uk3.l0() != 8) {
                    i7++;
                }
                MK mk4 = uk3.Y[i5].f;
                if (mk4 != null) {
                    UK uk6 = mk4.d;
                    MK mk5 = uk6.Y[i2].f;
                    if (mk5 != null && mk5.d == uk3) {
                        uk4 = uk6;
                    }
                }
                if (uk4 != null) {
                    uk3 = uk4;
                } else {
                    z4 = true;
                }
                c2 = uk5;
                f2 = uk2;
            } else {
                UK uk7 = c2;
                UK uk8 = f2;
                if (i7 == 0 || i7 != i8 || i6 < i9) {
                    return false;
                }
                int i10 = i6 - i9;
                if (z) {
                    i10 /= i7 + 1;
                } else if (z2 && i7 > 2) {
                    i3 = 1;
                    i10 = (i10 / i7) - 1;
                    if (i7 != i3) {
                        if (i == 0) {
                            g0 = uk8.E();
                        } else {
                            g0 = uk8.g0();
                        }
                        int i11 = (int) (f3 + 0.5f + (i10 * g0));
                        if (i == 0) {
                            e2.r1(i11, e2.m0() + i11);
                        } else {
                            e2.u1(i11, e2.D() + i11);
                        }
                        b(1, e2, vk.H2(), P2);
                        return true;
                    } else if (z) {
                        int i12 = f3 + i10;
                        boolean z6 = false;
                        UK uk9 = uk7;
                        ?? r6 = i3;
                        while (!z6) {
                            if (uk9.l0() == 8) {
                                if (i == 0) {
                                    uk9.r1(i12, i12);
                                    b(r6, uk9, vk.H2(), P2);
                                } else {
                                    uk9.u1(i12, i12);
                                    k(r6, uk9, vk.H2());
                                }
                            } else {
                                int g3 = i12 + uk9.Y[i2].g();
                                if (i == 0) {
                                    uk9.r1(g3, uk9.m0() + g3);
                                    b(1, uk9, vk.H2(), P2);
                                    D = uk9.m0();
                                } else {
                                    uk9.u1(g3, uk9.D() + g3);
                                    k(1, uk9, vk.H2());
                                    D = uk9.D();
                                }
                                i12 = g3 + D + uk9.Y[i5].g() + i10;
                            }
                            uk9.g(c9872u01, z5);
                            MK mk6 = uk9.Y[i5].f;
                            if (mk6 != null) {
                                uk = mk6.d;
                                MK mk7 = uk.Y[i2].f;
                                if (mk7 != null) {
                                }
                            }
                            uk = null;
                            if (uk != null) {
                                uk9 = uk;
                            } else {
                                z6 = true;
                            }
                            r6 = 1;
                            z5 = false;
                        }
                        return r6;
                    } else if (z2) {
                        if (i7 == 2) {
                            if (i == 0) {
                                e2.r1(f3, e2.m0() + f3);
                                i4.r1(f4 - i4.m0(), f4);
                                b(1, e2, vk.H2(), P2);
                                b(1, i4, vk.H2(), P2);
                                return true;
                            }
                            e2.u1(f3, e2.D() + f3);
                            i4.u1(f4 - i4.D(), f4);
                            k(1, e2, vk.H2());
                            k(1, i4, vk.H2());
                            return true;
                        }
                        return false;
                    } else {
                        return true;
                    }
                }
                i3 = 1;
                if (i7 != i3) {
                }
            }
        }
    }

    public static void f(int i, C5163am.b bVar, UK uk, boolean z) {
        float f2;
        float E = uk.E();
        int f3 = uk.Q.f.f();
        int f4 = uk.S.f.f();
        int g = uk.Q.g() + f3;
        int g2 = f4 - uk.S.g();
        if (f3 == f4) {
            E = 0.5f;
        } else {
            f3 = g;
            f4 = g2;
        }
        int m0 = uk.m0();
        int i2 = (f4 - f3) - m0;
        if (f3 > f4) {
            i2 = (f3 - f4) - m0;
        }
        if (i2 > 0) {
            f2 = (E * i2) + 0.5f;
        } else {
            f2 = E * i2;
        }
        int i3 = ((int) f2) + f3;
        int i4 = i3 + m0;
        if (f3 > f4) {
            i4 = i3 - m0;
        }
        uk.r1(i3, i4);
        b(i + 1, uk, bVar, z);
    }

    public static void g(int i, UK uk, C5163am.b bVar, UK uk2, boolean z) {
        int m0;
        float E = uk2.E();
        int f2 = uk2.Q.f.f() + uk2.Q.g();
        int f3 = uk2.S.f.f() - uk2.S.g();
        if (f3 >= f2) {
            int m02 = uk2.m0();
            if (uk2.l0() != 8) {
                int i2 = uk2.w;
                if (i2 == 2) {
                    if (uk instanceof VK) {
                        m0 = uk.m0();
                    } else {
                        m0 = uk.U().m0();
                    }
                    m02 = (int) (uk2.E() * 0.5f * m0);
                } else if (i2 == 0) {
                    m02 = f3 - f2;
                }
                m02 = Math.max(uk2.z, m02);
                int i3 = uk2.A;
                if (i3 > 0) {
                    m02 = Math.min(i3, m02);
                }
            }
            int i4 = f2 + ((int) ((E * ((f3 - f2) - m02)) + 0.5f));
            uk2.r1(i4, m02 + i4);
            b(i + 1, uk2, bVar, z);
        }
    }

    public static void h(int i, C5163am.b bVar, UK uk) {
        float f2;
        float g0 = uk.g0();
        int f3 = uk.R.f.f();
        int f4 = uk.T.f.f();
        int g = uk.R.g() + f3;
        int g2 = f4 - uk.T.g();
        if (f3 == f4) {
            g0 = 0.5f;
        } else {
            f3 = g;
            f4 = g2;
        }
        int D = uk.D();
        int i2 = (f4 - f3) - D;
        if (f3 > f4) {
            i2 = (f3 - f4) - D;
        }
        if (i2 > 0) {
            f2 = (g0 * i2) + 0.5f;
        } else {
            f2 = g0 * i2;
        }
        int i3 = (int) f2;
        int i4 = f3 + i3;
        int i5 = i4 + D;
        if (f3 > f4) {
            i4 = f3 - i3;
            i5 = i4 - D;
        }
        uk.u1(i4, i5);
        k(i + 1, uk, bVar);
    }

    public static void i(int i, UK uk, C5163am.b bVar, UK uk2) {
        int D;
        float g0 = uk2.g0();
        int f2 = uk2.R.f.f() + uk2.R.g();
        int f3 = uk2.T.f.f() - uk2.T.g();
        if (f3 >= f2) {
            int D2 = uk2.D();
            if (uk2.l0() != 8) {
                int i2 = uk2.x;
                if (i2 == 2) {
                    if (uk instanceof VK) {
                        D = uk.D();
                    } else {
                        D = uk.U().D();
                    }
                    D2 = (int) (g0 * 0.5f * D);
                } else if (i2 == 0) {
                    D2 = f3 - f2;
                }
                D2 = Math.max(uk2.C, D2);
                int i3 = uk2.D;
                if (i3 > 0) {
                    D2 = Math.min(i3, D2);
                }
            }
            int i4 = f2 + ((int) ((g0 * ((f3 - f2) - D2)) + 0.5f));
            uk2.u1(i4, D2 + i4);
            k(i + 1, uk2, bVar);
        }
    }

    public static void j(VK vk, C5163am.b bVar) {
        UK.b H = vk.H();
        UK.b j0 = vk.j0();
        e = 0;
        f = 0;
        vk.V0();
        ArrayList<UK> m2 = vk.m2();
        int size = m2.size();
        for (int i = 0; i < size; i++) {
            m2.get(i).V0();
        }
        boolean P2 = vk.P2();
        if (H == UK.b.FIXED) {
            vk.r1(0, vk.m0());
        } else {
            vk.s1(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            UK uk = m2.get(i2);
            if (uk instanceof C9445sF0) {
                C9445sF0 c9445sF0 = (C9445sF0) uk;
                if (c9445sF0.o2() == 1) {
                    if (c9445sF0.p2() != -1) {
                        c9445sF0.x2(c9445sF0.p2());
                    } else if (c9445sF0.r2() != -1 && vk.G0()) {
                        c9445sF0.x2(vk.m0() - c9445sF0.r2());
                    } else if (vk.G0()) {
                        c9445sF0.x2((int) ((c9445sF0.s2() * vk.m0()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((uk instanceof C4327Tk) && ((C4327Tk) uk).s2() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                UK uk2 = m2.get(i3);
                if (uk2 instanceof C9445sF0) {
                    C9445sF0 c9445sF02 = (C9445sF0) uk2;
                    if (c9445sF02.o2() == 1) {
                        b(0, c9445sF02, bVar, P2);
                    }
                }
            }
        }
        b(0, vk, bVar, P2);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                UK uk3 = m2.get(i4);
                if (uk3 instanceof C4327Tk) {
                    C4327Tk c4327Tk = (C4327Tk) uk3;
                    if (c4327Tk.s2() == 0) {
                        d(0, c4327Tk, bVar, 0, P2);
                    }
                }
            }
        }
        if (j0 == UK.b.FIXED) {
            vk.u1(0, vk.D());
        } else {
            vk.t1(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            UK uk4 = m2.get(i5);
            if (uk4 instanceof C9445sF0) {
                C9445sF0 c9445sF03 = (C9445sF0) uk4;
                if (c9445sF03.o2() == 0) {
                    if (c9445sF03.p2() != -1) {
                        c9445sF03.x2(c9445sF03.p2());
                    } else if (c9445sF03.r2() != -1 && vk.H0()) {
                        c9445sF03.x2(vk.D() - c9445sF03.r2());
                    } else if (vk.H0()) {
                        c9445sF03.x2((int) ((c9445sF03.s2() * vk.D()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((uk4 instanceof C4327Tk) && ((C4327Tk) uk4).s2() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                UK uk5 = m2.get(i6);
                if (uk5 instanceof C9445sF0) {
                    C9445sF0 c9445sF04 = (C9445sF0) uk5;
                    if (c9445sF04.o2() == 0) {
                        k(1, c9445sF04, bVar);
                    }
                }
            }
        }
        k(0, vk, bVar);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                UK uk6 = m2.get(i7);
                if (uk6 instanceof C4327Tk) {
                    C4327Tk c4327Tk2 = (C4327Tk) uk6;
                    if (c4327Tk2.s2() == 1) {
                        d(0, c4327Tk2, bVar, 1, P2);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            UK uk7 = m2.get(i8);
            if (uk7.F0() && a(0, uk7)) {
                VK.S2(0, uk7, bVar, c, C5163am.a.k);
                if (uk7 instanceof C9445sF0) {
                    if (((C9445sF0) uk7).o2() == 0) {
                        k(0, uk7, bVar);
                    } else {
                        b(0, uk7, bVar, P2);
                    }
                } else {
                    b(0, uk7, bVar, P2);
                    k(0, uk7, bVar);
                }
            }
        }
    }

    public static void k(int i, UK uk, C5163am.b bVar) {
        MK mk;
        MK mk2;
        MK mk3;
        MK mk4;
        if (uk.L0()) {
            return;
        }
        boolean z = true;
        f++;
        if (!(uk instanceof VK) && uk.F0()) {
            int i2 = i + 1;
            if (a(i2, uk)) {
                VK.S2(i2, uk, bVar, new C5163am.a(), C5163am.a.k);
            }
        }
        MK r = uk.r(MK.a.TOP);
        MK r2 = uk.r(MK.a.BOTTOM);
        int f2 = r.f();
        int f3 = r2.f();
        if (r.e() != null && r.o()) {
            Iterator<MK> it = r.e().iterator();
            while (it.hasNext()) {
                MK next = it.next();
                UK uk2 = next.d;
                int i3 = i + 1;
                boolean a2 = a(i3, uk2);
                if (uk2.F0() && a2) {
                    VK.S2(i3, uk2, bVar, new C5163am.a(), C5163am.a.k);
                }
                boolean z2 = ((next == uk2.R && (mk4 = uk2.T.f) != null && mk4.o()) || (next == uk2.T && (mk3 = uk2.R.f) != null && mk3.o())) ? z : false;
                UK.b j0 = uk2.j0();
                boolean z3 = z;
                UK.b bVar2 = UK.b.MATCH_CONSTRAINT;
                if (j0 == bVar2 && !a2) {
                    if (uk2.j0() == bVar2 && uk2.D >= 0 && uk2.C >= 0 && ((uk2.l0() == 8 || (uk2.x == 0 && uk2.A() == 0.0f)) && !uk2.D0() && !uk2.E0() && z2 && !uk2.D0())) {
                        i(i3, uk, bVar, uk2);
                    }
                } else if (!uk2.F0()) {
                    MK mk5 = uk2.R;
                    if (next == mk5 && uk2.T.f == null) {
                        int g = mk5.g() + f2;
                        uk2.u1(g, uk2.D() + g);
                        k(i3, uk2, bVar);
                    } else {
                        MK mk6 = uk2.T;
                        if (next == mk6 && mk5.f == null) {
                            int g2 = f2 - mk6.g();
                            uk2.u1(g2 - uk2.D(), g2);
                            k(i3, uk2, bVar);
                        } else if (z2 && !uk2.D0()) {
                            h(i3, bVar, uk2);
                        }
                    }
                }
                z = z3;
            }
        }
        boolean z4 = z;
        if (uk instanceof C9445sF0) {
            return;
        }
        if (r2.e() != null && r2.o()) {
            Iterator<MK> it2 = r2.e().iterator();
            while (it2.hasNext()) {
                MK next2 = it2.next();
                UK uk3 = next2.d;
                int i4 = i + 1;
                boolean a3 = a(i4, uk3);
                if (uk3.F0() && a3) {
                    VK.S2(i4, uk3, bVar, new C5163am.a(), C5163am.a.k);
                }
                boolean z5 = ((next2 == uk3.R && (mk2 = uk3.T.f) != null && mk2.o()) || (next2 == uk3.T && (mk = uk3.R.f) != null && mk.o())) ? z4 : false;
                UK.b j02 = uk3.j0();
                UK.b bVar3 = UK.b.MATCH_CONSTRAINT;
                if (j02 == bVar3 && !a3) {
                    if (uk3.j0() == bVar3 && uk3.D >= 0 && uk3.C >= 0 && (uk3.l0() == 8 || (uk3.x == 0 && uk3.A() == 0.0f))) {
                        if (!uk3.D0() && !uk3.E0() && z5 && !uk3.D0()) {
                            i(i4, uk, bVar, uk3);
                        }
                    }
                } else if (!uk3.F0()) {
                    MK mk7 = uk3.R;
                    if (next2 == mk7 && uk3.T.f == null) {
                        int g3 = mk7.g() + f3;
                        uk3.u1(g3, uk3.D() + g3);
                        k(i4, uk3, bVar);
                    } else {
                        MK mk8 = uk3.T;
                        if (next2 == mk8 && mk7.f == null) {
                            int g4 = f3 - mk8.g();
                            uk3.u1(g4 - uk3.D(), g4);
                            k(i4, uk3, bVar);
                        } else if (z5 && !uk3.D0()) {
                            h(i4, bVar, uk3);
                        }
                    }
                }
            }
        }
        MK r3 = uk.r(MK.a.BASELINE);
        if (r3.e() != null && r3.o()) {
            int f4 = r3.f();
            Iterator<MK> it3 = r3.e().iterator();
            while (it3.hasNext()) {
                MK next3 = it3.next();
                UK uk4 = next3.d;
                int i5 = i + 1;
                boolean a4 = a(i5, uk4);
                if (uk4.F0() && a4) {
                    VK.S2(i5, uk4, bVar, new C5163am.a(), C5163am.a.k);
                }
                if (uk4.j0() != UK.b.MATCH_CONSTRAINT || a4) {
                    if (!uk4.F0() && next3 == uk4.U) {
                        uk4.p1(next3.g() + f4);
                        k(i5, uk4, bVar);
                    }
                }
            }
        }
        uk.O0();
    }
}
