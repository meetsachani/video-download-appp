package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.math.BigInteger;

/* renamed from: o.Ry0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4182Ry0 extends Number implements Comparable<C4182Ry0> {
    public static final C4182Ry0 a1 = new C4182Ry0(0, 1);
    public static final C4182Ry0 b1 = new C4182Ry0(1, 1);
    public static final C4182Ry0 c1 = new C4182Ry0(1, 2);
    public static final C4182Ry0 d1 = new C4182Ry0(1, 3);
    public static final C4182Ry0 e1 = new C4182Ry0(2, 3);
    public static final C4182Ry0 f1 = new C4182Ry0(1, 4);
    public static final C4182Ry0 g1 = new C4182Ry0(2, 4);
    public static final C4182Ry0 h1 = new C4182Ry0(3, 4);
    public static final C4182Ry0 i1 = new C4182Ry0(1, 5);
    public static final C4182Ry0 j1 = new C4182Ry0(2, 5);
    public static final C4182Ry0 k1 = new C4182Ry0(3, 5);
    public static final C4182Ry0 l1 = new C4182Ry0(4, 5);
    private static final long serialVersionUID = 65382027393090L;
    public final int X;
    public final int Y;
    public transient String Y0;
    public transient int Z;
    public transient String Z0;

    public C4182Ry0(int i, int i2) {
        this.X = i;
        this.Y = i2;
    }

    public static int D(int i, int i2) {
        long j = i - i2;
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("overflow: add");
    }

    public static int h(int i, int i2) {
        long j = i + i2;
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("overflow: add");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
        return u((r8 + (r4 * r10)) * r9, r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4182Ry0 n(double d) {
        int i;
        if (d < 0.0d) {
            i = -1;
        } else {
            i = 1;
        }
        double abs = Math.abs(d);
        if (abs <= 2.147483647E9d && !Double.isNaN(abs)) {
            int i2 = (int) abs;
            double d2 = abs - i2;
            int i3 = (int) d2;
            double d3 = d2 - i3;
            double d4 = Double.MAX_VALUE;
            int i4 = 1;
            int i5 = 1;
            double d5 = 1.0d;
            int i6 = 0;
            int i7 = 0;
            int i8 = 1;
            while (true) {
                int i9 = (int) (d5 / d3);
                double d6 = d5 - (i9 * d3);
                int i10 = (i3 * i8) + i6;
                int i11 = (i3 * i7) + i4;
                int i12 = i;
                double abs2 = Math.abs(d2 - (i10 / i11));
                int i13 = i5 + 1;
                if (d4 <= abs2 || i11 > 10000 || i11 <= 0 || i13 >= 25) {
                    break;
                }
                d4 = abs2;
                i = i12;
                i5 = i13;
                i6 = i8;
                i4 = i7;
                i8 = i10;
                i7 = i11;
                i3 = i9;
                d5 = d3;
                d3 = d6;
            }
            throw new ArithmeticException("Unable to convert double to fraction");
        }
        throw new ArithmeticException("The value must not be greater than Integer.MAX_VALUE or NaN");
    }

    public static C4182Ry0 o(int i, int i2) {
        if (i2 != 0) {
            if (i2 < 0) {
                if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
                    i = -i;
                    i2 = -i2;
                } else {
                    throw new ArithmeticException("overflow: can't negate");
                }
            }
            return new C4182Ry0(i, i2);
        }
        throw new ArithmeticException("The denominator must not be zero");
    }

    public static C4182Ry0 p(int i, int i2, int i3) {
        long j;
        if (i3 != 0) {
            if (i3 >= 0) {
                if (i2 >= 0) {
                    if (i < 0) {
                        j = (i * i3) - i2;
                    } else {
                        j = (i * i3) + i2;
                    }
                    if (j >= -2147483648L && j <= 2147483647L) {
                        return new C4182Ry0((int) j, i3);
                    }
                    throw new ArithmeticException("Numerator too large to represent as an Integer.");
                }
                throw new ArithmeticException("The numerator must not be negative");
            }
            throw new ArithmeticException("The denominator must not be negative");
        }
        throw new ArithmeticException("The denominator must not be zero");
    }

    public static C4182Ry0 q(String str) {
        C11147zE2.V(str, "str", new Object[0]);
        if (str.indexOf(46) >= 0) {
            return n(Double.parseDouble(str));
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(str.substring(0, indexOf));
            String substring = str.substring(indexOf + 1);
            int indexOf2 = substring.indexOf(47);
            if (indexOf2 >= 0) {
                return p(parseInt, Integer.parseInt(substring.substring(0, indexOf2)), Integer.parseInt(substring.substring(indexOf2 + 1)));
            }
            throw new NumberFormatException("The fraction could not be parsed as the format X Y/Z");
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 < 0) {
            return o(Integer.parseInt(str), 1);
        }
        return o(Integer.parseInt(str.substring(0, indexOf3)), Integer.parseInt(str.substring(indexOf3 + 1)));
    }

    public static C4182Ry0 u(int i, int i2) {
        if (i2 != 0) {
            if (i == 0) {
                return a1;
            }
            if (i2 == Integer.MIN_VALUE && (i & 1) == 0) {
                i /= 2;
                i2 /= 2;
            }
            if (i2 < 0) {
                if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
                    i = -i;
                    i2 = -i2;
                } else {
                    throw new ArithmeticException("overflow: can't negate");
                }
            }
            int v = v(i, i2);
            return new C4182Ry0(i / v, i2 / v);
        }
        throw new ArithmeticException("The denominator must not be zero");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
        if (r3 != 1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
        r0 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
        r0 = -(r6 / 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003a, code lost:
        if ((r0 & 1) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
        r0 = r0 / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
        if (r0 <= 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
        r6 = -r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0043, code lost:
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
        r0 = (r7 - r6) / 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        if (r0 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004e, code lost:
        return (-r6) * (1 << r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int v(int i, int i2) {
        if (i != 0 && i2 != 0) {
            if (Math.abs(i) == 1 || Math.abs(i2) == 1) {
                return 1;
            }
            if (i > 0) {
                i = -i;
            }
            if (i2 > 0) {
                i2 = -i2;
            }
            int i3 = 0;
            while (true) {
                int i4 = i & 1;
                if (i4 != 0 || (i2 & 1) != 0 || i3 >= 31) {
                    break;
                }
                i /= 2;
                i2 /= 2;
                i3++;
            }
            throw new ArithmeticException("overflow: gcd is 2^31");
        } else if (i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE) {
            return Math.abs(i) + Math.abs(i2);
        } else {
            throw new ArithmeticException("overflow: gcd is 2^31");
        }
    }

    public static int x(int i, int i2) {
        long j = i * i2;
        if (j >= -2147483648L && j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("overflow: mul");
    }

    public static int y(int i, int i2) {
        long j = i * i2;
        if (j <= 2147483647L) {
            return (int) j;
        }
        throw new ArithmeticException("overflow: mulPos");
    }

    public C4182Ry0 A() {
        int i = this.X;
        if (i != Integer.MIN_VALUE) {
            return new C4182Ry0(-i, this.Y);
        }
        throw new ArithmeticException("overflow: too large to negate");
    }

    public C4182Ry0 B(int i) {
        if (i == 1) {
            return this;
        }
        if (i == 0) {
            return b1;
        }
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                return w().B(2).B(-(i / 2));
            }
            return w().B(-i);
        }
        C4182Ry0 z = z(this);
        if (i % 2 == 0) {
            return z.B(i / 2);
        }
        return z.B(i / 2).z(this);
    }

    public C4182Ry0 C() {
        int i = this.X;
        if (i == 0) {
            C4182Ry0 c4182Ry0 = a1;
            if (!equals(c4182Ry0)) {
                return c4182Ry0;
            }
        } else {
            int v = v(Math.abs(i), this.Y);
            if (v != 1) {
                return o(this.X / v, this.Y / v);
            }
        }
        return this;
    }

    public C4182Ry0 E(C4182Ry0 c4182Ry0) {
        return i(c4182Ry0, false);
    }

    public String F() {
        if (this.Z0 == null) {
            int i = this.X;
            if (i == 0) {
                this.Z0 = "0";
            } else {
                int i2 = this.Y;
                if (i == i2) {
                    this.Z0 = "1";
                } else if (i == i2 * (-1)) {
                    this.Z0 = "-1";
                } else {
                    if (i > 0) {
                        i = -i;
                    }
                    if (i < (-i2)) {
                        int s = s();
                        if (s == 0) {
                            this.Z0 = Integer.toString(t());
                        } else {
                            this.Z0 = t() + C4500Ve2.b + s + RemoteSettings.i + m();
                        }
                    } else {
                        this.Z0 = r() + RemoteSettings.i + m();
                    }
                }
            }
        }
        return this.Z0;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.X / this.Y;
    }

    public C4182Ry0 e() {
        if (this.X >= 0) {
            return this;
        }
        return A();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4182Ry0)) {
            return false;
        }
        C4182Ry0 c4182Ry0 = (C4182Ry0) obj;
        if (r() == c4182Ry0.r() && m() == c4182Ry0.m()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.X / this.Y;
    }

    public C4182Ry0 g(C4182Ry0 c4182Ry0) {
        return i(c4182Ry0, true);
    }

    public int hashCode() {
        if (this.Z == 0) {
            this.Z = ((r() + 629) * 37) + m();
        }
        return this.Z;
    }

    public final C4182Ry0 i(C4182Ry0 c4182Ry0, boolean z) {
        BigInteger subtract;
        int v;
        int D;
        C11147zE2.V(c4182Ry0, "fraction", new Object[0]);
        if (this.X == 0) {
            if (z) {
                return c4182Ry0;
            }
            return c4182Ry0.A();
        } else if (c4182Ry0.X == 0) {
            return this;
        } else {
            int v2 = v(this.Y, c4182Ry0.Y);
            if (v2 == 1) {
                int x = x(this.X, c4182Ry0.Y);
                int x2 = x(c4182Ry0.X, this.Y);
                if (z) {
                    D = h(x, x2);
                } else {
                    D = D(x, x2);
                }
                return new C4182Ry0(D, y(this.Y, c4182Ry0.Y));
            }
            BigInteger multiply = BigInteger.valueOf(this.X).multiply(BigInteger.valueOf(c4182Ry0.Y / v2));
            BigInteger multiply2 = BigInteger.valueOf(c4182Ry0.X).multiply(BigInteger.valueOf(this.Y / v2));
            if (z) {
                subtract = multiply.add(multiply2);
            } else {
                subtract = multiply.subtract(multiply2);
            }
            int intValue = subtract.mod(BigInteger.valueOf(v2)).intValue();
            if (intValue == 0) {
                v = v2;
            } else {
                v = v(intValue, v2);
            }
            BigInteger divide = subtract.divide(BigInteger.valueOf(v));
            if (divide.bitLength() <= 31) {
                return new C4182Ry0(divide.intValue(), y(this.Y / v2, c4182Ry0.Y / v));
            }
            throw new ArithmeticException("overflow: numerator too large after multiply");
        }
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.X / this.Y;
    }

    @Override // java.lang.Comparable
    /* renamed from: j */
    public int compareTo(C4182Ry0 c4182Ry0) {
        if (this == c4182Ry0) {
            return 0;
        }
        int i = this.X;
        int i2 = c4182Ry0.X;
        if (i == i2 && this.Y == c4182Ry0.Y) {
            return 0;
        }
        return Long.compare(i * c4182Ry0.Y, i2 * this.Y);
    }

    public C4182Ry0 l(C4182Ry0 c4182Ry0) {
        C11147zE2.V(c4182Ry0, "fraction", new Object[0]);
        if (c4182Ry0.X != 0) {
            return z(c4182Ry0.w());
        }
        throw new ArithmeticException("The fraction to divide by must not be zero");
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.X / this.Y;
    }

    public int m() {
        return this.Y;
    }

    public int r() {
        return this.X;
    }

    public int s() {
        return Math.abs(this.X % this.Y);
    }

    public int t() {
        return this.X / this.Y;
    }

    public String toString() {
        if (this.Y0 == null) {
            this.Y0 = r() + RemoteSettings.i + m();
        }
        return this.Y0;
    }

    public C4182Ry0 w() {
        int i = this.X;
        if (i != 0) {
            if (i != Integer.MIN_VALUE) {
                if (i < 0) {
                    return new C4182Ry0(-this.Y, -i);
                }
                return new C4182Ry0(this.Y, i);
            }
            throw new ArithmeticException("overflow: can't negate numerator");
        }
        throw new ArithmeticException("Unable to invert zero.");
    }

    public C4182Ry0 z(C4182Ry0 c4182Ry0) {
        C11147zE2.V(c4182Ry0, "fraction", new Object[0]);
        int i = this.X;
        if (i != 0 && c4182Ry0.X != 0) {
            int v = v(i, c4182Ry0.Y);
            int v2 = v(c4182Ry0.X, this.Y);
            return u(x(this.X / v, c4182Ry0.X / v2), y(this.Y / v2, c4182Ry0.Y / v));
        }
        return a1;
    }
}
