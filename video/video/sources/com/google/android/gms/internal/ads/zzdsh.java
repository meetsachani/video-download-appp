package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzdsh implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzdsh(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzdsg((zzdrx) this.a.b(), ((zzhgh) this.b).b(), (Clock) this.c.b());
    }
}
