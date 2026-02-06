package o;

import java.io.IOException;
import o.KZ1;

@Deprecated
/* renamed from: o.Aw0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2504Aw0 implements InterfaceC4324Tj0 {
    public static final int A = 8;
    public static final int B = 9;
    public static final int C = 18;
    public static final int D = 4607062;
    public static final InterfaceC4809Yj0 t = new InterfaceC4809Yj0() { // from class: o.zw0
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return C2504Aw0.c();
        }
    };
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    public static final int x = 4;
    public static final int y = 9;
    public static final int z = 11;
    public InterfaceC4518Vj0 i;
    public boolean k;
    public long l;
    public int m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f414o;
    public long p;
    public boolean q;
    public C3631Mh r;
    public RG2 s;
    public final C3012Fy1 d = new C3012Fy1(4);
    public final C3012Fy1 e = new C3012Fy1(9);
    public final C3012Fy1 f = new C3012Fy1(11);
    public final C3012Fy1 g = new C3012Fy1();
    public final TY1 h = new TY1();
    public int j = 1;

    public static /* synthetic */ InterfaceC4324Tj0[] c() {
        return new InterfaceC4324Tj0[]{new C2504Aw0()};
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        if (j == 0) {
            this.j = 1;
            this.k = false;
        } else {
            this.j = 3;
        }
        this.m = 0;
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.i = interfaceC4518Vj0;
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        interfaceC4421Uj0.x(this.d.e(), 0, 3);
        this.d.Y(0);
        if (this.d.O() != 4607062) {
            return false;
        }
        interfaceC4421Uj0.x(this.d.e(), 0, 2);
        this.d.Y(0);
        if ((this.d.R() & 250) != 0) {
            return false;
        }
        interfaceC4421Uj0.x(this.d.e(), 0, 4);
        this.d.Y(0);
        int s = this.d.s();
        interfaceC4421Uj0.i();
        interfaceC4421Uj0.p(s);
        interfaceC4421Uj0.x(this.d.e(), 0, 4);
        this.d.Y(0);
        if (this.d.s() != 0) {
            return false;
        }
        return true;
    }

    @HS1({"extractorOutput"})
    public final void e() {
        if (!this.q) {
            this.i.p(new KZ1.b(C10323vs.b));
            this.q = true;
        }
    }

    public final long f() {
        if (this.k) {
            return this.l + this.p;
        }
        if (this.h.e() == C10323vs.b) {
            return 0L;
        }
        return this.p;
    }

    public final C3012Fy1 h(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        if (this.f414o > this.g.b()) {
            C3012Fy1 c3012Fy1 = this.g;
            c3012Fy1.W(new byte[Math.max(c3012Fy1.b() * 2, this.f414o)], 0);
        } else {
            this.g.Y(0);
        }
        this.g.X(this.f414o);
        interfaceC4421Uj0.readFully(this.g.e(), 0, this.f414o);
        return this.g;
    }

    @HS1({"extractorOutput"})
    public final boolean i(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        boolean z2;
        boolean z3 = false;
        if (!interfaceC4421Uj0.j(this.e.e(), 0, 9, true)) {
            return false;
        }
        this.e.Y(0);
        this.e.Z(4);
        int L = this.e.L();
        if ((L & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((L & 1) != 0) {
            z3 = true;
        }
        if (z2 && this.r == null) {
            this.r = new C3631Mh(this.i.b(8, 1));
        }
        if (z3 && this.s == null) {
            this.s = new RG2(this.i.b(9, 2));
        }
        this.i.n();
        this.m = this.e.s() - 5;
        this.j = 2;
        return true;
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        C9542sf.k(this.i);
        while (true) {
            int i = this.j;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (k(interfaceC4421Uj0)) {
                                return 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (!l(interfaceC4421Uj0)) {
                        return -1;
                    }
                } else {
                    m(interfaceC4421Uj0);
                }
            } else if (!i(interfaceC4421Uj0)) {
                return -1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    @HS1({"extractorOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        boolean z2;
        boolean z3;
        long j;
        long f = f();
        int i = this.n;
        if (i == 8 && this.r != null) {
            e();
            z2 = this.r.a(h(interfaceC4421Uj0), f);
        } else if (i == 9 && this.s != null) {
            e();
            z2 = this.s.a(h(interfaceC4421Uj0), f);
        } else if (i == 18 && !this.q) {
            z2 = this.h.a(h(interfaceC4421Uj0), f);
            long e = this.h.e();
            if (e != C10323vs.b) {
                this.i.p(new C8507oP0(this.h.f(), this.h.g(), e));
                this.q = true;
            }
        } else {
            interfaceC4421Uj0.t(this.f414o);
            z2 = false;
            z3 = false;
            if (!this.k && z2) {
                this.k = true;
                if (this.h.e() != C10323vs.b) {
                    j = -this.p;
                } else {
                    j = 0;
                }
                this.l = j;
            }
            this.m = 4;
            this.j = 2;
            return z3;
        }
        z3 = true;
        if (!this.k) {
            this.k = true;
            if (this.h.e() != C10323vs.b) {
            }
            this.l = j;
        }
        this.m = 4;
        this.j = 2;
        return z3;
    }

    public final boolean l(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        if (!interfaceC4421Uj0.j(this.f.e(), 0, 11, true)) {
            return false;
        }
        this.f.Y(0);
        this.n = this.f.L();
        this.f414o = this.f.O();
        this.p = this.f.O();
        this.p = ((this.f.L() << 24) | this.p) * 1000;
        this.f.Z(3);
        this.j = 4;
        return true;
    }

    public final void m(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        interfaceC4421Uj0.t(this.m);
        this.m = 0;
        this.j = 3;
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }
}
