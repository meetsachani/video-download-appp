package o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class EE extends AbstractC9851tv1 {
    public static void g(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    public static String h(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt != '@') {
                        if (charAt != '`') {
                            if (charAt != '-' && charAt != '.') {
                                if (charAt <= 26) {
                                    sb.append('$');
                                    sb.append((char) (charAt + C11304zt1.a));
                                } else if (charAt < ' ') {
                                    sb.append('%');
                                    sb.append((char) (charAt + '&'));
                                } else if (charAt > ',' && charAt != '/' && charAt != ':') {
                                    if (charAt <= '9') {
                                        sb.append(charAt);
                                    } else if (charAt <= '?') {
                                        sb.append('%');
                                        sb.append((char) (charAt + 11));
                                    } else if (charAt <= 'Z') {
                                        sb.append(charAt);
                                    } else if (charAt <= '_') {
                                        sb.append('%');
                                        sb.append((char) (charAt + C5588cW.a));
                                    } else if (charAt <= 'z') {
                                        sb.append('+');
                                        sb.append((char) (charAt - ' '));
                                    } else if (charAt <= 127) {
                                        sb.append('%');
                                        sb.append((char) (charAt - '+'));
                                    } else {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i) + "'");
                                    }
                                } else {
                                    sb.append('/');
                                    sb.append((char) (charAt + ' '));
                                }
                            }
                        } else {
                            sb.append("%W");
                        }
                    } else {
                        sb.append("%V");
                    }
                }
                sb.append(charAt);
            } else {
                sb.append("%U");
            }
        }
        return sb.toString();
    }

    @Override // o.AbstractC9851tv1, o.ON2
    public C2469An a(String str, EnumC3839Ok enumC3839Ok, int i, int i2, Map<EnumC9284rb0, ?> map) throws PN2 {
        if (enumC3839Ok == EnumC3839Ok.CODE_39) {
            return super.a(str, enumC3839Ok, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(enumC3839Ok)));
    }

    @Override // o.AbstractC9851tv1
    public boolean[] d(String str) {
        int length = str.length();
        if (length <= 80) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (DE.e.indexOf(str.charAt(i)) < 0) {
                    str = h(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i++;
                }
            }
            int[] iArr = new int[9];
            int i2 = length + 25;
            for (int i3 = 0; i3 < length; i3++) {
                g(DE.f[DE.e.indexOf(str.charAt(i3))], iArr);
                for (int i4 = 0; i4 < 9; i4++) {
                    i2 += iArr[i4];
                }
            }
            boolean[] zArr = new boolean[i2];
            g(DE.g, iArr);
            int c = AbstractC9851tv1.c(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int c2 = c + AbstractC9851tv1.c(zArr, c, iArr2, false);
            for (int i5 = 0; i5 < length; i5++) {
                g(DE.f[DE.e.indexOf(str.charAt(i5))], iArr);
                int c3 = c2 + AbstractC9851tv1.c(zArr, c2, iArr, true);
                c2 = c3 + AbstractC9851tv1.c(zArr, c3, iArr2, false);
            }
            g(DE.g, iArr);
            AbstractC9851tv1.c(zArr, c2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
