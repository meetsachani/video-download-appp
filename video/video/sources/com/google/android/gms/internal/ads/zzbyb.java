package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzbyb implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzbyb(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzbya b() {
        return new zzbya((Clock) this.a.b(), (zzbxy) this.b.b());
    }
}
