package o;

import java.util.Map;

/* renamed from: o.e90  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5984e90 extends Jx2 {
    public static final int a = 67;

    @Override // o.AbstractC9851tv1, o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Map<EnumC9284rb0, ?> map) throws PN2 {
        if (enumC3839Ok == EnumC3839Ok.EAN_8) {
            return super.a(str, enumC3839Ok, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(enumC3839Ok)));
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
                str = str + Ix2.r(str);
            } catch (C2605Bx0 e) {
                throw new IllegalArgumentException(e);
            }
        }
        boolean[] zArr = new boolean[67];
        int c = AbstractC9851tv1.c(zArr, 0, Ix2.f, true);
        for (int i = 0; i <= 3; i++) {
            c += AbstractC9851tv1.c(zArr, c, Ix2.i[Character.digit(str.charAt(i), 10)], false);
        }
        int c2 = c + AbstractC9851tv1.c(zArr, c, Ix2.g, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            c2 += AbstractC9851tv1.c(zArr, c2, Ix2.i[Character.digit(str.charAt(i2), 10)], true);
        }
        AbstractC9851tv1.c(zArr, c2, Ix2.f, true);
        return zArr;
    }
}
