package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzxz extends zzyj implements Comparable {
    public final int Z0;
    public final int a1;

    public zzxz(int i, zzbm zzbmVar, int i2, zzyc zzycVar, int i3) {
        super(i, zzbmVar, i2);
        this.Z0 = zzlw.a(i3, zzycVar.Q) ? 1 : 0;
        this.a1 = this.Y0.a();
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final int e() {
        return this.Z0;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final /* bridge */ /* synthetic */ boolean g(zzyj zzyjVar) {
        zzxz zzxzVar = (zzxz) zzyjVar;
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public final int compareTo(zzxz zzxzVar) {
        return Integer.compare(this.a1, zzxzVar.a1);
    }
}
