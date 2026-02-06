package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdfb implements zzhfv {
    public final zzhge a;

    public zzdfb(zzdfa zzdfaVar, zzhge zzhgeVar) {
        this.a = zzhgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        Set singleton = Collections.singleton(new zzddq((zzcuo) this.a.b(), zzcaa.g));
        zzhgd.b(singleton);
        return singleton;
    }
}
