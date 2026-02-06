package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzaee implements zzaem {
    public final zzdy a;
    public final zzdy b;
    public long c;

    public zzaee(long[] jArr, long[] jArr2, long j) {
        boolean z;
        int length = jArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        if (length2 > 0 && jArr2[0] > 0) {
            int i = length2 + 1;
            zzdy zzdyVar = new zzdy(i);
            this.a = zzdyVar;
            zzdy zzdyVar2 = new zzdy(i);
            this.b = zzdyVar2;
            zzdyVar.c(0L);
            zzdyVar2.c(0L);
        } else {
            this.a = new zzdy(length2);
            this.b = new zzdy(length2);
        }
        this.a.d(jArr);
        this.b.d(jArr2);
        this.c = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final long a() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean h() {
        return this.b.a() > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final zzaek t(long j) {
        zzdy zzdyVar = this.b;
        if (zzdyVar.a() == 0) {
            zzaen zzaenVar = zzaen.c;
            return new zzaek(zzaenVar, zzaenVar);
        }
        int w = zzeu.w(zzdyVar, j, true, true);
        long b = zzdyVar.b(w);
        zzdy zzdyVar2 = this.a;
        zzaen zzaenVar2 = new zzaen(b, zzdyVar2.b(w));
        if (zzaenVar2.a != j && w != zzdyVar.a() - 1) {
            int i = w + 1;
            return new zzaek(zzaenVar2, new zzaen(zzdyVar.b(i), zzdyVar2.b(i)));
        }
        return new zzaek(zzaenVar2, zzaenVar2);
    }
}
