package o;

import android.util.SparseArray;
import java.io.IOException;
import o.KZ1;
import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class CK1 implements InterfaceC4324Tj0 {
    public static final int A = 240;

    /* renamed from: o  reason: collision with root package name */
    public static final InterfaceC4809Yj0 f426o = new InterfaceC4809Yj0() { // from class: o.BK1
        @Override // o.InterfaceC4809Yj0
        public final InterfaceC4324Tj0[] b() {
            return CK1.c();
        }
    };
    public static final int p = 442;
    public static final int q = 443;
    public static final int r = 1;
    public static final int s = 441;
    public static final int t = 256;
    public static final long u = 1048576;
    public static final long v = 8192;
    public static final int w = 189;
    public static final int x = 192;
    public static final int y = 224;
    public static final int z = 224;
    public final C10071up2 d;
    public final SparseArray<a> e;
    public final C3012Fy1 f;
    public final AK1 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    @InterfaceC11300zs1
    public C11170zK1 l;
    public InterfaceC4518Vj0 m;
    public boolean n;

    /* loaded from: classes2.dex */
    public static final class a {
        public static final int i = 64;
        public final InterfaceC8545oa0 a;
        public final C10071up2 b;
        public final C2903Ey1 c = new C2903Ey1(new byte[64]);
        public boolean d;
        public boolean e;
        public boolean f;
        public int g;
        public long h;

        public a(InterfaceC8545oa0 interfaceC8545oa0, C10071up2 c10071up2) {
            this.a = interfaceC8545oa0;
            this.b = c10071up2;
        }

        public void a(C3012Fy1 c3012Fy1) throws C3989Py1 {
            c3012Fy1.n(this.c.a, 0, 3);
            this.c.q(0);
            b();
            c3012Fy1.n(this.c.a, 0, this.g);
            this.c.q(0);
            c();
            this.a.e(this.h, 4);
            this.a.a(c3012Fy1);
            this.a.c();
        }

        public final void b() {
            this.c.s(8);
            this.d = this.c.g();
            this.e = this.c.g();
            this.c.s(6);
            this.g = this.c.h(8);
        }

        public final void c() {
            this.h = 0L;
            if (this.d) {
                this.c.s(4);
                this.c.s(1);
                this.c.s(1);
                long h = (this.c.h(3) << 30) | (this.c.h(15) << 15) | this.c.h(15);
                this.c.s(1);
                if (!this.f && this.e) {
                    this.c.s(4);
                    this.c.s(1);
                    this.c.s(1);
                    this.c.s(1);
                    this.b.b((this.c.h(3) << 30) | (this.c.h(15) << 15) | this.c.h(15));
                    this.f = true;
                }
                this.h = this.b.b(h);
            }
        }

        public void d() {
            this.f = false;
            this.a.b();
        }
    }

    public CK1() {
        this(new C10071up2(0L));
    }

    public static /* synthetic */ InterfaceC4324Tj0[] c() {
        return new InterfaceC4324Tj0[]{new CK1()};
    }

    @Override // o.InterfaceC4324Tj0
    public void a(long j, long j2) {
        boolean z2;
        boolean z3 = true;
        if (this.d.e() == C10323vs.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            long c = this.d.c();
            z2 = (c == C10323vs.b || c == 0 || c == j2) ? false : false;
        }
        if (z2) {
            this.d.h(j2);
        }
        C11170zK1 c11170zK1 = this.l;
        if (c11170zK1 != null) {
            c11170zK1.h(j2);
        }
        for (int i = 0; i < this.e.size(); i++) {
            this.e.valueAt(i).d();
        }
    }

    @Override // o.InterfaceC4324Tj0
    public void b(InterfaceC4518Vj0 interfaceC4518Vj0) {
        this.m = interfaceC4518Vj0;
    }

    @Override // o.InterfaceC4324Tj0
    public boolean d(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        byte[] bArr = new byte[14];
        interfaceC4421Uj0.x(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC4421Uj0.p(bArr[13] & 7);
        interfaceC4421Uj0.x(bArr, 0, 3);
        if (1 != (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return false;
        }
        return true;
    }

    @HS1({"output"})
    public final void e(long j) {
        if (!this.n) {
            this.n = true;
            if (this.g.c() != C10323vs.b) {
                C11170zK1 c11170zK1 = new C11170zK1(this.g.d(), this.g.c(), j);
                this.l = c11170zK1;
                this.m.p(c11170zK1.b());
                return;
            }
            this.m.p(new KZ1.b(this.g.c()));
        }
    }

    @Override // o.InterfaceC4324Tj0
    public int j(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        long j;
        long j2;
        InterfaceC8545oa0 interfaceC8545oa0;
        C9542sf.k(this.m);
        long length = interfaceC4421Uj0.getLength();
        int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i != 0 && !this.g.e()) {
            return this.g.g(interfaceC4421Uj0, ke1);
        }
        e(length);
        C11170zK1 c11170zK1 = this.l;
        if (c11170zK1 != null && c11170zK1.d()) {
            return this.l.c(interfaceC4421Uj0, ke1);
        }
        interfaceC4421Uj0.i();
        if (i != 0) {
            j = length - interfaceC4421Uj0.n();
        } else {
            j = -1;
        }
        if ((j != -1 && j < 4) || !interfaceC4421Uj0.h(this.f.e(), 0, 4, true)) {
            return -1;
        }
        this.f.Y(0);
        int s2 = this.f.s();
        if (s2 == 441) {
            return -1;
        }
        if (s2 == 442) {
            interfaceC4421Uj0.x(this.f.e(), 0, 10);
            this.f.Y(9);
            interfaceC4421Uj0.t((this.f.L() & 7) + 14);
            return 0;
        } else if (s2 == 443) {
            interfaceC4421Uj0.x(this.f.e(), 0, 2);
            this.f.Y(0);
            interfaceC4421Uj0.t(this.f.R() + 6);
            return 0;
        } else if (((s2 & (-256)) >> 8) != 1) {
            interfaceC4421Uj0.t(1);
            return 0;
        } else {
            int i2 = s2 & 255;
            a aVar = this.e.get(i2);
            if (!this.h) {
                if (aVar == null) {
                    if (i2 == 189) {
                        interfaceC8545oa0 = new H3();
                        this.i = true;
                        this.k = interfaceC4421Uj0.getPosition();
                    } else if ((s2 & 224) == 192) {
                        interfaceC8545oa0 = new C2964Fl1();
                        this.i = true;
                        this.k = interfaceC4421Uj0.getPosition();
                    } else if ((s2 & 240) == 224) {
                        interfaceC8545oa0 = new EF0();
                        this.j = true;
                        this.k = interfaceC4421Uj0.getPosition();
                    } else {
                        interfaceC8545oa0 = null;
                    }
                    if (interfaceC8545oa0 != null) {
                        interfaceC8545oa0.d(this.m, new Yu2.e(i2, 256));
                        aVar = new a(interfaceC8545oa0, this.d);
                        this.e.put(i2, aVar);
                    }
                }
                if (this.i && this.j) {
                    j2 = this.k + 8192;
                } else {
                    j2 = 1048576;
                }
                if (interfaceC4421Uj0.getPosition() > j2) {
                    this.h = true;
                    this.m.n();
                }
            }
            interfaceC4421Uj0.x(this.f.e(), 0, 2);
            this.f.Y(0);
            int R = this.f.R() + 6;
            if (aVar == null) {
                interfaceC4421Uj0.t(R);
            } else {
                this.f.U(R);
                interfaceC4421Uj0.readFully(this.f.e(), 0, R);
                this.f.Y(6);
                aVar.a(this.f);
                C3012Fy1 c3012Fy1 = this.f;
                c3012Fy1.X(c3012Fy1.b());
            }
            return 0;
        }
    }

    public CK1(C10071up2 c10071up2) {
        this.d = c10071up2;
        this.f = new C3012Fy1(4096);
        this.e = new SparseArray<>();
        this.g = new AK1();
    }

    @Override // o.InterfaceC4324Tj0
    public void g() {
    }
}
