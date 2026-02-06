package o;

import android.os.SystemClock;
import o.C8322nf1;

@Deprecated
/* renamed from: o.xZ  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10737xZ implements K11 {
    public static final float t = 0.97f;
    public static final float u = 1.03f;
    public static final long v = 1000;
    public static final float w = 0.1f;
    public static final long x = 500;
    public static final float y = 0.999f;
    public static final long z = 20;
    public final float a;
    public final float b;
    public final long c;
    public final float d;
    public final long e;
    public final long f;
    public final float g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public float f909o;
    public float p;
    public long q;
    public long r;
    public long s;

    /* renamed from: o.xZ$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public float a = 0.97f;
        public float b = 1.03f;
        public long c = 1000;
        public float d = 1.0E-7f;
        public long e = TD2.j1(20);
        public long f = TD2.j1(500);
        public float g = 0.999f;

        public C10737xZ a() {
            return new C10737xZ(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }

        @InterfaceC6181ey
        public b b(float f) {
            boolean z;
            if (f >= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.b = f;
            return this;
        }

        @InterfaceC6181ey
        public b c(float f) {
            boolean z;
            if (0.0f < f && f <= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.a = f;
            return this;
        }

        @InterfaceC6181ey
        public b d(long j) {
            boolean z;
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.e = TD2.j1(j);
            return this;
        }

        @InterfaceC6181ey
        public b e(float f) {
            boolean z;
            if (f >= 0.0f && f < 1.0f) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.g = f;
            return this;
        }

        @InterfaceC6181ey
        public b f(long j) {
            boolean z;
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.c = j;
            return this;
        }

        @InterfaceC6181ey
        public b g(float f) {
            boolean z;
            if (f > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.a(z);
            this.d = f / 1000000.0f;
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
            this.f = TD2.j1(j);
            return this;
        }
    }

    public static long h(long j, long j2, float f) {
        return (((float) j) * f) + ((1.0f - f) * ((float) j2));
    }

    @Override // o.K11
    public void a(C8322nf1.g gVar) {
        this.h = TD2.j1(gVar.X);
        this.k = TD2.j1(gVar.Y);
        this.l = TD2.j1(gVar.Z);
        float f = gVar.Y0;
        if (f == -3.4028235E38f) {
            f = this.a;
        }
        this.f909o = f;
        float f2 = gVar.Z0;
        if (f2 == -3.4028235E38f) {
            f2 = this.b;
        }
        this.n = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.h = C10323vs.b;
        }
        g();
    }

    @Override // o.K11
    public float b(long j, long j2) {
        if (this.h == C10323vs.b) {
            return 1.0f;
        }
        i(j, j2);
        if (this.q != C10323vs.b && SystemClock.elapsedRealtime() - this.q < this.c) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        f(j);
        long j3 = j - this.m;
        if (Math.abs(j3) < this.e) {
            this.p = 1.0f;
        } else {
            this.p = TD2.v((this.d * ((float) j3)) + 1.0f, this.f909o, this.n);
        }
        return this.p;
    }

    @Override // o.K11
    public long c() {
        return this.m;
    }

    @Override // o.K11
    public void d() {
        long j = this.m;
        if (j == C10323vs.b) {
            return;
        }
        long j2 = j + this.f;
        this.m = j2;
        long j3 = this.l;
        if (j3 != C10323vs.b && j2 > j3) {
            this.m = j3;
        }
        this.q = C10323vs.b;
    }

    @Override // o.K11
    public void e(long j) {
        this.i = j;
        g();
    }

    public final void f(long j) {
        long j2 = this.r + (this.s * 3);
        if (this.m > j2) {
            float j1 = (float) TD2.j1(this.c);
            this.m = C7194j51.s(j2, this.j, this.m - (((this.p - 1.0f) * j1) + ((this.n - 1.0f) * j1)));
            return;
        }
        long x2 = TD2.x(j - (Math.max(0.0f, this.p - 1.0f) / this.d), this.m, j2);
        this.m = x2;
        long j3 = this.l;
        if (j3 != C10323vs.b && x2 > j3) {
            this.m = j3;
        }
    }

    public final void g() {
        long j = this.h;
        if (j != C10323vs.b) {
            long j2 = this.i;
            if (j2 != C10323vs.b) {
                j = j2;
            }
            long j3 = this.k;
            if (j3 != C10323vs.b && j < j3) {
                j = j3;
            }
            long j4 = this.l;
            if (j4 != C10323vs.b && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.j == j) {
            return;
        }
        this.j = j;
        this.m = j;
        this.r = C10323vs.b;
        this.s = C10323vs.b;
        this.q = C10323vs.b;
    }

    public final void i(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.r;
        if (j4 == C10323vs.b) {
            this.r = j3;
            this.s = 0L;
            return;
        }
        long max = Math.max(j3, h(j4, j3, this.g));
        this.r = max;
        this.s = h(this.s, Math.abs(j3 - max), this.g);
    }

    public C10737xZ(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = f3;
        this.e = j2;
        this.f = j3;
        this.g = f4;
        this.h = C10323vs.b;
        this.i = C10323vs.b;
        this.k = C10323vs.b;
        this.l = C10323vs.b;
        this.f909o = f;
        this.n = f2;
        this.p = 1.0f;
        this.q = C10323vs.b;
        this.j = C10323vs.b;
        this.m = C10323vs.b;
        this.r = C10323vs.b;
        this.s = C10323vs.b;
    }
}
