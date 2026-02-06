package o;

@InterfaceC11149zF0
@InterfaceC4238Sm
@InterfaceC8058ma0
/* renamed from: o.Wx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4668Wx1 {
    public final C3907Pc2 a = new C3907Pc2();
    public final C3907Pc2 b = new C3907Pc2();
    public double c = 0.0d;

    public static double d(double d) {
        return D50.f(d, -1.0d, 1.0d);
    }

    public void a(double d, double d2) {
        this.a.a(d);
        if (D50.n(d) && D50.n(d2)) {
            if (this.a.j() > 1) {
                this.c += (d - this.a.l()) * (d2 - this.b.l());
            }
        } else {
            this.c = Double.NaN;
        }
        this.b.a(d2);
    }

    public void b(C4571Vx1 c4571Vx1) {
        if (c4571Vx1.a() == 0) {
            return;
        }
        this.a.d(c4571Vx1.k());
        if (this.b.j() == 0) {
            this.c = c4571Vx1.i();
        } else {
            this.c += c4571Vx1.i() + ((c4571Vx1.k().d() - this.a.l()) * (c4571Vx1.l().d() - this.b.l()) * c4571Vx1.a());
        }
        this.b.d(c4571Vx1.l());
    }

    public long c() {
        return this.a.j();
    }

    public final double e(double d) {
        if (d > 0.0d) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    public final AbstractC10115v01 f() {
        boolean z;
        boolean z2 = false;
        if (c() > 1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        if (Double.isNaN(this.c)) {
            return AbstractC10115v01.a();
        }
        double u = this.a.u();
        if (u > 0.0d) {
            if (this.b.u() > 0.0d) {
                return AbstractC10115v01.f(this.a.l(), this.b.l()).b(this.c / u);
            }
            return AbstractC10115v01.b(this.b.l());
        }
        if (this.b.u() > 0.0d) {
            z2 = true;
        }
        C10664xF1.g0(z2);
        return AbstractC10115v01.i(this.a.l());
    }

    public final double g() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (c() > 1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        if (Double.isNaN(this.c)) {
            return Double.NaN;
        }
        double u = this.a.u();
        double u2 = this.b.u();
        if (u > 0.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.g0(z2);
        if (u2 > 0.0d) {
            z3 = true;
        }
        C10664xF1.g0(z3);
        return d(this.c / Math.sqrt(e(u * u2)));
    }

    public double h() {
        boolean z;
        if (c() != 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        return this.c / c();
    }

    public final double i() {
        boolean z;
        if (c() > 1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        return this.c / (c() - 1);
    }

    public C4571Vx1 j() {
        return new C4571Vx1(this.a.s(), this.b.s(), this.c);
    }

    public C3810Oc2 k() {
        return this.a.s();
    }

    public C3810Oc2 l() {
        return this.b.s();
    }
}
