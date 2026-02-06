package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import o.C10323vs;

/* loaded from: classes2.dex */
public final class zzid {
    public final long a;
    public final long b;
    public long c = C10323vs.b;
    public long d = C10323vs.b;
    public long f = C10323vs.b;
    public long g = C10323vs.b;
    public float j = 0.97f;
    public float i = 1.03f;
    public float k = 1.0f;
    public long l = C10323vs.b;
    public long e = C10323vs.b;
    public long h = C10323vs.b;
    public long m = C10323vs.b;
    public long n = C10323vs.b;

    public /* synthetic */ zzid(float f, float f2, long j, float f3, long j2, long j3, float f4, zzic zzicVar) {
        this.a = j2;
        this.b = j3;
    }

    public static long f(long j, long j2, float f) {
        return (((float) j) * 0.999f) + (((float) j2) * 9.999871E-4f);
    }

    public final float a(long j, long j2) {
        long j3;
        if (this.c == C10323vs.b) {
            return 1.0f;
        }
        long j4 = j - j2;
        long j5 = this.m;
        if (j5 == C10323vs.b) {
            this.m = j4;
            this.n = 0L;
        } else {
            long max = Math.max(j4, f(j5, j4, 0.999f));
            this.m = max;
            this.n = f(this.n, Math.abs(j4 - max), 0.999f);
        }
        if (this.l != C10323vs.b && SystemClock.elapsedRealtime() - this.l < 1000) {
            return this.k;
        }
        this.l = SystemClock.elapsedRealtime();
        long j6 = this.m + (this.n * 3);
        if (this.h > j6) {
            float N = (float) zzeu.N(1000L);
            long[] jArr = {j6, this.e, this.h - (((this.k - 1.0f) * N) + ((this.i - 1.0f) * N))};
            j3 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j3) {
                    j3 = j7;
                }
            }
            this.h = j3;
        } else {
            long j8 = this.h;
            String str = zzeu.a;
            long max2 = Math.max(j8, Math.min(j - (Math.max(0.0f, this.k - 1.0f) / 1.0E-7f), j6));
            this.h = max2;
            long j9 = this.g;
            if (j9 != C10323vs.b && max2 > j9) {
                this.h = j9;
                j3 = j9;
            } else {
                j3 = max2;
            }
        }
        long j10 = j - j3;
        if (Math.abs(j10) < this.a) {
            this.k = 1.0f;
            return 1.0f;
        }
        float max3 = Math.max(this.j, Math.min((((float) j10) * 1.0E-7f) + 1.0f, this.i));
        this.k = max3;
        return max3;
    }

    public final long b() {
        return this.h;
    }

    public final void c() {
        long j = this.h;
        if (j == C10323vs.b) {
            return;
        }
        long j2 = j + this.b;
        this.h = j2;
        long j3 = this.g;
        if (j3 != C10323vs.b && j2 > j3) {
            this.h = j3;
        }
        this.l = C10323vs.b;
    }

    public final void d(zzaj zzajVar) {
        long j = zzajVar.a;
        this.c = zzeu.N(C10323vs.b);
        this.f = zzeu.N(C10323vs.b);
        this.g = zzeu.N(C10323vs.b);
        this.j = 0.97f;
        this.i = 1.03f;
        g();
    }

    public final void e(long j) {
        this.d = j;
        g();
    }

    public final void g() {
        long j;
        long j2 = this.c;
        if (j2 != C10323vs.b) {
            j = this.d;
            if (j == C10323vs.b) {
                long j3 = this.f;
                if (j3 != C10323vs.b && j2 < j3) {
                    j2 = j3;
                }
                j = this.g;
                if (j == C10323vs.b || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.e == j) {
            return;
        }
        this.e = j;
        this.h = j;
        this.m = C10323vs.b;
        this.n = C10323vs.b;
        this.l = C10323vs.b;
    }
}
