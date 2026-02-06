package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public class zzys implements zzyq {
    public final zzyq a;

    public zzys(zzyq zzyqVar) {
        this.a = zzyqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final int A(int i) {
        return this.a.A(i);
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final int E(int i) {
        return this.a.E(i);
    }

    public final zzyq a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public zzz b() {
        return this.a.b();
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public zzbm c() {
        return this.a.c();
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final int e() {
        return this.a.e();
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzys)) {
            return false;
        }
        return this.a.equals(((zzys) obj).a);
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public final int h() {
        return this.a.h();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzyv
    public zzz u(int i) {
        return this.a.u(i);
    }
}
