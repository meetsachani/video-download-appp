package o;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
public final class DE extends AbstractC9608sv1 {
    public static final String e = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";
    public static final int[] f = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, C9276rZ.q, 82, 7, 262, 70, 22, 385, C8463oE0.u, 448, C3503Kz.i0, 400, 208, C3503Kz.W, 388, 196, 168, 162, 138, 42};
    public static final int g = 148;
    public final boolean a;
    public final boolean b;
    public final StringBuilder c;
    public final int[] d;

    public DE() {
        this(false);
    }

    public static String h(CharSequence charSequence) throws C2605Bx0 {
        int i;
        char c;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt != '+' && charAt != '$' && charAt != '%' && charAt != '/') {
                sb.append(charAt);
            } else {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    c = ':';
                                    sb.append(c);
                                } else {
                                    throw C2605Bx0.a();
                                }
                            }
                            c = 0;
                            sb.append(c);
                        } else if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i = charAt2 + ' ';
                        } else {
                            throw C2605Bx0.a();
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i = charAt2 + C5588cW.f;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i = charAt2 + 16;
                    } else if (charAt2 >= 'P' && charAt2 <= 'T') {
                        i = charAt2 + '+';
                    } else {
                        if (charAt2 != 'U') {
                            if (charAt2 == 'V') {
                                c = C11304zt1.a;
                            } else if (charAt2 == 'W') {
                                c = '`';
                            } else if (charAt2 != 'X' && charAt2 != 'Y' && charAt2 != 'Z') {
                                throw C2605Bx0.a();
                            } else {
                                c = C8077mf.N;
                            }
                            sb.append(c);
                        }
                        c = 0;
                        sb.append(c);
                    }
                } else if (charAt2 >= 'A' && charAt2 <= 'Z') {
                    i = charAt2 - '@';
                } else {
                    throw C2605Bx0.a();
                }
                c = (char) i;
                sb.append(c);
            }
            i2++;
        }
        return sb.toString();
    }

    public static int[] i(C10792xn c10792xn, int[] iArr) throws C9349rr1 {
        int m = c10792xn.m();
        int k = c10792xn.k(0);
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = k;
        while (k < m) {
            if (c10792xn.i(k) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == length - 1) {
                    if (k(iArr) == 148 && c10792xn.o(Math.max(0, i2 - ((k - i2) / 2)), i2, false)) {
                        return new int[]{i2, k};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                } else {
                    i++;
                }
                iArr[i] = 1;
                z = !z;
            }
            k++;
        }
        throw C9349rr1.a();
    }

    public static char j(int i) throws C9349rr1 {
        int i2 = 0;
        while (true) {
            int[] iArr = f;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return e.charAt(i2);
                }
                i2++;
            } else if (i == 148) {
                return '*';
            } else {
                throw C9349rr1.a();
            }
        }
    }

    public static int k(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    @Override // o.AbstractC9608sv1
    public QT1 a(int i, C10792xn c10792xn, Map<XV, ?> map) throws C9349rr1, UB, C2605Bx0 {
        int[] i2;
        String sb;
        int[] iArr = this.d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.c;
        sb2.setLength(0);
        int k = c10792xn.k(i(c10792xn, iArr)[1]);
        int m = c10792xn.m();
        while (true) {
            AbstractC9608sv1.f(c10792xn, k, iArr);
            int k2 = k(iArr);
            if (k2 >= 0) {
                char j = j(k2);
                sb2.append(j);
                int i3 = k;
                for (int i4 : iArr) {
                    i3 += i4;
                }
                int k3 = c10792xn.k(i3);
                if (j == '*') {
                    sb2.setLength(sb2.length() - 1);
                    int i5 = 0;
                    for (int i6 : iArr) {
                        i5 += i6;
                    }
                    int i7 = (k3 - k) - i5;
                    if (k3 != m && (i7 << 1) < i5) {
                        throw C9349rr1.a();
                    }
                    if (this.a) {
                        int length = sb2.length() - 1;
                        int i8 = 0;
                        for (int i9 = 0; i9 < length; i9++) {
                            i8 += e.indexOf(this.c.charAt(i9));
                        }
                        if (sb2.charAt(length) == e.charAt(i8 % 43)) {
                            sb2.setLength(length);
                        } else {
                            throw UB.a();
                        }
                    }
                    if (sb2.length() != 0) {
                        if (this.b) {
                            sb = h(sb2);
                        } else {
                            sb = sb2.toString();
                        }
                        float f2 = i;
                        return new QT1(sb, null, new UT1[]{new UT1((i2[1] + i2[0]) / 2.0f, f2), new UT1(k + (i5 / 2.0f), f2)}, EnumC3839Ok.CODE_39);
                    }
                    throw C9349rr1.a();
                }
                k = k3;
            } else {
                throw C9349rr1.a();
            }
        }
    }

    public DE(boolean z) {
        this(z, false);
    }

    public DE(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = new StringBuilder(20);
        this.d = new int[9];
    }
}
