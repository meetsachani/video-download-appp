package com.google.android.gms.internal.ads;

import o.C10323vs;

/* loaded from: classes2.dex */
public class zzadc implements zzaem {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;

    public zzadc(long j, long j2, int i, int i2, boolean z) {
        long d;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            d = C10323vs.b;
        } else {
            this.d = j - j2;
            d = d(j, j2, i);
        }
        this.f = d;
    }

    public static long d(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final long a() {
        return this.f;
    }

    public final long b(long j) {
        return d(j, this.b, this.e);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean h() {
        return this.d != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final zzaek t(long j) {
        long j2 = this.d;
        int i = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        if (i != 0) {
            long j3 = this.c;
            long j4 = (((this.e * j) / 8000000) / j3) * j3;
            if (i != 0) {
                j4 = Math.min(j4, j2 - j3);
            }
            long max = this.b + Math.max(j4, 0L);
            long b = b(max);
            zzaen zzaenVar = new zzaen(b, max);
            if (i != 0 && b < j) {
                long j5 = max + j3;
                if (j5 < this.a) {
                    return new zzaek(zzaenVar, new zzaen(b(j5), j5));
                }
            }
            return new zzaek(zzaenVar, zzaenVar);
        }
        zzaen zzaenVar2 = new zzaen(0L, this.b);
        return new zzaek(zzaenVar2, zzaenVar2);
    }
}
