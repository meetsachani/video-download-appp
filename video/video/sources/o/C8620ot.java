package o;

@InterfaceC6086ea0
@InterfaceC10420wF0
/* renamed from: o.ot  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8620ot {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public C8620ot(long j, long j2, long j3, long j4, long j5, long j6) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C10664xF1.d(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C10664xF1.d(z2);
        if (j3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C10664xF1.d(z3);
        if (j4 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        C10664xF1.d(z4);
        if (j5 >= 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        C10664xF1.d(z5);
        C10664xF1.d(j6 >= 0);
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public double a() {
        long x = R41.x(this.c, this.d);
        if (x == 0) {
            return 0.0d;
        }
        return this.e / x;
    }

    public long b() {
        return this.f;
    }

    public long c() {
        return this.a;
    }

    public double d() {
        long m = m();
        if (m == 0) {
            return 1.0d;
        }
        return this.a / m;
    }

    public long e() {
        return R41.x(this.c, this.d);
    }

    public boolean equals(@MB Object obj) {
        if (obj instanceof C8620ot) {
            C8620ot c8620ot = (C8620ot) obj;
            if (this.a == c8620ot.a && this.b == c8620ot.b && this.c == c8620ot.c && this.d == c8620ot.d && this.e == c8620ot.e && this.f == c8620ot.f) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.d;
    }

    public double g() {
        long x = R41.x(this.c, this.d);
        if (x == 0) {
            return 0.0d;
        }
        return this.d / x;
    }

    public long h() {
        return this.c;
    }

    public int hashCode() {
        return C2593Bt1.b(Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f));
    }

    public C8620ot i(C8620ot c8620ot) {
        return new C8620ot(Math.max(0L, R41.A(this.a, c8620ot.a)), Math.max(0L, R41.A(this.b, c8620ot.b)), Math.max(0L, R41.A(this.c, c8620ot.c)), Math.max(0L, R41.A(this.d, c8620ot.d)), Math.max(0L, R41.A(this.e, c8620ot.e)), Math.max(0L, R41.A(this.f, c8620ot.f)));
    }

    public long j() {
        return this.b;
    }

    public double k() {
        long m = m();
        if (m == 0) {
            return 0.0d;
        }
        return this.b / m;
    }

    public C8620ot l(C8620ot c8620ot) {
        return new C8620ot(R41.x(this.a, c8620ot.a), R41.x(this.b, c8620ot.b), R41.x(this.c, c8620ot.c), R41.x(this.d, c8620ot.d), R41.x(this.e, c8620ot.e), R41.x(this.f, c8620ot.f));
    }

    public long m() {
        return R41.x(this.a, this.b);
    }

    public long n() {
        return this.e;
    }

    public String toString() {
        return C3743Nk1.c(this).e("hitCount", this.a).e("missCount", this.b).e("loadSuccessCount", this.c).e("loadExceptionCount", this.d).e("totalLoadTime", this.e).e("evictionCount", this.f).toString();
    }
}
