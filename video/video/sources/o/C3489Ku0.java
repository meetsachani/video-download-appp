package o;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.C3586Lu0;
import o.C3684Mu0;
import o.KZ1;

@Deprecated
/* renamed from: o.Ku0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3489Ku0 implements InterfaceC4324Tj0 {
    public static final int A = -1;
    public static final InterfaceC4809Yj0 r = new InterfaceC4809Yj0() { // from class: o.Ju0
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return C3489Ku0.c();
        }
    };
    public static final int s = 1;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;
    public static final int w = 3;
    public static final int x = 4;
    public static final int y = 5;
    public static final int z = 32768;
    public final byte[] d;
    public final C3012Fy1 e;
    public final boolean f;
    public final C3586Lu0.a g;
    public InterfaceC4518Vj0 h;
    public InterfaceC10568wr2 i;
    public int j;
    @InterfaceC11300zs1
    public C4224Si1 k;
    public C3976Pu0 l;
    public int m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public C3195Hu0 f523o;
    public int p;
    public long q;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Ku0$a */
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public C3489Ku0() {
        this(0);
    }

    public static /* synthetic */ InterfaceC4324Tj0[] c() {
        return new InterfaceC4324Tj0[]{new C3489Ku0()};
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.j = 0;
        } else {
            C3195Hu0 c3195Hu0 = this.f523o;
            if (c3195Hu0 != null) {
                c3195Hu0.h(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.q = j3;
        this.p = 0;
        this.e.U(0);
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.h = interfaceC4518Vj0;
        this.i = interfaceC4518Vj0.b(0, 1);
        interfaceC4518Vj0.n();
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        C3684Mu0.c(interfaceC4421Uj0, false);
        return C3684Mu0.a(interfaceC4421Uj0);
    }

    public final long e(C3012Fy1 c3012Fy1, boolean z2) {
        boolean z3;
        C9542sf.g(this.l);
        int f = c3012Fy1.f();
        while (f <= c3012Fy1.g() - 16) {
            c3012Fy1.Y(f);
            if (C3586Lu0.d(c3012Fy1, this.l, this.n, this.g)) {
                c3012Fy1.Y(f);
                return this.g.a;
            }
            f++;
        }
        if (z2) {
            while (f <= c3012Fy1.g() - this.m) {
                c3012Fy1.Y(f);
                boolean z4 = false;
                try {
                    z3 = C3586Lu0.d(c3012Fy1, this.l, this.n, this.g);
                } catch (IndexOutOfBoundsException unused) {
                    z3 = false;
                }
                if (c3012Fy1.f() <= c3012Fy1.g()) {
                    z4 = z3;
                }
                if (z4) {
                    c3012Fy1.Y(f);
                    return this.g.a;
                }
                f++;
            }
            c3012Fy1.Y(c3012Fy1.g());
            return -1L;
        }
        c3012Fy1.Y(f);
        return -1L;
    }

    public final void f(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        this.n = C3684Mu0.b(interfaceC4421Uj0);
        ((InterfaceC4518Vj0) TD2.o(this.h)).p(h(interfaceC4421Uj0.getPosition(), interfaceC4421Uj0.getLength()));
        this.j = 5;
    }

    public final KZ1 h(long j, long j2) {
        C9542sf.g(this.l);
        C3976Pu0 c3976Pu0 = this.l;
        if (c3976Pu0.k != null) {
            return new C3879Ou0(c3976Pu0, j);
        }
        if (j2 != -1 && c3976Pu0.j > 0) {
            C3195Hu0 c3195Hu0 = new C3195Hu0(c3976Pu0, this.n, j, j2);
            this.f523o = c3195Hu0;
            return c3195Hu0.b();
        }
        return new KZ1.b(c3976Pu0.h());
    }

    public final void i(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        byte[] bArr = this.d;
        interfaceC4421Uj0.x(bArr, 0, bArr.length);
        interfaceC4421Uj0.i();
        this.j = 2;
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        int i = this.j;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return l(interfaceC4421Uj0, ke1);
                            }
                            throw new IllegalStateException();
                        }
                        f(interfaceC4421Uj0);
                        return 0;
                    }
                    n(interfaceC4421Uj0);
                    return 0;
                }
                o(interfaceC4421Uj0);
                return 0;
            }
            i(interfaceC4421Uj0);
            return 0;
        }
        m(interfaceC4421Uj0);
        return 0;
    }

    public final void k() {
        ((InterfaceC10568wr2) TD2.o(this.i)).b((this.q * 1000000) / ((C3976Pu0) TD2.o(this.l)).e, 1, this.p, 0, null);
    }

    public final int l(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        boolean z2;
        C9542sf.g(this.i);
        C9542sf.g(this.l);
        C3195Hu0 c3195Hu0 = this.f523o;
        if (c3195Hu0 != null && c3195Hu0.d()) {
            return this.f523o.c(interfaceC4421Uj0, ke1);
        }
        if (this.q == -1) {
            this.q = C3586Lu0.i(interfaceC4421Uj0, this.l);
            return 0;
        }
        int g = this.e.g();
        if (g < 32768) {
            int read = interfaceC4421Uj0.read(this.e.e(), g, 32768 - g);
            if (read == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                this.e.X(g + read);
            } else if (this.e.a() == 0) {
                k();
                return -1;
            }
        } else {
            z2 = false;
        }
        int f = this.e.f();
        int i = this.p;
        int i2 = this.m;
        if (i < i2) {
            C3012Fy1 c3012Fy1 = this.e;
            c3012Fy1.Z(Math.min(i2 - i, c3012Fy1.a()));
        }
        long e = e(this.e, z2);
        int f2 = this.e.f() - f;
        this.e.Y(f);
        this.i.e(this.e, f2);
        this.p += f2;
        if (e != -1) {
            k();
            this.p = 0;
            this.q = e;
        }
        if (this.e.a() < 16) {
            int a2 = this.e.a();
            System.arraycopy(this.e.e(), this.e.f(), this.e.e(), 0, a2);
            this.e.Y(0);
            this.e.X(a2);
        }
        return 0;
    }

    public final void m(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        this.k = C3684Mu0.d(interfaceC4421Uj0, !this.f);
        this.j = 1;
    }

    public final void n(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        C3684Mu0.a aVar = new C3684Mu0.a(this.l);
        boolean z2 = false;
        while (!z2) {
            z2 = C3684Mu0.e(interfaceC4421Uj0, aVar);
            this.l = (C3976Pu0) TD2.o(aVar.a);
        }
        C9542sf.g(this.l);
        this.m = Math.max(this.l.c, 6);
        ((InterfaceC10568wr2) TD2.o(this.i)).a(this.l.i(this.d, this.k));
        this.j = 4;
    }

    public final void o(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        C3684Mu0.i(interfaceC4421Uj0);
        this.j = 3;
    }

    public C3489Ku0(int i) {
        this.d = new byte[42];
        this.e = new C3012Fy1(new byte[32768], 0);
        this.f = (i & 1) != 0;
        this.g = new C3586Lu0.a();
        this.j = 0;
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }
}
