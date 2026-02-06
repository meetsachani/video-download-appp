package o;

import java.io.IOException;
import o.KZ1;

@Deprecated
/* renamed from: o.qn  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9082qn {
    public static final long e = 262144;
    public final a a;
    public final f b;
    @InterfaceC11300zs1
    public c c;
    public final int d;

    /* renamed from: o.qn$a */
    /* loaded from: classes2.dex */
    public static class a implements KZ1 {
        public final d d;
        public final long e;
        public final long f;
        public final long g;
        public final long h;
        public final long i;
        public final long j;

        public a(d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.d = dVar;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = j4;
            this.i = j5;
            this.j = j6;
        }

        @Override // o.KZ1
        public KZ1.a e(long j) {
            return new KZ1.a(new MZ1(j, c.h(this.d.a(j), this.f, this.g, this.h, this.i, this.j)));
        }

        @Override // o.KZ1
        public boolean h() {
            return true;
        }

        @Override // o.KZ1
        public long i() {
            return this.e;
        }

        public long k(long j) {
            return this.d.a(j);
        }
    }

    /* renamed from: o.qn$c */
    /* loaded from: classes2.dex */
    public static class c {
        public final long a;
        public final long b;
        public final long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;

        public c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.a = j;
            this.b = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.c = j7;
            this.h = h(j2, j3, j4, j5, j6, j7);
        }

        public static long h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 < j5 && j2 + 1 < j3) {
                long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
                return TD2.x(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
            }
            return j4;
        }

        public final long i() {
            return this.g;
        }

        public final long j() {
            return this.f;
        }

        public final long k() {
            return this.h;
        }

        public final long l() {
            return this.a;
        }

        public final long m() {
            return this.b;
        }

        public final void n() {
            this.h = h(this.b, this.d, this.e, this.f, this.g, this.c);
        }

        public final void o(long j, long j2) {
            this.e = j;
            this.g = j2;
            n();
        }

        public final void p(long j, long j2) {
            this.d = j;
            this.f = j2;
            n();
        }
    }

    /* renamed from: o.qn$d */
    /* loaded from: classes2.dex */
    public interface d {
        long a(long j);
    }

    /* renamed from: o.qn$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public static final int d = 0;
        public static final int e = -1;
        public static final int f = -2;
        public static final int g = -3;
        public static final e h = new e(-3, C10323vs.b, -1);
        public final int a;
        public final long b;
        public final long c;

        public e(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        public static e d(long j, long j2) {
            return new e(-1, j, j2);
        }

        public static e e(long j) {
            return new e(0, C10323vs.b, j);
        }

        public static e f(long j, long j2) {
            return new e(-2, j, j2);
        }
    }

    public AbstractC9082qn(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = fVar;
        this.d = i;
        this.a = new a(dVar, j, j2, j3, j4, j5, j6);
    }

    public c a(long j) {
        return new c(j, this.a.k(j), this.a.f, this.a.g, this.a.h, this.a.i, this.a.j);
    }

    public final KZ1 b() {
        return this.a;
    }

    public int c(InterfaceC4421Uj0 interfaceC4421Uj0, KE1 ke1) throws IOException {
        while (true) {
            c cVar = (c) C9542sf.k(this.c);
            long j = cVar.j();
            long i = cVar.i();
            long k = cVar.k();
            if (i - j <= this.d) {
                e(false, j);
                return g(interfaceC4421Uj0, j, ke1);
            } else if (!i(interfaceC4421Uj0, k)) {
                return g(interfaceC4421Uj0, k, ke1);
            } else {
                interfaceC4421Uj0.i();
                e a2 = this.b.a(interfaceC4421Uj0, cVar.m());
                int i2 = a2.a;
                if (i2 != -3) {
                    if (i2 == -2) {
                        cVar.p(a2.b, a2.c);
                    } else if (i2 == -1) {
                        cVar.o(a2.b, a2.c);
                    } else if (i2 == 0) {
                        i(interfaceC4421Uj0, a2.c);
                        e(true, a2.c);
                        return g(interfaceC4421Uj0, a2.c, ke1);
                    } else {
                        throw new IllegalStateException("Invalid case");
                    }
                } else {
                    e(false, k);
                    return g(interfaceC4421Uj0, k, ke1);
                }
            }
        }
    }

    public final boolean d() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public final void e(boolean z, long j) {
        this.c = null;
        this.b.b();
        f(z, j);
    }

    public final int g(InterfaceC4421Uj0 interfaceC4421Uj0, long j, KE1 ke1) {
        if (j == interfaceC4421Uj0.getPosition()) {
            return 0;
        }
        ke1.a = j;
        return 1;
    }

    public final void h(long j) {
        c cVar = this.c;
        if (cVar != null && cVar.l() == j) {
            return;
        }
        this.c = a(j);
    }

    public final boolean i(InterfaceC4421Uj0 interfaceC4421Uj0, long j) throws IOException {
        long position = j - interfaceC4421Uj0.getPosition();
        if (position >= 0 && position <= 262144) {
            interfaceC4421Uj0.t((int) position);
            return true;
        }
        return false;
    }

    /* renamed from: o.qn$f */
    /* loaded from: classes2.dex */
    public interface f {
        e a(InterfaceC4421Uj0 interfaceC4421Uj0, long j) throws IOException;

        default void b() {
        }
    }

    /* renamed from: o.qn$b */
    /* loaded from: classes2.dex */
    public static final class b implements d {
        @Override // o.AbstractC9082qn.d
        public long a(long j) {
            return j;
        }
    }

    public void f(boolean z, long j) {
    }
}
