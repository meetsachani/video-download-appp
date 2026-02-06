package o;

import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Gx2 {
    public static final int[] c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    public final int[] a = new int[4];
    public final StringBuilder b = new StringBuilder();

    public static int c(int i) throws C9349rr1 {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == c[i2]) {
                return i2;
            }
        }
        throw C9349rr1.a();
    }

    public static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r5.equals("90000") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String e(String str) {
        String str2;
        String valueOf;
        char c2 = 0;
        char charAt = str.charAt(0);
        if (charAt != '0') {
            if (charAt != '5') {
                str2 = "";
                if (charAt == '9') {
                    switch (str.hashCode()) {
                        case 54118329:
                            break;
                        case 54395376:
                            if (str.equals("99990")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 54395377:
                            if (str.equals("99991")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            return null;
                        case 1:
                            return "Used";
                        case 2:
                            return "0.00";
                    }
                }
            } else {
                str2 = "$";
            }
        } else {
            str2 = "£";
        }
        int parseInt = Integer.parseInt(str.substring(1));
        String valueOf2 = String.valueOf(parseInt / 100);
        int i = parseInt % 100;
        if (i < 10) {
            valueOf = "0".concat(String.valueOf(i));
        } else {
            valueOf = String.valueOf(i);
        }
        return str2 + valueOf2 + '.' + valueOf;
    }

    public static Map<ST1, Object> f(String str) {
        String e;
        if (str.length() != 5 || (e = e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ST1.class);
        enumMap.put((EnumMap) ST1.SUGGESTED_PRICE, (ST1) e);
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
        for (int i3 = 0; i3 < 5 && i < m; i3++) {
            int j = Ix2.j(c10792xn, iArr2, i, Ix2.j);
            sb.append((char) ((j % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (j >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = c10792xn.l(c10792xn.k(i));
            }
        }
        if (sb.length() == 5) {
            if (d(sb.toString()) == c(i2)) {
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
        Map<ST1, Object> f = f(sb2);
        float f2 = i;
        QT1 qt1 = new QT1(sb2, null, new UT1[]{new UT1((iArr[0] + iArr[1]) / 2.0f, f2), new UT1(a, f2)}, EnumC3839Ok.UPC_EAN_EXTENSION);
        if (f != null) {
            qt1.i(f);
        }
        return qt1;
    }
}
