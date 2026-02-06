package o;

import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public final class JG0 {
    public double a;
    public double b;
    public double c;
    public int d;

    public JG0(int i) {
        i(i);
    }

    public static JG0 a(double d, double d2, double d3) {
        return new JG0(KG0.r(d, d2, d3));
    }

    public static JG0 b(int i) {
        return new JG0(i);
    }

    public double c() {
        return this.b;
    }

    public double d() {
        return this.a;
    }

    public double e() {
        return this.c;
    }

    public JG0 f(OI2 oi2) {
        double[] t = C4460Ut.b(k()).t(oi2, null);
        C4460Ut h = C4460Ut.h(t[0], t[1], t[2], OI2.k);
        return a(h.l(), h.k(), C9448sG.p(t[1]));
    }

    public void g(double d) {
        i(KG0.r(this.a, d, this.c));
    }

    public void h(double d) {
        i(KG0.r(d, this.b, this.c));
    }

    public final void i(int i) {
        this.d = i;
        C4460Ut b = C4460Ut.b(i);
        this.a = b.l();
        this.b = b.k();
        this.c = C9448sG.o(i);
    }

    public void j(double d) {
        i(KG0.r(this.a, this.b, d));
    }

    public int k() {
        return this.d;
    }
}
