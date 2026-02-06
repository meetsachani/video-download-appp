package o;

import android.os.Handler;
import o.InterfaceC3643Mk;

@Deprecated
/* loaded from: classes2.dex */
public class GG implements InterfaceC3448Kk {
    public final InterfaceC3741Nk b;
    public final int c;
    public final long d;
    public final InterfaceC3643Mk.a.C0205a e;
    public final LD f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int l;
    public long m;

    /* loaded from: classes2.dex */
    public static class b {
        public int b;
        public long c;
        public InterfaceC3741Nk a = new C8444o92();
        public LD d = LD.a;

        public GG e() {
            return new GG(this);
        }

        @InterfaceC6181ey
        public b f(InterfaceC3741Nk interfaceC3741Nk) {
            C9542sf.g(interfaceC3741Nk);
            this.a = interfaceC3741Nk;
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5056aJ2
        public b g(LD ld) {
            this.d = ld;
            return this;
        }

        @InterfaceC6181ey
        public b h(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.c = j;
            return this;
        }

        @InterfaceC6181ey
        public b i(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.b = i;
            return this;
        }
    }

    @Override // o.InterfaceC3448Kk
    public void a(Handler handler, InterfaceC3643Mk.a aVar) {
        this.e.b(handler, aVar);
    }

    public final void b(int i, long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            if (i != 0 || j != 0 || j2 != this.k) {
                this.k = j2;
                this.e.c(i, j, j2);
            }
        }
    }

    @Override // o.InterfaceC3448Kk
    public void c(InterfaceC3643Mk.a aVar) {
        this.e.d(aVar);
    }

    @Override // o.InterfaceC3448Kk
    public long d() {
        return this.j;
    }

    @Override // o.InterfaceC3448Kk
    public void e(FU fu) {
        boolean z;
        if (this.g > 0) {
            z = true;
        } else {
            z = false;
        }
        C9542sf.i(z);
        int i = this.g - 1;
        this.g = i;
        if (i <= 0) {
            long b2 = (int) (this.f.b() - this.h);
            if (b2 > 0) {
                this.b.a(this.i, 1000 * b2);
                int i2 = this.l + 1;
                this.l = i2;
                if (i2 > this.c && this.m > this.d) {
                    this.j = this.b.d();
                }
                b((int) b2, this.i, this.j);
                this.i = 0L;
            }
        }
    }

    @Override // o.InterfaceC3448Kk
    public void g(FU fu) {
        if (this.g == 0) {
            this.h = this.f.b();
        }
        this.g++;
    }

    @Override // o.InterfaceC3448Kk
    public void h(FU fu, int i) {
        long j = i;
        this.i += j;
        this.m += j;
    }

    @Override // o.InterfaceC3448Kk
    public void i(long j) {
        int i;
        long b2 = this.f.b();
        if (this.g > 0) {
            i = (int) (b2 - this.h);
        } else {
            i = 0;
        }
        b(i, this.i, j);
        this.b.reset();
        this.j = Long.MIN_VALUE;
        this.h = b2;
        this.i = 0L;
        this.l = 0;
        this.m = 0L;
    }

    public GG(b bVar) {
        this.b = bVar.a;
        this.c = bVar.b;
        this.d = bVar.c;
        this.f = bVar.d;
        this.e = new InterfaceC3643Mk.a.C0205a();
        this.j = Long.MIN_VALUE;
        this.k = Long.MIN_VALUE;
    }

    @Override // o.InterfaceC3448Kk
    public void f(FU fu) {
    }
}
