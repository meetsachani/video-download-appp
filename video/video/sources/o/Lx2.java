package o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class Lx2 extends Jx2 {
    public static final int a = 51;

    @Override // o.AbstractC9851tv1, o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Map<EnumC9284rb0, ?> map) throws PN2 {
        if (enumC3839Ok == EnumC3839Ok.UPC_E) {
            return super.a(str, enumC3839Ok, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(enumC3839Ok)));
    }

    @Override // o.AbstractC9851tv1
    public boolean[] d(String str) {
        int length = str.length();
        if (length != 7) {
            if (length == 8) {
                try {
                    if (!Ix2.i(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (C2605Bx0 unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                str = str + Ix2.r(Kx2.s(str));
            } catch (C2605Bx0 e) {
                throw new IllegalArgumentException(e);
            }
        }
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i = Kx2.m[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int c = AbstractC9851tv1.c(zArr, 0, Ix2.f, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit2 = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit2 += 10;
            }
            c += AbstractC9851tv1.c(zArr, c, Ix2.j[digit2], false);
        }
        AbstractC9851tv1.c(zArr, c, Ix2.h, false);
        return zArr;
    }
}
