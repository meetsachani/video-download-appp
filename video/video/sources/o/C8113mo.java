package o;

import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.mo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8113mo {
    public static int a(int i, int i2, double d) {
        C4460Ut b = C4460Ut.b(i);
        C4460Ut b2 = C4460Ut.b(i2);
        double n = b.n();
        double i3 = b.i();
        double j = b.j();
        return C4460Ut.f(n + ((b2.n() - n) * d), i3 + ((b2.i() - i3) * d), j + ((b2.j() - j) * d)).r();
    }

    public static int b(int i, int i2) {
        JG0 b = JG0.b(i);
        JG0 b2 = JG0.b(i2);
        return JG0.a(C8558od1.g(b.d() + (Math.min(C8558od1.c(b.d(), b2.d()) * 0.5d, 15.0d) * C8558od1.f(b.d(), b2.d()))), b.c(), b.e()).k();
    }

    public static int c(int i, int i2, double d) {
        return JG0.a(C4460Ut.b(a(i, i2, d)).l(), C4460Ut.b(i).k(), C9448sG.o(i)).k();
    }
}
