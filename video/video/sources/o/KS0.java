package o;

import java.util.List;

@NN0
@Z90
@InterfaceC10420wF0(emulated = true)
/* loaded from: classes3.dex */
public final class KS0 {
    public static final SA e = SA.d(".。．｡");
    public static final C5365bb2 f = C5365bb2.h('.');
    public static final C7782lV0 g = C7782lV0.o('.');
    public static final int h = -1;
    public static final int i = 127;
    public static final int j = 253;
    public static final int k = 63;
    public static final SA l;
    public static final SA m;
    public static final SA n;

    /* renamed from: o  reason: collision with root package name */
    public static final SA f515o;
    public final String a;
    public final AbstractC5317bO0<String> b;
    public final int c;
    public final int d;

    static {
        SA d = SA.d("-_");
        l = d;
        SA m2 = SA.m(C3599Ly1.j, '9');
        m = m2;
        SA I = SA.m('a', 'z').I(SA.m('A', 'Z'));
        n = I;
        f515o = m2.I(I).I(d);
    }

    public KS0(String str) {
        boolean z;
        String g2 = C8077mf.g(e.N(str, '.'));
        g2 = g2.endsWith(UE.h) ? g2.substring(0, g2.length() - 1) : g2;
        if (g2.length() <= 253) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.u(z, "Domain name too long: '%s':", g2);
        this.a = g2;
        AbstractC5317bO0<String> D = AbstractC5317bO0.D(f.n(g2));
        this.b = D;
        C10664xF1.u(D.size() <= 127, "Domain has too many parts: '%s'", g2);
        C10664xF1.u(x(D), "Not a valid domain name: '%s'", g2);
        this.c = c(AbstractC4468Uv1.a());
        this.d = c(AbstractC4468Uv1.f(GK1.REGISTRY));
    }

    @InterfaceC6181ey
    public static KS0 d(String str) {
        return new KS0((String) C10664xF1.E(str));
    }

    public static boolean n(String str) {
        try {
            d(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean o(AbstractC4468Uv1<GK1> abstractC4468Uv1, AbstractC4468Uv1<GK1> abstractC4468Uv12) {
        if (abstractC4468Uv1.e()) {
            return abstractC4468Uv1.equals(abstractC4468Uv12);
        }
        return abstractC4468Uv12.e();
    }

    public static boolean p(AbstractC4468Uv1<GK1> abstractC4468Uv1, String str) {
        List<String> o2 = f.f(2).o(str);
        if (o2.size() == 2 && o(abstractC4468Uv1, AbstractC4468Uv1.c(FK1.b.get(o2.get(1))))) {
            return true;
        }
        return false;
    }

    public static boolean w(String str, boolean z) {
        if (str.length() >= 1 && str.length() <= 63) {
            if (!f515o.C(SA.f().P(str))) {
                return false;
            }
            SA sa = l;
            if (!sa.B(str.charAt(0)) && !sa.B(str.charAt(str.length() - 1))) {
                if (z && m.B(str.charAt(0))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean x(List<String> list) {
        int size = list.size() - 1;
        if (!w(list.get(size), true)) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!w(list.get(i2), false)) {
                return false;
            }
        }
        return true;
    }

    public final KS0 a(int i2) {
        C7782lV0 c7782lV0 = g;
        AbstractC5317bO0<String> abstractC5317bO0 = this.b;
        return d(c7782lV0.k(abstractC5317bO0.subList(i2, abstractC5317bO0.size())));
    }

    public KS0 b(String str) {
        String str2 = (String) C10664xF1.E(str);
        String str3 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(UE.h);
        sb.append(str3);
        return d(sb.toString());
    }

    public final int c(AbstractC4468Uv1<GK1> abstractC4468Uv1) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            String k2 = g.k(this.b.subList(i2, size));
            if (!o(abstractC4468Uv1, AbstractC4468Uv1.c(FK1.a.get(k2)))) {
                if (FK1.c.containsKey(k2)) {
                    return i2 + 1;
                }
                if (!p(abstractC4468Uv1, k2)) {
                }
            }
            return i2;
        }
        return -1;
    }

    public boolean e() {
        if (this.b.size() > 1) {
            return true;
        }
        return false;
    }

    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof KS0) {
            return this.a.equals(((KS0) obj).a);
        }
        return false;
    }

    public boolean f() {
        if (this.c != -1) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.d != -1) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean i() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.d == 1) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (this.c == 1) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (this.c > 0) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (this.d > 0) {
            return true;
        }
        return false;
    }

    public KS0 q() {
        C10664xF1.x0(e(), "Domain '%s' has no parent", this.a);
        return a(1);
    }

    public AbstractC5317bO0<String> r() {
        return this.b;
    }

    @MB
    public KS0 s() {
        if (f()) {
            return a(this.c);
        }
        return null;
    }

    @MB
    public KS0 t() {
        if (g()) {
            return a(this.d);
        }
        return null;
    }

    public String toString() {
        return this.a;
    }

    public KS0 u() {
        if (j()) {
            return this;
        }
        C10664xF1.x0(m(), "Not under a registry suffix: %s", this.a);
        return a(this.d - 1);
    }

    public KS0 v() {
        if (k()) {
            return this;
        }
        C10664xF1.x0(l(), "Not under a public suffix: %s", this.a);
        return a(this.c - 1);
    }
}
