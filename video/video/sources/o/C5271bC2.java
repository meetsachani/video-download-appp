package o;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

@InterfaceC5116aa0
@InterfaceC4238Sm
@InterfaceC10420wF0
/* renamed from: o.bC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5271bC2 {
    public static final long a = -1;

    /* renamed from: o.bC2$a */
    /* loaded from: classes3.dex */
    public enum a implements Comparator<long[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: g */
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < min; i++) {
                long j = jArr[i];
                long j2 = jArr2[i];
                if (j != j2) {
                    return C5271bC2.a(j, j2);
                }
            }
            return jArr.length - jArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedLongs.lexicographicalComparator()";
        }
    }

    /* renamed from: o.bC2$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final long[] a = new long[37];
        public static final int[] b = new int[37];
        public static final int[] c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger("10000000000000000", 16);
            for (int i = 2; i <= 36; i++) {
                long j = i;
                a[i] = C5271bC2.c(-1L, j);
                b[i] = (int) C5271bC2.k(-1L, j);
                c[i] = bigInteger.toString(i).length() - 1;
            }
        }

        public static boolean a(long j, int i, int i2) {
            if (j < 0) {
                return true;
            }
            long j2 = a[i2];
            if (j < j2) {
                return false;
            }
            if (j > j2 || i > b[i2]) {
                return true;
            }
            return false;
        }
    }

    public static int a(long j, long j2) {
        return C7194j51.d(d(j), d(j2));
    }

    @InterfaceC6181ey
    public static long b(String str) {
        String str2;
        C3502Ky1 a2 = C3502Ky1.a(str);
        try {
            return j(a2.a, a2.b);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Error parsing value: ".concat(valueOf);
            } else {
                str2 = new String("Error parsing value: ");
            }
            NumberFormatException numberFormatException = new NumberFormatException(str2);
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    public static long c(long j, long j2) {
        if (j2 < 0) {
            if (a(j, j2) < 0) {
                return 0L;
            }
            return 1L;
        } else if (j >= 0) {
            return j / j2;
        } else {
            int i = 1;
            long j3 = ((j >>> 1) / j2) << 1;
            if (a(j - (j3 * j2), j2) < 0) {
                i = 0;
            }
            return j3 + i;
        }
    }

    public static long d(long j) {
        return j ^ Long.MIN_VALUE;
    }

    public static String e(String str, long... jArr) {
        C10664xF1.E(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(jArr.length * 5);
        sb.append(p(jArr[0]));
        for (int i = 1; i < jArr.length; i++) {
            sb.append(str);
            sb.append(p(jArr[i]));
        }
        return sb.toString();
    }

    public static Comparator<long[]> f() {
        return a.INSTANCE;
    }

    public static long g(long... jArr) {
        boolean z;
        if (jArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        long d = d(jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            long d2 = d(jArr[i]);
            if (d2 > d) {
                d = d2;
            }
        }
        return d(d);
    }

    public static long h(long... jArr) {
        boolean z;
        if (jArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        long d = d(jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            long d2 = d(jArr[i]);
            if (d2 < d) {
                d = d2;
            }
        }
        return d(d);
    }

    @InterfaceC6181ey
    public static long i(String str) {
        return j(str, 10);
    }

    @InterfaceC6181ey
    public static long j(String str, int i) {
        String str2;
        C10664xF1.E(str);
        if (str.length() != 0) {
            if (i >= 2 && i <= 36) {
                int i2 = b.c[i] - 1;
                long j = 0;
                for (int i3 = 0; i3 < str.length(); i3++) {
                    int digit = Character.digit(str.charAt(i3), i);
                    if (digit != -1) {
                        if (i3 > i2 && b.a(j, digit, i)) {
                            if (str.length() != 0) {
                                str2 = "Too large for unsigned long: ".concat(str);
                            } else {
                                str2 = new String("Too large for unsigned long: ");
                            }
                            throw new NumberFormatException(str2);
                        }
                        j = (j * i) + digit;
                    } else {
                        throw new NumberFormatException(str);
                    }
                }
                return j;
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("illegal radix: ");
            sb.append(i);
            throw new NumberFormatException(sb.toString());
        }
        throw new NumberFormatException("empty string");
    }

    public static long k(long j, long j2) {
        if (j2 < 0) {
            if (a(j, j2) < 0) {
                return j;
            }
            return j - j2;
        } else if (j >= 0) {
            return j % j2;
        } else {
            long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
            if (a(j3, j2) < 0) {
                j2 = 0;
            }
            return j3 - j2;
        }
    }

    public static void l(long[] jArr) {
        C10664xF1.E(jArr);
        m(jArr, 0, jArr.length);
    }

    public static void m(long[] jArr, int i, int i2) {
        C10664xF1.E(jArr);
        C10664xF1.f0(i, i2, jArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            jArr[i3] = d(jArr[i3]);
        }
        Arrays.sort(jArr, i, i2);
        while (i < i2) {
            jArr[i] = d(jArr[i]);
            i++;
        }
    }

    public static void n(long[] jArr) {
        C10664xF1.E(jArr);
        o(jArr, 0, jArr.length);
    }

    public static void o(long[] jArr, int i, int i2) {
        C10664xF1.E(jArr);
        C10664xF1.f0(i, i2, jArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            jArr[i3] = Long.MAX_VALUE ^ jArr[i3];
        }
        Arrays.sort(jArr, i, i2);
        while (i < i2) {
            jArr[i] = jArr[i] ^ Long.MAX_VALUE;
            i++;
        }
    }

    public static String p(long j) {
        return q(j, 10);
    }

    public static String q(long j, int i) {
        boolean z;
        long c;
        if (i >= 2 && i <= 36) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.k(z, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", i);
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i2 == 0) {
            return "0";
        }
        if (i2 > 0) {
            return Long.toString(j, i);
        }
        int i3 = 64;
        char[] cArr = new char[64];
        int i4 = i - 1;
        if ((i & i4) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
            do {
                i3--;
                cArr[i3] = Character.forDigit(((int) j) & i4, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            if ((i & 1) == 0) {
                c = (j >>> 1) / (i >>> 1);
            } else {
                c = c(j, i);
            }
            long j2 = i;
            int i5 = 63;
            cArr[63] = Character.forDigit((int) (j - (c * j2)), i);
            while (c > 0) {
                i5--;
                cArr[i5] = Character.forDigit((int) (c % j2), i);
                c /= j2;
            }
            i3 = i5;
        }
        return new String(cArr, i3, 64 - i3);
    }
}
