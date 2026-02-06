package o;

import java.util.Map;

/* loaded from: classes3.dex */
public class J20 {
    public final C2469An a;
    public VT1 b;

    public J20(C2469An c2469An) {
        this.a = c2469An;
    }

    public static int c(UT1 ut1, UT1 ut12, UT1 ut13, float f) throws C9349rr1 {
        int c = (C9044qd1.c(UT1.b(ut1, ut12) / f) + C9044qd1.c(UT1.b(ut1, ut13) / f)) / 2;
        int i = c + 7;
        int i2 = i & 3;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return i;
                }
                throw C9349rr1.a();
            }
            return c + 6;
        }
        return c + 8;
    }

    public static OC1 d(UT1 ut1, UT1 ut12, UT1 ut13, UT1 ut14, int i) {
        float c;
        float d;
        float f;
        float f2 = i - 3.5f;
        if (ut14 != null) {
            c = ut14.c();
            d = ut14.d();
            f = f2 - 3.0f;
        } else {
            c = (ut12.c() - ut1.c()) + ut13.c();
            d = (ut12.d() - ut1.d()) + ut13.d();
            f = f2;
        }
        return OC1.b(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, ut1.c(), ut1.d(), ut12.c(), ut12.d(), c, d, ut13.c(), ut13.d());
    }

    public static C2469An k(C2469An c2469An, OC1 oc1, int i) throws C9349rr1 {
        return SE0.b().d(c2469An, i, i, oc1);
    }

    public final float a(UT1 ut1, UT1 ut12, UT1 ut13) {
        return (b(ut1, ut12) + b(ut1, ut13)) / 2.0f;
    }

    public final float b(UT1 ut1, UT1 ut12) {
        float m = m((int) ut1.c(), (int) ut1.d(), (int) ut12.c(), (int) ut12.d());
        float m2 = m((int) ut12.c(), (int) ut12.d(), (int) ut1.c(), (int) ut1.d());
        if (Float.isNaN(m)) {
            return m2 / 7.0f;
        }
        if (Float.isNaN(m2)) {
            return m / 7.0f;
        }
        return (m + m2) / 14.0f;
    }

    public K20 e() throws C9349rr1, C2605Bx0 {
        return f(null);
    }

    public final K20 f(Map<XV, ?> map) throws C9349rr1, C2605Bx0 {
        VT1 vt1;
        if (map == null) {
            vt1 = null;
        } else {
            vt1 = (VT1) map.get(XV.NEED_RESULT_POINT_CALLBACK);
        }
        this.b = vt1;
        return j(new C10574wt0(this.a, vt1).f(map));
    }

    public final C8924q8 g(float f, int i, int i2, float f2) throws C9349rr1 {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.a.m() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.a.i() - 1, i2 + i3) - max2;
            if (min2 >= f3) {
                return new C9173r8(this.a, max, max2, min, min2, f, this.b).c();
            }
            throw C9349rr1.a();
        }
        throw C9349rr1.a();
    }

    public final C2469An h() {
        return this.a;
    }

    public final VT1 i() {
        return this.b;
    }

    public final K20 j(C10817xt0 c10817xt0) throws C9349rr1, C2605Bx0 {
        C8924q8 c8924q8;
        C10085ut0 b = c10817xt0.b();
        C10085ut0 c = c10817xt0.c();
        C10085ut0 a = c10817xt0.a();
        float a2 = a(b, c, a);
        if (a2 >= 1.0f) {
            int c2 = c(b, c, a, a2);
            WE2 g = WE2.g(c2);
            int e = g.e() - 7;
            if (g.d().length > 0) {
                float c3 = (c.c() - b.c()) + a.c();
                float d = (c.d() - b.d()) + a.d();
                float f = 1.0f - (3.0f / e);
                int c4 = (int) (b.c() + ((c3 - b.c()) * f));
                int d2 = (int) (b.d() + (f * (d - b.d())));
                for (int i = 4; i <= 16; i <<= 1) {
                    try {
                        c8924q8 = g(a2, c4, d2, i);
                        break;
                    } catch (C9349rr1 unused) {
                    }
                }
            }
            c8924q8 = null;
            return new K20(k(this.a, d(b, c, a, c8924q8, c2), c2), c8924q8 == null ? new UT1[]{a, b, c} : new UT1[]{a, b, c, c8924q8});
        }
        throw C9349rr1.a();
    }

    public final float l(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        J20 j20;
        int i13;
        boolean z3 = true;
        if (Math.abs(i4 - i2) > Math.abs(i3 - i)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int abs = Math.abs(i7 - i5);
        int abs2 = Math.abs(i8 - i6);
        int i14 = 2;
        int i15 = (-abs) / 2;
        int i16 = -1;
        if (i5 < i7) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        if (i6 < i8) {
            i16 = 1;
        }
        int i17 = i7 + i9;
        int i18 = i5;
        int i19 = i6;
        int i20 = 0;
        while (true) {
            if (i18 != i17) {
                if (z) {
                    i11 = i19;
                } else {
                    i11 = i18;
                }
                if (z) {
                    i12 = i18;
                } else {
                    i12 = i19;
                }
                boolean z4 = z;
                if (i20 == z3) {
                    z2 = z3;
                    i13 = abs;
                    j20 = this;
                } else {
                    z2 = false;
                    j20 = this;
                    i13 = abs;
                }
                if (z2 == j20.a.f(i11, i12)) {
                    if (i20 == 2) {
                        return C9044qd1.b(i18, i19, i5, i6);
                    }
                    i20++;
                }
                i15 += abs2;
                if (i15 > 0) {
                    if (i19 != i8) {
                        i19 += i16;
                        i15 -= i13;
                    } else {
                        i10 = 2;
                        break;
                    }
                }
                i18 += i9;
                abs = i13;
                z = z4;
                z3 = true;
                i14 = 2;
            } else {
                i10 = i14;
                break;
            }
        }
        if (i20 == i10) {
            return C9044qd1.b(i17, i8, i5, i6);
        }
        return Float.NaN;
    }

    public final float m(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float l = l(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else if (i5 >= this.a.m()) {
            f = ((this.a.m() - 1) - i) / (i5 - i);
            i5 = this.a.m() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = i2;
        int i7 = (int) (f3 - ((i4 - i2) * f));
        if (i7 < 0) {
            f2 = f3 / (i2 - i7);
        } else if (i7 >= this.a.i()) {
            f2 = ((this.a.i() - 1) - i2) / (i7 - i2);
            i6 = this.a.i() - 1;
        } else {
            i6 = i7;
            f2 = 1.0f;
        }
        return (l + l(i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
    }
}
