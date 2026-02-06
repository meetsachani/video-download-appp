package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzajp implements zzaju {
    public final zzady a;
    public final zzadx b;
    public long c = -1;
    public long d = -1;

    public zzajp(zzady zzadyVar, zzadx zzadxVar) {
        this.a = zzadyVar;
        this.b = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final long a(zzado zzadoVar) {
        long j = this.d;
        if (j >= 0) {
            this.d = -1L;
            return -(j + 2);
        }
        return -1L;
    }

    public final void b(long j) {
        this.c = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final zzaem d() {
        boolean z;
        if (this.c != -1) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        return new zzadw(this.a, this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final void t(long j) {
        long[] jArr = this.b.a;
        this.d = jArr[zzeu.y(jArr, j, true, true)];
    }
}
