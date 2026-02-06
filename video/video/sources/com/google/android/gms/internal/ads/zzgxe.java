package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgxe extends zzgxh {
    public final int Y0;
    public final int Z0;

    public zzgxe(byte[] bArr, int i, int i2) {
        super(bArr);
        zzgxk.J(i, i + i2, bArr.length);
        this.Y0 = i;
        this.Z0 = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxh
    public final int d0() {
        return this.Y0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxh, com.google.android.gms.internal.ads.zzgxk
    public final byte e(int i) {
        zzgxk.Y(i, this.Z0);
        return this.Z[this.Y0 + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxh, com.google.android.gms.internal.ads.zzgxk
    public final byte f(int i) {
        return this.Z[this.Y0 + i];
    }

    @Override // com.google.android.gms.internal.ads.zzgxh, com.google.android.gms.internal.ads.zzgxk
    public final int i() {
        return this.Z0;
    }

    @Override // com.google.android.gms.internal.ads.zzgxh, com.google.android.gms.internal.ads.zzgxk
    public final void j(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.Z, this.Y0 + i, bArr, i2, i3);
    }
}
