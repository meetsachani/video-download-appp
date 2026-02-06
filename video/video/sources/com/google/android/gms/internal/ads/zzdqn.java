package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdqn implements zzhfv {
    public final zzhge a;

    public zzdqn(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        Set set;
        zzgdj c = zzffn.c();
        zzdrf b = ((zzdrg) this.a).b();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.q5)).booleanValue()) {
            set = Collections.singleton(new zzddq(b, c));
        } else {
            set = Collections.EMPTY_SET;
        }
        zzhgd.b(set);
        return set;
    }
}
