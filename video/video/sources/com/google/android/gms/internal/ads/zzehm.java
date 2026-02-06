package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzehm implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzehm(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzehl b() {
        return new zzehl((Context) this.a.b(), (zzdom) this.b.b());
    }
}
