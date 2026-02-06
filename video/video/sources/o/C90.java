package o;

/* loaded from: classes3.dex */
public final class C90 implements InterfaceC2618Cb0 {
    public static void c(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c >= '@' && c <= '^') {
            sb.append((char) (c - C11304zt1.a));
        } else {
            KH0.f(c);
        }
    }

    private static String d(CharSequence charSequence, int i) {
        char c;
        char c2;
        int length = charSequence.length() - i;
        if (length != 0) {
            char charAt = charSequence.charAt(i);
            char c3 = 0;
            if (length >= 2) {
                c = charSequence.charAt(i + 1);
            } else {
                c = 0;
            }
            if (length >= 3) {
                c2 = charSequence.charAt(i + 2);
            } else {
                c2 = 0;
            }
            if (length >= 4) {
                c3 = charSequence.charAt(i + 3);
            }
            int i2 = (charAt << 18) + (c << '\f') + (c2 << 6) + c3;
            char c4 = (char) ((i2 >> 8) & 255);
            char c5 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i2 >> 16) & 255));
            if (length >= 2) {
                sb.append(c4);
            }
            if (length >= 3) {
                sb.append(c5);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    public static void e(C3021Gb0 c3021Gb0, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z = true;
            if (length == 1) {
                c3021Gb0.q();
                int b = c3021Gb0.h().b() - c3021Gb0.a();
                int g = c3021Gb0.g();
                if (g > b) {
                    c3021Gb0.r(c3021Gb0.a() + 1);
                    b = c3021Gb0.h().b() - c3021Gb0.a();
                }
                if (g <= b && b <= 2) {
                    return;
                }
            }
            if (length <= 4) {
                int i = length - 1;
                String d = d(charSequence, 0);
                if (c3021Gb0.j() || i > 2) {
                    z = false;
                }
                if (i <= 2) {
                    c3021Gb0.r(c3021Gb0.a() + i);
                    if (c3021Gb0.h().b() - c3021Gb0.a() >= 3) {
                        c3021Gb0.r(c3021Gb0.a() + d.length());
                        z = false;
                    }
                }
                if (z) {
                    c3021Gb0.l();
                    c3021Gb0.f -= i;
                } else {
                    c3021Gb0.t(d);
                }
                return;
            }
            throw new IllegalStateException("Count must not exceed 4");
        } finally {
            c3021Gb0.p(0);
        }
    }

    @Override // o.InterfaceC2618Cb0
    public void a(C3021Gb0 c3021Gb0) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c3021Gb0.j()) {
                break;
            }
            c(c3021Gb0.d(), sb);
            c3021Gb0.f++;
            if (sb.length() >= 4) {
                c3021Gb0.t(d(sb, 0));
                sb.delete(0, 4);
                if (KH0.o(c3021Gb0.e(), c3021Gb0.f, b()) != b()) {
                    c3021Gb0.p(0);
                    break;
                }
            }
        }
        sb.append(VN2.b);
        e(c3021Gb0, sb);
    }

    @Override // o.InterfaceC2618Cb0
    public int b() {
        return 4;
    }
}
