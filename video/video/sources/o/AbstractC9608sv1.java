package o;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: o.sv1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9608sv1 implements DO1 {
    public static float e(int[] iArr, int[] iArr2, float f) {
        float f2;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = i;
        float f4 = f3 / i2;
        float f5 = f * f4;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f7 = iArr2[i4] * f4;
            float f8 = iArr[i4];
            if (f8 > f7) {
                f2 = f8 - f7;
            } else {
                f2 = f7 - f8;
            }
            if (f2 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f2;
        }
        return f6 / f3;
    }

    public static void f(C10792xn c10792xn, int i, int[] iArr) throws C9349rr1 {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int m = c10792xn.m();
        if (i < m) {
            boolean z = !c10792xn.i(i);
            while (i < m) {
                if (c10792xn.i(i) != z) {
                    iArr[i2] = iArr[i2] + 1;
                } else {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                }
                i++;
            }
            if (i2 != length) {
                if (i2 != length - 1 || i != m) {
                    throw C9349rr1.a();
                }
                return;
            }
            return;
        }
        throw C9349rr1.a();
    }

    public static void g(C10792xn c10792xn, int i, int[] iArr) throws C9349rr1 {
        int length = iArr.length;
        boolean i2 = c10792xn.i(i);
        while (i > 0 && length >= 0) {
            i--;
            if (c10792xn.i(i) != i2) {
                length--;
                i2 = !i2;
            }
        }
        if (length < 0) {
            f(c10792xn, i + 1, iArr);
            return;
        }
        throw C9349rr1.a();
    }

    public abstract QT1 a(int i, C10792xn c10792xn, Map<XV, ?> map) throws C9349rr1, UB, C2605Bx0;

    public final QT1 b(C7120in c7120in, Map<XV, ?> map) throws C9349rr1 {
        boolean z;
        int i;
        int i2;
        Map<XV, ?> map2;
        int i3;
        int i4;
        EnumMap enumMap = map;
        int e = c7120in.e();
        int d = c7120in.d();
        C10792xn c10792xn = new C10792xn(e);
        int i5 = 1;
        if (enumMap != null && enumMap.containsKey(XV.TRY_HARDER)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        } else {
            i = 5;
        }
        int max = Math.max(1, d >> i);
        if (z) {
            i2 = d;
        } else {
            i2 = 15;
        }
        int i6 = d / 2;
        int i7 = 0;
        while (i7 < i2) {
            int i8 = i7 + 1;
            int i9 = i8 / 2;
            if ((i7 & 1) != 0) {
                i9 = -i9;
            }
            int i10 = (i9 * max) + i6;
            if (i10 < 0 || i10 >= d) {
                break;
            }
            try {
                c10792xn = c7120in.c(i10, c10792xn);
                int i11 = 0;
                while (i11 < 2) {
                    if (i11 == i5) {
                        c10792xn.q();
                        if (enumMap != null) {
                            XV xv = XV.NEED_RESULT_POINT_CALLBACK;
                            if (enumMap.containsKey(xv)) {
                                EnumMap enumMap2 = new EnumMap(XV.class);
                                enumMap2.putAll(enumMap);
                                enumMap2.remove(xv);
                                enumMap = enumMap2;
                            }
                        }
                    }
                    try {
                        QT1 a = a(i10, c10792xn, enumMap);
                        if (i11 == i5) {
                            try {
                                a.j(ST1.ORIENTATION, 180);
                                UT1[] f = a.f();
                                if (f != null) {
                                    i4 = i5;
                                    float f2 = e;
                                    try {
                                        map2 = enumMap;
                                    } catch (FO1 unused) {
                                        map2 = enumMap;
                                    }
                                    try {
                                        i3 = e;
                                        try {
                                            f[0] = new UT1((f2 - f[0].c()) - 1.0f, f[0].d());
                                            f[i4] = new UT1((f2 - f[i4].c()) - 1.0f, f[i4].d());
                                        } catch (FO1 unused2) {
                                            continue;
                                            i11++;
                                            enumMap = map2;
                                            i5 = i4;
                                            e = i3;
                                        }
                                    } catch (FO1 unused3) {
                                        i3 = e;
                                        i11++;
                                        enumMap = map2;
                                        i5 = i4;
                                        e = i3;
                                    }
                                }
                            } catch (FO1 unused4) {
                                map2 = enumMap;
                                i3 = e;
                                i4 = i5;
                            }
                        }
                        return a;
                    } catch (FO1 unused5) {
                        map2 = enumMap;
                        i3 = e;
                        i4 = i5;
                    }
                }
                continue;
            } catch (C9349rr1 unused6) {
            }
            i7 = i8;
            i5 = i5;
            e = e;
        }
        throw C9349rr1.a();
    }

    @Override // o.DO1
    public QT1 c(C7120in c7120in) throws C9349rr1, C2605Bx0 {
        return d(c7120in, null);
    }

    @Override // o.DO1
    public QT1 d(C7120in c7120in, Map<XV, ?> map) throws C9349rr1, C2605Bx0 {
        try {
            return b(c7120in, map);
        } catch (C9349rr1 e) {
            if (map != null && map.containsKey(XV.TRY_HARDER) && c7120in.g()) {
                C7120in h = c7120in.h();
                QT1 b = b(h, map);
                Map<ST1, Object> e2 = b.e();
                int i = C4731Xo.d1;
                if (e2 != null) {
                    ST1 st1 = ST1.ORIENTATION;
                    if (e2.containsKey(st1)) {
                        i = (((Integer) e2.get(st1)).intValue() + C4731Xo.d1) % 360;
                    }
                }
                b.j(ST1.ORIENTATION, Integer.valueOf(i));
                UT1[] f = b.f();
                if (f != null) {
                    int d = h.d();
                    for (int i2 = 0; i2 < f.length; i2++) {
                        f[i2] = new UT1((d - f[i2].d()) - 1.0f, f[i2].c());
                    }
                }
                return b;
            }
            throw e;
        }
    }

    @Override // o.DO1
    public void reset() {
    }
}
