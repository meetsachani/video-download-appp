package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzeoy implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzeoy(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzeon(((zzeuh) this.a).b(), ((Long) zzbek.d.e()).longValue(), (Clock) this.b.b(), zzffn.c(), (zzdsd) this.c.b());
    }
}
