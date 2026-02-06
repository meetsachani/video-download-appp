package o;

import java.util.List;
import java.util.Map;

/* renamed from: o.xU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10722xU implements DO1 {
    public static final UT1[] b = new UT1[0];
    public final C7541kW a = new C7541kW();

    public static C2469An a(C2469An c2469An) throws C9349rr1 {
        int[] l = c2469An.l();
        int[] g = c2469An.g();
        if (l != null && g != null) {
            int b2 = b(l, c2469An);
            int i = l[1];
            int i2 = g[1];
            int i3 = l[0];
            int i4 = ((g[0] - i3) + 1) / b2;
            int i5 = ((i2 - i) + 1) / b2;
            if (i4 > 0 && i5 > 0) {
                int i6 = b2 / 2;
                int i7 = i + i6;
                int i8 = i3 + i6;
                C2469An c2469An2 = new C2469An(i4, i5);
                for (int i9 = 0; i9 < i5; i9++) {
                    int i10 = (i9 * b2) + i7;
                    for (int i11 = 0; i11 < i4; i11++) {
                        if (c2469An.f((i11 * b2) + i8, i10)) {
                            c2469An2.q(i11, i9);
                        }
                    }
                }
                return c2469An2;
            }
            throw C9349rr1.a();
        }
        throw C9349rr1.a();
    }

    public static int b(int[] iArr, C2469An c2469An) throws C9349rr1 {
        int m = c2469An.m();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < m && c2469An.f(i, i2)) {
            i++;
        }
        if (i != m) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw C9349rr1.a();
        }
        throw C9349rr1.a();
    }

    @Override // o.DO1
    public QT1 c(C7120in c7120in) throws C9349rr1, UB, C2605Bx0 {
        return d(c7120in, null);
    }

    @Override // o.DO1
    public QT1 d(C7120in c7120in, Map<XV, ?> map) throws C9349rr1, UB, C2605Bx0 {
        UT1[] b2;
        C9753tW c9753tW;
        if (map != null && map.containsKey(XV.PURE_BARCODE)) {
            c9753tW = this.a.b(a(c7120in.b()));
            b2 = b;
        } else {
            K20 c = new H20(c7120in.b()).c();
            C9753tW b3 = this.a.b(c.a());
            b2 = c.b();
            c9753tW = b3;
        }
        QT1 qt1 = new QT1(c9753tW.j(), c9753tW.g(), b2, EnumC3839Ok.DATA_MATRIX);
        List<byte[]> a = c9753tW.a();
        if (a != null) {
            qt1.j(ST1.BYTE_SEGMENTS, a);
        }
        String b4 = c9753tW.b();
        if (b4 != null) {
            qt1.j(ST1.ERROR_CORRECTION_LEVEL, b4);
        }
        return qt1;
    }

    @Override // o.DO1
    public void reset() {
    }
}
