package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzepi implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzepi(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzhgeVar2;
        this.b = zzhgeVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzeon(zzeru.a(), ((Long) zzbek.f.e()).longValue(), (Clock) this.a.b(), zzffn.c(), (zzdsd) this.b.b());
    }
}
