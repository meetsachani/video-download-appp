package o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
@InterfaceC6480g82(version = "1.3")
/* renamed from: o.xN1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10696xN1 {
    @NotNull
    public static final a X = new a(null);
    @NotNull
    public static final AbstractC10696xN1 Y = C9195rD1.a.b();

    /* renamed from: o.xN1$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC10696xN1 implements Serializable {

        /* renamed from: o.xN1$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0355a implements Serializable {
            @NotNull
            public static final C0355a X = new C0355a();
            private static final long serialVersionUID = 0;

            private final Object readResolve() {
                return AbstractC10696xN1.X;
            }
        }

        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        private final Object writeReplace() {
            return C0355a.X;
        }

        @Override // o.AbstractC10696xN1
        public int b(int i) {
            return AbstractC10696xN1.Y.b(i);
        }

        @Override // o.AbstractC10696xN1
        public boolean c() {
            return AbstractC10696xN1.Y.c();
        }

        @Override // o.AbstractC10696xN1
        @NotNull
        public byte[] d(int i) {
            return AbstractC10696xN1.Y.d(i);
        }

        @Override // o.AbstractC10696xN1
        @NotNull
        public byte[] e(@NotNull byte[] bArr) {
            C6562gT0.p(bArr, "array");
            return AbstractC10696xN1.Y.e(bArr);
        }

        @Override // o.AbstractC10696xN1
        @NotNull
        public byte[] f(@NotNull byte[] bArr, int i, int i2) {
            C6562gT0.p(bArr, "array");
            return AbstractC10696xN1.Y.f(bArr, i, i2);
        }

        @Override // o.AbstractC10696xN1
        public double h() {
            return AbstractC10696xN1.Y.h();
        }

        @Override // o.AbstractC10696xN1
        public double i(double d) {
            return AbstractC10696xN1.Y.i(d);
        }

        @Override // o.AbstractC10696xN1
        public double j(double d, double d2) {
            return AbstractC10696xN1.Y.j(d, d2);
        }

        @Override // o.AbstractC10696xN1
        public float k() {
            return AbstractC10696xN1.Y.k();
        }

        @Override // o.AbstractC10696xN1
        public int l() {
            return AbstractC10696xN1.Y.l();
        }

        @Override // o.AbstractC10696xN1
        public int m(int i) {
            return AbstractC10696xN1.Y.m(i);
        }

        @Override // o.AbstractC10696xN1
        public int n(int i, int i2) {
            return AbstractC10696xN1.Y.n(i, i2);
        }

        @Override // o.AbstractC10696xN1
        public long o() {
            return AbstractC10696xN1.Y.o();
        }

        @Override // o.AbstractC10696xN1
        public long p(long j) {
            return AbstractC10696xN1.Y.p(j);
        }

        @Override // o.AbstractC10696xN1
        public long q(long j, long j2) {
            return AbstractC10696xN1.Y.q(j, j2);
        }

        public a() {
        }
    }

    public static /* synthetic */ byte[] g(AbstractC10696xN1 abstractC10696xN1, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return abstractC10696xN1.f(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
    }

    public abstract int b(int i);

    public boolean c() {
        if (b(1) != 0) {
            return true;
        }
        return false;
    }

    @NotNull
    public byte[] d(int i) {
        return e(new byte[i]);
    }

    @NotNull
    public byte[] e(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "array");
        return f(bArr, 0, bArr.length);
    }

    @NotNull
    public byte[] f(@NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "array");
        if (i >= 0 && i <= bArr.length && i2 >= 0 && i2 <= bArr.length) {
            if (i <= i2) {
                int i3 = (i2 - i) / 4;
                for (int i4 = 0; i4 < i3; i4++) {
                    int l = l();
                    bArr[i] = (byte) l;
                    bArr[i + 1] = (byte) (l >>> 8);
                    bArr[i + 2] = (byte) (l >>> 16);
                    bArr[i + 3] = (byte) (l >>> 24);
                    i += 4;
                }
                int i5 = i2 - i;
                int b = b(i5 * 8);
                for (int i6 = 0; i6 < i5; i6++) {
                    bArr[i + i6] = (byte) (b >>> (i6 * 8));
                }
                return bArr;
            }
            throw new IllegalArgumentException(("fromIndex (" + i + ") must be not greater than toIndex (" + i2 + ").").toString());
        }
        throw new IllegalArgumentException(("fromIndex (" + i + ") or toIndex (" + i2 + ") are out of range: 0.." + bArr.length + '.').toString());
    }

    public double h() {
        return C9681tD1.d(b(26), b(27));
    }

    public double i(double d) {
        return j(0.0d, d);
    }

    public double j(double d, double d2) {
        double h;
        JN1.d(d, d2);
        double d3 = d2 - d;
        if (Double.isInfinite(d3) && Math.abs(d) <= Double.MAX_VALUE && Math.abs(d2) <= Double.MAX_VALUE) {
            double d4 = 2;
            double h2 = h() * ((d2 / d4) - (d / d4));
            h = d + h2 + h2;
        } else {
            h = d + (h() * d3);
        }
        if (h >= d2) {
            return Math.nextAfter(d2, Double.NEGATIVE_INFINITY);
        }
        return h;
    }

    public float k() {
        return b(24) / 1.6777216E7f;
    }

    public int l() {
        return b(32);
    }

    public int m(int i) {
        return n(0, i);
    }

    public int n(int i, int i2) {
        int l;
        int i3;
        int i4;
        JN1.e(i, i2);
        int i5 = i2 - i;
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            if (((-i5) & i5) == i5) {
                i4 = b(JN1.g(i5));
            } else {
                do {
                    l = l() >>> 1;
                    i3 = l % i5;
                } while ((l - i3) + (i5 - 1) < 0);
                i4 = i3;
            }
            return i + i4;
        }
        while (true) {
            int l2 = l();
            if (i <= l2 && l2 < i2) {
                return l2;
            }
        }
    }

    public long o() {
        return (l() << 32) + l();
    }

    public long p(long j) {
        return q(0L, j);
    }

    public long q(long j, long j2) {
        long o2;
        long j3;
        long j4;
        int l;
        JN1.f(j, j2);
        long j5 = j2 - j;
        if (j5 > 0) {
            if (((-j5) & j5) == j5) {
                int i = (int) j5;
                int i2 = (int) (j5 >>> 32);
                if (i != 0) {
                    l = b(JN1.g(i));
                } else if (i2 == 1) {
                    l = l();
                } else {
                    j4 = (b(JN1.g(i2)) << 32) + (l() & 4294967295L);
                }
                j4 = l & 4294967295L;
            } else {
                do {
                    o2 = o() >>> 1;
                    j3 = o2 % j5;
                } while ((o2 - j3) + (j5 - 1) < 0);
                j4 = j3;
            }
            return j + j4;
        }
        while (true) {
            long o3 = o();
            if (j <= o3 && o3 < j2) {
                return o3;
            }
        }
    }
}
