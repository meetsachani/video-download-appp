package o;

/* loaded from: classes3.dex */
public final class TN2 extends C11055ys {
    @Override // o.C11055ys, o.InterfaceC2618Cb0
    public void a(C3021Gb0 c3021Gb0) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c3021Gb0.j()) {
                break;
            }
            char d = c3021Gb0.d();
            c3021Gb0.f++;
            d(d, sb);
            if (sb.length() % 3 == 0) {
                C11055ys.g(c3021Gb0, sb);
                if (KH0.o(c3021Gb0.e(), c3021Gb0.f, b()) != b()) {
                    c3021Gb0.p(0);
                    break;
                }
            }
        }
        f(c3021Gb0, sb);
    }

    @Override // o.C11055ys, o.InterfaceC2618Cb0
    public int b() {
        return 3;
    }

    @Override // o.C11055ys
    public int d(char c, StringBuilder sb) {
        if (c != '\r') {
            if (c != ' ') {
                if (c != '*') {
                    if (c != '>') {
                        if (c >= '0' && c <= '9') {
                            sb.append((char) (c - ','));
                        } else if (c >= 'A' && c <= 'Z') {
                            sb.append((char) (c - '3'));
                        } else {
                            KH0.f(c);
                        }
                    } else {
                        sb.append((char) 2);
                    }
                } else {
                    sb.append((char) 1);
                }
            } else {
                sb.append((char) 3);
            }
        } else {
            sb.append((char) 0);
        }
        return 1;
    }

    @Override // o.C11055ys
    public void f(C3021Gb0 c3021Gb0, StringBuilder sb) {
        c3021Gb0.q();
        int b = c3021Gb0.h().b() - c3021Gb0.a();
        c3021Gb0.f -= sb.length();
        if (c3021Gb0.g() > 1 || b > 1 || c3021Gb0.g() != b) {
            c3021Gb0.s((char) 254);
        }
        if (c3021Gb0.f() < 0) {
            c3021Gb0.p(0);
        }
    }
}
