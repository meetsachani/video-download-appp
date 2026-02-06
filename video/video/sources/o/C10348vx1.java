package o;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;

/* renamed from: o.vx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10348vx1 {
    public static final int a = 2;
    public static final int b = 3;
    public static final int c = 512;
    public static final C7570ke0 d = new C7570ke0();

    public static C10311vp a(F20 f20) throws C9349rr1 {
        int[] j;
        if (f20 == null || (j = f20.j()) == null) {
            return null;
        }
        int p = p(j);
        int i = 0;
        int i2 = 0;
        for (int i3 : j) {
            i2 += p - i3;
            if (i3 > 0) {
                break;
            }
        }
        VE[] d2 = f20.d();
        for (int i4 = 0; i2 > 0 && d2[i4] == null; i4++) {
            i2--;
        }
        for (int length = j.length - 1; length >= 0; length--) {
            int i5 = j[length];
            i += p - i5;
            if (i5 > 0) {
                break;
            }
        }
        for (int length2 = d2.length - 1; i > 0 && d2[length2] == null; length2--) {
            i--;
        }
        return f20.a().a(i2, i, f20.k());
    }

    public static void b(D20 d20, C4230Sk[][] c4230SkArr) throws C9349rr1 {
        C4230Sk c4230Sk = c4230SkArr[0][1];
        int[] b2 = c4230Sk.b();
        int j = (d20.j() * d20.l()) - r(d20.k());
        if (b2.length == 0) {
            if (j > 0 && j <= 928) {
                c4230Sk.c(j);
                return;
            }
            throw C9349rr1.a();
        } else if (b2[0] != j) {
            c4230Sk.c(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0022, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(C2469An c2469An, int i, int i2, boolean z, int i3, int i4) {
        int i5;
        if (z) {
            i5 = -1;
        } else {
            i5 = 1;
        }
        int i6 = i3;
        for (int i7 = 0; i7 < 2; i7++) {
            while (true) {
                if (z) {
                    if (i6 < i) {
                        break;
                    }
                    if (z != c2469An.f(i6, i4)) {
                        if (Math.abs(i3 - i6) > 2) {
                            return i3;
                        }
                        i6 += i5;
                    }
                } else {
                    if (i6 >= i2) {
                        break;
                    }
                    if (z != c2469An.f(i6, i4)) {
                        break;
                    }
                }
            }
            i5 = -i5;
            z = !z;
        }
        return i6;
    }

    public static boolean d(int i, int i2, int i3) {
        if (i2 - 2 <= i && i <= i3 + 2) {
            return true;
        }
        return false;
    }

    public static int e(int[] iArr, int[] iArr2, int i) throws UB {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return d.a(iArr, i, iArr2);
        }
        throw UB.a();
    }

    public static C4230Sk[][] f(D20 d20) {
        E20[] o2;
        VE[] d2;
        int c2;
        C4230Sk[][] c4230SkArr = (C4230Sk[][]) Array.newInstance(C4230Sk.class, d20.l(), d20.j() + 2);
        for (C4230Sk[] c4230SkArr2 : c4230SkArr) {
            int i = 0;
            while (true) {
                if (i < c4230SkArr2.length) {
                    c4230SkArr2[i] = new C4230Sk();
                    i++;
                }
            }
        }
        int i2 = 0;
        for (E20 e20 : d20.o()) {
            if (e20 != null) {
                for (VE ve : e20.d()) {
                    if (ve != null && (c2 = ve.c()) >= 0 && c2 < c4230SkArr.length) {
                        c4230SkArr[c2][i2].c(ve.e());
                    }
                }
            }
            i2++;
        }
        return c4230SkArr;
    }

    public static C9753tW g(D20 d20) throws C2605Bx0, UB, C9349rr1 {
        C4230Sk[][] f = f(d20);
        b(d20, f);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[d20.l() * d20.j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < d20.l(); i++) {
            int i2 = 0;
            while (i2 < d20.j()) {
                int i3 = i2 + 1;
                int[] b2 = f[i][i3].b();
                int j = (d20.j() * i) + i2;
                if (b2.length == 0) {
                    arrayList.add(Integer.valueOf(j));
                } else if (b2.length == 1) {
                    iArr[j] = b2[0];
                } else {
                    arrayList3.add(Integer.valueOf(j));
                    arrayList2.add(b2);
                }
                i2 = i3;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr2[i4] = (int[]) arrayList2.get(i4);
        }
        return h(d20.k(), iArr, C8881px1.c(arrayList), C8881px1.c(arrayList3), iArr2);
    }

    public static C9753tW h(int i, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws C2605Bx0, UB {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i2 = 100;
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[iArr3[i4]] = iArr4[i4][iArr5[i4]];
                }
                try {
                    return j(iArr, i, iArr2);
                } catch (UB unused) {
                    if (length != 0) {
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            }
                            int i6 = iArr5[i5];
                            if (i6 < iArr4[i5].length - 1) {
                                iArr5[i5] = i6 + 1;
                                break;
                            }
                            iArr5[i5] = 0;
                            if (i5 != length - 1) {
                                i5++;
                            } else {
                                throw UB.a();
                            }
                        }
                        i2 = i3;
                    } else {
                        throw UB.a();
                    }
                }
            } else {
                throw UB.a();
            }
        }
    }

    public static C9753tW i(C2469An c2469An, UT1 ut1, UT1 ut12, UT1 ut13, UT1 ut14, int i, int i2) throws C9349rr1, C2605Bx0, UB {
        C10311vp c10311vp;
        boolean z;
        int i3;
        E20 f20;
        boolean z2;
        E20 e20;
        int i4;
        F20 f202;
        F20 f203 = null;
        boolean z3 = false;
        C10311vp c10311vp2 = new C10311vp(c2469An, ut1, ut12, ut13, ut14);
        F20 f204 = null;
        D20 d20 = null;
        int i5 = 0;
        while (i5 < 2) {
            if (ut1 != null) {
                f202 = s(c2469An, c10311vp2, ut1, true, i, i2);
            } else {
                f202 = f203;
            }
            if (ut13 != null) {
                f204 = s(c2469An, c10311vp2, ut13, false, i, i2);
            }
            c10311vp = c10311vp2;
            d20 = v(f202, f204);
            if (d20 != null) {
                if (i5 == 0 && d20.m() != null && (d20.m().g() < c10311vp.g() || d20.m().e() > c10311vp.e())) {
                    c10311vp2 = d20.m();
                    i5++;
                    f203 = f202;
                } else {
                    d20.p(c10311vp);
                    f203 = f202;
                    break;
                }
            } else {
                throw C9349rr1.a();
            }
        }
        c10311vp = c10311vp2;
        D20 d202 = d20;
        int j = d202.j() + 1;
        d202.q(0, f203);
        d202.q(j, f204);
        if (f203 != null) {
            z = true;
        } else {
            z = false;
        }
        int i6 = i;
        int i7 = i2;
        int i8 = 1;
        while (i8 <= j) {
            if (z) {
                i3 = i8;
            } else {
                i3 = j - i8;
            }
            if (d202.n(i3) == null) {
                if (i3 != 0 && i3 != j) {
                    f20 = new E20(c10311vp);
                } else {
                    if (i3 == 0) {
                        z2 = true;
                    } else {
                        z2 = z3;
                    }
                    f20 = new F20(c10311vp, z2);
                }
                d202.q(i3, f20);
                int i9 = -1;
                int i10 = i6;
                int i11 = i7;
                int g = c10311vp.g();
                int i12 = -1;
                while (g <= c10311vp.e()) {
                    int t = t(d202, i3, g, z);
                    if (t < 0 || t > c10311vp.d()) {
                        if (i12 != i9) {
                            t = i12;
                        } else {
                            e20 = f20;
                            i4 = i9;
                            g++;
                            f20 = e20;
                            i9 = i4;
                        }
                    }
                    e20 = f20;
                    i4 = i9;
                    int i13 = t;
                    VE k = k(c2469An, c10311vp.f(), c10311vp.d(), z, i13, g, i10, i11);
                    if (k != null) {
                        e20.f(g, k);
                        i10 = Math.min(i10, k.f());
                        i11 = Math.max(i11, k.f());
                        i12 = i13;
                    }
                    g++;
                    f20 = e20;
                    i9 = i4;
                }
                i6 = i10;
                i7 = i11;
            }
            i8++;
            z3 = false;
        }
        return g(d202);
    }

    public static C9753tW j(int[] iArr, int i, int[] iArr2) throws C2605Bx0, UB {
        if (iArr.length != 0) {
            int i2 = 1 << (i + 1);
            int e = e(iArr, iArr2, i2);
            x(iArr, i2);
            C9753tW b2 = C5831dW.b(iArr, String.valueOf(i));
            b2.m(Integer.valueOf(e));
            b2.l(Integer.valueOf(iArr2.length));
            return b2;
        }
        throw C2605Bx0.a();
    }

    public static VE k(C2469An c2469An, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7;
        int d2;
        int b2;
        int c2 = c(c2469An, i, i2, z, i3, i4);
        int[] q = q(c2469An, i, i2, z, c2, i4);
        if (q == null) {
            return null;
        }
        int d3 = C9044qd1.d(q);
        if (z) {
            i7 = c2 + d3;
        } else {
            for (int i8 = 0; i8 < q.length / 2; i8++) {
                int i9 = q[i8];
                q[i8] = q[(q.length - 1) - i8];
                q[(q.length - 1) - i8] = i9;
            }
            c2 -= d3;
            i7 = c2;
        }
        if (!d(d3, i5, i6) || (b2 = C8881px1.b((d2 = C8638ox1.d(q)))) == -1) {
            return null;
        }
        return new VE(c2, i7, n(d2), b2);
    }

    public static C4033Qk l(F20 f20, F20 f202) {
        C4033Qk i;
        C4033Qk i2;
        if (f20 != null && (i = f20.i()) != null) {
            if (f202 != null && (i2 = f202.i()) != null && i.a() != i2.a() && i.b() != i2.b() && i.c() != i2.c()) {
                return null;
            }
            return i;
        } else if (f202 == null) {
            return null;
        } else {
            return f202.i();
        }
    }

    public static int[] m(int i) {
        int[] iArr = new int[8];
        int i2 = 0;
        int i3 = 7;
        while (true) {
            int i4 = i & 1;
            if (i4 != i2) {
                i3--;
                if (i3 >= 0) {
                    i2 = i4;
                } else {
                    return iArr;
                }
            }
            iArr[i3] = iArr[i3] + 1;
            i >>= 1;
        }
    }

    public static int n(int i) {
        return o(m(i));
    }

    public static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    public static int p(int[] iArr) {
        int i = -1;
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0027 A[EDGE_INSN: B:27:0x0027->B:16:0x0027 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] q(C2469An c2469An, int i, int i2, boolean z, int i3, int i4) {
        int i5;
        int[] iArr = new int[8];
        if (z) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        int i6 = 0;
        boolean z2 = z;
        while (true) {
            if (z) {
                if (i3 >= i2) {
                    break;
                }
                if (i6 < 8) {
                    break;
                } else if (c2469An.f(i3, i4) == z2) {
                    iArr[i6] = iArr[i6] + 1;
                    i3 += i5;
                } else {
                    i6++;
                    z2 = !z2;
                }
            } else {
                if (i3 < i) {
                    break;
                }
                if (i6 < 8) {
                }
            }
        }
        if (i6 != 8) {
            if (z) {
                i = i2;
            }
            if (i3 != i || i6 != 7) {
                return null;
            }
        }
        return iArr;
    }

    public static int r(int i) {
        return 2 << i;
    }

    public static F20 s(C2469An c2469An, C10311vp c10311vp, UT1 ut1, boolean z, int i, int i2) {
        int i3;
        int b2;
        F20 f20 = new F20(c10311vp, z);
        for (int i4 = 0; i4 < 2; i4++) {
            if (i4 == 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            int i5 = i3;
            int c2 = (int) ut1.c();
            for (int d2 = (int) ut1.d(); d2 <= c10311vp.e() && d2 >= c10311vp.g(); d2 += i5) {
                VE k = k(c2469An, 0, c2469An.m(), z, c2, d2, i, i2);
                if (k != null) {
                    f20.f(d2, k);
                    if (z) {
                        b2 = k.d();
                    } else {
                        b2 = k.b();
                    }
                    c2 = b2;
                }
            }
        }
        return f20;
    }

    public static int t(D20 d20, int i, int i2, boolean z) {
        int i3;
        VE ve;
        VE[] d2;
        int d3;
        if (z) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i4 = i - i3;
        if (u(d20, i4)) {
            ve = d20.n(i4).b(i2);
        } else {
            ve = null;
        }
        if (ve != null) {
            if (z) {
                return ve.b();
            }
            return ve.d();
        }
        VE c2 = d20.n(i).c(i2);
        if (c2 != null) {
            if (z) {
                return c2.d();
            }
            return c2.b();
        }
        if (u(d20, i4)) {
            c2 = d20.n(i4).c(i2);
        }
        if (c2 != null) {
            if (z) {
                return c2.b();
            }
            return c2.d();
        }
        int i5 = 0;
        while (true) {
            i -= i3;
            if (u(d20, i)) {
                for (VE ve2 : d20.n(i).d()) {
                    if (ve2 != null) {
                        if (z) {
                            d3 = ve2.b();
                        } else {
                            d3 = ve2.d();
                        }
                        return d3 + (i3 * i5 * (ve2.b() - ve2.d()));
                    }
                }
                i5++;
            } else {
                C10311vp m = d20.m();
                if (z) {
                    return m.f();
                }
                return m.d();
            }
        }
    }

    public static boolean u(D20 d20, int i) {
        if (i >= 0 && i <= d20.j() + 1) {
            return true;
        }
        return false;
    }

    public static D20 v(F20 f20, F20 f202) throws C9349rr1 {
        C4033Qk l;
        if ((f20 == null && f202 == null) || (l = l(f20, f202)) == null) {
            return null;
        }
        return new D20(l, C10311vp.j(a(f20), a(f202)));
    }

    public static String w(C4230Sk[][] c4230SkArr) {
        Formatter formatter = new Formatter();
        for (int i = 0; i < c4230SkArr.length; i++) {
            try {
                formatter.format("Row %2d: ", Integer.valueOf(i));
                int i2 = 0;
                while (true) {
                    C4230Sk[] c4230SkArr2 = c4230SkArr[i];
                    if (i2 < c4230SkArr2.length) {
                        C4230Sk c4230Sk = c4230SkArr2[i2];
                        if (c4230Sk.b().length == 0) {
                            formatter.format("        ", null);
                        } else {
                            formatter.format("%4d(%2d)", Integer.valueOf(c4230Sk.b()[0]), c4230Sk.a(c4230Sk.b()[0]));
                        }
                        i2++;
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }

    public static void x(int[] iArr, int i) throws C2605Bx0 {
        if (iArr.length >= 4) {
            int i2 = iArr[0];
            if (i2 <= iArr.length) {
                if (i2 == 0) {
                    if (i < iArr.length) {
                        iArr[0] = iArr.length - i;
                        return;
                    }
                    throw C2605Bx0.a();
                }
                return;
            }
            throw C2605Bx0.a();
        }
        throw C2605Bx0.a();
    }
}
