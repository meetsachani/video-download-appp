package o;

/* loaded from: classes3.dex */
public final class FC0 {
    public final C10792xn a;
    public final C8761pS b = new C8761pS();
    public final StringBuilder c = new StringBuilder();

    public FC0(C10792xn c10792xn) {
        this.a = c10792xn;
    }

    public static int g(C10792xn c10792xn, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (c10792xn.i(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    public String a(StringBuilder sb, int i) throws C9349rr1, C2605Bx0 {
        String str;
        String str2 = null;
        while (true) {
            C6571gW c = c(i, str2);
            String a = C10797xo0.a(c.b());
            if (a != null) {
                sb.append(a);
            }
            if (c.d()) {
                str = String.valueOf(c.c());
            } else {
                str = null;
            }
            if (i != c.a()) {
                i = c.a();
                str2 = str;
            } else {
                return sb.toString();
            }
        }
    }

    public final C6316fW b(int i) {
        char c;
        int f = f(i, 5);
        if (f == 15) {
            return new C6316fW(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C6316fW(i + 5, (char) (f + 43));
        }
        int f2 = f(i, 6);
        if (f2 >= 32 && f2 < 58) {
            return new C6316fW(i + 6, (char) (f2 + 33));
        }
        switch (f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(f2)));
        }
        return new C6316fW(i + 6, c);
    }

    public C6571gW c(int i, String str) throws C2605Bx0 {
        this.c.setLength(0);
        if (str != null) {
            this.c.append(str);
        }
        this.b.i(i);
        C6571gW o2 = o();
        if (o2 != null && o2.d()) {
            return new C6571gW(this.b.a(), this.c.toString(), o2.c());
        }
        return new C6571gW(this.b.a(), this.c.toString());
    }

    public final C6316fW d(int i) throws C2605Bx0 {
        int f = f(i, 5);
        if (f == 15) {
            return new C6316fW(i + 5, '$');
        }
        char c = '+';
        if (f >= 5 && f < 15) {
            return new C6316fW(i + 5, (char) (f + 43));
        }
        int f2 = f(i, 7);
        if (f2 >= 64 && f2 < 90) {
            return new C6316fW(i + 7, (char) (f2 + 1));
        }
        if (f2 >= 90 && f2 < 116) {
            return new C6316fW(i + 7, (char) (f2 + 7));
        }
        switch (f(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case C10997yd1.u1 /* 238 */:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                break;
            case C10997yd1.o2 /* 241 */:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = C10928yK2.l;
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = '=';
                break;
            case C9680tD0.j /* 249 */:
                c = '>';
                break;
            case 250:
                c = '?';
                break;
            case C10997yd1.w1 /* 251 */:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw C2605Bx0.a();
        }
        return new C6316fW(i + 8, c);
    }

    public final C6814hW e(int i) throws C2605Bx0 {
        int i2 = i + 7;
        if (i2 > this.a.m()) {
            int f = f(i, 4);
            if (f == 0) {
                return new C6814hW(this.a.m(), 10, 10);
            }
            return new C6814hW(this.a.m(), f - 1, 10);
        }
        int f2 = f(i, 7) - 8;
        return new C6814hW(i2, f2 / 11, f2 % 11);
    }

    public int f(int i, int i2) {
        return g(this.a, i, i2);
    }

    public final boolean h(int i) {
        int i2 = i + 3;
        if (i2 > this.a.m()) {
            return false;
        }
        while (i < i2) {
            if (this.a.i(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final boolean i(int i) {
        int i2;
        if (i + 1 > this.a.m()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.a.m(); i3++) {
            if (i3 == 2) {
                if (!this.a.i(i + 2)) {
                    return false;
                }
            } else if (this.a.i(i2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(int i) {
        int i2;
        if (i + 1 > this.a.m()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.a.m(); i3++) {
            if (this.a.i(i2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(int i) {
        int f;
        if (i + 5 > this.a.m()) {
            return false;
        }
        int f2 = f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 6 > this.a.m() || (f = f(i, 6)) < 16 || f >= 63) {
            return false;
        }
        return true;
    }

    public final boolean l(int i) {
        int f;
        if (i + 5 > this.a.m()) {
            return false;
        }
        int f2 = f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 7 > this.a.m()) {
            return false;
        }
        int f3 = f(i, 7);
        if (f3 >= 64 && f3 < 116) {
            return true;
        }
        if (i + 8 > this.a.m() || (f = f(i, 8)) < 232 || f >= 253) {
            return false;
        }
        return true;
    }

    public final boolean m(int i) {
        if (i + 7 > this.a.m()) {
            if (i + 4 <= this.a.m()) {
                return true;
            }
            return false;
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 < i3) {
                if (this.a.i(i2)) {
                    return true;
                }
                i2++;
            } else {
                return this.a.i(i3);
            }
        }
    }

    public final C9335ro n() {
        while (k(this.b.a())) {
            C6316fW b = b(this.b.a());
            this.b.i(b.a());
            if (b.c()) {
                return new C9335ro(new C6571gW(this.b.a(), this.c.toString()), true);
            }
            this.c.append(b.b());
        }
        if (h(this.b.a())) {
            this.b.b(3);
            this.b.h();
        } else if (i(this.b.a())) {
            if (this.b.a() + 5 < this.a.m()) {
                this.b.b(5);
            } else {
                this.b.i(this.a.m());
            }
            this.b.g();
        }
        return new C9335ro(false);
    }

    public final C6571gW o() throws C2605Bx0 {
        C9335ro q;
        boolean b;
        do {
            int a = this.b.a();
            if (this.b.c()) {
                q = n();
                b = q.b();
            } else if (this.b.d()) {
                q = p();
                b = q.b();
            } else {
                q = q();
                b = q.b();
            }
            if (a != this.b.a() || b) {
                break;
                break;
            }
            break;
        } while (!b);
        return q.a();
    }

    public final C9335ro p() throws C2605Bx0 {
        while (l(this.b.a())) {
            C6316fW d = d(this.b.a());
            this.b.i(d.a());
            if (d.c()) {
                return new C9335ro(new C6571gW(this.b.a(), this.c.toString()), true);
            }
            this.c.append(d.b());
        }
        if (h(this.b.a())) {
            this.b.b(3);
            this.b.h();
        } else if (i(this.b.a())) {
            if (this.b.a() + 5 < this.a.m()) {
                this.b.b(5);
            } else {
                this.b.i(this.a.m());
            }
            this.b.f();
        }
        return new C9335ro(false);
    }

    public final C9335ro q() throws C2605Bx0 {
        C6571gW c6571gW;
        while (m(this.b.a())) {
            C6814hW e = e(this.b.a());
            this.b.i(e.a());
            if (e.f()) {
                if (e.g()) {
                    c6571gW = new C6571gW(this.b.a(), this.c.toString());
                } else {
                    c6571gW = new C6571gW(this.b.a(), this.c.toString(), e.c());
                }
                return new C9335ro(c6571gW, true);
            }
            this.c.append(e.b());
            if (e.g()) {
                return new C9335ro(new C6571gW(this.b.a(), this.c.toString()), true);
            }
            this.c.append(e.c());
        }
        if (j(this.b.a())) {
            this.b.f();
            this.b.b(4);
        }
        return new C9335ro(false);
    }
}
