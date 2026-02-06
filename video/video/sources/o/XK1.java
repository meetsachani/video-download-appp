package o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class XK1 implements ON2 {
    public static final int a = 4;

    public static C2469An c(TK1 tk1, int i, int i2, int i3) {
        C5672cs c = tk1.c();
        if (c != null) {
            int e = c.e();
            int d = c.d();
            int i4 = i3 << 1;
            int i5 = e + i4;
            int i6 = i4 + d;
            int max = Math.max(i, i5);
            int max2 = Math.max(i2, i6);
            int min = Math.min(max / i5, max2 / i6);
            int i7 = (max - (e * min)) / 2;
            int i8 = (max2 - (d * min)) / 2;
            C2469An c2469An = new C2469An(max, max2);
            int i9 = 0;
            while (i9 < d) {
                int i10 = 0;
                int i11 = i7;
                while (i10 < e) {
                    if (c.b(i10, i9) == 1) {
                        c2469An.r(i11, i8, min, min);
                    }
                    i10++;
                    i11 += min;
                }
                i9++;
                i8 += min;
            }
            return c2469An;
        }
        throw new IllegalStateException();
    }

    @Override // o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Map<EnumC9284rb0, ?> map) throws PN2 {
        if (!str.isEmpty()) {
            if (enumC3839Ok == EnumC3839Ok.QR_CODE) {
                if (i >= 0 && i2 >= 0) {
                    EnumC8074me0 enumC8074me0 = EnumC8074me0.L;
                    int i3 = 4;
                    if (map != null) {
                        EnumC9284rb0 enumC9284rb0 = EnumC9284rb0.ERROR_CORRECTION;
                        if (map.containsKey(enumC9284rb0)) {
                            enumC8074me0 = EnumC8074me0.valueOf(map.get(enumC9284rb0).toString());
                        }
                        EnumC9284rb0 enumC9284rb02 = EnumC9284rb0.MARGIN;
                        if (map.containsKey(enumC9284rb02)) {
                            i3 = Integer.parseInt(map.get(enumC9284rb02).toString());
                        }
                    }
                    return c(C2716Db0.p(str, enumC8074me0, map), i, i2, i3);
                }
                throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
            }
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(enumC3839Ok)));
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    @Override // o.ON2
    public C2469An b(String str, EnumC3839Ok enumC3839Ok, int i, int i2) throws PN2 {
        return a(str, enumC3839Ok, i, i2, null);
    }
}
