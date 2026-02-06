package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzadw implements zzaem {
    public final zzady a;
    public final long b;

    public zzadw(zzady zzadyVar, long j) {
        this.a = zzadyVar;
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final long a() {
        return this.a.a();
    }

    public final zzaen b(long j, long j2) {
        return new zzaen((j * 1000000) / this.a.e, this.b + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final zzaek t(long j) {
        long j2;
        zzady zzadyVar = this.a;
        zzadx zzadxVar = zzadyVar.k;
        zzdc.b(zzadxVar);
        long[] jArr = zzadxVar.a;
        long[] jArr2 = zzadxVar.b;
        int y = zzeu.y(jArr, zzadyVar.b(j), true, false);
        long j3 = 0;
        if (y == -1) {
            j2 = 0;
        } else {
            j2 = jArr[y];
        }
        if (y != -1) {
            j3 = jArr2[y];
        }
        zzaen b = b(j2, j3);
        if (b.a != j && y != jArr.length - 1) {
            int i = y + 1;
            return new zzaek(b, b(jArr[i], jArr2[i]));
        }
        return new zzaek(b, b);
    }
}
