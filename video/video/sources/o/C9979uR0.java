package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.math.RoundingMode;
import o.InterfaceC8148mw2;

@InterfaceC10420wF0(emulated = true)
@InterfaceC8058ma0
/* renamed from: o.uR0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9979uR0 {
    @InterfaceC5299bJ2
    public static final int a = 1073741824;
    @InterfaceC5299bJ2
    public static final int b = -1257966797;
    @InterfaceC5299bJ2
    public static final int f = 46340;
    @InterfaceC5299bJ2
    public static final byte[] c = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    @InterfaceC5299bJ2
    public static final int[] d = {1, 10, 100, 1000, 10000, 100000, 1000000, C3827Oh.m, 100000000, 1000000000};
    @InterfaceC5299bJ2
    public static final int[] e = {3, 31, InterfaceC8148mw2.a.q, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};
    public static final int[] g = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    @InterfaceC5299bJ2
    public static int[] h = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, C8463oE0.u, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* renamed from: o.uR0$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int a(int i, int i2) {
        boolean z;
        C8314nd1.e(GoogleApiAvailabilityLight.e, i);
        C8314nd1.e("k", i2);
        int i3 = 0;
        if (i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "k (%s) > n (%s)", i2, i);
        if (i2 > (i >> 1)) {
            i2 = i - i2;
        }
        int[] iArr = h;
        if (i2 < iArr.length && i <= iArr[i2]) {
            if (i2 == 0) {
                return 1;
            }
            if (i2 != 1) {
                long j = 1;
                while (i3 < i2) {
                    i3++;
                    j = (j * (i - i3)) / i3;
                }
                return (int) j;
            }
            return i;
        }
        return Integer.MAX_VALUE;
    }

    @InterfaceC4238Sm
    public static int b(int i) {
        C8314nd1.h("x", i);
        if (i <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i - 1));
        }
        StringBuilder sb = new StringBuilder(58);
        sb.append("ceilingPowerOfTwo(");
        sb.append(i);
        sb.append(") not representable as an int");
        throw new ArithmeticException(sb.toString());
    }

    public static int c(int i, int i2) {
        boolean z;
        long j = i + i2;
        int i3 = (int) j;
        if (j == i3) {
            z = true;
        } else {
            z = false;
        }
        C8314nd1.b(z, "checkedAdd", i, i2);
        return i3;
    }

    public static int d(int i, int i2) {
        boolean z;
        long j = i * i2;
        int i3 = (int) j;
        if (j == i3) {
            z = true;
        } else {
            z = false;
        }
        C8314nd1.b(z, "checkedMultiply", i, i2);
        return i3;
    }

    public static int e(int i, int i2) {
        boolean z;
        boolean z2;
        C8314nd1.e("exponent", i2);
        boolean z3 = false;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        return 1;
                    }
                    if (i != 2) {
                        int i3 = 1;
                        while (i2 != 0) {
                            if (i2 != 1) {
                                if ((i2 & 1) != 0) {
                                    i3 = d(i3, i);
                                }
                                i2 >>= 1;
                                if (i2 > 0) {
                                    if (-46340 <= i) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (i <= 46340) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    C8314nd1.b(z & z2, "checkedPow", i, i2);
                                    i *= i;
                                }
                            } else {
                                return d(i3, i);
                            }
                        }
                        return i3;
                    }
                    if (i2 < 31) {
                        z3 = true;
                    }
                    C8314nd1.b(z3, "checkedPow", i, i2);
                    return 1 << i2;
                } else if (i2 != 0) {
                    return 0;
                } else {
                    return 1;
                }
            } else if ((i2 & 1) != 0) {
                return -1;
            } else {
                return 1;
            }
        }
        if (i2 < 32) {
            z3 = true;
        }
        C8314nd1.b(z3, "checkedPow", i, i2);
        if ((i2 & 1) == 0) {
            return 1 << i2;
        }
        return (-1) << i2;
    }

    public static int f(int i, int i2) {
        boolean z;
        long j = i - i2;
        int i3 = (int) j;
        if (j == i3) {
            z = true;
        } else {
            z = false;
        }
        C8314nd1.b(z, "checkedSubtract", i, i2);
        return i3;
    }

    public static int g(int i, int i2, RoundingMode roundingMode) {
        boolean z;
        C10664xF1.E(roundingMode);
        if (i2 != 0) {
            int i3 = i / i2;
            int i4 = i - (i2 * i3);
            if (i4 == 0) {
                return i3;
            }
            boolean z2 = true;
            int i5 = ((i ^ i2) >> 31) | 1;
            switch (a.a[roundingMode.ordinal()]) {
                case 1:
                    if (i4 != 0) {
                        z2 = false;
                    }
                    C8314nd1.k(z2);
                    return i3;
                case 2:
                    return i3;
                case 3:
                    if (i5 >= 0) {
                        return i3;
                    }
                    return i3 + i5;
                case 4:
                    return i3 + i5;
                case 5:
                    if (i5 <= 0) {
                        return i3;
                    }
                    return i3 + i5;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i4);
                    int abs2 = abs - (Math.abs(i2) - abs);
                    if (abs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            if (roundingMode == RoundingMode.HALF_EVEN) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if ((i3 & 1) == 0) {
                                z2 = false;
                            }
                            if (!(z & z2)) {
                                return i3;
                            }
                        }
                    } else if (abs2 <= 0) {
                        return i3;
                    }
                    return i3 + i5;
                default:
                    throw new AssertionError();
            }
        }
        throw new ArithmeticException("/ by zero");
    }

    public static int h(int i) {
        C8314nd1.e(GoogleApiAvailabilityLight.e, i);
        int[] iArr = g;
        if (i < iArr.length) {
            return iArr[i];
        }
        return Integer.MAX_VALUE;
    }

    @InterfaceC4238Sm
    public static int i(int i) {
        C8314nd1.h("x", i);
        return Integer.highestOneBit(i);
    }

    public static int j(int i, int i2) {
        C8314nd1.e("a", i);
        C8314nd1.e("b", i2);
        if (i == 0) {
            return i2;
        }
        if (i2 == 0) {
            return i;
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
        int i3 = i >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i2);
        int i4 = i2 >> numberOfTrailingZeros2;
        while (i3 != i4) {
            int i5 = i3 - i4;
            int i6 = (i5 >> 31) & i5;
            int i7 = (i5 - i6) - i6;
            i4 += i6;
            i3 = i7 >> Integer.numberOfTrailingZeros(i7);
        }
        return i3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static boolean k(int i) {
        boolean z;
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & (i - 1)) == 0) {
            z2 = true;
        }
        return z & z2;
    }

    @InterfaceC11149zF0
    @InterfaceC4238Sm
    public static boolean l(int i) {
        return R41.m(i);
    }

    @InterfaceC5299bJ2
    public static int m(int i, int i2) {
        return (~(~(i - i2))) >>> 31;
    }

    @InterfaceC11149zF0
    public static int n(int i, RoundingMode roundingMode) {
        boolean z;
        int m;
        C8314nd1.h("x", i);
        int o2 = o(i);
        int i2 = d[o2];
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                if (i == i2) {
                    z = true;
                } else {
                    z = false;
                }
                C8314nd1.k(z);
                return o2;
            case 2:
            case 3:
                return o2;
            case 4:
            case 5:
                m = m(i2, i);
                break;
            case 6:
            case 7:
            case 8:
                m = m(e[o2], i);
                break;
            default:
                throw new AssertionError();
        }
        return o2 + m;
    }

    public static int o(int i) {
        byte b2 = c[Integer.numberOfLeadingZeros(i)];
        return b2 - m(i, d[b2]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int p(int i, RoundingMode roundingMode) {
        C8314nd1.h("x", i);
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                C8314nd1.k(k(i));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + m(b >>> numberOfLeadingZeros, i);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static int q(int i, int i2) {
        return (i & i2) + ((i ^ i2) >> 1);
    }

    public static int r(int i, int i2) {
        if (i2 > 0) {
            int i3 = i % i2;
            if (i3 >= 0) {
                return i3;
            }
            return i3 + i2;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Modulus ");
        sb.append(i2);
        sb.append(" must be > 0");
        throw new ArithmeticException(sb.toString());
    }

    @InterfaceC11149zF0
    public static int s(int i, int i2) {
        int i3;
        C8314nd1.e("exponent", i2);
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        return 1;
                    }
                    if (i != 2) {
                        int i4 = 1;
                        while (i2 != 0) {
                            if (i2 != 1) {
                                if ((i2 & 1) == 0) {
                                    i3 = 1;
                                } else {
                                    i3 = i;
                                }
                                i4 *= i3;
                                i *= i;
                                i2 >>= 1;
                            } else {
                                return i * i4;
                            }
                        }
                        return i4;
                    } else if (i2 >= 32) {
                        return 0;
                    } else {
                        return 1 << i2;
                    }
                } else if (i2 != 0) {
                    return 0;
                } else {
                    return 1;
                }
            } else if ((i2 & 1) == 0) {
                return 1;
            } else {
                return -1;
            }
        } else if (i2 >= 32) {
            return 0;
        } else {
            if ((i2 & 1) == 0) {
                return 1 << i2;
            }
            return -(1 << i2);
        }
    }

    @InterfaceC4238Sm
    public static int t(int i, int i2) {
        return C7775lT0.x(i + i2);
    }

    @InterfaceC4238Sm
    public static int u(int i, int i2) {
        return C7775lT0.x(i * i2);
    }

    @InterfaceC4238Sm
    public static int v(int i, int i2) {
        boolean z;
        boolean z2;
        C8314nd1.e("exponent", i2);
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        return 1;
                    }
                    if (i != 2) {
                        int i3 = ((i >>> 31) & i2 & 1) + Integer.MAX_VALUE;
                        int i4 = 1;
                        while (i2 != 0) {
                            if (i2 != 1) {
                                if ((i2 & 1) != 0) {
                                    i4 = u(i4, i);
                                }
                                i2 >>= 1;
                                if (i2 > 0) {
                                    if (-46340 > i) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (i > 46340) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z | z2) {
                                        return i3;
                                    }
                                    i *= i;
                                }
                            } else {
                                return u(i4, i);
                            }
                        }
                        return i4;
                    } else if (i2 >= 31) {
                        return Integer.MAX_VALUE;
                    } else {
                        return 1 << i2;
                    }
                } else if (i2 == 0) {
                    return 1;
                } else {
                    return 0;
                }
            } else if ((i2 & 1) != 0) {
                return -1;
            } else {
                return 1;
            }
        } else if (i2 >= 32) {
            return (i2 & 1) + Integer.MAX_VALUE;
        } else {
            if ((i2 & 1) == 0) {
                return 1 << i2;
            }
            return (-1) << i2;
        }
    }

    @InterfaceC4238Sm
    public static int w(int i, int i2) {
        return C7775lT0.x(i - i2);
    }

    @InterfaceC11149zF0
    public static int x(int i, RoundingMode roundingMode) {
        boolean z;
        int m;
        C8314nd1.e("x", i);
        int y = y(i);
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                if (y * y == i) {
                    z = true;
                } else {
                    z = false;
                }
                C8314nd1.k(z);
                return y;
            case 2:
            case 3:
                return y;
            case 4:
            case 5:
                m = m(y * y, i);
                break;
            case 6:
            case 7:
            case 8:
                m = m((y * y) + y, i);
                break;
            default:
                throw new AssertionError();
        }
        return y + m;
    }

    public static int y(int i) {
        return (int) Math.sqrt(i);
    }
}
