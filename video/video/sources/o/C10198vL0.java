package o;

import java.util.Map;

/* renamed from: o.vL0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10198vL0 extends AbstractC9851tv1 {
    public static final int c = 3;
    public static final int d = 1;
    public static final int[] a = {1, 1, 1, 1};
    public static final int[] b = {3, 1, 1};
    public static final int[][] e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // o.AbstractC9851tv1, o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Map<EnumC9284rb0, ?> map) throws PN2 {
        if (enumC3839Ok == EnumC3839Ok.ITF) {
            return super.a(str, enumC3839Ok, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(enumC3839Ok)));
    }

    @Override // o.AbstractC9851tv1
    public boolean[] d(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                boolean[] zArr = new boolean[(length * 9) + 9];
                int c2 = AbstractC9851tv1.c(zArr, 0, a, true);
                for (int i = 0; i < length; i += 2) {
                    int digit = Character.digit(str.charAt(i), 10);
                    int digit2 = Character.digit(str.charAt(i + 1), 10);
                    int[] iArr = new int[10];
                    for (int i2 = 0; i2 < 5; i2++) {
                        int i3 = i2 * 2;
                        int[][] iArr2 = e;
                        iArr[i3] = iArr2[digit][i2];
                        iArr[i3 + 1] = iArr2[digit2][i2];
                    }
                    c2 += AbstractC9851tv1.c(zArr, c2, iArr, true);
                }
                AbstractC9851tv1.c(zArr, c2, b, true);
                return zArr;
            }
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }
}
