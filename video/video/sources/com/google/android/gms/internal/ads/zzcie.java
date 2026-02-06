package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public final class zzcie implements zzhfv {
    public final zzhge a;
    public final zzhge b;

    public zzcie(zzhge zzhgeVar, zzhge zzhgeVar2) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzbvf b() {
        Context a = ((zzchi) this.a).a();
        zzfhq zzfhqVar = (zzfhq) this.b.b();
        zzbon b = com.google.android.gms.ads.internal.zzv.k().b(a, VersionInfoParcel.m0(), zzfhqVar);
        zzboh zzbohVar = zzbok.b;
        b.a("google.afma.request.getAdDictionary", zzbohVar, zzbohVar);
        return new zzbvh(a, com.google.android.gms.ads.internal.zzv.k().b(a, VersionInfoParcel.m0(), zzfhqVar).a("google.afma.sdkConstants.getSdkConstants", zzbohVar, zzbohVar), VersionInfoParcel.m0());
    }
}
