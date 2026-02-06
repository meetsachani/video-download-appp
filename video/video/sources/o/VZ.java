package o;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import o.KZ1;

@Deprecated
/* loaded from: classes2.dex */
public final class VZ implements InterfaceC8382nu1 {
    public static final int m = 72000;
    public static final int n = 100000;

    /* renamed from: o  reason: collision with root package name */
    public static final int f644o = 30000;
    public static final int p = 0;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 3;
    public static final int t = 4;
    public final C8139mu1 a;
    public final long b;
    public final long c;
    public final AbstractC3423Kd2 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    /* loaded from: classes2.dex */
    public final class b implements KZ1 {
        public b() {
        }

        @Override // o.KZ1
        public KZ1.a e(long j) {
            return new KZ1.a(new MZ1(j, TD2.x((VZ.this.b + BigInteger.valueOf(VZ.this.d.c(j)).multiply(BigInteger.valueOf(VZ.this.c - VZ.this.b)).divide(BigInteger.valueOf(VZ.this.f)).longValue()) - 30000, VZ.this.b, VZ.this.c - 1)));
        }

        @Override // o.KZ1
        public boolean h() {
            return true;
        }

        @Override // o.KZ1
        public long i() {
            return VZ.this.d.b(VZ.this.f);
        }
    }

    public VZ(AbstractC3423Kd2 abstractC3423Kd2, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9542sf.a(z2);
        this.d = abstractC3423Kd2;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.e = 0;
        } else {
            this.f = j4;
            this.e = 4;
        }
        this.a = new C8139mu1();
    }

    @Override // o.InterfaceC8382nu1
    public long a(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1L;
                        }
                        throw new IllegalStateException();
                    }
                } else {
                    long i2 = i(interfaceC4421Uj0);
                    if (i2 != -1) {
                        return i2;
                    }
                    this.e = 3;
                }
                k(interfaceC4421Uj0);
                this.e = 4;
                return -(this.k + 2);
            }
        } else {
            long position = interfaceC4421Uj0.getPosition();
            this.g = position;
            this.e = 1;
            long j = this.c - 65307;
            if (j > position) {
                return j;
            }
        }
        this.f = j(interfaceC4421Uj0);
        this.e = 4;
        return this.g;
    }

    @Override // o.InterfaceC8382nu1
    public void c(long j) {
        this.h = TD2.x(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    @Override // o.InterfaceC8382nu1
    @InterfaceC11300zs1
    /* renamed from: h */
    public b b() {
        if (this.f == 0) {
            return null;
        }
        return new b();
    }

    public final long i(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        long j;
        if (this.i == this.j) {
            return -1L;
        }
        long position = interfaceC4421Uj0.getPosition();
        if (!this.a.d(interfaceC4421Uj0, this.j)) {
            long j2 = this.i;
            if (j2 != position) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.a.a(interfaceC4421Uj0, false);
        interfaceC4421Uj0.i();
        long j3 = this.h;
        C8139mu1 c8139mu1 = this.a;
        long j4 = c8139mu1.c;
        long j5 = j3 - j4;
        int i = c8139mu1.h + c8139mu1.i;
        if (0 <= j5 && j5 < 72000) {
            return -1L;
        }
        int i2 = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
        if (i2 < 0) {
            this.j = position;
            this.l = j4;
        } else {
            this.i = interfaceC4421Uj0.getPosition() + i;
            this.k = this.a.c;
        }
        long j6 = this.j;
        long j7 = this.i;
        if (j6 - j7 < 100000) {
            this.j = j7;
            return j7;
        }
        long j8 = i;
        if (i2 <= 0) {
            j = 2;
        } else {
            j = 1;
        }
        long position2 = interfaceC4421Uj0.getPosition() - (j8 * j);
        long j9 = this.j;
        long j10 = this.i;
        return TD2.x(position2 + ((j5 * (j9 - j10)) / (this.l - this.k)), j10, j9 - 1);
    }

    @InterfaceC5056aJ2
    public long j(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        this.a.b();
        if (this.a.c(interfaceC4421Uj0)) {
            this.a.a(interfaceC4421Uj0, false);
            C8139mu1 c8139mu1 = this.a;
            interfaceC4421Uj0.t(c8139mu1.h + c8139mu1.i);
            long j = this.a.c;
            while (true) {
                C8139mu1 c8139mu12 = this.a;
                if ((c8139mu12.b & 4) == 4 || !c8139mu12.c(interfaceC4421Uj0) || interfaceC4421Uj0.getPosition() >= this.c || !this.a.a(interfaceC4421Uj0, true)) {
                    break;
                }
                C8139mu1 c8139mu13 = this.a;
                if (!C4615Wj0.e(interfaceC4421Uj0, c8139mu13.h + c8139mu13.i)) {
                    break;
                }
                j = this.a.c;
            }
            return j;
        }
        throw new EOFException();
    }

    public final void k(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        while (true) {
            this.a.c(interfaceC4421Uj0);
            this.a.a(interfaceC4421Uj0, false);
            C8139mu1 c8139mu1 = this.a;
            if (c8139mu1.c > this.h) {
                interfaceC4421Uj0.i();
                return;
            }
            interfaceC4421Uj0.t(c8139mu1.h + c8139mu1.i);
            this.i = interfaceC4421Uj0.getPosition();
            this.k = this.a.c;
        }
    }
}
