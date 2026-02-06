package o;

import java.util.Map;

/* renamed from: o.Bd1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2529Bd1 implements DO1 {
    public static final UT1[] b = new UT1[0];
    public static final int c = 30;
    public static final int d = 33;
    public final C7784lW a = new C7784lW();

    private static C2469An a(C2469An c2469An) throws C9349rr1 {
        int[] h = c2469An.h();
        if (h != null) {
            int i = h[0];
            int i2 = h[1];
            int i3 = h[2];
            int i4 = h[3];
            C2469An c2469An2 = new C2469An(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (c2469An.f(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        c2469An2.q(i7, i5);
                    }
                }
            }
            return c2469An2;
        }
        throw C9349rr1.a();
    }

    @Override // o.DO1
    public QT1 c(C7120in c7120in) throws C9349rr1, UB, C2605Bx0 {
        return d(c7120in, null);
    }

    @Override // o.DO1
    public QT1 d(C7120in c7120in, Map<XV, ?> map) throws C9349rr1, UB, C2605Bx0 {
        if (map != null && map.containsKey(XV.PURE_BARCODE)) {
            C9753tW c2 = this.a.c(a(c7120in.b()), map);
            QT1 qt1 = new QT1(c2.j(), c2.g(), b, EnumC3839Ok.MAXICODE);
            String b2 = c2.b();
            if (b2 != null) {
                qt1.j(ST1.ERROR_CORRECTION_LEVEL, b2);
            }
            return qt1;
        }
        throw C9349rr1.a();
    }

    @Override // o.DO1
    public void reset() {
    }
}
