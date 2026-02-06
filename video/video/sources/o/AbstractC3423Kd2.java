package o;

import java.io.IOException;
import o.KZ1;

@Deprecated
/* renamed from: o.Kd2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3423Kd2 {
    public static final int n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f518o = 1;
    public static final int p = 2;
    public static final int q = 3;
    public InterfaceC10568wr2 b;
    public InterfaceC4518Vj0 c;
    public InterfaceC8382nu1 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final C7878lu1 a = new C7878lu1();
    public b j = new b();

    /* renamed from: o.Kd2$b */
    /* loaded from: classes2.dex */
    public static class b {
        public C10833xx0 a;
        public InterfaceC8382nu1 b;
    }

    @InterfaceC8557od0({"trackOutput", "extractorOutput"})
    public final void a() {
        C9542sf.k(this.b);
        TD2.o(this.c);
    }

    public long b(long j) {
        return (j * 1000000) / this.i;
    }

    public long c(long j) {
        return (this.i * j) / 1000000;
    }

    public void d(InterfaceC4518Vj0 interfaceC4518Vj0, InterfaceC10568wr2 interfaceC10568wr2) {
        this.c = interfaceC4518Vj0;
        this.b = interfaceC10568wr2;
        l(true);
    }

    public void e(long j) {
        this.g = j;
    }

    public abstract long f(C3012Fy1 c3012Fy1);

    public final int g(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        a();
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                TD2.o(this.d);
                return k(interfaceC4421Uj0, ke1);
            }
            interfaceC4421Uj0.t((int) this.f);
            this.h = 2;
            return 0;
        }
        return j(interfaceC4421Uj0);
    }

    @InterfaceC8800pd0(expression = {"setupData.format"}, result = true)
    public final boolean h(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        while (this.a.d(interfaceC4421Uj0)) {
            this.k = interfaceC4421Uj0.getPosition() - this.f;
            if (i(this.a.c(), this.f, this.j)) {
                this.f = interfaceC4421Uj0.getPosition();
            } else {
                return true;
            }
        }
        this.h = 3;
        return false;
    }

    @InterfaceC8800pd0(expression = {"#3.format"}, result = false)
    public abstract boolean i(C3012Fy1 c3012Fy1, long j, b bVar) throws IOException;

    @HS1({"trackOutput"})
    public final int j(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        boolean z;
        if (!h(interfaceC4421Uj0)) {
            return -1;
        }
        C10833xx0 c10833xx0 = this.j.a;
        this.i = c10833xx0.u1;
        if (!this.m) {
            this.b.a(c10833xx0);
            this.m = true;
        }
        InterfaceC8382nu1 interfaceC8382nu1 = this.j.b;
        if (interfaceC8382nu1 != null) {
            this.d = interfaceC8382nu1;
        } else if (interfaceC4421Uj0.getLength() == -1) {
            this.d = new c();
        } else {
            C8139mu1 b2 = this.a.b();
            if ((b2.b & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.d = new VZ(this, this.f, interfaceC4421Uj0.getLength(), b2.h + b2.i, b2.c, z);
        }
        this.h = 2;
        this.a.f();
        return 0;
    }

    @HS1({"trackOutput", "oggSeeker", "extractorOutput"})
    public final int k(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        long a2 = this.d.a(interfaceC4421Uj0);
        if (a2 >= 0) {
            ke1.a = a2;
            return 1;
        }
        if (a2 < -1) {
            e(-(a2 + 2));
        }
        if (!this.l) {
            this.c.p((KZ1) C9542sf.k(this.d.b()));
            this.l = true;
        }
        if (this.k <= 0 && !this.a.d(interfaceC4421Uj0)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        C3012Fy1 c2 = this.a.c();
        long f = f(c2);
        if (f >= 0) {
            long j = this.g;
            if (j + f >= this.e) {
                long b2 = b(j);
                this.b.e(c2, c2.g());
                this.b.b(b2, 1, c2.g(), 0, null);
                this.e = -1L;
            }
        }
        this.g += f;
        return 0;
    }

    public void l(boolean z) {
        if (z) {
            this.j = new b();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    public final void m(long j, long j2) {
        this.a.e();
        if (j == 0) {
            l(!this.l);
        } else if (this.h != 0) {
            this.e = c(j2);
            ((InterfaceC8382nu1) TD2.o(this.d)).c(this.e);
            this.h = 2;
        }
    }

    /* renamed from: o.Kd2$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8382nu1 {
        public c() {
        }

        @Override // o.InterfaceC8382nu1
        public long a(InterfaceC4421Uj0 interfaceC4421Uj0) {
            return -1L;
        }

        @Override // o.InterfaceC8382nu1
        public KZ1 b() {
            return new KZ1.b(C10323vs.b);
        }

        @Override // o.InterfaceC8382nu1
        public void c(long j) {
        }
    }
}
