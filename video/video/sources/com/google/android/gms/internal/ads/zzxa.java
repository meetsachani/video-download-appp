package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzxa implements zzwt {
    public final zzwt a;
    public final long b;

    public zzxa(zzwt zzwtVar, long j) {
        this.a = zzwtVar;
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final int a(long j) {
        return this.a.a(j - this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final int b(zzkq zzkqVar, zzhp zzhpVar, int i) {
        int b = this.a.b(zzkqVar, zzhpVar, i);
        if (b == -4) {
            zzhpVar.f += this.b;
            return -4;
        }
        return b;
    }

    public final zzwt c() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final boolean d() {
        return this.a.d();
    }

    @Override // com.google.android.gms.internal.ads.zzwt
    public final void f() throws IOException {
        this.a.f();
    }
}
