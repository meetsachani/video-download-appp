package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes2.dex */
final class zzajm implements zzaem {
    public final /* synthetic */ zzajo a;

    public /* synthetic */ zzajm(zzajo zzajoVar, zzajn zzajnVar) {
        this.a = zzajoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final long a() {
        zzajz zzajzVar;
        long j;
        zzajo zzajoVar = this.a;
        zzajzVar = zzajoVar.d;
        j = zzajoVar.f;
        return zzajzVar.e(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final zzaek t(long j) {
        zzajz zzajzVar;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        zzajo zzajoVar = this.a;
        zzajzVar = zzajoVar.d;
        long f = zzajzVar.f(j);
        j2 = zzajoVar.b;
        BigInteger valueOf = BigInteger.valueOf(f);
        j3 = zzajoVar.c;
        j4 = zzajoVar.b;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j3 - j4));
        j5 = zzajoVar.f;
        long longValue = j2 + multiply.divide(BigInteger.valueOf(j5)).longValue();
        j6 = zzajoVar.b;
        j7 = zzajoVar.c;
        String str = zzeu.a;
        zzaen zzaenVar = new zzaen(j, Math.max(j6, Math.min(longValue - 30000, j7 - 1)));
        return new zzaek(zzaenVar, zzaenVar);
    }
}
