package o;

/* renamed from: o.ys  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C11055ys implements InterfaceC2618Cb0 {
    public static String e(CharSequence charSequence, int i) {
        int charAt = (charSequence.charAt(i) * 1600) + (charSequence.charAt(i + 1) * '(') + charSequence.charAt(i + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    public static void g(C3021Gb0 c3021Gb0, StringBuilder sb) {
        c3021Gb0.t(e(sb, 0));
        sb.delete(0, 3);
    }

    @Override // o.InterfaceC2618Cb0
    public void a(C3021Gb0 c3021Gb0) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c3021Gb0.j()) {
                break;
            }
            char d = c3021Gb0.d();
            c3021Gb0.f++;
            int d2 = d(d, sb);
            int a = c3021Gb0.a() + ((sb.length() / 3) << 1);
            c3021Gb0.r(a);
            int b = c3021Gb0.h().b() - a;
            if (!c3021Gb0.j()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (b < 2 || b > 2)) {
                    d2 = c(c3021Gb0, sb, sb2, d2);
                }
                while (sb.length() % 3 == 1 && ((d2 <= 3 && b != 1) || d2 > 3)) {
                    d2 = c(c3021Gb0, sb, sb2, d2);
                }
            } else if (sb.length() % 3 == 0 && KH0.o(c3021Gb0.e(), c3021Gb0.f, b()) != b()) {
                c3021Gb0.p(0);
                break;
            }
        }
        f(c3021Gb0, sb);
    }

    @Override // o.InterfaceC2618Cb0
    public int b() {
        return 1;
    }

    public final int c(C3021Gb0 c3021Gb0, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        c3021Gb0.f--;
        int d = d(c3021Gb0.d(), sb2);
        c3021Gb0.l();
        return d;
    }

    public int d(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        } else if (c < ' ') {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        } else if (c >= '`' && c <= 127) {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        } else {
            sb.append("\u0001\u001e");
            return d((char) (c - 128), sb) + 2;
        }
    }

    public void f(C3021Gb0 c3021Gb0, StringBuilder sb) {
        int length = sb.length() % 3;
        int a = c3021Gb0.a() + ((sb.length() / 3) << 1);
        c3021Gb0.r(a);
        int b = c3021Gb0.h().b() - a;
        if (length == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                g(c3021Gb0, sb);
            }
            if (c3021Gb0.j()) {
                c3021Gb0.s((char) 254);
            }
        } else if (b == 1 && length == 1) {
            while (sb.length() >= 3) {
                g(c3021Gb0, sb);
            }
            if (c3021Gb0.j()) {
                c3021Gb0.s((char) 254);
            }
            c3021Gb0.f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                g(c3021Gb0, sb);
            }
            if (b > 0 || c3021Gb0.j()) {
                c3021Gb0.s((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        c3021Gb0.p(0);
    }
}
