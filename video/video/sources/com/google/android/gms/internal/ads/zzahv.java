package com.google.android.gms.internal.ads;

import android.util.Pair;
import o.C10323vs;

/* loaded from: classes2.dex */
final class zzahv implements zzahy {
    public final long[] a;
    public final long[] b;
    public final long c;

    public zzahv(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == C10323vs.b ? zzeu.N(jArr2[jArr2.length - 1]) : j;
    }

    public static zzahv b(long j, zzaha zzahaVar, long j2) {
        int[] iArr;
        int length = zzahaVar.e.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzahaVar.c + iArr[i3];
            j3 += zzahaVar.d + zzahaVar.f[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzahv(jArr, jArr2, j2);
    }

    public static Pair d(long j, long[] jArr, long[] jArr2) {
        double d;
        int y = zzeu.y(jArr, j, true, true);
        long j2 = jArr[y];
        long j3 = jArr2[y];
        int i = y + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        long j5 = jArr2[i];
        if (j4 == j2) {
            d = 0.0d;
        } else {
            d = (j - j2) / (j4 - j2);
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) (d * (j5 - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final long a() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final int c() {
        return C10323vs.f;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long f() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final zzaek t(long j) {
        String str = zzeu.a;
        Pair d = d(zzeu.Q(Math.max(0L, Math.min(j, this.c))), this.b, this.a);
        zzaen zzaenVar = new zzaen(zzeu.N(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new zzaek(zzaenVar, zzaenVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long w(long j) {
        return zzeu.N(((Long) d(j, this.a, this.b).second).longValue());
    }
}
