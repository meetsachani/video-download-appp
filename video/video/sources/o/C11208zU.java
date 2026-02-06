package o;

import java.util.Map;

/* renamed from: o.zU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11208zU implements ON2 {
    public static C2469An c(C5672cs c5672cs, int i, int i2) {
        C2469An c2469An;
        int e = c5672cs.e();
        int d = c5672cs.d();
        int max = Math.max(i, e);
        int max2 = Math.max(i2, d);
        int min = Math.min(max / e, max2 / d);
        int i3 = (max - (e * min)) / 2;
        int i4 = (max2 - (d * min)) / 2;
        if (i2 >= d && i >= e) {
            c2469An = new C2469An(i, i2);
        } else {
            c2469An = new C2469An(e, d);
            i3 = 0;
            i4 = 0;
        }
        c2469An.c();
        int i5 = 0;
        while (i5 < d) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < e) {
                if (c5672cs.b(i7, i5) == 1) {
                    c2469An.r(i6, i4, min, min);
                }
                i7++;
                i6 += min;
            }
            i5++;
            i4 += min;
        }
        return c2469An;
    }

    public static C2469An d(C6434g00 c6434g00, C7835lj2 c7835lj2, int i, int i2) {
        boolean z;
        boolean z2;
        int i3 = c7835lj2.i();
        int h = c7835lj2.h();
        C5672cs c5672cs = new C5672cs(c7835lj2.k(), c7835lj2.j());
        int i4 = 0;
        for (int i5 = 0; i5 < h; i5++) {
            if (i5 % c7835lj2.e == 0) {
                int i6 = 0;
                for (int i7 = 0; i7 < c7835lj2.k(); i7++) {
                    if (i7 % 2 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c5672cs.h(i6, i4, z2);
                    i6++;
                }
                i4++;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < i3; i9++) {
                if (i9 % c7835lj2.d == 0) {
                    c5672cs.h(i8, i4, true);
                    i8++;
                }
                c5672cs.h(i8, i4, c6434g00.e(i9, i5));
                int i10 = i8 + 1;
                int i11 = c7835lj2.d;
                if (i9 % i11 == i11 - 1) {
                    if (i5 % 2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c5672cs.h(i10, i4, z);
                    i8 += 2;
                } else {
                    i8 = i10;
                }
            }
            int i12 = i4 + 1;
            int i13 = c7835lj2.e;
            if (i5 % i13 == i13 - 1) {
                int i14 = 0;
                for (int i15 = 0; i15 < c7835lj2.k(); i15++) {
                    c5672cs.h(i14, i12, true);
                    i14++;
                }
                i4 += 2;
            } else {
                i4 = i12;
            }
        }
        return c(c5672cs, i, i2);
    }

    @Override // o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Map<EnumC9284rb0, ?> map) {
        C9883u30 c9883u30;
        if (!str.isEmpty()) {
            if (enumC3839Ok == EnumC3839Ok.DATA_MATRIX) {
                if (i >= 0 && i2 >= 0) {
                    EnumC8096mj2 enumC8096mj2 = EnumC8096mj2.FORCE_NONE;
                    C9883u30 c9883u302 = null;
                    if (map != null) {
                        EnumC8096mj2 enumC8096mj22 = (EnumC8096mj2) map.get(EnumC9284rb0.DATA_MATRIX_SHAPE);
                        if (enumC8096mj22 != null) {
                            enumC8096mj2 = enumC8096mj22;
                        }
                        C9883u30 c9883u303 = (C9883u30) map.get(EnumC9284rb0.MIN_SIZE);
                        if (c9883u303 == null) {
                            c9883u303 = null;
                        }
                        c9883u30 = (C9883u30) map.get(EnumC9284rb0.MAX_SIZE);
                        if (c9883u30 == null) {
                            c9883u30 = null;
                        }
                        c9883u302 = c9883u303;
                    } else {
                        c9883u30 = null;
                    }
                    String c = KH0.c(str, enumC8096mj2, c9883u302, c9883u30);
                    C7835lj2 o2 = C7835lj2.o(c.length(), enumC8096mj2, c9883u302, c9883u30, true);
                    C6434g00 c6434g00 = new C6434g00(C7813le0.c(c, o2), o2.i(), o2.h());
                    c6434g00.k();
                    return d(c6434g00, o2, i, i2);
                }
                throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
            }
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(enumC3839Ok)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    @Override // o.ON2
    public C2469An b(String str, EnumC3839Ok enumC3839Ok, int i, int i2) {
        return a(str, enumC3839Ok, i, i2, null);
    }
}
