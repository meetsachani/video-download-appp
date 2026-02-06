package o;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Fx2 {
    public final int[] a = new int[4];
    public final StringBuilder b = new StringBuilder();

    public static Map<ST1, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ST1.class);
        enumMap.put((EnumMap) ST1.ISSUE_NUMBER, (ST1) Integer.valueOf(str));
        return enumMap;
    }

    public final int a(C10792xn c10792xn, int[] iArr, StringBuilder sb) throws C9349rr1 {
        int[] iArr2 = this.a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m = c10792xn.m();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < m; i3++) {
            int j = Ix2.j(c10792xn, iArr2, i, Ix2.j);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = c10792xn.l(c10792xn.k(i));
            }
        }
        if (sb.length() == 2) {
            if (Integer.parseInt(sb.toString()) % 4 == i2) {
                return i;
            }
            throw C9349rr1.a();
        }
        throw C9349rr1.a();
    }

    public QT1 b(int i, C10792xn c10792xn, int[] iArr) throws C9349rr1 {
        StringBuilder sb = this.b;
        sb.setLength(0);
        int a = a(c10792xn, iArr, sb);
        String sb2 = sb.toString();
        Map<ST1, Object> c = c(sb2);
        float f = i;
        QT1 qt1 = new QT1(sb2, null, new UT1[]{new UT1((iArr[0] + iArr[1]) / 2.0f, f), new UT1(a, f)}, EnumC3839Ok.UPC_EAN_EXTENSION);
        if (c != null) {
            qt1.i(c);
        }
        return qt1;
    }
}
