package o;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class WK1 implements DO1 {
    public static final UT1[] b = new UT1[0];
    public final C8045mW a = new C8045mW();

    private static C2469An e(C2469An c2469An) throws C9349rr1 {
        int[] l = c2469An.l();
        int[] g = c2469An.g();
        if (l != null && g != null) {
            float g2 = g(l, c2469An);
            int i = l[1];
            int i2 = g[1];
            int i3 = l[0];
            int i4 = g[0];
            if (i3 < i4 && i < i2) {
                int i5 = i2 - i;
                if (i5 != i4 - i3 && (i4 = i3 + i5) >= c2469An.m()) {
                    throw C9349rr1.a();
                }
                int round = Math.round(((i4 - i3) + 1) / g2);
                int round2 = Math.round((i5 + 1) / g2);
                if (round > 0 && round2 > 0) {
                    if (round2 == round) {
                        int i6 = (int) (g2 / 2.0f);
                        int i7 = i + i6;
                        int i8 = i3 + i6;
                        int i9 = (((int) ((round - 1) * g2)) + i8) - i4;
                        if (i9 > 0) {
                            if (i9 <= i6) {
                                i8 -= i9;
                            } else {
                                throw C9349rr1.a();
                            }
                        }
                        int i10 = (((int) ((round2 - 1) * g2)) + i7) - i2;
                        if (i10 > 0) {
                            if (i10 <= i6) {
                                i7 -= i10;
                            } else {
                                throw C9349rr1.a();
                            }
                        }
                        C2469An c2469An2 = new C2469An(round, round2);
                        for (int i11 = 0; i11 < round2; i11++) {
                            int i12 = ((int) (i11 * g2)) + i7;
                            for (int i13 = 0; i13 < round; i13++) {
                                if (c2469An.f(((int) (i13 * g2)) + i8, i12)) {
                                    c2469An2.q(i13, i11);
                                }
                            }
                        }
                        return c2469An2;
                    }
                    throw C9349rr1.a();
                }
                throw C9349rr1.a();
            }
            throw C9349rr1.a();
        }
        throw C9349rr1.a();
    }

    public static float g(int[] iArr, C2469An c2469An) throws C9349rr1 {
        int i = c2469An.i();
        int m = c2469An.m();
        int i2 = iArr[0];
        boolean z = true;
        int i3 = iArr[1];
        int i4 = 0;
        while (i2 < m && i3 < i) {
            if (z != c2469An.f(i2, i3)) {
                i4++;
                if (i4 == 5) {
                    break;
                }
                z = !z;
            }
            i2++;
            i3++;
        }
        if (i2 != m && i3 != i) {
            return (i2 - iArr[0]) / 7.0f;
        }
        throw C9349rr1.a();
    }

    @Override // o.DO1
    public QT1 c(C7120in c7120in) throws C9349rr1, UB, C2605Bx0 {
        return d(c7120in, null);
    }

    @Override // o.DO1
    public final QT1 d(C7120in c7120in, Map<XV, ?> map) throws C9349rr1, UB, C2605Bx0 {
        UT1[] b2;
        C9753tW c9753tW;
        if (map != null && map.containsKey(XV.PURE_BARCODE)) {
            c9753tW = this.a.c(e(c7120in.b()), map);
            b2 = b;
        } else {
            K20 f = new J20(c7120in.b()).f(map);
            C9753tW c = this.a.c(f.a(), map);
            b2 = f.b();
            c9753tW = c;
        }
        if (c9753tW.f() instanceof UK1) {
            ((UK1) c9753tW.f()).a(b2);
        }
        QT1 qt1 = new QT1(c9753tW.j(), c9753tW.g(), b2, EnumC3839Ok.QR_CODE);
        List<byte[]> a = c9753tW.a();
        if (a != null) {
            qt1.j(ST1.BYTE_SEGMENTS, a);
        }
        String b3 = c9753tW.b();
        if (b3 != null) {
            qt1.j(ST1.ERROR_CORRECTION_LEVEL, b3);
        }
        if (c9753tW.k()) {
            qt1.j(ST1.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(c9753tW.i()));
            qt1.j(ST1.STRUCTURED_APPEND_PARITY, Integer.valueOf(c9753tW.h()));
        }
        return qt1;
    }

    public final C8045mW f() {
        return this.a;
    }

    @Override // o.DO1
    public void reset() {
    }
}
