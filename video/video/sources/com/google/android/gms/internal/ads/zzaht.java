package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaht extends zzadc implements zzahy {
    public final long g;
    public final int h;
    public final int i;
    public final long j;

    public zzaht(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, false);
        this.g = j2;
        this.h = i;
        this.i = i2;
        this.j = j != -1 ? j : -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final int c() {
        return this.h;
    }

    public final zzaht e(long j) {
        return new zzaht(j, this.g, this.h, this.i, false);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long f() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long w(long j) {
        return b(j);
    }
}
