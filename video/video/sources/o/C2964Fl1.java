package o;

import o.C10833xx0;
import o.C3062Gl1;
import o.Yu2;

@Deprecated
/* renamed from: o.Fl1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2964Fl1 implements InterfaceC8545oa0 {
    public static final int m = 0;
    public static final int n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f456o = 2;
    public static final int p = 4;
    public final C3012Fy1 a;
    public final C3062Gl1.a b;
    @InterfaceC11300zs1
    public final String c;
    public InterfaceC10568wr2 d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public C2964Fl1() {
        this(null);
    }

    @Override // o.InterfaceC8545oa0
    public void a(C3012Fy1 c3012Fy1) {
        C9542sf.k(this.d);
        while (c3012Fy1.a() > 0) {
            int i = this.f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        g(c3012Fy1);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    h(c3012Fy1);
                }
            } else {
                f(c3012Fy1);
            }
        }
    }

    @Override // o.InterfaceC8545oa0
    public void b() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = C10323vs.b;
    }

    @Override // o.InterfaceC8545oa0
    public void d(InterfaceC4518Vj0 interfaceC4518Vj0, Yu2.e eVar) {
        eVar.a();
        this.e = eVar.b();
        this.d = interfaceC4518Vj0.b(eVar.c(), 1);
    }

    @Override // o.InterfaceC8545oa0
    public void e(long j, int i) {
        if (j != C10323vs.b) {
            this.l = j;
        }
    }

    public final void f(C3012Fy1 c3012Fy1) {
        boolean z;
        boolean z2;
        byte[] e = c3012Fy1.e();
        int g = c3012Fy1.g();
        for (int f = c3012Fy1.f(); f < g; f++) {
            byte b = e[f];
            if ((b & 255) == 255) {
                z = true;
            } else {
                z = false;
            }
            if (this.i && (b & 224) == 224) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.i = z;
            if (z2) {
                c3012Fy1.Y(f + 1);
                this.i = false;
                this.a.e()[1] = e[f];
                this.g = 2;
                this.f = 1;
                return;
            }
        }
        c3012Fy1.Y(g);
    }

    @HS1({"output"})
    public final void g(C3012Fy1 c3012Fy1) {
        int min = Math.min(c3012Fy1.a(), this.k - this.g);
        this.d.e(c3012Fy1, min);
        int i = this.g + min;
        this.g = i;
        int i2 = this.k;
        if (i < i2) {
            return;
        }
        long j = this.l;
        if (j != C10323vs.b) {
            this.d.b(j, 1, i2, 0, null);
            this.l += this.j;
        }
        this.g = 0;
        this.f = 0;
    }

    @HS1({"output"})
    public final void h(C3012Fy1 c3012Fy1) {
        int min = Math.min(c3012Fy1.a(), 4 - this.g);
        c3012Fy1.n(this.a.e(), this.g, min);
        int i = this.g + min;
        this.g = i;
        if (i < 4) {
            return;
        }
        this.a.Y(0);
        if (!this.b.a(this.a.s())) {
            this.g = 0;
            this.f = 1;
            return;
        }
        C3062Gl1.a aVar = this.b;
        this.k = aVar.c;
        if (!this.h) {
            this.j = (aVar.g * 1000000) / aVar.d;
            this.d.a(new C10833xx0.b().U(this.e).g0(this.b.b).Y(4096).J(this.b.e).h0(this.b.d).X(this.c).G());
            this.h = true;
        }
        this.a.Y(0);
        this.d.e(this.a, 4);
        this.f = 2;
    }

    public C2964Fl1(@InterfaceC11300zs1 String str) {
        this.f = 0;
        C3012Fy1 c3012Fy1 = new C3012Fy1(4);
        this.a = c3012Fy1;
        c3012Fy1.e()[0] = -1;
        this.b = new C3062Gl1.a();
        this.l = C10323vs.b;
        this.c = str;
    }

    @Override // o.InterfaceC8545oa0
    public void c() {
    }
}
