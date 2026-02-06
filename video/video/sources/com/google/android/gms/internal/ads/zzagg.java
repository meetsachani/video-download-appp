package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzagg implements zzadq {
    public final long X;
    public final zzadq Y;

    public zzagg(long j, zzadq zzadqVar) {
        this.X = j;
        this.Y = zzadqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final void N() {
        this.Y.N();
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzaet O(int i, int i2) {
        return this.Y.O(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final void P(zzaem zzaemVar) {
        this.Y.P(new zzagf(this, zzaemVar, zzaemVar));
    }
}
