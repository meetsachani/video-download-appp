package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdsw implements zzhfv {
    public final zzdss a;
    public final zzhge b;

    public zzdsw(zzdss zzdssVar, zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzdssVar;
        this.b = zzhgeVar;
    }

    public static Set a(zzdss zzdssVar, zzdtc zzdtcVar, Executor executor) {
        Set d = zzdss.d(zzdtcVar, executor);
        zzhgd.b(d);
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        zzgdj c = zzffn.c();
        return a(this.a, (zzdtc) this.b.b(), c);
    }
}
