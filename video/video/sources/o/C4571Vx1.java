package o;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@InterfaceC11149zF0
@InterfaceC4238Sm
@InterfaceC8058ma0
/* renamed from: o.Vx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4571Vx1 implements Serializable {
    public static final int Y0 = 88;
    private static final long serialVersionUID = 0;
    public final C3810Oc2 X;
    public final C3810Oc2 Y;
    public final double Z;

    public C4571Vx1(C3810Oc2 c3810Oc2, C3810Oc2 c3810Oc22, double d) {
        this.X = c3810Oc2;
        this.Y = c3810Oc22;
        this.Z = d;
    }

    public static double b(double d) {
        if (d >= 1.0d) {
            return 1.0d;
        }
        if (d <= -1.0d) {
            return -1.0d;
        }
        return d;
    }

    public static double c(double d) {
        if (d > 0.0d) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    public static C4571Vx1 d(byte[] bArr) {
        boolean z;
        C10664xF1.E(bArr);
        if (bArr.length == 88) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.m(z, "Expected PairedStats.BYTES = %s, got %s", 88, bArr.length);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new C4571Vx1(C3810Oc2.r(order), C3810Oc2.r(order), order.getDouble());
    }

    public long a() {
        return this.X.a();
    }

    public AbstractC10115v01 e() {
        boolean z;
        boolean z2 = false;
        if (a() > 1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        if (Double.isNaN(this.Z)) {
            return AbstractC10115v01.a();
        }
        double v = this.X.v();
        if (v > 0.0d) {
            if (this.Y.v() > 0.0d) {
                return AbstractC10115v01.f(this.X.d(), this.Y.d()).b(this.Z / v);
            }
            return AbstractC10115v01.b(this.Y.d());
        }
        if (this.Y.v() > 0.0d) {
            z2 = true;
        }
        C10664xF1.g0(z2);
        return AbstractC10115v01.i(this.X.d());
    }

    public boolean equals(@MB Object obj) {
        if (obj == null || C4571Vx1.class != obj.getClass()) {
            return false;
        }
        C4571Vx1 c4571Vx1 = (C4571Vx1) obj;
        if (!this.X.equals(c4571Vx1.X) || !this.Y.equals(c4571Vx1.Y) || Double.doubleToLongBits(this.Z) != Double.doubleToLongBits(c4571Vx1.Z)) {
            return false;
        }
        return true;
    }

    public double f() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (a() > 1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        if (Double.isNaN(this.Z)) {
            return Double.NaN;
        }
        double v = k().v();
        double v2 = l().v();
        if (v > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.g0(z2);
        if (v2 > 0.0d) {
            z3 = true;
        }
        C10664xF1.g0(z3);
        return b(this.Z / Math.sqrt(c(v * v2)));
    }

    public double g() {
        boolean z;
        if (a() != 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        return this.Z / a();
    }

    public double h() {
        boolean z;
        if (a() > 1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        return this.Z / (a() - 1);
    }

    public int hashCode() {
        return C2593Bt1.b(this.X, this.Y, Double.valueOf(this.Z));
    }

    public double i() {
        return this.Z;
    }

    public byte[] j() {
        ByteBuffer order = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.X.x(order);
        this.Y.x(order);
        order.putDouble(this.Z);
        return order.array();
    }

    public C3810Oc2 k() {
        return this.X;
    }

    public C3810Oc2 l() {
        return this.Y;
    }

    public String toString() {
        if (a() > 0) {
            return C3743Nk1.c(this).f("xStats", this.X).f("yStats", this.Y).b("populationCovariance", g()).toString();
        }
        return C3743Nk1.c(this).f("xStats", this.X).f("yStats", this.Y).toString();
    }
}
