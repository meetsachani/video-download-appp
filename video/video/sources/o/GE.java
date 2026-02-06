package o;

import java.util.Map;

/* loaded from: classes3.dex */
public class GE extends AbstractC9851tv1 {
    @Deprecated
    public static int c(boolean[] zArr, int i, int[] iArr, boolean z) {
        return g(zArr, i, iArr);
    }

    public static int g(boolean[] zArr, int i, int[] iArr) {
        boolean z;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            if (iArr[i2] != 0) {
                z = true;
            } else {
                z = false;
            }
            zArr[i] = z;
            i2++;
            i = i3;
        }
        return 9;
    }

    public static int h(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += FE.c.indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    private static void i(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    @Override // o.AbstractC9851tv1, o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Map<EnumC9284rb0, ?> map) throws PN2 {
        if (enumC3839Ok == EnumC3839Ok.CODE_93) {
            return super.a(str, enumC3839Ok, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(enumC3839Ok)));
    }

    @Override // o.AbstractC9851tv1
    public boolean[] d(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            i(FE.e[47], iArr);
            boolean[] zArr = new boolean[((str.length() + 4) * 9) + 1];
            int g = g(zArr, 0, iArr);
            for (int i = 0; i < length; i++) {
                i(FE.e[FE.c.indexOf(str.charAt(i))], iArr);
                g += g(zArr, g, iArr);
            }
            int h = h(str, 20);
            int[] iArr2 = FE.e;
            i(iArr2[h], iArr);
            int g2 = g + g(zArr, g, iArr);
            i(iArr2[h(str + FE.c.charAt(h), 15)], iArr);
            int g3 = g2 + g(zArr, g2, iArr);
            i(iArr2[47], iArr);
            zArr[g3 + g(zArr, g3, iArr)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
