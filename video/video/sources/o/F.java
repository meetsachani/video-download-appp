package o;

/* loaded from: classes3.dex */
public final class F implements InterfaceC2618Cb0 {
    public static char c(char c, char c2) {
        if (KH0.g(c) && KH0.g(c2)) {
            return (char) (((c - '0') * 10) + (c2 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c + c2);
    }

    @Override // o.InterfaceC2618Cb0
    public void a(C3021Gb0 c3021Gb0) {
        if (KH0.a(c3021Gb0.e(), c3021Gb0.f) >= 2) {
            c3021Gb0.s(c(c3021Gb0.e().charAt(c3021Gb0.f), c3021Gb0.e().charAt(c3021Gb0.f + 1)));
            c3021Gb0.f += 2;
            return;
        }
        char d = c3021Gb0.d();
        int o2 = KH0.o(c3021Gb0.e(), c3021Gb0.f, b());
        if (o2 != b()) {
            if (o2 != 1) {
                if (o2 != 2) {
                    if (o2 != 3) {
                        if (o2 != 4) {
                            if (o2 == 5) {
                                c3021Gb0.s(KH0.c);
                                c3021Gb0.p(5);
                                return;
                            }
                            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(o2)));
                        }
                        c3021Gb0.s(KH0.i);
                        c3021Gb0.p(4);
                        return;
                    }
                    c3021Gb0.s(KH0.g);
                    c3021Gb0.p(3);
                    return;
                }
                c3021Gb0.s(KH0.h);
                c3021Gb0.p(2);
                return;
            }
            c3021Gb0.s(KH0.b);
            c3021Gb0.p(1);
        } else if (KH0.h(d)) {
            c3021Gb0.s(KH0.d);
            c3021Gb0.s((char) (d - 127));
            c3021Gb0.f++;
        } else {
            c3021Gb0.s((char) (d + 1));
            c3021Gb0.f++;
        }
    }

    @Override // o.InterfaceC2618Cb0
    public int b() {
        return 0;
    }
}
