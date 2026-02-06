package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzadz implements zzado {
    public final zzado a;

    public zzadz(zzado zzadoVar) {
        this.a = zzadoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void A(int i) throws IOException {
        this.a.A(i);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final int C(int i) throws IOException {
        return this.a.C(1);
    }

    @Override // com.google.android.gms.internal.ads.zzado, com.google.android.gms.internal.ads.zzl
    public final int D(byte[] bArr, int i, int i2) throws IOException {
        return this.a.D(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final boolean E(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.a.E(bArr, 0, i2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final boolean F(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.a.F(bArr, 0, i2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void G(int i) throws IOException {
        this.a.G(i);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final int H(byte[] bArr, int i, int i2) throws IOException {
        return this.a.H(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void I(byte[] bArr, int i, int i2) throws IOException {
        this.a.I(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void J(byte[] bArr, int i, int i2) throws IOException {
        this.a.J(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public long d() {
        return this.a.d();
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public long e() {
        return this.a.e();
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public long f() {
        return this.a.f();
    }

    @Override // com.google.android.gms.internal.ads.zzado
    public final void j() {
        this.a.j();
    }
}
