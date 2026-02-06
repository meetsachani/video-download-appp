package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdur implements zzhfv {
    public final zzhge a;

    public zzdur(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
    }

    public static zzddq a(zzduq zzduqVar, Executor executor) {
        return new zzddq(zzduqVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return a((zzduq) this.a.b(), zzffn.c());
    }
}
