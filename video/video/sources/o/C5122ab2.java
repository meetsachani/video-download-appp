package o;

import android.os.Handler;
import o.InterfaceC3643Mk;

@Deprecated
/* renamed from: o.ab2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5122ab2 implements InterfaceC3448Kk {
    public final InterfaceC3741Nk b;
    public final int c;
    public final long d;
    public final LD e;
    public final InterfaceC3643Mk.a.C0205a f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int l;
    public long m;

    /* renamed from: o.ab2$b */
    /* loaded from: classes2.dex */
    public static class b {
        public int b;
        public long c;
        public InterfaceC3741Nk a = new C8444o92();
        public LD d = LD.a;

        public C5122ab2 e() {
            return new C5122ab2(this);
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

    private void b(int i, long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            if (i != 0 || j != 0 || j2 != this.k) {
                this.k = j2;
                this.f.c(i, j, j2);
            }
        }
    }

    @Override // o.InterfaceC3448Kk
    public void a(Handler handler, InterfaceC3643Mk.a aVar) {
        this.f.b(handler, aVar);
    }

    @Override // o.InterfaceC3448Kk
    public void c(InterfaceC3643Mk.a aVar) {
        this.f.d(aVar);
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
        long b2 = this.e.b();
        long j = (int) (b2 - this.h);
        if (j > 0) {
            this.b.a(this.i, 1000 * j);
            int i = this.l + 1;
            this.l = i;
            if (i > this.c && this.m > this.d) {
                this.j = this.b.d();
            }
            b((int) j, this.i, this.j);
            this.h = b2;
            this.i = 0L;
        }
        this.g--;
    }

    @Override // o.InterfaceC3448Kk
    public void g(FU fu) {
        if (this.g == 0) {
            this.h = this.e.b();
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
        long b2 = this.e.b();
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

    public C5122ab2(b bVar) {
        this.b = bVar.a;
        this.c = bVar.b;
        this.d = bVar.c;
        this.e = bVar.d;
        this.f = new InterfaceC3643Mk.a.C0205a();
        this.j = Long.MIN_VALUE;
        this.k = Long.MIN_VALUE;
    }

    @Override // o.InterfaceC3448Kk
    public void f(FU fu) {
    }
}
