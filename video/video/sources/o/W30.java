package o;

import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

@InterfaceC10420wF0
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class W30<C extends Comparable> {
    public final boolean X;

    /* loaded from: classes3.dex */
    public static final class b extends W30<BigInteger> implements Serializable {
        private static final long serialVersionUID = 0;
        public static final b Y = new b();
        public static final BigInteger Z = BigInteger.valueOf(Long.MIN_VALUE);
        public static final BigInteger Y0 = BigInteger.valueOf(Long.MAX_VALUE);

        public b() {
            super(true);
        }

        private Object readResolve() {
            return Y;
        }

        @Override // o.W30
        /* renamed from: k */
        public long b(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger2.subtract(bigInteger).max(Z).min(Y0).longValue();
        }

        @Override // o.W30
        /* renamed from: l */
        public BigInteger g(BigInteger bigInteger) {
            return bigInteger.add(BigInteger.ONE);
        }

        @Override // o.W30
        /* renamed from: m */
        public BigInteger h(BigInteger bigInteger, long j) {
            C5037aF.c(j, "distance");
            return bigInteger.add(BigInteger.valueOf(j));
        }

        @Override // o.W30
        /* renamed from: n */
        public BigInteger i(BigInteger bigInteger) {
            return bigInteger.subtract(BigInteger.ONE);
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends W30<Integer> implements Serializable {
        public static final c Y = new c();
        private static final long serialVersionUID = 0;

        public c() {
            super(true);
        }

        private Object readResolve() {
            return Y;
        }

        @Override // o.W30
        /* renamed from: k */
        public long b(Integer num, Integer num2) {
            return num2.intValue() - num.intValue();
        }

        @Override // o.W30
        /* renamed from: l */
        public Integer e() {
            return Integer.MAX_VALUE;
        }

        @Override // o.W30
        /* renamed from: m */
        public Integer f() {
            return Integer.MIN_VALUE;
        }

        @Override // o.W30
        @MB
        /* renamed from: n */
        public Integer g(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue + 1);
        }

        @Override // o.W30
        /* renamed from: o */
        public Integer h(Integer num, long j) {
            C5037aF.c(j, "distance");
            return Integer.valueOf(C7775lT0.d(num.longValue() + j));
        }

        @Override // o.W30
        @MB
        /* renamed from: p */
        public Integer i(Integer num) {
            int intValue = num.intValue();
            if (intValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(intValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends W30<Long> implements Serializable {
        public static final d Y = new d();
        private static final long serialVersionUID = 0;

        public d() {
            super(true);
        }

        private Object readResolve() {
            return Y;
        }

        @Override // o.W30
        /* renamed from: k */
        public long b(Long l, Long l2) {
            long longValue = l2.longValue() - l.longValue();
            if (l2.longValue() > l.longValue() && longValue < 0) {
                return Long.MAX_VALUE;
            }
            if (l2.longValue() < l.longValue() && longValue > 0) {
                return Long.MIN_VALUE;
            }
            return longValue;
        }

        @Override // o.W30
        /* renamed from: l */
        public Long e() {
            return Long.MAX_VALUE;
        }

        @Override // o.W30
        /* renamed from: m */
        public Long f() {
            return Long.MIN_VALUE;
        }

        @Override // o.W30
        @MB
        /* renamed from: n */
        public Long g(Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(longValue + 1);
        }

        @Override // o.W30
        /* renamed from: o */
        public Long h(Long l, long j) {
            boolean z;
            C5037aF.c(j, "distance");
            long longValue = l.longValue() + j;
            if (longValue < 0) {
                if (l.longValue() < 0) {
                    z = true;
                } else {
                    z = false;
                }
                C10664xF1.e(z, "overflow");
            }
            return Long.valueOf(longValue);
        }

        @Override // o.W30
        @MB
        /* renamed from: p */
        public Long i(Long l) {
            long longValue = l.longValue();
            if (longValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(longValue - 1);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }
    }

    public static W30<BigInteger> a() {
        return b.Y;
    }

    public static W30<Integer> c() {
        return c.Y;
    }

    public static W30<Long> d() {
        return d.Y;
    }

    public abstract long b(C c2, C c3);

    @InterfaceC6181ey
    public C e() {
        throw new NoSuchElementException();
    }

    @InterfaceC6181ey
    public C f() {
        throw new NoSuchElementException();
    }

    @MB
    public abstract C g(C c2);

    public C h(C c2, long j) {
        C5037aF.c(j, "distance");
        C c3 = c2;
        for (long j2 = 0; j2 < j; j2++) {
            c3 = g(c3);
            if (c3 == null) {
                String valueOf = String.valueOf(c2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 51);
                sb.append("overflowed computing offset(");
                sb.append(valueOf);
                sb.append(C6566gU0.h);
                sb.append(j);
                sb.append(C9811tl1.d);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return c3;
    }

    @MB
    public abstract C i(C c2);

    public W30() {
        this(false);
    }

    public W30(boolean z) {
        this.X = z;
    }
}
