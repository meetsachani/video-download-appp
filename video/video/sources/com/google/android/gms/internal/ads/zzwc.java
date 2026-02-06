package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzwc implements zzwt {
    public final int a;
    public final /* synthetic */ zzwf b;

    public zzwc(zzwf zzwfVar, int i) {
        this.b = zzwfVar;
        this.a = i;
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final int a(long j) {
        return this.b.R(this.a, j);
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final int b(zzkq zzkqVar, zzhp zzhpVar, int i) {
        return this.b.Q(this.a, zzkqVar, zzhpVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final boolean d() {
        return this.b.B(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final void f() throws IOException {
        this.b.z(this.a);
    }
}
