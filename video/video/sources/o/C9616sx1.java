package o;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: o.sx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9616sx1 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 900;
    public static final int i = 901;
    public static final int j = 902;
    public static final int k = 913;
    public static final int l = 924;
    public static final int m = 925;
    public static final int n = 926;

    /* renamed from: o  reason: collision with root package name */
    public static final int f865o = 927;
    public static final byte[] r;
    public static final byte[] p = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, C3307Iz.Y, 13, 9, C3307Iz.d0, 58, 35, C3307Iz.e0, C3307Iz.f0, 36, 47, C3307Iz.c0, C3307Iz.X, 42, C4715Xk.i, 94, 0, 32, 0, 0, 0};
    public static final byte[] q = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, C3307Iz.V, 13, 9, C3307Iz.d0, 58, 10, C3307Iz.e0, C3307Iz.f0, 36, 47, 34, 124, 42, 40, C3307Iz.a0, ED2.a, 123, 125, C3307Iz.Z, 0};
    public static final byte[] s = new byte[128];
    public static final Charset t = StandardCharsets.ISO_8859_1;

    /* renamed from: o.sx1$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UG.values().length];
            a = iArr;
            try {
                iArr[UG.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UG.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[UG.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        r = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr2 = p;
            if (i3 >= bArr2.length) {
                break;
            }
            byte b2 = bArr2[i3];
            if (b2 > 0) {
                r[b2] = (byte) i3;
            }
            i3++;
        }
        Arrays.fill(s, (byte) -1);
        while (true) {
            byte[] bArr3 = q;
            if (i2 < bArr3.length) {
                byte b3 = bArr3[i2];
                if (b3 > 0) {
                    s[b3] = (byte) i2;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r1 - r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(String str, int i2, Charset charset) throws PN2 {
        int i3;
        CharsetEncoder newEncoder = charset.newEncoder();
        int length = str.length();
        int i4 = i2;
        while (i4 < length) {
            char charAt = str.charAt(i4);
            int i5 = 0;
            while (i5 < 13 && k(charAt) && (i3 = i4 + (i5 = i5 + 1)) < length) {
                charAt = str.charAt(i3);
            }
            char charAt2 = str.charAt(i4);
            if (newEncoder.canEncode(charAt2)) {
                i4++;
            } else {
                throw new PN2("Non-encodable character detected: " + charAt2 + " (Unicode: " + ((int) charAt2) + ')');
            }
        }
        return i4 - i2;
    }

    public static int b(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        if (i2 < length) {
            char charAt = charSequence.charAt(i2);
            while (k(charAt) && i2 < length) {
                i3++;
                i2++;
                if (i2 < length) {
                    charAt = charSequence.charAt(i2);
                }
            }
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        return (r1 - r7) - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        int i3 = i2;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            int i4 = 0;
            while (i4 < 13 && k(charAt) && i3 < length) {
                i4++;
                i3++;
                if (i3 < length) {
                    charAt = charSequence.charAt(i3);
                }
            }
            if (i4 <= 0) {
                if (!n(charSequence.charAt(i3))) {
                    break;
                }
                i3++;
            }
        }
        return i3 - i2;
    }

    public static void d(byte[] bArr, int i2, int i3, int i4, StringBuilder sb) {
        int i5;
        if (i3 == 1 && i4 == 0) {
            sb.append((char) 913);
        } else if (i3 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i3 >= 6) {
            char[] cArr = new char[5];
            i5 = i2;
            while ((i2 + i3) - i5 >= 6) {
                long j2 = 0;
                for (int i6 = 0; i6 < 6; i6++) {
                    j2 = (j2 << 8) + (bArr[i5 + i6] & 255);
                }
                for (int i7 = 0; i7 < 5; i7++) {
                    cArr[i7] = (char) (j2 % 900);
                    j2 /= 900;
                }
                for (int i8 = 4; i8 >= 0; i8--) {
                    sb.append(cArr[i8]);
                }
                i5 += 6;
            }
        } else {
            i5 = i2;
        }
        while (i5 < i2 + i3) {
            sb.append((char) (bArr[i5] & 255));
            i5++;
        }
    }

    public static String e(String str, UG ug, Charset charset) throws PN2 {
        EnumC10403wB e2;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = t;
        } else if (!t.equals(charset) && (e2 = EnumC10403wB.e(charset.name())) != null) {
            h(e2.h(), sb);
        }
        int length = str.length();
        int i2 = a.a[ug.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    while (i3 < length) {
                        int b2 = b(str, i3);
                        if (b2 >= 13) {
                            sb.append((char) 902);
                            f(str, i3, b2, sb);
                            i3 += b2;
                            i4 = 0;
                            i5 = 2;
                        } else {
                            int c2 = c(str, i3);
                            if (c2 < 5 && b2 != length) {
                                int a2 = a(str, i3, charset);
                                if (a2 == 0) {
                                    a2 = 1;
                                }
                                int i6 = a2 + i3;
                                byte[] bytes = str.substring(i3, i6).getBytes(charset);
                                if (bytes.length == 1 && i5 == 0) {
                                    d(bytes, 0, 1, 0, sb);
                                } else {
                                    d(bytes, 0, bytes.length, i5, sb);
                                    i5 = 1;
                                    i4 = 0;
                                }
                                i3 = i6;
                            } else {
                                if (i5 != 0) {
                                    sb.append((char) 900);
                                    i4 = 0;
                                    i5 = 0;
                                }
                                i4 = g(str, i3, c2, sb, i4);
                                i3 += c2;
                            }
                        }
                    }
                } else {
                    sb.append((char) 902);
                    f(str, 0, length, sb);
                }
            } else {
                byte[] bytes2 = str.getBytes(charset);
                d(bytes2, 0, bytes2.length, 1, sb);
            }
        } else {
            g(str, 0, length, sb, 0);
        }
        return sb.toString();
    }

    public static void f(String str, int i2, int i3, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i3 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i4 = 0;
        while (i4 < i3) {
            sb2.setLength(0);
            int min = Math.min(44, i3 - i4);
            StringBuilder sb3 = new StringBuilder("1");
            int i5 = i2 + i4;
            sb3.append(str.substring(i5, i5 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i4 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00f4 A[EDGE_INSN: B:73:0x00f4->B:55:0x00f4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(CharSequence charSequence, int i2, int i3, StringBuilder sb, int i4) {
        StringBuilder sb2 = new StringBuilder(i3);
        int i5 = i4;
        int i6 = 0;
        while (true) {
            int i7 = i2 + i6;
            char charAt = charSequence.charAt(i7);
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (m(charAt)) {
                            sb2.append((char) s[charAt]);
                        } else {
                            sb2.append(C5588cW.f706o);
                            i5 = 0;
                        }
                    } else if (l(charAt)) {
                        sb2.append((char) r[charAt]);
                    } else if (j(charAt)) {
                        sb2.append(C5588cW.n);
                        i5 = 0;
                    } else if (i(charAt)) {
                        sb2.append((char) 27);
                        i5 = 1;
                    } else {
                        int i8 = i7 + 1;
                        if (i8 < i3 && m(charSequence.charAt(i8))) {
                            sb2.append((char) 25);
                            i5 = 3;
                        } else {
                            sb2.append(C5588cW.f706o);
                            sb2.append((char) s[charAt]);
                        }
                    }
                } else if (i(charAt)) {
                    if (charAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (charAt - 'a'));
                    }
                } else if (j(charAt)) {
                    sb2.append((char) 27);
                    sb2.append((char) (charAt - 'A'));
                } else if (l(charAt)) {
                    sb2.append(C5588cW.n);
                    i5 = 2;
                } else {
                    sb2.append(C5588cW.f706o);
                    sb2.append((char) s[charAt]);
                }
                i6++;
                if (i6 < i3) {
                    break;
                }
            } else {
                if (j(charAt)) {
                    if (charAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (charAt - 'A'));
                    }
                } else if (i(charAt)) {
                    sb2.append((char) 27);
                    i5 = 1;
                } else if (l(charAt)) {
                    sb2.append(C5588cW.n);
                    i5 = 2;
                } else {
                    sb2.append(C5588cW.f706o);
                    sb2.append((char) s[charAt]);
                }
                i6++;
                if (i6 < i3) {
                }
            }
        }
        int length = sb2.length();
        char c2 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            if (i9 % 2 != 0) {
                c2 = (char) ((c2 * C5588cW.p) + sb2.charAt(i9));
                sb.append(c2);
            } else {
                c2 = sb2.charAt(i9);
            }
        }
        if (length % 2 != 0) {
            sb.append((char) ((c2 * C5588cW.p) + 29));
        }
        return i5;
    }

    public static void h(int i2, StringBuilder sb) throws PN2 {
        if (i2 >= 0 && i2 < 900) {
            sb.append((char) 927);
            sb.append((char) i2);
        } else if (i2 < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i2 / 900) - 1));
            sb.append((char) (i2 % 900));
        } else if (i2 < 811800) {
            sb.append((char) 925);
            sb.append((char) (810900 - i2));
        } else {
            throw new PN2("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i2)));
        }
    }

    public static boolean i(char c2) {
        if (c2 != ' ') {
            if (c2 < 'a' || c2 > 'z') {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean j(char c2) {
        if (c2 != ' ') {
            if (c2 < 'A' || c2 > 'Z') {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean k(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return true;
        }
        return false;
    }

    public static boolean l(char c2) {
        if (r[c2] != -1) {
            return true;
        }
        return false;
    }

    public static boolean m(char c2) {
        if (s[c2] != -1) {
            return true;
        }
        return false;
    }

    public static boolean n(char c2) {
        if (c2 != '\t' && c2 != '\n' && c2 != '\r') {
            if (c2 < ' ' || c2 > '~') {
                return false;
            }
            return true;
        }
        return true;
    }
}
