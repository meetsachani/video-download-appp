package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzage extends zzadz {
    public final long b;

    public zzage(zzado zzadoVar, long j) {
        super(zzadoVar);
        boolean z;
        if (zzadoVar.e() >= j) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadz, com.google.android.gms.internal.ads.zzado
    public final long d() {
        return super.d() - this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzadz, com.google.android.gms.internal.ads.zzado
    public final long e() {
        return super.e() - this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzadz, com.google.android.gms.internal.ads.zzado
    public final long f() {
        return super.f() - this.b;
    }
}
