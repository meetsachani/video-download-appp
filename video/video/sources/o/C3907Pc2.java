package o;

import java.util.Iterator;

@InterfaceC11149zF0
@InterfaceC4238Sm
@InterfaceC8058ma0
/* renamed from: o.Pc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3907Pc2 {
    public long a = 0;
    public double b = 0.0d;
    public double c = 0.0d;
    public double d = Double.NaN;
    public double e = Double.NaN;

    public static double i(double d, double d2) {
        if (D50.n(d)) {
            return d2;
        }
        if (!D50.n(d2) && d != d2) {
            return Double.NaN;
        }
        return d;
    }

    public void a(double d) {
        long j = this.a;
        if (j == 0) {
            this.a = 1L;
            this.b = d;
            this.d = d;
            this.e = d;
            if (!D50.n(d)) {
                this.c = Double.NaN;
                return;
            }
            return;
        }
        this.a = j + 1;
        if (D50.n(d) && D50.n(this.b)) {
            double d2 = this.b;
            double d3 = d - d2;
            double d4 = d2 + (d3 / this.a);
            this.b = d4;
            this.c += d3 * (d - d4);
        } else {
            this.b = i(this.b, d);
            this.c = Double.NaN;
        }
        this.d = Math.min(this.d, d);
        this.e = Math.max(this.e, d);
    }

    public void b(Iterable<? extends Number> iterable) {
        for (Number number : iterable) {
            a(number.doubleValue());
        }
    }

    public void c(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            a(it.next().doubleValue());
        }
    }

    public void d(C3810Oc2 c3810Oc2) {
        if (c3810Oc2.a() == 0) {
            return;
        }
        m(c3810Oc2.a(), c3810Oc2.d(), c3810Oc2.v(), c3810Oc2.j(), c3810Oc2.c());
    }

    public void e(C3907Pc2 c3907Pc2) {
        if (c3907Pc2.j() == 0) {
            return;
        }
        m(c3907Pc2.j(), c3907Pc2.l(), c3907Pc2.u(), c3907Pc2.n(), c3907Pc2.k());
    }

    public void f(double... dArr) {
        for (double d : dArr) {
            a(d);
        }
    }

    public void g(int... iArr) {
        for (int i : iArr) {
            a(i);
        }
    }

    public void h(long... jArr) {
        for (long j : jArr) {
            a(j);
        }
    }

    public long j() {
        return this.a;
    }

    public double k() {
        boolean z;
        if (this.a != 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        return this.e;
    }

    public double l() {
        boolean z;
        if (this.a != 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        return this.b;
    }

    public final void m(long j, double d, double d2, double d3, double d4) {
        long j2 = this.a;
        if (j2 == 0) {
            this.a = j;
            this.b = d;
            this.c = d2;
            this.d = d3;
            this.e = d4;
            return;
        }
        this.a = j2 + j;
        if (D50.n(this.b) && D50.n(d)) {
            double d5 = this.b;
            double d6 = d - d5;
            double d7 = j;
            double d8 = d5 + ((d6 * d7) / this.a);
            this.b = d8;
            this.c += d2 + (d6 * (d - d8) * d7);
        } else {
            this.b = i(this.b, d);
            this.c = Double.NaN;
        }
        this.d = Math.min(this.d, d3);
        this.e = Math.max(this.e, d4);
    }

    public double n() {
        boolean z;
        if (this.a != 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        return this.d;
    }

    public final double o() {
        return Math.sqrt(p());
    }

    public final double p() {
        boolean z;
        if (this.a != 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        if (Double.isNaN(this.c)) {
            return Double.NaN;
        }
        if (this.a == 1) {
            return 0.0d;
        }
        return C10866y50.b(this.c) / this.a;
    }

    public final double q() {
        return Math.sqrt(r());
    }

    public final double r() {
        boolean z;
        if (this.a > 1) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.g0(z);
        if (Double.isNaN(this.c)) {
            return Double.NaN;
        }
        return C10866y50.b(this.c) / (this.a - 1);
    }

    public C3810Oc2 s() {
        return new C3810Oc2(this.a, this.b, this.c, this.d, this.e);
    }

    public final double t() {
        return this.b * this.a;
    }

    public double u() {
        return this.c;
    }
}
