package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzedz implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzedz(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzedy b() {
        return new zzedy((Context) this.a.b(), (zzcod) this.b.b());
    }
}
