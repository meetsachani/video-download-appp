package o;

import com.facebook.internal.C2372q;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.messaging.ServiceStarter;
import java.util.Arrays;
import java.util.Map;
import o.InterfaceC8148mw2;

/* loaded from: classes3.dex */
public final class FE extends AbstractC9608sv1 {
    public static final String c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
    public static final char[] d = c.toCharArray();
    public static final int[] e;
    public static final int f;
    public final StringBuilder a = new StringBuilder(20);
    public final int[] b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, C9276rZ.q, 266, InterfaceC8148mw2.c.v, InterfaceC8148mw2.c.r, 418, ServiceStarter.g, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, C9196rD2.c, 428, InterfaceC8148mw2.c.t, 406, 410, 364, 358, 310, 314, 302, 468, 466, C2372q.p, 366, 374, 430, 294, 474, FloatingActionButton.x1, 306, 350};
        e = iArr;
        f = iArr[47];
    }

    public static void h(CharSequence charSequence) throws UB {
        int length = charSequence.length();
        i(charSequence, length - 2, 20);
        i(charSequence, length - 1, 15);
    }

    public static void i(CharSequence charSequence, int i, int i2) throws UB {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += c.indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) == d[i3 % 47]) {
            return;
        }
        throw UB.a();
    }

    private static String j(CharSequence charSequence) throws C2605Bx0 {
        int i;
        char c2;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt >= 'a' && charAt <= 'd') {
                if (i2 < length - 1) {
                    i2++;
                    char charAt2 = charSequence.charAt(i2);
                    switch (charAt) {
                        case 'a':
                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                i = charAt2 - '@';
                                c2 = (char) i;
                                break;
                            } else {
                                throw C2605Bx0.a();
                            }
                            break;
                        case 'b':
                            if (charAt2 >= 'A' && charAt2 <= 'E') {
                                i = charAt2 - '&';
                            } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                                i = charAt2 + C5588cW.f;
                            } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                                i = charAt2 + 16;
                            } else if (charAt2 >= 'P' && charAt2 <= 'S') {
                                i = charAt2 + '+';
                            } else if (charAt2 >= 'T' && charAt2 <= 'Z') {
                                c2 = C8077mf.N;
                                break;
                            } else {
                                throw C2605Bx0.a();
                            }
                            c2 = (char) i;
                            break;
                        case 'c':
                            if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i = charAt2 - ' ';
                                c2 = (char) i;
                                break;
                            } else if (charAt2 == 'Z') {
                                c2 = ':';
                                break;
                            } else {
                                throw C2605Bx0.a();
                            }
                        case 'd':
                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                i = charAt2 + ' ';
                                c2 = (char) i;
                                break;
                            } else {
                                throw C2605Bx0.a();
                            }
                        default:
                            c2 = 0;
                            break;
                    }
                    sb.append(c2);
                } else {
                    throw C2605Bx0.a();
                }
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    private static char l(int i) throws C9349rr1 {
        int i2 = 0;
        while (true) {
            int[] iArr = e;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return d[i2];
                }
                i2++;
            } else {
                throw C9349rr1.a();
            }
        }
    }

    public static int m(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((iArr[i4] * 9.0f) / i);
            if (round > 0 && round <= 4) {
                if ((i4 & 1) == 0) {
                    for (int i5 = 0; i5 < round; i5++) {
                        i3 = (i3 << 1) | 1;
                    }
                } else {
                    i3 <<= round;
                }
            } else {
                return -1;
            }
        }
        return i3;
    }

    @Override // o.AbstractC9608sv1
    public QT1 a(int i, C10792xn c10792xn, Map<XV, ?> map) throws C9349rr1, UB, C2605Bx0 {
        int[] k;
        int k2 = c10792xn.k(k(c10792xn)[1]);
        int m = c10792xn.m();
        int[] iArr = this.b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.a;
        sb.setLength(0);
        while (true) {
            AbstractC9608sv1.f(c10792xn, k2, iArr);
            int m2 = m(iArr);
            if (m2 >= 0) {
                char l = l(m2);
                sb.append(l);
                int i2 = k2;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int k3 = c10792xn.k(i2);
                if (l == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (k3 != m && c10792xn.i(k3)) {
                        if (sb.length() >= 2) {
                            h(sb);
                            sb.setLength(sb.length() - 2);
                            float f2 = i;
                            return new QT1(j(sb), null, new UT1[]{new UT1((k[1] + k[0]) / 2.0f, f2), new UT1(k2 + (i4 / 2.0f), f2)}, EnumC3839Ok.CODE_93);
                        }
                        throw C9349rr1.a();
                    }
                    throw C9349rr1.a();
                }
                k2 = k3;
            } else {
                throw C9349rr1.a();
            }
        }
    }

    public final int[] k(C10792xn c10792xn) throws C9349rr1 {
        int m = c10792xn.m();
        int k = c10792xn.k(0);
        Arrays.fill(this.b, 0);
        int[] iArr = this.b;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = k;
        while (k < m) {
            if (c10792xn.i(k) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == length - 1) {
                    if (m(iArr) == f) {
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
}
