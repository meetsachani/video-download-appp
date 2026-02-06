package o;

import java.util.ArrayList;
import o.MK;
import o.UK;

/* renamed from: o.am  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5163am {
    public static final boolean d = false;
    public static final boolean e = false;
    public static final int f = 30;
    public static final int g = 0;
    public static final int h = 1073741824;
    public static final int i = Integer.MIN_VALUE;
    public static final int j = -1;
    public static final int k = -2;
    public static final int l = -3;
    public final ArrayList<UK> a = new ArrayList<>();
    public a b = new a();
    public VK c;

    /* renamed from: o.am$a */
    /* loaded from: classes.dex */
    public static class a {
        public static int k = 0;
        public static int l = 1;
        public static int m = 2;
        public UK.b a;
        public UK.b b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
    }

    /* renamed from: o.am$b */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(UK uk, a aVar);
    }

    public C5163am(VK vk) {
        this.c = vk;
    }

    public final boolean a(b bVar, UK uk, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.b.a = uk.H();
        this.b.b = uk.j0();
        this.b.c = uk.m0();
        this.b.d = uk.D();
        a aVar = this.b;
        aVar.i = false;
        aVar.j = i2;
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
        if (z3 && uk.y[0] == 4) {
            aVar.a = UK.b.FIXED;
        }
        if (z4 && uk.y[1] == 4) {
            aVar.b = UK.b.FIXED;
        }
        bVar.b(uk, aVar);
        uk.d2(this.b.e);
        uk.z1(this.b.f);
        uk.y1(this.b.h);
        uk.h1(this.b.g);
        a aVar2 = this.b;
        aVar2.j = a.k;
        return aVar2.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
        if (r8 != r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0095, code lost:
        if (r5.f0 <= 0.0f) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(VK vk) {
        boolean z;
        C7731lI0 c7731lI0;
        C6010eF2 c6010eF2;
        int size = vk.B1.size();
        boolean T2 = vk.T2(64);
        b H2 = vk.H2();
        for (int i2 = 0; i2 < size; i2++) {
            UK uk = vk.B1.get(i2);
            if (!(uk instanceof C9445sF0) && !(uk instanceof C4327Tk) && !uk.E0() && (!T2 || (c7731lI0 = uk.e) == null || (c6010eF2 = uk.f) == null || !c7731lI0.e.j || !c6010eF2.e.j)) {
                UK.b z2 = uk.z(0);
                boolean z3 = true;
                UK.b z4 = uk.z(1);
                UK.b bVar = UK.b.MATCH_CONSTRAINT;
                if (z2 == bVar && uk.w != 1 && z4 == bVar && uk.x != 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && vk.T2(1) && !(uk instanceof UI2)) {
                    if (z2 == bVar && uk.w == 0 && z4 != bVar && !uk.B0()) {
                        z = true;
                    }
                    if (z4 == bVar && uk.x == 0 && z2 != bVar && !uk.B0()) {
                        z = true;
                    }
                    if (z2 != bVar) {
                    }
                }
                z3 = z;
                if (!z3) {
                    a(H2, uk, a.k);
                    C3641Mj1 c3641Mj1 = vk.H1;
                    if (c3641Mj1 != null) {
                        c3641Mj1.c++;
                    }
                }
            }
        }
        H2.a();
    }

    public final void c(VK vk, String str, int i2, int i3, int i4) {
        long j2;
        if (vk.H1 != null) {
            j2 = System.nanoTime();
        } else {
            j2 = 0;
        }
        int Q = vk.Q();
        int P = vk.P();
        vk.Q1(0);
        vk.P1(0);
        vk.d2(i3);
        vk.z1(i4);
        vk.Q1(Q);
        vk.P1(P);
        this.c.Y2(i2);
        this.c.o2();
        if (vk.H1 != null) {
            long nanoTime = System.nanoTime();
            C3641Mj1 c3641Mj1 = vk.H1;
            c3641Mj1.R++;
            c3641Mj1.b += nanoTime - j2;
        }
    }

    public long d(VK vk, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        int i11;
        int i12;
        int i13;
        long j3;
        boolean z4;
        boolean z5;
        int i14;
        long j4;
        int i15;
        int i16;
        boolean z6;
        boolean z7;
        boolean z8;
        C3641Mj1 c3641Mj1;
        boolean z9;
        boolean z10;
        boolean z11;
        C5163am c5163am = this;
        VK vk2 = vk;
        b H2 = vk2.H2();
        int size = vk2.B1.size();
        int m0 = vk2.m0();
        int D = vk2.D();
        boolean b2 = C4077Qv1.b(i2, 128);
        if (!b2 && !C4077Qv1.b(i2, 64)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            for (int i17 = 0; i17 < size; i17++) {
                UK uk = vk2.B1.get(i17);
                UK.b H = uk.H();
                UK.b bVar = UK.b.MATCH_CONSTRAINT;
                if (H == bVar) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (uk.j0() == bVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 && z10 && uk.A() > 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((uk.B0() && z11) || ((uk.D0() && z11) || (uk instanceof UI2) || uk.B0() || uk.D0())) {
                    z = false;
                    break;
                }
            }
        }
        if (z && (c3641Mj1 = C9872u01.C) != null) {
            c3641Mj1.e++;
        }
        if ((i5 == 1073741824 && i7 == 1073741824) || b2) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z12 = z & z2;
        int i18 = 2;
        if (z12) {
            j2 = 1;
            int min = Math.min(vk2.O(), i6);
            int min2 = Math.min(vk2.N(), i8);
            if (i5 == 1073741824 && vk2.m0() != min) {
                vk2.d2(min);
                vk2.M2();
            }
            if (i7 == 1073741824 && vk2.D() != min2) {
                vk2.z1(min2);
                vk2.M2();
            }
            if (i5 == 1073741824 && i7 == 1073741824) {
                z3 = vk2.C2(b2);
                i11 = 2;
            } else {
                boolean D2 = vk2.D2(b2);
                if (i5 == 1073741824) {
                    D2 &= vk2.E2(b2, 0);
                    i11 = 1;
                } else {
                    i11 = 0;
                }
                if (i7 == 1073741824) {
                    z3 = vk2.E2(b2, 1) & D2;
                    i11++;
                } else {
                    z3 = D2;
                }
            }
            if (z3) {
                if (i5 == 1073741824) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i7 == 1073741824) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                vk2.j2(z7, z8);
            }
        } else {
            j2 = 1;
            z3 = false;
            i11 = 0;
        }
        long j5 = 0;
        if (!z3 || i11 != 2) {
            int I2 = vk2.I2();
            if (size > 0) {
                b(vk);
            }
            if (vk2.H1 != null) {
                j5 = System.nanoTime();
            }
            e(vk);
            int size2 = c5163am.a.size();
            if (size > 0) {
                c5163am.c(vk2, "First pass", 0, m0, D);
                i12 = m0;
                i13 = D;
            } else {
                i12 = m0;
                i13 = D;
            }
            if (size2 > 0) {
                UK.b H3 = vk2.H();
                UK.b bVar2 = UK.b.WRAP_CONTENT;
                if (H3 == bVar2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (vk2.j0() == bVar2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                int max = Math.max(vk2.m0(), c5163am.c.Q());
                int max2 = Math.max(vk2.D(), c5163am.c.P());
                int i19 = 0;
                boolean z13 = false;
                while (i19 < size2) {
                    UK uk2 = c5163am.a.get(i19);
                    boolean z14 = z12;
                    if (!(uk2 instanceof UI2)) {
                        j4 = j5;
                        i15 = i12;
                        i16 = i13;
                    } else {
                        int m02 = uk2.m0();
                        j4 = j5;
                        int D3 = uk2.D();
                        boolean a2 = z13 | c5163am.a(H2, uk2, a.l);
                        C3641Mj1 c3641Mj12 = vk2.H1;
                        i15 = i12;
                        i16 = i13;
                        if (c3641Mj12 != null) {
                            c3641Mj12.d += j2;
                        }
                        int m03 = uk2.m0();
                        int D4 = uk2.D();
                        if (m03 != m02) {
                            uk2.d2(m03);
                            if (z4 && uk2.X() > max) {
                                max = Math.max(max, uk2.X() + uk2.r(MK.a.RIGHT).g());
                            }
                            z6 = true;
                        } else {
                            z6 = a2;
                        }
                        if (D4 != D3) {
                            uk2.z1(D4);
                            if (z5 && uk2.v() > max2) {
                                max2 = Math.max(max2, uk2.v() + uk2.r(MK.a.BOTTOM).g());
                            }
                            z6 = true;
                        }
                        z13 = z6 | ((UI2) uk2).z2();
                    }
                    i19++;
                    i12 = i15;
                    i13 = i16;
                    z12 = z14;
                    j5 = j4;
                    i18 = 2;
                }
                boolean z15 = z12;
                j3 = j5;
                int i20 = i12;
                int i21 = i13;
                int i22 = i18;
                int i23 = 0;
                while (true) {
                    if (i23 >= i22) {
                        break;
                    }
                    int i24 = 0;
                    while (i24 < size2) {
                        UK uk3 = c5163am.a.get(i24);
                        if (((uk3 instanceof InterfaceC8961qH0) && !(uk3 instanceof UI2)) || (uk3 instanceof C9445sF0) || uk3.l0() == 8 || ((z15 && uk3.e.e.j && uk3.f.e.j) || (uk3 instanceof UI2))) {
                            i14 = i23;
                        } else {
                            int m04 = uk3.m0();
                            int D5 = uk3.D();
                            int t = uk3.t();
                            int i25 = a.l;
                            if (i23 == 1) {
                                i25 = a.m;
                            }
                            boolean a3 = z13 | c5163am.a(H2, uk3, i25);
                            C3641Mj1 c3641Mj13 = vk2.H1;
                            i14 = i23;
                            if (c3641Mj13 != null) {
                                c3641Mj13.d += j2;
                            }
                            int m05 = uk3.m0();
                            int D6 = uk3.D();
                            if (m05 != m04) {
                                uk3.d2(m05);
                                if (z4 && uk3.X() > max) {
                                    max = Math.max(max, uk3.X() + uk3.r(MK.a.RIGHT).g());
                                }
                                a3 = true;
                            }
                            if (D6 != D5) {
                                uk3.z1(D6);
                                if (z5 && uk3.v() > max2) {
                                    max2 = Math.max(max2, uk3.v() + uk3.r(MK.a.BOTTOM).g());
                                }
                                a3 = true;
                            }
                            if (uk3.q0() && t != uk3.t()) {
                                z13 = true;
                            } else {
                                z13 = a3;
                            }
                        }
                        i24++;
                        c5163am = this;
                        vk2 = vk;
                        i23 = i14;
                    }
                    int i26 = i23;
                    if (z13) {
                        i23 = i26 + 1;
                        c(vk, "intermediate pass", i23, i20, i21);
                        c5163am = this;
                        vk2 = vk;
                        i22 = 2;
                        z13 = false;
                    } else {
                        vk2 = vk;
                        break;
                    }
                }
            } else {
                j3 = j5;
            }
            vk2.W2(I2);
            j5 = j3;
        }
        if (vk2.H1 != null) {
            return System.nanoTime() - j5;
        }
        return j5;
    }

    public void e(VK vk) {
        this.a.clear();
        int size = vk.B1.size();
        for (int i2 = 0; i2 < size; i2++) {
            UK uk = vk.B1.get(i2);
            UK.b H = uk.H();
            UK.b bVar = UK.b.MATCH_CONSTRAINT;
            if (H == bVar || uk.j0() == bVar) {
                this.a.add(uk);
            }
        }
        vk.M2();
    }
}
