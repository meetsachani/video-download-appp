package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class zzaoq implements zzaem {
    public final zzaon a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public zzaoq(zzaon zzaonVar, int i, long j, long j2) {
        this.a = zzaonVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / zzaonVar.d;
        this.d = j3;
        this.e = b(j3);
    }

    private final long b(long j) {
        return zzeu.P(j * this.b, 1000000L, this.a.c, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final long a() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final zzaek t(long j) {
        zzaon zzaonVar = this.a;
        String str = zzeu.a;
        long j2 = this.d - 1;
        long max = Math.max(0L, Math.min((zzaonVar.c * j) / (this.b * 1000000), j2));
        long j3 = zzaonVar.d;
        long b = b(max);
        long j4 = this.c;
        zzaen zzaenVar = new zzaen(b, (max * j3) + j4);
        if (b < j && max != j2) {
            long j5 = max + 1;
            return new zzaek(zzaenVar, new zzaen(b(j5), j4 + (j3 * j5)));
        }
        return new zzaek(zzaenVar, zzaenVar);
    }
}
