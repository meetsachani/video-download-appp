package o;

import java.util.Map;

/* renamed from: o.c90  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5499c90 extends Jx2 {
    public static final int a = 95;

    @Override // o.AbstractC9851tv1, o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Map<EnumC9284rb0, ?> map) throws PN2 {
        if (enumC3839Ok == EnumC3839Ok.EAN_13) {
            return super.a(str, enumC3839Ok, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(enumC3839Ok)));
    }

    @Override // o.AbstractC9851tv1
    public boolean[] d(String str) {
        int length = str.length();
        if (length != 12) {
            if (length == 13) {
                try {
                    if (!Ix2.i(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (C2605Bx0 unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                str = str + Ix2.r(str);
            } catch (C2605Bx0 e) {
                throw new IllegalArgumentException(e);
            }
        }
        int i = C5257b90.l[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int c = AbstractC9851tv1.c(zArr, 0, Ix2.f, true);
        for (int i2 = 1; i2 <= 6; i2++) {
            int digit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                digit += 10;
            }
            c += AbstractC9851tv1.c(zArr, c, Ix2.j[digit], false);
        }
        int c2 = c + AbstractC9851tv1.c(zArr, c, Ix2.g, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            c2 += AbstractC9851tv1.c(zArr, c2, Ix2.i[Character.digit(str.charAt(i3), 10)], true);
        }
        AbstractC9851tv1.c(zArr, c2, Ix2.f, true);
        return zArr;
    }
}
