package o;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* renamed from: o.Ks1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3482Ks1 {
    public static final Long a = 0L;
    public static final Long b = 1L;
    public static final Long c = -1L;
    public static final Integer d = 0;
    public static final Integer e = 1;
    public static final Integer f = 2;
    public static final Integer g = -1;
    public static final Short h = 0;
    public static final Short i = 1;
    public static final Short j = -1;
    public static final Byte k = (byte) 0;
    public static final Byte l = (byte) 1;
    public static final Byte m = (byte) -1;
    public static final Double n = Double.valueOf(0.0d);

    /* renamed from: o  reason: collision with root package name */
    public static final Double f522o = Double.valueOf(1.0d);
    public static final Double p = Double.valueOf(-1.0d);
    public static final Float q = Float.valueOf(0.0f);
    public static final Float r = Float.valueOf(1.0f);
    public static final Float s = Float.valueOf(-1.0f);
    public static final Long t = 2147483647L;
    public static final Long u = -2147483648L;

    public static long A(long j2, long j3, long j4) {
        if (j3 > j2) {
            j2 = j3;
        }
        if (j4 > j2) {
            return j4;
        }
        return j2;
    }

    public static long B(long... jArr) {
        m0(jArr);
        long j2 = jArr[0];
        for (int i2 = 1; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 > j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public static short C(short s2, short s3, short s4) {
        if (s3 > s2) {
            s2 = s3;
        }
        if (s4 > s2) {
            return s4;
        }
        return s2;
    }

    public static short D(short... sArr) {
        m0(sArr);
        short s2 = sArr[0];
        for (int i2 = 1; i2 < sArr.length; i2++) {
            short s3 = sArr[i2];
            if (s3 > s2) {
                s2 = s3;
            }
        }
        return s2;
    }

    public static byte E(byte b2, byte b3, byte b4) {
        if (b3 < b2) {
            b2 = b3;
        }
        if (b4 < b2) {
            return b4;
        }
        return b2;
    }

    public static byte F(byte... bArr) {
        m0(bArr);
        byte b2 = bArr[0];
        for (int i2 = 1; i2 < bArr.length; i2++) {
            byte b3 = bArr[i2];
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    public static double G(double d2, double d3, double d4) {
        return Math.min(Math.min(d2, d3), d4);
    }

    public static double H(double... dArr) {
        m0(dArr);
        double d2 = dArr[0];
        for (int i2 = 1; i2 < dArr.length; i2++) {
            if (Double.isNaN(dArr[i2])) {
                return Double.NaN;
            }
            double d3 = dArr[i2];
            if (d3 < d2) {
                d2 = d3;
            }
        }
        return d2;
    }

    public static float I(float f2, float f3, float f4) {
        return Math.min(Math.min(f2, f3), f4);
    }

    public static float J(float... fArr) {
        m0(fArr);
        float f2 = fArr[0];
        for (int i2 = 1; i2 < fArr.length; i2++) {
            if (Float.isNaN(fArr[i2])) {
                return Float.NaN;
            }
            float f3 = fArr[i2];
            if (f3 < f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    public static int K(int i2, int i3, int i4) {
        if (i3 < i2) {
            i2 = i3;
        }
        if (i4 < i2) {
            return i4;
        }
        return i2;
    }

    public static int L(int... iArr) {
        m0(iArr);
        int i2 = iArr[0];
        for (int i3 = 1; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    public static long M(long j2, long j3, long j4) {
        if (j3 < j2) {
            j2 = j3;
        }
        if (j4 < j2) {
            return j4;
        }
        return j2;
    }

    public static long N(long... jArr) {
        m0(jArr);
        long j2 = jArr[0];
        for (int i2 = 1; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public static short O(short s2, short s3, short s4) {
        if (s3 < s2) {
            s2 = s3;
        }
        if (s4 < s2) {
            return s4;
        }
        return s2;
    }

    public static short P(short... sArr) {
        m0(sArr);
        short s2 = sArr[0];
        for (int i2 = 1; i2 < sArr.length; i2++) {
            short s3 = sArr[i2];
            if (s3 < s2) {
                s2 = s3;
            }
        }
        return s2;
    }

    public static byte Q(String str) {
        return R(str, (byte) 0);
    }

    public static byte R(String str, byte b2) {
        if (str == null) {
            return b2;
        }
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b2;
        }
    }

    public static double S(String str) {
        return T(str, 0.0d);
    }

    public static double T(String str, double d2) {
        if (str == null) {
            return d2;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d2;
        }
    }

    public static double U(BigDecimal bigDecimal) {
        return V(bigDecimal, 0.0d);
    }

    public static double V(BigDecimal bigDecimal, double d2) {
        if (bigDecimal == null) {
            return d2;
        }
        return bigDecimal.doubleValue();
    }

    public static float W(String str) {
        return X(str, 0.0f);
    }

    public static float X(String str, float f2) {
        if (str == null) {
            return f2;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f2;
        }
    }

    public static int Y(String str) {
        return Z(str, 0);
    }

    public static int Z(String str, int i2) {
        if (str == null) {
            return i2;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static int a(byte b2, byte b3) {
        return b2 - b3;
    }

    public static long a0(String str) {
        return b0(str, 0L);
    }

    public static int b(int i2, int i3) {
        if (i2 == i3) {
            return 0;
        }
        if (i2 < i3) {
            return -1;
        }
        return 1;
    }

    public static long b0(String str, long j2) {
        if (str == null) {
            return j2;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j2;
        }
    }

    public static int c(long j2, long j3) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 == 0) {
            return 0;
        }
        if (i2 < 0) {
            return -1;
        }
        return 1;
    }

    public static BigDecimal c0(Double d2) {
        return d0(d2, f.intValue(), RoundingMode.HALF_EVEN);
    }

    public static int d(short s2, short s3) {
        if (s2 == s3) {
            return 0;
        }
        if (s2 < s3) {
            return -1;
        }
        return 1;
    }

    public static BigDecimal d0(Double d2, int i2, RoundingMode roundingMode) {
        if (d2 == null) {
            return BigDecimal.ZERO;
        }
        return j0(BigDecimal.valueOf(d2.doubleValue()), i2, roundingMode);
    }

    public static BigDecimal e(String str) {
        if (str == null) {
            return null;
        }
        if (!C4500Ve2.H0(str)) {
            return new BigDecimal(str);
        }
        throw new NumberFormatException("A blank string is not a valid number");
    }

    public static BigDecimal e0(Float f2) {
        return f0(f2, f.intValue(), RoundingMode.HALF_EVEN);
    }

    public static BigInteger f(String str) {
        int i2;
        if (str == null) {
            return null;
        }
        boolean startsWith = str.startsWith("-");
        int i3 = 16;
        if (!str.startsWith("0x", startsWith ? 1 : 0) && !str.startsWith("0X", startsWith ? 1 : 0)) {
            if (str.startsWith("#", startsWith ? 1 : 0)) {
                i2 = (startsWith ? 1 : 0) + 1;
            } else {
                if (str.startsWith("0", startsWith ? 1 : 0)) {
                    int length = str.length();
                    int i4 = (startsWith ? 1 : 0) + 1;
                    if (length > i4) {
                        i3 = 8;
                        i2 = i4;
                    }
                }
                i3 = 10;
                i2 = startsWith ? 1 : 0;
            }
        } else {
            i2 = (startsWith ? 1 : 0) + 2;
        }
        BigInteger bigInteger = new BigInteger(str.substring(i2), i3);
        if (startsWith) {
            return bigInteger.negate();
        }
        return bigInteger;
    }

    public static BigDecimal f0(Float f2, int i2, RoundingMode roundingMode) {
        if (f2 == null) {
            return BigDecimal.ZERO;
        }
        return j0(BigDecimal.valueOf(f2.floatValue()), i2, roundingMode);
    }

    public static Double g(String str) {
        if (str == null) {
            return null;
        }
        return Double.valueOf(str);
    }

    public static BigDecimal g0(String str) {
        return h0(str, f.intValue(), RoundingMode.HALF_EVEN);
    }

    public static Float h(String str) {
        if (str == null) {
            return null;
        }
        return Float.valueOf(str);
    }

    public static BigDecimal h0(String str, int i2, RoundingMode roundingMode) {
        if (str == null) {
            return BigDecimal.ZERO;
        }
        return j0(e(str), i2, roundingMode);
    }

    public static Integer i(String str) {
        if (str == null) {
            return null;
        }
        return Integer.decode(str);
    }

    public static BigDecimal i0(BigDecimal bigDecimal) {
        return j0(bigDecimal, f.intValue(), RoundingMode.HALF_EVEN);
    }

    public static Long j(String str) {
        if (str == null) {
            return null;
        }
        return Long.decode(str);
    }

    public static BigDecimal j0(BigDecimal bigDecimal, int i2, RoundingMode roundingMode) {
        if (bigDecimal == null) {
            return BigDecimal.ZERO;
        }
        if (roundingMode == null) {
            roundingMode = RoundingMode.HALF_EVEN;
        }
        return bigDecimal.setScale(i2, roundingMode);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0122, code lost:
        if (r5 == 'l') goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Number k(String str) {
        int i2;
        String l2;
        String str2;
        String str3;
        String str4;
        Float h2;
        Double g2;
        String str5;
        boolean z;
        if (str == null) {
            return null;
        }
        if (!C4500Ve2.H0(str)) {
            String[] strArr = {"0x", "0X", "-0x", "-0X", "#", "-#"};
            int length = str.length();
            char c2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 < 6) {
                    String str6 = strArr[i3];
                    if (str.startsWith(str6)) {
                        i2 = str6.length();
                        break;
                    }
                    i3++;
                } else {
                    i2 = 0;
                    break;
                }
            }
            if (i2 > 0) {
                int i4 = i2;
                while (i2 < length) {
                    c2 = str.charAt(i2);
                    if (c2 != '0') {
                        break;
                    }
                    i4++;
                    i2++;
                }
                int i5 = length - i4;
                if (i5 <= 16 && (i5 != 16 || c2 <= '7')) {
                    if (i5 <= 8 && (i5 != 8 || c2 <= '7')) {
                        return i(str);
                    }
                    return j(str);
                }
                return f(str);
            }
            int i6 = length - 1;
            char charAt = str.charAt(i6);
            int indexOf = str.indexOf(46);
            int indexOf2 = str.indexOf(101) + str.indexOf(69);
            int i7 = indexOf2 + 1;
            if (indexOf > -1) {
                if (i7 > -1) {
                    if (i7 >= indexOf && i7 <= length) {
                        str3 = str.substring(indexOf + 1, i7);
                    } else {
                        throw new NumberFormatException(str + " is not a valid number.");
                    }
                } else {
                    str3 = str.substring(indexOf + 1);
                }
                str2 = m(str, indexOf);
            } else {
                if (i7 > -1) {
                    if (i7 <= length) {
                        l2 = m(str, i7);
                    } else {
                        throw new NumberFormatException(str + " is not a valid number.");
                    }
                } else {
                    l2 = l(str);
                }
                str2 = l2;
                str3 = null;
            }
            if (!Character.isDigit(charAt) && charAt != '.') {
                if (i7 > -1 && i7 < i6) {
                    str5 = str.substring(indexOf2 + 2, i6);
                } else {
                    str5 = null;
                }
                String substring = str.substring(0, i6);
                if (n(str2) && n(str5)) {
                    z = true;
                } else {
                    z = false;
                }
                if (charAt != 'D') {
                    if (charAt != 'F') {
                        if (charAt != 'L') {
                            if (charAt != 'd') {
                                if (charAt != 'f') {
                                }
                            }
                        }
                        if (str3 == null && str5 == null && ((!substring.isEmpty() && substring.charAt(0) == '-' && p(substring.substring(1))) || p(substring))) {
                            try {
                                return j(substring);
                            } catch (NumberFormatException unused) {
                                return f(substring);
                            }
                        }
                        throw new NumberFormatException(str + " is not a valid number.");
                    }
                    try {
                        Float h3 = h(str);
                        if (!h3.isInfinite()) {
                            if (h3.floatValue() != 0.0f || z) {
                                return h3;
                            }
                        }
                    } catch (NumberFormatException unused2) {
                    }
                }
                try {
                    Double g3 = g(str);
                    if (!g3.isInfinite()) {
                        if (g3.doubleValue() != 0.0d || z) {
                            return g3;
                        }
                    }
                } catch (NumberFormatException unused3) {
                }
                try {
                    return e(substring);
                } catch (NumberFormatException unused4) {
                    throw new NumberFormatException(str + " is not a valid number.");
                }
            }
            if (i7 > -1 && i7 < i6) {
                str4 = str.substring(indexOf2 + 2);
            } else {
                str4 = null;
            }
            if (str3 == null && str4 == null) {
                try {
                    try {
                        return i(str);
                    } catch (NumberFormatException unused5) {
                        return j(str);
                    }
                } catch (NumberFormatException unused6) {
                    return f(str);
                }
            }
            if (n(str2) && n(str4)) {
                c2 = 1;
            }
            try {
                h2 = h(str);
                g2 = g(str);
            } catch (NumberFormatException unused7) {
            }
            if (!h2.isInfinite() && ((h2.floatValue() != 0.0f || c2 != 0) && h2.toString().equals(g2.toString()))) {
                return h2;
            }
            if (!g2.isInfinite() && (g2.doubleValue() != 0.0d || c2 != 0)) {
                BigDecimal e2 = e(str);
                if (e2.compareTo(BigDecimal.valueOf(g2.doubleValue())) == 0) {
                    return g2;
                }
                return e2;
            }
            return e(str);
        }
        throw new NumberFormatException("A blank string is not a valid number");
    }

    public static short k0(String str) {
        return l0(str, (short) 0);
    }

    public static String l(String str) {
        return m(str, str.length());
    }

    public static short l0(String str, short s2) {
        if (str == null) {
            return s2;
        }
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s2;
        }
    }

    public static String m(String str, int i2) {
        char charAt = str.charAt(0);
        if (charAt != '-' && charAt != '+') {
            return str.substring(0, i2);
        }
        return str.substring(1, i2);
    }

    public static void m0(Object obj) {
        boolean z;
        C11147zE2.V(obj, "array", new Object[0]);
        if (Array.getLength(obj) != 0) {
            z = true;
        } else {
            z = false;
        }
        C11147zE2.B(z, "Array cannot be empty.", new Object[0]);
    }

    public static boolean n(String str) {
        if (str == null) {
            return true;
        }
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) != '0') {
                return false;
            }
        }
        return !str.isEmpty();
    }

    public static boolean n0(String str, int i2) {
        boolean z;
        int i3 = 0;
        while (i2 < str.length()) {
            if (str.charAt(i2) == '.') {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i3++;
            }
            if (i3 > 1) {
                return false;
            }
            if (!z && !Character.isDigit(str.charAt(i2))) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00e2, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0091, code lost:
        if (r3 >= r0.length) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0093, code lost:
        r0 = r0[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0095, code lost:
        if (r0 < '0') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0097, code lost:
        if (r0 > '9') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0099, code lost:
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009a, code lost:
        if (r0 == 'e') goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x009c, code lost:
        if (r0 != 'E') goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x009f, code lost:
        if (r0 != '.') goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a1, code lost:
        if (r16 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a3, code lost:
        if (r15 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00a5, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00a6, code lost:
        if (r13 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00aa, code lost:
        if (r0 == 'd') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ae, code lost:
        if (r0 == 'D') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00b0, code lost:
        if (r0 == 'f') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00b2, code lost:
        if (r0 != r8) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00b4, code lost:
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00b7, code lost:
        if (r0 == 'l') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00bb, code lost:
        if (r0 != 'L') goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00be, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00bf, code lost:
        if (r14 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00c1, code lost:
        if (r15 != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c3, code lost:
        if (r16 != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c5, code lost:
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c6, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00c7, code lost:
        if (r13 != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00c9, code lost:
        if (r14 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00cb, code lost:
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00cc, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean o(String str) {
        int i2;
        if (C4500Ve2.I0(str)) {
            return false;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char c2 = charArray[0];
        boolean z = true;
        if (c2 != '-' && c2 != '+') {
            i2 = 0;
        } else {
            i2 = 1;
        }
        int i3 = i2 + 1;
        char c3 = 'F';
        if (length > i3 && charArray[i2] == '0' && !C4500Ve2.t(str, 46)) {
            char c4 = charArray[i3];
            if (c4 != 'x' && c4 != 'X') {
                if (Character.isDigit(c4)) {
                    while (i3 < charArray.length) {
                        char c5 = charArray[i3];
                        if (c5 < '0' || c5 > '7') {
                            return false;
                        }
                        i3++;
                    }
                    return true;
                }
            } else {
                int i4 = i2 + 2;
                if (i4 == length) {
                    return false;
                }
                while (i4 < charArray.length) {
                    char c6 = charArray[i4];
                    if ((c6 < '0' || c6 > '9') && ((c6 < 'a' || c6 > 'f') && (c6 < 'A' || c6 > 'F'))) {
                        return false;
                    }
                    i4++;
                }
                return true;
            }
        }
        int i5 = length - 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            boolean z6 = z;
            if (i2 < i5 || (i2 < length && z2 && !z3)) {
                char c7 = charArray[i2];
                if (c7 >= '0' && c7 <= '9') {
                    z2 = false;
                    z3 = z6;
                } else if (c7 == '.') {
                    if (z5 || z4) {
                        break;
                    }
                    z5 = z6;
                } else if (c7 != 'e' && c7 != 'E') {
                    if ((c7 != '+' && c7 != '-') || !z2) {
                        return false;
                    }
                    z2 = false;
                    z3 = false;
                } else if (z4 || !z3) {
                    return false;
                } else {
                    z2 = z6;
                    z4 = z2;
                }
                i2++;
                z = z6;
                c3 = 'F';
            }
        }
    }

    public static boolean p(String str) {
        return C4500Ve2.O0(str);
    }

    @Deprecated
    public static boolean q(String str) {
        return o(str);
    }

    public static boolean r(String str) {
        if (C4500Ve2.I0(str) || str.charAt(str.length() - 1) == '.') {
            return false;
        }
        if (str.charAt(0) == '-') {
            if (str.length() == 1) {
                return false;
            }
            return n0(str, 1);
        }
        return n0(str, 0);
    }

    public static byte s(byte b2, byte b3, byte b4) {
        if (b3 > b2) {
            b2 = b3;
        }
        if (b4 > b2) {
            return b4;
        }
        return b2;
    }

    public static byte t(byte... bArr) {
        m0(bArr);
        byte b2 = bArr[0];
        for (int i2 = 1; i2 < bArr.length; i2++) {
            byte b3 = bArr[i2];
            if (b3 > b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    public static double u(double d2, double d3, double d4) {
        return Math.max(Math.max(d2, d3), d4);
    }

    public static double v(double... dArr) {
        m0(dArr);
        double d2 = dArr[0];
        for (int i2 = 1; i2 < dArr.length; i2++) {
            if (Double.isNaN(dArr[i2])) {
                return Double.NaN;
            }
            double d3 = dArr[i2];
            if (d3 > d2) {
                d2 = d3;
            }
        }
        return d2;
    }

    public static float w(float f2, float f3, float f4) {
        return Math.max(Math.max(f2, f3), f4);
    }

    public static float x(float... fArr) {
        m0(fArr);
        float f2 = fArr[0];
        for (int i2 = 1; i2 < fArr.length; i2++) {
            if (Float.isNaN(fArr[i2])) {
                return Float.NaN;
            }
            float f3 = fArr[i2];
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    public static int y(int i2, int i3, int i4) {
        if (i3 > i2) {
            i2 = i3;
        }
        if (i4 > i2) {
            return i4;
        }
        return i2;
    }

    public static int z(int... iArr) {
        m0(iArr);
        int i2 = iArr[0];
        for (int i3 = 1; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            if (i4 > i2) {
                i2 = i4;
            }
        }
        return i2;
    }
}
