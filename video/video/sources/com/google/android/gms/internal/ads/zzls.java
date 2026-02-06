package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzls extends zzup {
    public final zzbk c;

    public zzls(zzlt zzltVar, zzbl zzblVar) {
        super(zzblVar);
        this.c = new zzbk();
    }

    @Override // com.google.android.gms.internal.ads.zzup, com.google.android.gms.internal.ads.zzbl
    public final zzbj d(int i, zzbj zzbjVar, boolean z) {
        zzbl zzblVar = this.b;
        zzbj d = zzblVar.d(i, zzbjVar, z);
        if (zzblVar.e(d.c, this.c, 0L).b()) {
            d.i(zzbjVar.a, zzbjVar.b, zzbjVar.c, zzbjVar.d, 0L, zzb.e, true);
            return d;
        }
        d.f = true;
        return d;
    }
}
