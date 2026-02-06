package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzdld implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzdld(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzdlc((com.google.android.gms.ads.internal.util.zzbo) this.a.b(), (Clock) this.b.b(), zzffn.c());
    }
}
