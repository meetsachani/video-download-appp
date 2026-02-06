package o;

import java.io.Serializable;
import java.math.BigInteger;

@InterfaceC5116aa0
@InterfaceC10420wF0(serializable = true)
/* renamed from: o.aC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5028aC2 extends Number implements Comparable<C5028aC2>, Serializable {
    public static final long Y = Long.MAX_VALUE;
    public final long X;
    public static final C5028aC2 Z = new C5028aC2(0);
    public static final C5028aC2 Y0 = new C5028aC2(1);
    public static final C5028aC2 Z0 = new C5028aC2(-1);

    public C5028aC2(long j) {
        this.X = j;
    }

    public static C5028aC2 i(long j) {
        return new C5028aC2(j);
    }

    @InterfaceC6181ey
    public static C5028aC2 p(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "value (%s) is outside the range for an unsigned long value", j);
        return i(j);
    }

    @InterfaceC6181ey
    public static C5028aC2 q(String str) {
        return r(str, 10);
    }

    @InterfaceC6181ey
    public static C5028aC2 r(String str, int i) {
        return i(C5271bC2.j(str, i));
    }

    @InterfaceC6181ey
    public static C5028aC2 s(BigInteger bigInteger) {
        boolean z;
        C10664xF1.E(bigInteger);
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 64) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.u(z, "value (%s) is outside the range for an unsigned long value", bigInteger);
        return i(bigInteger.longValue());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j = this.X;
        if (j >= 0) {
            return j;
        }
        return ((j & 1) | (j >>> 1)) * 2.0d;
    }

    public BigInteger e() {
        BigInteger valueOf = BigInteger.valueOf(this.X & Long.MAX_VALUE);
        if (this.X < 0) {
            return valueOf.setBit(63);
        }
        return valueOf;
    }

    public boolean equals(@MB Object obj) {
        if (!(obj instanceof C5028aC2) || this.X != ((C5028aC2) obj).X) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j = this.X;
        if (j >= 0) {
            return (float) j;
        }
        return ((float) ((j & 1) | (j >>> 1))) * 2.0f;
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(C5028aC2 c5028aC2) {
        C10664xF1.E(c5028aC2);
        return C5271bC2.a(this.X, c5028aC2.X);
    }

    public C5028aC2 h(C5028aC2 c5028aC2) {
        return i(C5271bC2.c(this.X, ((C5028aC2) C10664xF1.E(c5028aC2)).X));
    }

    public int hashCode() {
        return C7194j51.k(this.X);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.X;
    }

    public C5028aC2 j(C5028aC2 c5028aC2) {
        return i(this.X - ((C5028aC2) C10664xF1.E(c5028aC2)).X);
    }

    public C5028aC2 l(C5028aC2 c5028aC2) {
        return i(C5271bC2.k(this.X, ((C5028aC2) C10664xF1.E(c5028aC2)).X));
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.X;
    }

    public C5028aC2 m(C5028aC2 c5028aC2) {
        return i(this.X + ((C5028aC2) C10664xF1.E(c5028aC2)).X);
    }

    public C5028aC2 n(C5028aC2 c5028aC2) {
        return i(this.X * ((C5028aC2) C10664xF1.E(c5028aC2)).X);
    }

    public String o(int i) {
        return C5271bC2.q(this.X, i);
    }

    public String toString() {
        return C5271bC2.p(this.X);
    }
}
