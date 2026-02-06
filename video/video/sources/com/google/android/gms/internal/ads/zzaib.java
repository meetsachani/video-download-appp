package com.google.android.gms.internal.ads;

import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzaib implements zzahy {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    @InterfaceC11300zs1
    public final long[] g;

    public zzaib(long j, int i, long j2, int i2, long j3, @InterfaceC11300zs1 long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @InterfaceC11300zs1
    public static zzaib b(zzaia zzaiaVar, long j) {
        long a = zzaiaVar.a();
        if (a == C10323vs.b) {
            return null;
        }
        zzaef zzaefVar = zzaiaVar.a;
        return new zzaib(j, zzaefVar.c, a, zzaefVar.f, zzaiaVar.c, zzaiaVar.f);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final long a() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final int c() {
        return this.d;
    }

    public final long d(int i) {
        return (this.c * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long f() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean h() {
        return this.g != null;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final zzaek t(long j) {
        double d;
        if (!h()) {
            zzaen zzaenVar = new zzaen(0L, this.a + this.b);
            return new zzaek(zzaenVar, zzaenVar);
        }
        long j2 = this.c;
        String str = zzeu.a;
        long max = Math.max(0L, Math.min(j, j2));
        double d2 = (max * 100.0d) / j2;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 100.0d) {
                d3 = 256.0d;
            } else {
                int i = (int) d2;
                long[] jArr = this.g;
                zzdc.b(jArr);
                double d4 = jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = jArr[i + 1];
                }
                d3 = d4 + ((d2 - i) * (d - d4));
            }
        }
        long j3 = this.e;
        zzaen zzaenVar2 = new zzaen(max, this.a + Math.max(this.b, Math.min(Math.round((d3 / 256.0d) * j3), j3 - 1)));
        return new zzaek(zzaenVar2, zzaenVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long w(long j) {
        long j2;
        double d;
        if (h()) {
            long j3 = j - this.a;
            if (j3 > this.b) {
                long[] jArr = this.g;
                zzdc.b(jArr);
                double d2 = (j3 * 256.0d) / this.e;
                int y = zzeu.y(jArr, (long) d2, true, true);
                long d3 = d(y);
                long j4 = jArr[y];
                int i = y + 1;
                long d4 = d(i);
                if (y == 99) {
                    j2 = 256;
                } else {
                    j2 = jArr[i];
                }
                if (j4 == j2) {
                    d = 0.0d;
                } else {
                    d = (d2 - j4) / (j2 - j4);
                }
                return d3 + Math.round(d * (d4 - d3));
            }
            return 0L;
        }
        return 0L;
    }
}
