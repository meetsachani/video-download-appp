package com.google.android.gms.internal.ads;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class zzerm implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzerm(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzerk b() {
        return new zzerk(((zzchi) this.a).a(), (Intent) this.b.b());
    }
}
