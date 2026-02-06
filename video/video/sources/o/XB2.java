package o;

import java.math.BigInteger;

@InterfaceC5116aa0
@InterfaceC10420wF0(emulated = true)
/* loaded from: classes3.dex */
public final class XB2 extends Number implements Comparable<XB2> {
    public final int X;
    public static final XB2 Y = i(0);
    public static final XB2 Z = i(1);
    public static final XB2 Y0 = i(-1);

    public XB2(int i) {
        this.X = i;
    }

    public static XB2 i(int i) {
        return new XB2(i);
    }

    public static XB2 p(long j) {
        boolean z;
        if ((4294967295L & j) == j) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.p(z, "value (%s) is outside the range for an unsigned integer value", j);
        return i((int) j);
    }

    public static XB2 q(String str) {
        return r(str, 10);
    }

    public static XB2 r(String str, int i) {
        return i(YB2.k(str, i));
    }

    public static XB2 s(BigInteger bigInteger) {
        boolean z;
        C10664xF1.E(bigInteger);
        if (bigInteger.signum() >= 0 && bigInteger.bitLength() <= 32) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.u(z, "value (%s) is outside the range for an unsigned integer value", bigInteger);
        return i(bigInteger.intValue());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return longValue();
    }

    public BigInteger e() {
        return BigInteger.valueOf(longValue());
    }

    public boolean equals(@MB Object obj) {
        if (!(obj instanceof XB2) || this.X != ((XB2) obj).X) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) longValue();
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(XB2 xb2) {
        C10664xF1.E(xb2);
        return YB2.b(this.X, xb2.X);
    }

    public XB2 h(XB2 xb2) {
        return i(YB2.d(this.X, ((XB2) C10664xF1.E(xb2)).X));
    }

    public int hashCode() {
        return this.X;
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.X;
    }

    public XB2 j(XB2 xb2) {
        return i(this.X - ((XB2) C10664xF1.E(xb2)).X);
    }

    public XB2 l(XB2 xb2) {
        return i(YB2.l(this.X, ((XB2) C10664xF1.E(xb2)).X));
    }

    @Override // java.lang.Number
    public long longValue() {
        return YB2.r(this.X);
    }

    public XB2 m(XB2 xb2) {
        return i(this.X + ((XB2) C10664xF1.E(xb2)).X);
    }

    @InterfaceC11149zF0
    public XB2 n(XB2 xb2) {
        return i(this.X * ((XB2) C10664xF1.E(xb2)).X);
    }

    public String o(int i) {
        return YB2.t(this.X, i);
    }

    public String toString() {
        return o(10);
    }
}
