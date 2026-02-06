package o;

/* renamed from: o.md1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8071md1 extends C7810ld1 {
    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double A(double d) {
        return Math.cos(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double A0(double d, double d2) {
        return Math.nextAfter(d, d2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float B(float f) {
        return (float) Math.cos(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float B0(float f, float f2) {
        return Math.nextAfter(f, f2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double C(double d) {
        return Math.cosh(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double C0(double d) {
        return Math.nextUp(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float D(float f) {
        return (float) Math.cosh(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float D0(float f) {
        return Math.nextUp(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double E(double d) {
        return Math.exp(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double E0(double d, double d2) {
        return Math.pow(d, d2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float F(float f) {
        return (float) Math.exp(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double F0(double d, int i) {
        return Math.pow(d, i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double G(double d) {
        return Math.expm1(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float G0(float f, float f2) {
        return (float) Math.pow(f, f2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float H(float f) {
        return (float) Math.expm1(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float H0(float f, int i) {
        return (float) Math.pow(f, i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double I(double d) {
        return Math.floor(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double I0(double d) {
        return Math.rint(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float J(float f) {
        return (float) Math.floor(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float J0(float f) {
        return (float) Math.rint(f);
    }

    public static final double K(double d) {
        return Math.abs(d);
    }

    @InterfaceC6480g82(version = "1.2")
    public static int K0(double d) {
        if (!Double.isNaN(d)) {
            if (d > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final float L(float f) {
        return Math.abs(f);
    }

    @InterfaceC6480g82(version = "1.2")
    public static final int L0(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final int M(int i) {
        return Math.abs(i);
    }

    @InterfaceC6480g82(version = "1.2")
    public static long M0(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final long N(long j) {
        return Math.abs(j);
    }

    @InterfaceC6480g82(version = "1.2")
    public static final long N0(float f) {
        return M0(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double O0(double d) {
        return Math.signum(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float P0(float f) {
        return Math.signum(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double Q0(double d) {
        return Math.sin(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float R0(float f) {
        return (float) Math.sin(f);
    }

    public static final double S(double d) {
        return Math.signum(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double S0(double d) {
        return Math.sinh(d);
    }

    public static final float T(float f) {
        return Math.signum(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float T0(float f) {
        return (float) Math.sinh(f);
    }

    public static int U(int i) {
        return Integer.signum(i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double U0(double d) {
        return Math.sqrt(d);
    }

    public static int V(long j) {
        return Long.signum(j);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float V0(float f) {
        return (float) Math.sqrt(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double W0(double d) {
        return Math.tan(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float X0(float f) {
        return (float) Math.tan(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double Y0(double d) {
        return Math.tanh(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float Z0(float f) {
        return (float) Math.tanh(f);
    }

    public static final double a0(double d) {
        return Math.ulp(d);
    }

    @InterfaceC6480g82(version = "1.2")
    public static final double a1(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            if (d > 0.0d) {
                return Math.floor(d);
            }
            return Math.ceil(d);
        }
        return d;
    }

    public static final float b0(float f) {
        return Math.ulp(f);
    }

    @InterfaceC6480g82(version = "1.2")
    public static final float b1(float f) {
        double ceil;
        if (!Float.isNaN(f) && !Float.isInfinite(f)) {
            if (f > 0.0f) {
                ceil = Math.floor(f);
            } else {
                ceil = Math.ceil(f);
            }
            return (float) ceil;
        }
        return f;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double c(double d, double d2) {
        return Math.IEEEremainder(d, d2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double c1(double d, double d2) {
        return Math.copySign(d, d2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float d(float f, float f2) {
        return (float) Math.IEEEremainder(f, f2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double d1(double d, int i) {
        return Math.copySign(d, i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double e(double d) {
        return Math.abs(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double e0(double d, double d2) {
        return Math.hypot(d, d2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float e1(float f, float f2) {
        return Math.copySign(f, f2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float f(float f) {
        return Math.abs(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float f0(float f, float f2) {
        return (float) Math.hypot(f, f2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float f1(float f, int i) {
        return Math.copySign(f, i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final int g(int i) {
        return Math.abs(i);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double g0(double d) {
        return Math.log(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final long h(long j) {
        return Math.abs(j);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float h0(float f) {
        return (float) Math.log(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double i(double d) {
        return Math.acos(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double i0(double d) {
        return Math.log1p(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float j(float f) {
        return (float) Math.acos(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float j0(float f) {
        return (float) Math.log1p(f);
    }

    @InterfaceC6480g82(version = "1.2")
    public static final double k(double d) {
        if (d < 1.0d) {
            return Double.NaN;
        }
        if (d > GK.f) {
            return Math.log(d) + GK.b;
        }
        double d2 = 1;
        double d3 = d - d2;
        if (d3 >= GK.e) {
            return Math.log(d + Math.sqrt((d * d) - d2));
        }
        double sqrt = Math.sqrt(d3);
        if (sqrt >= GK.d) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return Math.sqrt(2.0d) * sqrt;
    }

    @InterfaceC6480g82(version = "1.2")
    public static final double k0(double d, double d2) {
        if (d2 > 0.0d && d2 != 1.0d) {
            return Math.log(d) / Math.log(d2);
        }
        return Double.NaN;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float l(float f) {
        return (float) k(f);
    }

    @InterfaceC6480g82(version = "1.2")
    public static final float l0(float f, float f2) {
        if (f2 > 0.0f && f2 != 1.0f) {
            return (float) (Math.log(f) / Math.log(f2));
        }
        return Float.NaN;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double m(double d) {
        return Math.asin(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double m0(double d) {
        return Math.log10(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float n(float f) {
        return (float) Math.asin(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float n0(float f) {
        return (float) Math.log10(f);
    }

    @InterfaceC6480g82(version = "1.2")
    public static final double o(double d) {
        double d2 = GK.e;
        if (d >= d2) {
            if (d > GK.g) {
                if (d > GK.f) {
                    return Math.log(d) + GK.b;
                }
                double d3 = d * 2;
                return Math.log(d3 + (1 / d3));
            }
            return Math.log(d + Math.sqrt((d * d) + 1));
        } else if (d <= (-d2)) {
            return -o(-d);
        } else {
            if (Math.abs(d) >= GK.d) {
                return d - (((d * d) * d) / 6);
            }
            return d;
        }
    }

    @InterfaceC6480g82(version = "1.2")
    public static final double o0(double d) {
        return Math.log(d) / GK.b;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float p(float f) {
        return (float) o(f);
    }

    @InterfaceC6480g82(version = "1.2")
    public static final float p0(float f) {
        return (float) (Math.log(f) / GK.b);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double q(double d) {
        return Math.atan(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double q0(double d, double d2) {
        return Math.max(d, d2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float r(float f) {
        return (float) Math.atan(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float r0(float f, float f2) {
        return Math.max(f, f2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double s(double d, double d2) {
        return Math.atan2(d, d2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final int s0(int i, int i2) {
        return Math.max(i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float t(float f, float f2) {
        return (float) Math.atan2(f, f2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final long t0(long j, long j2) {
        return Math.max(j, j2);
    }

    @InterfaceC6480g82(version = "1.2")
    public static final double u(double d) {
        if (Math.abs(d) < GK.e) {
            if (Math.abs(d) > GK.d) {
                return d + (((d * d) * d) / 3);
            }
            return d;
        }
        double d2 = 1;
        return Math.log((d2 + d) / (d2 - d)) / 2;
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double u0(double d, double d2) {
        return Math.min(d, d2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float v(float f) {
        return (float) u(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float v0(float f, float f2) {
        return Math.min(f, f2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.8")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final double w(double d) {
        return Math.cbrt(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final int w0(int i, int i2) {
        return Math.min(i, i2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.8")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public static final float x(float f) {
        return (float) Math.cbrt(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final long x0(long j, long j2) {
        return Math.min(j, j2);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double y(double d) {
        return Math.ceil(d);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final double y0(double d) {
        return Math.nextAfter(d, Double.NEGATIVE_INFINITY);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float z(float f) {
        return (float) Math.ceil(f);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static final float z0(float f) {
        return Math.nextAfter(f, Double.NEGATIVE_INFINITY);
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static /* synthetic */ void O(double d) {
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static /* synthetic */ void P(float f) {
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static /* synthetic */ void Q(int i) {
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static /* synthetic */ void R(long j) {
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static /* synthetic */ void W(double d) {
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static /* synthetic */ void X(float f) {
    }

    @InterfaceC6480g82(version = "1.2")
    public static /* synthetic */ void Y(int i) {
    }

    @InterfaceC6480g82(version = "1.2")
    public static /* synthetic */ void Z(long j) {
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static /* synthetic */ void c0(double d) {
    }

    @XP0
    @InterfaceC6480g82(version = "1.2")
    public static /* synthetic */ void d0(float f) {
    }
}
