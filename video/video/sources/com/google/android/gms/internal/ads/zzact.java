package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzact implements zzaem {
    public final zzacw a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public zzact(zzacw zzacwVar, long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = zzacwVar;
        this.b = j;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final long a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean h() {
        return true;
    }

    public final long i(long j) {
        return this.a.s(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final zzaek t(long j) {
        zzaen zzaenVar = new zzaen(j, zzacv.f(this.a.s(j), 0L, this.c, this.d, this.e, this.f));
        return new zzaek(zzaenVar, zzaenVar);
    }
}
