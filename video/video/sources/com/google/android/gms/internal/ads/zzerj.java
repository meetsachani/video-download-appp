package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzerj implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzerj(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzhgeVar2;
        this.b = zzhgeVar3;
        this.c = zzhgeVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzerh b() {
        return new zzerh(zzffn.c(), ((zzcon) this.a).a(), (Context) this.b.b(), ((zzhgh) this.c).b());
    }
}
