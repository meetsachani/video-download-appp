package o;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class KH0 {
    public static final char a = 129;
    public static final char b = 230;
    public static final char c = 231;
    public static final char d = 235;
    public static final char e = 236;
    public static final char f = 237;
    public static final char g = 238;
    public static final char h = 239;
    public static final char i = 240;
    public static final char j = 254;
    public static final char k = 254;
    public static final String l = "[)>\u001e05\u001d";
    public static final String m = "[)>\u001e06\u001d";
    public static final String n = "\u001e\u0004";

    /* renamed from: o  reason: collision with root package name */
    public static final int f513o = 0;
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 3;
    public static final int s = 4;
    public static final int t = 5;

    public static int a(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        if (i2 < length) {
            char charAt = charSequence.charAt(i2);
            while (g(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
        }
        return i3;
    }

    public static String b(String str) {
        return c(str, EnumC8096mj2.FORCE_NONE, null, null);
    }

    public static String c(String str, EnumC8096mj2 enumC8096mj2, C9883u30 c9883u30, C9883u30 c9883u302) {
        int i2 = 0;
        InterfaceC2618Cb0[] interfaceC2618Cb0Arr = {new F(), new C11055ys(), new C11277zm2(), new TN2(), new C90(), new C4618Wk()};
        C3021Gb0 c3021Gb0 = new C3021Gb0(str);
        c3021Gb0.o(enumC8096mj2);
        c3021Gb0.m(c9883u30, c9883u302);
        if (str.startsWith(l) && str.endsWith(n)) {
            c3021Gb0.s(e);
            c3021Gb0.n(2);
            c3021Gb0.f += 7;
        } else if (str.startsWith(m) && str.endsWith(n)) {
            c3021Gb0.s(f);
            c3021Gb0.n(2);
            c3021Gb0.f += 7;
        }
        while (c3021Gb0.j()) {
            interfaceC2618Cb0Arr[i2].a(c3021Gb0);
            if (c3021Gb0.f() >= 0) {
                i2 = c3021Gb0.f();
                c3021Gb0.k();
            }
        }
        int a2 = c3021Gb0.a();
        c3021Gb0.q();
        int b2 = c3021Gb0.h().b();
        if (a2 < b2 && i2 != 0 && i2 != 5 && i2 != 4) {
            c3021Gb0.s((char) 254);
        }
        StringBuilder b3 = c3021Gb0.b();
        if (b3.length() < b2) {
            b3.append(a);
        }
        while (b3.length() < b2) {
            b3.append(p(a, b3.length() + 1));
        }
        return c3021Gb0.b().toString();
    }

    public static int d(float[] fArr, int[] iArr, int i2, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i3 = 0; i3 < 6; i3++) {
            int ceil = (int) Math.ceil(fArr[i3]);
            iArr[i3] = ceil;
            if (i2 > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i2 = ceil;
            }
            if (i2 == ceil) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    public static int e(byte[] bArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 += bArr[i3];
        }
        return i2;
    }

    public static void f(char c2) {
        String hexString;
        throw new IllegalArgumentException("Illegal character: " + c2 + " (0x" + ("0000".substring(0, 4 - hexString.length()) + Integer.toHexString(c2)) + ')');
    }

    public static boolean g(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return true;
        }
        return false;
    }

    public static boolean h(char c2) {
        if (c2 >= 128 && c2 <= 255) {
            return true;
        }
        return false;
    }

    public static boolean i(char c2) {
        if (c2 != ' ') {
            if (c2 < '0' || c2 > '9') {
                if (c2 < 'A' || c2 > 'Z') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static boolean j(char c2) {
        if (c2 >= ' ' && c2 <= '^') {
            return true;
        }
        return false;
    }

    public static boolean k(char c2) {
        if (c2 != ' ') {
            if (c2 < '0' || c2 > '9') {
                if (c2 < 'a' || c2 > 'z') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static boolean l(char c2) {
        if (!n(c2) && c2 != ' ') {
            if (c2 < '0' || c2 > '9') {
                if (c2 < 'A' || c2 > 'Z') {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static boolean m(char c2) {
        return false;
    }

    public static boolean n(char c2) {
        if (c2 != '\r' && c2 != '*' && c2 != '>') {
            return false;
        }
        return true;
    }

    public static int o(CharSequence charSequence, int i2, int i3) {
        float[] fArr;
        float f2;
        int i4;
        if (i2 >= charSequence.length()) {
            return i3;
        }
        float f3 = 2.0f;
        float f4 = 1.0f;
        int i5 = 5;
        if (i3 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i3] = 0.0f;
        }
        int i6 = 0;
        while (true) {
            int i7 = i2 + i6;
            if (i7 == charSequence.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int d2 = d(fArr, iArr, Integer.MAX_VALUE, bArr);
                int e2 = e(bArr);
                if (iArr[0] == d2) {
                    return 0;
                }
                if (e2 == 1 && bArr[i5] > 0) {
                    return i5;
                }
                if (e2 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (e2 == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (e2 == 1 && bArr[3] > 0) {
                    return 3;
                }
                return 1;
            }
            char charAt = charSequence.charAt(i7);
            i6++;
            if (g(charAt)) {
                fArr[0] = fArr[0] + 0.5f;
                f2 = f4;
                i4 = i5;
            } else if (h(charAt)) {
                f2 = f4;
                i4 = i5;
                float ceil = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + f3;
            } else {
                f2 = f4;
                i4 = i5;
                float ceil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + f2;
            }
            if (i(charAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (h(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (k(charAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (h(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (l(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (h(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (j(charAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (h(charAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (m(charAt)) {
                fArr[i4] = fArr[i4] + 4.0f;
            } else {
                fArr[i4] = fArr[i4] + f2;
            }
            if (i6 >= 4) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                d(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int e3 = e(bArr2);
                int i8 = iArr2[0];
                int i9 = iArr2[i4];
                if (i8 < i9 && i8 < iArr2[1] && i8 < iArr2[2] && i8 < iArr2[3] && i8 < iArr2[4]) {
                    return 0;
                }
                if (i9 < i8) {
                    break;
                }
                byte b2 = bArr2[1];
                byte b3 = bArr2[2];
                byte b4 = bArr2[3];
                byte b5 = bArr2[4];
                if (b2 + b3 + b4 + b5 == 0) {
                    break;
                } else if (e3 == 1 && b5 > 0) {
                    return 4;
                } else {
                    if (e3 == 1 && b3 > 0) {
                        return 2;
                    }
                    if (e3 == 1 && b4 > 0) {
                        return 3;
                    }
                    int i10 = iArr2[1];
                    if (i10 + 1 < i8 && i10 + 1 < i9 && i10 + 1 < iArr2[4] && i10 + 1 < iArr2[2]) {
                        int i11 = iArr2[3];
                        if (i10 < i11) {
                            return 1;
                        }
                        if (i10 == i11) {
                            for (int i12 = i2 + i6 + 1; i12 < charSequence.length(); i12++) {
                                char charAt2 = charSequence.charAt(i12);
                                if (n(charAt2)) {
                                    return 3;
                                }
                                if (!l(charAt2)) {
                                    break;
                                }
                            }
                            return 1;
                        }
                    }
                }
            }
            f4 = f2;
            i5 = i4;
            f3 = 2.0f;
        }
        return i4;
    }

    public static char p(char c2, int i2) {
        int i3 = c2 + ((i2 * 149) % 253) + 1;
        if (i3 > 254) {
            i3 -= 254;
        }
        return (char) i3;
    }
}
