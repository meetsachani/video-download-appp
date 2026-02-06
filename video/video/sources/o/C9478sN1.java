package o;

import com.facebook.internal.C2372q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C3503Kz;

/* renamed from: o.sN1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9478sN1 extends K2 {
    public static final int A = 11;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    public static final int x = 4;
    public static final int y = 5;
    public final List<C8577oi0> k = new ArrayList(11);
    public final List<C9312ri0> l = new ArrayList();
    public final int[] m = new int[2];
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f860o = {7, 5, 4, 3, 1};
    public static final int[] p = {4, 20, 52, 104, 204};
    public static final int[] q = {0, 348, 1388, 2948, 3988};
    public static final int[][] r = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    public static final int[][] s = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, C3503Kz.g0, 7, 21, 63}, new int[]{CK1.w, C3503Kz.i0, 13, 39, 117, C3503Kz.d0, C3503Kz.b.y, 205}, new int[]{C8463oE0.u, C3503Kz.q0, 49, 147, 19, 57, 171, 91}, new int[]{62, C10997yd1.Q1, 136, 197, C7834lj1.G, 85, 44, C3503Kz.V}, new int[]{185, C3503Kz.W, Xu2.A, C3503Kz.f0, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, C3503Kz.r0, 52, C3503Kz.p0}, new int[]{46, 138, 203, C10997yd1.l2, C3503Kz.c0, 206, 196, C10997yd1.t1}, new int[]{76, 17, 51, C3503Kz.m0, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, C3503Kz.j0}, new int[]{16, 48, C3503Kz.h0, 10, 30, 90, 59, 177}, new int[]{109, 116, C3503Kz.a0, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, EF0.t, 130, 179, 115}, new int[]{134, 191, C3503Kz.k0, 31, 93, 68, 204, C2372q.m}, new int[]{DE.g, 22, 66, 198, Xu2.K, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, CK1.x, C3503Kz.n0, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, FF0.q, 124}, new int[]{C10997yd1.q1, 61, C10997yd1.n2, 127, C7193j50.f, 88, 53, 159}, new int[]{55, C10997yd1.v1, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, C10997yd1.y1, 100, 89}};
    public static final int[][] z = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    public static int A(C10792xn c10792xn, int i) {
        if (c10792xn.i(i)) {
            return c10792xn.k(c10792xn.l(i));
        }
        return c10792xn.l(c10792xn.k(i));
    }

    public static boolean C(C10331vt0 c10331vt0, boolean z2, boolean z3) {
        if (c10331vt0.c() == 0 && z2 && z3) {
            return false;
        }
        return true;
    }

    public static boolean D(Iterable<C8577oi0> iterable, Iterable<C9312ri0> iterable2) {
        for (C9312ri0 c9312ri0 : iterable2) {
            for (C8577oi0 c8577oi0 : iterable) {
                for (C8577oi0 c8577oi02 : c9312ri0.a()) {
                    if (c8577oi0.equals(c8577oi02)) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean E(List<C8577oi0> list) {
        int[][] iArr;
        for (int[] iArr2 : z) {
            if (list.size() <= iArr2.length) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).b().c() != iArr2[i]) {
                        break;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void G(List<C8577oi0> list, List<C9312ri0> list2) {
        Iterator<C9312ri0> it = list2.iterator();
        while (it.hasNext()) {
            C9312ri0 next = it.next();
            if (next.a().size() != list.size()) {
                Iterator<C8577oi0> it2 = next.a().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C8577oi0 next2 = it2.next();
                        for (C8577oi0 c8577oi0 : list) {
                            if (next2.equals(c8577oi0)) {
                                break;
                            }
                        }
                    } else {
                        it.remove();
                        break;
                    }
                }
            }
        }
    }

    public static void I(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    public static QT1 w(List<C8577oi0> list) throws C9349rr1, C2605Bx0 {
        String d = F0.a(C11035yn.a(list)).d();
        UT1[] a = list.get(0).b().a();
        UT1[] a2 = list.get(list.size() - 1).b().a();
        return new QT1(d, null, new UT1[]{a[0], a[1], a2[0], a2[1]}, EnumC3839Ok.RSS_EXPANDED);
    }

    public List<C9312ri0> B() {
        return this.l;
    }

    public final C10331vt0 F(C10792xn c10792xn, int i, boolean z2) {
        int l;
        int i2;
        int i3;
        if (z2) {
            int i4 = this.m[0] - 1;
            while (i4 >= 0 && !c10792xn.i(i4)) {
                i4--;
            }
            int i5 = i4 + 1;
            int[] iArr = this.m;
            i3 = iArr[0] - i5;
            l = iArr[1];
            i2 = i5;
        } else {
            int[] iArr2 = this.m;
            int i6 = iArr2[0];
            l = c10792xn.l(iArr2[1] + 1);
            i2 = i6;
            i3 = l - this.m[1];
        }
        int i7 = l;
        int[] k = k();
        System.arraycopy(k, 0, k, 1, k.length - 1);
        k[0] = i3;
        try {
            return new C10331vt0(K2.r(k, r), new int[]{i2, i7}, i2, i7, i);
        } catch (C9349rr1 unused) {
            return null;
        }
    }

    public C8577oi0 H(C10792xn c10792xn, List<C8577oi0> list, int i) throws C9349rr1 {
        boolean z2;
        C10331vt0 F;
        C9504sU c9504sU;
        if (list.size() % 2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.n) {
            z2 = !z2;
        }
        int i2 = -1;
        boolean z3 = true;
        do {
            z(c10792xn, list, i2);
            F = F(c10792xn, i, z2);
            if (F == null) {
                i2 = A(c10792xn, this.m[0]);
                continue;
            } else {
                z3 = false;
                continue;
            }
        } while (z3);
        C9504sU x2 = x(c10792xn, F, z2, true);
        if (!list.isEmpty() && list.get(list.size() - 1).g()) {
            throw C9349rr1.a();
        }
        try {
            c9504sU = x(c10792xn, F, z2, false);
        } catch (C9349rr1 unused) {
            c9504sU = null;
        }
        return new C8577oi0(x2, c9504sU, F, true);
    }

    public final void J(int i, boolean z2) {
        boolean z3 = false;
        int i2 = 0;
        boolean z4 = false;
        while (true) {
            if (i2 >= this.l.size()) {
                break;
            }
            C9312ri0 c9312ri0 = this.l.get(i2);
            if (c9312ri0.b() > i) {
                z3 = c9312ri0.c(this.k);
                break;
            } else {
                z4 = c9312ri0.c(this.k);
                i2++;
            }
        }
        if (!z3 && !z4 && !D(this.k, this.l)) {
            this.l.add(i2, new C9312ri0(this.k, i, z2));
            G(this.k, this.l);
        }
    }

    @Override // o.AbstractC9608sv1
    public QT1 a(int i, C10792xn c10792xn, Map<XV, ?> map) throws C9349rr1, C2605Bx0 {
        this.k.clear();
        this.n = false;
        try {
            return w(y(i, c10792xn));
        } catch (C9349rr1 unused) {
            this.k.clear();
            this.n = true;
            return w(y(i, c10792xn));
        }
    }

    @Override // o.AbstractC9608sv1, o.DO1
    public void reset() {
        this.k.clear();
        this.l.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(int i) throws C9349rr1 {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int d = C9044qd1.d(n());
        int d2 = C9044qd1.d(l());
        boolean z7 = true;
        boolean z8 = false;
        if (d > 13) {
            z3 = true;
            z2 = false;
        } else if (d < 4) {
            z2 = true;
            z3 = false;
        } else {
            z2 = false;
            z3 = false;
        }
        if (d2 > 13) {
            z5 = true;
            z4 = false;
        } else if (d2 < 4) {
            z4 = true;
            z5 = false;
        } else {
            z4 = false;
            z5 = false;
        }
        int i2 = (d + d2) - i;
        if ((d & 1) == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((d2 & 1) == 0) {
            z8 = true;
        }
        if (i2 == 1) {
            if (z6) {
                if (!z8) {
                    z3 = true;
                } else {
                    throw C9349rr1.a();
                }
            } else if (z8) {
                z5 = true;
            } else {
                throw C9349rr1.a();
            }
        } else if (i2 == -1) {
            if (z6) {
                if (z8) {
                    throw C9349rr1.a();
                }
                if (z7) {
                    if (!z3) {
                        K2.p(n(), o());
                    } else {
                        throw C9349rr1.a();
                    }
                }
                if (z3) {
                    K2.i(n(), o());
                }
                if (z4) {
                    if (!z5) {
                        K2.p(l(), o());
                    } else {
                        throw C9349rr1.a();
                    }
                }
                if (z5) {
                    K2.i(l(), m());
                    return;
                }
                return;
            } else if (z8) {
                z4 = true;
            } else {
                throw C9349rr1.a();
            }
        } else if (i2 == 0) {
            if (z6) {
                if (z8) {
                    if (d < d2) {
                        z5 = true;
                        if (z7) {
                        }
                        if (z3) {
                        }
                        if (z4) {
                        }
                        if (z5) {
                        }
                    } else {
                        z4 = true;
                        z3 = true;
                    }
                } else {
                    throw C9349rr1.a();
                }
            } else if (z8) {
                throw C9349rr1.a();
            }
        } else {
            throw C9349rr1.a();
        }
        z7 = z2;
        if (z7) {
        }
        if (z3) {
        }
        if (z4) {
        }
        if (z5) {
        }
    }

    public final boolean t() {
        C8577oi0 c8577oi0 = this.k.get(0);
        C9504sU c = c8577oi0.c();
        C9504sU d = c8577oi0.d();
        if (d == null) {
            return false;
        }
        int a = d.a();
        int i = 2;
        for (int i2 = 1; i2 < this.k.size(); i2++) {
            C8577oi0 c8577oi02 = this.k.get(i2);
            a += c8577oi02.c().a();
            int i3 = i + 1;
            C9504sU d2 = c8577oi02.d();
            if (d2 != null) {
                a += d2.a();
                i += 2;
            } else {
                i = i3;
            }
        }
        if (((i - 4) * 211) + (a % 211) != c.b()) {
            return false;
        }
        return true;
    }

    public final List<C8577oi0> u(List<C9312ri0> list, int i) throws C9349rr1 {
        while (i < this.l.size()) {
            C9312ri0 c9312ri0 = this.l.get(i);
            this.k.clear();
            for (C9312ri0 c9312ri02 : list) {
                this.k.addAll(c9312ri02.a());
            }
            this.k.addAll(c9312ri0.a());
            if (E(this.k)) {
                if (t()) {
                    return this.k;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(c9312ri0);
                try {
                    return u(arrayList, i + 1);
                } catch (C9349rr1 unused) {
                    continue;
                }
            }
            i++;
        }
        throw C9349rr1.a();
    }

    public final List<C8577oi0> v(boolean z2) {
        List<C8577oi0> list = null;
        if (this.l.size() > 25) {
            this.l.clear();
            return null;
        }
        this.k.clear();
        if (z2) {
            Collections.reverse(this.l);
        }
        try {
            list = u(new ArrayList(), 0);
        } catch (C9349rr1 unused) {
        }
        if (z2) {
            Collections.reverse(this.l);
        }
        return list;
    }

    public C9504sU x(C10792xn c10792xn, C10331vt0 c10331vt0, boolean z2, boolean z3) throws C9349rr1 {
        int i;
        int[] j = j();
        for (int i2 = 0; i2 < j.length; i2++) {
            j[i2] = 0;
        }
        if (z3) {
            AbstractC9608sv1.g(c10792xn, c10331vt0.b()[0], j);
        } else {
            AbstractC9608sv1.f(c10792xn, c10331vt0.b()[1], j);
            int i3 = 0;
            for (int length = j.length - 1; i3 < length; length--) {
                int i4 = j[i3];
                j[i3] = j[length];
                j[length] = i4;
                i3++;
            }
        }
        float d = C9044qd1.d(j) / 17.0f;
        float f = (c10331vt0.b()[1] - c10331vt0.b()[0]) / 15.0f;
        if (Math.abs(d - f) / f <= 0.3f) {
            int[] n = n();
            int[] l = l();
            float[] o2 = o();
            float[] m = m();
            for (int i5 = 0; i5 < j.length; i5++) {
                float f2 = (j[i5] * 1.0f) / d;
                int i6 = (int) (0.5f + f2);
                if (i6 <= 0) {
                    if (f2 >= 0.3f) {
                        i6 = 1;
                    } else {
                        throw C9349rr1.a();
                    }
                } else if (i6 > 8) {
                    if (f2 <= 8.7f) {
                        i6 = 8;
                    } else {
                        throw C9349rr1.a();
                    }
                }
                int i7 = i5 / 2;
                if ((i5 & 1) == 0) {
                    n[i7] = i6;
                    o2[i7] = f2 - i6;
                } else {
                    l[i7] = i6;
                    m[i7] = f2 - i6;
                }
            }
            s(17);
            int c = c10331vt0.c() * 4;
            if (z2) {
                i = 0;
            } else {
                i = 2;
            }
            int i8 = ((c + i) + (!z3 ? 1 : 0)) - 1;
            int i9 = 0;
            int i10 = 0;
            for (int length2 = n.length - 1; length2 >= 0; length2--) {
                if (C(c10331vt0, z2, z3)) {
                    i9 += n[length2] * s[i8][length2 * 2];
                }
                i10 += n[length2];
            }
            int i11 = 0;
            for (int length3 = l.length - 1; length3 >= 0; length3--) {
                if (C(c10331vt0, z2, z3)) {
                    i11 += l[length3] * s[i8][(length3 * 2) + 1];
                }
            }
            int i12 = i9 + i11;
            if ((i10 & 1) == 0 && i10 <= 13 && i10 >= 4) {
                int i13 = (13 - i10) / 2;
                int i14 = f860o[i13];
                int i15 = 9 - i14;
                return new C9504sU((C9721tN1.b(n, i14, true) * p[i13]) + C9721tN1.b(l, i15, false) + q[i13], i12);
            }
            throw C9349rr1.a();
        }
        throw C9349rr1.a();
    }

    public List<C8577oi0> y(int i, C10792xn c10792xn) throws C9349rr1 {
        boolean z2 = false;
        while (!z2) {
            try {
                List<C8577oi0> list = this.k;
                list.add(H(c10792xn, list, i));
            } catch (C9349rr1 e) {
                if (!this.k.isEmpty()) {
                    z2 = true;
                } else {
                    throw e;
                }
            }
        }
        if (t()) {
            return this.k;
        }
        boolean isEmpty = this.l.isEmpty();
        J(i, false);
        if (!isEmpty) {
            List<C8577oi0> v2 = v(false);
            if (v2 != null) {
                return v2;
            }
            List<C8577oi0> v3 = v(true);
            if (v3 != null) {
                return v3;
            }
        }
        throw C9349rr1.a();
    }

    public final void z(C10792xn c10792xn, List<C8577oi0> list, int i) throws C9349rr1 {
        boolean z2;
        int[] k = k();
        k[0] = 0;
        k[1] = 0;
        k[2] = 0;
        k[3] = 0;
        int m = c10792xn.m();
        if (i < 0) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = list.get(list.size() - 1).b().b()[1];
            }
        }
        if (list.size() % 2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.n) {
            z2 = !z2;
        }
        boolean z3 = false;
        while (true) {
            if (i >= m) {
                break;
            }
            boolean i2 = c10792xn.i(i);
            boolean z4 = !i2;
            if (!i2) {
                i++;
                z3 = z4;
            } else {
                z3 = z4;
                break;
            }
        }
        int i3 = 0;
        boolean z5 = z3;
        int i4 = i;
        while (i < m) {
            if (c10792xn.i(i) != z5) {
                k[i3] = k[i3] + 1;
            } else {
                if (i3 == 3) {
                    if (z2) {
                        I(k);
                    }
                    if (K2.q(k)) {
                        int[] iArr = this.m;
                        iArr[0] = i4;
                        iArr[1] = i;
                        return;
                    }
                    if (z2) {
                        I(k);
                    }
                    i4 += k[0] + k[1];
                    k[0] = k[2];
                    k[1] = k[3];
                    k[2] = 0;
                    k[3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                k[i3] = 1;
                z5 = !z5;
            }
            i++;
        }
        throw C9349rr1.a();
    }
}
