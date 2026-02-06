package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcsu implements zzhfv {
    public final zzhge a;

    public zzcsu(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
    }

    public static zzddq a(zzcmz zzcmzVar, Executor executor) {
        return new zzddq(zzcmzVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return a((zzcmz) this.a.b(), zzffn.c());
    }
}
