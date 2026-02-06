package o;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public abstract class RZ1 {
    @InterfaceC11300zs1
    public final XN1 a;
    public final long b;
    public final long c;

    /* loaded from: classes2.dex */
    public static abstract class a extends RZ1 {
        public final long d;
        public final long e;
        @InterfaceC11300zs1
        public final List<d> f;
        public final long g;
        public final long h;
        @InterfaceC5056aJ2
        public final long i;

        public a(@InterfaceC11300zs1 XN1 xn1, long j, long j2, long j3, long j4, @InterfaceC11300zs1 List<d> list, long j5, long j6, long j7) {
            super(xn1, j, j2);
            this.d = j3;
            this.e = j4;
            this.f = list;
            this.i = j5;
            this.g = j6;
            this.h = j7;
        }

        public long c(long j, long j2) {
            long g = g(j);
            if (g != -1) {
                return g;
            }
            return (int) (i((j2 - this.h) + this.i, j) - d(j, j2));
        }

        public long d(long j, long j2) {
            if (g(j) == -1) {
                long j3 = this.g;
                if (j3 != C10323vs.b) {
                    return Math.max(e(), i((j2 - this.h) - j3, j));
                }
            }
            return e();
        }

        public long e() {
            return this.d;
        }

        public long f(long j, long j2) {
            if (this.f != null) {
                return C10323vs.b;
            }
            long d = d(j, j2) + c(j, j2);
            return (j(d) + h(d, j)) - this.i;
        }

        public abstract long g(long j);

        public final long h(long j, long j2) {
            List<d> list = this.f;
            if (list != null) {
                return (list.get((int) (j - this.d)).b * 1000000) / this.b;
            }
            long g = g(j2);
            if (g != -1 && j == (e() + g) - 1) {
                return j2 - j(j);
            }
            return (this.e * 1000000) / this.b;
        }

        public long i(long j, long j2) {
            long e = e();
            long g = g(j2);
            if (g != 0) {
                if (this.f == null) {
                    long j3 = this.d + (j / ((this.e * 1000000) / this.b));
                    if (j3 >= e) {
                        if (g == -1) {
                            return j3;
                        }
                        return Math.min(j3, (e + g) - 1);
                    }
                } else {
                    long j4 = (g + e) - 1;
                    long j5 = e;
                    while (j5 <= j4) {
                        long j6 = ((j4 - j5) / 2) + j5;
                        int i = (j(j6) > j ? 1 : (j(j6) == j ? 0 : -1));
                        if (i < 0) {
                            j5 = j6 + 1;
                        } else if (i > 0) {
                            j4 = j6 - 1;
                        } else {
                            return j6;
                        }
                    }
                    if (j5 == e) {
                        return j5;
                    }
                    return j4;
                }
            }
            return e;
        }

        public final long j(long j) {
            long j2;
            List<d> list = this.f;
            if (list != null) {
                j2 = list.get((int) (j - this.d)).a - this.c;
            } else {
                j2 = (j - this.d) * this.e;
            }
            return TD2.C1(j2, 1000000L, this.b);
        }

        public abstract XN1 k(ZR1 zr1, long j);

        public boolean l() {
            if (this.f != null) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends a {
        @InterfaceC11300zs1
        public final List<XN1> j;

        public b(XN1 xn1, long j, long j2, long j3, long j4, @InterfaceC11300zs1 List<d> list, long j5, @InterfaceC11300zs1 List<XN1> list2, long j6, long j7) {
            super(xn1, j, j2, j3, j4, list, j5, j6, j7);
            this.j = list2;
        }

        @Override // o.RZ1.a
        public long g(long j) {
            return this.j.size();
        }

        @Override // o.RZ1.a
        public XN1 k(ZR1 zr1, long j) {
            return this.j.get((int) (j - this.d));
        }

        @Override // o.RZ1.a
        public boolean l() {
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends a {
        @InterfaceC11300zs1
        public final C5275bD2 j;
        @InterfaceC11300zs1
        public final C5275bD2 k;
        public final long l;

        public c(XN1 xn1, long j, long j2, long j3, long j4, long j5, @InterfaceC11300zs1 List<d> list, long j6, @InterfaceC11300zs1 C5275bD2 c5275bD2, @InterfaceC11300zs1 C5275bD2 c5275bD22, long j7, long j8) {
            super(xn1, j, j2, j3, j5, list, j6, j7, j8);
            this.j = c5275bD2;
            this.k = c5275bD22;
            this.l = j4;
        }

        @Override // o.RZ1
        @InterfaceC11300zs1
        public XN1 a(ZR1 zr1) {
            C5275bD2 c5275bD2 = this.j;
            if (c5275bD2 != null) {
                C10833xx0 c10833xx0 = zr1.c;
                return new XN1(c5275bD2.a(c10833xx0.X, 0L, c10833xx0.c1, 0L), 0L, -1L);
            }
            return super.a(zr1);
        }

        @Override // o.RZ1.a
        public long g(long j) {
            List<d> list = this.f;
            if (list != null) {
                return list.size();
            }
            long j2 = this.l;
            if (j2 != -1) {
                return (j2 - this.d) + 1;
            }
            if (j == C10323vs.b) {
                return -1L;
            }
            return C6635gn.c(BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b)), BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
        }

        @Override // o.RZ1.a
        public XN1 k(ZR1 zr1, long j) {
            long j2;
            List<d> list = this.f;
            if (list != null) {
                j2 = list.get((int) (j - this.d)).a;
            } else {
                j2 = (j - this.d) * this.e;
            }
            long j3 = j2;
            C5275bD2 c5275bD2 = this.k;
            C10833xx0 c10833xx0 = zr1.c;
            return new XN1(c5275bD2.a(c10833xx0.X, j, c10833xx0.c1, j3), 0L, -1L);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
        public final long a;
        public final long b;

        public d(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.a == dVar.a && this.b == dVar.b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    public RZ1(@InterfaceC11300zs1 XN1 xn1, long j, long j2) {
        this.a = xn1;
        this.b = j;
        this.c = j2;
    }

    @InterfaceC11300zs1
    public XN1 a(ZR1 zr1) {
        return this.a;
    }

    public long b() {
        return TD2.C1(this.c, 1000000L, this.b);
    }

    /* loaded from: classes2.dex */
    public static class e extends RZ1 {
        public final long d;
        public final long e;

        public e(@InterfaceC11300zs1 XN1 xn1, long j, long j2, long j3, long j4) {
            super(xn1, j, j2);
            this.d = j3;
            this.e = j4;
        }

        @InterfaceC11300zs1
        public XN1 c() {
            long j = this.e;
            if (j <= 0) {
                return null;
            }
            return new XN1(null, this.d, j);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
