package o;

import java.util.Arrays;
import java.util.Comparator;
import o.S9;

@InterfaceC5116aa0
@InterfaceC4238Sm
@InterfaceC10420wF0
/* loaded from: classes3.dex */
public final class YB2 {
    public static final long a = 4294967295L;

    /* loaded from: classes3.dex */
    public enum a implements Comparator<int[]> {
        INSTANCE;

        @Override // java.util.Comparator
        /* renamed from: g */
        public int compare(int[] iArr, int[] iArr2) {
            int min = Math.min(iArr.length, iArr2.length);
            for (int i = 0; i < min; i++) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                if (i2 != i3) {
                    return YB2.b(i2, i3);
                }
            }
            return iArr.length - iArr2.length;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "UnsignedInts.lexicographicalComparator()";
        }
    }

    public static int a(long j) {
        boolean z;
        if ((j >> 32) == 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "out of range: %s", j);
        return (int) j;
    }

    public static int b(int i, int i2) {
        return C7775lT0.e(e(i), e(i2));
    }

    @InterfaceC6181ey
    public static int c(String str) {
        String str2;
        C3502Ky1 a2 = C3502Ky1.a(str);
        try {
            return k(a2.a, a2.b);
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

    public static int d(int i, int i2) {
        return (int) (r(i) / r(i2));
    }

    public static int e(int i) {
        return i ^ Integer.MIN_VALUE;
    }

    public static String f(String str, int... iArr) {
        C10664xF1.E(str);
        if (iArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(iArr.length * 5);
        sb.append(s(iArr[0]));
        for (int i = 1; i < iArr.length; i++) {
            sb.append(str);
            sb.append(s(iArr[i]));
        }
        return sb.toString();
    }

    public static Comparator<int[]> g() {
        return a.INSTANCE;
    }

    public static int h(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        int e = e(iArr[0]);
        for (int i = 1; i < iArr.length; i++) {
            int e2 = e(iArr[i]);
            if (e2 > e) {
                e = e2;
            }
        }
        return e(e);
    }

    public static int i(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        int e = e(iArr[0]);
        for (int i = 1; i < iArr.length; i++) {
            int e2 = e(iArr[i]);
            if (e2 < e) {
                e = e2;
            }
        }
        return e(e);
    }

    @InterfaceC6181ey
    public static int j(String str) {
        return k(str, 10);
    }

    @InterfaceC6181ey
    public static int k(String str, int i) {
        C10664xF1.E(str);
        long parseLong = Long.parseLong(str, i);
        if ((4294967295L & parseLong) == parseLong) {
            return (int) parseLong;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 69);
        sb.append("Input ");
        sb.append(str);
        sb.append(" in base ");
        sb.append(i);
        sb.append(" is not in the range of an unsigned integer");
        throw new NumberFormatException(sb.toString());
    }

    public static int l(int i, int i2) {
        return (int) (r(i) % r(i2));
    }

    public static int m(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= S9.c.M) {
            return -1;
        }
        return (int) j;
    }

    public static void n(int[] iArr) {
        C10664xF1.E(iArr);
        o(iArr, 0, iArr.length);
    }

    public static void o(int[] iArr, int i, int i2) {
        C10664xF1.E(iArr);
        C10664xF1.f0(i, i2, iArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            iArr[i3] = e(iArr[i3]);
        }
        Arrays.sort(iArr, i, i2);
        while (i < i2) {
            iArr[i] = e(iArr[i]);
            i++;
        }
    }

    public static void p(int[] iArr) {
        C10664xF1.E(iArr);
        q(iArr, 0, iArr.length);
    }

    public static void q(int[] iArr, int i, int i2) {
        C10664xF1.E(iArr);
        C10664xF1.f0(i, i2, iArr.length);
        for (int i3 = i; i3 < i2; i3++) {
            iArr[i3] = Integer.MAX_VALUE ^ iArr[i3];
        }
        Arrays.sort(iArr, i, i2);
        while (i < i2) {
            iArr[i] = iArr[i] ^ Integer.MAX_VALUE;
            i++;
        }
    }

    public static long r(int i) {
        return i & 4294967295L;
    }

    public static String s(int i) {
        return t(i, 10);
    }

    public static String t(int i, int i2) {
        return Long.toString(i & 4294967295L, i2);
    }
}
