package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdft implements zzhfv {
    public final zzdfa a;
    public final zzhge b;

    public zzdft(zzdfa zzdfaVar, zzhge zzhgeVar) {
        this.a = zzdfaVar;
        this.b = zzhgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return this.a.d((Executor) this.b.b());
    }
}
