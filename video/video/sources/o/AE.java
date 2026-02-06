package o;

/* loaded from: classes3.dex */
public final class AE extends AbstractC9851tv1 {
    public static final char[] a;
    public static final char[] b = {'T', 'N', '*', C3599Ly1.i};
    public static final char[] c = {'/', ':', '+', '.'};
    public static final char d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        a = cArr;
        d = cArr[0];
    }

    @Override // o.AbstractC9851tv1
    public boolean[] d(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c2 = d;
            sb.append(c2);
            sb.append(str);
            sb.append(c2);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = a;
            boolean h = C11144zE.h(cArr, upperCase);
            boolean h2 = C11144zE.h(cArr, upperCase2);
            char[] cArr2 = b;
            boolean h3 = C11144zE.h(cArr2, upperCase);
            boolean h4 = C11144zE.h(cArr2, upperCase2);
            if (h) {
                if (!h2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (h3) {
                if (!h4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!h2 && !h4) {
                StringBuilder sb2 = new StringBuilder();
                char c3 = d;
                sb2.append(c3);
                sb2.append(str);
                sb2.append(c3);
                str = sb2.toString();
            } else {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (!Character.isDigit(str.charAt(i3)) && str.charAt(i3) != '-' && str.charAt(i3) != '$') {
                if (C11144zE.h(c, str.charAt(i3))) {
                    i2 += 10;
                } else {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
            } else {
                i2 += 9;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 != '*') {
                    if (upperCase3 != 'E') {
                        if (upperCase3 != 'N') {
                            if (upperCase3 == 'T') {
                                upperCase3 = 'A';
                            }
                        } else {
                            upperCase3 = 'B';
                        }
                    } else {
                        upperCase3 = 'D';
                    }
                } else {
                    upperCase3 = 'C';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = C11144zE.g;
                if (i6 < cArr3.length) {
                    if (upperCase3 == cArr3[i6]) {
                        i = C11144zE.h[i6];
                        break;
                    }
                    i6++;
                } else {
                    i = 0;
                    break;
                }
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) != 0 && i8 != 1) {
                    i8++;
                } else {
                    z = !z;
                    i7++;
                    i8 = 0;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
