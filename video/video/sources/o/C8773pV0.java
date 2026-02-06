package o;

import java.io.IOException;
import o.C10833xx0;
import o.C4224Si1;
import o.KZ1;

@Deprecated
/* renamed from: o.pV0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8773pV0 implements InterfaceC4324Tj0 {
    public static final int A = 1024;
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f834o = 1;
    public static final int p = 2;
    public static final int q = 4;
    public static final int r = 5;
    public static final int s = 6;
    public static final int t = 6;
    public static final long u = 1165519206;
    public static final int v = 65496;
    public static final int w = 65498;
    public static final int x = 65504;
    public static final int y = 65505;
    public static final String z = "http://ns.adobe.com/xap/1.0/";
    public InterfaceC4518Vj0 e;
    public int f;
    public int g;
    public int h;
    @InterfaceC11300zs1
    public C8103ml1 j;
    public InterfaceC4421Uj0 k;
    public C5611cc2 l;
    @InterfaceC11300zs1
    public C2561Bl1 m;
    public final C3012Fy1 d = new C3012Fy1(6);
    public long i = -1;

    @InterfaceC11300zs1
    public static C8103ml1 f(String str, long j) throws IOException {
        C7842ll1 a;
        if (j == -1 || (a = C6046eO2.a(str)) == null) {
            return null;
        }
        return a.a(j);
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        if (j == 0) {
            this.f = 0;
            this.m = null;
        } else if (this.f == 5) {
            ((C2561Bl1) C9542sf.g(this.m)).a(j, j2);
        }
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.e = interfaceC4518Vj0;
    }

    public final void c(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        this.d.U(2);
        interfaceC4421Uj0.x(this.d.e(), 0, 2);
        interfaceC4421Uj0.p(this.d.R() - 2);
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        if (i(interfaceC4421Uj0) != 65496) {
            return false;
        }
        int i = i(interfaceC4421Uj0);
        this.g = i;
        if (i == 65504) {
            c(interfaceC4421Uj0);
            this.g = i(interfaceC4421Uj0);
        }
        if (this.g != 65505) {
            return false;
        }
        interfaceC4421Uj0.p(2);
        this.d.U(6);
        interfaceC4421Uj0.x(this.d.e(), 0, 6);
        if (this.d.N() != u || this.d.R() != 0) {
            return false;
        }
        return true;
    }

    public final void e() {
        h(new C4224Si1.b[0]);
        ((InterfaceC4518Vj0) C9542sf.g(this.e)).n();
        this.e.p(new KZ1.b(C10323vs.b));
        this.f = 6;
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
        C2561Bl1 c2561Bl1 = this.m;
        if (c2561Bl1 != null) {
            c2561Bl1.g();
        }
    }

    public final void h(C4224Si1.b... bVarArr) {
        ((InterfaceC4518Vj0) C9542sf.g(this.e)).b(1024, 4).a(new C10833xx0.b().M(C4128Rj1.R0).Z(new C4224Si1(bVarArr)).G());
    }

    public final int i(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        this.d.U(2);
        interfaceC4421Uj0.x(this.d.e(), 0, 2);
        return this.d.R();
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i == 6) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.l == null || interfaceC4421Uj0 != this.k) {
                            this.k = interfaceC4421Uj0;
                            this.l = new C5611cc2(interfaceC4421Uj0, this.i);
                        }
                        int j = ((C2561Bl1) C9542sf.g(this.m)).j(this.l, ke1);
                        if (j == 1) {
                            ke1.a += this.i;
                        }
                        return j;
                    }
                    long position = interfaceC4421Uj0.getPosition();
                    long j2 = this.i;
                    if (position != j2) {
                        ke1.a = j2;
                        return 1;
                    }
                    n(interfaceC4421Uj0);
                    return 0;
                }
                l(interfaceC4421Uj0);
                return 0;
            }
            m(interfaceC4421Uj0);
            return 0;
        }
        k(interfaceC4421Uj0);
        return 0;
    }

    public final void k(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        this.d.U(2);
        interfaceC4421Uj0.readFully(this.d.e(), 0, 2);
        int R = this.d.R();
        this.g = R;
        if (R == 65498) {
            if (this.i != -1) {
                this.f = 4;
            } else {
                e();
            }
        } else if ((R < 65488 || R > 65497) && R != 65281) {
            this.f = 1;
        }
    }

    public final void l(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        String F;
        if (this.g == 65505) {
            C3012Fy1 c3012Fy1 = new C3012Fy1(this.h);
            interfaceC4421Uj0.readFully(c3012Fy1.e(), 0, this.h);
            if (this.j == null && z.equals(c3012Fy1.F()) && (F = c3012Fy1.F()) != null) {
                C8103ml1 f = f(F, interfaceC4421Uj0.getLength());
                this.j = f;
                if (f != null) {
                    this.i = f.Y0;
                }
            }
        } else {
            interfaceC4421Uj0.t(this.h);
        }
        this.f = 0;
    }

    public final void m(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        this.d.U(2);
        interfaceC4421Uj0.readFully(this.d.e(), 0, 2);
        this.h = this.d.R() - 2;
        this.f = 2;
    }

    public final void n(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        if (!interfaceC4421Uj0.h(this.d.e(), 0, 1, true)) {
            e();
            return;
        }
        interfaceC4421Uj0.i();
        if (this.m == null) {
            this.m = new C2561Bl1();
        }
        C5611cc2 c5611cc2 = new C5611cc2(interfaceC4421Uj0, this.i);
        this.l = c5611cc2;
        if (this.m.d(c5611cc2)) {
            this.m.b(new C5854dc2(this.i, (InterfaceC4518Vj0) C9542sf.g(this.e)));
            o();
            return;
        }
        e();
    }

    public final void o() {
        h((C4224Si1.b) C9542sf.g(this.j));
        this.f = 5;
    }
}
