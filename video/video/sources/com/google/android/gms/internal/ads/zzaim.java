package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzaim implements zzaii {
    public final zzek a;
    public final int b;
    public final int c;
    public int d;
    public int e;

    public zzaim(zzfa zzfaVar) {
        zzek zzekVar = zzfaVar.b;
        this.a = zzekVar;
        zzekVar.l(12);
        this.c = zzekVar.J() & 255;
        this.b = zzekVar.J();
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final int a() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final int b() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final int c() {
        int i = this.c;
        if (i == 8) {
            return this.a.G();
        }
        if (i == 16) {
            return this.a.K();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 == 0) {
            int G = this.a.G();
            this.e = G;
            return (G & 240) >> 4;
        }
        return this.e & 15;
    }
}
