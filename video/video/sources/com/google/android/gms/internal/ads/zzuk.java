package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class zzuk implements zzwv {
    public final zzwv X;
    public final zzfyc Y;

    public zzuk(zzwv zzwvVar, List list) {
        this.X = zzwvVar;
        this.Y = zzfyc.B(list);
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final boolean a(zzkv zzkvVar) {
        return this.X.a(zzkvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final long b() {
        return this.X.b();
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final long c() {
        return this.X.c();
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final void d(long j) {
        this.X.d(j);
    }

    public final zzfyc h() {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzwv
    public final boolean o() {
        return this.X.o();
    }
}
