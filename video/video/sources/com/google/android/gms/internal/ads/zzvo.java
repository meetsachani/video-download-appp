package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzvo extends zzys {
    public final zzbm b;

    public zzvo(zzyq zzyqVar, zzbm zzbmVar) {
        super(zzyqVar);
        this.b = zzbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzys, com.google.android.gms.internal.ads.zzyq
    public final zzz b() {
        return this.b.b(a().e());
    }

    @Override // com.google.android.gms.internal.ads.zzys, com.google.android.gms.internal.ads.zzyv
    public final zzbm c() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (super.equals(obj) && (obj instanceof zzvo)) {
            return this.b.equals(((zzvo) obj).b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final int hashCode() {
        return (super.hashCode() * 31) + this.b.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzys, com.google.android.gms.internal.ads.zzyv
    public final zzz u(int i) {
        return this.b.b(a().E(i));
    }
}
