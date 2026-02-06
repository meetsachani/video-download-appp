package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC7542kW0
@InterfaceC8303na2({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1068:1\n38#1:1069\n38#1:1070\n38#1:1071\n38#1:1072\n38#1:1073\n501#1:1074\n518#1:1082\n170#2,6:1075\n1#3:1081\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n39#1:1069\n40#1:1070\n275#1:1071\n295#1:1072\n479#1:1073\n728#1:1074\n819#1:1082\n770#1:1075,6\n*E\n"})
@InterfaceC6480g82(version = "1.6")
@InterfaceC10924yJ2(markerClass = {InterfaceC5395bj0.class})
/* loaded from: classes3.dex */
public final class Y70 implements Comparable<Y70> {
    public static final long Y0;
    public static final long Z0;
    public final long X;
    @NotNull
    public static final a Y = new a(null);
    public static final long Z = o(0);

    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final long A(double d) {
            return C6223f80.v(d, EnumC6964i80.a1);
        }

        public final long B(int i) {
            return C6223f80.w(i, EnumC6964i80.a1);
        }

        public final long C(long j) {
            return C6223f80.x(j, EnumC6964i80.a1);
        }

        public final long G() {
            return Y70.Z0;
        }

        public final long H(double d) {
            return C6223f80.v(d, EnumC6964i80.Y);
        }

        public final long I(int i) {
            return C6223f80.w(i, EnumC6964i80.Y);
        }

        public final long J(long j) {
            return C6223f80.x(j, EnumC6964i80.Y);
        }

        public final long N(double d) {
            return C6223f80.v(d, EnumC6964i80.Z0);
        }

        public final long O(int i) {
            return C6223f80.w(i, EnumC6964i80.Z0);
        }

        public final long P(long j) {
            return C6223f80.x(j, EnumC6964i80.Z0);
        }

        public final long T() {
            return Y70.Z;
        }

        public final long U(@NotNull String str) {
            long p;
            C6562gT0.p(str, "value");
            try {
                p = C6223f80.p(str, false);
                return p;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid duration string format: '" + str + "'.", e);
            }
        }

        public final long V(@NotNull String str) {
            long p;
            C6562gT0.p(str, "value");
            try {
                p = C6223f80.p(str, true);
                return p;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e);
            }
        }

        @Nullable
        public final Y70 W(@NotNull String str) {
            long p;
            C6562gT0.p(str, "value");
            try {
                p = C6223f80.p(str, true);
                return Y70.l(p);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Nullable
        public final Y70 X(@NotNull String str) {
            long p;
            C6562gT0.p(str, "value");
            try {
                p = C6223f80.p(str, false);
                return Y70.l(p);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @InterfaceC5395bj0
        public final double a(double d, @NotNull EnumC6964i80 enumC6964i80, @NotNull EnumC6964i80 enumC6964i802) {
            C6562gT0.p(enumC6964i80, "sourceUnit");
            C6562gT0.p(enumC6964i802, "targetUnit");
            return C7448k80.a(d, enumC6964i80, enumC6964i802);
        }

        public final long b(double d) {
            return C6223f80.v(d, EnumC6964i80.c1);
        }

        public final long c(int i) {
            return C6223f80.w(i, EnumC6964i80.c1);
        }

        public final long d(long j) {
            return C6223f80.x(j, EnumC6964i80.c1);
        }

        public final long h(double d) {
            return C6223f80.v(d, EnumC6964i80.b1);
        }

        public final long i(int i) {
            return C6223f80.w(i, EnumC6964i80.b1);
        }

        public final long j(long j) {
            return C6223f80.x(j, EnumC6964i80.b1);
        }

        public final long n() {
            return Y70.Y0;
        }

        public final long o(double d) {
            return C6223f80.v(d, EnumC6964i80.Z);
        }

        public final long p(int i) {
            return C6223f80.w(i, EnumC6964i80.Z);
        }

        public final long q(long j) {
            return C6223f80.x(j, EnumC6964i80.Z);
        }

        public final long u(double d) {
            return C6223f80.v(d, EnumC6964i80.Y0);
        }

        public final long v(int i) {
            return C6223f80.w(i, EnumC6964i80.Y0);
        }

        public final long w(long j) {
            return C6223f80.x(j, EnumC6964i80.Y0);
        }

        public a() {
        }

        @XP0
        public static /* synthetic */ void D(double d) {
        }

        @XP0
        public static /* synthetic */ void E(int i) {
        }

        @XP0
        public static /* synthetic */ void F(long j) {
        }

        @XP0
        public static /* synthetic */ void K(double d) {
        }

        @XP0
        public static /* synthetic */ void L(int i) {
        }

        @XP0
        public static /* synthetic */ void M(long j) {
        }

        @XP0
        public static /* synthetic */ void Q(double d) {
        }

        @XP0
        public static /* synthetic */ void R(int i) {
        }

        @XP0
        public static /* synthetic */ void S(long j) {
        }

        @XP0
        public static /* synthetic */ void e(double d) {
        }

        @XP0
        public static /* synthetic */ void f(int i) {
        }

        @XP0
        public static /* synthetic */ void g(long j) {
        }

        @XP0
        public static /* synthetic */ void k(double d) {
        }

        @XP0
        public static /* synthetic */ void l(int i) {
        }

        @XP0
        public static /* synthetic */ void m(long j) {
        }

        @XP0
        public static /* synthetic */ void r(double d) {
        }

        @XP0
        public static /* synthetic */ void s(int i) {
        }

        @XP0
        public static /* synthetic */ void t(long j) {
        }

        @XP0
        public static /* synthetic */ void x(double d) {
        }

        @XP0
        public static /* synthetic */ void y(int i) {
        }

        @XP0
        public static /* synthetic */ void z(long j) {
        }
    }

    static {
        long j;
        long j2;
        j = C6223f80.j(4611686018427387903L);
        Y0 = j;
        j2 = C6223f80.j(-4611686018427387903L);
        Z0 = j2;
    }

    public /* synthetic */ Y70(long j) {
        this.X = j;
    }

    public static final long A(long j) {
        if (P(j) && O(j)) {
            return M(j);
        }
        return g0(j, EnumC6964i80.Y0);
    }

    public static final long B(long j) {
        return g0(j, EnumC6964i80.a1);
    }

    public static final long C(long j) {
        long n;
        long M = M(j);
        if (Q(j)) {
            return M;
        }
        if (M > C3718Ne0.f) {
            return Long.MAX_VALUE;
        }
        if (M >= -9223372036854L) {
            n = C6223f80.n(M);
            return n;
        }
        return Long.MIN_VALUE;
    }

    public static final long D(long j) {
        return g0(j, EnumC6964i80.Z0);
    }

    public static final int F(long j) {
        if (R(j)) {
            return 0;
        }
        return (int) (B(j) % 60);
    }

    public static final int H(long j) {
        long M;
        if (R(j)) {
            return 0;
        }
        if (P(j)) {
            M = C6223f80.n(M(j) % 1000);
        } else {
            M = M(j) % 1000000000;
        }
        return (int) M;
    }

    public static final int J(long j) {
        if (R(j)) {
            return 0;
        }
        return (int) (D(j) % 60);
    }

    public static final EnumC6964i80 K(long j) {
        if (Q(j)) {
            return EnumC6964i80.Y;
        }
        return EnumC6964i80.Y0;
    }

    public static final int L(long j) {
        return ((int) j) & 1;
    }

    public static final long M(long j) {
        return j >> 1;
    }

    public static int N(long j) {
        return Long.hashCode(j);
    }

    public static final boolean O(long j) {
        return !R(j);
    }

    public static final boolean P(long j) {
        if ((((int) j) & 1) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean Q(long j) {
        if ((((int) j) & 1) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean R(long j) {
        if (j != Y0 && j != Z0) {
            return false;
        }
        return true;
    }

    public static final boolean S(long j) {
        if (j < 0) {
            return true;
        }
        return false;
    }

    public static final boolean T(long j) {
        if (j > 0) {
            return true;
        }
        return false;
    }

    public static final long U(long j, long j2) {
        return V(j, l0(j2));
    }

    public static final long V(long j, long j2) {
        long k;
        long m;
        if (R(j)) {
            if (!O(j2) && (j2 ^ j) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j;
        } else if (R(j2)) {
            return j2;
        } else {
            if ((((int) j) & 1) == (((int) j2) & 1)) {
                long M = M(j) + M(j2);
                if (Q(j)) {
                    m = C6223f80.m(M);
                    return m;
                }
                k = C6223f80.k(M);
                return k;
            } else if (P(j)) {
                return i(j, M(j), M(j2));
            } else {
                return i(j, M(j2), M(j));
            }
        }
    }

    public static final long W(long j, double d) {
        int K0 = C8071md1.K0(d);
        if (K0 == d) {
            return X(j, K0);
        }
        EnumC6964i80 K = K(j);
        return C6223f80.v(d0(j, K) * d, K);
    }

    public static final long X(long j, int i) {
        long j2;
        long o2;
        long n;
        long o3;
        long j3;
        long m;
        long l;
        if (R(j)) {
            if (i != 0) {
                if (i > 0) {
                    return j;
                }
                return l0(j);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        } else if (i == 0) {
            return Z;
        } else {
            long M = M(j);
            long j4 = i;
            long j5 = M * j4;
            if (Q(j)) {
                if (-2147483647L <= M && M < 2147483648L) {
                    l = C6223f80.l(j5);
                    return l;
                } else if (j5 / j4 == M) {
                    m = C6223f80.m(j5);
                    return m;
                } else {
                    o2 = C6223f80.o(M);
                    n = C6223f80.n(o2);
                    long j6 = o2 * j4;
                    o3 = C6223f80.o((M - n) * j4);
                    long j7 = o3 + j6;
                    if (j6 / j4 == o2 && (j7 ^ j6) >= 0) {
                        j3 = C6223f80.j(C5075aO1.L(j7, new W41(-4611686018427387903L, 4611686018427387903L)));
                        return j3;
                    } else if (C8071md1.V(M) * C8071md1.U(i) > 0) {
                        return Y0;
                    } else {
                        return Z0;
                    }
                }
            } else if (j5 / j4 == M) {
                j2 = C6223f80.j(C5075aO1.L(j5, new W41(-4611686018427387903L, 4611686018427387903L)));
                return j2;
            } else if (C8071md1.V(M) * C8071md1.U(i) > 0) {
                return Y0;
            } else {
                return Z0;
            }
        }
    }

    public static final <T> T Y(long j, @NotNull VA0<? super Long, ? super Integer, ? extends T> va0) {
        C6562gT0.p(va0, "action");
        return va0.i(Long.valueOf(D(j)), Integer.valueOf(H(j)));
    }

    public static final <T> T Z(long j, @NotNull XA0<? super Long, ? super Integer, ? super Integer, ? extends T> xa0) {
        C6562gT0.p(xa0, "action");
        return xa0.P(Long.valueOf(B(j)), Integer.valueOf(J(j)), Integer.valueOf(H(j)));
    }

    public static final <T> T b0(long j, @NotNull ZA0<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> za0) {
        C6562gT0.p(za0, "action");
        return za0.r(Long.valueOf(y(j)), Integer.valueOf(F(j)), Integer.valueOf(J(j)), Integer.valueOf(H(j)));
    }

    public static final <T> T c0(long j, @NotNull InterfaceC5265bB0<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> interfaceC5265bB0) {
        C6562gT0.p(interfaceC5265bB0, "action");
        return interfaceC5265bB0.c0(Long.valueOf(x(j)), Integer.valueOf(w(j)), Integer.valueOf(F(j)), Integer.valueOf(J(j)), Integer.valueOf(H(j)));
    }

    public static final double d0(long j, @NotNull EnumC6964i80 enumC6964i80) {
        C6562gT0.p(enumC6964i80, "unit");
        if (j == Y0) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == Z0) {
            return Double.NEGATIVE_INFINITY;
        }
        return C7448k80.a(M(j), K(j), enumC6964i80);
    }

    public static final int e0(long j, @NotNull EnumC6964i80 enumC6964i80) {
        C6562gT0.p(enumC6964i80, "unit");
        return (int) C5075aO1.K(g0(j, enumC6964i80), -2147483648L, 2147483647L);
    }

    @NotNull
    public static final String f0(long j) {
        long j2;
        boolean z;
        boolean z2;
        StringBuilder sb = new StringBuilder();
        if (S(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long u = u(j);
        long y = y(u);
        int F = F(u);
        int J = J(u);
        int H = H(u);
        if (R(j)) {
            j2 = 9999999999999L;
        } else {
            j2 = y;
        }
        boolean z3 = false;
        if (j2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (J == 0 && H == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (F != 0 || (z2 && z)) {
            z3 = true;
        }
        if (z) {
            sb.append(j2);
            sb.append('H');
        }
        if (z3) {
            sb.append(F);
            sb.append('M');
        }
        if (z2 || (!z && !z3)) {
            j(j, sb, J, H, 9, "S", true);
        }
        return sb.toString();
    }

    public static final long g0(long j, @NotNull EnumC6964i80 enumC6964i80) {
        C6562gT0.p(enumC6964i80, "unit");
        if (j == Y0) {
            return Long.MAX_VALUE;
        }
        if (j == Z0) {
            return Long.MIN_VALUE;
        }
        return C7448k80.b(M(j), K(j), enumC6964i80);
    }

    @NotNull
    public static String h0(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (j == 0) {
            return "0s";
        }
        if (j == Y0) {
            return "Infinity";
        }
        if (j == Z0) {
            return "-Infinity";
        }
        boolean S = S(j);
        StringBuilder sb = new StringBuilder();
        if (S) {
            sb.append('-');
        }
        long u = u(j);
        long x = x(u);
        int w = w(u);
        int F = F(u);
        int J = J(u);
        int H = H(u);
        int i = 0;
        if (x != 0) {
            z = true;
        } else {
            z = false;
        }
        if (w != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (F != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (J == 0 && H == 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z) {
            sb.append(x);
            sb.append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(w);
            sb.append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(F);
            sb.append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (J == 0 && !z && !z2 && !z3) {
                if (H >= 1000000) {
                    j(j, sb, H / 1000000, H % 1000000, 6, "ms", false);
                } else if (H >= 1000) {
                    j(j, sb, H / 1000, H % 1000, 3, "us", false);
                } else {
                    sb.append(H);
                    sb.append("ns");
                }
            } else {
                j(j, sb, J, H, 9, "s", false);
            }
            i = i4;
        }
        if (S && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long i(long j, long j2, long j3) {
        long o2;
        long j4;
        long n;
        long n2;
        long l;
        o2 = C6223f80.o(j3);
        long j5 = j2 + o2;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            j4 = C6223f80.j(C5075aO1.K(j5, -4611686018427387903L, 4611686018427387903L));
            return j4;
        }
        n = C6223f80.n(o2);
        long j6 = j3 - n;
        n2 = C6223f80.n(j5);
        l = C6223f80.l(n2 + j6);
        return l;
    }

    @NotNull
    public static final String i0(long j, @NotNull EnumC6964i80 enumC6964i80, int i) {
        C6562gT0.p(enumC6964i80, "unit");
        if (i >= 0) {
            double d0 = d0(j, enumC6964i80);
            if (Double.isInfinite(d0)) {
                return String.valueOf(d0);
            }
            return C5980e80.b(d0, C5075aO1.B(i, 12)) + C7691l80.h(enumC6964i80);
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i).toString());
    }

    public static final void j(long j, StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String m4 = C10763xf2.m4(String.valueOf(i2), i3, C3599Ly1.j);
            int i4 = -1;
            int length = m4.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (m4.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                sb.append((CharSequence) m4, 0, i6);
                C6562gT0.o(sb, "append(...)");
            } else {
                sb.append((CharSequence) m4, 0, ((i4 + 3) / 3) * 3);
                C6562gT0.o(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static /* synthetic */ String j0(long j, EnumC6964i80 enumC6964i80, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return i0(j, enumC6964i80, i);
    }

    public static final long k0(long j, @NotNull EnumC6964i80 enumC6964i80) {
        C6562gT0.p(enumC6964i80, "unit");
        EnumC6964i80 K = K(j);
        if (enumC6964i80.compareTo(K) > 0 && !R(j)) {
            return C6223f80.x(M(j) - (M(j) % C7448k80.b(1L, enumC6964i80, K)), K);
        }
        return j;
    }

    public static final /* synthetic */ Y70 l(long j) {
        return new Y70(j);
    }

    public static final long l0(long j) {
        long i;
        i = C6223f80.i(-M(j), ((int) j) & 1);
        return i;
    }

    public static int n(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            if (S(j)) {
                return -i;
            }
            return i;
        }
        return C6562gT0.u(j, j2);
    }

    public static long o(long j) {
        if (C5980e80.c()) {
            if (Q(j)) {
                long M = M(j);
                if (-4611686018426999999L <= M && M < 4611686018427000000L) {
                    return j;
                }
                throw new AssertionError(M(j) + " ns is out of nanoseconds range");
            }
            long M2 = M(j);
            if (-4611686018427387903L <= M2 && M2 < 4611686018427387904L) {
                long M3 = M(j);
                if (-4611686018426L <= M3) {
                    if (M3 >= 4611686018427L) {
                        return j;
                    }
                    throw new AssertionError(M(j) + " ms is denormalized");
                }
                return j;
            }
            throw new AssertionError(M(j) + " ms is out of milliseconds range");
        }
        return j;
    }

    public static final double p(long j, long j2) {
        EnumC6964i80 enumC6964i80 = (EnumC6964i80) AH.X(K(j), K(j2));
        return d0(j, enumC6964i80) / d0(j2, enumC6964i80);
    }

    public static final long q(long j, double d) {
        int K0 = C8071md1.K0(d);
        if (K0 == d && K0 != 0) {
            return r(j, K0);
        }
        EnumC6964i80 K = K(j);
        return C6223f80.v(d0(j, K) / d, K);
    }

    public static final long r(long j, int i) {
        long j2;
        long n;
        long n2;
        long l;
        long l2;
        if (i == 0) {
            if (T(j)) {
                return Y0;
            }
            if (S(j)) {
                return Z0;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        } else if (Q(j)) {
            l2 = C6223f80.l(M(j) / i);
            return l2;
        } else if (R(j)) {
            return X(j, C8071md1.U(i));
        } else {
            long j3 = i;
            long M = M(j) / j3;
            if (-4611686018426L > M || M >= 4611686018427L) {
                j2 = C6223f80.j(M);
                return j2;
            }
            n = C6223f80.n(M(j) - (M * j3));
            n2 = C6223f80.n(M);
            l = C6223f80.l(n2 + (n / j3));
            return l;
        }
    }

    public static boolean s(long j, Object obj) {
        if (!(obj instanceof Y70) || j != ((Y70) obj).n0()) {
            return false;
        }
        return true;
    }

    public static final boolean t(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final long u(long j) {
        if (S(j)) {
            return l0(j);
        }
        return j;
    }

    public static final int w(long j) {
        if (R(j)) {
            return 0;
        }
        return (int) (y(j) % 24);
    }

    public static final long x(long j) {
        return g0(j, EnumC6964i80.c1);
    }

    public static final long y(long j) {
        return g0(j, EnumC6964i80.b1);
    }

    public static final long z(long j) {
        return g0(j, EnumC6964i80.Z);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Y70 y70) {
        return m(y70.n0());
    }

    public boolean equals(Object obj) {
        return s(this.X, obj);
    }

    public int hashCode() {
        return N(this.X);
    }

    public int m(long j) {
        return n(this.X, j);
    }

    public final /* synthetic */ long n0() {
        return this.X;
    }

    @NotNull
    public String toString() {
        return h0(this.X);
    }

    @HK1
    public static /* synthetic */ void E() {
    }

    @HK1
    public static /* synthetic */ void G() {
    }

    @HK1
    public static /* synthetic */ void I() {
    }

    @HK1
    public static /* synthetic */ void v() {
    }
}
