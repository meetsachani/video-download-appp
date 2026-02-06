package o;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* renamed from: o.dk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5883dk implements ON2 {
    public static C2469An c(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Charset charset, int i3, int i4) {
        if (enumC3839Ok == EnumC3839Ok.AZTEC) {
            return d(C2520Bb0.e(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(enumC3839Ok)));
    }

    public static C2469An d(C5155ak c5155ak, int i, int i2) {
        C2469An c = c5155ak.c();
        if (c != null) {
            int m = c.m();
            int i3 = c.i();
            int max = Math.max(i, m);
            int max2 = Math.max(i2, i3);
            int min = Math.min(max / m, max2 / i3);
            int i4 = (max - (m * min)) / 2;
            int i5 = (max2 - (i3 * min)) / 2;
            C2469An c2469An = new C2469An(max, max2);
            int i6 = 0;
            while (i6 < i3) {
                int i7 = 0;
                int i8 = i4;
                while (i7 < m) {
                    if (c.f(i7, i6)) {
                        c2469An.r(i8, i5, min, min);
                    }
                    i7++;
                    i8 += min;
                }
                i6++;
                i5 += min;
            }
            return c2469An;
        }
        throw new IllegalStateException();
    }

    @Override // o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Map<EnumC9284rb0, ?> map) {
        Charset charset = StandardCharsets.ISO_8859_1;
        int i3 = 33;
        int i4 = 0;
        if (map != null) {
            EnumC9284rb0 enumC9284rb0 = EnumC9284rb0.CHARACTER_SET;
            if (map.containsKey(enumC9284rb0)) {
                charset = Charset.forName(map.get(enumC9284rb0).toString());
            }
            EnumC9284rb0 enumC9284rb02 = EnumC9284rb0.ERROR_CORRECTION;
            if (map.containsKey(enumC9284rb02)) {
                i3 = Integer.parseInt(map.get(enumC9284rb02).toString());
            }
            EnumC9284rb0 enumC9284rb03 = EnumC9284rb0.AZTEC_LAYERS;
            if (map.containsKey(enumC9284rb03)) {
                i4 = Integer.parseInt(map.get(enumC9284rb03).toString());
            }
        }
        return c(str, enumC3839Ok, i, i2, charset, i3, i4);
    }

    @Override // o.ON2
    public C2469An b(String str, EnumC3839Ok enumC3839Ok, int i, int i2) {
        return a(str, enumC3839Ok, i, i2, null);
    }
}
