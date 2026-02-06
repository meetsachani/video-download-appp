package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: o.rN1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9235rN1 extends K2 {
    public static final int[] m = {1, 10, 34, 70, 126};
    public static final int[] n = {4, 20, 48, 81};

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f848o = {0, C10997yd1.q1, 961, 2015, 2715};
    public static final int[] p = {0, 336, 1036, 1516};
    public static final int[] q = {8, 6, 4, 3, 1};
    public static final int[] r = {2, 4, 6, 8};
    public static final int[][] s = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    public final List<C4083Qx1> k = new ArrayList();
    public final List<C4083Qx1> l = new ArrayList();

    public static void s(Collection<C4083Qx1> collection, C4083Qx1 c4083Qx1) {
        if (c4083Qx1 == null) {
            return;
        }
        for (C4083Qx1 c4083Qx12 : collection) {
            if (c4083Qx12.b() == c4083Qx1.b()) {
                c4083Qx12.e();
                return;
            }
        }
        collection.add(c4083Qx1);
    }

    public static boolean u(C4083Qx1 c4083Qx1, C4083Qx1 c4083Qx12) {
        int a = (c4083Qx1.a() + (c4083Qx12.a() * 16)) % 79;
        int c = (c4083Qx1.d().c() * 9) + c4083Qx12.d().c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        if (a == c) {
            return true;
        }
        return false;
    }

    public static QT1 v(C4083Qx1 c4083Qx1, C4083Qx1 c4083Qx12) {
        String valueOf = String.valueOf((c4083Qx1.b() * 4537077) + c4083Qx12.b());
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append(C3599Ly1.j);
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - C3599Ly1.j;
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        UT1[] a = c4083Qx1.d().a();
        UT1[] a2 = c4083Qx12.d().a();
        return new QT1(sb.toString(), null, new UT1[]{a[0], a[1], a2[0], a2[1]}, EnumC3839Ok.RSS_14);
    }

    @Override // o.AbstractC9608sv1
    public QT1 a(int i, C10792xn c10792xn, Map<XV, ?> map) throws C9349rr1 {
        s(this.k, x(c10792xn, false, i, map));
        c10792xn.q();
        s(this.l, x(c10792xn, true, i, map));
        c10792xn.q();
        for (C4083Qx1 c4083Qx1 : this.k) {
            if (c4083Qx1.c() > 1) {
                for (C4083Qx1 c4083Qx12 : this.l) {
                    if (c4083Qx12.c() > 1 && u(c4083Qx1, c4083Qx12)) {
                        return v(c4083Qx1, c4083Qx12);
                    }
                }
                continue;
            }
        }
        throw C9349rr1.a();
    }

    @Override // o.AbstractC9608sv1, o.DO1
    public void reset() {
        this.k.clear();
        this.l.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r1 < 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        r2 = true;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        r2 = false;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        if (r1 < 4) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(boolean z, int i) throws C9349rr1 {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int d = C9044qd1.d(n());
        int d2 = C9044qd1.d(l());
        boolean z7 = true;
        boolean z8 = false;
        if (z) {
            if (d > 12) {
                z3 = true;
                z2 = false;
            } else if (d < 4) {
                z2 = true;
                z3 = false;
            } else {
                z2 = false;
                z3 = false;
            }
            if (d2 <= 12) {
            }
            z5 = true;
            z4 = false;
        } else {
            if (d > 11) {
                z3 = true;
                z2 = false;
            } else if (d < 5) {
                z2 = true;
                z3 = false;
            } else {
                z2 = false;
                z3 = false;
            }
            if (d2 <= 10) {
            }
            z5 = true;
            z4 = false;
        }
        int i2 = (d + d2) - i;
        if ((d & 1) == z) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((d2 & 1) == 1) {
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

    public final C9504sU w(C10792xn c10792xn, C10331vt0 c10331vt0, boolean z) throws C9349rr1 {
        int i;
        int[] j = j();
        for (int i2 = 0; i2 < j.length; i2++) {
            j[i2] = 0;
        }
        if (z) {
            AbstractC9608sv1.g(c10792xn, c10331vt0.b()[0], j);
        } else {
            AbstractC9608sv1.f(c10792xn, c10331vt0.b()[1] + 1, j);
            int i3 = 0;
            for (int length = j.length - 1; i3 < length; length--) {
                int i4 = j[i3];
                j[i3] = j[length];
                j[length] = i4;
                i3++;
            }
        }
        if (z) {
            i = 16;
        } else {
            i = 15;
        }
        float d = C9044qd1.d(j) / i;
        int[] n2 = n();
        int[] l = l();
        float[] o2 = o();
        float[] m2 = m();
        for (int i5 = 0; i5 < j.length; i5++) {
            float f = j[i5] / d;
            int i6 = (int) (0.5f + f);
            if (i6 <= 0) {
                i6 = 1;
            } else if (i6 > 8) {
                i6 = 8;
            }
            int i7 = i5 / 2;
            if ((i5 & 1) == 0) {
                n2[i7] = i6;
                o2[i7] = f - i6;
            } else {
                l[i7] = i6;
                m2[i7] = f - i6;
            }
        }
        t(z, i);
        int i8 = 0;
        int i9 = 0;
        for (int length2 = n2.length - 1; length2 >= 0; length2--) {
            int i10 = n2[length2];
            i8 = (i8 * 9) + i10;
            i9 += i10;
        }
        int i11 = 0;
        int i12 = 0;
        for (int length3 = l.length - 1; length3 >= 0; length3--) {
            int i13 = l[length3];
            i11 = (i11 * 9) + i13;
            i12 += i13;
        }
        int i14 = i8 + (i11 * 3);
        if (z) {
            if ((i9 & 1) == 0 && i9 <= 12 && i9 >= 4) {
                int i15 = (12 - i9) / 2;
                int i16 = q[i15];
                int i17 = 9 - i16;
                return new C9504sU((C9721tN1.b(n2, i16, false) * m[i15]) + C9721tN1.b(l, i17, true) + f848o[i15], i14);
            }
            throw C9349rr1.a();
        } else if ((i12 & 1) == 0 && i12 <= 10 && i12 >= 4) {
            int i18 = (10 - i12) / 2;
            int i19 = r[i18];
            return new C9504sU((C9721tN1.b(l, 9 - i19, false) * n[i18]) + C9721tN1.b(n2, i19, true) + p[i18], i14);
        } else {
            throw C9349rr1.a();
        }
    }

    public final C4083Qx1 x(C10792xn c10792xn, boolean z, int i, Map<XV, ?> map) {
        int[] y;
        VT1 vt1;
        try {
            C10331vt0 z2 = z(c10792xn, i, z, y(c10792xn, z));
            if (map == null) {
                vt1 = null;
            } else {
                vt1 = (VT1) map.get(XV.NEED_RESULT_POINT_CALLBACK);
            }
            if (vt1 != null) {
                float f = (y[0] + y[1]) / 2.0f;
                if (z) {
                    f = (c10792xn.m() - 1) - f;
                }
                vt1.a(new UT1(f, i));
            }
            C9504sU w = w(c10792xn, z2, true);
            C9504sU w2 = w(c10792xn, z2, false);
            return new C4083Qx1((w.b() * 1597) + w2.b(), w.a() + (w2.a() * 4), z2);
        } catch (C9349rr1 unused) {
            return null;
        }
    }

    public final int[] y(C10792xn c10792xn, boolean z) throws C9349rr1 {
        int[] k = k();
        k[0] = 0;
        k[1] = 0;
        k[2] = 0;
        k[3] = 0;
        int m2 = c10792xn.m();
        int i = 0;
        boolean z2 = false;
        while (i < m2) {
            z2 = !c10792xn.i(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i2 = 0;
        int i3 = i;
        while (i < m2) {
            if (c10792xn.i(i) != z2) {
                k[i2] = k[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (K2.q(k)) {
                        return new int[]{i3, i};
                    }
                    i3 += k[0] + k[1];
                    k[0] = k[2];
                    k[1] = k[3];
                    k[2] = 0;
                    k[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                k[i2] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw C9349rr1.a();
    }

    public final C10331vt0 z(C10792xn c10792xn, int i, boolean z, int[] iArr) throws C9349rr1 {
        int i2;
        boolean i3 = c10792xn.i(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && i3 != c10792xn.i(i4)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] k = k();
        System.arraycopy(k, 0, k, 1, k.length - 1);
        k[0] = iArr[0] - i5;
        int r2 = K2.r(k, s);
        int i6 = iArr[1];
        if (z) {
            i6 = (c10792xn.m() - 1) - i6;
            i2 = (c10792xn.m() - 1) - i5;
        } else {
            i2 = i5;
        }
        return new C10331vt0(r2, new int[]{i5, iArr[1]}, i2, i6, i);
    }
}
