package o;

import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o.KZ1;
import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class L7 implements InterfaceC4324Tj0 {
    public static final InterfaceC4809Yj0 p = new InterfaceC4809Yj0() { // from class: o.K7
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return L7.c();
        }
    };
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 2048;
    public static final int t = 8192;
    public static final int u = 1000;
    public final int d;
    public final M7 e;
    public final C3012Fy1 f;
    public final C3012Fy1 g;
    public final C2903Ey1 h;
    public InterfaceC4518Vj0 i;
    public long j;
    public long k;
    public int l;
    public boolean m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f527o;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    public L7() {
        this(0);
    }

    public static /* synthetic */ InterfaceC4324Tj0[] c() {
        return new InterfaceC4324Tj0[]{new L7()};
    }

    private static int f(int i, long j) {
        return (int) ((i * 8000000) / j);
    }

    private KZ1 h(long j, boolean z) {
        return new C7999mK(j, this.k, f(this.l, this.e.k()), this.l, z);
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        this.n = false;
        this.e.b();
        this.j = j2;
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.i = interfaceC4518Vj0;
        this.e.d(interfaceC4518Vj0, new Yu2.e(0, 1));
        interfaceC4518Vj0.n();
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        int k = k(interfaceC4421Uj0);
        int i = k;
        int i2 = 0;
        int i3 = 0;
        do {
            interfaceC4421Uj0.x(this.g.e(), 0, 2);
            this.g.Y(0);
            if (!M7.m(this.g.R())) {
                i++;
                interfaceC4421Uj0.i();
                interfaceC4421Uj0.p(i);
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                interfaceC4421Uj0.x(this.g.e(), 0, 4);
                this.h.q(14);
                int h = this.h.h(13);
                if (h <= 6) {
                    i++;
                    interfaceC4421Uj0.i();
                    interfaceC4421Uj0.p(i);
                } else {
                    interfaceC4421Uj0.p(h - 6);
                    i3 += h;
                }
            }
            i2 = 0;
            i3 = 0;
        } while (i - k < 8192);
        return false;
    }

    public final void e(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        int h;
        if (this.m) {
            return;
        }
        this.l = -1;
        interfaceC4421Uj0.i();
        long j = 0;
        if (interfaceC4421Uj0.getPosition() == 0) {
            k(interfaceC4421Uj0);
        }
        int i = 0;
        int i2 = 0;
        do {
            try {
                if (!interfaceC4421Uj0.h(this.g.e(), 0, 2, true)) {
                    break;
                }
                this.g.Y(0);
                if (!M7.m(this.g.R())) {
                    break;
                } else if (!interfaceC4421Uj0.h(this.g.e(), 0, 4, true)) {
                    break;
                } else {
                    this.h.q(14);
                    h = this.h.h(13);
                    if (h > 6) {
                        j += h;
                        i2++;
                        if (i2 == 1000) {
                            break;
                        }
                    } else {
                        this.m = true;
                        throw C3989Py1.a("Malformed ADTS stream", null);
                    }
                }
            } catch (EOFException unused) {
            }
        } while (interfaceC4421Uj0.v(h - 6, true));
        i = i2;
        interfaceC4421Uj0.i();
        if (i > 0) {
            this.l = (int) (j / i);
        } else {
            this.l = -1;
        }
        this.m = true;
    }

    @HS1({"extractorOutput"})
    public final void i(long j, boolean z) {
        boolean z2;
        if (!this.f527o) {
            boolean z3 = false;
            if ((this.d & 1) != 0 && this.l > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && this.e.k() == C10323vs.b && !z) {
                return;
            }
            if (z2 && this.e.k() != C10323vs.b) {
                InterfaceC4518Vj0 interfaceC4518Vj0 = this.i;
                if ((this.d & 2) != 0) {
                    z3 = true;
                }
                interfaceC4518Vj0.p(h(j, z3));
            } else {
                this.i.p(new KZ1.b(C10323vs.b));
            }
            this.f527o = true;
        }
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        boolean z;
        C9542sf.k(this.i);
        long length = interfaceC4421Uj0.getLength();
        int i = this.d;
        if ((i & 2) != 0 || ((i & 1) != 0 && length != -1)) {
            e(interfaceC4421Uj0);
        }
        int read = interfaceC4421Uj0.read(this.f.e(), 0, 2048);
        if (read == -1) {
            z = true;
        } else {
            z = false;
        }
        i(length, z);
        if (z) {
            return -1;
        }
        this.f.Y(0);
        this.f.X(read);
        if (!this.n) {
            this.e.e(this.j, 4);
            this.n = true;
        }
        this.e.a(this.f);
        return 0;
    }

    public final int k(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        int i = 0;
        while (true) {
            interfaceC4421Uj0.x(this.g.e(), 0, 10);
            this.g.Y(0);
            if (this.g.O() != 4801587) {
                break;
            }
            this.g.Z(3);
            int K = this.g.K();
            i += K + 10;
            interfaceC4421Uj0.p(K);
        }
        interfaceC4421Uj0.i();
        interfaceC4421Uj0.p(i);
        if (this.k == -1) {
            this.k = i;
        }
        return i;
    }

    public L7(int i) {
        this.d = (i & 2) != 0 ? i | 1 : i;
        this.e = new M7(true);
        this.f = new C3012Fy1(2048);
        this.l = -1;
        this.k = -1L;
        C3012Fy1 c3012Fy1 = new C3012Fy1(10);
        this.g = c3012Fy1;
        this.h = new C2903Ey1(c3012Fy1.e());
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }
}
