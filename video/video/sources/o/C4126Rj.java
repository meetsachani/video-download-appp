package o;

import java.io.IOException;
import java.util.ArrayList;
import o.C10833xx0;
import o.KZ1;

@Deprecated
/* renamed from: o.Rj  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4126Rj implements InterfaceC4324Tj0 {
    public static final int A = 1263424842;
    public static final int B = 1718776947;
    public static final int C = 1852994675;
    public static final int D = 1752331379;
    public static final int E = 1935963489;
    public static final int F = 1937012852;
    public static final int G = 1935960438;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 2;
    public static final int K = 3;
    public static final int L = 4;
    public static final int M = 5;
    public static final int N = 6;
    public static final int O = 16;
    public static final long P = 262144;
    public static final String r = "AviExtractor";
    public static final int s = 1179011410;
    public static final int t = 541677121;
    public static final int u = 1414744396;
    public static final int v = 1751742049;
    public static final int w = 1819436136;
    public static final int x = 1819440243;
    public static final int y = 1769369453;
    public static final int z = 829973609;
    public int f;
    public C4226Sj h;
    public long k;
    @InterfaceC11300zs1
    public C7220jC l;
    public int p;
    public boolean q;
    public final C3012Fy1 d = new C3012Fy1(12);
    public final c e = new c();
    public InterfaceC4518Vj0 g = new V70();
    public C7220jC[] j = new C7220jC[0];
    public long n = -1;

    /* renamed from: o  reason: collision with root package name */
    public long f600o = -1;
    public int m = -1;
    public long i = C10323vs.b;

    /* renamed from: o.Rj$b */
    /* loaded from: classes2.dex */
    public class b implements KZ1 {
        public final long d;

        public b(long j) {
            this.d = j;
        }

        @Override // o.KZ1
        public KZ1.a e(long j) {
            KZ1.a i = C4126Rj.this.j[0].i(j);
            for (int i2 = 1; i2 < C4126Rj.this.j.length; i2++) {
                KZ1.a i3 = C4126Rj.this.j[i2].i(j);
                if (i3.a.b < i.a.b) {
                    i = i3;
                }
            }
            return i;
        }

        @Override // o.KZ1
        public boolean h() {
            return true;
        }

        @Override // o.KZ1
        public long i() {
            return this.d;
        }
    }

    /* renamed from: o.Rj$c */
    /* loaded from: classes2.dex */
    public static class c {
        public int a;
        public int b;
        public int c;

        public c() {
        }

        public void a(C3012Fy1 c3012Fy1) {
            this.a = c3012Fy1.w();
            this.b = c3012Fy1.w();
            this.c = 0;
        }

        public void b(C3012Fy1 c3012Fy1) throws C3989Py1 {
            a(c3012Fy1);
            if (this.a == 1414744396) {
                this.c = c3012Fy1.w();
                return;
            }
            throw C3989Py1.a("LIST expected, found: " + this.a, null);
        }
    }

    public static void e(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        if ((interfaceC4421Uj0.getPosition() & 1) == 1) {
            interfaceC4421Uj0.t(1);
        }
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        this.k = -1L;
        this.l = null;
        for (C7220jC c7220jC : this.j) {
            c7220jC.q(j);
        }
        if (j == 0) {
            if (this.j.length == 0) {
                this.f = 0;
                return;
            } else {
                this.f = 3;
                return;
            }
        }
        this.f = 6;
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.f = 0;
        this.g = interfaceC4518Vj0;
        this.k = -1L;
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        interfaceC4421Uj0.x(this.d.e(), 0, 12);
        this.d.Y(0);
        if (this.d.w() != 1179011410) {
            return false;
        }
        this.d.Z(4);
        if (this.d.w() != 541677121) {
            return false;
        }
        return true;
    }

    @InterfaceC11300zs1
    public final C7220jC f(int i) {
        C7220jC[] c7220jCArr;
        for (C7220jC c7220jC : this.j) {
            if (c7220jC.j(i)) {
                return c7220jC;
            }
        }
        return null;
    }

    public final void h(C3012Fy1 c3012Fy1) throws IOException {
        O01 c2 = O01.c(w, c3012Fy1);
        if (c2.getType() == 1819436136) {
            C4226Sj c4226Sj = (C4226Sj) c2.b(C4226Sj.class);
            if (c4226Sj != null) {
                this.h = c4226Sj;
                this.i = c4226Sj.c * c4226Sj.a;
                ArrayList arrayList = new ArrayList();
                AbstractC6237fB2<InterfaceC4029Qj> it = c2.a.iterator();
                int i = 0;
                while (it.hasNext()) {
                    InterfaceC4029Qj next = it.next();
                    if (next.getType() == 1819440243) {
                        int i2 = i + 1;
                        C7220jC l = l((O01) next, i);
                        if (l != null) {
                            arrayList.add(l);
                        }
                        i = i2;
                    }
                }
                this.j = (C7220jC[]) arrayList.toArray(new C7220jC[0]);
                this.g.n();
                return;
            }
            throw C3989Py1.a("AviHeader not found", null);
        }
        throw C3989Py1.a("Unexpected header list type " + c2.getType(), null);
    }

    public final void i(C3012Fy1 c3012Fy1) {
        long k = k(c3012Fy1);
        while (c3012Fy1.a() >= 16) {
            int w2 = c3012Fy1.w();
            int w3 = c3012Fy1.w();
            long w4 = c3012Fy1.w() + k;
            c3012Fy1.w();
            C7220jC f = f(w2);
            if (f != null) {
                if ((w3 & 16) == 16) {
                    f.b(w4);
                }
                f.k();
            }
        }
        for (C7220jC c7220jC : this.j) {
            c7220jC.c();
        }
        this.q = true;
        this.g.p(new b(this.i));
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        if (n(interfaceC4421Uj0, ke1)) {
            return 1;
        }
        switch (this.f) {
            case 0:
                if (d(interfaceC4421Uj0)) {
                    interfaceC4421Uj0.t(12);
                    this.f = 1;
                    return 0;
                }
                throw C3989Py1.a("AVI Header List not found", null);
            case 1:
                interfaceC4421Uj0.readFully(this.d.e(), 0, 12);
                this.d.Y(0);
                this.e.b(this.d);
                c cVar = this.e;
                if (cVar.c == 1819436136) {
                    this.m = cVar.b;
                    this.f = 2;
                    return 0;
                }
                throw C3989Py1.a("hdrl expected, found: " + this.e.c, null);
            case 2:
                int i = this.m - 4;
                C3012Fy1 c3012Fy1 = new C3012Fy1(i);
                interfaceC4421Uj0.readFully(c3012Fy1.e(), 0, i);
                h(c3012Fy1);
                this.f = 3;
                return 0;
            case 3:
                if (this.n != -1) {
                    long position = interfaceC4421Uj0.getPosition();
                    long j = this.n;
                    if (position != j) {
                        this.k = j;
                        return 0;
                    }
                }
                interfaceC4421Uj0.x(this.d.e(), 0, 12);
                interfaceC4421Uj0.i();
                this.d.Y(0);
                this.e.a(this.d);
                int w2 = this.d.w();
                int i2 = this.e.a;
                if (i2 == 1179011410) {
                    interfaceC4421Uj0.t(12);
                    return 0;
                } else if (i2 == 1414744396 && w2 == 1769369453) {
                    long position2 = interfaceC4421Uj0.getPosition();
                    this.n = position2;
                    this.f600o = position2 + this.e.b + 8;
                    if (!this.q) {
                        if (((C4226Sj) C9542sf.g(this.h)).a()) {
                            this.f = 4;
                            this.k = this.f600o;
                            return 0;
                        }
                        this.g.p(new KZ1.b(this.i));
                        this.q = true;
                    }
                    this.k = interfaceC4421Uj0.getPosition() + 12;
                    this.f = 6;
                    return 0;
                } else {
                    this.k = interfaceC4421Uj0.getPosition() + this.e.b + 8;
                    return 0;
                }
            case 4:
                interfaceC4421Uj0.readFully(this.d.e(), 0, 8);
                this.d.Y(0);
                int w3 = this.d.w();
                int w4 = this.d.w();
                if (w3 == 829973609) {
                    this.f = 5;
                    this.p = w4;
                } else {
                    this.k = interfaceC4421Uj0.getPosition() + w4;
                }
                return 0;
            case 5:
                C3012Fy1 c3012Fy12 = new C3012Fy1(this.p);
                interfaceC4421Uj0.readFully(c3012Fy12.e(), 0, this.p);
                i(c3012Fy12);
                this.f = 6;
                this.k = this.n;
                return 0;
            case 6:
                return m(interfaceC4421Uj0);
            default:
                throw new AssertionError();
        }
    }

    public final long k(C3012Fy1 c3012Fy1) {
        long j = 0;
        if (c3012Fy1.a() < 16) {
            return 0L;
        }
        int f = c3012Fy1.f();
        c3012Fy1.Z(8);
        long j2 = this.n;
        if (c3012Fy1.w() <= j2) {
            j = j2 + 8;
        }
        c3012Fy1.Y(f);
        return j;
    }

    @InterfaceC11300zs1
    public final C7220jC l(O01 o01, int i) {
        C4323Tj c4323Tj = (C4323Tj) o01.b(C4323Tj.class);
        C2628Cd2 c2628Cd2 = (C2628Cd2) o01.b(C2628Cd2.class);
        if (c4323Tj == null) {
            I31.n(r, "Missing Stream Header");
            return null;
        } else if (c2628Cd2 == null) {
            I31.n(r, "Missing Stream Format");
            return null;
        } else {
            long a2 = c4323Tj.a();
            C10833xx0 c10833xx0 = c2628Cd2.a;
            C10833xx0.b b2 = c10833xx0.b();
            b2.T(i);
            int i2 = c4323Tj.f;
            if (i2 != 0) {
                b2.Y(i2);
            }
            C3325Jd2 c3325Jd2 = (C3325Jd2) o01.b(C3325Jd2.class);
            if (c3325Jd2 != null) {
                b2.W(c3325Jd2.a);
            }
            int l = C4128Rj1.l(c10833xx0.g1);
            if (l != 1 && l != 2) {
                return null;
            }
            InterfaceC10568wr2 b3 = this.g.b(i, l);
            b3.a(b2.G());
            C7220jC c7220jC = new C7220jC(i, l, a2, c4323Tj.e, b3);
            this.i = a2;
            return c7220jC;
        }
    }

    public final int m(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        if (interfaceC4421Uj0.getPosition() >= this.f600o) {
            return -1;
        }
        C7220jC c7220jC = this.l;
        if (c7220jC != null) {
            if (c7220jC.o(interfaceC4421Uj0)) {
                this.l = null;
            }
        } else {
            e(interfaceC4421Uj0);
            int i = 12;
            interfaceC4421Uj0.x(this.d.e(), 0, 12);
            this.d.Y(0);
            int w2 = this.d.w();
            if (w2 == 1414744396) {
                this.d.Y(8);
                if (this.d.w() != 1769369453) {
                    i = 8;
                }
                interfaceC4421Uj0.t(i);
                interfaceC4421Uj0.i();
                return 0;
            }
            int w3 = this.d.w();
            if (w2 == 1263424842) {
                this.k = interfaceC4421Uj0.getPosition() + w3 + 8;
                return 0;
            }
            interfaceC4421Uj0.t(8);
            interfaceC4421Uj0.i();
            C7220jC f = f(w2);
            if (f == null) {
                this.k = interfaceC4421Uj0.getPosition() + w3;
                return 0;
            }
            f.p(w3);
            this.l = f;
        }
        return 0;
    }

    public final boolean n(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        boolean z2;
        if (this.k != -1) {
            long position = interfaceC4421Uj0.getPosition();
            long j = this.k;
            if (j >= position && j <= 262144 + position) {
                interfaceC4421Uj0.t((int) (j - position));
            } else {
                ke1.a = j;
                z2 = true;
                this.k = -1L;
                return z2;
            }
        }
        z2 = false;
        this.k = -1L;
        return z2;
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }
}
