package o;

import java.util.Map;

/* renamed from: o.tv1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9851tv1 implements ON2 {
    public static int c(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    public static C2469An f(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        C2469An c2469An = new C2469An(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                c2469An.r(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return c2469An;
    }

    @Override // o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Map<EnumC9284rb0, ?> map) throws PN2 {
        if (!str.isEmpty()) {
            if (i >= 0 && i2 >= 0) {
                int e = e();
                if (map != null) {
                    EnumC9284rb0 enumC9284rb0 = EnumC9284rb0.MARGIN;
                    if (map.containsKey(enumC9284rb0)) {
                        e = Integer.parseInt(map.get(enumC9284rb0).toString());
                    }
                }
                return f(d(str), i, i2, e);
            }
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    @Override // o.ON2
    public final C2469An b(String str, EnumC3839Ok enumC3839Ok, int i, int i2) throws PN2 {
        return a(str, enumC3839Ok, i, i2, null);
    }

    public abstract boolean[] d(String str);

    public int e() {
        return 10;
    }
}
