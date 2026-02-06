package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzchp implements zzhfv {
    public final zzhge a;

    public zzchp(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        Set set;
        zzduj zzdujVar = (zzduj) this.a.b();
        zzgdj c = zzffn.c();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.P1)).booleanValue()) {
            set = Collections.singleton(new zzddq(zzdujVar, c));
        } else {
            set = Collections.EMPTY_SET;
        }
        zzhgd.b(set);
        return set;
    }
}
