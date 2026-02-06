package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzacv {
    public final long a;
    public final long b;
    public final long c;
    public long d = 0;
    public long e;
    public long f;
    public long g;
    public long h;

    public zzacv(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.c = j7;
        this.h = f(j2, 0L, j4, j5, j6, j7);
    }

    public static long f(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 < j5 && 1 + j2 < j3) {
            long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
            String str = zzeu.a;
            return Math.max(j4, Math.min(((j4 + j7) - j6) - (j7 / 20), j5 - 1));
        }
        return j4;
    }

    public static /* bridge */ /* synthetic */ void g(zzacv zzacvVar, long j, long j2) {
        zzacvVar.e = j;
        zzacvVar.g = j2;
        zzacvVar.i();
    }

    public static /* bridge */ /* synthetic */ void h(zzacv zzacvVar, long j, long j2) {
        zzacvVar.d = j;
        zzacvVar.f = j2;
        zzacvVar.i();
    }

    public final void i() {
        this.h = f(this.b, this.d, this.e, this.f, this.g, this.c);
    }
}
