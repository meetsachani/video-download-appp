package o;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

@InterfaceC11149zF0
@InterfaceC4238Sm
@InterfaceC8058ma0
/* renamed from: o.Oc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3810Oc2 implements Serializable {
    public static final int a1 = 40;
    private static final long serialVersionUID = 0;
    public final long X;
    public final double Y;
    public final double Y0;
    public final double Z;
    public final double Z0;

    public C3810Oc2(long j, double d, double d2, double d3, double d4) {
        this.X = j;
        this.Y = d;
        this.Z = d2;
        this.Y0 = d3;
        this.Z0 = d4;
    }

    public static C3810Oc2 b(byte[] bArr) {
        boolean z;
        C10664xF1.E(bArr);
        if (bArr.length == 40) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "Expected Stats.BYTES = %s remaining , got %s", 40, bArr.length);
        return r(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double e(Iterable<? extends Number> iterable) {
        return f(iterable.iterator());
    }

    public static double f(Iterator<? extends Number> it) {
        C10664xF1.d(it.hasNext());
        double doubleValue = it.next().doubleValue();
        long j = 1;
        while (it.hasNext()) {
            double doubleValue2 = it.next().doubleValue();
            j++;
            if (D50.n(doubleValue2) && D50.n(doubleValue)) {
                doubleValue += (doubleValue2 - doubleValue) / j;
            } else {
                doubleValue = C3907Pc2.i(doubleValue, doubleValue2);
            }
        }
        return doubleValue;
    }

    public static double g(double... dArr) {
        boolean z;
        if (dArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        double d = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            double d2 = dArr[i];
            if (D50.n(d2) && D50.n(d)) {
                d += (d2 - d) / (i + 1);
            } else {
                d = C3907Pc2.i(d, d2);
            }
        }
        return d;
    }

    public static double h(int... iArr) {
        boolean z;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        double d = iArr[0];
        for (int i = 1; i < iArr.length; i++) {
            double d2 = iArr[i];
            if (D50.n(d2) && D50.n(d)) {
                d += (d2 - d) / (i + 1);
            } else {
                d = C3907Pc2.i(d, d2);
            }
        }
        return d;
    }

    public static double i(long... jArr) {
        boolean z;
        if (jArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        double d = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            double d2 = jArr[i];
            if (D50.n(d2) && D50.n(d)) {
                d += (d2 - d) / (i + 1);
            } else {
                d = C3907Pc2.i(d, d2);
            }
        }
        return d;
    }

    public static C3810Oc2 k(Iterable<? extends Number> iterable) {
        C3907Pc2 c3907Pc2 = new C3907Pc2();
        c3907Pc2.b(iterable);
        return c3907Pc2.s();
    }

    public static C3810Oc2 l(Iterator<? extends Number> it) {
        C3907Pc2 c3907Pc2 = new C3907Pc2();
        c3907Pc2.c(it);
        return c3907Pc2.s();
    }

    public static C3810Oc2 m(double... dArr) {
        C3907Pc2 c3907Pc2 = new C3907Pc2();
        c3907Pc2.f(dArr);
        return c3907Pc2.s();
    }

    public static C3810Oc2 n(int... iArr) {
        C3907Pc2 c3907Pc2 = new C3907Pc2();
        c3907Pc2.g(iArr);
        return c3907Pc2.s();
    }

    public static C3810Oc2 o(long... jArr) {
        C3907Pc2 c3907Pc2 = new C3907Pc2();
        c3907Pc2.h(jArr);
        return c3907Pc2.s();
    }

    public static C3810Oc2 r(ByteBuffer byteBuffer) {
        boolean z;
        C10664xF1.E(byteBuffer);
        if (byteBuffer.remaining() >= 40) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        return new C3810Oc2(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    public long a() {
        return this.X;
    }

    public double c() {
        boolean z;
        if (this.X != 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        return this.Z0;
    }

    public double d() {
        boolean z;
        if (this.X != 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        return this.Y;
    }

    public boolean equals(@MB Object obj) {
        if (obj == null || C3810Oc2.class != obj.getClass()) {
            return false;
        }
        C3810Oc2 c3810Oc2 = (C3810Oc2) obj;
        if (this.X != c3810Oc2.X || Double.doubleToLongBits(this.Y) != Double.doubleToLongBits(c3810Oc2.Y) || Double.doubleToLongBits(this.Z) != Double.doubleToLongBits(c3810Oc2.Z) || Double.doubleToLongBits(this.Y0) != Double.doubleToLongBits(c3810Oc2.Y0) || Double.doubleToLongBits(this.Z0) != Double.doubleToLongBits(c3810Oc2.Z0)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2593Bt1.b(Long.valueOf(this.X), Double.valueOf(this.Y), Double.valueOf(this.Z), Double.valueOf(this.Y0), Double.valueOf(this.Z0));
    }

    public double j() {
        boolean z;
        if (this.X != 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        return this.Y0;
    }

    public double p() {
        return Math.sqrt(q());
    }

    public double q() {
        boolean z;
        if (this.X > 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        if (Double.isNaN(this.Z)) {
            return Double.NaN;
        }
        if (this.X == 1) {
            return 0.0d;
        }
        return C10866y50.b(this.Z) / a();
    }

    public double s() {
        return Math.sqrt(t());
    }

    public double t() {
        boolean z;
        if (this.X > 1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        if (Double.isNaN(this.Z)) {
            return Double.NaN;
        }
        return C10866y50.b(this.Z) / (this.X - 1);
    }

    public String toString() {
        if (a() > 0) {
            return C3743Nk1.c(this).e("count", this.X).b("mean", this.Y).b("populationStandardDeviation", p()).b("min", this.Y0).b("max", this.Z0).toString();
        }
        return C3743Nk1.c(this).e("count", this.X).toString();
    }

    public double u() {
        return this.Y * this.X;
    }

    public double v() {
        return this.Z;
    }

    public byte[] w() {
        ByteBuffer order = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        x(order);
        return order.array();
    }

    public void x(ByteBuffer byteBuffer) {
        boolean z;
        C10664xF1.E(byteBuffer);
        if (byteBuffer.remaining() >= 40) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.X).putDouble(this.Y).putDouble(this.Z).putDouble(this.Y0).putDouble(this.Z0);
    }
}
