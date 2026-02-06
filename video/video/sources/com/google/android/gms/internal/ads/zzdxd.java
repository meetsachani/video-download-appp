package com.google.android.gms.internal.ads;

import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzdxd implements zzhfv {
    public static zzdxd a() {
        return zzdxc.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* synthetic */ Object b() {
        com.google.android.gms.ads.internal.zzv.v();
        String uuid = UUID.randomUUID().toString();
        zzhgd.b(uuid);
        return uuid;
    }
}
