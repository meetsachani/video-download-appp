package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdfs implements zzhfv {
    public final zzhge a;

    public zzdfs(zzhge zzhgeVar) {
        this.a = zzhgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        Set singleton = Collections.singleton(new zzddq((zzdgl) this.a.b(), zzcaa.g));
        zzhgd.b(singleton);
        return singleton;
    }
}
