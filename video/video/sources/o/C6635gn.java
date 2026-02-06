package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@InterfaceC10420wF0(emulated = true)
@InterfaceC8058ma0
/* renamed from: o.gn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6635gn {
    @InterfaceC5299bJ2
    public static final int a = 256;
    @InterfaceC5299bJ2
    public static final BigInteger b = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
    public static final double c = Math.log(10.0d);
    public static final double d = Math.log(2.0d);

    /* renamed from: o.gn$a */
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

    @InterfaceC11149zF0
    /* renamed from: o.gn$b */
    /* loaded from: classes3.dex */
    public static class b extends AbstractC3569Lp2<BigInteger> {
        public static final b a = new b();

        @Override // o.AbstractC3569Lp2
        /* renamed from: f */
        public BigInteger a(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger.subtract(bigInteger2);
        }

        @Override // o.AbstractC3569Lp2
        /* renamed from: g */
        public double c(BigInteger bigInteger) {
            return C10866y50.a(bigInteger);
        }

        @Override // o.AbstractC3569Lp2
        /* renamed from: h */
        public int d(BigInteger bigInteger) {
            return bigInteger.signum();
        }

        @Override // o.AbstractC3569Lp2
        /* renamed from: i */
        public BigInteger e(double d, RoundingMode roundingMode) {
            return C7193j50.o(d, roundingMode);
        }
    }

    public static BigInteger a(int i, int i2) {
        boolean z;
        int i3;
        C8314nd1.e(GoogleApiAvailabilityLight.e, i);
        C8314nd1.e("k", i2);
        int i4 = 1;
        if (i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "k (%s) > n (%s)", i2, i);
        if (i2 > (i >> 1)) {
            i2 = i - i2;
        }
        int[] iArr = R41.h;
        if (i2 < iArr.length && i <= iArr[i2]) {
            return BigInteger.valueOf(R41.a(i, i2));
        }
        BigInteger bigInteger = BigInteger.ONE;
        long j = i;
        int q = R41.q(j, RoundingMode.CEILING);
        long j2 = 1;
        while (true) {
            int i5 = q;
            while (i4 < i2) {
                i3 = i - i4;
                i4++;
                i5 += q;
                if (i5 >= 63) {
                    break;
                }
                j *= i3;
                j2 *= i4;
            }
            return bigInteger.multiply(BigInteger.valueOf(j)).divide(BigInteger.valueOf(j2));
            bigInteger = bigInteger.multiply(BigInteger.valueOf(j)).divide(BigInteger.valueOf(j2));
            j = i3;
            j2 = i4;
        }
    }

    @InterfaceC4238Sm
    public static BigInteger b(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(k(bigInteger, RoundingMode.CEILING));
    }

    @InterfaceC11149zF0
    public static BigInteger c(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }

    public static BigInteger d(int i) {
        C8314nd1.e(GoogleApiAvailabilityLight.e, i);
        long[] jArr = R41.g;
        if (i < jArr.length) {
            return BigInteger.valueOf(jArr[i]);
        }
        RoundingMode roundingMode = RoundingMode.CEILING;
        ArrayList arrayList = new ArrayList(C9979uR0.g(C9979uR0.p(i, roundingMode) * i, 64, roundingMode));
        int length = jArr.length;
        long j = jArr[length - 1];
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j2 = j >> numberOfTrailingZeros;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int i2 = 1;
        int q = R41.q(j2, roundingMode2) + 1;
        long j3 = length;
        int q2 = R41.q(j3, roundingMode2);
        int i3 = q2 + 1;
        int i4 = 1 << q2;
        while (j3 <= i) {
            int i5 = i2;
            long j4 = j3;
            if ((i4 & j4) != 0) {
                i4 <<= 1;
                i3++;
            }
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j4);
            long j5 = j4 >> numberOfTrailingZeros2;
            numberOfTrailingZeros += numberOfTrailingZeros2;
            if ((i3 - numberOfTrailingZeros2) + q >= 64) {
                arrayList.add(BigInteger.valueOf(j2));
                j2 = 1;
            }
            j2 *= j5;
            q = R41.q(j2, RoundingMode.FLOOR) + i5;
            j3 = j4 + 1;
            i2 = i5;
        }
        if (j2 > 1) {
            arrayList.add(BigInteger.valueOf(j2));
        }
        return h(arrayList).shiftLeft(numberOfTrailingZeros);
    }

    @InterfaceC11149zF0
    public static boolean e(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return true;
        }
        return false;
    }

    @InterfaceC4238Sm
    public static BigInteger f(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(k(bigInteger, RoundingMode.FLOOR));
    }

    public static boolean g(BigInteger bigInteger) {
        C10664xF1.E(bigInteger);
        if (bigInteger.signum() > 0 && bigInteger.getLowestSetBit() == bigInteger.bitLength() - 1) {
            return true;
        }
        return false;
    }

    public static BigInteger h(List<BigInteger> list) {
        return i(list, 0, list.size());
    }

    public static BigInteger i(List<BigInteger> list, int i, int i2) {
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        int i4 = (i2 + i) >>> 1;
                        return i(list, i, i4).multiply(i(list, i4, i2));
                    }
                    return list.get(i).multiply(list.get(i + 1)).multiply(list.get(i + 2));
                }
                return list.get(i).multiply(list.get(i + 1));
            }
            return list.get(i);
        }
        return BigInteger.ONE;
    }

    @InterfaceC11149zF0
    public static int j(BigInteger bigInteger, RoundingMode roundingMode) {
        int i;
        int i2;
        C8314nd1.j("x", bigInteger);
        if (e(bigInteger)) {
            return R41.o(bigInteger.longValue(), roundingMode);
        }
        int k = (int) ((k(bigInteger, RoundingMode.FLOOR) * d) / c);
        BigInteger bigInteger2 = BigInteger.TEN;
        BigInteger pow = bigInteger2.pow(k);
        int compareTo = pow.compareTo(bigInteger);
        if (compareTo > 0) {
            do {
                k--;
                pow = pow.divide(BigInteger.TEN);
                i2 = pow.compareTo(bigInteger);
            } while (i2 > 0);
        } else {
            BigInteger multiply = bigInteger2.multiply(pow);
            int compareTo2 = multiply.compareTo(bigInteger);
            while (true) {
                int i3 = compareTo2;
                i = compareTo;
                compareTo = i3;
                if (compareTo > 0) {
                    break;
                }
                k++;
                BigInteger multiply2 = BigInteger.TEN.multiply(multiply);
                compareTo2 = multiply2.compareTo(bigInteger);
                pow = multiply;
                multiply = multiply2;
            }
            i2 = i;
        }
        boolean z = true;
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                if (i2 != 0) {
                    z = false;
                }
                C8314nd1.k(z);
                return k;
            case 2:
            case 3:
                return k;
            case 4:
            case 5:
                if (!pow.equals(bigInteger)) {
                    return k + 1;
                }
                return k;
            case 6:
            case 7:
            case 8:
                if (bigInteger.pow(2).compareTo(pow.pow(2).multiply(BigInteger.TEN)) > 0) {
                    return k + 1;
                }
                return k;
            default:
                throw new AssertionError();
        }
    }

    public static int k(BigInteger bigInteger, RoundingMode roundingMode) {
        C8314nd1.j("x", (BigInteger) C10664xF1.E(bigInteger));
        int bitLength = bigInteger.bitLength();
        int i = bitLength - 1;
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                C8314nd1.k(g(bigInteger));
                return i;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                if (!g(bigInteger)) {
                    return bitLength;
                }
                break;
            case 6:
            case 7:
            case 8:
                if (i < 256) {
                    if (bigInteger.compareTo(b.shiftRight(256 - i)) > 0) {
                        return bitLength;
                    }
                } else if (bigInteger.pow(2).bitLength() - 1 >= (i * 2) + 1) {
                    return bitLength;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i;
    }

    @InterfaceC11149zF0
    public static double l(BigInteger bigInteger, RoundingMode roundingMode) {
        return b.a.b(bigInteger, roundingMode);
    }

    @InterfaceC11149zF0
    public static BigInteger m(BigInteger bigInteger, RoundingMode roundingMode) {
        C8314nd1.g("x", bigInteger);
        if (e(bigInteger)) {
            return BigInteger.valueOf(R41.B(bigInteger.longValue(), roundingMode));
        }
        BigInteger o2 = o(bigInteger);
        switch (a.a[roundingMode.ordinal()]) {
            case 1:
                C8314nd1.k(o2.pow(2).equals(bigInteger));
                return o2;
            case 2:
            case 3:
                return o2;
            case 4:
            case 5:
                int intValue = o2.intValue();
                if (intValue * intValue == bigInteger.intValue() && o2.pow(2).equals(bigInteger)) {
                    return o2;
                }
                return o2.add(BigInteger.ONE);
            case 6:
            case 7:
            case 8:
                if (o2.pow(2).add(o2).compareTo(bigInteger) >= 0) {
                    return o2;
                }
                return o2.add(BigInteger.ONE);
            default:
                throw new AssertionError();
        }
    }

    @InterfaceC11149zF0
    public static BigInteger n(BigInteger bigInteger) {
        return C7193j50.o(Math.sqrt(C10866y50.a(bigInteger)), RoundingMode.HALF_EVEN);
    }

    @InterfaceC11149zF0
    public static BigInteger o(BigInteger bigInteger) {
        BigInteger shiftLeft;
        int k = k(bigInteger, RoundingMode.FLOOR);
        if (k < 1023) {
            shiftLeft = n(bigInteger);
        } else {
            int i = (k - 52) & (-2);
            shiftLeft = n(bigInteger.shiftRight(i)).shiftLeft(i >> 1);
        }
        BigInteger shiftRight = shiftLeft.add(bigInteger.divide(shiftLeft)).shiftRight(1);
        if (shiftLeft.equals(shiftRight)) {
            return shiftLeft;
        }
        while (true) {
            BigInteger shiftRight2 = shiftRight.add(bigInteger.divide(shiftRight)).shiftRight(1);
            if (shiftRight2.compareTo(shiftRight) >= 0) {
                return shiftRight;
            }
            shiftRight = shiftRight2;
        }
    }
}
