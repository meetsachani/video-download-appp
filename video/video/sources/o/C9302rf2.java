package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.rf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9302rf2 extends C9053qf2 {
    @NotNull
    public static final Void m1(@NotNull String str) {
        C6562gT0.p(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    @InterfaceC6480g82(version = "1.1")
    @Nullable
    public static final Byte n1(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        return o1(str, 10);
    }

    @InterfaceC6480g82(version = "1.1")
    @Nullable
    public static final Byte o1(@NotNull String str, int i) {
        int intValue;
        C6562gT0.p(str, "<this>");
        Integer q1 = q1(str, i);
        if (q1 == null || (intValue = q1.intValue()) < -128 || intValue > 127) {
            return null;
        }
        return Byte.valueOf((byte) intValue);
    }

    @InterfaceC6480g82(version = "1.1")
    @Nullable
    public static Integer p1(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        return q1(str, 10);
    }

    @InterfaceC6480g82(version = "1.1")
    @Nullable
    public static final Integer q1(@NotNull String str, int i) {
        boolean z;
        int i2;
        int i3;
        C6562gT0.p(str, "<this>");
        BB.a(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        int t = C6562gT0.t(charAt, 48);
        int i5 = C10323vs.f;
        if (t < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt != '+') {
                if (charAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
            i2 = 0;
        }
        int i6 = -59652323;
        while (i2 < length) {
            int b = BB.b(str.charAt(i2), i);
            if (b < 0) {
                return null;
            }
            if ((i4 < i6 && (i6 != -59652323 || i4 < (i6 = i5 / i))) || (i3 = i4 * i) < i5 + b) {
                return null;
            }
            i4 = i3 - b;
            i2++;
        }
        if (z) {
            return Integer.valueOf(i4);
        }
        return Integer.valueOf(-i4);
    }

    @InterfaceC6480g82(version = "1.1")
    @Nullable
    public static Long r1(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        return s1(str, 10);
    }

    @InterfaceC6480g82(version = "1.1")
    @Nullable
    public static final Long s1(@NotNull String str, int i) {
        boolean z;
        C6562gT0.p(str, "<this>");
        BB.a(i);
        int length = str.length();
        Long l = null;
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int t = C6562gT0.t(charAt, 48);
        long j = C10323vs.b;
        if (t < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (charAt != '+') {
                if (charAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            } else {
                z = false;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i2 < length) {
            int b = BB.b(str.charAt(i2), i);
            if (b < 0) {
                return l;
            }
            if (j2 < j3) {
                if (j3 == -256204778801521550L) {
                    j3 = j / i;
                    if (j2 < j3) {
                        return l;
                    }
                } else {
                    return l;
                }
            }
            Long l2 = l;
            int i3 = i2;
            long j4 = j2 * i;
            long j5 = b;
            if (j4 < j + j5) {
                return l2;
            }
            j2 = j4 - j5;
            i2 = i3 + 1;
            l = l2;
        }
        if (z) {
            return Long.valueOf(j2);
        }
        return Long.valueOf(-j2);
    }

    @InterfaceC6480g82(version = "1.1")
    @Nullable
    public static final Short t1(@NotNull String str) {
        C6562gT0.p(str, "<this>");
        return u1(str, 10);
    }

    @InterfaceC6480g82(version = "1.1")
    @Nullable
    public static final Short u1(@NotNull String str, int i) {
        int intValue;
        C6562gT0.p(str, "<this>");
        Integer q1 = q1(str, i);
        if (q1 == null || (intValue = q1.intValue()) < -32768 || intValue > 32767) {
            return null;
        }
        return Short.valueOf((short) intValue);
    }
}
