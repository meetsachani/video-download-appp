package o;

import o.Yu2;

@Deprecated
/* loaded from: classes2.dex */
public final class N70 implements InterfaceC8545oa0 {
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f549o = 18;
    @InterfaceC11300zs1
    public final String b;
    public String c;
    public InterfaceC10568wr2 d;
    public int f;
    public int g;
    public long h;
    public C10833xx0 i;
    public int j;
    public final C3012Fy1 a = new C3012Fy1(new byte[18]);
    public int e = 0;
    public long k = C10323vs.b;

    public N70(@InterfaceC11300zs1 String str) {
        this.b = str;
    }

    private boolean f(C3012Fy1 c3012Fy1, byte[] bArr, int i) {
        int min = Math.min(c3012Fy1.a(), i - this.f);
        c3012Fy1.n(bArr, this.f, min);
        int i2 = this.f + min;
        this.f = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    @HS1({"output"})
    private void g() {
        byte[] e = this.a.e();
        if (this.i == null) {
            C10833xx0 g = O70.g(e, this.c, this.b, null);
            this.i = g;
            this.d.a(g);
        }
        this.j = O70.a(e);
        this.h = (int) ((O70.f(e) * 1000000) / this.i.u1);
    }

    private boolean h(C3012Fy1 c3012Fy1) {
        while (c3012Fy1.a() > 0) {
            int i = this.g << 8;
            this.g = i;
            int L = i | c3012Fy1.L();
            this.g = L;
            if (O70.d(L)) {
                byte[] e = this.a.e();
                int i2 = this.g;
                e[0] = (byte) ((i2 >> 24) & 255);
                e[1] = (byte) ((i2 >> 16) & 255);
                e[2] = (byte) ((i2 >> 8) & 255);
                e[3] = (byte) (i2 & 255);
                this.f = 4;
                this.g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // o.InterfaceC8545oa0
    public void a(C3012Fy1 c3012Fy1) {
        C9542sf.k(this.d);
        while (c3012Fy1.a() > 0) {
            int i = this.e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(c3012Fy1.a(), this.j - this.f);
                        this.d.e(c3012Fy1, min);
                        int i2 = this.f + min;
                        this.f = i2;
                        int i3 = this.j;
                        if (i2 == i3) {
                            long j = this.k;
                            if (j != C10323vs.b) {
                                this.d.b(j, 1, i3, 0, null);
                                this.k += this.h;
                            }
                            this.e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (f(c3012Fy1, this.a.e(), 18)) {
                    g();
                    this.a.Y(0);
                    this.d.e(this.a, 18);
                    this.e = 2;
                }
            } else if (h(c3012Fy1)) {
                this.e = 1;
            }
        }
    }

    @Override // o.InterfaceC8545oa0
    public void b() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = C10323vs.b;
    }

    @Override // o.InterfaceC8545oa0
    public void d(InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        eVar.a();
        this.c = eVar.b();
        this.d = interfaceC4518Vj0.b(eVar.c(), 1);
    }

    @Override // o.InterfaceC8545oa0
    public void e(long j, int i) {
        if (j != C10323vs.b) {
            this.k = j;
        }
    }

    @Override // o.InterfaceC8545oa0
    public void c() {
    }
}
