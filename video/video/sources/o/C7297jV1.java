package o;

import java.util.List;

/* renamed from: o.jV1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7297jV1 {
    public final long a;
    public final long b;
    public final long c;
    public final XP d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public long l;

    public /* synthetic */ C7297jV1(long j, long j2, long j3, XP xp, C9516sY c9516sY) {
        this(j, j2, j3, xp);
    }

    public static /* synthetic */ List h(C7297jV1 c7297jV1, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return c7297jV1.g(f, f2);
    }

    public final float a(float f) {
        if (f > k()) {
            return this.h;
        }
        float f2 = this.k;
        if (f > f2) {
            return (this.h * (f - f2)) / (k() - this.k);
        }
        return 0.0f;
    }

    public final C6302fS b(float f, float f2, long j, long j2, long j3, long j4, long j5, float f3) {
        long g = UD1.g(UD1.m(j2, j));
        long n = UD1.n(j, UD1.p(UD1.p(g, f), 1 + f2));
        long j6 = j3;
        long l = UD1.l(j6, UD1.d(UD1.n(j3, j4), 2.0f), f2);
        long n2 = UD1.n(j5, UD1.p(C5764dE2.d(UD1.j(l) - UD1.j(j5), UD1.k(l) - UD1.k(j5)), f3));
        C7638kv0 s = s(j2, g, n2, C5764dE2.p(UD1.m(n2, j5)));
        if (s != null) {
            j6 = s.m();
        }
        return new C6302fS(n, UD1.d(UD1.n(n, UD1.p(j6, 2.0f)), 3.0f), j6, n2, null);
    }

    public final long c() {
        return this.l;
    }

    public final float d() {
        return this.g;
    }

    public final float e() {
        return this.i;
    }

    public final List<C6302fS> f(float f) {
        return h(this, f, 0.0f, 2, null);
    }

    public final List<C6302fS> g(float f, float f2) {
        float min = Math.min(f, f2);
        float f3 = this.k;
        if (f3 >= 1.0E-4f && min >= 1.0E-4f && this.g >= 1.0E-4f) {
            float min2 = Math.min(min, f3);
            float a = a(f);
            float a2 = a(f2);
            float f4 = (this.g * min2) / this.k;
            this.l = UD1.n(this.b, UD1.p(UD1.g(UD1.d(UD1.n(this.e, this.f), 2.0f)), (float) Math.sqrt(C5764dE2.q(f4) + C5764dE2.q(min2))));
            long n = UD1.n(this.b, UD1.p(this.e, min2));
            long n2 = UD1.n(this.b, UD1.p(this.f, min2));
            C6302fS b = b(min2, a, this.b, this.a, n, n2, this.l, f4);
            C6302fS q = b(min2, a2, this.b, this.c, n2, n, this.l, f4).q();
            return C8222nF.O(b, C6302fS.b.a(UD1.j(this.l), UD1.k(this.l), b.h(), b.i(), q.f(), q.g()), q);
        }
        long j = this.b;
        this.l = j;
        return C7979mF.k(C6302fS.b.b(UD1.j(j), UD1.k(this.b), UD1.j(this.b), UD1.k(this.b)));
    }

    public final long i() {
        return this.e;
    }

    public final long j() {
        return this.f;
    }

    public final float k() {
        return (1 + this.h) * this.k;
    }

    public final float l() {
        return this.k;
    }

    public final long m() {
        return this.a;
    }

    public final long n() {
        return this.b;
    }

    public final long o() {
        return this.c;
    }

    public final XP p() {
        return this.d;
    }

    public final float q() {
        return this.j;
    }

    public final float r() {
        return this.h;
    }

    public final C7638kv0 s(long j, long j2, long j3, long j4) {
        long p = C5764dE2.p(j4);
        float f = UD1.f(j2, p);
        if (Math.abs(f) < 1.0E-4f) {
            return null;
        }
        float f2 = UD1.f(UD1.m(j3, j), p);
        if (Math.abs(f) < Math.abs(f2) * 1.0E-4f) {
            return null;
        }
        return C7638kv0.a(UD1.n(j, UD1.p(j2, f2 / f)));
    }

    public final void t(long j) {
        this.l = j;
    }

    public C7297jV1(long j, long j2, long j3, XP xp) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = xp;
        long g = UD1.g(UD1.m(j, j2));
        this.e = g;
        long g2 = UD1.g(UD1.m(j3, j2));
        this.f = g2;
        float a = xp != null ? xp.a() : 0.0f;
        this.g = a;
        this.h = xp != null ? xp.b() : 0.0f;
        float f = UD1.f(g, g2);
        this.i = f;
        float f2 = 1;
        float sqrt = (float) Math.sqrt(f2 - C5764dE2.q(f));
        this.j = sqrt;
        this.k = ((double) sqrt) > 0.001d ? (a * (f + f2)) / sqrt : 0.0f;
        this.l = C7638kv0.d(0.0f, 0.0f);
    }

    public /* synthetic */ C7297jV1(long j, long j2, long j3, XP xp, int i, C9516sY c9516sY) {
        this(j, j2, j3, (i & 8) != 0 ? null : xp, null);
    }
}
