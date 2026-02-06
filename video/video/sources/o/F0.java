package o;

/* loaded from: classes3.dex */
public abstract class F0 {
    public final C10792xn a;
    public final FC0 b;

    public F0(C10792xn c10792xn) {
        this.a = c10792xn;
        this.b = new FC0(c10792xn);
    }

    public static F0 a(C10792xn c10792xn) {
        if (c10792xn.i(1)) {
            return new C10601x(c10792xn);
        }
        if (!c10792xn.i(2)) {
            return new C8787pa(c10792xn);
        }
        int g = FC0.g(c10792xn, 1, 4);
        if (g != 4) {
            if (g != 5) {
                int g2 = FC0.g(c10792xn, 1, 5);
                if (g2 != 12) {
                    if (g2 != 13) {
                        switch (FC0.g(c10792xn, 1, 7)) {
                            case 56:
                                return new C10112v(c10792xn, "310", "11");
                            case 57:
                                return new C10112v(c10792xn, "320", "11");
                            case 58:
                                return new C10112v(c10792xn, "310", "13");
                            case 59:
                                return new C10112v(c10792xn, "320", "13");
                            case 60:
                                return new C10112v(c10792xn, "310", "15");
                            case 61:
                                return new C10112v(c10792xn, "320", "15");
                            case 62:
                                return new C10112v(c10792xn, "310", "17");
                            case 63:
                                return new C10112v(c10792xn, "320", "17");
                            default:
                                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(c10792xn)));
                        }
                    }
                    return new C9869u(c10792xn);
                }
                return new C9626t(c10792xn);
            }
            return new C9383s(c10792xn);
        }
        return new r(c10792xn);
    }

    public final FC0 b() {
        return this.b;
    }

    public final C10792xn c() {
        return this.a;
    }

    public abstract String d() throws C9349rr1, C2605Bx0;
}
